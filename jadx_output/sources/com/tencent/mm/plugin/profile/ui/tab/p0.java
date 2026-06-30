package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public class p0 implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.m0 f154506a;

    public p0(com.tencent.mm.plugin.profile.ui.tab.m0 m0Var) {
        this.f154506a = m0Var;
    }

    @Override // com.google.android.material.appbar.e
    public void a(com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
        com.tencent.mm.plugin.profile.ui.tab.d1 d1Var;
        int totalScrollRange = appBarLayout.getTotalScrollRange();
        int abs = java.lang.Math.abs(i17);
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = this.f154506a;
        if (m0Var.f154459n == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.tab.m0.a(m0Var);
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = m0Var.f154464s;
        s4Var.getClass();
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view = s4Var.f154545a;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
        s4Var.p().getDrawingRect(rect);
        ((android.view.ViewGroup) view).offsetDescendantRectToMyCoords(s4Var.p(), rect);
        if (rect.bottom < com.tencent.mm.ui.bl.a(s4Var.f154553e)) {
            com.tencent.mm.plugin.profile.ui.tab.m0.b(m0Var, false);
        } else {
            com.tencent.mm.plugin.profile.ui.tab.m0.b(m0Var, true);
        }
        int i18 = m0Var.T;
        if (i18 >= totalScrollRange && abs < i18 && (d1Var = m0Var.H) != null) {
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = ((com.tencent.mm.plugin.profile.ui.tab.d5) d1Var).f154274a;
            androidx.viewpager.widget.ViewPager viewPager = contactWidgetTabBizInfo.A;
            if (viewPager == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            int currentItem = viewPager.getCurrentItem();
            androidx.viewpager.widget.ViewPager viewPager2 = contactWidgetTabBizInfo.A;
            if (viewPager2 == null) {
                kotlin.jvm.internal.o.o("viewPager");
                throw null;
            }
            int currentItem2 = viewPager2.getCurrentItem();
            java.util.List list = contactWidgetTabBizInfo.f154222z;
            if (currentItem2 <= ((java.util.ArrayList) list).size() - 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (!kotlin.jvm.internal.o.b((androidx.fragment.app.Fragment) next, ((java.util.ArrayList) list).get(currentItem))) {
                        arrayList.add(next);
                    }
                }
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    androidx.lifecycle.m1 m1Var = (androidx.fragment.app.Fragment) it6.next();
                    zy2.h5 h5Var = m1Var instanceof zy2.h5 ? (zy2.h5) m1Var : null;
                    if (h5Var != null) {
                        h5Var.P();
                    }
                }
            }
        }
        m0Var.T = abs;
    }
}
