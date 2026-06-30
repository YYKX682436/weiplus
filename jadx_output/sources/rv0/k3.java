package rv0;

/* loaded from: classes5.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.f f400079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f400080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.MusicSegment f400081g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTimeRange f400082h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f400083i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(rv0.n1 n1Var, rv0.f fVar, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, com.tencent.maas.model.time.MJTimeRange mJTimeRange, com.tencent.maas.model.time.MJTime mJTime2) {
        super(0);
        this.f400078d = n1Var;
        this.f400079e = fVar;
        this.f400080f = mJTime;
        this.f400081g = musicSegment;
        this.f400082h = mJTimeRange;
        this.f400083i = mJTime2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rv0.n1 n1Var = this.f400078d;
        androidx.lifecycle.g0 g0Var = ((gx0.gf) ((jz5.n) n1Var.f400135w).getValue()).f276473f;
        androidx.lifecycle.y W6 = n1Var.W6();
        rv0.f fVar = this.f400079e;
        g0Var.observe(W6, new rv0.i3(fVar));
        fVar.setMusicFullDuration(this.f400080f);
        com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment = this.f400081g;
        com.tencent.maas.model.MJMusicInfo N1 = musicSegment.N1();
        if (N1 != null) {
            com.tencent.maas.model.time.MJTimeRange calcIntersection = musicSegment.B().calcIntersection(this.f400082h);
            kotlin.jvm.internal.o.f(calcIntersection, "calcIntersection(...)");
            com.tencent.maas.model.time.MJTime mJTime = this.f400083i;
            kotlin.jvm.internal.o.d(mJTime);
            fVar.M = calcIntersection;
            fVar.N = mJTime;
            android.widget.TextView textView = fVar.K;
            if (textView == null) {
                kotlin.jvm.internal.o.o("songNameTv");
                throw null;
            }
            textView.setText(N1.getSongName());
        }
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.j3(n1Var, musicSegment, fVar, null), 3, null);
        return jz5.f0.f302826a;
    }
}
