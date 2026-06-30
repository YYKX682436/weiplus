package com.tencent.wechat.aff.function_call;

/* loaded from: classes15.dex */
public class k extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public k(com.tencent.wechat.aff.function_call.m mVar) {
        com.tencent.wechat.aff.function_call.ZIDL_JdUMnLr0K zIDL_JdUMnLr0K = new com.tencent.wechat.aff.function_call.ZIDL_JdUMnLr0K();
        this.zidlCreateName = "function_call.FunctionCallNativeImpl@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_function_call", "aff_biz");
        zIDL_JdUMnLr0K.ZIDL_JdUMnLr0C(this, this.zidlCreateName, this.zidlSvrIdentity, mVar);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.function_call.j jVar = new com.tencent.wechat.aff.function_call.j(this, this.nativeHandler);
        jVar.f216900c = this.nativeHandler;
        jVar.f216898a = this.zidlIdentity;
        jVar.f216899b = this.zidlSvrIdentity;
    }
}
