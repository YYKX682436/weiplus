package df2;

/* loaded from: classes3.dex */
public final class kz extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.lz f230612b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz(df2.lz lzVar, java.lang.Class cls) {
        super(cls);
        this.f230612b = lzVar;
    }

    @Override // dk2.cb
    public void a(int i17, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i(this.f230612b.f230730m, "[polling] failed. retCode = " + i17 + ", errMsg = " + errMsg);
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.nt1 result = (r45.nt1) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        df2.lz lzVar = this.f230612b;
        com.tencent.mars.xlog.Log.i(lzVar.f230730m, "info: " + pm0.b0.g(result));
        lzVar.f230735r = false;
        ((mm2.f6) lzVar.business(mm2.f6.class)).B1.postValue((r45.aq4) result.getCustom(0));
        if (result.getBoolean(1)) {
            java.lang.String str = lzVar.f230732o + result.getString(2);
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(lzVar.f230731n);
            long j17 = M.getLong(str, -1L);
            long c17 = c01.id.c();
            if (j17 < 0) {
                r45.aq4 aq4Var = (r45.aq4) result.getCustom(0);
                if (aq4Var != null) {
                    lzVar.d7(aq4Var);
                }
                M.putLong(str, c17);
            }
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new df2.xy(M, c17, null), 2, null);
        }
    }
}
