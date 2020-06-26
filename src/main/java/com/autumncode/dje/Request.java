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

    @JsonProperty("pagina")
    int page;
    @JsonProperty("total_de_paginas")
    int totalPages;
    @JsonProperty("registros")
    int registrations;
    //@JsonProperty("total_de_registros")
    //int totalRegistrations;
    @JsonProperty("clientes_cadastro_resumido")
    List<CustomerSummaryRegistration> registrationSummaries;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getRegistrations() {
        return registrations;
    }

    public void setRegistrations(int registrations) {
        this.registrations = registrations;
    }

    /*
    public int getTotalRegistrations() {
        return totalRegistrations;
    }

    public void setTotalRegistrations(int totalRegistrations) {
        this.totalRegistrations = totalRegistrations;
    }
    */

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
                // ", totalRegistrations=" + totalRegistrations +
                ", registrationSummaries=" + registrationSummaries +
                '}';
    }
}
