package lp4;

/* loaded from: classes10.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.d1 f320333d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f320334e;

    public c1(lp4.d1 d1Var, kotlin.jvm.internal.h0 h0Var) {
        this.f320333d = d1Var;
        this.f320334e = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lp4.d1 d1Var = this.f320333d;
        d1Var.f320339h = db5.e1.Q(d1Var.f320337f, "", (java.lang.String) this.f320334e.f310123d, true, false, null);
    }
}
