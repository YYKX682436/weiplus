package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class m0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public m0(com.tencent.wechat.aff.iam_scan.o0 o0Var) {
        com.tencent.wechat.aff.iam_scan.ZIDL_NguQFDciK zIDL_NguQFDciK = new com.tencent.wechat.aff.iam_scan.ZIDL_NguQFDciK();
        this.zidlCreateName = "scan.ScanGoodsCallback@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_scan", "aff_biz");
        zIDL_NguQFDciK.ZIDL_NguQFDciC(this, this.zidlCreateName, this.zidlSvrIdentity, o0Var);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.iam_scan.l0 l0Var = new com.tencent.wechat.aff.iam_scan.l0(this, this.nativeHandler);
        l0Var.f217098c = this.nativeHandler;
        l0Var.f217096a = this.zidlIdentity;
        l0Var.f217097b = this.zidlSvrIdentity;
    }
}
