package ld1;

/* loaded from: classes7.dex */
public class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.y f318063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f318064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ld1.h f318066d;

    public g(ld1.h hVar, com.tencent.luggage.sdk.jsapi.component.service.y yVar, int i17, java.lang.String str) {
        this.f318066d = hVar;
        this.f318063a = yVar;
        this.f318064b = i17;
        this.f318065c = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.er5 er5Var = (r45.er5) obj;
        if (er5Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.JsApiReportPageData", "reportwxaappexpose cgi failed, null response");
            this.f318063a.a(this.f318064b, this.f318066d.o("fail:cgi fail"));
            return null;
        }
        int i17 = er5Var.BaseResponse.f376959d;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e("Luggage.JsApiReportPageData", "reportwxaappexpose cgi failed, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), er5Var.BaseResponse.f376960e);
            this.f318063a.a(this.f318064b, this.f318066d.o("fail:cgi fail"));
            return null;
        }
        java.lang.String str = this.f318065c;
        int i18 = er5Var.f373694d;
        android.util.SparseIntArray sparseIntArray = ld1.d.f318059a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            android.util.SparseIntArray sparseIntArray2 = ld1.d.f318059a;
            synchronized (sparseIntArray2) {
                sparseIntArray2.put(str.hashCode(), i18);
            }
        }
        this.f318063a.a(this.f318064b, this.f318066d.o("ok"));
        return null;
    }
}
