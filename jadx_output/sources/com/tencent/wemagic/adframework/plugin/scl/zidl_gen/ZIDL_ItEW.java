package com.tencent.wemagic.adframework.plugin.scl.zidl_gen;

/* loaded from: classes8.dex */
class ZIDL_ItEW {
    public static void ZIDL_ItEWxcf4(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("WemagicAdCppToPlatformOnLoader", "createWeMagicAdCppToPlatform begin " + obj, new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wemagic.adframework.plugin.scl.zidl_gen.f.f220063a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("WemagicAdCppToPlatformOnLoader", "WeMagicAdCppToPlatform impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("WemagicAdCppToPlatformOnLoader", "createWeMagicAdCppToPlatform done " + createZidlStub, new java.lang.Object[0]);
    }
}
