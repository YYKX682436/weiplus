package wj1;

/* loaded from: classes14.dex */
public class m implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wj1.n f446607b;

    public m(wj1.n nVar, java.lang.String str) {
        this.f446607b = nVar;
        this.f446606a = str;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(final int i17, final int i18, final java.lang.String str, final com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = this.f446607b.f446614a.f446576a;
        final java.lang.String str2 = this.f446606a;
        appBrandIDCardUI.runOnUiThread(new java.lang.Runnable() { // from class: wj1.m$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.protobuf.f fVar;
                com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem;
                wj1.m mVar = wj1.m.this;
                int i19 = i17;
                int i27 = i18;
                com.tencent.mm.modelbase.o oVar2 = oVar;
                java.lang.String str3 = str;
                java.lang.String str4 = str2;
                com.tencent.mm.ui.widget.dialog.u3 u3Var = mVar.f446607b.f446614a.f446576a.f89550z;
                if (u3Var != null && u3Var.isShowing()) {
                    mVar.f446607b.f446614a.f446576a.f89550z.dismiss();
                }
                if (i19 != 0 || i27 != 0 || (fVar = oVar2.f70711b.f70700a) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "SubmitAuthorizeUserID cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str3, oVar2.f70711b.f70700a);
                    return;
                }
                r45.kh6 kh6Var = (r45.kh6) fVar;
                if (kh6Var.f378701d == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "ShowAuthorizeUserIDResp.auth_base_response is err");
                    com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI2 = mVar.f446607b.f446614a.f446576a;
                    dp.a.makeText(appBrandIDCardUI2, appBrandIDCardUI2.getString(com.tencent.mm.R.string.f490158mj), 0).show();
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "resp.auth_status:%d", java.lang.Integer.valueOf(kh6Var.f378702e));
                int i28 = kh6Var.f378702e;
                if (i28 != 0) {
                    if (i28 != 1) {
                        return;
                    }
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14943, mVar.f446607b.f446614a.f446576a.f89532e, 5, mVar.f446607b.f446614a.f446576a.f89539o.f381961s);
                    com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI3 = mVar.f446607b.f446614a.f446576a;
                    appBrandIDCardUI3.f89543s = str4;
                    appBrandIDCardUI3.f89540p = kh6Var.f378703f;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "switchToVerifyFragment");
                    ((ku5.t0) ku5.t0.f312615d).B(new wj1.h0(appBrandIDCardUI3));
                    return;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14943, mVar.f446607b.f446614a.f446576a.f89532e, 9, mVar.f446607b.f446614a.f446576a.f89539o.f381961s);
                com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI4 = mVar.f446607b.f446614a.f446576a;
                int i29 = appBrandIDCardUI4.f89546v;
                if ((i29 == 1 || i29 == 2) && (phoneItem = appBrandIDCardUI4.A) != null) {
                    vi1.o0.f437416a.e(phoneItem);
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("intent_err_code", kh6Var.f378701d.f375078d);
                intent.putExtra("intent_auth_token", kh6Var.f378704g);
                mVar.f446607b.f446614a.f446576a.setResult(-1, intent);
                mVar.f446607b.f446614a.f446576a.finish();
            }
        });
    }
}
