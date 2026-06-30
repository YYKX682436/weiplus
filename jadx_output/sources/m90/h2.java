package m90;

/* loaded from: classes4.dex */
public class h2 implements com.tencent.mm.modelbase.j1 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        sg3.r rVar = (sg3.r) i95.n0.c(sg3.r.class);
        rVar.getClass();
        try {
            if (z65.c.a()) {
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, java.lang.String.format("just debug errType %s errCode %s errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str), 1).show();
            }
            if (m1Var.getType() == 853) {
                android.app.ProgressDialog progressDialog = rVar.f407989m;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    rVar.f407989m = null;
                }
                if (m1Var.equals(rVar.f407990n)) {
                    ab0.x xVar = (ab0.x) m1Var;
                    if (i18 == 0) {
                        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_contact_prefs", 0).edit().putBoolean(rVar.cj(((l41.h0) xVar).f315823f, ((l41.h0) xVar).f315825h), true).commit();
                        rVar.mj(((l41.h0) xVar).f315823f);
                    }
                    com.tencent.mars.xlog.Log.w("MicroMsg.PluginMessenger", "onSceneEnd VerifyOpenIMContact errCode: " + i18 + " errType: " + i17 + " userName: " + ((l41.h0) xVar).f315823f + " ticket: " + ((l41.h0) xVar).f315824g + " talkerUsername: " + ((l41.h0) xVar).f315825h);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PluginMessenger", "onSceneEnd " + th6);
        }
    }
}
