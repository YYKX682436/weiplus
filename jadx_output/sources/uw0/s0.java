package uw0;

/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f431602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.MovieTitleSegment f431603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(uw0.t0 t0Var, com.tencent.maas.moviecomposing.segments.MovieTitleSegment movieTitleSegment) {
        super(0);
        this.f431602d = t0Var;
        this.f431603e = movieTitleSegment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        uw0.t0 t0Var = this.f431602d;
        t0Var.getClass();
        pf5.e.launchUI$default(t0Var, null, null, new uw0.n0(t0Var, this.f431603e, null), 3, null);
        return jz5.f0.f302826a;
    }
}
