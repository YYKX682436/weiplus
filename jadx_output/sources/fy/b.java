package fy;

/* loaded from: classes11.dex */
public final class b implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f267164d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Semaphore f267165e;

    public b(kotlin.jvm.internal.h0 h0Var, java.util.concurrent.Semaphore semaphore) {
        this.f267164d = h0Var;
        this.f267165e = semaphore;
    }

    @Override // o13.x
    public final void X2(p13.v vVar) {
        this.f267164d.f310123d = vVar.f351160e;
        this.f267165e.release();
    }
}
