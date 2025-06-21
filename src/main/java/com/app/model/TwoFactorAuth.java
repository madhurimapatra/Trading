package com.app.model;

import com.app.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {

    private boolean isEnabled=false;

    private VerificationType sendTo;
}
