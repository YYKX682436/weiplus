package f93;

/* loaded from: classes11.dex */
public final class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI f260478d;

    public u2(com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI contactLabelRecommendUI) {
        this.f260478d = contactLabelRecommendUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI contactLabelRecommendUI = this.f260478d;
        boolean z17 = true;
        if (!contactLabelRecommendUI.f143267m) {
            if (contactLabelRecommendUI.a7()) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(contactLabelRecommendUI);
                u1Var.g(contactLabelRecommendUI.getString(com.tencent.mm.R.string.bgj));
                u1Var.a(true);
                u1Var.n(contactLabelRecommendUI.getString(com.tencent.mm.R.string.bgl));
                u1Var.j(contactLabelRecommendUI.getString(com.tencent.mm.R.string.bgk));
                u1Var.b(new f93.q2(contactLabelRecommendUI));
                z17 = false;
                u1Var.q(false);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "onCancelClick(): not change, exit");
            }
        }
        if (z17) {
            contactLabelRecommendUI.finish();
        }
    }
}
