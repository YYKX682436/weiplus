package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes14.dex */
public final class sx extends com.tencent.mm.ui.component.UIComponent implements x91.a {
    public kotlinx.coroutines.r2 A;
    public kotlinx.coroutines.r2 B;
    public long C;
    public int D;
    public long E;
    public java.lang.ref.WeakReference F;
    public final jz5.g G;
    public int H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f135924J;
    public final int K;
    public int L;
    public final jz5.g M;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f135925d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f135926e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f135927f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f135928g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f135929h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f135930i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f135931m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f135932n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f135933o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f135934p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f135935q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f135936r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f135937s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f135938t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f135939u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f135940v;

    /* renamed from: w, reason: collision with root package name */
    public x91.h f135941w;

    /* renamed from: x, reason: collision with root package name */
    public long f135942x;

    /* renamed from: y, reason: collision with root package name */
    public long f135943y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f135944z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135925d = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.hx(activity));
        this.f135926e = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.xv(this));
        this.f135927f = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.px(this));
        this.f135928g = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.wv(this));
        this.f135929h = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.vv(this));
        this.f135930i = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ix(this));
        this.f135931m = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.sw(this));
        this.f135932n = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.tw(this));
        this.f135933o = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.zv(this));
        this.f135934p = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.aw(this));
        this.f135935q = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.pw(this));
        this.f135936r = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ow(this));
        this.f135937s = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.nw(this));
        this.f135938t = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.yv.f136616d);
        this.f135939u = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.uv(this));
        this.f135940v = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.rw(this));
        this.f135944z = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.dw.f134171d);
        this.D = 1;
        this.G = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.rx(activity, this));
        this.H = -1;
        this.f135924J = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ox(this));
        this.K = 10;
        this.M = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.cw(this));
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar, java.lang.String str, java.lang.String str2) {
        sxVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", "internalPlay: source=" + str2 + ", videoUrl=" + str + ", feedId=" + pm0.v.u(sxVar.f135942x));
        x91.h hVar = sxVar.f135941w;
        if (hVar != null) {
            hVar.f452651e.f452663a = x91.j.Stopped;
        }
        if (hVar != null) {
            hVar.d(str, new com.tencent.mm.plugin.finder.viewmodel.component.mw(sxVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r0.J() == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void P6(com.tencent.mm.plugin.finder.viewmodel.component.sx r11, boolean r12) {
        /*
            if (r12 != 0) goto L7
            r11.getClass()
            goto Lbe
        L7:
            java.lang.ref.WeakReference r0 = r11.F
            java.lang.String r1 = "processProjectionResult success="
            java.lang.String r2 = "FinderProjectionScreenUIC"
            r3 = 0
            if (r0 == 0) goto La8
            java.lang.Object r0 = r0.get()
            in5.s0 r0 = (in5.s0) r0
            if (r0 == 0) goto La8
            java.lang.Object r4 = r0.f293125i
            boolean r5 = r4 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed
            if (r5 == 0) goto L21
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r4
            goto L22
        L21:
            r4 = r3
        L22:
            if (r4 == 0) goto L2d
            long r4 = r4.getItemId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L2e
        L2d:
            r4 = r3
        L2e:
            r5 = 2131307756(0x7f092cec, float:1.8233748E38)
            android.view.View r5 = r0.p(r5)
            com.tencent.mm.plugin.finder.view.FinderMediaLayout r5 = (com.tencent.mm.plugin.finder.view.FinderMediaLayout) r5
            r6 = 2131305034(0x7f09224a, float:1.8228227E38)
            android.view.View r0 = r0.p(r6)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r0 = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) r0
            if (r0 == 0) goto L4a
            boolean r0 = r0.J()
            r6 = 1
            if (r0 != r6) goto L4a
            goto L4b
        L4a:
            r6 = 0
        L4b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r7 = ", itemId="
            r0.append(r7)
            if (r4 == 0) goto L5f
            long r7 = r4.longValue()
            goto L61
        L5f:
            r7 = 0
        L61:
            java.lang.String r7 = pm0.v.u(r7)
            r0.append(r7)
            java.lang.String r7 = ",projectionFeedId="
            r0.append(r7)
            long r7 = r11.f135942x
            java.lang.String r7 = pm0.v.u(r7)
            r0.append(r7)
            java.lang.String r7 = ",mediaLayout="
            r0.append(r7)
            r0.append(r5)
            java.lang.String r7 = ",videoPlaying="
            r0.append(r7)
            r0.append(r6)
            r7 = 33
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            long r7 = r11.f135942x
            if (r4 != 0) goto L97
            goto La6
        L97:
            long r9 = r4.longValue()
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 != 0) goto La6
            if (r6 == 0) goto La6
            if (r5 == 0) goto La6
            r5.onSingleTapConfirmed(r3)
        La6:
            jz5.f0 r3 = jz5.f0.f302826a
        La8:
            if (r3 != 0) goto Lbe
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r1)
            r11.append(r12)
            java.lang.String r12 = ", but viewHolder is null!"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.e(r2, r11)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.sx.P6(com.tencent.mm.plugin.finder.viewmodel.component.sx, boolean):void");
    }

    @Override // x91.a
    public void C2(x91.h hVar) {
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.uw(hVar, this));
    }

    @Override // x91.a
    public void K4(x91.h hVar) {
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.ax(hVar, this));
    }

    public final void Q6() {
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", "cleanUp");
        try {
            ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) this.M).getValue()).d();
            S6().clear();
            R6().notifyDataSetChanged();
            x91.b b17 = x91.b.b();
            b17.f452630a = true;
            for (x91.h hVar : ((java.util.HashMap) b17.f452631b).values()) {
                kotlin.jvm.internal.o.d(hVar);
                hVar.h();
                hVar.i();
                hVar.f452654h = null;
            }
            b17.e(this);
            b17.a();
            try {
                int i17 = y91.i0.f460281h;
                y91.h0.f460277a.a();
            } catch (ba1.a unused) {
            }
            y91.n.f460302a.a();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderProjectionScreenUIC", "Error happen while cleaning up " + e17.getMessage());
        }
    }

    public final com.tencent.mm.plugin.finder.viewmodel.component.rv R6() {
        return (com.tencent.mm.plugin.finder.viewmodel.component.rv) ((jz5.n) this.f135939u).getValue();
    }

    public final java.util.ArrayList S6() {
        return (java.util.ArrayList) ((jz5.n) this.f135938t).getValue();
    }

    public final android.widget.TextView T6() {
        return (android.widget.TextView) ((jz5.n) this.f135932n).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String U6(long r5) {
        /*
            r4 = this;
            jz5.g r0 = r4.f135944z
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r0.get(r5)
            r45.yx4 r5 = (r45.yx4) r5
            r6 = 0
            if (r5 == 0) goto L4b
            r0 = 2
            long r0 = r5.getLong(r0)
            r2 = 1000(0x3e8, float:1.401E-42)
            long r2 = (long) r2
            long r0 = r0 * r2
            long r2 = c01.id.c()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L41
            java.lang.String r0 = r5.getString(r2)
            if (r0 == 0) goto L3d
            int r0 = r0.length()
            if (r0 <= 0) goto L38
            r0 = r2
            goto L39
        L38:
            r0 = r1
        L39:
            if (r0 != r2) goto L3d
            r0 = r2
            goto L3e
        L3d:
            r0 = r1
        L3e:
            if (r0 == 0) goto L41
            r1 = r2
        L41:
            if (r1 == 0) goto L44
            goto L45
        L44:
            r5 = r6
        L45:
            if (r5 == 0) goto L4b
            java.lang.String r6 = r5.getString(r2)
        L4b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.sx.U6(long):java.lang.String");
    }

    public final boolean V6() {
        return this.I && h().getVisibility() == 0;
    }

    public final void W6(int i17) {
        x91.c cVar;
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", "refreshByMode oldMode=" + this.H + ",newMode=" + i17 + ",showLinkedViewSource=" + this.D + '!');
        int i18 = this.H;
        if (i17 != i18) {
            this.H = i17;
            jz5.g gVar = this.f135935q;
            jz5.g gVar2 = this.f135933o;
            jz5.g gVar3 = this.f135931m;
            jz5.g gVar4 = this.f135930i;
            jz5.g gVar5 = this.f135927f;
            if (i17 == 0) {
                android.view.View view = (android.view.View) ((jz5.n) gVar5).getValue();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = (android.view.View) ((jz5.n) gVar4).getValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = (android.view.View) ((jz5.n) gVar3).getValue();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = (android.view.View) ((jz5.n) gVar2).getValue();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view5 = (android.view.View) ((jz5.n) gVar).getValue();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.L = 0;
                jz5.n nVar = (jz5.n) this.M;
                ((com.tencent.mm.sdk.platformtools.b4) nVar.getValue()).d();
                ((com.tencent.mm.sdk.platformtools.b4) nVar.getValue()).c(0L, 3000L);
            } else if (i17 == 1) {
                android.view.View view6 = (android.view.View) ((jz5.n) gVar5).getValue();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view7 = (android.view.View) ((jz5.n) gVar4).getValue();
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view8 = (android.view.View) ((jz5.n) gVar3).getValue();
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view9 = (android.view.View) ((jz5.n) gVar2).getValue();
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view10 = (android.view.View) ((jz5.n) gVar).getValue();
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(8);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.text.SpannableString spannableString = new android.text.SpannableString(h().getContext().getResources().getString(com.tencent.mm.R.string.cwr));
                int L = r26.n0.L(spannableString, "，", 0, false, 6, null);
                if (L != -1 && L > 0 && L < spannableString.length() - 1) {
                    spannableString.setSpan(new com.tencent.mm.plugin.finder.viewmodel.component.dx(), L + 1, spannableString.length(), 33);
                    T6().setText(spannableString);
                    T6().setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.cx(this));
                }
            } else if (i17 == 2) {
                android.view.View view11 = (android.view.View) ((jz5.n) gVar5).getValue();
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList11.add(0);
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view12 = (android.view.View) ((jz5.n) gVar4).getValue();
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                arrayList12.add(8);
                java.util.Collections.reverse(arrayList12);
                yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                yj0.a.f(view12, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view13 = (android.view.View) ((jz5.n) gVar3).getValue();
                java.util.ArrayList arrayList13 = new java.util.ArrayList();
                arrayList13.add(8);
                java.util.Collections.reverse(arrayList13);
                yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view14 = (android.view.View) ((jz5.n) gVar2).getValue();
                java.util.ArrayList arrayList14 = new java.util.ArrayList();
                arrayList14.add(0);
                java.util.Collections.reverse(arrayList14);
                yj0.a.d(view14, arrayList14.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view14.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                yj0.a.f(view14, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view15 = (android.view.View) ((jz5.n) gVar).getValue();
                java.util.ArrayList arrayList15 = new java.util.ArrayList();
                arrayList15.add(8);
                java.util.Collections.reverse(arrayList15);
                yj0.a.d(view15, arrayList15.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view15.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
                yj0.a.f(view15, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i17 == 3) {
                if (i18 == 2) {
                    this.D = 2;
                }
                android.view.View view16 = (android.view.View) ((jz5.n) gVar5).getValue();
                java.util.ArrayList arrayList16 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList16.add(8);
                java.util.Collections.reverse(arrayList16);
                yj0.a.d(view16, arrayList16.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view16.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                yj0.a.f(view16, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view17 = (android.view.View) ((jz5.n) gVar4).getValue();
                java.util.ArrayList arrayList17 = new java.util.ArrayList();
                arrayList17.add(8);
                java.util.Collections.reverse(arrayList17);
                yj0.a.d(view17, arrayList17.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view17.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
                yj0.a.f(view17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view18 = (android.view.View) ((jz5.n) gVar3).getValue();
                java.util.ArrayList arrayList18 = new java.util.ArrayList();
                arrayList18.add(8);
                java.util.Collections.reverse(arrayList18);
                yj0.a.d(view18, arrayList18.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view18.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
                yj0.a.f(view18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view19 = (android.view.View) ((jz5.n) gVar2).getValue();
                java.util.ArrayList arrayList19 = new java.util.ArrayList();
                arrayList19.add(8);
                java.util.Collections.reverse(arrayList19);
                yj0.a.d(view19, arrayList19.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view19.setVisibility(((java.lang.Integer) arrayList19.get(0)).intValue());
                yj0.a.f(view19, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view20 = (android.view.View) ((jz5.n) gVar).getValue();
                java.util.ArrayList arrayList20 = new java.util.ArrayList();
                arrayList20.add(0);
                java.util.Collections.reverse(arrayList20);
                yj0.a.d(view20, arrayList20.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view20.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
                yj0.a.f(view20, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "refreshByMode", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f135936r).getValue();
                android.content.res.Resources resources = h().getContext().getResources();
                java.lang.Object[] objArr = new java.lang.Object[1];
                x91.h hVar = this.f135941w;
                objArr[0] = (hVar == null || (cVar = hVar.f452647a) == null) ? null : cVar.f452639g;
                textView.setText(resources.getString(com.tencent.mm.R.string.d8d, objArr));
            }
            int i19 = this.H;
            if (i19 != 2 && i19 != 0) {
                X6();
            } else if (this.C == 0) {
                this.C = c01.id.c();
            }
        }
    }

    public final void X6() {
        com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", "reportProjectionSearchExp startSearchTimeMs=" + this.C);
        if (this.C > 0) {
            long c17 = c01.id.c() - this.C;
            this.C = 0L;
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("view_id", "projection_search");
            lVarArr[1] = new jz5.l("feed_id", pm0.v.u(this.f135943y));
            lVarArr[2] = new jz5.l("projection_search_time", java.lang.Long.valueOf(c17));
            lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            ((cy1.a) rVar).Ej("view_exp", kz5.c1.k(lVarArr), 25496);
        }
    }

    public final void Y6(x91.h hVar) {
        kotlinx.coroutines.r2 r2Var = this.B;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        this.B = kotlinx.coroutines.l.d(getMainScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.jx(this, hVar, null), 3, null);
    }

    public final void Z6(long j17, java.lang.ref.WeakReference weakReference) {
        this.F = weakReference;
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderProjectionScreenUIC$videoEndListener$2$1) ((jz5.n) this.G).getValue()).alive();
        if (U6(j17) == null) {
            this.A = kotlinx.coroutines.l.d(getMainScope(), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.gx(this, j17, null), 3, null);
        }
        if (!this.I) {
            this.I = true;
            jz5.g gVar = this.f135934p;
            ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(h().getContext()));
            ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).setAdapter(R6());
            h().setOnTouchListener(com.tencent.mm.plugin.finder.viewmodel.component.fw.f134437d);
            ((android.view.View) ((jz5.n) this.f135929h).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.gw(this));
            ((android.view.View) ((jz5.n) this.f135928g).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.hw(this));
            jz5.g gVar2 = this.f135937s;
            ((android.widget.TextView) ((jz5.n) gVar2).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.iw(this));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk((android.widget.TextView) ((jz5.n) gVar2).getValue(), "projection_break");
            aVar.ik((android.widget.TextView) ((jz5.n) gVar2).getValue(), 32, 25496);
            aVar.Ai((android.widget.TextView) ((jz5.n) gVar2).getValue(), new com.tencent.mm.plugin.finder.viewmodel.component.jw(this));
            cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar2.pk(T6(), "search_again");
            aVar2.ik(T6(), 40, 25496);
            aVar2.Ai(T6(), new com.tencent.mm.plugin.finder.viewmodel.component.kw(this));
        }
        this.f135943y = j17;
        android.view.View h17 = h();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "showPanel", "(JLjava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(h17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderProjectionScreenUIC", "showPanel", "(JLjava/lang/ref/WeakReference;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (h().getParent() != null) {
            android.view.ViewParent parent = h().getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(h());
            }
        }
        android.view.View decorView = getActivity().getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((android.view.ViewGroup) decorView).addView(h(), -1, -1);
        android.view.View findViewById = h().findViewById(com.tencent.mm.R.id.g0y);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById);
        jz5.g gVar3 = this.f135926e;
        ((com.tencent.mm.ui.widget.LiveBottomSheetPanel) ((jz5.n) gVar3).getValue()).setTranslationY(com.tencent.mm.ui.bl.b(getContext()).y);
        ((com.tencent.mm.ui.widget.LiveBottomSheetPanel) ((jz5.n) gVar3).getValue()).f();
        x91.h hVar = this.f135941w;
        if (hVar == null) {
            this.H = -1;
            com.tencent.mars.xlog.Log.i("FinderProjectionScreenUIC", "prepare");
            try {
                int i17 = y91.i0.f460281h;
                y91.h0.f460277a.b();
                y91.n.f460302a.b();
                x91.b.b().c(this);
            } catch (ba1.a e17) {
                com.tencent.mars.xlog.Log.w("FinderProjectionScreenUIC", "RouterException: " + e17.getMessage());
            }
            W6(0);
        } else if (j17 != this.f135942x) {
            Y6(hVar);
        }
        this.D = 1;
    }

    public final android.view.View h() {
        return (android.view.View) ((jz5.n) this.f135925d).getValue();
    }

    public final void m1() {
        if (this.f135941w == null) {
            Q6();
        }
        X6();
        this.f135943y = 0L;
        jz5.g gVar = this.f135926e;
        ((com.tencent.mm.ui.widget.LiveBottomSheetPanel) ((jz5.n) gVar).getValue()).setOnVisibilityListener(new com.tencent.mm.plugin.finder.viewmodel.component.ew(this));
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(liveBottomSheetPanel, "<get-contentGroup>(...)");
        com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (!V6()) {
            return false;
        }
        m1();
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        Q6();
    }

    @Override // x91.a
    public void q2(x91.h hVar) {
        pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.yw(hVar, this));
    }
}
