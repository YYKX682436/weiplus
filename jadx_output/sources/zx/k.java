package zx;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout f476955d;

    public k(com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout controlledRipplesLayout) {
        this.f476955d = controlledRipplesLayout;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout controlledRipplesLayout = this.f476955d;
        if (controlledRipplesLayout.f65307s) {
            if (controlledRipplesLayout.f65305q || controlledRipplesLayout.f65306r) {
                controlledRipplesLayout.postOnAnimation(this);
            } else {
                controlledRipplesLayout.postDelayed(new zx.j(controlledRipplesLayout), controlledRipplesLayout.getIntervalAfterRound());
            }
        }
    }
}
