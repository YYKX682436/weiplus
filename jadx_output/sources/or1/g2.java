package or1;

/* loaded from: classes12.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f347498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI f347499e;

    public g2(com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI searchOrRecommendBizUI, java.lang.String str) {
        this.f347499e = searchOrRecommendBizUI;
        this.f347498d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI searchOrRecommendBizUI = this.f347499e;
        searchOrRecommendBizUI.f94045f.setSearchContent(this.f347498d);
        searchOrRecommendBizUI.f94045f.f210146g.performClick();
    }
}
