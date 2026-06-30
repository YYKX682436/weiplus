package te2;

/* loaded from: classes14.dex */
public final class a3 implements te2.c2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f417856d;

    /* renamed from: e, reason: collision with root package name */
    public final qo0.c f417857e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f417858f;

    /* renamed from: g, reason: collision with root package name */
    public final te2.b2 f417859g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f417860h;

    /* renamed from: i, reason: collision with root package name */
    public final int f417861i;

    /* renamed from: m, reason: collision with root package name */
    public final int f417862m;

    /* renamed from: n, reason: collision with root package name */
    public final int f417863n;

    /* renamed from: o, reason: collision with root package name */
    public final int f417864o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f417865p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f417866q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f417867r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f417868s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f417869t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f417870u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f417871v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f417872w;

    /* renamed from: x, reason: collision with root package name */
    public final te2.n2 f417873x;

    /* renamed from: y, reason: collision with root package name */
    public int f417874y;

    public a3(android.view.View root, qo0.c statusMonitor, com.tencent.mm.ui.MMActivity activity, te2.b2 b2Var) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f417856d = root;
        this.f417857e = statusMonitor;
        this.f417858f = activity;
        this.f417859g = b2Var;
        this.f417860h = "Finder.FinderLiveCastScreenViewCallback";
        this.f417861i = -1;
        this.f417862m = 1;
        this.f417863n = 2;
        this.f417864o = 3;
        this.f417865p = root.findViewById(com.tencent.mm.R.id.f484591eu4);
        this.f417866q = root.findViewById(com.tencent.mm.R.id.f484589eu2);
        this.f417867r = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.f484590eu3);
        this.f417868s = root.findViewById(com.tencent.mm.R.id.f484587eu0);
        this.f417869t = (androidx.recyclerview.widget.RecyclerView) root.findViewById(com.tencent.mm.R.id.f484588eu1);
        this.f417870u = root.findViewById(com.tencent.mm.R.id.etx);
        this.f417871v = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.etw);
        this.f417872w = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.etv);
        this.f417873x = new te2.n2(this);
        this.f417874y = -1;
    }

    public final int a() {
        return this.f417856d.getContext().getResources().getConfiguration().orientation == 2 ? 1 : 2;
    }

    public final void g(int i17) {
        gk2.e eVar;
        x91.h hVar;
        x91.c cVar;
        if (i17 != this.f417874y) {
            this.f417874y = i17;
            te2.b2 b2Var = this.f417859g;
            if (i17 == 0) {
                android.view.View view = this.f417865p;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f417866q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = this.f417868s;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f417870u;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (b2Var != null) {
                    com.tencent.mm.sdk.platformtools.b4 b4Var = ((te2.l2) b2Var).f418199o;
                    b4Var.d();
                    b4Var.c(0L, 3000L);
                    return;
                }
                return;
            }
            int i18 = this.f417862m;
            android.view.View view5 = this.f417856d;
            if (i17 == i18) {
                android.view.View view6 = this.f417865p;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view7 = this.f417866q;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view8 = this.f417868s;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view9 = this.f417870u;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.text.SpannableString spannableString = new android.text.SpannableString(view5.getContext().getResources().getString(com.tencent.mm.R.string.d8e));
                int L = r26.n0.L(spannableString, "，", 0, false, 6, null);
                if (L != -1 && L > 0 && L < spannableString.length() - 1) {
                    spannableString.setSpan(new te2.z2(), L + 1, spannableString.length(), 33);
                    android.widget.TextView textView = this.f417867r;
                    textView.setText(spannableString);
                    textView.setOnClickListener(new te2.y2(this));
                }
                ((ml2.r0) i95.n0.c(ml2.r0.class)).xj(ml2.n1.f327729n, a());
                return;
            }
            if (i17 == this.f417863n) {
                android.view.View view10 = this.f417865p;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view10, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view11 = this.f417866q;
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(8);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view11, arrayList10.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view12 = this.f417868s;
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                arrayList11.add(0);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(view12, arrayList11.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(view12, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view13 = this.f417870u;
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(8);
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(view13, arrayList12.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (i17 == this.f417864o) {
                android.view.View view14 = this.f417865p;
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList13.add(8);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(view14, arrayList13.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view15 = this.f417866q;
                java.util.ArrayList arrayList14 = new java.util.ArrayList();
                arrayList14.add(8);
                java.util.Collections.reverse(arrayList14);
                yj0.a.d(view15, arrayList14.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                yj0.a.f(view15, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view16 = this.f417868s;
                java.util.ArrayList arrayList15 = new java.util.ArrayList();
                arrayList15.add(8);
                java.util.Collections.reverse(arrayList15);
                yj0.a.d(view16, arrayList15.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view16.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                yj0.a.f(view16, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view17 = this.f417870u;
                java.util.ArrayList arrayList16 = new java.util.ArrayList();
                arrayList16.add(0);
                java.util.Collections.reverse(arrayList16);
                yj0.a.d(view17, arrayList16.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                yj0.a.f(view17, "com/tencent/mm/plugin/finder/live/component/FinderLiveCastScreenViewCallback", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.content.res.Resources resources = view5.getContext().getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = (b2Var == null || (eVar = ((te2.l2) b2Var).f418191d) == null || (hVar = ((je2.i) eVar.a(je2.i.class)).f299235f) == null || (cVar = hVar.f452647a) == null) ? null : cVar.f452639g;
                this.f417871v.setText(resources.getString(com.tencent.mm.R.string.d8c, objArr));
            }
        }
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f417858f;
    }
}
