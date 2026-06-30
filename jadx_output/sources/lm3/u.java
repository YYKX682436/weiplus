package lm3;

/* loaded from: classes10.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.b0 f319511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm3.e f319512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.n0 f319513f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f319514g;

    public u(lm3.b0 b0Var, lm3.e eVar, com.tencent.mm.plugin.mv.ui.uic.n0 n0Var, in5.s0 s0Var) {
        this.f319511d = b0Var;
        this.f319512e = eVar;
        this.f319513f = n0Var;
        this.f319514g = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lm3.b0 b0Var = this.f319511d;
        androidx.appcompat.app.AppCompatActivity activity = b0Var.f319470e;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.mv.ui.uic.e1 e1Var = (com.tencent.mm.plugin.mv.ui.uic.e1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.e1.class);
        lm3.e eVar = this.f319512e;
        fm3.u uVar = eVar.f319482d;
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = this.f319513f;
        e1Var.Q6(uVar, n0Var.f151317s, new lm3.t(eVar, b0Var, this.f319514g));
        n0Var.f151316r = false;
    }
}
