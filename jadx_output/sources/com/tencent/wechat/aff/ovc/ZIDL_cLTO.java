package com.tencent.wechat.aff.ovc;

/* loaded from: classes11.dex */
class ZIDL_cLTO {
    public static void ZIDL_cLTOF8jH(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformOnLoader", "createOVCChatBot begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.ovc.n.f217480b;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("OvcPlatformOnLoader", "OVCChatBot impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformOnLoader", "createOVCChatBot done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL_cLTOG6nzb(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformOnLoader", "createplatformUI begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.ovc.n.f217481c;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("OvcPlatformOnLoader", "platformUI impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformOnLoader", "createplatformUI done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL_cLTOhFK1(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformOnLoader", "createOVCFunctionCallEventStub begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.ovc.n.f217479a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("OvcPlatformOnLoader", "OVCFunctionCallEventStub impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformOnLoader", "createOVCFunctionCallEventStub done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
