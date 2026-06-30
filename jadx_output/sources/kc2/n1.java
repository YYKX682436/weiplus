package kc2;

/* loaded from: classes15.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.v1 f306463d;

    public n1(kc2.v1 v1Var) {
        this.f306463d = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kc2.v1 v1Var = this.f306463d;
        v1Var.a().f();
        v1Var.b().f();
        v1Var.c().f();
        r45.us2 a17 = kc2.h1.f306405a.a(v1Var.f306507i);
        v1Var.f306508j = a17.getInteger(2);
        v1Var.f306509k = a17.getInteger(1);
        v1Var.f306510l = a17.getInteger(0);
        com.tencent.mars.xlog.Log.i(v1Var.f306503e, "init lastExistTime=" + v1Var.f306508j + ",lastClickWithRedDotTime=" + v1Var.f306509k + ",lastRedDotExposeTime=" + v1Var.f306510l + ",snsClickWithRedDot=" + v1Var.a().d() + ",snsClickWithoutRedDot=" + v1Var.b().d() + ",snsRedDotExposeSeq=" + v1Var.c().d());
    }
}
