package rj5;

/* loaded from: classes10.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f396387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rj5.k f396388e;

    public i(kotlin.jvm.internal.h0 h0Var, rj5.k kVar) {
        this.f396387d = h0Var;
        this.f396388e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.jvm.internal.h0 h0Var = this.f396387d;
        java.lang.Object obj = h0Var.f310123d;
        rj5.a aVar = rj5.a.f396371d;
        if (obj != aVar) {
            h0Var.f310123d = aVar;
            rj5.k kVar = this.f396388e;
            kVar.getClass();
            kVar.c(aVar);
        }
    }
}
