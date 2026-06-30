package com.tencent.wechat.mm.biz;

/* loaded from: classes11.dex */
class ZIDL_fvl8 {
    public static void ZIDL_fvl8XfLk(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("BizCppToNativeOnLoader", "createAffBizCppToNativeManager begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.mm.biz.y0.f218792a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("BizCppToNativeOnLoader", "AffBizCppToNativeManager impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("BizCppToNativeOnLoader", "createAffBizCppToNativeManager done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }

    public static void ZIDL_fvl8iIsE(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("BizCppToNativeOnLoader", "createAffBizDynamicCardMrgEvent begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.mm.biz.y0.f218793b;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("BizCppToNativeOnLoader", "AffBizDynamicCardMrgEvent impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("BizCppToNativeOnLoader", "createAffBizDynamicCardMrgEvent done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
