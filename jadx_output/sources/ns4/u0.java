package ns4;

/* loaded from: classes8.dex */
public final class u0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339660d;

    public u0(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView) {
        this.f339660d = weCoinEncashView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.na7 na7Var;
        ms4.a aVar = (ms4.a) obj;
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView.f179148v;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339660d;
        weCoinEncashView.getClass();
        if ((aVar != null ? aVar.f330998d : null) != null) {
            r45.js5 js5Var = aVar.f330998d;
            boolean z17 = js5Var instanceof r45.ck0;
            if (z17) {
                r45.ie ieVar = js5Var.BaseResponse;
                if ((ieVar != null && ieVar.f376959d == 10006) && (na7Var = ((r45.ck0) js5Var).f371616e) != null) {
                    com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(weCoinEncashView, 1, 0);
                    java.lang.String cancel_button_wording = weCoinEncashView.getString(com.tencent.mm.R.string.l9a);
                    kotlin.jvm.internal.o.f(cancel_button_wording, "getString(...)");
                    java.lang.String confirm_button_wording = weCoinEncashView.getString(com.tencent.mm.R.string.l8s);
                    kotlin.jvm.internal.o.f(confirm_button_wording, "getString(...)");
                    java.lang.String str = na7Var.f381217i;
                    if (str != null && str.length() > 0) {
                        cancel_button_wording = na7Var.f381217i;
                        kotlin.jvm.internal.o.f(cancel_button_wording, "cancel_button_wording");
                    }
                    java.lang.String str2 = na7Var.f381216h;
                    if (str2 != null && str2.length() > 0) {
                        confirm_button_wording = na7Var.f381216h;
                        kotlin.jvm.internal.o.f(confirm_button_wording, "confirm_button_wording");
                    }
                    z2Var.m(cancel_button_wording, confirm_button_wording);
                    ns4.h1 h1Var = new ns4.h1(z2Var, weCoinEncashView, na7Var);
                    ns4.i1 i1Var = new ns4.i1(z2Var, weCoinEncashView, na7Var);
                    z2Var.D = h1Var;
                    z2Var.E = i1Var;
                    android.view.View inflate = android.view.View.inflate(weCoinEncashView, com.tencent.mm.R.layout.d9g, null);
                    ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.bys)).setOnClickListener(new ns4.j1(z2Var));
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
                    java.lang.String str3 = na7Var.f381212d;
                    if (str3 != null) {
                        textView.setText(str3);
                        com.tencent.mm.ui.bk.s0(textView.getPaint());
                    }
                    android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484050cu2);
                    java.lang.String str4 = na7Var.f381213e;
                    if (str4 != null) {
                        textView2.setText(str4);
                        com.tencent.mm.wallet_core.ui.r1.w0(textView2, str4, 0, str4.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new ns4.k1(na7Var, weCoinEncashView), true), weCoinEncashView);
                    }
                    z2Var.j(inflate);
                    z2Var.C();
                    return;
                }
            }
            if (z17) {
                r45.ie ieVar2 = js5Var.BaseResponse;
                if (ieVar2 != null && ieVar2.f376959d == 10008) {
                    return;
                }
            }
        }
        androidx.appcompat.app.AppCompatActivity context = weCoinEncashView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        os4.h.e(context, aVar, null);
    }
}
