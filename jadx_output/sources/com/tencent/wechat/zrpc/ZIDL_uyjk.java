package com.tencent.wechat.zrpc;

/* loaded from: classes11.dex */
class ZIDL_uyjk {
    public static void ZIDL_uyjkIAPQ(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("ZrpcExtChannelFactoryOnLoader", "createExtChannelServerFactory begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.zrpc.i.f220040b;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("ZrpcExtChannelFactoryOnLoader", "ExtChannelServerFactory impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("ZrpcExtChannelFactoryOnLoader", "createExtChannelServerFactory done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL_uyjkXigi(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("ZrpcExtChannelFactoryOnLoader", "createExtChannelClientFactory begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.zrpc.i.f220039a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("ZrpcExtChannelFactoryOnLoader", "ExtChannelClientFactory impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("ZrpcExtChannelFactoryOnLoader", "createExtChannelClientFactory done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
