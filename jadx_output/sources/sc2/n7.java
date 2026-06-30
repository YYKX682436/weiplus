package sc2;

/* loaded from: classes2.dex */
public final class n7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.g0 f406104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.v6 f406105e;

    public n7(androidx.lifecycle.g0 g0Var, sc2.v6 v6Var) {
        this.f406104d = g0Var;
        this.f406105e = v6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f406104d.removeObserver(this.f406105e);
    }
}
