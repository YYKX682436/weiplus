package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class r8 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.j f157924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceUI f157925b;

    public r8(com.tencent.mm.plugin.remittance.ui.RemittanceUI remittanceUI, com.tencent.mm.plugin.remittance.model.j jVar) {
        this.f157925b = remittanceUI;
        this.f157924a = jVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.remittance.model.j jVar = this.f157924a;
        java.lang.String str2 = jVar.f156861r.f390572i;
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_WALLET_UNION_TRANSFER_TITLE_STRING_SYNC, jVar.f156861r.f390575o);
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_WALLET_UNION_TRANSFER_SUBTITLE_STRING_SYNC, jVar.f156861r.f390573m);
        ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_WALLET_UNION_TRANSFER_MERCHANT_STRING_SYNC, jVar.f156861r.f390576p);
        r45.xx xxVar = jVar.f156861r;
        final com.tencent.mm.plugin.remittance.ui.RemittanceUI remittanceUI = this.f157925b;
        if (xxVar == null || com.tencent.mm.sdk.platformtools.t8.K0(xxVar.f390572i)) {
            remittanceUI.I1 = remittanceUI.getString(com.tencent.mm.R.string.k2x);
        } else {
            remittanceUI.I1 = jVar.f156861r.f390572i;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(jVar.f156861r.f390574n)) {
            remittanceUI.H1 = jVar.f156861r.f390574n;
        }
        r45.xx xxVar2 = jVar.f156861r;
        java.lang.String str3 = xxVar2.f390569f;
        if (str3 != null) {
            remittanceUI.X = str3;
        }
        remittanceUI.R = xxVar2.f390570g;
        remittanceUI.getClass();
        final r45.ay ayVar = jVar.f156861r.f390571h;
        if (ayVar == null || ayVar.f370345d != 1 || ayVar.f370346e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "  do not show WarningView");
            remittanceUI.M1.setVisibility(8);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) remittanceUI.C.getLayoutParams();
            layoutParams.topMargin = i65.a.b(remittanceUI.getContext(), 0);
            remittanceUI.C.setLayoutParams(layoutParams);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) remittanceUI.R1.getLayoutParams();
            layoutParams2.topMargin = i65.a.b(remittanceUI.getContext(), 32);
            remittanceUI.R1.setLayoutParams(layoutParams2);
        } else {
            remittanceUI.M1.setVisibility(0);
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "warning textInfo.wording:%s", ayVar.f370346e);
            remittanceUI.O1.setText(ayVar.f370346e);
            int d17 = com.tencent.mm.sdk.platformtools.j.d(remittanceUI, 20.0f);
            remittanceUI.P1.b(ayVar.f370347f, d17, d17, -1);
            remittanceUI.M1.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.49
                public AnonymousClass49() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI remittanceNewBaseUI = com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this;
                    android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) remittanceNewBaseUI.N1.getLayoutParams();
                    layoutParams3.width = remittanceNewBaseUI.Q1.getRight() + i65.a.b(remittanceNewBaseUI.getContext(), 8);
                    layoutParams3.height = i65.a.b(remittanceNewBaseUI.getContext(), 36);
                    remittanceNewBaseUI.N1.setLayoutParams(layoutParams3);
                    android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) remittanceNewBaseUI.C.getLayoutParams();
                    layoutParams4.topMargin = i65.a.b(remittanceNewBaseUI.getContext(), 16);
                    remittanceNewBaseUI.C.setLayoutParams(layoutParams4);
                    android.widget.LinearLayout.LayoutParams layoutParams5 = (android.widget.LinearLayout.LayoutParams) remittanceNewBaseUI.R1.getLayoutParams();
                    layoutParams5.topMargin = i65.a.b(remittanceNewBaseUI.getContext(), 0);
                    remittanceNewBaseUI.R1.setLayoutParams(layoutParams5);
                    remittanceNewBaseUI.O1.setMaxWidth((((remittanceNewBaseUI.M1.getWidth() - i65.a.b(remittanceNewBaseUI.getContext(), 20)) - i65.a.b(remittanceNewBaseUI.getContext(), 8)) - i65.a.b(remittanceNewBaseUI.getContext(), 12)) - i65.a.b(remittanceNewBaseUI.getContext(), 16));
                }
            }, 10L);
            remittanceUI.N1.setClickable(true);
            remittanceUI.N1.setOnClickListener(new com.tencent.mm.wallet_core.ui.z1() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.50

                /* renamed from: d */
                public final /* synthetic */ r45.ay f157542d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass50(final r45.ay ayVar2) {
                    super(false);
                    r2 = ayVar2;
                }

                @Override // com.tencent.mm.wallet_core.ui.z1
                public void onRealClick(android.view.View view) {
                    r45.ay ayVar2 = r2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", " click option item:%s, url:%s", ayVar2.f370346e, ayVar2.f370348g);
                    com.tencent.mm.wallet_core.ui.r1.V(com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this.getContext(), ayVar2.f370348g, false);
                }
            });
        }
        remittanceUI.j7();
    }
}
