package com.tencent.wechat.aff.chatbot;

/* loaded from: classes16.dex */
public class r extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public r(com.tencent.wechat.aff.chatbot.t tVar) {
        com.tencent.wechat.aff.chatbot.ZIDL_H7GR2X7uJK zIDL_H7GR2X7uJK = new com.tencent.wechat.aff.chatbot.ZIDL_H7GR2X7uJK();
        this.zidlCreateName = "chatbot.CBTStreamMDParserDelegateInterface@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_chatbot", "aff_biz");
        zIDL_H7GR2X7uJK.ZIDL_H7GR2X7uJC(this, this.zidlCreateName, this.zidlSvrIdentity, tVar);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.chatbot.q qVar = new com.tencent.wechat.aff.chatbot.q(this, this.nativeHandler);
        qVar.f216429c = this.nativeHandler;
        qVar.f216427a = this.zidlIdentity;
        qVar.f216428b = this.zidlSvrIdentity;
    }
}
