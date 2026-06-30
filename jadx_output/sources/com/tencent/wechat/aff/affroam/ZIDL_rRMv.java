package com.tencent.wechat.aff.affroam;

/* loaded from: classes8.dex */
class ZIDL_rRMv {
    public static void ZIDL_rRMvEYfR(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("CustomRoamDiskOnLoader", "createCustomRoamDiskManager begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.affroam.x0.f216012a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("CustomRoamDiskOnLoader", "CustomRoamDiskManager impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("CustomRoamDiskOnLoader", "createCustomRoamDiskManager done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL_rRMvYRQ6(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("CustomRoamDiskOnLoader", "createCustomRoamDisk begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.affroam.x0.f216013b;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("CustomRoamDiskOnLoader", "CustomRoamDisk impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("CustomRoamDiskOnLoader", "createCustomRoamDisk done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
