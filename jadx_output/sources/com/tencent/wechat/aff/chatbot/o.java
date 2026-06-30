package com.tencent.wechat.aff.chatbot;

/* loaded from: classes16.dex */
public class o extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.aff.chatbot.ZIDL_bGXOQSYvK f216405a;

    public o(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.wechat.aff.chatbot.ZIDL_bGXOQSYvK zIDL_bGXOQSYvK = new com.tencent.wechat.aff.chatbot.ZIDL_bGXOQSYvK();
        this.f216405a = zIDL_bGXOQSYvK;
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_chatbot", "aff_biz");
        zIDL_bGXOQSYvK.ZIDL_bGXOQSYvC(this, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public void a(java.lang.String str, boolean z17) {
        this.f216405a.ZIDL_A(this.nativeHandler, str.getBytes(java.nio.charset.StandardCharsets.UTF_8), z17);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.chatbot.n nVar = new com.tencent.wechat.aff.chatbot.n(this, this.nativeHandler);
        nVar.f216387c = this.nativeHandler;
        nVar.f216385a = this.zidlIdentity;
        nVar.f216386b = this.zidlSvrIdentity;
    }
}
