package com.tencent.mm.repairer.config.textstatus.affdb;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/textstatus/affdb/RepairerConfigTextStatusTransferMaxTryCount;", "Lb65/a;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RepairerConfigTextStatusTransferMaxTryCount extends b65.a {
    @Override // q55.h
    public java.lang.String c() {
        return "DB迁移最多可触发的次数";
    }

    @Override // q55.e
    public java.lang.Object i() {
        return com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT;
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_textstatus_aff_db_transfer_max_try_count";
    }
}
