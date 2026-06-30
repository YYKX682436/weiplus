package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class r1 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_vXOGfK5oK f217777a;

    public r1(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.wechat.iam.biz.ZIDL_vXOGfK5oK zIDL_vXOGfK5oK = new com.tencent.wechat.iam.biz.ZIDL_vXOGfK5oK();
        this.f217777a = zIDL_vXOGfK5oK;
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_vXOGfK5oK.ZIDL_vXOGfK5oC(this, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public com.tencent.wechat.iam.biz.z0 a() {
        return (com.tencent.wechat.iam.biz.z0) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.f217777a.ZIDL_C(this.nativeHandler), new com.tencent.wechat.iam.biz.r1$$b());
    }

    public com.tencent.wechat.iam.biz.p1 b() {
        return (com.tencent.wechat.iam.biz.p1) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.f217777a.ZIDL_E(this.nativeHandler), new com.tencent.wechat.iam.biz.r1$$a());
    }

    public com.tencent.wechat.iam.biz.h1 c() {
        return (com.tencent.wechat.iam.biz.h1) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.f217777a.ZIDL_D(this.nativeHandler), new com.tencent.wechat.iam.biz.r1$$c());
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.iam.biz.s1 s1Var = new com.tencent.wechat.iam.biz.s1(this, this.nativeHandler);
        s1Var.f217785c = this.nativeHandler;
        s1Var.f217783a = this.zidlIdentity;
        s1Var.f217784b = this.zidlSvrIdentity;
    }
}
