package com.tencent.wechat.aff.chatbot;

/* loaded from: classes8.dex */
class ZIDL_PpcI {
    public static void ZIDL_PpcIJ66f(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("FileUtilCppToNativeOnLoader", "createChatbotFileUtilCPP2NativeCaller begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.aff.chatbot.l1.f216350a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("FileUtilCppToNativeOnLoader", "ChatbotFileUtilCPP2NativeCaller impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("FileUtilCppToNativeOnLoader", "createChatbotFileUtilCPP2NativeCaller done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
