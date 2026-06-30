package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class MallWalletSectionCellView extends android.widget.LinearLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final int f148298v = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f148299d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f148300e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f148301f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f148302g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f148303h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f148304i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f148305m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f148306n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f148307o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f148308p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f148309q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.ViewGroup f148310r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f148311s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView f148312t;

    /* renamed from: u, reason: collision with root package name */
    public r45.bm5 f148313u;

    public MallWalletSectionCellView(android.content.Context context) {
        super(context);
        d(context);
    }

    public static void a(com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView mallWalletSectionCellView, java.lang.String str) {
        mallWalletSectionCellView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletSectionCellView", "clear reddot: %s", str);
        org.json.JSONObject redDotConfig = mallWalletSectionCellView.getRedDotConfig();
        if (redDotConfig == null) {
            return;
        }
        redDotConfig.remove(str);
        redDotConfig.remove(java.lang.String.format("%s_expiretime", str));
        redDotConfig.remove(java.lang.String.format("%s_wording", str));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, redDotConfig.toString());
    }

    private org.json.JSONObject getRedDotConfig() {
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, "");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                return new org.json.JSONObject(str);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallWalletSectionCellView", e17, "", new java.lang.Object[0]);
            }
        }
        return null;
    }

    public final void b() {
        this.f148307o.setVisibility(8);
        this.f148305m.setVisibility(8);
        this.f148306n.setVisibility(8);
        this.f148308p.setVisibility(8);
        r45.bm5 bm5Var = this.f148313u;
        if (bm5Var == null || bm5Var.f370872d != 4) {
            return;
        }
        this.f148302g.setText("");
    }

    public void c(r45.xj6 xj6Var, org.json.JSONObject jSONObject, boolean z17, java.lang.String str, boolean z18, l81.e1 e1Var, com.tencent.mm.plugin.wallet_core.utils.y1 y1Var) {
        r45.rl6 rl6Var;
        java.util.LinkedList linkedList;
        r45.hl6 hl6Var;
        r45.cg0 cg0Var;
        com.tencent.mm.plugin.wallet_core.utils.z1.g(this.f148300e, xj6Var.f390166d, -1, 0, 0, true, 1.0f);
        r45.bz3 bz3Var = xj6Var.f390169g;
        if (bz3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(bz3Var.f371172d)) {
            this.f148303h.setImageResource(com.tencent.mm.R.raw.icons_outlined_arrow);
            this.f148303h.setColorFilter(getContext().getResources().getColor(com.tencent.mm.R.color.f478694eb), android.graphics.PorterDuff.Mode.SRC_ATOP);
        } else {
            com.tencent.mm.plugin.wallet_core.utils.z1.g(this.f148303h, xj6Var.f390169g, com.tencent.mm.R.drawable.ch7, 0, 0, true, 1.0f);
        }
        java.util.LinkedList linkedList2 = xj6Var.f390167e;
        if (linkedList2 == null || linkedList2.size() <= 0) {
            this.f148301f.setText("");
        } else {
            com.tencent.mm.plugin.wallet_core.utils.z1.j(this.f148301f, (r45.rl6) linkedList2.get(0));
        }
        if (xj6Var.f390174o != null) {
            if (j65.e.b() && (rl6Var = xj6Var.f390174o.f390401e) != null && (linkedList = rl6Var.f384987d) != null && linkedList.size() > 0 && (cg0Var = (hl6Var = (r45.hl6) xj6Var.f390174o.f390401e.f384987d.get(0)).f376278n) != null) {
                cg0Var.f371538d = 4292966169L;
                hl6Var.f376271d = 4292966169L;
            }
            com.tencent.mm.plugin.wallet_core.utils.z1.i(this.f148311s, xj6Var.f390174o);
            this.f148311s.setVisibility(0);
        } else {
            this.f148311s.setVisibility(8);
        }
        java.util.LinkedList linkedList3 = xj6Var.f390168f;
        if (linkedList3 == null || linkedList3.size() <= 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f148302g.setText("");
                this.f148312t.b();
                this.f148302g.setVisibility(0);
            } else {
                this.f148312t.e("", !z18);
                this.f148312t.setVisibility(0);
                this.f148302g.setVisibility(8);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.wallet_core.utils.z1.j(this.f148302g, (r45.rl6) linkedList3.get(0));
            this.f148312t.b();
            this.f148302g.setVisibility(0);
        } else {
            this.f148312t.e(str, !z18);
            this.f148312t.setVisibility(0);
            this.f148302g.setVisibility(8);
        }
        if (linkedList3 == null || linkedList3.size() <= 1) {
            this.f148304i.setVisibility(8);
        } else {
            com.tencent.mm.plugin.wallet_core.utils.z1.j(this.f148304i, (r45.rl6) linkedList3.get(1));
        }
        b();
        r45.bm5 bm5Var = xj6Var.f390170h;
        if (bm5Var != null && jSONObject != null) {
            this.f148313u = bm5Var;
            boolean z19 = jSONObject.optInt(bm5Var.f370873e, 0) == 1;
            long optLong = jSONObject.optLong(java.lang.String.format("%s_expiretime", xj6Var.f390170h.f370873e), 0L);
            boolean z27 = (optLong <= 0 || java.lang.System.currentTimeMillis() <= optLong) ? z19 : false;
            com.tencent.mars.xlog.Log.i("MicroMsg.MallWalletSectionCellView", "red dot expired: %s, %s, %s, %s, %s", xj6Var.f390170h.f370873e, java.lang.Long.valueOf(optLong), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27), java.lang.Integer.valueOf(xj6Var.f390170h.f370872d));
            if (z19 && !z27) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22735, xj6Var.f390170h.f370873e, 2, "");
            }
            if (z27) {
                int i17 = xj6Var.f390170h.f370872d;
                if (i17 == 1) {
                    this.f148305m.setVisibility(0);
                } else if (i17 == 2) {
                    this.f148307o.setVisibility(0);
                } else if (i17 == 3) {
                    this.f148308p.setText(com.tencent.mm.plugin.wallet_core.utils.z1.e(getContext(), xj6Var.f390170h.f370874f, null).toString());
                    this.f148308p.setContentDescription(getContext().getString(com.tencent.mm.R.string.f489805c7, this.f148308p.getText()));
                    this.f148308p.setVisibility(0);
                } else if (i17 == 4) {
                    this.f148306n.setVisibility(0);
                    this.f148302g.setVisibility(0);
                    com.tencent.mm.plugin.wallet_core.utils.z1.j(this.f148302g, xj6Var.f390170h.f370874f);
                    this.f148312t.b();
                } else {
                    z27 = false;
                }
                if (z27) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22735, xj6Var.f390170h.f370873e, 1, "");
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22735, xj6Var.f390170h.f370873e, 0, "Red Dot Type returned by server is invalid.");
                }
            }
        }
        r45.t35 t35Var = xj6Var.f390172m;
        if (t35Var != null) {
            float f17 = t35Var.f386096f;
            int i18 = f148298v;
            int b17 = f17 > 0.0f ? i65.a.b(getContext(), (int) f17) : i18;
            float f18 = t35Var.f386097g;
            int b18 = f18 > 0.0f ? i65.a.b(getContext(), (int) f18) : i18;
            float f19 = t35Var.f386094d;
            int b19 = f19 > 0.0f ? i65.a.b(getContext(), (int) f19) : i18;
            float f27 = t35Var.f386095e;
            if (f27 > 0.0f) {
                i18 = i65.a.b(getContext(), (int) f27);
            }
            this.f148310r.setPadding(b17, b19, b18, i18);
        }
        if (z17) {
            this.f148301f.post(new com.tencent.mm.plugin.mall.ui.o2(this));
        } else {
            android.view.View view = this.f148309q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallWalletSectionCellView", "fillCell", "(Lcom/tencent/mm/protocal/protobuf/TableCellViewData;Lorg/json/JSONObject;ZLjava/lang/String;ZLcom/tencent/mm/plugin/appbrand/api/WeAppOpenUICallback;Lcom/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$RouteCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mall/ui/MallWalletSectionCellView", "fillCell", "(Lcom/tencent/mm/protocal/protobuf/TableCellViewData;Lorg/json/JSONObject;ZLjava/lang/String;ZLcom/tencent/mm/plugin/appbrand/api/WeAppOpenUICallback;Lcom/tencent/mm/plugin/wallet_core/utils/WcPayViewEngineRender$RouteCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (xj6Var.f390173n != null) {
            setOnClickListener(new com.tencent.mm.plugin.mall.ui.p2(this, xj6Var, e1Var, y1Var));
        }
    }

    public final void d(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bwu, (android.view.ViewGroup) this, true);
        this.f148299d = inflate;
        this.f148300e = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.k2i);
        this.f148301f = (android.widget.TextView) this.f148299d.findViewById(com.tencent.mm.R.id.k2s);
        this.f148302g = (android.widget.TextView) this.f148299d.findViewById(com.tencent.mm.R.id.k2f);
        this.f148303h = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.f148299d.findViewById(com.tencent.mm.R.id.k2q);
        this.f148304i = (android.widget.TextView) this.f148299d.findViewById(com.tencent.mm.R.id.k2r);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f148299d.findViewById(com.tencent.mm.R.id.k2m);
        this.f148305m = imageView;
        imageView.setContentDescription(context.getString(com.tencent.mm.R.string.f489804c6));
        this.f148306n = (android.widget.ImageView) this.f148299d.findViewById(com.tencent.mm.R.id.k2p);
        android.widget.TextView textView = (android.widget.TextView) this.f148299d.findViewById(com.tencent.mm.R.id.k2k);
        this.f148307o = textView;
        textView.setContentDescription(context.getString(com.tencent.mm.R.string.f489804c6));
        this.f148308p = (android.widget.TextView) this.f148299d.findViewById(com.tencent.mm.R.id.k2l);
        this.f148309q = this.f148299d.findViewById(com.tencent.mm.R.id.k2g);
        this.f148310r = (android.view.ViewGroup) this.f148299d.findViewById(com.tencent.mm.R.id.k2j);
        this.f148311s = (android.widget.TextView) this.f148299d.findViewById(com.tencent.mm.R.id.k2h);
        this.f148312t = (com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView) this.f148299d.findViewById(com.tencent.mm.R.id.k2e);
        this.f148312t.setLoadingPb((android.widget.ProgressBar) this.f148299d.findViewById(com.tencent.mm.R.id.pcr));
        setOrientation(1);
        setBackgroundResource(com.tencent.mm.R.drawable.aj7);
    }

    public MallWalletSectionCellView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context);
    }

    public MallWalletSectionCellView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        d(context);
    }
}
