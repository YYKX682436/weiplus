package df2;

/* loaded from: classes3.dex */
public final class ef implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.qf f230057d;

    public ef(df2.qf qfVar) {
        this.f230057d = qfVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        df2.qf qfVar = this.f230057d;
        boolean U6 = qfVar.U6();
        boolean a86 = ((mm2.c1) qfVar.business(mm2.c1.class)).a8();
        com.tencent.mars.xlog.Log.i(qfVar.f231161m, "observeCommentFloatMsgSwitch liveStart:" + a86 + ", landsscape:" + U6 + ", enable:" + booleanValue + '!');
        if (U6 && a86) {
            if (((mm2.j2) qfVar.business(mm2.j2.class)).O6(U6)) {
                df2.qf.Z6(qfVar, mm2.e2.f328998e);
            } else {
                df2.qf.Z6(qfVar, mm2.e2.f328997d);
            }
        }
        return jz5.f0.f302826a;
    }
}
