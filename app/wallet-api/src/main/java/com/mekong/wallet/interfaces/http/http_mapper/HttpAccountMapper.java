package com.mekong.wallet.interfaces.http.http_mapper;

import com.mekong.wallet.domains.models.domain_model.DomainAccountModel;
import com.mekong.wallet.domains.models.http_model.requests.HttpAccountRequestModel;
import com.mekong.wallet.domains.models.http_model.responses.HttpAccountResponseModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface HttpAccountMapper {

//    DomainAccountModel toDomain(HttpAccountRequestModel httpModel);
//
//    HttpAccountResponseModel toResponse(DomainAccountModel domainModel);
}
