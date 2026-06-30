package oi1;

/* loaded from: classes7.dex */
public final class a extends oi1.e {
    public final void c(ze.n nVar, int i17) {
        oi1.l w17;
        com.tencent.mm.plugin.appbrand.profile.c cVar;
        com.tencent.mm.plugin.appbrand.page.w2 currentPage = nVar.x0().getCurrentPage();
        if (currentPage == null || (w17 = currentPage.w(oi1.n.f345608e)) == null || (cVar = (com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true)) == null) {
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = nVar.f74803n;
        objArr[1] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        com.tencent.mm.plugin.appbrand.page.w2 currentPage2 = nVar.x0().getCurrentPage();
        java.lang.String currentUrl = currentPage2 != null ? currentPage2.getCurrentUrl() : null;
        if (currentUrl == null) {
            currentUrl = "";
        }
        objArr[2] = currentUrl;
        objArr[3] = java.lang.Integer.valueOf(i17);
        objArr[4] = i17 == 1 ? w17.f345603a : "";
        ((ch1.d) cVar).c(19169, objArr);
    }
}
