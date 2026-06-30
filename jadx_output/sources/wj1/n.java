package wj1;

/* loaded from: classes14.dex */
public class n implements com.tencent.mm.plugin.appbrand.jsapi.pay.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wj1.c0 f446614a;

    public n(wj1.c0 c0Var) {
        this.f446614a = c0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.pay.j
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem;
        wj1.c0 c0Var = this.f446614a;
        if (z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14943, c0Var.f446576a.f89532e, 4, c0Var.f446576a.f89539o.f381961s);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.jh6();
            lVar.f70665b = new r45.kh6();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/userdata/submitauthorizeuserid";
            lVar.f70667d = 1721;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            r45.jh6 jh6Var = (r45.jh6) a17.f70710a.f70684a;
            com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = c0Var.f446576a;
            jh6Var.f377814d = appBrandIDCardUI.f89532e;
            jh6Var.f377815e = appBrandIDCardUI.f89541q;
            jh6Var.f377816f = str;
            jh6Var.f377817g = appBrandIDCardUI.f89539o.f381961s;
            int i17 = appBrandIDCardUI.f89546v;
            if ((i17 == 1 || i17 == 2) && (phoneItem = appBrandIDCardUI.A) != null && !phoneItem.f87406n) {
                java.lang.String str2 = phoneItem.f87399d;
                if (str2 == null) {
                    str2 = "";
                }
                jh6Var.f377818h = str2;
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = appBrandIDCardUI.f89550z;
            if (u3Var != null && !u3Var.isShowing()) {
                c0Var.f446576a.f89550z.show();
            }
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).Ai(a17, new wj1.m(this, str), c0Var.f446576a.theCreate());
        } else {
            com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI2 = c0Var.f446576a;
            int i18 = appBrandIDCardUI2.f89546v;
            if (i18 == 1 || i18 == 2) {
                appBrandIDCardUI2.setResult(0);
                c0Var.f446576a.finish();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "verifyOk:%b", java.lang.Boolean.valueOf(z17));
    }
}
