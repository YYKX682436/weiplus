package com.tencent.wechat.aff.ovc;

/* loaded from: classes11.dex */
class ZIDL_fglm {
    public static void ZIDL_fglmE4rQc(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformUiOnLoader", "createOVCSelectContactUI begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.ovc.o.f217482a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("OvcPlatformUiOnLoader", "OVCSelectContactUI impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformUiOnLoader", "createOVCSelectContactUI done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL_fglmYCPB(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformUiOnLoader", "createOVCLoadingUI begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.ovc.o.f217485d;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("OvcPlatformUiOnLoader", "OVCLoadingUI impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformUiOnLoader", "createOVCLoadingUI done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL_fglmgqe6(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformUiOnLoader", "createOVCMsgUI begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.ovc.o.f217483b;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("OvcPlatformUiOnLoader", "OVCMsgUI impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformUiOnLoader", "createOVCMsgUI done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL_fglmkk0y(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformUiOnLoader", "createOVCPermissionRequestUI begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.ovc.o.f217484c;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("OvcPlatformUiOnLoader", "OVCPermissionRequestUI impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("OvcPlatformUiOnLoader", "createOVCPermissionRequestUI done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
