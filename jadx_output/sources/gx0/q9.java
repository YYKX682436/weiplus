package gx0;

/* loaded from: classes5.dex */
public final class q9 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w9 f276880d;

    public q9(gx0.w9 w9Var) {
        this.f276880d = w9Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.maas.moviecomposing.segments.NarrationSegment narrationSegment;
        com.tencent.maas.base.MJID mjid;
        gx0.w9 w9Var = this.f276880d;
        if (w9Var.G7().isPlaying() || (narrationSegment = w9Var.f257028w) == null || (mjid = narrationSegment.f48532a) == null) {
            return;
        }
        du0.o.o7((du0.o) ((jz5.n) w9Var.f257025t).getValue(), mjid, false, false, 4, null);
    }
}
