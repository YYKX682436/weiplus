package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class a70 implements eg2.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.u70 f117740a;

    public a70(com.tencent.mm.plugin.finder.live.widget.u70 u70Var) {
        this.f117740a = u70Var;
    }

    public void a() {
        android.view.View S6;
        com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "cover needs enhance");
        com.tencent.mm.plugin.finder.live.widget.u70 u70Var = this.f117740a;
        if (u70Var.e7()) {
            com.tencent.mm.plugin.finder.live.widget.sl slVar = u70Var.f119955n;
            if ((slVar != null && slVar.isShowing()) || (S6 = u70Var.S6(com.tencent.mm.R.id.f484765fg5)) == null) {
                return;
            }
            if (!S6.isShown()) {
                com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "showEnhanceBubble: skip, coverLayout is not visible");
                return;
            }
            if (u70Var.f119957p) {
                com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "showEnhanceBubble: skip, bubble already shown");
                return;
            }
            java.lang.String d76 = u70Var.d7();
            eg2.s0 s0Var = u70Var.f119956o;
            if (!kotlin.jvm.internal.o.b(d76, s0Var != null ? s0Var.f252632i : null)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showEnhanceBubble: skip, cover url mismatch, current=");
                sb6.append(d76);
                sb6.append(", checking=");
                eg2.s0 s0Var2 = u70Var.f119956o;
                sb6.append(s0Var2 != null ? s0Var2.f252632i : null);
                com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", sb6.toString());
                return;
            }
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_PREVIOUS_COVER_ENHANCE_GUIDE_CNT_INT_SYNC;
            int r17 = c17.r(u3Var, 0);
            ae2.in inVar = ae2.in.f3688a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3797k8).getValue()).r()).intValue();
            if (r17 >= intValue) {
                com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "showEnhanceBubble: skip, guideCnt=" + r17 + " >= guideLimit=" + intValue);
                return;
            }
            u70Var.f119957p = true;
            u70Var.h7(te2.k3.f418162e);
            int i17 = r17 + 1;
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(i17));
            com.tencent.mars.xlog.Log.i("Finder.FinderStartLivePostCoverWidget", "showEnhanceBubble: guideCnt=" + i17 + '/' + intValue);
            android.content.res.Resources resources = u70Var.O6().getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
            int i18 = u70Var.O6().getResources().getDisplayMetrics().widthPixels;
            int dimensionPixelSize3 = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479733dq);
            com.tencent.mm.plugin.finder.live.widget.sl slVar2 = new com.tencent.mm.plugin.finder.live.widget.sl(u70Var.O6());
            java.lang.String string = u70Var.O6().getString(com.tencent.mm.R.string.orw);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            slVar2.c(string);
            slVar2.f119808l = com.tencent.mm.plugin.finder.live.widget.kl.f118845e;
            slVar2.f119811o = true;
            int i19 = i18 - (dimensionPixelSize3 * 2);
            android.widget.TextView textView = slVar2.f119798b;
            textView.setMaxWidth(i19);
            slVar2.f119800d = S6;
            slVar2.setOutsideTouchable(true);
            slVar2.setFocusable(true);
            textView.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
            slVar2.f119805i = new com.tencent.mm.plugin.finder.live.widget.s70(u70Var);
            slVar2.f119804h = new com.tencent.mm.plugin.finder.live.widget.t70(u70Var);
            slVar2.b();
            slVar2.d(u70Var.f119958q);
            u70Var.f119955n = slVar2;
        }
    }
}
