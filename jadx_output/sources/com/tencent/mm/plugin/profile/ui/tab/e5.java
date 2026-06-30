package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class e5 extends androidx.viewpager.widget.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo f154301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f154302e;

    public e5(com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo, kotlin.jvm.internal.h0 h0Var) {
        this.f154301d = contactWidgetTabBizInfo;
        this.f154302e = h0Var;
    }

    @Override // androidx.viewpager.widget.p, androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i17) {
        zy2.hb hbVar;
        com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = this.f154301d;
        com.tencent.mm.plugin.profile.ui.ContactInfoUI activity = contactWidgetTabBizInfo.f154198d;
        gr3.c cVar = gr3.c.f274848a;
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = gr3.c.f274848a.b(activity) + "_tab_" + i17;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gr3.c.f274850c;
        java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(str);
        if (l17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizProfileMonitor", "recordTabSwitchEnd: startTime is null for " + str);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2127L, 20L, java.lang.System.currentTimeMillis() - l17.longValue(), false);
            concurrentHashMap.remove(str);
        }
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout bizProfileTabLayout = contactWidgetTabBizInfo.C;
        if (bizProfileTabLayout == null) {
            kotlin.jvm.internal.o.o("menuTabLayout");
            throw null;
        }
        bizProfileTabLayout.C(i17);
        if (contactWidgetTabBizInfo.f154204l1 == null || this.f154302e.f310123d == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactWidgetTabBizInfo", "bobkw onPageSelected position " + i17);
        com.tencent.mm.plugin.profile.ui.tab.t4 t4Var = contactWidgetTabBizInfo.B;
        if (t4Var == null) {
            kotlin.jvm.internal.o.o("pagerAdapter");
            throw null;
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) kz5.n0.a0(t4Var.f154598i, i17);
        if (fragment != null) {
            if (kotlin.jvm.internal.o.b(fragment, contactWidgetTabBizInfo.f154204l1)) {
                androidx.lifecycle.m1 m1Var = contactWidgetTabBizInfo.f154204l1;
                hbVar = m1Var instanceof zy2.hb ? (zy2.hb) m1Var : null;
                if (hbVar != null) {
                    ((com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment) hbVar).Q0();
                    return;
                }
                return;
            }
            androidx.lifecycle.m1 m1Var2 = contactWidgetTabBizInfo.f154204l1;
            hbVar = m1Var2 instanceof zy2.hb ? (zy2.hb) m1Var2 : null;
            if (hbVar != null) {
                ((com.tencent.mm.plugin.finder.biz.FinderBizProfileFragment) hbVar).P0();
            }
        }
    }
}
