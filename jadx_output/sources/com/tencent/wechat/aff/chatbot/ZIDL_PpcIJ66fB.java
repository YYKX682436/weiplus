package com.tencent.wechat.aff.chatbot;

/* loaded from: classes11.dex */
class ZIDL_PpcIJ66fB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.chatbot.l0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.chatbot.m0 f216054a;

    private native void ZIDL_AX(long j17, long j18, byte[] bArr);

    public void Q1(long j17, java.lang.String str) {
        ZIDL_AX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void ZIDL_AV(long j17) {
        wx.a aVar = (wx.a) this.f216054a;
        aVar.getClass();
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("chatbot");
        com.tencent.mars.xlog.Log.i(aVar.f450402a, "get user cache path:" + c17);
        com.tencent.wechat.aff.chatbot.l0 l0Var = aVar.f450403b;
        if (l0Var != null) {
            ((com.tencent.wechat.aff.chatbot.ZIDL_PpcIJ66fB) l0Var).Q1(j17, c17);
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.chatbot.m0 m0Var = (com.tencent.wechat.aff.chatbot.m0) obj;
        this.f216054a = m0Var;
        ((wx.a) m0Var).f450403b = this;
    }
}
