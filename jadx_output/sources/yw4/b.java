package yw4;

/* loaded from: classes7.dex */
public final class b extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final int f466948b;

    /* renamed from: c, reason: collision with root package name */
    public final yw4.a f466949c;

    public b(int i17, yw4.a aVar) {
        this.f466948b = i17;
        this.f466949c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x02de, code lost:
    
        if (r2 != 338) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0143  */
    @Override // com.tencent.mm.plugin.webview.core.i3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.xweb.y0 f(com.tencent.xweb.WebView r23, com.tencent.xweb.x0 r24) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw4.b.f(com.tencent.xweb.WebView, com.tencent.xweb.x0):com.tencent.xweb.y0");
    }

    public final java.lang.String v(android.net.Uri uri, java.lang.String str) {
        if (uri == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebImgPreloadInterceptor", "getQueryParameterSafely uri or key null");
            return "";
        }
        try {
            if (!uri.isHierarchical()) {
                return "";
            }
            java.lang.String queryParameter = uri.getQueryParameter(str);
            return queryParameter == null ? "" : queryParameter;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebImgPreloadInterceptor", "getQueryParameterSafely failed " + e17);
            return "";
        }
    }
}
