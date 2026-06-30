package go0;

/* loaded from: classes14.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.f0 f273745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f273746e;

    public d(go0.f0 f0Var, boolean z17) {
        this.f273745d = f0Var;
        this.f273746e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kn0.f fVar;
        rs0.h n17 = rs0.g.n(rs0.i.f399296a, null, null, 1, 1, null, 16, null);
        go0.f0 f0Var = this.f273745d;
        f0Var.f273763i = n17;
        kn0.i iVar = f0Var.f273768q;
        boolean z17 = (iVar == null || (fVar = iVar.f309560d) == null) ? false : fVar.f309531c;
        f0Var.f273767p = f0Var.f(z17, this.f273746e, f0Var.f273758d);
        go0.f1 f1Var = f0Var.f273767p;
        kotlin.jvm.internal.o.d(f1Var);
        f0Var.m(f1Var, z17);
    }
}
