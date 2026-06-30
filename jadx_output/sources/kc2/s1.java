package kc2;

/* loaded from: classes15.dex */
public final class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kc2.v1 f306488d;

    public s1(kc2.v1 v1Var) {
        this.f306488d = v1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int e17 = c01.id.e();
        kc2.v1 v1Var = this.f306488d;
        v1Var.f306508j = e17;
        kc2.h1.f306405a.b(v1Var.f306507i, v1Var.f306508j, v1Var.f306510l, v1Var.f306509k);
    }
}
