package com.example.sharemind.consult.application;

import java.util.UUID;

import com.example.sharemind.consult.dto.request.CreateConsultRequest;
import com.example.sharemind.consult.dto.request.GetConsultRequest;
import com.example.sharemind.consult.dto.response.GetConsultResponse;

public interface ConsultService {
    void createConsult(CreateConsultRequest createConsultRequest);

    GetConsultResponse getConsult(UUID consultUuid, GetConsultRequest getConsultRequest);
}
