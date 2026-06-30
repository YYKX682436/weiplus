package or1;

/* loaded from: classes9.dex */
public class h0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f347501d;

    public h0(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI enterpriseBizContactListUI) {
        this.f347501d = new java.lang.ref.WeakReference(enterpriseBizContactListUI);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        try {
            if (this.f347501d.get() != null) {
                com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI enterpriseBizContactListUI = (com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI) this.f347501d.get();
                if (enterpriseBizContactListUI.isFinishing()) {
                    return;
                }
                r45.gb3 gb3Var = (r45.gb3) ((com.tencent.mm.modelbase.o) m1Var.getReqResp()).f70711b.f70700a;
                ((ku5.t0) ku5.t0.f312615d).B(new or1.g0(this, enterpriseBizContactListUI, gb3Var));
            }
        } catch (java.lang.Throwable unused) {
        }
    }
}
