package com.tencent.wemagic.common.zidl_gen;

/* loaded from: classes8.dex */
class ZIDL_xyzz {
    public static void ZIDL_xyzzHlly(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("WemagicCppToPlatformOnLoader", "createWeMagicCppToPlatform begin " + obj, new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wemagic.common.zidl_gen.d.f220087a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("WemagicCppToPlatformOnLoader", "WeMagicCppToPlatform impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("WemagicCppToPlatformOnLoader", "createWeMagicCppToPlatform done " + createZidlStub, new java.lang.Object[0]);
    }
}
