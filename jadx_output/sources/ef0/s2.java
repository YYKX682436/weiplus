package ef0;

/* loaded from: classes8.dex */
public final class s2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.y2 f252319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f252320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f252321c;

    public s2(ef0.y2 y2Var, int i17, int i18) {
        this.f252319a = y2Var;
        this.f252320b = i17;
        this.f252321c = i18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ef0.y2 y2Var = this.f252319a;
        bw5.lc0 Ui = y2Var.Ui();
        java.lang.Integer valueOf = Ui != null ? java.lang.Integer.valueOf(Ui.f29743m) : null;
        int i17 = this.f252320b;
        if (valueOf != null && valueOf.intValue() == i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "setAiCoverModelType callback errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b);
            if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                y2Var.wi();
            } else {
                bw5.lc0 Ui2 = y2Var.Ui();
                if (Ui2 != null) {
                    Ui2.f29743m = this.f252321c;
                    Ui2.f29749s[7] = true;
                }
                y2Var.wi();
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingEntryConfigService", "setAiCoverModelType callback state change: cur:" + valueOf + ", target: " + i17);
        }
        return jz5.f0.f302826a;
    }
}
