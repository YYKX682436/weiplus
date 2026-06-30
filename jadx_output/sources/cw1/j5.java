package cw1;

/* loaded from: classes5.dex */
public final class j5 implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.CustomViewPager f223041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.tabs.TabLayout f223042e;

    public j5(com.tencent.mm.ui.base.CustomViewPager customViewPager, com.google.android.material.tabs.TabLayout tabLayout) {
        this.f223041d = customViewPager;
        this.f223042e = tabLayout;
    }

    @Override // oa.c
    public void h0(oa.i tab) {
        kotlin.jvm.internal.o.g(tab, "tab");
    }

    @Override // oa.c
    public void l4(oa.i tab) {
        kotlin.jvm.internal.o.g(tab, "tab");
        android.view.View childAt = this.f223042e.getChildAt(0);
        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View childAt2 = ((android.view.ViewGroup) childAt).getChildAt(tab.f343782e);
        kotlin.jvm.internal.o.e(childAt2, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.view.View childAt3 = ((android.widget.LinearLayout) childAt2).getChildAt(1);
        kotlin.jvm.internal.o.e(childAt3, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) childAt3;
        textView.setTypeface(textView.getTypeface(), 0);
    }

    @Override // oa.c
    public void u1(oa.i tab) {
        kotlin.jvm.internal.o.g(tab, "tab");
        this.f223041d.setCurrentItem(tab.f343782e, true);
        android.view.View childAt = this.f223042e.getChildAt(0);
        kotlin.jvm.internal.o.e(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View childAt2 = ((android.view.ViewGroup) childAt).getChildAt(tab.f343782e);
        kotlin.jvm.internal.o.e(childAt2, "null cannot be cast to non-null type android.widget.LinearLayout");
        android.view.View childAt3 = ((android.widget.LinearLayout) childAt2).getChildAt(1);
        kotlin.jvm.internal.o.e(childAt3, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) childAt3;
        textView.setTypeface(textView.getTypeface(), 1);
    }
}
