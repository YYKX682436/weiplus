package ns4;

/* loaded from: classes8.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.p0 f339596d;

    public n0(ns4.p0 p0Var) {
        this.f339596d = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.view.k0 Y0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinCustomAmountInputDialog$bindAction$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ns4.p0 p0Var = this.f339596d;
        p0Var.a();
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = p0Var.f339613f;
        if (walletFormView == null) {
            kotlin.jvm.internal.o.o("inputArea");
            throw null;
        }
        java.lang.String text = walletFormView.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        long j17 = os4.h.j(text, com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT);
        ns4.s sVar = ((ns4.i) p0Var.f339609b.f339632c).f339543a;
        sVar.f339647l = true;
        js4.j jVar = sVar.f339648m;
        if (jVar != null) {
            jVar.a(sVar, java.lang.Boolean.FALSE);
        }
        js4.e eVar = sVar.f339649n;
        if (eVar != null && (Y0 = ((com.tencent.mm.plugin.finder.live.plugin.yk) eVar).f115207a.Y0()) != null) {
            Y0.changeScreenToPortrait();
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var = sVar.f339638c;
        if (y1Var == null) {
            kotlin.jvm.internal.o.o("mBottomSheet");
            throw null;
        }
        y1Var.q();
        ((q30.k) ((r30.p) i95.n0.c(r30.p.class))).Ai();
        ms4.h hVar = sVar.f339640e;
        hVar.getClass();
        androidx.fragment.app.FragmentActivity context = sVar.f339636a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.RechargeProductsDialogViewModel", "directRecharge, amount: " + j17);
        hVar.f331031g.postValue(java.lang.Boolean.TRUE);
        ms4.e eVar2 = new ms4.e(hVar);
        js4.n nVar = new js4.n();
        r45.js3 js3Var = (r45.js3) hVar.f331032h.getValue();
        if (js3Var != null) {
            nVar.f301548f = js3Var.f378089h.f375992e.f377679d;
            nVar.f301547e = js3Var.f378088g;
        }
        nVar.f301550h = j17;
        nVar.f301543a = hVar.f331028d.f301543a;
        java.lang.String str = hVar.f331037p;
        if (str == null) {
            kotlin.jvm.internal.o.o("mSceneSessionID");
            throw null;
        }
        nVar.f301545c = str;
        nVar.f301546d = eVar2;
        nVar.f301549g = js4.m.DIRECT_CHARGE;
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d((com.tencent.mm.ui.MMActivity) context, nVar);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinCustomAmountInputDialog$bindAction$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
