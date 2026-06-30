package com.tencent.wechat.aff.affroam;

/* loaded from: classes8.dex */
class ZIDL_TLJy {
    public static void ZIDL_TLJya9_H(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("AffroamPlatformOnLoader", "createAffRoamPlatform begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.affroam.r0.f215973a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("AffroamPlatformOnLoader", "AffRoamPlatform impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("AffroamPlatformOnLoader", "createAffRoamPlatform done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
