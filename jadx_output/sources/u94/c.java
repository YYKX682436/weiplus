package u94;

/* loaded from: classes4.dex */
public class c implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f425837d;

    /* renamed from: e, reason: collision with root package name */
    public final int f425838e;

    public c(u94.f fVar, int i17, u94.a aVar) {
        this.f425837d = new java.lang.ref.WeakReference(fVar);
        this.f425838e = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        if ((m1Var instanceof ab0.s) || (m1Var instanceof ns.l)) {
            if (m1Var.getType() != 30 && m1Var.getType() != 667) {
                com.tencent.mars.xlog.Log.w("HalfScreenAddBrandController", "not expected scene,  type = " + m1Var.getType());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                return;
            }
            if ((m1Var instanceof ns.l) && ((com.tencent.mm.pluginsdk.model.m3) ((ns.l) m1Var)).f189380g != 1) {
                com.tencent.mars.xlog.Log.e("HalfScreenAddBrandController", "not opcode addcontact!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
                return;
            } else {
                com.tencent.mm.plugin.sns.model.y.b(this);
                com.tencent.mars.xlog.Log.i("HalfScreenAddBrandController", "catch add Contact errCode: %d && errMsg: %s", java.lang.Integer.valueOf(i18), str);
                com.tencent.mm.sdk.platformtools.u3.h(new u94.b(this, i17, i18, m1Var, str));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
    }
}
