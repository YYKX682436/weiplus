package df2;

/* loaded from: classes3.dex */
public final class of implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.qf f230965d;

    public of(df2.qf qfVar) {
        this.f230965d = qfVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        df2.qf qfVar = this.f230965d;
        boolean a86 = ((mm2.c1) qfVar.business(mm2.c1.class)).a8();
        java.lang.String str = qfVar.f231161m;
        com.tencent.mars.xlog.Log.i(str, "observePrivilegeFloatMsgSwitch liveStart:" + a86 + ", customerEnableDanmakuFlow:" + booleanValue + '!');
        if (a86) {
            mm2.y1 P6 = ((mm2.j2) qfVar.business(mm2.j2.class)).P6();
            if (P6 != null && booleanValue == P6.f329553b) {
                com.tencent.mars.xlog.Log.i(str, "updateCommentConfig but newCustomPrivilegeFloatMsgSwitch:" + booleanValue + " same with old value");
            } else {
                mm2.y1 P62 = ((mm2.j2) qfVar.business(mm2.j2.class)).P6();
                if (P62 != null) {
                    P62.f329553b = ((mm2.j2) qfVar.business(mm2.j2.class)).R6() && booleanValue;
                }
                com.tencent.mars.xlog.Log.i(str, "update custom privilege float msg switch baseConfig:" + ((mm2.j2) qfVar.business(mm2.j2.class)).P6());
                mm2.y1 P63 = ((mm2.j2) qfVar.business(mm2.j2.class)).P6();
                if (P63 != null) {
                    df2.qf.c7(qfVar, P63, false, 2, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
