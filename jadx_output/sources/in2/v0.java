package in2;

/* loaded from: classes10.dex */
public final class v0 extends com.tencent.mm.plugin.finder.live.widget.e0 implements android.view.View.OnClickListener {
    public final gk2.e H;
    public final sf2.x I;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.String f292913J;
    public android.widget.TextView K;
    public android.widget.TextView L;
    public com.tencent.mm.view.recyclerview.WxRecyclerView M;
    public android.widget.FrameLayout N;
    public android.view.View P;
    public android.widget.CheckBox Q;
    public android.widget.TextView R;
    public final in2.q0 S;
    public final androidx.recyclerview.widget.g1 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(android.content.Context context, gk2.e liveData, sf2.x controller) {
        super(context, false, null, 0.75f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.H = liveData;
        this.I = controller;
        this.f292913J = "FinderLiveAnchorMusicEditWidget";
        this.S = new in2.q0(liveData);
        this.T = new androidx.recyclerview.widget.g1(new in2.s0(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.an9;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int D() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.K = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.mxa);
        this.L = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.mxe);
        this.M = (com.tencent.mm.view.recyclerview.WxRecyclerView) rootView.findViewById(com.tencent.mm.R.id.mxi);
        this.N = (android.widget.FrameLayout) rootView.findViewById(com.tencent.mm.R.id.mxg);
        this.P = rootView.findViewById(com.tencent.mm.R.id.emt);
        this.Q = (android.widget.CheckBox) rootView.findViewById(com.tencent.mm.R.id.mxb);
        this.R = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.mxd);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.mxj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById);
        ((android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.mxj)).setText(com.tencent.mm.R.string.ojw);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.v5p);
        if (textView != null) {
            textView.setText(com.tencent.mm.R.string.p1s);
        }
        android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.v5q);
        if (textView2 != null) {
            textView2.setText(com.tencent.mm.R.string.p1v);
        }
        android.widget.TextView textView3 = this.K;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        android.widget.TextView textView4 = this.L;
        if (textView4 != null) {
            textView4.setOnClickListener(this);
        }
        android.widget.CheckBox checkBox = this.Q;
        if (checkBox != null) {
            checkBox.setOnClickListener(this);
        }
        android.widget.TextView textView5 = this.R;
        if (textView5 != null) {
            textView5.setOnClickListener(this);
        }
        in2.q0 q0Var = this.S;
        q0Var.f292882h = new in2.r0(this, q0Var);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.M;
        if (wxRecyclerView != null) {
            wxRecyclerView.setAdapter(q0Var);
        }
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this.f118183e));
        }
        if (e0()) {
            return;
        }
        this.T.d(wxRecyclerView);
    }

    public final boolean e0() {
        return ((mm2.c1) this.H.a(mm2.c1.class)).a8();
    }

    public final void f0(boolean z17) {
        if (z17) {
            android.widget.TextView textView = this.R;
            if (textView != null) {
                textView.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_0));
                return;
            }
            return;
        }
        android.widget.TextView textView2 = this.R;
        if (textView2 != null) {
            textView2.setTextColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.FG_2));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        sf2.x xVar = this.I;
        gk2.e eVar = this.H;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.mxa) {
            xVar.r7();
            com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
            te2.d4 d4Var = te2.d4.f417948a;
            boolean a86 = ((mm2.c1) eVar.a(mm2.c1.class)).a8();
            ml2.u2[] u2VarArr = ml2.u2.f328109d;
            d4Var.a(a86, 10, "0", "");
        } else {
            in2.q0 q0Var = this.S;
            if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.mxe) {
                gn2.a aVar = xVar.f407347p;
                if (aVar != null) {
                    aVar.c(false);
                }
                com.tencent.mm.plugin.finder.live.widget.e0.t(this, false, 1, null);
                q0Var.getClass();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = q0Var.f292880f.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((dk2.yg) it.next()).f234393a);
                }
                long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328983m;
                long j18 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
                java.lang.String userName = ((mm2.c1) eVar.a(mm2.c1.class)).f328852o;
                in2.u0 u0Var = new in2.u0(this);
                java.lang.Object context = this.f118183e;
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(userName, "userName");
                pq5.g l17 = new ek2.b3(arrayList2, java.lang.System.currentTimeMillis(), j17, j18, userName, null, 32, null).l();
                l17.K(new xl2.b(u0Var));
                if (context instanceof com.tencent.mm.ui.MMActivity) {
                    l17.f((im5.b) context);
                }
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.mxb) {
                android.widget.CheckBox checkBox = this.Q;
                if (checkBox != null && checkBox.isChecked()) {
                    java.util.Iterator it6 = q0Var.f292880f.iterator();
                    while (it6.hasNext()) {
                        ((dk2.yg) it6.next()).f234396d = true;
                    }
                    f0(true);
                } else {
                    java.util.Iterator it7 = q0Var.f292880f.iterator();
                    while (it7.hasNext()) {
                        ((dk2.yg) it7.next()).f234396d = false;
                    }
                    f0(false);
                }
                q0Var.notifyDataSetChanged();
            } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.mxd) {
                java.lang.String str = q0Var.f292879e;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.ArrayList arrayList4 = q0Var.f292880f;
                try {
                    try {
                        java.util.Iterator it8 = arrayList4.iterator();
                        kotlin.jvm.internal.o.f(it8, "iterator(...)");
                        boolean z17 = false;
                        while (it8.hasNext()) {
                            java.lang.Object next = it8.next();
                            kotlin.jvm.internal.o.f(next, "next(...)");
                            dk2.yg ygVar = (dk2.yg) next;
                            if (ygVar.f234396d) {
                                it8.remove();
                                arrayList3.add(ygVar);
                                java.lang.String str2 = ygVar.f234393a;
                                dk2.yg ygVar2 = q0Var.f292881g;
                                if (kotlin.jvm.internal.o.b(str2, ygVar2 != null ? ygVar2.f234393a : null)) {
                                    z17 = true;
                                }
                            }
                        }
                        if (z17) {
                            q0Var.f292881g = null;
                        }
                        arrayList4.removeAll(arrayList3);
                        com.tencent.mars.xlog.Log.i(str, "curPlayItem:" + q0Var.f292881g);
                        q0Var.x(arrayList4, "deletesongItems");
                    } catch (java.lang.Exception e17) {
                        hc2.c.a(e17, str + ",deletesongItems:");
                    }
                } catch (java.lang.Throwable unused) {
                }
                q0Var.notifyDataSetChanged();
                f0(false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongEditWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void r() {
        android.widget.CheckBox checkBox = this.Q;
        if (checkBox != null) {
            checkBox.setChecked(false);
        }
        f0(false);
        if (e0()) {
            android.widget.FrameLayout frameLayout = this.N;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else {
            android.widget.FrameLayout frameLayout2 = this.N;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        gk2.e eVar = this.H;
        java.util.Iterator it = ((mm2.m6) eVar.a(mm2.m6.class)).f329241f.f234053b.iterator();
        while (it.hasNext()) {
            ((dk2.yg) it.next()).f234396d = false;
        }
        java.util.List a17 = ((mm2.m6) eVar.a(mm2.m6.class)).f329241f.a();
        dk2.yg c17 = ((mm2.m6) eVar.a(mm2.m6.class)).f329241f.c();
        in2.q0 q0Var = this.S;
        q0Var.getClass();
        java.util.ArrayList arrayList = q0Var.f292880f;
        arrayList.clear();
        arrayList.addAll(a17);
        q0Var.f292881g = c17;
        q0Var.notifyDataSetChanged();
    }
}
