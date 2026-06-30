package com.tencent.wechat.aff.udr;

/* loaded from: classes15.dex */
public abstract class k extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public k(com.tencent.wechat.aff.udr.m mVar) {
        com.tencent.wechat.aff.udr.ZIDL_Y5AcJ9_P2K zIDL_Y5AcJ9_P2K = new com.tencent.wechat.aff.udr.ZIDL_Y5AcJ9_P2K();
        this.zidlCreateName = "udr.IUdrCppGlobalFeature@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("aff_feat_udr", "aff_feat_udr");
        zIDL_Y5AcJ9_P2K.ZIDL_Y5AcJ9_P2C(this, this.zidlCreateName, this.zidlSvrIdentity, mVar);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.udr.j jVar = new com.tencent.wechat.aff.udr.j(this, this.nativeHandler);
        jVar.f217539c = this.nativeHandler;
        jVar.f217537a = this.zidlIdentity;
        jVar.f217538b = this.zidlSvrIdentity;
    }
}
