package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class je implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.n6 f129396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129397e;

    public je(ym5.n6 n6Var, com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI) {
        this.f129396d = n6Var;
        this.f129397e = finderSelectCoverUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ym5.n6 n6Var = this.f129396d;
        if (n6Var.getTextEditView().getVisibility() == 0) {
            if (n6Var.getTextEditView().getAnimation() == null || (n6Var.getTextEditView().getAnimation().hasStarted() && n6Var.getTextEditView().getAnimation().hasEnded())) {
                n6Var.getTextEditView().requestFocus();
                com.tencent.mm.ui.MMActivity.showVKB(this.f129397e);
            }
        }
    }
}
