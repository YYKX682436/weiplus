package v61;

/* loaded from: classes13.dex */
public class o0 implements com.tencent.mm.ui.mmfb.sdk.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v61.q0 f433467a;

    public o0(v61.q0 q0Var) {
        this.f433467a = q0Var;
    }

    public void a(java.lang.String str, java.lang.Object obj) {
        v61.q0 q0Var = this.f433467a;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RefreshTokenRunner", "response is null or nil");
            v61.q0.a(q0Var, 1, "response is null or nil");
            return;
        }
        if (str.contains("access_token") && str.length() > 12) {
            try {
                org.json.JSONObject c17 = com.tencent.mm.ui.mmfb.sdk.o.c(str);
                if (c17.has("access_token")) {
                    android.os.Bundle b17 = v61.q0.b(c17);
                    q0Var.getClass();
                    android.os.Message obtain = android.os.Message.obtain();
                    obtain.what = 2;
                    obtain.setData(b17);
                    q0Var.f433471c.sendMessage(obtain);
                    return;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RefreshTokenRunner", th6, "", new java.lang.Object[0]);
            }
            v61.q0.a(q0Var, 2, "decodeUrl fail");
            return;
        }
        try {
            com.tencent.mm.ui.mmfb.sdk.o.c(str);
        } catch (com.tencent.mm.ui.mmfb.sdk.n e17) {
            java.lang.String str2 = "errCode = " + e17.f209218d + ", errType = " + e17.f209219e + ", errMsg = " + e17.getMessage();
            com.tencent.mars.xlog.Log.e("MicroMsg.RefreshTokenRunner", "parseJson facebookerror, " + str2);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RefreshTokenRunner", e17, "", new java.lang.Object[0]);
            v61.q0.a(q0Var, 3, str2);
            return;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RefreshTokenRunner", "parseJson exception : " + e18.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RefreshTokenRunner", e18, "", new java.lang.Object[0]);
        }
        v61.q0.a(q0Var, 2, "parseJson error");
    }
}
