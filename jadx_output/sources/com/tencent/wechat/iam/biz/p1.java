package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class p1 extends com.tencent.wechat.zidl2.ZidlBaseCaller {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_pjvjmq0eK f217767a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.wechat.iam.biz.ZIDL_pjvjmq0eKE f217768b;

    public p1(com.tencent.wechat.zidl2.ZidlBaseCaller.ObjConstructorKey objConstructorKey, java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.wechat.iam.biz.ZIDL_pjvjmq0eK zIDL_pjvjmq0eK = new com.tencent.wechat.iam.biz.ZIDL_pjvjmq0eK();
        this.f217767a = zIDL_pjvjmq0eK;
        com.tencent.wechat.iam.biz.ZIDL_pjvjmq0eKE zIDL_pjvjmq0eKE = new com.tencent.wechat.iam.biz.ZIDL_pjvjmq0eKE();
        this.f217768b = zIDL_pjvjmq0eKE;
        this.zidlCreateName = str;
        this.zidlSvrIdentity = str2;
        this.refCntManagerHandler = j17;
        com.tencent.wechat.zidl2.ZidlLibraryLoader.getInstance().loadLibrary("iam_feat_biz", "aff_biz");
        zIDL_pjvjmq0eK.ZIDL_pjvjmq0eC(this, zIDL_pjvjmq0eKE, this.zidlCreateName, this.zidlSvrIdentity, null);
    }

    public void a(int i17, int i18, com.tencent.wechat.iam.biz.i1 i1Var) {
        this.f217767a.ZIDL_HV(this.nativeHandler, i1Var, i17, i18);
    }

    public void b(int i17) {
        this.f217767a.ZIDL_E(this.nativeHandler, i17);
    }

    public void c(com.tencent.wechat.iam.biz.k1 k1Var) {
        this.f217767a.ZIDL_FV(this.nativeHandler, k1Var);
    }

    public void d(com.tencent.wechat.iam.biz.l1 l1Var) {
        this.f217767a.ZIDL_DV(this.nativeHandler, l1Var);
    }

    public void e(int i17, int i18, com.tencent.wechat.iam.biz.m1 m1Var) {
        this.f217767a.ZIDL_IV(this.nativeHandler, m1Var, i17, i18);
    }

    public void f(java.util.ArrayList arrayList) {
        this.f217767a.ZIDL_C(this.nativeHandler, com.tencent.wechat.zidl2.ZidlUtil.mmpbListSerializeToBasic(arrayList));
    }

    public void g() {
        this.f217767a.ZIDL_K(this.nativeHandler);
    }

    public void h() {
        this.f217767a.ZIDL_L(this.nativeHandler);
    }

    public void i(java.lang.String str, com.tencent.wechat.iam.biz.n1 n1Var) {
        this.f217768b.f217734a.put(str, n1Var);
    }

    public void j(java.lang.String str, com.tencent.wechat.iam.biz.o1 o1Var) {
        this.f217768b.f217735b.put(str, o1Var);
    }

    public void k(java.lang.String str) {
        this.f217768b.f217734a.remove(str);
    }

    public void l(java.lang.String str) {
        this.f217768b.f217735b.remove(str);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseCaller
    public void readyForLifeCycle() {
        com.tencent.wechat.iam.biz.j1 j1Var = new com.tencent.wechat.iam.biz.j1(this, this.nativeHandler);
        j1Var.f217756c = this.nativeHandler;
        j1Var.f217754a = this.zidlIdentity;
        j1Var.f217755b = this.zidlSvrIdentity;
    }
}
