package or1;

/* loaded from: classes12.dex */
public class k2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI f347524d;

    public k2(com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI searchOrRecommendBizUI) {
        this.f347524d = searchOrRecommendBizUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer bizSearchResultItemContainer = this.f347524d.f94046g;
        bizSearchResultItemContainer.getClass();
        gm0.j1.d().d(bizSearchResultItemContainer.f93986i);
        bizSearchResultItemContainer.f93984g.f347560e = false;
    }
}
