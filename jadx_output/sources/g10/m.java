package g10;

/* loaded from: classes7.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.x7 f267534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f267535f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, bw5.x7 x7Var, int i17) {
        super(0);
        this.f267533d = str;
        this.f267534e = x7Var;
        this.f267535f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        q10.l lVar = q10.l.f359523a;
        java.lang.String bizName = this.f267533d;
        kotlin.jvm.internal.o.f(bizName, "$bizName");
        bw5.x7 x7Var = this.f267534e;
        bw5.s7 e17 = x7Var.e();
        double a17 = lVar.a(bizName, e17 != null ? e17.f32835q : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "doBizPreload, autoDestroyTime: " + a17);
        gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
        jc3.s0 s0Var = jc3.s0.f298984d;
        long j17 = i10.a.f287082a;
        java.util.List Di = ((g10.v) i95.n0.c(g10.v.class)).Di(bizName);
        n10.o Bi = ((g10.v) i95.n0.c(g10.v.class)).Bi(bizName);
        ((nq0.p) tVar).Vi(new iq0.i(bizName, s0Var, j17, null, Di, Bi != null ? Bi.a() : null, a17, new g10.l(this.f267535f, x7Var), null, 264, null));
        return jz5.f0.f302826a;
    }
}
