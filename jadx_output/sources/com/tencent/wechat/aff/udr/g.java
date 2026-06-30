package com.tencent.wechat.aff.udr;

/* loaded from: classes14.dex */
public class g extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public g(com.tencent.wechat.aff.udr.i iVar) {
        com.tencent.wechat.aff.udr.ZIDL_a0qZ_cdBK zIDL_a0qZ_cdBK = new com.tencent.wechat.aff.udr.ZIDL_a0qZ_cdBK();
        this.zidlCreateName = "udr.IUdrCppBizFeature@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("aff_feat_udr", "aff_feat_udr");
        zIDL_a0qZ_cdBK.ZIDL_a0qZ_cdBC(this, this.zidlCreateName, this.zidlSvrIdentity, iVar);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.udr.f fVar = new com.tencent.wechat.aff.udr.f(this, this.nativeHandler);
        fVar.f217536c = this.nativeHandler;
        fVar.f217534a = this.zidlIdentity;
        fVar.f217535b = this.zidlSvrIdentity;
    }
}
