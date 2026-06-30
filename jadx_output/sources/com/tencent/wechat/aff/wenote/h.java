package com.tencent.wechat.aff.wenote;

/* loaded from: classes11.dex */
public class h extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public h(com.tencent.wechat.aff.wenote.j jVar) {
        com.tencent.wechat.aff.wenote.ZIDL_qgniI8ycsK zIDL_qgniI8ycsK = new com.tencent.wechat.aff.wenote.ZIDL_qgniI8ycsK();
        com.tencent.wechat.aff.wenote.ZIDL_qgniI8ycsKE zIDL_qgniI8ycsKE = new com.tencent.wechat.aff.wenote.ZIDL_qgniI8ycsKE();
        this.zidlCreateName = "wenote.WeNoteNativeHelper@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_wenote", "aff_biz");
        zIDL_qgniI8ycsK.ZIDL_qgniI8ycsC(this, zIDL_qgniI8ycsKE, this.zidlCreateName, this.zidlSvrIdentity, jVar);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.wenote.g gVar = new com.tencent.wechat.aff.wenote.g(this, this.nativeHandler);
        gVar.f217693c = this.nativeHandler;
        gVar.f217691a = this.zidlIdentity;
        gVar.f217692b = this.zidlSvrIdentity;
    }
}
