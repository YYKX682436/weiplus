package com.tencent.wechat.aff.local_connection;

/* loaded from: classes8.dex */
class ZIDL_sqnl {
    public static void ZIDL_sqnlB1hUq(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("NearConnectionProviderOnLoader", "createNearConnectionProvider begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.local_connection.g.f217361a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("NearConnectionProviderOnLoader", "NearConnectionProvider impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("NearConnectionProviderOnLoader", "createNearConnectionProvider done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
