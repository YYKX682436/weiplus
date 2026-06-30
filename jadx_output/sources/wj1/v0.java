package wj1;

/* loaded from: classes14.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag f446639d;

    public v0(com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag) {
        this.f446639d = appBrandIDCardVerifyPwdFrag;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "verify sms click");
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag = this.f446639d;
        wj1.m0 m0Var = appBrandIDCardVerifyPwdFrag.f89551d;
        if (m0Var != null) {
            java.lang.String obj = appBrandIDCardVerifyPwdFrag.f89561q.getText().toString();
            r45.jc jcVar = appBrandIDCardVerifyPwdFrag.f89553f;
            wj1.c0 c0Var = (wj1.c0) m0Var;
            c0Var.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardUI", "verifyCode is null, err, return");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "verifySms");
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = new r45.by6();
                lVar.f70665b = new r45.cy6();
                lVar.f70666c = "/cgi-bin/mmbiz-bin/userdata/verifysmscode";
                lVar.f70667d = 1721;
                lVar.f70668e = 0;
                lVar.f70669f = 0;
                com.tencent.mm.modelbase.o a17 = lVar.a();
                r45.by6 by6Var = (r45.by6) a17.f70710a.f70684a;
                com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = c0Var.f446576a;
                by6Var.f371150d = appBrandIDCardUI.f89532e;
                by6Var.f371151e = appBrandIDCardUI.f89541q;
                by6Var.f371152f = appBrandIDCardUI.f89543s;
                by6Var.f371153g = jcVar.f377692d;
                by6Var.f371154h = appBrandIDCardUI.f89539o.f381961s;
                by6Var.f371155i = obj;
                by6Var.f371156m = appBrandIDCardUI.f89544t;
                by6Var.f371157n = jcVar.f377694f;
                int i17 = appBrandIDCardUI.f89546v;
                if ((i17 == 1 || i17 == 2) && (phoneItem = appBrandIDCardUI.A) != null && !phoneItem.f87406n) {
                    java.lang.String str = phoneItem.f87399d;
                    if (str == null) {
                        str = "";
                    }
                    by6Var.f371158o = str;
                }
                ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).Ai(a17, new wj1.p(c0Var), appBrandIDCardUI.theCreate());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
