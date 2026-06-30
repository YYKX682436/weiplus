package rf2;

/* loaded from: classes10.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f394713d;

    /* renamed from: e, reason: collision with root package name */
    public final df2.ln f394714e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f394715f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f394716g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f394717h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f394718i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f394719m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f394720n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f394721o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f394722p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f394723q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f394724r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f394725s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f394726t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f394727u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f394728v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f394729w;

    public f(android.view.View root, df2.ln controller) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f394713d = root;
        this.f394714e = controller;
        this.f394715f = controller.f230676m;
        this.f394729w = jz5.h.b(rf2.b.f394658d);
    }

    public final java.util.ArrayList a() {
        return (java.util.ArrayList) ((jz5.n) this.f394729w).getValue();
    }

    public final void b() {
        android.view.View view = this.f394717h;
        android.widget.TextView textView = null;
        if (view == null) {
            view = (android.view.ViewGroup) this.f394713d.findViewById(com.tencent.mm.R.id.iso);
            if (view != null) {
                view.setOnClickListener(this);
            } else {
                view = null;
            }
        }
        this.f394717h = view;
        android.view.View view2 = this.f394718i;
        if (view2 == null) {
            if (view == null || (view2 = view.findViewById(com.tencent.mm.R.id.p8z)) == null) {
                view2 = null;
            } else {
                view2.setOnClickListener(this);
            }
        }
        this.f394718i = view2;
        android.widget.TextView textView2 = this.f394719m;
        if (textView2 == null) {
            android.view.View view3 = this.f394717h;
            if (view3 == null || (textView2 = (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.f487632p92)) == null) {
                textView2 = null;
            } else {
                d92.f fVar = d92.f.f227470a;
                android.content.Context context = textView2.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                d92.f.a(fVar, context, textView2, 17.0f, 0.0f, 8, null);
            }
        }
        this.f394719m = textView2;
        android.widget.TextView textView3 = this.f394720n;
        if (textView3 == null) {
            android.view.View view4 = this.f394717h;
            textView3 = view4 != null ? (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.p_1) : null;
        }
        this.f394720n = textView3;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f394721o;
        if (wxRecyclerView == null) {
            android.view.View view5 = this.f394717h;
            if (view5 == null || (wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) view5.findViewById(com.tencent.mm.R.id.f483715bu2)) == null) {
                wxRecyclerView = null;
            } else if (wxRecyclerView.getItemDecorationCount() <= 0) {
                wxRecyclerView.N(new rf2.c(this));
            }
        }
        this.f394721o = wxRecyclerView;
        android.view.View view6 = this.f394722p;
        if (view6 == null) {
            android.view.View view7 = this.f394717h;
            view6 = view7 != null ? view7.findViewById(com.tencent.mm.R.id.p_5) : null;
        }
        this.f394722p = view6;
        android.widget.TextView textView4 = this.f394723q;
        if (textView4 == null) {
            android.view.View view8 = this.f394717h;
            textView4 = view8 != null ? (android.widget.TextView) view8.findViewById(com.tencent.mm.R.id.p_4) : null;
        }
        this.f394723q = textView4;
        android.widget.TextView textView5 = this.f394724r;
        if (textView5 == null) {
            android.view.View view9 = this.f394717h;
            textView5 = view9 != null ? (android.widget.TextView) view9.findViewById(com.tencent.mm.R.id.f483070vr) : null;
        }
        this.f394724r = textView5;
        android.view.View view10 = this.f394725s;
        if (view10 == null) {
            android.view.View view11 = this.f394717h;
            view10 = view11 != null ? view11.findViewById(com.tencent.mm.R.id.buc) : null;
        }
        this.f394725s = view10;
        android.widget.TextView textView6 = this.f394726t;
        if (textView6 == null) {
            android.view.View view12 = this.f394717h;
            textView6 = view12 != null ? (android.widget.TextView) view12.findViewById(com.tencent.mm.R.id.ouh) : null;
        }
        this.f394726t = textView6;
        android.widget.TextView textView7 = this.f394728v;
        if (textView7 == null) {
            android.view.View view13 = this.f394717h;
            textView7 = view13 != null ? (android.widget.TextView) view13.findViewById(com.tencent.mm.R.id.f487630p90) : null;
        }
        this.f394728v = textView7;
        android.widget.TextView textView8 = this.f394727u;
        if (textView8 == null) {
            android.view.View view14 = this.f394717h;
            if (view14 != null) {
                textView = (android.widget.TextView) view14.findViewById(com.tencent.mm.R.id.f487631p91);
            }
        } else {
            textView = textView8;
        }
        this.f394727u = textView;
    }

    public final void c(int i17) {
        boolean E = zl2.q4.f473933a.E();
        java.lang.String str = this.f394715f;
        if (E) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVisible:");
            sb6.append(i17);
            sb6.append(",voteDescContainer visibility:");
            android.view.View view = this.f394717h;
            sb6.append(view != null ? java.lang.Integer.valueOf(view.getVisibility()) : null);
            com.tencent.mm.sdk.platformtools.Log.c(str, sb6.toString(), new java.lang.Object[0]);
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setVisible:");
            sb7.append(i17);
            sb7.append(",voteDescContainer visibility:");
            android.view.View view2 = this.f394717h;
            sb7.append(view2 != null ? java.lang.Integer.valueOf(view2.getVisibility()) : null);
            com.tencent.mars.xlog.Log.i(str, sb7.toString());
        }
        if (this.f394717h == null) {
            b();
        }
        android.view.View view3 = this.f394717h;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.p8z) {
            com.tencent.mm.plugin.finder.live.util.y.o(this.f394714e, null, null, new rf2.e(this, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
