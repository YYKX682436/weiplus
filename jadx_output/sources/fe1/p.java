package fe1;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final fe1.p f261489d = new fe1.p();

    public p() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String successData = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(successData, "successData");
        try {
            return kz5.c1.i(new jz5.l("cardNo", new org.json.JSONObject(successData).optString("cardNo", "")));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.JsApiIssue", "parse issueCard result error: " + e17.getMessage());
            return null;
        }
    }
}
