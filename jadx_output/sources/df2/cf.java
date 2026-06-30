package df2;

/* loaded from: classes3.dex */
public final class cf implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.qf f229880d;

    public cf(df2.qf qfVar) {
        this.f229880d = qfVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        df2.qf qfVar = this.f229880d;
        boolean U6 = qfVar.U6();
        boolean a86 = ((mm2.c1) qfVar.business(mm2.c1.class)).a8();
        com.tencent.mars.xlog.Log.i(qfVar.f231161m, "observeCommentDanmakuSwitch landscape:" + U6 + ", liveStart:" + a86 + ", enable:" + booleanValue + '!');
        if (U6 && a86) {
            qfVar.b7("enableCommentFloatMsg");
        }
        return jz5.f0.f302826a;
    }
}
