package wj1;

/* loaded from: classes14.dex */
public class p implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wj1.c0 f446623a;

    public p(wj1.c0 c0Var) {
        this.f446623a = c0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(final int i17, final int i18, final java.lang.String str, final com.tencent.mm.modelbase.o oVar) {
        this.f446623a.f446576a.runOnUiThread(new java.lang.Runnable() { // from class: wj1.p$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.protobuf.f fVar;
                com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem;
                wj1.c0 c0Var = wj1.p.this.f446623a;
                int i19 = i17;
                int i27 = i18;
                com.tencent.mm.modelbase.o oVar2 = oVar;
                if (i19 != 0 || i27 != 0 || (fVar = oVar2.f70711b.f70700a) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "SubmitAuthorizeUserID cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str, oVar2.f70711b.f70700a);
                    com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = c0Var.f446576a;
                    dp.a.makeText(appBrandIDCardUI, appBrandIDCardUI.getString(com.tencent.mm.R.string.f490158mj), 0).show();
                    return;
                }
                r45.cy6 cy6Var = (r45.cy6) fVar;
                r45.gc gcVar = cy6Var.f371932d;
                if (gcVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "VerifySmsCodeResp.auth_base_response is null");
                    return;
                }
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf(gcVar.f375078d);
                java.lang.String str2 = cy6Var.f371932d.f375079e;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                objArr[1] = str2;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "VerifySmsCodeResp.auth_base_response errcode:%s, errMsg:%s", objArr);
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.String str3 = c0Var.f446576a.f89532e;
                com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI2 = c0Var.f446576a;
                g0Var.d(14943, str3, 8, appBrandIDCardUI2.f89539o.f381961s);
                int i28 = cy6Var.f371932d.f375078d;
                if (i28 != 0) {
                    if (i28 == 40013) {
                        wj1.c0.a(c0Var, appBrandIDCardUI2.getString(com.tencent.mm.R.string.f490163mo));
                        return;
                    } else {
                        wj1.c0.a(c0Var, appBrandIDCardUI2.getString(com.tencent.mm.R.string.f490162mn));
                        return;
                    }
                }
                g0Var.d(14943, appBrandIDCardUI2.f89532e, 9, appBrandIDCardUI2.f89539o.f381961s);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "verify success");
                int i29 = appBrandIDCardUI2.f89546v;
                if ((i29 == 1 || i29 == 2) && (phoneItem = appBrandIDCardUI2.A) != null) {
                    vi1.o0.f437416a.e(phoneItem);
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("intent_err_code", cy6Var.f371932d.f375078d);
                intent.putExtra("intent_auth_token", cy6Var.f371933e);
                appBrandIDCardUI2.setResult(-1, intent);
                appBrandIDCardUI2.finish();
            }
        });
    }
}
