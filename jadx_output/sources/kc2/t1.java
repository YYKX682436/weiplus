package kc2;

/* loaded from: classes15.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.v1 f306491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306492e;

    public t1(kc2.v1 v1Var, java.lang.String str) {
        this.f306491d = v1Var;
        this.f306492e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int e17 = c01.id.e();
        kc2.v1 v1Var = this.f306491d;
        v1Var.f306510l = e17;
        kc2.h1.f306405a.b(v1Var.f306507i, v1Var.f306508j, e17, v1Var.f306509k);
        if (((java.lang.Boolean) ((jz5.n) v1Var.f306502d).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i(v1Var.f306503e, "onRedDotExpose " + this.f306492e + " add lastRedDotExposeTime=" + v1Var.f306510l);
        }
        kc2.a2.a(v1Var.c(), v1Var.f306510l, false, 2, null);
    }
}
