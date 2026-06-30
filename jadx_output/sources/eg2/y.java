package eg2;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg2.n f252646d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(eg2.n nVar) {
        super(1);
        this.f252646d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView;
        java.lang.String localPath = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(localPath, "localPath");
        eg2.n nVar = this.f252646d;
        nVar.getClass();
        nVar.f252593n = localPath;
        nVar.f252595p = true;
        com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView2 = nVar.f252590h;
        if (finderLiveHDCheckboxView2 != null) {
            finderLiveHDCheckboxView2.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.live.cover.FinderLiveHDCheckboxView finderLiveHDCheckboxView3 = nVar.f252590h;
        if (finderLiveHDCheckboxView3 != null) {
            finderLiveHDCheckboxView3.setRedDotVisible(nVar.f252596q);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDCheckboxPlugin", "showHDOption: localPath=" + localPath + ", showHdRedDot=" + nVar.f252596q);
        te2.m3.f418224a.a(te2.j3.f418133f, nVar.f252597r == 2 ? te2.l3.f418201e : te2.l3.f418200d, 0L);
        com.tencent.mm.plugin.finder.live.widget.sl slVar = nVar.f252591i;
        if (!(slVar != null && slVar.isShowing()) && (finderLiveHDCheckboxView = nVar.f252590h) != null) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COVER_ENHANCE_GUIDE_CNT_INT_SYNC;
            int r17 = c17.r(u3Var, 0);
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3787j8).getValue()).r()).intValue();
            if (r17 >= intValue) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDCheckboxPlugin", "showEnhanceBubble: skip, guideCnt=" + r17 + " >= guideLimit=" + intValue);
            } else {
                te2.k3 k3Var = te2.k3.f418162e;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 3);
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c18;
                ml2.c1 c1Var = ml2.c1.f327325e;
                zy2.zb.j5(zbVar, 75L, jSONObject.toString(), null, 4, null);
                int i17 = r17 + 1;
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(i17));
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderCoverHDCheckboxPlugin", "showEnhanceBubble: guideCnt=" + i17 + '/' + intValue);
                android.content.Context context = nVar.f252545e.getContext();
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
                int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
                int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.ami);
                int i18 = context.getResources().getDisplayMetrics().widthPixels;
                com.tencent.mm.plugin.finder.live.widget.sl slVar2 = new com.tencent.mm.plugin.finder.live.widget.sl(context);
                java.lang.String string = context.getString(com.tencent.mm.R.string.orw);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                slVar2.c(string);
                slVar2.f119808l = com.tencent.mm.plugin.finder.live.widget.kl.f118844d;
                slVar2.f119811o = true;
                slVar2.f119812p = dimensionPixelSize3;
                android.widget.TextView textView = slVar2.f119798b;
                textView.setMaxWidth((i18 - dimensionPixelSize3) - dimensionPixelSize4);
                slVar2.f119800d = finderLiveHDCheckboxView;
                slVar2.setOutsideTouchable(true);
                slVar2.setFocusable(true);
                textView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
                slVar2.f119805i = new eg2.k(nVar);
                slVar2.f119804h = new eg2.l(nVar);
                slVar2.b();
                slVar2.d(nVar.f252592m);
                nVar.f252591i = slVar2;
            }
        }
        return jz5.f0.f302826a;
    }
}
