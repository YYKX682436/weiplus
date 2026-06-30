package zx;

/* loaded from: classes14.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout f476954d;

    public j(com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout controlledRipplesLayout) {
        this.f476954d = controlledRipplesLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout controlledRipplesLayout = this.f476954d;
        if (controlledRipplesLayout.f65307s) {
            controlledRipplesLayout.c();
        }
    }
}
