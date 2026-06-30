package rv0;

/* loaded from: classes5.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.r f400235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f400236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.f f400237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400238g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(ex0.r rVar, com.tencent.maas.model.time.MJTime mJTime, rv0.f fVar, rv0.n1 n1Var) {
        super(1);
        this.f400235d = rVar;
        this.f400236e = mJTime;
        this.f400237f = fVar;
        this.f400238g = n1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.maas.moviecomposing.segments.Segment segment = this.f400235d.f257167a;
        com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment = segment instanceof com.tencent.maas.moviecomposing.segments.MusicSegment ? (com.tencent.maas.moviecomposing.segments.MusicSegment) segment : null;
        if (musicSegment != null) {
            musicSegment.u0(this.f400236e);
        }
        this.f400237f.H();
        rv0.n1 n1Var = this.f400238g;
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.r3(n1Var, null), 3, null);
        return java.lang.Boolean.TRUE;
    }
}
