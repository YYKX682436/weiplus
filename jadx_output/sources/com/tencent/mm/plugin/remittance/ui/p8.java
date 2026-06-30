package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class p8 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.model.i f157877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceUI f157878b;

    public p8(com.tencent.mm.plugin.remittance.ui.RemittanceUI remittanceUI, com.tencent.mm.plugin.remittance.model.i iVar) {
        this.f157878b = remittanceUI;
        this.f157877a = iVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.f77 f77Var;
        com.tencent.mm.plugin.remittance.model.i iVar = this.f157877a;
        r45.rx rxVar = iVar.f156852r;
        java.lang.String str2 = rxVar.f385257f;
        final com.tencent.mm.plugin.remittance.ui.RemittanceUI remittanceUI = this.f157878b;
        remittanceUI.L = str2;
        remittanceUI.f157596t2 = rxVar.f385258g;
        remittanceUI.X = rxVar.f385260i;
        remittanceUI.R = rxVar.f385261m;
        remittanceUI.Y = rxVar.f385263o;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TRANSFER_SHOW_ALIAS_BOOLEAN_SYNC, java.lang.Boolean.valueOf(iVar.f156852r.f385263o));
        r45.yt5 yt5Var = iVar.f156852r.f385264p;
        if (yt5Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceUI", "right_navigation_item_route_info != null");
            r45.v1 v1Var = yt5Var.f391362o;
            if (v1Var != null && v1Var.f387793d.size() == 1 && v1Var.f387795f == 0) {
                v1Var.f387795f = -1;
            }
            this.f157878b.addIconOptionMenu(0, 0, com.tencent.mm.R.raw.icons_outlined_more, false, (android.view.MenuItem.OnMenuItemClickListener) new com.tencent.mm.plugin.remittance.ui.o8(this, yt5Var));
        }
        r45.rx rxVar2 = iVar.f156852r;
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceUI", "onSceneEnd NetSceneBeforeTransfer，mask_name：%s，truename_extend：%s，show_receiver_alias：%s", rxVar2.f385257f, rxVar2.f385258g, java.lang.Boolean.valueOf(rxVar2.f385263o));
        remittanceUI.getClass();
        r45.e77 e77Var = iVar.f156852r.f385262n;
        if (e77Var == null || e77Var.f373084d != 1 || (f77Var = e77Var.f373085e) == null || com.tencent.mm.sdk.platformtools.t8.K0(f77Var.f374081d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "  do not show WarningView");
            remittanceUI.M1.setVisibility(8);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) remittanceUI.C.getLayoutParams();
            layoutParams.topMargin = i65.a.b(remittanceUI.getContext(), 0);
            remittanceUI.C.setLayoutParams(layoutParams);
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) remittanceUI.R1.getLayoutParams();
            layoutParams2.topMargin = i65.a.b(remittanceUI.getContext(), 32);
            remittanceUI.R1.setLayoutParams(layoutParams2);
        } else {
            r45.e77 e77Var2 = iVar.f156852r.f385262n;
            final r45.f77 f77Var2 = e77Var2.f373085e;
            remittanceUI.M1.setVisibility(0);
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", "warning textInfo.wording:%s", f77Var2.f374081d);
            remittanceUI.O1.setText(f77Var2.f374081d);
            if (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(e77Var2.f373087g)) {
                remittanceUI.O1.setTextColor(com.tencent.mm.wallet_core.ui.r1.l0(e77Var2.f373086f));
            } else {
                remittanceUI.O1.setTextColor(com.tencent.mm.wallet_core.ui.r1.l0(e77Var2.f373087g));
            }
            int d17 = com.tencent.mm.sdk.platformtools.j.d(remittanceUI, 20.0f);
            int d18 = com.tencent.mm.sdk.platformtools.j.d(remittanceUI, 8.0f);
            int d19 = com.tencent.mm.sdk.platformtools.j.d(remittanceUI, 16.0f);
            if (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(e77Var2.f373089i)) {
                remittanceUI.P1.b(e77Var2.f373088h, d17, d17, -1);
            } else {
                remittanceUI.P1.b(e77Var2.f373089i, d17, d17, -1);
            }
            if (!com.tencent.mm.ui.bk.C() || com.tencent.mm.sdk.platformtools.t8.K0(e77Var2.f373091n)) {
                remittanceUI.Q1.b(e77Var2.f373090m, d18, d19, -1);
            } else {
                remittanceUI.Q1.b(e77Var2.f373091n, d18, d19, -1);
            }
            remittanceUI.M1.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.47
                public AnonymousClass47() {
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
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28871, 1, 1);
            remittanceUI.N1.setClickable(true);
            remittanceUI.N1.setOnClickListener(new com.tencent.mm.wallet_core.ui.z1() { // from class: com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.48

                /* renamed from: d */
                public final /* synthetic */ r45.f77 f157538d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass48(final r45.f77 f77Var22) {
                    super(false);
                    r2 = f77Var22;
                }

                @Override // com.tencent.mm.wallet_core.ui.z1
                public void onRealClick(android.view.View view) {
                    r45.f77 f77Var3 = r2;
                    com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", " click option item : %s ,type:%s", f77Var3.f374081d, java.lang.Integer.valueOf(f77Var3.f374082e.f372209d));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(28871, 1, 2);
                    r45.d77 d77Var = f77Var3.f374082e;
                    int i19 = d77Var.f372209d;
                    if (i19 == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", " textInfo.jumpInfo.url ：%s", d77Var.f372210e);
                        com.tencent.mm.wallet_core.ui.r1.V(com.tencent.mm.plugin.remittance.ui.RemittanceNewBaseUI.this.getContext(), f77Var3.f374082e.f372210e, false);
                    } else if (i19 == 2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceNewBaseUI", " textInfo.jumpInfo.username ：%s", d77Var.f372211f);
                        r45.d77 d77Var2 = f77Var3.f374082e;
                        com.tencent.mm.wallet_core.ui.r1.b0(d77Var2.f372211f, d77Var2.f372212g, 0, 1000);
                    } else if (i19 != 3) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceNewBaseUI", "unknow text info type");
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceNewBaseUI", " text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
                    }
                }
            });
        }
        remittanceUI.j7();
    }
}
