package or1;

/* loaded from: classes12.dex */
public class f2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI f347493d;

    public f2(com.tencent.mm.plugin.brandservice.ui.SearchOrRecommendBizUI searchOrRecommendBizUI) {
        this.f347493d = searchOrRecommendBizUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.SearchOrRecommendBizUI", "NetScene is null.");
            return;
        }
        if (m1Var.getType() != 456) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.SearchOrRecommendBizUI", "The NetScene is not a RecommendGroupNetScene.");
            return;
        }
        gm0.j1.d().q(456, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.SearchOrRecommendBizUI", "errType(%d) , errCode(%d) , errMsg(%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            java.util.LinkedList H = lr1.f0.H();
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer bizSearchResultItemContainer = this.f347493d.f94046g;
            or1.d2 d2Var = bizSearchResultItemContainer == null ? null : (or1.d2) bizSearchResultItemContainer.getAdapter();
            if (d2Var == null || H == null || H.size() <= 0) {
                return;
            }
            boolean z17 = d2Var.getCount() == 0;
            d2Var.f347473t = H;
            if (z17) {
                com.tencent.mm.sdk.platformtools.u3.h(new or1.e2(this, d2Var));
            }
        }
    }
}
