package df2;

/* renamed from: df2.if, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cif implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.qf f230396d;

    public Cif(df2.qf qfVar) {
        this.f230396d = qfVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mm2.b2 range = (mm2.b2) obj;
        df2.qf qfVar = this.f230396d;
        boolean U6 = qfVar.U6();
        boolean a86 = ((mm2.c1) qfVar.business(mm2.c1.class)).a8();
        java.lang.String str = qfVar.f231161m;
        com.tencent.mars.xlog.Log.i(str, "observeDanmakuRangeChange landsscape:" + U6 + ", liveStart:" + a86 + ", range:" + range + '!');
        if (U6 && a86) {
            mm2.y1 P6 = ((mm2.j2) qfVar.business(mm2.j2.class)).P6();
            if (range == (P6 != null ? P6.f329554c.f329599a : null)) {
                com.tencent.mars.xlog.Log.i(str, "updateCommentConfig but newRange:" + range + " same with old value");
            } else {
                mm2.y1 P62 = ((mm2.j2) qfVar.business(mm2.j2.class)).P6();
                if (P62 != null) {
                    kotlin.jvm.internal.o.g(range, "range");
                    com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", "saveDanmakuDisplayRange range:" + range);
                    int ordinal = range.ordinal();
                    if (ordinal == 1) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_DANMAKU_COMMENT_RANGE_INT_SYNC, 1);
                    } else if (ordinal != 2) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_DANMAKU_COMMENT_RANGE_INT_SYNC, 0);
                    } else {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_DANMAKU_COMMENT_RANGE_INT_SYNC, 2);
                    }
                    mm2.z1 z1Var = P62.f329554c;
                    z1Var.getClass();
                    z1Var.f329599a = range;
                }
                com.tencent.mars.xlog.Log.i(str, "update danmaku range baseConfig:" + ((mm2.j2) qfVar.business(mm2.j2.class)).P6());
                mm2.y1 P63 = ((mm2.j2) qfVar.business(mm2.j2.class)).P6();
                if (P63 != null) {
                    df2.qf.c7(qfVar, P63, false, 2, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
