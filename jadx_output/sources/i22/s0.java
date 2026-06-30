package i22;

/* loaded from: classes.dex */
public final class s0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f288026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f288027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f288028f;

    public s0(com.tencent.mm.modelbase.m1 m1Var, kotlin.jvm.internal.h0 h0Var, kotlinx.coroutines.q qVar) {
        this.f288026d = m1Var;
        this.f288027e = h0Var;
        this.f288028f = qVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.m1 m1Var2 = this.f288026d;
        if (kotlin.jvm.internal.o.b(m1Var, m1Var2)) {
            gm0.j1.n().f273288b.q(m1Var2.getType(), (com.tencent.mm.modelbase.u0) this.f288027e.f310123d);
            kotlinx.coroutines.q qVar = this.f288028f;
            if (i17 == 0 && i18 == 0) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(m1Var2));
            } else {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new i22.r0(i17, i18, str))));
            }
        }
    }
}
