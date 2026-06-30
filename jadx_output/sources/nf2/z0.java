package nf2;

/* loaded from: classes10.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nf2.d1 f336830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f336831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f336832f;

    public z0(nf2.d1 d1Var, float f17, float f18) {
        this.f336830d = d1Var;
        this.f336831e = f17;
        this.f336832f = f18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f336830d.l(this.f336831e, this.f336832f);
    }
}
