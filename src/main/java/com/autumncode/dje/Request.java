package com.autumncode.dje;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Request {
    public Request() {
    }

    public Request(int page, int totalPages, int registrations, int totalRegistrations, List<CustomerSummaryRegistration> summaries) {
        this.page = page;
        this.totalPages = totalPages;
        this.registrations = registrations;
        this.registrationSummaries = summaries;
    }

    int page;
    int totalPages;
    int registrations;

    int totalRegistrations;
    List<CustomerSummaryRegistration> registrationSummaries;

    @JsonProperty("pagina")
    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @JsonProperty("total_de_paginas")
    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    @JsonProperty("registros")
    public int getRegistrations() {
        return registrations;
    }

    public void setRegistrations(int registrations) {
        this.registrations = registrations;
    }

    @JsonProperty("total_de_registros")
    public int getTotalRegistrations() {
        return totalRegistrations;
    }

    public void setTotalRegistrations(int totalRegistrations) {
        this.totalRegistrations = totalRegistrations;
    }

    @JsonProperty("clientes_cadastro_resumido")
    public List<CustomerSummaryRegistration> getRegistrationSummaries() {
        return registrationSummaries;
    }

    public void setRegistrationSummaries(List<CustomerSummaryRegistration> registrationSummaries) {
        this.registrationSummaries = registrationSummaries;
    }

    @Override
    public String toString() {
        return "Request{" +
                "page=" + page +
                ", totalPages=" + totalPages +
                ", registrations=" + registrations +
                ", totalRegistrations=" + totalRegistrations +
                ", registrationSummaries=" + registrationSummaries +
                '}';
    }
}
