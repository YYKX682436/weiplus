package com.tencent.wechat.mm.brand_service;

/* loaded from: classes8.dex */
class ZIDL_ZiHE {
    public static void ZIDL_ZiHEpDan(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("BrandServiceCppToNativeOnLoader", "createAffBrandServiceCppToNativeManager begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.mm.brand_service.z.f219257a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("BrandServiceCppToNativeOnLoader", "AffBrandServiceCppToNativeManager impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("BrandServiceCppToNativeOnLoader", "createAffBrandServiceCppToNativeManager done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
