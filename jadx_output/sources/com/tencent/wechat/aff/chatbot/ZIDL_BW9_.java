package com.tencent.wechat.aff.chatbot;

/* loaded from: classes8.dex */
class ZIDL_BW9_ {
    public static void ZIDL_BW9_jv1T(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("DeviceCppToNativeOnLoader", "createChatbotDeviceCPP2NativeCaller begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.chatbot.a1.f216067a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("DeviceCppToNativeOnLoader", "ChatbotDeviceCPP2NativeCaller impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("DeviceCppToNativeOnLoader", "createChatbotDeviceCPP2NativeCaller done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
