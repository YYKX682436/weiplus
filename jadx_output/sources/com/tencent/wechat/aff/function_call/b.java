package com.tencent.wechat.aff.function_call;

/* loaded from: classes15.dex */
public class b extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public b(com.tencent.wechat.aff.function_call.d dVar) {
        com.tencent.wechat.aff.function_call.ZIDL_JdUMtI41K zIDL_JdUMtI41K = new com.tencent.wechat.aff.function_call.ZIDL_JdUMtI41K();
        this.zidlCreateName = "function_call.FunctionCallCPP2NativeCaller@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_function_call", "aff_biz");
        zIDL_JdUMtI41K.ZIDL_JdUMtI41C(this, this.zidlCreateName, this.zidlSvrIdentity, dVar);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.function_call.a aVar = new com.tencent.wechat.aff.function_call.a(this, this.nativeHandler);
        aVar.f216888c = this.nativeHandler;
        aVar.f216886a = this.zidlIdentity;
        aVar.f216887b = this.zidlSvrIdentity;
    }
}
