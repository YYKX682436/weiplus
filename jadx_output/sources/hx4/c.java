package hx4;

/* loaded from: classes8.dex */
public final class c implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx4.p f285664d;

    public c(hx4.p pVar) {
        this.f285664d = pVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        hx4.p pVar = this.f285664d;
        pVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BrowserChooseController", "showSettingDialog");
        lx4.j jVar = new lx4.j(((com.tencent.mm.plugin.webview.ui.tools.browser.BrowserChooseUI) pVar.f285682a).getContext());
        jVar.setOnKeyListener(new hx4.l(jVar, pVar));
        jVar.setOnCancelListener(new hx4.m(pVar));
        hx4.g gVar = pVar.f285689h;
        hx4.x xVar = (hx4.x) kz5.n0.a0(pVar.f285684c, pVar.f285686e);
        if (xVar == null) {
            xVar = new hx4.x(2);
        }
        gVar.f285669a = xVar;
        hx4.g gVar2 = pVar.f285689h;
        jVar.f322138g = gVar2;
        com.tencent.mm.plugin.webview.ui.tools.browser.view.BrowserSettingDialogView browserSettingDialogView = jVar.f322137f;
        if (browserSettingDialogView != null) {
            browserSettingDialogView.setBrowserSettingDialogClickListener(gVar2);
        }
        jVar.f322140i = pVar.f285686e;
        java.util.List list = pVar.f285684c;
        kotlin.jvm.internal.o.g(list, "list");
        jVar.f322139h = list;
        pVar.f285687f = jVar;
        ku5.u0 u0Var = ku5.t0.f312615d;
        hx4.n nVar = new hx4.n(pVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(nVar, 100L, false);
    }
}
