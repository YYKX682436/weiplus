package com.tencent.mm.repairer.config.global;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/repairer/config/global/RepairerConfigRegisterPostVerifyUrl;", "Lq55/f;", "<init>", "()V", "libcompatible_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class RepairerConfigRegisterPostVerifyUrl extends q55.f {
    @Override // q55.h
    public java.lang.String b() {
        return "RepairerConfig_RegisterPostVerifyUrl";
    }

    @Override // q55.h
    public java.lang.String c() {
        return "快捷注册后验证的Url";
    }

    @Override // q55.h
    public java.lang.Class e() {
        return com.tencent.mm.repairer.group.RepairerGroupGlobal.class;
    }

    @Override // q55.e
    public java.lang.Object i() {
        return "https://weixin110.qq.com/security/acct/newreadtemplate?t=literegverify/index";
    }

    @Override // q55.e
    public java.lang.String k() {
        return "clicfg_register_post_verify_url_and";
    }
}
