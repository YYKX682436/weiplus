package w64;

/* loaded from: classes4.dex */
public class e implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w64.n f443293d;

    public e(w64.n nVar) {
        this.f443293d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$2");
        w64.n nVar = this.f443293d;
        java.lang.String str = w64.n.a(nVar).f162583h;
        java.lang.String str2 = w64.n.a(nVar).f162585i;
        java.lang.String str3 = w64.n.a(nVar).f162587j + "";
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = w64.n.b(nVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        com.tencent.mm.plugin.sns.ui.listener.i.y(str, str2, str3, b17, nVar.f443309b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$2");
        return f0Var;
    }
}
