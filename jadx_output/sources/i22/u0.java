package i22;

/* loaded from: classes.dex */
public final class u0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f288035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f288036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f288037f;

    public u0(com.tencent.mm.modelbase.m1 m1Var, kotlin.jvm.internal.h0 h0Var, kotlinx.coroutines.q qVar) {
        this.f288035d = m1Var;
        this.f288036e = h0Var;
        this.f288037f = qVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.m1 m1Var2 = this.f288035d;
        if (kotlin.jvm.internal.o.b(m1Var, m1Var2)) {
            gm0.j1.n().f273288b.q(m1Var2.getType(), (com.tencent.mm.modelbase.u0) this.f288036e.f310123d);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f288037f.resumeWith(kotlin.Result.m521constructorimpl(m1Var2));
        }
    }
}
