package df2;

/* loaded from: classes3.dex */
public final class kf implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.qf f230579d;

    public kf(df2.qf qfVar) {
        this.f230579d = qfVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mm2.c2 c2Var = (mm2.c2) obj;
        df2.qf qfVar = this.f230579d;
        boolean U6 = qfVar.U6();
        java.lang.String str = "observeDanmakuSpeedChange landscape:" + U6 + ", liveStart:" + ((mm2.c1) qfVar.business(mm2.c1.class)).a8() + ", speed:" + c2Var + '!';
        java.lang.String str2 = qfVar.f231161m;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (U6) {
            com.tencent.mars.xlog.Log.i(str2, "update danmaku speed " + c2Var);
            mm2.y1 P6 = ((mm2.j2) qfVar.business(mm2.j2.class)).P6();
            if (P6 != null) {
                df2.qf.c7(qfVar, P6, false, 2, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
