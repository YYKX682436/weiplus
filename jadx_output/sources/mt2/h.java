package mt2;

/* loaded from: classes2.dex */
public final class h extends com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC {
    public boolean A;

    /* renamed from: v, reason: collision with root package name */
    public final int f331284v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f331285w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f331286x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f331287y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter f331288z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f331284v = getIntent().getIntExtra("request_type", 0);
        this.f331285w = jz5.h.b(new mt2.g(this));
        this.f331286x = jz5.h.b(new mt2.f(this));
        this.f331287y = jz5.h.b(new mt2.e(this));
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public void V6() {
        if (f7().size() <= 1 || this.A) {
            com.tencent.mm.view.HardTouchableLayout h17 = c7().h();
            if (h17 != null) {
                h17.setVisibility(8);
            }
        } else {
            com.tencent.mm.view.HardTouchableLayout h18 = c7().h();
            if (h18 != null) {
                h18.setVisibility(0);
            }
        }
        com.tencent.mm.view.HardTouchableLayout h19 = c7().h();
        boolean z17 = h19 != null && h19.getVisibility() == 0;
        jz5.g gVar = this.f331287y;
        jz5.g gVar2 = this.f331286x;
        if (z17) {
            ((android.widget.TextView) ((jz5.n) gVar2).getValue()).setVisibility(8);
            android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/component/FinderMixSearchTabUIC", "checkTabLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/search/component/FinderMixSearchTabUIC", "checkTabLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        ((android.widget.TextView) ((jz5.n) gVar2).getValue()).setVisibility(0);
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/component/FinderMixSearchTabUIC", "checkTabLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/component/FinderMixSearchTabUIC", "checkTabLayoutVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC
    public com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider W6() {
        return new mt2.a(this);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        androidx.viewpager.widget.ViewPager viewPager = this.f133659h;
        if (viewPager instanceof com.tencent.mm.plugin.finder.view.FinderViewPager) {
            ((com.tencent.mm.plugin.finder.view.FinderViewPager) viewPager).setEnableViewPagerScroll(true);
        }
        V6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f331284v = getIntent().getIntExtra("request_type", 0);
        this.f331285w = jz5.h.b(new mt2.g(this));
        this.f331286x = jz5.h.b(new mt2.f(this));
        this.f331287y = jz5.h.b(new mt2.e(this));
    }
}
