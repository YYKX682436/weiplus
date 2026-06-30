package com.tencent.wechat.aff.affroam;

/* loaded from: classes8.dex */
class ZIDL_Ya7n {
    public static void ZIDL_Ya7nLCaw(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("AffroamProviderOnLoader", "createAffRoamProvider begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.affroam.s0.f215981a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("AffroamProviderOnLoader", "AffRoamProvider impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("AffroamProviderOnLoader", "createAffRoamProvider done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
