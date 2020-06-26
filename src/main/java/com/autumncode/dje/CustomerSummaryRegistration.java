package com.autumncode.dje;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerSummaryRegistration {
    public CustomerSummaryRegistration() {
    }

    public CustomerSummaryRegistration(String cnpjCPF, String clientCode, String clientIntegrationCode, String decoratedName, String socialName) {
        this.cnpjCPF = cnpjCPF;
        this.clientCode = clientCode;
        this.clientIntegrationCode = clientIntegrationCode;
        this.decoratedName = decoratedName;
        this.socialName = socialName;
    }

    String cnpjCPF;
    String clientCode;
    String clientIntegrationCode;
    String decoratedName;
    String socialName;

    @JsonProperty("cnpj_cpf")
    public String getCnpjCPF() {
        return cnpjCPF;
    }

    public void setCnpjCPF(String cnpjCPF) {
        this.cnpjCPF = cnpjCPF;
    }

    @JsonProperty("codigo_cliente")
    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String clientCode) {
        this.clientCode = clientCode;
    }

    @JsonProperty("codigo_cliente_integracao")
    public String getClientIntegrationCode() {
        return clientIntegrationCode;
    }

    public void setClientIntegrationCode(String clientIntegrationCode) {
        this.clientIntegrationCode = clientIntegrationCode;
    }

    @JsonProperty("nome_fantasia")
    public String getDecoratedName() {
        return decoratedName;
    }

    public void setDecoratedName(String decoratedName) {
        this.decoratedName = decoratedName;
    }

    @JsonProperty("razao_social")
    public String getSocialName() {
        return socialName;
    }

    public void setSocialName(String socialName) {
        this.socialName = socialName;
    }

    @Override
    public String toString() {
        return "CustomerSummaryRegistration{" +
                "cnpjCPF='" + cnpjCPF + '\'' +
                ", clientCode='" + clientCode + '\'' +
                ", clientIntegrationCode='" + clientIntegrationCode + '\'' +
                ", decoratedName='" + decoratedName + '\'' +
                ", socialName='" + socialName + '\'' +
                '}';
    }
}
