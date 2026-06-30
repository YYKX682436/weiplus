package ef0;

/* loaded from: classes8.dex */
public final class u2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.y2 f252332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f252333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f252334c;

    public u2(ef0.y2 y2Var, boolean z17, java.lang.Boolean bool) {
        this.f252332a = y2Var;
        this.f252333b = z17;
        this.f252334c = bool;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        bw5.lc0 Ui;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ef0.y2 y2Var = this.f252332a;
        bw5.lc0 Ui2 = y2Var.Ui();
        java.lang.Boolean valueOf = Ui2 != null ? java.lang.Boolean.valueOf(Ui2.f29740g) : null;
        boolean z17 = this.f252333b;
        if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.valueOf(z17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "setEnableSqQualityInWwan callback errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b);
            if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                y2Var.wi();
                int i17 = jm4.p0.f300401d;
                jm4.o0 o0Var = (jm4.o0) urgen.ur_0025.UR_42A9.UR_1332();
                if (o0Var != null) {
                    urgen.ur_0025.UR_42A9.UR_2FE9(((jm4.p0) o0Var).getCppPointer(), z17);
                }
            } else {
                java.lang.Boolean bool = this.f252334c;
                if (bool != null && (Ui = y2Var.Ui()) != null) {
                    Ui.f29740g = bool.booleanValue();
                    Ui.f29749s[4] = true;
                }
                y2Var.wi();
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingEntryConfigService", "setEnableSqQualityInWwan callback state change: cur:" + valueOf + ", target: " + z17);
        }
        return jz5.f0.f302826a;
    }
}
