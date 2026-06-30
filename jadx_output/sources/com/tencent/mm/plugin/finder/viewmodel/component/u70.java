package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class u70 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.plugin.finder.view.ka {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f136104d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f136105e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f136106f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136104d = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.r70.f135775d);
        this.f136105e = new java.util.HashMap();
        this.f136106f = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.s70.f135868d);
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void G3(int i17, int i18, int i19, int i27) {
    }

    public final void O6(int i17) {
        pf5.u uVar = pf5.u.f353936a;
        long integer = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).S6().getInteger(30) * 1000;
        boolean R6 = ((ey2.t0) ((jz5.n) this.f136106f).getValue()).R6(i17);
        com.tencent.mars.xlog.Log.i("FinderTabPreloadUIC", "startPreload: delayTimeSec = " + integer + ", tabType = " + i17 + " isAutoRefresh = " + R6);
        if (integer <= 0) {
            return;
        }
        if (R6) {
            com.tencent.mm.plugin.finder.viewmodel.component.t70 t70Var = new com.tencent.mm.plugin.finder.viewmodel.component.t70(this, i17);
            this.f136105e.put(java.lang.Integer.valueOf(i17), t70Var);
            ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f136104d).getValue()).postDelayed(t70Var, integer);
        }
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) uVar.c(getActivity()).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).f133575o;
        if (copyOnWriteArraySet.contains(this)) {
            return;
        }
        copyOnWriteArraySet.add(this);
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void l(int i17, int i18, int i19, int i27) {
        java.lang.Runnable runnable = (java.lang.Runnable) this.f136105e.remove(java.lang.Integer.valueOf(i27));
        if (runnable != null) {
            com.tencent.mars.xlog.Log.i("FinderTabPreloadUIC", "onFragmentChange: tabType = " + i27 + ", remove inside preload by fragment visible");
            ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f136104d).getValue()).removeCallbacks(runnable);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.util.HashMap hashMap = this.f136105e;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f136104d).getValue()).removeCallbacks((java.lang.Runnable) ((java.util.Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127947t7).getValue()).r()).booleanValue()) {
            return;
        }
        for (bs2.n1 n1Var : ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).f122543e) {
            bs2.b0 b0Var = n1Var.f23925s;
            if (b0Var.f23806b != null && b0Var.f23807c == bs2.h0.f23852o) {
                n1Var.e(true, "clearAllInside");
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void z(boolean z17, int i17, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
