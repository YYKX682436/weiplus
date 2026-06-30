package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public final class h4 extends com.tencent.mm.ui.component.UIComponent implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ak0 f152638d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f152639e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f152640f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f152641g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f152639e = jz5.h.b(new com.tencent.mm.plugin.offline.ui.d4(this));
        this.f152640f = jz5.h.b(new com.tencent.mm.plugin.offline.ui.f4(this));
        this.f152641g = jz5.h.b(new com.tencent.mm.plugin.offline.ui.c4(this));
    }

    public final com.tencent.mm.plugin.offline.ui.OfflineAlertView O6() {
        java.lang.Object value = ((jz5.n) this.f152639e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.plugin.offline.ui.OfflineAlertView) value;
    }

    public final void P6() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC, null);
        if (str == null || str.length() == 0) {
            this.f152638d = null;
            return;
        }
        try {
            this.f152638d = wo3.l.I(new org.json.JSONObject(str));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletOfflineEnableUIC", e17, "", new java.lang.Object[0]);
        }
    }

    public final void Q6() {
        r45.ak0 ak0Var = this.f152638d;
        if (ak0Var != null) {
            if (!(ak0Var != null && ak0Var.f370061d == 0)) {
                if (O6().d(9)) {
                    if (O6().f152473d == 9) {
                        O6().a();
                    }
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f152641g).getValue();
                    if (viewGroup != null) {
                        viewGroup.setVisibility(4);
                    }
                    final com.tencent.mm.plugin.offline.ui.OfflineAlertView O6 = O6();
                    java.lang.Object value = ((jz5.n) this.f152640f).getValue();
                    kotlin.jvm.internal.o.f(value, "getValue(...)");
                    final android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) value;
                    r45.ak0 ak0Var2 = this.f152638d;
                    com.tencent.mm.plugin.offline.ui.g4 g4Var = new com.tencent.mm.plugin.offline.ui.g4(this);
                    com.tencent.mars.xlog.Log.i("MicroMsg.OfflineAlertView", "showEnableTokenAlert");
                    O6.f152473d = 9;
                    O6.f152476g = false;
                    O6.setVisibility(0);
                    O6.f152475f.removeAllViews();
                    final android.view.View inflate = android.view.LayoutInflater.from(O6.getContext()).inflate(com.tencent.mm.R.layout.d7j, O6.f152475f, false);
                    O6.f152475f.addView(inflate);
                    android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.kiq);
                    if (findViewById != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/offline/ui/OfflineAlertView", "showEnableTokenAlert", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/EnableCodePage;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/plugin/offline/ui/OfflineAlertView", "showEnableTokenAlert", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/EnableCodePage;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.h7n);
                    android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482933s7);
                    android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.h5h);
                    weImageView.setImageResource(com.tencent.mm.R.raw.pay_safe);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(ak0Var2.f370063f)) {
                        textView.setText(ak0Var2.f370063f);
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(ak0Var2.f370064g)) {
                        button.setText(ak0Var2.f370064g);
                    }
                    ((android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.m9c)).setVisibility(8);
                    button.setOnClickListener(new com.tencent.mm.plugin.offline.ui.s(O6, g4Var));
                    viewGroup2.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.offline.ui.OfflineAlertView$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i17 = com.tencent.mm.plugin.offline.ui.OfflineAlertView.f152472n;
                            com.tencent.mm.plugin.offline.ui.OfflineAlertView offlineAlertView = com.tencent.mm.plugin.offline.ui.OfflineAlertView.this;
                            offlineAlertView.getClass();
                            android.view.View view = viewGroup2;
                            java.lang.Integer valueOf = java.lang.Integer.valueOf(view.getHeight());
                            android.view.View view2 = inflate;
                            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineAlertView", "qrCodeView.getHeight%s %s", valueOf, java.lang.Integer.valueOf(view2.getMeasuredHeight()));
                            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view2.getLayoutParams();
                            if (view2.getMeasuredHeight() > view.getHeight()) {
                                layoutParams.height = view2.getMeasuredHeight();
                                view2.setLayoutParams(layoutParams);
                            } else if (view.getHeight() > 0) {
                                layoutParams.height = view.getHeight();
                                view2.setLayoutParams(layoutParams);
                            }
                            com.tencent.mm.plugin.offline.ui.z zVar = offlineAlertView.f152477h;
                            if (zVar != null) {
                                ((com.tencent.mm.plugin.offline.ui.q1) zVar).a();
                            }
                        }
                    });
                    return;
                }
                return;
            }
        }
        if (O6().f152473d == 9) {
            O6().a();
        }
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (kotlin.jvm.internal.o.b(a1Var, gm0.j1.u().c())) {
            java.util.Objects.toString(obj);
            if (obj == com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEnableUIC", "update enableCodePage changed");
                pm0.v.X(new com.tencent.mm.plugin.offline.ui.e4(this));
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineEnableUIC", "onActivityResult: " + i17 + ", " + i18);
        if (i17 == 256 && i18 == -1) {
            wo3.l lVar = new wo3.l("" + ((int) (java.lang.System.currentTimeMillis() / 1000)), 0, 0);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI");
            ((com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) activity).doSceneProgress(lVar, false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        P6();
        Q6();
        gm0.j1.u().c().a(this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        gm0.j1.u().c().e(this);
    }
}
