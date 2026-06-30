package hy4;

/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public long f286107a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f286109c;

    /* renamed from: d, reason: collision with root package name */
    public int f286110d;

    /* renamed from: e, reason: collision with root package name */
    public int f286111e;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f286108b = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f286112f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f286113g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f286114h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f286115i = -1;

    public final void a(int i17) {
        if (this.f286115i > 0) {
            return;
        }
        this.f286115i = i17;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f286107a;
        if (currentTimeMillis < 0 || currentTimeMillis > 86400000) {
            currentTimeMillis = 0;
        }
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[10];
        objArr[0] = com.tencent.mm.sdk.platformtools.y9.a(this.f286108b);
        java.lang.String str = this.f286108b;
        java.lang.String str2 = "";
        if (str != null) {
            try {
                android.net.Uri parse = android.net.Uri.parse(str);
                java.lang.String queryParameter = parse.getQueryParameter("__biz");
                long V = com.tencent.mm.sdk.platformtools.t8.V(parse.getQueryParameter("mid"), 0L);
                int P = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("idx"), 0);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(queryParameter) && V >= 0) {
                    str2 = "id://local/i.html?__biz=" + queryParameter + "&mid=" + V + "&idx=" + P;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickReportHelper", "getUrlId ex " + e17.getMessage());
            }
        }
        objArr[1] = str2;
        objArr[2] = java.lang.Integer.valueOf(this.f286109c ? 1 : 0);
        objArr[3] = java.lang.Integer.valueOf(this.f286110d);
        objArr[4] = java.lang.Integer.valueOf(this.f286111e);
        objArr[5] = java.lang.Long.valueOf(currentTimeMillis);
        objArr[6] = com.tencent.mm.sdk.platformtools.y9.a(this.f286112f);
        objArr[7] = this.f286113g;
        objArr[8] = java.lang.Integer.valueOf(i17);
        objArr[9] = this.f286114h;
        fVar.d(19208, objArr);
    }
}
