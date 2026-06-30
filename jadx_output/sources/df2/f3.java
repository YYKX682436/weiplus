package df2;

/* loaded from: classes3.dex */
public final class f3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.g3 f230102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f230103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f230104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f230105g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(df2.g3 g3Var, int i17, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230102d = g3Var;
        this.f230103e = i17;
        this.f230104f = z17;
        this.f230105g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.f3(this.f230102d, this.f230103e, this.f230104f, this.f230105g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.f3 f3Var = (df2.f3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        f3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.e3 e3Var = new df2.e3(this.f230105g);
        df2.g3 g3Var = this.f230102d;
        int i17 = (int) ((mm2.c1) g3Var.business(mm2.c1.class)).f328866q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commonAnchorFlagClick anchorStatusFlag: ");
        int i18 = this.f230103e;
        sb6.append(i18);
        sb6.append(" lastAnchorStateFlag:");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("FinderLiveMicSettingModeController", sb6.toString());
        ((mm2.c1) g3Var.business(mm2.c1.class)).p8(i18);
        ((mm2.g5) g3Var.business(mm2.g5.class)).N6();
        if (this.f230104f) {
            df2.c3 c3Var = new df2.c3(g3Var, i18, e3Var, i17);
            dk2.xf P6 = g3Var.P6();
            if (P6 != null) {
                dk2.xf.e(P6, ((mm2.e1) g3Var.business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) g3Var.business(mm2.e1.class)).f328983m, ((mm2.c1) g3Var.business(mm2.c1.class)).f328866q, 0, false, c3Var, 24, null);
            }
        } else {
            e3Var.invoke(java.lang.Boolean.TRUE, null);
        }
        return jz5.f0.f302826a;
    }
}
