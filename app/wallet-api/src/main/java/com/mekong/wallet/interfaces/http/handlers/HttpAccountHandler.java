package com.mekong.wallet.interfaces.http.handlers;

import com.mekong.wallet.domains.controllers.AccountController;
import com.mekong.wallet.domains.models.domain_model.DomainAccountModel;
import com.mekong.wallet.domains.models.http_model.responses.HttpAccountResponseModel;
import com.mekong.wallet.interfaces.http.http_mapper.HttpAccountMapper;
import com.mekong.wallet.services.storages.storage_service.StorageAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/interface/http/account")
@RequiredArgsConstructor
@Slf4j
public class HttpAccountHandler {
//    private final HttpAccountMapper httpAccountMapper;
    private final StorageAccountService storageAccountService;

    @GetMapping("/retrieve")
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<HttpAccountResponseModel> retrieveAccount(@PathVariable("id") String id) {
//        DomainAccountModel result = accountController.retrieve(id);
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
}
