package ty0;

/* loaded from: classes4.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f422834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f422835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ty0.i1 f422836f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(kotlin.jvm.internal.c0 c0Var, java.lang.String str, ty0.i1 i1Var) {
        super(1);
        this.f422834d = c0Var;
        this.f422835e = str;
        this.f422836f = i1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.view.MMPAGView it = (com.tencent.mm.view.MMPAGView) obj;
        kotlin.jvm.internal.o.g(it, "it");
        kotlin.jvm.internal.c0 c0Var = this.f422834d;
        if (!c0Var.f310112d) {
            c0Var.f310112d = true;
            it.setPath(this.f422835e);
            ty0.i1 i1Var = this.f422836f;
            i1Var.getClass();
            it.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxSnsSwitch()) == 1);
            it.setRepeatCount(0);
            it.g();
            i1Var.f422847d = it;
        }
        return jz5.f0.f302826a;
    }
}
