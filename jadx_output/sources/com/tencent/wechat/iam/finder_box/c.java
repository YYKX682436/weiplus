package com.tencent.wechat.iam.finder_box;

/* loaded from: classes11.dex */
public class c extends com.tencent.wechat.zidl2.ZidlBaseCaller {
    public c(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.wechat.iam.finder_box.ZIDL_Cux7el2LK zIDL_Cux7el2LK = new com.tencent.wechat.iam.finder_box.ZIDL_Cux7el2LK();
        com.tencent.wechat.iam.finder_box.ZIDL_Cux7el2LKE zIDL_Cux7el2LKE = new com.tencent.wechat.iam.finder_box.ZIDL_Cux7el2LKE();
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_finder_box", "aff_biz");
        zIDL_Cux7el2LK.ZIDL_Cux7el2LC(this, zIDL_Cux7el2LKE, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.iam.finder_box.b bVar = new com.tencent.wechat.iam.finder_box.b(this, this.nativeHandler);
        bVar.f217830c = this.nativeHandler;
        bVar.f217828a = this.zidlIdentity;
        bVar.f217829b = this.zidlSvrIdentity;
    }
}
