package com.tencent.wechat.iam.biz;

/* loaded from: classes8.dex */
class ZIDL_iib8 {
    public static void ZIDL_iib8m5U4(java.lang.Object obj) {
        com.tencent.wechat.zlog.Zlog.c("BizIamToNativeOnLoader", "createIamBizCppToNativeManager begin ".concat(java.lang.String.valueOf(obj)), new java.lang.Object[0]);
        com.tencent.wechat.zidl2.ZidlBaseBridge zidlBaseBridge = (com.tencent.wechat.zidl2.ZidlBaseBridge) obj;
        com.tencent.wechat.zidl2.ZidlStubCreator zidlStubCreator = com.tencent.wechat.iam.biz.a.f217738a;
        if (zidlStubCreator == null) {
            com.tencent.wechat.zlog.Zlog.b("BizIamToNativeOnLoader", "IamBizCppToNativeManager impl not registered yet", new java.lang.Object[0]);
            throw null;
        }
        java.lang.Object createZidlStub = zidlStubCreator.createZidlStub();
        zidlBaseBridge.attachStub(createZidlStub);
        com.tencent.wechat.zlog.Zlog.c("BizIamToNativeOnLoader", "createIamBizCppToNativeManager done ".concat(java.lang.String.valueOf(createZidlStub)), new java.lang.Object[0]);
    }
}
