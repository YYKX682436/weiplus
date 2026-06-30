package wj1;

/* loaded from: classes14.dex */
public class r0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj1.t0 f446631d;

    public r0(wj1.t0 t0Var) {
        this.f446631d = t0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem;
        wj1.t0 t0Var = this.f446631d;
        t0Var.f446635d.f89561q.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardVerifyPwdFrag", "sendSms click");
        com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag appBrandIDCardVerifyPwdFrag = t0Var.f446635d;
        wj1.m0 m0Var = appBrandIDCardVerifyPwdFrag.f89551d;
        if (m0Var != null) {
            r45.jc jcVar = appBrandIDCardVerifyPwdFrag.f89553f;
            wj1.c0 c0Var = (wj1.c0) m0Var;
            c0Var.getClass();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI appBrandIDCardUI = c0Var.f446576a;
            g0Var.d(14943, appBrandIDCardUI.f89532e, 7, appBrandIDCardUI.f89539o.f381961s);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandIDCardUI", "sendSms");
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.qz5();
            lVar.f70665b = new r45.rz5();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/userdata/sendsms";
            lVar.f70667d = 1762;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            r45.qz5 qz5Var = (r45.qz5) a17.f70710a.f70684a;
            qz5Var.f384374d = appBrandIDCardUI.f89532e;
            qz5Var.f384375e = appBrandIDCardUI.f89541q;
            qz5Var.f384376f = appBrandIDCardUI.f89543s;
            qz5Var.f384377g = jcVar.f377692d;
            qz5Var.f384379i = jcVar.f377694f;
            qz5Var.f384378h = appBrandIDCardUI.f89539o.f381961s;
            int i18 = appBrandIDCardUI.f89546v;
            if ((i18 == 1 || i18 == 2) && (phoneItem = appBrandIDCardUI.A) != null && !phoneItem.f87406n) {
                java.lang.String str = phoneItem.f87399d;
                if (str == null) {
                    str = "";
                }
                qz5Var.f384380m = str;
            }
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).Ai(a17, new wj1.o(c0Var), appBrandIDCardUI.theCreate());
        }
    }
}
