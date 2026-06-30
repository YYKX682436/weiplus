package xg2;

/* loaded from: classes.dex */
public final class f implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f454389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f454390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.r f454391f;

    public f(com.tencent.mm.modelbase.m1 m1Var, kotlinx.coroutines.q qVar, yz5.r rVar) {
        this.f454389d = m1Var;
        this.f454390e = qVar;
        this.f454391f = rVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.m1 m1Var2 = this.f454389d;
        if (kotlin.jvm.internal.o.b(m1Var, m1Var2)) {
            gm0.j1.d().q(m1Var2.getType(), this);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            this.f454390e.resumeWith(kotlin.Result.m521constructorimpl(this.f454391f.C(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var)));
        }
    }
}
