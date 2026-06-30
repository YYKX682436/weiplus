package df2;

/* loaded from: classes3.dex */
public final class mf implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.qf f230777d;

    public mf(df2.qf qfVar) {
        this.f230777d = qfVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mm2.d2 trans = (mm2.d2) obj;
        df2.qf qfVar = this.f230777d;
        boolean U6 = qfVar.U6();
        boolean a86 = ((mm2.c1) qfVar.business(mm2.c1.class)).a8();
        java.lang.String str = qfVar.f231161m;
        com.tencent.mars.xlog.Log.i(str, "observeDanmakuTransChange landsscape:" + U6 + ", liveStart:" + a86 + ", trans:" + trans + '!');
        if (U6 && a86) {
            mm2.y1 P6 = ((mm2.j2) qfVar.business(mm2.j2.class)).P6();
            if (trans == (P6 != null ? P6.f329554c.f329600b : null)) {
                com.tencent.mars.xlog.Log.i(str, "updateCommentConfig but newTrans:" + trans + " same with old value");
            } else {
                mm2.y1 P62 = ((mm2.j2) qfVar.business(mm2.j2.class)).P6();
                if (P62 != null) {
                    kotlin.jvm.internal.o.g(trans, "trans");
                    com.tencent.mars.xlog.Log.i("MMFinder.LiveDanmakuSlice", "saveDanmakuMode trans:" + trans);
                    int ordinal = trans.ordinal();
                    if (ordinal == 0) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_DANMAKU_COMMENT_TRANS_INT_SYNC, 2);
                    } else if (ordinal != 1) {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_DANMAKU_COMMENT_TRANS_INT_SYNC, 0);
                    } else {
                        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_DANMAKU_COMMENT_TRANS_INT_SYNC, 1);
                    }
                    mm2.z1 z1Var = P62.f329554c;
                    z1Var.getClass();
                    z1Var.f329600b = trans;
                }
                com.tencent.mars.xlog.Log.i(str, "update danmaku trans baseConfig:" + ((mm2.j2) qfVar.business(mm2.j2.class)).P6());
                mm2.y1 P63 = ((mm2.j2) qfVar.business(mm2.j2.class)).P6();
                if (P63 != null) {
                    df2.qf.c7(qfVar, P63, false, 2, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
