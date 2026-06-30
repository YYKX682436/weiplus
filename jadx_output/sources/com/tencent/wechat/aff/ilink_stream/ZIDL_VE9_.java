package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes8.dex */
class ZIDL_VE9_ {
    public static void ZIDL_VE9_HaSD(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("IlinkStreamPlatformOnLoader", "createIlinkStreamPlatform begin " + obj, new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.ilink_stream.s.f217296a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("IlinkStreamPlatformOnLoader", "IlinkStreamPlatform impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("IlinkStreamPlatformOnLoader", "createIlinkStreamPlatform done " + createZidlStub, new java.lang.Object[0]);
    }
}
