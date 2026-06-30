package com.tencent.wechat.aff.mm_foundation;

/* loaded from: classes11.dex */
class ZIDL_JhX8 {
    public static void ZIDL_JhX8I86el(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("MmFoundationOnLoader", "createFlutterMmdataReport begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.mm_foundation.f.f217398b;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("MmFoundationOnLoader", "FlutterMmdataReport impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("MmFoundationOnLoader", "createFlutterMmdataReport done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL_JhX8INZs(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("MmFoundationOnLoader", "createFlutterCgiService begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.mm_foundation.f.f217399c;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("MmFoundationOnLoader", "FlutterCgiService impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("MmFoundationOnLoader", "createFlutterCgiService done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL_JhX8nIbf(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("MmFoundationOnLoader", "createFlutterCommonService begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.mm_foundation.f.f217400d;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("MmFoundationOnLoader", "FlutterCommonService impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("MmFoundationOnLoader", "createFlutterCommonService done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL_JhX8rYML(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("MmFoundationOnLoader", "createFlutterExptService begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.mm_foundation.f.f217397a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("MmFoundationOnLoader", "FlutterExptService impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("MmFoundationOnLoader", "createFlutterExptService done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
