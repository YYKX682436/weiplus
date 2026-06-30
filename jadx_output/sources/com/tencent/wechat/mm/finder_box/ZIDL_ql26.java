package com.tencent.wechat.mm.finder_box;

/* loaded from: classes11.dex */
class ZIDL_ql26 {
    public static void ZIDL_ql26JX2P(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("BoxBizCppToNativeOnLoader", "createBoxAffBizCppToNativeManager begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.mm.finder_box.r0.f219762a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("BoxBizCppToNativeOnLoader", "BoxAffBizCppToNativeManager impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("BoxBizCppToNativeOnLoader", "createBoxAffBizCppToNativeManager done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL_ql26v1Fc(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("BoxBizCppToNativeOnLoader", "createBoxAffBizDynamicCardMrgEvent begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.mm.finder_box.r0.f219763b;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("BoxBizCppToNativeOnLoader", "BoxAffBizDynamicCardMrgEvent impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("BoxBizCppToNativeOnLoader", "createBoxAffBizDynamicCardMrgEvent done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
