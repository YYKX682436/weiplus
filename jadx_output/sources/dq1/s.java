package dq1;

/* loaded from: classes8.dex */
public final class s implements ab0.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f242356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dq1.t f242357b;

    public s(java.lang.ref.WeakReference weakReference, dq1.t tVar) {
        this.f242356a = weakReference;
        this.f242357b = tVar;
    }

    @Override // ab0.f0
    public final void onResult(boolean z17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        java.lang.ref.WeakReference weakReference = this.f242356a;
        com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI bizComSchIntermediateUI = (com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI) weakReference.get();
        if (bizComSchIntermediateUI != null && (u3Var = bizComSchIntermediateUI.f93877h) != null) {
            u3Var.dismiss();
        }
        if (z17) {
            this.f242357b.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizSchemeWWProfile", "jumpToProfile success!");
        } else {
            com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI bizComSchIntermediateUI2 = (com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI) weakReference.get();
            if (bizComSchIntermediateUI2 != null) {
                bizComSchIntermediateUI2.Z6();
            }
        }
    }
}
