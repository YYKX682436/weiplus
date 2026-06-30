package ef0;

/* loaded from: classes8.dex */
public final class t2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.y2 f252327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f252328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f252329c;

    public t2(ef0.y2 y2Var, int i17, int i18) {
        this.f252327a = y2Var;
        this.f252328b = i17;
        this.f252329c = i18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        ef0.y2 y2Var = this.f252327a;
        bw5.lc0 Ui = y2Var.Ui();
        java.lang.Integer valueOf = Ui != null ? java.lang.Integer.valueOf(Ui.f29746p) : null;
        int i17 = this.f252328b;
        if (valueOf != null && valueOf.intValue() == i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingEntryConfigService", "setAiCreateModelType callback errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b);
            if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                y2Var.wi();
            } else {
                bw5.lc0 Ui2 = y2Var.Ui();
                if (Ui2 != null) {
                    Ui2.f29746p = this.f252329c;
                    Ui2.f29749s[10] = true;
                }
                y2Var.wi();
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingEntryConfigService", "setAiCreateModelType callback state change: cur:" + valueOf + ", target: " + i17);
        }
        return jz5.f0.f302826a;
    }
}
