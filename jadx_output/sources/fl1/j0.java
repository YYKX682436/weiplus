package fl1;

/* loaded from: classes4.dex */
public class j0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f263796a;

    public j0(fl1.c1 c1Var) {
        this.f263796a = c1Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        fl1.c1 c1Var = this.f263796a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "onReceiveValue, value:%s", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            java.lang.String optString = new org.json.JSONObject(str).optString("type", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || !optString.equalsIgnoreCase("ok")) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "onReceiveValue, type:ok");
            c1Var.c(5, 1);
            c1Var.a();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", e17, "launchCommentApplication exception:%s", e17);
        }
    }
}
