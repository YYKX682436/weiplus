package rc3;

/* loaded from: classes7.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc3.b0 f394003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f394004e;

    public i(lc3.b0 b0Var, lc3.a0 a0Var) {
        this.f394003d = b0Var;
        this.f394004e = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f394003d.t(this.f394004e);
    }
}
