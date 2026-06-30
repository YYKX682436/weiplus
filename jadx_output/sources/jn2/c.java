package jn2;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.j f300564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(jn2.j jVar) {
        super(0);
        this.f300564d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jn2.j jVar = this.f300564d;
        com.google.android.material.tabs.TabLayout tabLayout = jVar.f300632J;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(tabLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        tabLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(tabLayout, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanel", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.viewpager.widget.ViewPager viewPager = jVar.K;
        if (viewPager != null) {
            viewPager.setVisibility(8);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("viewPager");
        throw null;
    }
}
