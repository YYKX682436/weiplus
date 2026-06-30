package sx4;

/* loaded from: classes.dex */
public class a0 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("report_data");
        java.lang.String string2 = bundle.getString("page_key");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return;
        }
        try {
            sx4.b0.b(string2, sx4.b0.a(new org.json.JSONObject(string)));
        } catch (org.json.JSONException unused) {
        }
    }
}
