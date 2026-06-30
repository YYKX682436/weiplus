package dk2;

/* loaded from: classes3.dex */
public final class j3 extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f233636e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(dk2.r4 r4Var, kotlinx.coroutines.q qVar) {
        super(5);
        this.f233635d = r4Var;
        this.f233636e = qVar;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.lang.String str;
        km2.b bVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.lang.String errMsg = (java.lang.String) obj4;
        r45.pf2 pf2Var = (r45.pf2) obj5;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        if (booleanValue) {
            kotlin.jvm.internal.o.e(pf2Var, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderManualCloseLiveResp");
            dk2.r4 r4Var = this.f233635d;
            r4Var.getClass();
            str = errMsg;
            bVar = new km2.b(pf2Var.getInteger(1), pf2Var.getInteger(2), pf2Var.getLong(9), pf2Var.getInteger(4), zl2.r4.f473950a.F0(((mm2.e1) r4Var.m(mm2.e1.class)).f328988r), pf2Var.getInteger(5), pf2Var.getInteger(6), ((mm2.e1) r4Var.m(mm2.e1.class)).f328988r.getLong(50), pf2Var.getInteger(7), 0L, 0L, false, 0L, 0L, null, pf2Var.getInteger(8), null, pf2Var.getInteger(10), null, null, (r45.sl1) pf2Var.getCustom(13), null, pf2Var, 2979840, null);
        } else {
            str = errMsg;
            bVar = null;
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f233636e).resumeWith(kotlin.Result.m521constructorimpl(new dk2.r0(booleanValue, intValue, intValue2, str, bVar)));
        return jz5.f0.f302826a;
    }
}
