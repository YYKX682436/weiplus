package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class n4 extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f116498h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f116499i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f116500m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f116501n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f116502o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f116503p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f116504q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f116505r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f116506s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f116507t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f116508u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.ve f116509v;

    /* renamed from: w, reason: collision with root package name */
    public int f116510w;

    /* renamed from: x, reason: collision with root package name */
    public int f116511x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.p f116512y;

    /* renamed from: z, reason: collision with root package name */
    public yz5.a f116513z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(android.content.Context context) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.f116510w = 1;
        this.f116511x = 1;
    }

    public final void A(boolean z17) {
        if (!z17) {
            android.view.View view = this.f116506s;
            if (view == null) {
                kotlin.jvm.internal.o.o("superFansOnlyTick");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansOnly", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansOnly", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f116510w = 2;
        android.view.View view2 = this.f116506s;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("superFansOnlyTick");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansOnly", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansOnly", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z(false);
        y(false);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.dir;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.content.Context context = this.f118381d;
        int a17 = i65.a.a(context, 16.0f);
        rootView.setPadding(a17, a17, a17, i65.a.a(context, 64.0f));
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.fcu);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f116498h = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.fcv);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f116499i = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.qpq);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f116500m = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.qps);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f116501n = findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.qpp);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f116502o = findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.tencent.mm.R.id.f486820qp5);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f116503p = findViewById6;
        android.view.View findViewById7 = rootView.findViewById(com.tencent.mm.R.id.qp7);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f116504q = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = rootView.findViewById(com.tencent.mm.R.id.f487183qq4);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f116505r = findViewById8;
        android.view.View findViewById9 = rootView.findViewById(com.tencent.mm.R.id.f487184qq5);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f116506s = findViewById9;
        android.view.View findViewById10 = rootView.findViewById(com.tencent.mm.R.id.aa8);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f116507t = findViewById10;
        android.view.View findViewById11 = rootView.findViewById(com.tencent.mm.R.id.c9z);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f116508u = (android.widget.TextView) findViewById11;
        android.view.View view = this.f116498h;
        if (view == null) {
            kotlin.jvm.internal.o.o("allFansGroup");
            throw null;
        }
        view.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.g4(this));
        android.view.View view2 = this.f116500m;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("superFansAndLevelGroup");
            throw null;
        }
        view2.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.h4(this));
        android.view.View view3 = this.f116505r;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("superFansOnlyGroup");
            throw null;
        }
        view3.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.i4(this));
        android.widget.TextView textView = this.f116508u;
        if (textView == null) {
            kotlin.jvm.internal.o.o("confirmBtn");
            throw null;
        }
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.j4(this));
        android.view.View view4 = this.f116507t;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("backBtn");
            throw null;
        }
        view4.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.k4(this));
        android.view.View view5 = this.f116503p;
        if (view5 != null) {
            view5.setOnClickListener(new com.tencent.mm.plugin.finder.live.view.l4(this));
        } else {
            kotlin.jvm.internal.o.o("selectLevelGroup");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        yz5.a aVar = this.f116513z;
        if (aVar != null) {
            aVar.invoke();
        }
        super.t();
    }

    public final void y(boolean z17) {
        if (!z17) {
            android.view.View view = this.f116499i;
            if (view == null) {
                kotlin.jvm.internal.o.o("allFansTick");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectAllFans", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectAllFans", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f116510w = 1;
        android.view.View view2 = this.f116499i;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("allFansTick");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectAllFans", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectAllFans", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z(false);
        A(false);
    }

    public final void z(boolean z17) {
        if (!z17) {
            android.view.View view = this.f116501n;
            if (view == null) {
                kotlin.jvm.internal.o.o("superFansAndLevelTick");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f116502o;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("superFansAndLevelArrow");
                throw null;
            }
            view2.setRotation(-90.0f);
            android.view.View view3 = this.f116503p;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("selectLevelGroup");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        this.f116510w = 0;
        android.view.View view4 = this.f116501n;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("superFansAndLevelTick");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f116502o;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("superFansAndLevelArrow");
            throw null;
        }
        view5.setRotation(90.0f);
        android.view.View view6 = this.f116503p;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("selectLevelGroup");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/view/FinderLiveFansClubAnnouncementVisibilityPanel", "selectSuperFansAndLevel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f116504q;
        if (textView == null) {
            kotlin.jvm.internal.o.o("selectedLevelDesc");
            throw null;
        }
        textView.setText(this.f116511x + "级及以上");
        y(false);
        A(false);
    }
}
