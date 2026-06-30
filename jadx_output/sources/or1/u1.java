package or1;

/* loaded from: classes9.dex */
public class u1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f347587d;

    public u1(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI enterpriseBizEntranceListUI) {
        this.f347587d = new java.lang.ref.WeakReference(enterpriseBizEntranceListUI);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        try {
            if (this.f347587d.get() != null) {
                com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI enterpriseBizEntranceListUI = (com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI) this.f347587d.get();
                if (enterpriseBizEntranceListUI.isFinishing()) {
                    return;
                }
                or1.t1 t1Var = new or1.t1(this, enterpriseBizEntranceListUI, (r45.gb3) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a);
                int i19 = com.tencent.mm.plugin.brandservice.ui.EnterpriseBizEntranceListUI.f94028m;
                ((ku5.t0) ku5.t0.f312615d).B(t1Var);
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
