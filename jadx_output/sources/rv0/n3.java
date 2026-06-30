package rv0;

/* loaded from: classes5.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.f f400140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.MusicSegment f400142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f400143g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f400144h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400145i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(rv0.f fVar, rv0.n1 n1Var, com.tencent.maas.moviecomposing.segments.MusicSegment musicSegment, com.tencent.maas.model.time.MJTime mJTime, com.tencent.maas.model.time.MJTime mJTime2, ex0.a0 a0Var) {
        super(1);
        this.f400140d = fVar;
        this.f400141e = n1Var;
        this.f400142f = musicSegment;
        this.f400143g = mJTime;
        this.f400144h = mJTime2;
        this.f400145i = a0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.model.time.MJTime newStartTimeInMedia = (com.tencent.maas.model.time.MJTime) obj;
        kotlin.jvm.internal.o.g(newStartTimeInMedia, "newStartTimeInMedia");
        this.f400140d.J();
        rv0.n1 n1Var = this.f400141e;
        gx0.kh q76 = n1Var.q7();
        com.tencent.maas.base.MJID mjid = this.f400142f.f48532a;
        kotlin.jvm.internal.o.f(mjid, "getSegmentID(...)");
        ex0.o m76 = q76.m7(mjid);
        if (m76 != null) {
            com.tencent.maas.model.time.MJTime add = m76.i().add(newStartTimeInMedia);
            com.tencent.maas.model.time.MJTime mJTime = this.f400143g;
            if (add.bigThan(mJTime)) {
                com.tencent.maas.model.time.MJTime sub = mJTime.sub(newStartTimeInMedia);
                kotlin.jvm.internal.o.f(sub, "sub(...)");
                m76.y(sub);
            }
            m76.f257130f.u0(newStartTimeInMedia);
            com.tencent.maas.model.time.MJTime i17 = m76.i();
            com.tencent.maas.model.time.MJTime musicOriginDuration = this.f400144h;
            if (!i17.equalsTo(musicOriginDuration)) {
                kotlin.jvm.internal.o.f(musicOriginDuration, "$musicOriginDuration");
                m76.y(musicOriginDuration);
            }
            newStartTimeInMedia.toSeconds();
            m76.i().toSeconds();
            m76.j().toSeconds();
            com.tencent.maas.model.time.MJTimeRange m17 = m76.m();
            if (m17 != null) {
                dx0.o.c(m17);
            }
            dx0.o.c(m76.l());
            java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f224509e, cx0.d.f224510f);
            kotlin.jvm.internal.o.f(of6, "of(...)");
            this.f400145i.J(of6, null);
            kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.m3(n1Var, m76, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
