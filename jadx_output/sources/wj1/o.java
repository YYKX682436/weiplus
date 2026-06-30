package wj1;

/* loaded from: classes14.dex */
public class o implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wj1.c0 f446616a;

    public o(wj1.c0 c0Var) {
        this.f446616a = c0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(final int i17, final int i18, final java.lang.String str, final com.tencent.mm.modelbase.o oVar) {
        this.f446616a.f446576a.runOnUiThread(new java.lang.Runnable() { // from class: wj1.o$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.protobuf.f fVar;
                wj1.c0 c0Var = wj1.o.this.f446616a;
                int i19 = i17;
                int i27 = i18;
                com.tencent.mm.modelbase.o oVar2 = oVar;
                if (i19 != 0 || i27 != 0 || (fVar = oVar2.f70711b.f70700a) == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "sendSms cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str, oVar2.f70711b.f70700a);
                    com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = c0Var.f446576a;
                    dp.a.makeText(appBrandIDCardUI, appBrandIDCardUI.getString(com.tencent.mm.R.string.f490158mj), 0).show();
                    return;
                }
                r45.rz5 rz5Var = (r45.rz5) fVar;
                r45.gc gcVar = rz5Var.f385318d;
                if (gcVar == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "SendSmsResp.auth_base_response is null");
                    wj1.c0.a(c0Var, c0Var.f446576a.getString(com.tencent.mm.R.string.f490164mp));
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "SendSmsResp.auth_base_response.err_code:%d", java.lang.Integer.valueOf(gcVar.f375078d));
                if (rz5Var.f385318d.f375078d != 0) {
                    wj1.c0.a(c0Var, c0Var.f446576a.getString(com.tencent.mm.R.string.f490164mp));
                    return;
                }
                com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI2 = c0Var.f446576a;
                java.lang.String str2 = rz5Var.f385319e;
                appBrandIDCardUI2.f89544t = str2;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "send success, verifyToken:%s", str2);
            }
        });
    }
}
