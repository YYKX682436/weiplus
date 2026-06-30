package l01;

/* loaded from: classes7.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f314772a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f314773b;

    public h0(java.lang.String str, l01.c cVar) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f314772a = str;
        this.f314773b = l01.b.j(str);
    }

    public static java.io.InputStream a(l01.h0 h0Var, java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openRead, imageURL: ");
        java.lang.String str = h0Var.f314772a;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandSimpleImageLoader", sb6.toString());
        if (h0Var.b()) {
            try {
                return com.tencent.mm.vfs.w6.E(str);
            } catch (java.io.FileNotFoundException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Luggage.AppBrandSimpleImageLoader", e17, "load from local file %s", str);
                throw e17;
            }
        }
        boolean deliveryInstalled = ((com.tencent.mm.plugin.appbrand.fc) i95.n0.c(com.tencent.mm.plugin.appbrand.fc.class)).deliveryInstalled();
        if (!deliveryInstalled) {
            ((com.tencent.mm.plugin.appbrand.fc) i95.n0.c(com.tencent.mm.plugin.appbrand.fc.class)).deliveryInstall(new l01.f0(h0Var));
        }
        java.net.HttpURLConnection httpURLConnection = deliveryInstalled ? (java.net.HttpURLConnection) rc.b.f393906a.f393907a.openConnection(new java.net.URL(str)) : (java.net.HttpURLConnection) new java.net.URL(str).openConnection();
        httpURLConnection.setInstanceFollowRedirects(true);
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                com.tencent.mars.xlog.Log.i("Luggage.AppBrandSimpleImageLoader", "setHeaders, header: %s: %s", entry.getKey(), entry.getValue());
                httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        l01.g0 g0Var = new l01.g0(httpURLConnection.getInputStream(), new ik1.b0(httpURLConnection));
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandSimpleImageLoader", "openRead, imageURL: %s, connected", str);
        return g0Var;
    }

    public boolean b() {
        java.lang.String str = this.f314772a;
        return str.startsWith("file://") || str.startsWith("wcf://");
    }

    public java.lang.String toString() {
        return this.f314772a;
    }
}
