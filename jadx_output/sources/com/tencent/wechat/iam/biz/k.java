package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class k extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_MvRZB14SLK f217757a;

    public k(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.wechat.iam.biz.ZIDL_MvRZB14SLK zIDL_MvRZB14SLK = new com.tencent.wechat.iam.biz.ZIDL_MvRZB14SLK();
        this.f217757a = zIDL_MvRZB14SLK;
        com.tencent.wechat.iam.biz.ZIDL_MvRZB14SLKE zIDL_MvRZB14SLKE = new com.tencent.wechat.iam.biz.ZIDL_MvRZB14SLKE();
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_MvRZB14SLK.ZIDL_MvRZB14SLC(this, zIDL_MvRZB14SLKE, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public void a() {
        this.f217757a.ZIDL_L(this.nativeHandler);
    }

    public void b(com.tencent.wechat.iam.biz.j jVar) {
        this.f217757a.ZIDL_BBV(this.nativeHandler, jVar);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.iam.biz.i iVar = new com.tencent.wechat.iam.biz.i(this, this.nativeHandler);
        iVar.f217753c = this.nativeHandler;
        iVar.f217751a = this.zidlIdentity;
        iVar.f217752b = this.zidlSvrIdentity;
    }
}
