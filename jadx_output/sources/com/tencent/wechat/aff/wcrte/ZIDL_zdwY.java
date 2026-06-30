package com.tencent.wechat.aff.wcrte;

/* loaded from: classes8.dex */
class ZIDL_zdwY {
    public static void ZIDL_zdwYRT2C(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("WcrteCppToNativeOnLoader", "createAffWCRTEDelegate begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.wcrte.f.f217653a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("WcrteCppToNativeOnLoader", "AffWCRTEDelegate impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("WcrteCppToNativeOnLoader", "createAffWCRTEDelegate done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
