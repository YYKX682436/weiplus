package tg1;

/* loaded from: classes7.dex */
public final class m extends tg1.d {
    @Override // tg1.d
    public void c(java.lang.String str, android.net.Uri uri, int i17, android.os.Bundle bundle, tg1.c cVar) {
        java.lang.String queryParameter = uri == null ? "" : uri.getQueryParameter("appid");
        int ordinal = cVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                int i18 = 0;
                if (uri != null && uri.getBooleanQueryParameter("debug", false)) {
                    i18 = 1;
                }
                com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI.T6(com.tencent.mm.R.string.f490278qi);
                com.tencent.mm.plugin.appbrand.report.v0.m(queryParameter, 2, i18 + 1);
                return;
            }
            if (ordinal == 2) {
                com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI.T6(com.tencent.mm.R.string.f490261py);
                com.tencent.mm.plugin.appbrand.report.v0.m("", 4, 2);
            } else if (ordinal != 3) {
                com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI.T6(com.tencent.mm.R.string.f490116ld);
            } else {
                com.tencent.mm.plugin.appbrand.ui.AppBrand404PageUI.T6(com.tencent.mm.R.string.f490260px);
                com.tencent.mm.plugin.appbrand.report.v0.m("", 3, 2);
            }
        }
    }
}
