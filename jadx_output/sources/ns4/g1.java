package ns4;

/* loaded from: classes8.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339529d;

    public g1(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView) {
        this.f339529d = weCoinEncashView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$setupViews$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long j17 = os4.h.f348279a;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (android.os.SystemClock.elapsedRealtime() - j17 < 600) {
            z17 = true;
        } else {
            os4.h.f348279a = android.os.SystemClock.elapsedRealtime();
            z17 = false;
        }
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$setupViews$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339529d;
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = weCoinEncashView.f179151f;
        if (walletFormView == null) {
            kotlin.jvm.internal.o.o("mInputMoneyText");
            throw null;
        }
        java.lang.String text = walletFormView.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        int j18 = os4.h.j(text, "100");
        if (j18 > 0) {
            ms4.n nVar = weCoinEncashView.f179154i;
            if (nVar == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            nVar.P6(6);
            weCoinEncashView.hideWcKb();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click encash to cft ");
            ms4.n nVar2 = weCoinEncashView.f179154i;
            if (nVar2 == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            sb6.append(nVar2.f331067d);
            sb6.append(", ");
            sb6.append(j18);
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", sb6.toString());
            long j19 = j18;
            com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", "prepareEncashRequest, amount " + j19);
            ms4.n nVar3 = weCoinEncashView.f179154i;
            if (nVar3 == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            os4.a.a(nVar3.f331076p, java.lang.Boolean.TRUE);
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            nVar3.f331079s = uuid;
            nVar3.f331077q = j19;
            nVar3.O6(6, 1, 0, "");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.l.CTRL_INDEX, 90);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            int i17 = nVar3.f331069f;
            java.lang.String str2 = nVar3.f331070g;
            int i18 = nVar3.f331068e;
            java.lang.String str3 = js4.r.f301567c;
            ms4.m mVar = new ms4.m(nVar3);
            ((c61.l7) b6Var).getClass();
            r45.m42 m42Var = new r45.m42();
            m42Var.set(1, db2.t4.f228171a.a(8949));
            m42Var.set(2, xy2.c.e(weCoinEncashView));
            m42Var.set(3, java.lang.Integer.valueOf(i18));
            m42Var.set(4, uuid);
            m42Var.set(5, java.lang.Long.valueOf(j19));
            m42Var.set(6, java.lang.Integer.valueOf(i17));
            m42Var.set(7, str2);
            m42Var.set(8, str3);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 8949;
            lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveprepareincomeencash";
            lVar.f70664a = m42Var;
            lVar.f70665b = new r45.n42();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
            wi6.p(a17);
            pq5.g l17 = wi6.l();
            kotlin.jvm.internal.o.f(l17, "run(...)");
            pm0.v.T(l17, new c61.v6(mVar)).f(weCoinEncashView);
            str = "(Landroid/view/View;)V";
        } else {
            str = "(Landroid/view/View;)V";
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$setupViews$clickListener$1", "android/view/View$OnClickListener", "onClick", str);
    }
}
