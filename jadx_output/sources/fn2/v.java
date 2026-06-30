package fn2;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.b0 f264418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(fn2.b0 b0Var) {
        super(0);
        this.f264418d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fn2.b0 b0Var = this.f264418d;
        com.google.android.material.tabs.TabLayout tabLayout = b0Var.f264216h;
        if (tabLayout == null) {
            kotlin.jvm.internal.o.o("tabLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(tabLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        tabLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(tabLayout, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.viewpager.widget.ViewPager viewPager = b0Var.f264217i;
        if (viewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(viewPager, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewPager.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(viewPager, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongTabRequest", "switchToSearchMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
