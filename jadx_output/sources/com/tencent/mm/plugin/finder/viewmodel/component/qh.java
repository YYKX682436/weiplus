package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class qh extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: m, reason: collision with root package name */
    public static r45.ax2 f135707m;

    /* renamed from: n, reason: collision with root package name */
    public static long f135708n;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f135709d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f135710e;

    /* renamed from: f, reason: collision with root package name */
    public final int f135711f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f135712g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f135713h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f135714i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f135709d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ph(this));
        this.f135710e = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.nh.f135332d);
        this.f135711f = 4;
    }

    public final android.view.View O6() {
        return (android.view.View) this.f135709d.getValue();
    }

    public final void P6() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USREINFO_FINDER_SLIDE_LEFT_TIPS_COUNT_INT_SYNC;
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(c17.r(u3Var, 0) + 1));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).f133575o.add(new com.tencent.mm.plugin.finder.viewmodel.component.mh(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        android.view.ViewStub viewStub = (android.view.ViewStub) findViewById(com.tencent.mm.R.id.f484969g35);
        if (viewStub != null) {
            viewStub.inflate();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        f135707m = null;
        android.view.View O6 = O6();
        if (O6 != null && O6.getVisibility() == 0 && this.f135712g) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(O6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC", "onDestroy", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            O6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(O6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFriendsLeftSlideGuideUIC", "onDestroy", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            P6();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135709d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ph(this));
        this.f135710e = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.nh.f135332d);
        this.f135711f = 4;
    }
}
