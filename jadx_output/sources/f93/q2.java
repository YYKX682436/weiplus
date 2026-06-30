package f93;

/* loaded from: classes11.dex */
public final class q2 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI f260438a;

    public q2(com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI contactLabelRecommendUI) {
        this.f260438a = contactLabelRecommendUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI contactLabelRecommendUI = this.f260438a;
        if (z17) {
            com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI.U6(contactLabelRecommendUI);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelRecommendUI", "onCancelClick(): changed but do not save");
            contactLabelRecommendUI.finish();
        }
    }
}
