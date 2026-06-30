package or1;

/* loaded from: classes12.dex */
public class j2 implements com.tencent.mm.ui.tools.i9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI f347513a;

    public j2(com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI searchOrRecommendBizUI) {
        this.f347513a = searchOrRecommendBizUI;
    }

    public void a(java.lang.String str) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI searchOrRecommendBizUI = this.f347513a;
        if (K0) {
            db5.e1.T(searchOrRecommendBizUI.getContext(), searchOrRecommendBizUI.getString(com.tencent.mm.R.string.bkb));
        } else {
            searchOrRecommendBizUI.hideVKB();
            searchOrRecommendBizUI.f94046g.a(str, 0);
        }
    }
}
