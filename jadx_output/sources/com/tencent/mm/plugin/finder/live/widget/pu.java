package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class pu extends com.tencent.mm.plugin.finder.live.widget.g {
    public android.view.View A;
    public java.lang.String B;
    public com.tencent.mm.plugin.finder.assist.x1 C;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f119429h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f119430i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f119431m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f119432n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.r f119433o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f119434p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f119435q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f119436r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f119437s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f119438t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f119439u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f119440v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f119441w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewGroup f119442x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewGroup f119443y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f119444z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pu(android.content.Context r8, kotlinx.coroutines.y0 r9, boolean r10, zl2.u4 r11, int r12, kotlin.jvm.internal.i r13) {
        /*
            r7 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L5
            r10 = 1
        L5:
            r2 = r10
            r10 = r12 & 8
            if (r10 == 0) goto Lc
            zl2.u4 r11 = zl2.u4.f473988d
        Lc:
            r3 = r11
            java.lang.String r10 = "context"
            kotlin.jvm.internal.o.g(r8, r10)
            java.lang.String r10 = "scope"
            kotlin.jvm.internal.o.g(r9, r10)
            java.lang.String r10 = "uiMode"
            kotlin.jvm.internal.o.g(r3, r10)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f119429h = r9
            java.lang.String r8 = ""
            r7.f119432n = r8
            r7.B = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.pu.<init>(android.content.Context, kotlinx.coroutines.y0, boolean, zl2.u4, int, kotlin.jvm.internal.i):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.alv;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f119434p = rootView.findViewById(com.tencent.mm.R.id.gqf);
        this.f119435q = rootView.findViewById(com.tencent.mm.R.id.gqe);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.gqd);
        kotlin.jvm.internal.o.d(textView);
        ym5.a1.h(textView, new com.tencent.mm.plugin.finder.live.widget.hu());
        android.widget.CheckBox checkBox = (android.widget.CheckBox) rootView.findViewById(com.tencent.mm.R.id.lya);
        this.f119441w = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.f486639uz1);
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f483758bz2);
        this.f119439u = (android.widget.TextView) rootView.findViewById(com.tencent.mm.R.id.gqh);
        this.f119436r = rootView.findViewById(com.tencent.mm.R.id.f486200kk3);
        this.f119437s = rootView.findViewById(com.tencent.mm.R.id.cl8);
        this.f119438t = (android.widget.ImageView) rootView.findViewById(com.tencent.mm.R.id.cl7);
        this.f119442x = (android.view.ViewGroup) rootView.findViewById(com.tencent.mm.R.id.kih);
        this.f119440v = rootView.findViewById(com.tencent.mm.R.id.dgg);
        android.widget.CheckBox checkBox2 = (android.widget.CheckBox) rootView.findViewById(com.tencent.mm.R.id.kii);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) rootView.findViewById(com.tencent.mm.R.id.gqi);
        kotlin.jvm.internal.o.d(mMNeat7extView);
        java.lang.CharSequence a17 = mMNeat7extView.a();
        if (a17 == null) {
            a17 = "";
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(com.tencent.mm.pluginsdk.ui.span.c0.i(this.f118381d, a17));
        f0Var.c(new com.tencent.mm.plugin.finder.live.widget.nu(this), a17.length() - 4, a17.length(), 33);
        mMNeat7extView.b(f0Var);
        zl2.r4 r4Var = zl2.r4.f473950a;
        kotlin.jvm.internal.o.d(findViewById);
        zl2.r4.c3(r4Var, findViewById, 0, 0, 6, null);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = this.f119439u;
        if (textView2 != null) {
            com.tencent.mm.ui.fk.a(textView2);
        }
        checkBox.setChecked(true);
        this.A = rootView.findViewById(com.tencent.mm.R.id.t2n);
        this.f119443y = (android.view.ViewGroup) rootView.findViewById(com.tencent.mm.R.id.tzy);
        this.f119444z = rootView.findViewById(com.tencent.mm.R.id.u2g);
        android.widget.CheckBox checkBox3 = (android.widget.CheckBox) rootView.findViewById(com.tencent.mm.R.id.u2f);
        checkBox3.setChecked(true);
        android.view.ViewGroup viewGroup = this.f119443y;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.au(checkBox3));
        }
        android.view.View view = this.f119435q;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.bu(checkBox));
        }
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.cu(this));
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.du(checkBox3, this, checkBox, checkBox2));
        android.view.ViewGroup viewGroup2 = this.f119442x;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.eu(checkBox2));
        }
        android.view.View view2 = this.f119435q;
        if (view2 != null) {
            ym5.a1.h(view2, new com.tencent.mm.plugin.finder.live.widget.fu());
        }
        android.view.ViewGroup viewGroup3 = this.f119443y;
        if (viewGroup3 != null) {
            ym5.a1.h(viewGroup3, new com.tencent.mm.plugin.finder.live.widget.gu());
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        android.view.View view;
        com.tencent.mars.xlog.Log.i("FinderLiveReplayGenWidget", "replayWording:" + this.f119432n);
        android.widget.TextView textView = this.f119441w;
        if (textView != null) {
            java.lang.String str = this.f119432n;
            if (str.length() == 0) {
                str = this.f118381d.getString(com.tencent.mm.R.string.d3n);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            textView.setText(str);
        }
        android.view.View view2 = this.f119434p;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f119430i) {
            android.view.ViewGroup viewGroup = this.f119443y;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        } else {
            android.view.ViewGroup viewGroup2 = this.f119443y;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
        }
        android.view.View view3 = this.f119444z;
        if (view3 != null) {
            android.view.ViewGroup viewGroup3 = this.f119443y;
            int visibility = viewGroup3 != null ? viewGroup3.getVisibility() : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(visibility));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f119431m) {
            android.view.View view4 = this.f119435q;
            if (view4 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view5 = this.f119435q;
            if (view5 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        android.view.View view6 = this.A;
        if (view6 != null) {
            android.view.View view7 = this.f119435q;
            int visibility2 = view7 != null ? view7.getVisibility() : 8;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(java.lang.Integer.valueOf(visibility2));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup4 = this.f119442x;
        if (viewGroup4 != null) {
            viewGroup4.setVisibility(8);
        }
        android.view.View view8 = this.f119440v;
        if (view8 != null) {
            android.view.ViewGroup viewGroup5 = this.f119442x;
            int visibility3 = viewGroup5 != null ? viewGroup5.getVisibility() : 8;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList6.add(java.lang.Integer.valueOf(visibility3));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view9 = this.f119435q;
        if (!(view9 != null && view9.getVisibility() == 0)) {
            android.view.ViewGroup viewGroup6 = this.f119443y;
            if (!(viewGroup6 != null && viewGroup6.getVisibility() == 0)) {
                android.view.ViewGroup viewGroup7 = this.f119442x;
                if (!(viewGroup7 != null && viewGroup7.getVisibility() == 0) && (view = this.f119436r) != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveReplayGenWidget", "refreshLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshLayout: highlightLayout.visibility = ");
        android.view.ViewGroup viewGroup8 = this.f119443y;
        sb6.append(viewGroup8 != null ? java.lang.Integer.valueOf(viewGroup8.getVisibility()) : null);
        sb6.append(",genDanmuLayout.visibility = ");
        android.view.View view10 = this.f119435q;
        sb6.append(view10 != null ? java.lang.Integer.valueOf(view10.getVisibility()) : null);
        sb6.append(",onlyMemberGroup.visibility = ");
        android.view.ViewGroup viewGroup9 = this.f119442x;
        sb6.append(viewGroup9 != null ? java.lang.Integer.valueOf(viewGroup9.getVisibility()) : null);
        sb6.append(",optionLayout.visibility = ");
        android.view.View view11 = this.f119436r;
        sb6.append(view11 != null ? java.lang.Integer.valueOf(view11.getVisibility()) : null);
        com.tencent.mars.xlog.Log.i("FinderLiveReplayGenWidget", sb6.toString());
        super.w();
    }

    public final void y(int i17, int i18, android.content.Intent intent) {
        android.net.Uri data;
        java.lang.String str = null;
        if (i17 != 10019 && i17 != 10020) {
            if (i17 != 100116) {
                return;
            }
            if (i18 == -1) {
                kotlinx.coroutines.l.d(this.f119429h, null, null, new com.tencent.mm.plugin.finder.live.widget.ju(intent, this, null), 3, null);
                return;
            }
            com.tencent.mm.plugin.finder.assist.x1 x1Var = this.C;
            if (x1Var != null) {
                x1Var.b(i18);
                return;
            }
            return;
        }
        if (i18 != -1) {
            return;
        }
        if (intent != null && (data = intent.getData()) != null) {
            str = data.getPath();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context context = this.f118381d;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
            java.lang.String str2 = com.tencent.mm.plugin.finder.assist.e9.f102143l;
            ((ub0.r) oVar).getClass();
            str = com.tencent.mm.pluginsdk.ui.tools.l7.b((android.app.Activity) context, intent, str2);
        }
        java.lang.String str3 = str;
        com.tencent.mars.xlog.Log.i("FinderLiveReplayGenWidget", "filePath[" + str3 + "] " + intent);
        if (str3 == null || str3.length() == 0) {
            return;
        }
        android.content.Context context2 = this.f118381d;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        com.tencent.mm.plugin.finder.assist.x1 x1Var2 = new com.tencent.mm.plugin.finder.assist.x1((android.app.Activity) context2, 100116);
        this.C = x1Var2;
        com.tencent.mm.plugin.finder.assist.x1.a(x1Var2, str3, com.tencent.mm.plugin.finder.assist.x1.f102664h.a(), 0.75f, this.f118381d.getResources().getColor(com.tencent.mm.R.color.a3c), false, false, 32, null);
        if (this.f118381d instanceof q80.z) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.finder.live.widget.zt ztVar = new com.tencent.mm.plugin.finder.live.widget.zt(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(ztVar, 50L, false);
        }
    }

    public final void z(java.lang.String path, java.lang.String text) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(text, "text");
        android.widget.ImageView imageView = this.f119438t;
        if (imageView != null) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().c(new mn2.q3(path, com.tencent.mm.plugin.finder.storage.y90.f128356f), imageView, g1Var.h(mn2.f1.f329953d));
        }
        this.B = path;
        android.widget.TextView textView = this.f119439u;
        if (textView != null) {
            textView.setText(text);
        }
        android.view.View view = this.f119437s;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ou(this));
        }
        w();
    }
}
