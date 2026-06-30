package com.tencent.wechat.aff.chatbot;

/* loaded from: classes14.dex */
public class p0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public p0(com.tencent.wechat.aff.chatbot.q0 q0Var) {
        com.tencent.wechat.aff.chatbot.ZIDL_fc3cA08LjK zIDL_fc3cA08LjK = new com.tencent.wechat.aff.chatbot.ZIDL_fc3cA08LjK();
        this.zidlCreateName = "chatbot.ChatbotUICPP2NativeCaller@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_chatbot", "aff_biz");
        zIDL_fc3cA08LjK.ZIDL_fc3cA08LjC(this, this.zidlCreateName, this.zidlSvrIdentity, q0Var);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.chatbot.o0 o0Var = new com.tencent.wechat.aff.chatbot.o0(this, this.nativeHandler);
        o0Var.f216408c = this.nativeHandler;
        o0Var.f216406a = this.zidlIdentity;
        o0Var.f216407b = this.zidlSvrIdentity;
    }
}
