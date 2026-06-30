package v73;

/* loaded from: classes9.dex */
public class r0 implements com.tencent.mm.wallet_core.model.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.f f433738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI f433739b;

    public r0(com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI, r73.f fVar) {
        this.f433739b = honeyPayMainUI;
        this.f433738a = fVar;
    }

    @Override // com.tencent.mm.wallet_core.model.x0
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI = this.f433739b;
        java.util.ArrayList arrayList = honeyPayMainUI.f142344r;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            honeyPayMainUI.f142339m.removeView((com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardLayout) it.next());
        }
        arrayList.clear();
        this.f433739b.removeAllOptionMenu();
        if (this.f433738a.f393169r.f392428o) {
            this.f433739b.f142346t = true;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24522, 1, 1);
        } else {
            this.f433739b.f142346t = false;
        }
        java.util.LinkedList linkedList = this.f433738a.f393169r.f392422f;
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i(this.f433739b.f142260d, "empty card");
            com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI2 = this.f433739b;
            r45.z75 z75Var = this.f433738a.f393169r.f392423g;
            honeyPayMainUI2.f142337h.setVisibility(0);
            v73.v0 v0Var = (v73.v0) honeyPayMainUI2.component(v73.v0.class);
            v0Var.getClass();
            ku5.u0 u0Var = ku5.t0.f312615d;
            v73.u0 u0Var2 = new v73.u0(v0Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(u0Var2, 300L, false);
            if (z75Var == null || com.tencent.mm.sdk.platformtools.t8.K0(z75Var.f391774d)) {
                com.tencent.mars.xlog.Log.w(honeyPayMainUI2.f142260d, "empty help word!");
                honeyPayMainUI2.f142340n.setVisibility(8);
            } else {
                com.tencent.mm.wallet_core.ui.r1.d(honeyPayMainUI2.f142340n);
                honeyPayMainUI2.f142340n.setClickable(true);
                honeyPayMainUI2.f142340n.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(honeyPayMainUI2));
                com.tencent.mm.plugin.wallet_core.ui.d7 d7Var = new com.tencent.mm.plugin.wallet_core.ui.d7(7, new v73.m0(honeyPayMainUI2, z75Var));
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(z75Var.f391774d);
                spannableStringBuilder.setSpan(d7Var, 0, spannableStringBuilder.length(), 18);
                honeyPayMainUI2.f142340n.setText(spannableStringBuilder);
            }
            com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI3 = this.f433739b;
            r45.zw3 zw3Var = this.f433738a.f393169r;
            honeyPayMainUI3.getClass();
            if (zw3Var.f392428o) {
                honeyPayMainUI3.f142342p.setVisibility(0);
                honeyPayMainUI3.f142340n.setVisibility(8);
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) honeyPayMainUI3.f142338i.getLayoutParams();
                layoutParams.bottomMargin = i65.a.b(honeyPayMainUI3, 96);
                honeyPayMainUI3.f142338i.setLayoutParams(layoutParams);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(zw3Var.f392429p.f390555d)) {
                    r45.xw3 xw3Var = zw3Var.f392429p;
                    honeyPayMainUI3.f142345s = xw3Var.f390556e;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(xw3Var.f390555d);
                    int length = sb6.length();
                    sb6.append(zw3Var.f392429p.f390556e);
                    honeyPayMainUI3.f142341o.setText(sb6.toString());
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(zw3Var.f392429p.f390556e)) {
                        com.tencent.mm.wallet_core.ui.r1.w0(honeyPayMainUI3.f142341o, sb6.toString(), length, sb6.length(), new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new v73.n0(honeyPayMainUI3, zw3Var), true), honeyPayMainUI3);
                    }
                }
            } else {
                honeyPayMainUI3.f142342p.setVisibility(8);
                honeyPayMainUI3.f142340n.setVisibility(0);
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) honeyPayMainUI3.f142338i.getLayoutParams();
                layoutParams2.bottomMargin = i65.a.b(honeyPayMainUI3, 64);
                honeyPayMainUI3.f142338i.setLayoutParams(layoutParams2);
            }
            this.f433739b.f142335f.setVisibility(8);
            com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI4 = this.f433739b;
            honeyPayMainUI4.f142261e = com.tencent.mm.R.color.aaw;
            honeyPayMainUI4.setMMTitle("");
        } else {
            this.f433739b.f142337h.setVisibility(8);
            com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI5 = this.f433739b;
            java.util.LinkedList<r45.ax3> linkedList2 = this.f433738a.f393169r.f392422f;
            honeyPayMainUI5.getClass();
            int i19 = 1;
            for (r45.ax3 ax3Var : linkedList2) {
                com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardLayout honeyPayCardLayout = new com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardLayout(honeyPayMainUI5);
                honeyPayCardLayout.setCardRecord(ax3Var);
                honeyPayCardLayout.setOnClickListener(new v73.o0(honeyPayMainUI5, ax3Var));
                honeyPayMainUI5.f142339m.addView(honeyPayCardLayout, i19);
                honeyPayMainUI5.f142344r.add(honeyPayCardLayout);
                if (i19 == 1) {
                    honeyPayCardLayout.sendAccessibilityEvent(8);
                }
                i19++;
            }
            com.tencent.mars.xlog.Log.i(this.f433739b.f142260d, "show open card: %s", java.lang.Boolean.valueOf(this.f433738a.f393169r.f392425i));
            if (this.f433738a.f393169r.f392425i) {
                this.f433739b.f142335f.setVisibility(0);
            } else {
                this.f433739b.f142335f.setVisibility(8);
            }
            com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI6 = this.f433739b;
            honeyPayMainUI6.f142261e = com.tencent.mm.R.color.f479234tm;
            honeyPayMainUI6.setMMTitle(com.tencent.mm.R.string.f492288fx5);
        }
        com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI honeyPayMainUI7 = this.f433739b;
        r45.tw4 tw4Var = this.f433738a.f393169r.f392427n;
        if (tw4Var != null) {
            com.tencent.mm.wallet_core.ui.WcPayBannerView wcPayBannerView = (com.tencent.mm.wallet_core.ui.WcPayBannerView) honeyPayMainUI7.findViewById(com.tencent.mm.R.id.pga);
            wcPayBannerView.setBannerData(tw4Var);
            wcPayBannerView.setBgColor(honeyPayMainUI7.getResources().getColor(com.tencent.mm.R.color.f478526a7));
            wcPayBannerView.setTextColor(honeyPayMainUI7.getResources().getColor(com.tencent.mm.R.color.f478553an));
        } else {
            honeyPayMainUI7.getClass();
        }
        this.f433739b.U6();
        this.f433739b.findViewById(com.tencent.mm.R.id.h4k).setBackgroundResource(this.f433739b.f142261e);
        u73.h.h(this.f433739b, this.f433738a.f393169r.f392424h, null, 0, null);
        android.view.View findViewById = this.f433739b.findViewById(com.tencent.mm.R.id.h4_);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI$5", "onCallback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI$5", "onCallback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(875L, 0L, 1L);
    }
}
