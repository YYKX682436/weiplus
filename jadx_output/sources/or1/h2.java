package or1;

/* loaded from: classes5.dex */
public class h2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI f347503d;

    public h2(com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI searchOrRecommendBizUI) {
        this.f347503d = searchOrRecommendBizUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI searchOrRecommendBizUI = this.f347503d;
        searchOrRecommendBizUI.hideVKB();
        searchOrRecommendBizUI.finish();
        return true;
    }
}
