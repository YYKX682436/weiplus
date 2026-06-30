package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class c0 extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public c0(com.tencent.wechat.aff.iam_scan.d0 d0Var) {
        com.tencent.wechat.aff.iam_scan.ZIDL__CzVbChcK zIDL__CzVbChcK = new com.tencent.wechat.aff.iam_scan.ZIDL__CzVbChcK();
        this.zidlCreateName = "scan.ScanDecodeCallback@Attach";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_scan", "aff_biz");
        zIDL__CzVbChcK.ZIDL__CzVbChcC(this, this.zidlCreateName, this.zidlSvrIdentity, d0Var);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.aff.iam_scan.b0 b0Var = new com.tencent.wechat.aff.iam_scan.b0(this, this.nativeHandler);
        b0Var.f216953c = this.nativeHandler;
        b0Var.f216951a = this.zidlIdentity;
        b0Var.f216952b = this.zidlSvrIdentity;
    }
}
