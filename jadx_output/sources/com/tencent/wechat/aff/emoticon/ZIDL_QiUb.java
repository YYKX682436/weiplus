package com.tencent.wechat.aff.emoticon;

/* loaded from: classes11.dex */
class ZIDL_QiUb {
    public static void ZIDL_QiUbD37EK(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("EmoticonNativeCppOnLoader", "createTempEmoticonCDNDownloader begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zlog.Zlog.b("EmoticonNativeCppOnLoader", "TempEmoticonCDNDownloader impl not registered yet", new java.lang.Object[0]);
        throw null;
    }

    public static void ZIDL_QiUbg9_8(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("EmoticonNativeCppOnLoader", "createAffEmoticonResource begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.emoticon.x.f216681a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("EmoticonNativeCppOnLoader", "AffEmoticonResource impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("EmoticonNativeCppOnLoader", "createAffEmoticonResource done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL_QiUbpaAj(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("EmoticonNativeCppOnLoader", "createAffEmoticonNativeHelper begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.emoticon.x.f216682b;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("EmoticonNativeCppOnLoader", "AffEmoticonNativeHelper impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("EmoticonNativeCppOnLoader", "createAffEmoticonNativeHelper done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
