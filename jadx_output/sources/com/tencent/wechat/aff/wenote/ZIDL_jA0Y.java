package com.tencent.wechat.aff.wenote;

/* loaded from: classes8.dex */
class ZIDL_jA0Y {
    public static void ZIDL_jA0YjmIV(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("WenoteCppToNativeSingletonOnLoader", "createWeNoteCppToNativeSingleton begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.wenote.n.f217711a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("WenoteCppToNativeSingletonOnLoader", "WeNoteCppToNativeSingleton impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("WenoteCppToNativeSingletonOnLoader", "createWeNoteCppToNativeSingleton done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
