package ef0;

/* loaded from: classes8.dex */
public final class v2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.y2 f252342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f252343b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f252344c;

    public v2(ef0.y2 y2Var, boolean z17, java.lang.Boolean bool) {
        this.f252342a = y2Var;
        this.f252343b = z17;
        this.f252344c = bool;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        bw5.lc0 Ui;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ef0.y2 y2Var = this.f252342a;
        bw5.lc0 Ui2 = y2Var.Ui();
        java.lang.Boolean valueOf = Ui2 != null ? java.lang.Boolean.valueOf(Ui2.f29737d) : null;
        boolean z17 = this.f252343b;
        if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.valueOf(z17))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "setMusicRecommendState callback errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b);
            int i17 = fVar.f70615a;
            java.lang.Boolean bool = this.f252344c;
            if (i17 == 0 && fVar.f70616b == 0) {
                y2Var.wi();
                y2Var.nj(bool, z17);
            } else {
                if (bool != null && (Ui = y2Var.Ui()) != null) {
                    Ui.f29737d = bool.booleanValue();
                    Ui.f29749s[1] = true;
                }
                y2Var.wi();
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingEntryConfigService", "setMusicRecommendState callback state change: cur:" + valueOf + ", target: " + z17);
        }
        return jz5.f0.f302826a;
    }
}
