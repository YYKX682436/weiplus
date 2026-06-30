package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class t1 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.wechat.iam.biz.t1 f217792c = new com.tencent.wechat.iam.biz.t1();

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_vXOGH7AM4K f217793a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_vXOGH7AM4KE f217794b;

    public t1() {
        com.tencent.wechat.iam.biz.ZIDL_vXOGH7AM4K zIDL_vXOGH7AM4K = new com.tencent.wechat.iam.biz.ZIDL_vXOGH7AM4K();
        this.f217793a = zIDL_vXOGH7AM4K;
        com.tencent.wechat.iam.biz.ZIDL_vXOGH7AM4KE zIDL_vXOGH7AM4KE = new com.tencent.wechat.iam.biz.ZIDL_vXOGH7AM4KE();
        this.f217794b = zIDL_vXOGH7AM4KE;
        this.zidlCreateName = "biz.IamBizServiceProxyManager@Get";
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_vXOGH7AM4K.ZIDL_vXOGH7AM4C(this, zIDL_vXOGH7AM4KE, this.zidlCreateName, this.zidlSvrIdentity);
    }

    public com.tencent.wechat.iam.biz.r1 a() {
        return (com.tencent.wechat.iam.biz.r1) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.f217793a.ZIDL_A(this.nativeHandler), new com.tencent.wechat.iam.biz.t1$$a());
    }

    public boolean b() {
        return this.f217793a.ZIDL_K(this.nativeHandler);
    }

    public boolean c() {
        return this.f217793a.ZIDL_I(this.nativeHandler);
    }

    public boolean d() {
        return this.f217793a.ZIDL_G(this.nativeHandler);
    }

    public void e() {
        this.f217793a.ZIDL_D(this.nativeHandler);
    }

    public com.tencent.wechat.iam.biz.r1 f() {
        return (com.tencent.wechat.iam.biz.r1) com.tencent.wechat.zidl2.ZidlUtil.jniToJavaObj2(this.f217793a.ZIDL_B(this.nativeHandler), new com.tencent.wechat.iam.biz.t1$$a());
    }

    public void g(java.lang.String str, com.tencent.wechat.iam.biz.u1 u1Var) {
        this.f217794b.f217736a.put(str, u1Var);
    }
}
