package com.mekong.wallet.domains.controllers.impl;

import com.mekong.wallet.domains.controllers.AccountController;
import com.mekong.wallet.domains.models.domain_model.DomainAccountModel;
import com.mekong.wallet.services.storages.storage_service.StorageAccountService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class AccountControllerImpl implements AccountController {
   private StorageAccountService storageAccountService;
}
