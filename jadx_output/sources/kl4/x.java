package kl4;

/* loaded from: classes11.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.a0 f308969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f308970e;

    public x(kl4.a0 a0Var, float f17) {
        this.f308969d = a0Var;
        this.f308970e = f17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ll4.d dVar = this.f308969d.f308868e;
        if (dVar != null) {
            dVar.setVolume(this.f308970e);
        }
    }
}
