package rv0;

/* loaded from: classes5.dex */
public final class w0 implements gy0.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400301b;

    public w0(rv0.n1 n1Var, ex0.a0 a0Var) {
        this.f400300a = n1Var;
        this.f400301b = a0Var;
    }

    @Override // gy0.h
    public void a(com.tencent.maas.base.MJID segmentID) {
        ex0.r K;
        com.tencent.maas.model.time.MJTimeRange B;
        com.tencent.maas.model.time.MJTime sub;
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        rv0.n1 n1Var = this.f400300a;
        if (n1Var.p7().m7()) {
            boolean z17 = true;
            if ((n1Var.r7().recyclerView.getScrollState() != 0) || (K = this.f400301b.K(segmentID)) == null) {
                return;
            }
            ug.m[] mVarArr = {ug.m.MovieClip, ug.m.ImageClip, ug.m.VideoClip, ug.m.Music, ug.m.Transition};
            ug.m mVar = K.f257169c;
            if (kz5.z.G(mVarArr, mVar)) {
                com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(n1Var.r7().getCurrentScrolledX() / (n1Var.s7() != null ? r1.s(n1Var.r7().getTimelineLayoutType()) : 1.0f));
                kotlin.jvm.internal.o.f(fromSeconds, "fromSeconds(...)");
                int ordinal = mVar.ordinal();
                if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
                    B = (K instanceof ex0.c ? (ex0.c) K : null) != null ? ((ex0.c) K).B() : K.l();
                } else {
                    B = K.l();
                }
                if (fromSeconds.smallThan(B.getStartTime())) {
                    sub = K.l().getStartTime();
                } else {
                    com.tencent.maas.model.time.MJTime endTime = B.getEndTime();
                    kotlin.jvm.internal.o.f(endTime, "getEndTime(...)");
                    if (!fromSeconds.bigThan(endTime) && !fromSeconds.equalsTo(endTime)) {
                        z17 = false;
                    }
                    sub = z17 ? K.l().getEndTime().sub(new com.tencent.maas.model.time.MJTime(1L)) : com.tencent.maas.model.time.MJTime.InvalidTime;
                }
                if (sub.isValid()) {
                    gx0.bf.q7(n1Var.p7(), sub, true, 0L, 4, null);
                    n1Var.v7(sub);
                }
            }
        }
    }

    @Override // gy0.h
    public void b(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        a(segmentID);
    }
}
