package ku1;

/* loaded from: classes15.dex */
public class v extends ku1.l {
    @Override // ku1.l, ku1.l0
    public void a(android.view.ViewGroup viewGroup, tt1.j jVar) {
        super.a(viewGroup, jVar);
        i(viewGroup, jVar);
    }

    @Override // ku1.l0
    public void b(android.view.ViewGroup viewGroup, tt1.j jVar) {
        xt1.t0.Ni().l();
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.c0o);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateShadeLayout", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateShadeLayout", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.c0m);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateShadeLayout", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateShadeLayout", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r45.w50 w50Var = jVar.i0().D;
        if (w50Var != null) {
            android.view.View findViewById3 = viewGroup.findViewById(com.tencent.mm.R.id.c0t);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateShadeLayout", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateShadeLayout", "(Landroid/view/View;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388878d)) {
                return;
            }
            android.widget.Button button = (android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.c08);
            button.setText(w50Var.f388878d);
            button.setVisibility(0);
            h(button, jVar);
            button.setOnClickListener(new ku1.t(this, w50Var, jVar));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388879e)) {
                ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.c0_)).setText(w50Var.f388879e);
            }
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.c0s);
            if (com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388880f)) {
                textView.setVisibility(8);
            } else {
                textView.setText(w50Var.f388880f);
                textView.setVisibility(0);
            }
        }
    }

    @Override // ku1.l, ku1.l0
    public void c(android.view.ViewGroup viewGroup, tt1.j jVar) {
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.c0o);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "beforeShowCodeView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "beforeShowCodeView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.c0m);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "beforeShowCodeView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "beforeShowCodeView", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // ku1.l, ku1.l0
    public boolean d(tt1.j jVar) {
        if (!jVar.i0().E) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDynamicQrCodeController", "isCanGetAndShowCode false : is_commom_card false!ban card show!");
            return false;
        }
        r45.w50 w50Var = jVar.i0().D;
        if (w50Var == null || com.tencent.mm.sdk.platformtools.t8.K0(w50Var.f388878d)) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CardDynamicQrCodeController", "isCanGetAndShowCode false : unavailable_qrcode_field is not null  !ban card show!");
        return false;
    }

    @Override // ku1.l0
    public void e(android.view.ViewGroup viewGroup, tt1.j jVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrCodeController", "onScreenShot! ");
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.c0o);
        if (findViewById.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDynamicQrCodeController", "code_qr_disable_layout is visible! do not show hint!");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "onScreenShot", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "onScreenShot", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.c0q);
        if (findViewById2.getVisibility() == 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "onScreenShot", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "onScreenShot", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.c0m);
        imageView.setVisibility(8);
        android.view.View findViewById3 = viewGroup.findViewById(com.tencent.mm.R.id.c0t);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "onScreenShot", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "onScreenShot", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.c0_)).setText(this.f312131b.getResources().getString(com.tencent.mm.R.string.art));
        android.widget.Button button = (android.widget.Button) viewGroup.findViewById(com.tencent.mm.R.id.c08);
        button.setVisibility(0);
        h(button, jVar);
        wt1.n Ni = xt1.t0.Ni();
        Ni.l();
        xt1.o D0 = xt1.t0.aj().D0(jVar.g());
        if (D0 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport currentCode cardId =%s,codeId=%s", D0.field_card_id, D0.field_code_id);
            if (xt1.t0.aj().y0(jVar.g(), D0.field_code_id)) {
                Ni.d(jVar.g(), D0.field_code_id, lu1.e.CARDCODEREFRESHACTION_SNAPSHOT);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport delete failue! do not report! cardId =%s,codeId=%s", D0.field_card_id, D0.field_code_id);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport  failue! currentCode is null!");
        }
        button.setOnClickListener(new ku1.u(this, findViewById, findViewById3, imageView, button, viewGroup, jVar));
    }

    @Override // ku1.l
    public boolean f() {
        return false;
    }

    @Override // ku1.l
    public boolean g() {
        return true;
    }

    @Override // ku1.l0
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488281oz;
    }

    public final void h(android.widget.Button button, tt1.j jVar) {
        java.lang.String str = jVar.s0().f388555p;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        int d17 = lu1.a0.d(str);
        com.tencent.mm.ui.MMActivity mMActivity = this.f312131b;
        button.setText(mMActivity.getResources().getString(com.tencent.mm.R.string.aru));
        button.setTextColor(d17);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(mMActivity.getResources().getColor(com.tencent.mm.R.color.f478784h4));
        gradientDrawable.setStroke(2, d17);
        gradientDrawable.setCornerRadius(8.0f);
        button.setBackground(gradientDrawable);
    }

    public final void i(android.view.ViewGroup viewGroup, tt1.j jVar) {
        r45.eg0 eg0Var = jVar.s0().f388556p0;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.c0q);
        if (eg0Var == null || !eg0Var.f373427e) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateRefreshLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateRefreshLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateRefreshLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/card/ui/view/CardDynamicQrCodeController", "updateRefreshLayout", "(Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (com.tencent.mm.sdk.platformtools.t8.K0(eg0Var.f373428f)) {
            return;
        }
        ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.c0r)).setText(eg0Var.f373428f);
        ((android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.c0p)).setOnClickListener(new ku1.s(this, viewGroup));
    }
}
