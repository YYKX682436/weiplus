package com.tencent.mm.plugin.vqm;

/* loaded from: classes14.dex */
public class f extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public f(com.tencent.mm.plugin.vqm.g gVar) {
        com.tencent.mm.plugin.vqm.ZIDL_dPmnyryCK zIDL_dPmnyryCK = new com.tencent.mm.plugin.vqm.ZIDL_dPmnyryCK();
        this.zidlCreateName = "vqm.VQMObserver@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_vqm", "aff_biz");
        zIDL_dPmnyryCK.ZIDL_dPmnyryCC(this, this.zidlCreateName, this.zidlSvrIdentity, gVar);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.mm.plugin.vqm.e eVar = new com.tencent.mm.plugin.vqm.e(this, this.nativeHandler);
        eVar.f177333c = this.nativeHandler;
        eVar.f177331a = this.zidlIdentity;
        eVar.f177332b = this.zidlSvrIdentity;
    }
}
