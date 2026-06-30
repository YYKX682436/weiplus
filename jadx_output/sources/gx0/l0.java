package gx0;

/* loaded from: classes5.dex */
public final class l0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.u0 f276649d;

    public l0(gx0.u0 u0Var) {
        this.f276649d = u0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.base.MJID mjid;
        gx0.u0 u0Var = this.f276649d;
        if (u0Var.Z7().isPlaying()) {
            return;
        }
        com.tencent.maas.moviecomposing.segments.MovieTitleSegment l76 = u0Var.a8().l7();
        jz5.g gVar = u0Var.f431606u;
        if (l76 == null || (mjid = l76.f48532a) == null) {
            ((du0.o) ((jz5.n) gVar).getValue()).U6(false);
        } else {
            du0.o.o7((du0.o) ((jz5.n) gVar).getValue(), mjid, false, false, 4, null);
        }
    }
}
