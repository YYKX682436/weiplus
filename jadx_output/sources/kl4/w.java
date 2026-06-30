package kl4;

/* loaded from: classes11.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f308967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f308968e;

    public w(kl4.a0 a0Var, float f17) {
        this.f308967d = a0Var;
        this.f308968e = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f17 = this.f308968e;
        java.lang.Float valueOf = java.lang.Float.valueOf(f17);
        kl4.a0 a0Var = this.f308967d;
        a0Var.f308872i = valueOf;
        ll4.d dVar = a0Var.f308868e;
        if (dVar != null) {
            dVar.c(f17);
        }
        a0Var.f308872i = null;
    }
}
