package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveHonorView;", "Landroid/widget/RelativeLayout;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveHonorView extends android.widget.RelativeLayout {
    public static final /* synthetic */ int M = 0;
    public final android.widget.TextView A;
    public final android.widget.TextView B;
    public final android.widget.TextView C;
    public final com.tencent.mm.ui.widget.imageview.WeImageView D;
    public final com.tencent.mm.ui.widget.imageview.WeImageView E;
    public final com.tencent.mm.ui.widget.imageview.WeImageView F;
    public final android.view.View G;
    public final android.view.View H;
    public final android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public final zl2.u4 f115962J;
    public final android.view.View K;
    public com.tencent.mm.plugin.finder.live.plugin.l L;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f115963d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f115964e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f115965f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f115966g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f115967h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f115968i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f115969m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f115970n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f115971o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f115972p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f115973q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f115974r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f115975s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.ImageView f115976t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f115977u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f115978v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f115979w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.TextView f115980x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.TextView f115981y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f115982z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveHonorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(r45.xn1 r28, android.view.View r29, android.view.View r30, android.widget.TextView r31, android.widget.TextView r32, android.view.View r33, android.widget.ImageView r34, android.widget.ImageView r35, android.widget.ImageView r36, android.view.View r37, int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.FinderLiveHonorView.a(r45.xn1, android.view.View, android.view.View, android.widget.TextView, android.widget.TextView, android.view.View, android.widget.ImageView, android.widget.ImageView, android.widget.ImageView, android.view.View, int, int, int, int):void");
    }

    public final void b() {
        android.view.View view = this.f115964e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/FinderLiveHonorView", "hideGuideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveHonorView", "hideGuideView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c(com.tencent.mm.plugin.finder.live.plugin.l lVar, r45.xn1 xn1Var, r45.xn1 xn1Var2, r45.xn1 xn1Var3) {
        int i17;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#render 1=");
        boolean z17 = false;
        sb6.append((xn1Var == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact3.getNickname());
        sb6.append(" 2=");
        sb6.append((xn1Var2 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact2.getNickname());
        sb6.append(" 3=");
        sb6.append((xn1Var3 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact.getNickname());
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("FinderLive.FinderLiveHonorView", sb6.toString());
        if (lVar != null) {
            this.L = lVar;
        }
        android.view.View view = this.f115977u;
        if (view != null) {
            view.setOnClickListener(null);
        }
        android.view.View view2 = this.f115978v;
        if (view2 != null) {
            view2.setOnClickListener(null);
        }
        android.view.View view3 = this.f115979w;
        if (view3 != null) {
            view3.setOnClickListener(null);
        }
        android.widget.ImageView imageView = this.f115963d;
        if (imageView != null) {
            if (xn1Var != null) {
                mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
                if (!(e1Var != null && e1Var.b7())) {
                    i17 = 0;
                    imageView.setVisibility(i17);
                }
            }
            i17 = 8;
            imageView.setVisibility(i17);
        }
        android.view.View view4 = this.K;
        java.lang.Object layoutParams = view4 != null ? view4.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            android.content.Context context = getContext();
            mm2.e1 e1Var2 = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
            if (e1Var2 != null && e1Var2.b7()) {
                z17 = true;
            }
            marginLayoutParams.topMargin = i65.a.b(context, z17 ? 24 : 72);
        }
        a(xn1Var, this.f115965f, this.f115968i, this.f115980x, this.A, this.f115977u, this.D, this.f115974r, this.f115971o, this.G, 1, com.tencent.mm.R.drawable.c4q, com.tencent.mm.R.drawable.c4p, com.tencent.mm.R.drawable.c4r);
        a(xn1Var2, this.f115966g, this.f115969m, this.f115981y, this.B, this.f115978v, this.E, this.f115975s, this.f115972p, this.H, 2, com.tencent.mm.R.drawable.c4t, com.tencent.mm.R.drawable.c4s, com.tencent.mm.R.drawable.c4u);
        a(xn1Var3, this.f115967h, this.f115970n, this.f115982z, this.C, this.f115979w, this.F, this.f115976t, this.f115973q, this.I, 3, com.tencent.mm.R.drawable.c4w, com.tencent.mm.R.drawable.c4v, com.tencent.mm.R.drawable.c4x);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.tencent.mm.plugin.finder.live.view.k0 r14) {
        /*
            r13 = this;
            java.lang.String r0 = "layout"
            kotlin.jvm.internal.o.g(r14, r0)
            r0 = 0
            r13.setVisibility(r0)
            r13.b()
            zl2.r4 r1 = zl2.r4.f473950a
            boolean r1 = r1.w1()
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            r3 = 1
            if (r1 != 0) goto L40
            dk2.ef r1 = dk2.ef.f233372a
            androidx.lifecycle.c1 r4 = r1.i(r2)
            mm2.c1 r4 = (mm2.c1) r4
            if (r4 == 0) goto L27
            boolean r4 = r4.T
            if (r4 != r3) goto L27
            r4 = r3
            goto L28
        L27:
            r4 = r0
        L28:
            if (r4 != 0) goto L40
            java.lang.Class<mm2.n0> r4 = mm2.n0.class
            androidx.lifecycle.c1 r1 = r1.i(r4)
            mm2.n0 r1 = (mm2.n0) r1
            if (r1 == 0) goto L3a
            boolean r1 = r1.f329273r
            if (r1 != r3) goto L3a
            r1 = r3
            goto L3b
        L3a:
            r1 = r0
        L3b:
            if (r1 == 0) goto L3e
            goto L40
        L3e:
            r1 = r0
            goto L41
        L40:
            r1 = r3
        L41:
            if (r1 == 0) goto L44
            return
        L44:
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r4 = com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_VISITOR_HONOR_RANK_IS_VISITOR_GUIDE_SHOWN_BOOLEAN_SYNC
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r1.m(r4, r5)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.o.e(r1, r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            dk2.ef r5 = dk2.ef.f233372a
            androidx.lifecycle.c1 r2 = r5.i(r2)
            mm2.c1 r2 = (mm2.c1) r2
            if (r2 == 0) goto L70
            int r2 = r2.c7()
            if (r2 != r3) goto L70
            goto L71
        L70:
            r3 = r0
        L71:
            if (r3 != 0) goto L74
            return
        L74:
            if (r1 != 0) goto Ld6
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.x(r4, r2)
            android.view.View r1 = r13.f115964e
            if (r1 != 0) goto L88
            goto Lca
        L88:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.add(r3)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r6 = r2.toArray()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/view/FinderLiveHonorView"
            java.lang.String r8 = "showView"
            java.lang.String r9 = "(Lcom/tencent/mm/plugin/finder/live/view/FinderBaseLivePluginLayout;)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r1
            yj0.a.d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r2.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.setVisibility(r0)
            java.lang.String r6 = "com/tencent/mm/plugin/finder/live/view/FinderLiveHonorView"
            java.lang.String r7 = "showView"
            java.lang.String r8 = "(Lcom/tencent/mm/plugin/finder/live/view/FinderBaseLivePluginLayout;)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r1
            yj0.a.f(r5, r6, r7, r8, r9, r10, r11)
        Lca:
            android.view.View r0 = r13.f115964e
            if (r0 == 0) goto Ld6
            com.tencent.mm.plugin.finder.live.view.t5 r1 = new com.tencent.mm.plugin.finder.live.view.t5
            r1.<init>(r13, r14)
            r0.setOnClickListener(r1)
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.FinderLiveHonorView.d(com.tencent.mm.plugin.finder.live.view.k0):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveHonorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, null, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FinderLiveHonorView(android.content.Context r9, android.util.AttributeSet r10, int r11, zl2.u4 r12, int r13, kotlin.jvm.internal.i r14) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.FinderLiveHonorView.<init>(android.content.Context, android.util.AttributeSet, int, zl2.u4, int, kotlin.jvm.internal.i):void");
    }
}
