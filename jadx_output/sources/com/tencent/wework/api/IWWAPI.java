package com.tencent.wework.api;

/* loaded from: classes9.dex */
public interface IWWAPI {

    /* loaded from: classes9.dex */
    public enum WWAppType {
        WwAppTypeDefault,
        WwAppTypeWxwork,
        WwAppTypeLocal,
        WwAppTypeWxworkWithoutSaas
    }

    boolean a(com.tencent.wework.api.model.BaseMessage baseMessage, com.tencent.wework.api.IWWAPI.WWAppType wWAppType);

    boolean b(com.tencent.wework.api.IWWAPI.WWAppType wWAppType);

    boolean c(com.tencent.wework.api.IWWAPI.WWAppType wWAppType);

    java.lang.String d(com.tencent.wework.api.IWWAPI.WWAppType wWAppType);

    boolean e();
}
