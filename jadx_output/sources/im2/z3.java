package im2;

/* loaded from: classes3.dex */
public final class z3 extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.modelbase.u0 {
    public final jz5.g A;
    public final java.lang.String A1;
    public final jz5.g B;
    public com.tencent.mm.ui.widget.dialog.u3 B1;
    public final jz5.g C;
    public r45.h32 C1;
    public final jz5.g D;
    public com.tencent.mm.protocal.protobuf.FinderContact D1;
    public final jz5.g E;
    public java.util.List E1;
    public final jz5.g F;
    public boolean F1;
    public final jz5.g G;
    public boolean G1;
    public final jz5.g H;
    public boolean H1;
    public final jz5.g I;
    public boolean I1;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f292631J;
    public final jz5.g J1;
    public final jz5.g K;
    public final jz5.g K1;
    public final jz5.g L;
    public int L1;
    public final jz5.g M;
    public int M1;
    public final jz5.g N;
    public final int N1;
    public final int O1;
    public final jz5.g P;
    public com.tencent.mm.ui.tools.f5 P1;
    public final jz5.g Q;
    public int Q1;
    public final jz5.g R;
    public final float R1;
    public final jz5.g S;
    public final float S1;
    public final jz5.g T;
    public final float T1;
    public final jz5.g U;
    public final float U1;
    public final jz5.g V;
    public final float V1;
    public final jz5.g W;
    public final int W1;
    public final jz5.g X;
    public final int X1;
    public final jz5.g Y;
    public int Y1;
    public final jz5.g Z;
    public boolean Z1;

    /* renamed from: a2, reason: collision with root package name */
    public final jz5.g f292632a2;

    /* renamed from: b2, reason: collision with root package name */
    public final jz5.g f292633b2;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f292634c2;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f292635d;

    /* renamed from: d2, reason: collision with root package name */
    public java.lang.String f292636d2;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f292637e;

    /* renamed from: e2, reason: collision with root package name */
    public java.lang.String f292638e2;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f292639f;

    /* renamed from: f2, reason: collision with root package name */
    public final jz5.g f292640f2;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f292641g;

    /* renamed from: g2, reason: collision with root package name */
    public final jz5.g f292642g2;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f292643h;

    /* renamed from: h2, reason: collision with root package name */
    public final jz5.g f292644h2;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f292645i;

    /* renamed from: i2, reason: collision with root package name */
    public final jz5.g f292646i2;

    /* renamed from: j2, reason: collision with root package name */
    public final jz5.g f292647j2;

    /* renamed from: k2, reason: collision with root package name */
    public final jz5.g f292648k2;

    /* renamed from: l1, reason: collision with root package name */
    public final jz5.g f292649l1;

    /* renamed from: l2, reason: collision with root package name */
    public final jz5.g f292650l2;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f292651m;

    /* renamed from: m2, reason: collision with root package name */
    public boolean f292652m2;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f292653n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f292654o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f292655p;

    /* renamed from: p0, reason: collision with root package name */
    public final jz5.g f292656p0;

    /* renamed from: p1, reason: collision with root package name */
    public final jz5.g f292657p1;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f292658q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f292659r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f292660s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f292661t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f292662u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f292663v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f292664w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f292665x;

    /* renamed from: x0, reason: collision with root package name */
    public r45.vw4 f292666x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f292667x1;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f292668y;

    /* renamed from: y0, reason: collision with root package name */
    public final jz5.g f292669y0;

    /* renamed from: y1, reason: collision with root package name */
    public r45.re2 f292670y1;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f292671z;

    /* renamed from: z1, reason: collision with root package name */
    public im2.s f292672z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f292635d = "FinderLiveNoticeUIC";
        this.f292637e = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ENABLE_DESC_EXTEND_BOOLEAN_SYNC, false);
        this.f292639f = jz5.h.b(new im2.o1(activity));
        this.f292641g = jz5.h.b(new im2.n1(activity));
        this.f292643h = jz5.h.b(new im2.w1(activity));
        this.f292645i = jz5.h.b(new im2.m1(activity));
        this.f292651m = jz5.h.b(new im2.r1(activity));
        this.f292653n = jz5.h.b(new im2.t1(activity));
        this.f292654o = jz5.h.b(new im2.x1(activity));
        this.f292655p = jz5.h.b(new im2.y1(activity));
        this.f292658q = jz5.h.b(new im2.z1(activity));
        this.f292659r = jz5.h.b(new im2.u1(activity));
        this.f292660s = jz5.h.b(new im2.s1(activity));
        this.f292661t = jz5.h.b(new im2.a2(activity));
        this.f292662u = jz5.h.b(new im2.b2(activity));
        this.f292663v = jz5.h.b(new im2.i2(activity));
        this.f292664w = jz5.h.b(new im2.j2(activity));
        this.f292665x = jz5.h.b(new im2.l2(activity));
        this.f292668y = jz5.h.b(new im2.k2(activity));
        this.f292671z = jz5.h.b(new im2.m2(activity));
        this.A = jz5.h.b(new im2.o2(activity));
        this.B = jz5.h.b(new im2.n2(activity));
        this.C = jz5.h.b(new im2.h2(activity));
        this.D = jz5.h.b(new im2.q1(activity));
        this.E = jz5.h.b(new im2.v1(activity));
        this.F = jz5.h.b(new im2.c2(activity));
        this.G = jz5.h.b(new im2.p1(activity));
        this.H = jz5.h.b(new im2.g3(activity));
        this.I = jz5.h.b(new im2.z(activity, this));
        this.f292631J = jz5.h.b(new im2.c3(activity));
        this.K = jz5.h.b(new im2.z2(activity));
        this.L = jz5.h.b(new im2.e3(activity));
        this.M = jz5.h.b(new im2.d3(activity));
        this.N = jz5.h.b(new im2.b3(activity));
        this.P = jz5.h.b(new im2.a3(activity));
        this.Q = jz5.h.b(new im2.f3(activity));
        this.R = jz5.h.b(new im2.f2(activity));
        this.S = jz5.h.b(new im2.g2(activity));
        jz5.h.b(new im2.d2(activity));
        this.T = jz5.h.b(new im2.a0(activity));
        this.U = jz5.h.b(new im2.b0(activity));
        this.V = jz5.h.b(new im2.v3(activity));
        this.W = jz5.h.b(new im2.g0(activity));
        this.X = jz5.h.b(new im2.e2(activity));
        this.Y = jz5.h.b(new im2.j0(activity));
        this.Z = jz5.h.b(new im2.j3(activity));
        this.f292656p0 = jz5.h.b(new im2.l3(activity));
        this.f292666x0 = r45.vw4.Auto;
        this.f292669y0 = jz5.h.b(new im2.k3(this));
        this.f292649l1 = jz5.h.b(new im2.l1(activity));
        this.f292657p1 = jz5.h.b(new im2.y2(activity));
        this.f292670y1 = new r45.re2();
        this.A1 = "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/QnFg1sAtr4PwqQ0T";
        this.E1 = kz5.p0.f313996d;
        this.I1 = true;
        this.J1 = jz5.h.b(new im2.h0(this));
        this.K1 = jz5.h.b(new im2.m3(this));
        this.N1 = 32;
        this.O1 = 200;
        this.R1 = activity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479714d7) / i65.a.q(activity);
        this.S1 = activity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn) / i65.a.q(activity);
        this.T1 = activity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz) / i65.a.q(activity);
        this.U1 = activity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479723df) / i65.a.q(activity);
        this.V1 = activity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479662c0) / i65.a.q(activity);
        this.W1 = 1;
        this.X1 = 2;
        this.f292632a2 = jz5.h.b(im2.k1.f292414d);
        this.f292633b2 = jz5.h.b(im2.j1.f292399d);
        this.f292636d2 = "";
        this.f292638e2 = "";
        this.f292640f2 = jz5.h.b(new im2.i3(activity));
        this.f292642g2 = jz5.h.b(new im2.x3(activity));
        this.f292644h2 = jz5.h.b(new im2.i0(activity));
        this.f292646i2 = jz5.h.b(new im2.h3(activity));
        this.f292647j2 = jz5.h.b(new im2.w3(activity));
        this.f292648k2 = jz5.h.b(new im2.u3(activity));
        this.f292650l2 = jz5.h.b(new im2.y3(activity));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x036e A[LOOP:1: B:34:0x036c->B:35:0x036e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O6(im2.z3 r22) {
        /*
            Method dump skipped, instructions count: 1178
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.z3.O6(im2.z3):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
    
        if (r3.f328778a5 == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q7(im2.z3 r11, boolean r12) {
        /*
            jz5.g r0 = r11.L
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r1 = 8
            r2 = 0
            if (r12 == 0) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = r1
        L12:
            r0.setVisibility(r3)
            jz5.g r0 = r11.N
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            if (r12 == 0) goto L23
            r3 = r2
            goto L24
        L23:
            r3 = r1
        L24:
            r0.setVisibility(r3)
            zl2.q4 r0 = zl2.q4.f473933a
            dk2.ef r3 = dk2.ef.f233372a
            java.lang.Class<mm2.c1> r4 = mm2.c1.class
            androidx.lifecycle.c1 r3 = r3.i(r4)
            mm2.c1 r3 = (mm2.c1) r3
            if (r3 == 0) goto L3b
            boolean r3 = r3.f328778a5
            r4 = 1
            if (r3 != r4) goto L3b
            goto L3c
        L3b:
            r4 = r2
        L3c:
            boolean r0 = r0.F(r4)
            jz5.g r11 = r11.Q
            if (r0 == 0) goto L91
            jz5.n r11 = (jz5.n) r11
            java.lang.Object r11 = r11.getValue()
            android.view.View r11 = (android.view.View) r11
            if (r12 == 0) goto L4f
            r1 = r2
        L4f:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.ThreadLocal r0 = zj0.c.f473285a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r12.add(r0)
            java.util.Collections.reverse(r12)
            java.lang.Object[] r4 = r12.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC"
            java.lang.String r6 = "onSaleEnableChange$execute"
            java.lang.String r7 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC;Z)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r11
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r12 = r12.get(r2)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.setVisibility(r12)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC"
            java.lang.String r5 = "onSaleEnableChange$execute"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC;Z)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
            goto Lda
        L91:
            jz5.n r11 = (jz5.n) r11
            java.lang.Object r11 = r11.getValue()
            android.view.View r11 = (android.view.View) r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.lang.ThreadLocal r0 = zj0.c.f473285a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r12.add(r0)
            java.util.Collections.reverse(r12)
            java.lang.Object[] r4 = r12.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC"
            java.lang.String r6 = "onSaleEnableChange$execute"
            java.lang.String r7 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC;Z)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r11
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r12 = r12.get(r2)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.setVisibility(r12)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC"
            java.lang.String r5 = "onSaleEnableChange$execute"
            java.lang.String r6 = "(Lcom/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC;Z)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
        Lda:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.z3.q7(im2.z3, boolean):void");
    }

    public static /* synthetic */ void t7(im2.z3 z3Var, int i17, int i18, int i19, jz5.o oVar, java.util.Date date, int i27, java.lang.Object obj) {
        if ((i27 & 8) != 0) {
            oVar = zl2.r4.f473950a.e0();
        }
        jz5.o oVar2 = oVar;
        if ((i27 & 16) != 0) {
            date = new java.util.Date(zl2.r4.f473950a.M0());
        }
        z3Var.s7(i17, i18, i19, oVar2, date);
    }

    public static void x7(im2.z3 z3Var, boolean z17, android.content.DialogInterface.OnCancelListener onCancelListener, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            onCancelListener = null;
        }
        z3Var.getClass();
        pm0.v.X(new im2.q3(z17, z3Var, onCancelListener));
    }

    public final long P6(long j17) {
        long M0 = zl2.r4.f473950a.M0();
        long max = java.lang.Math.max(j17 - 604800000, M0);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(M0);
        return (calendar.get(11) < 23 || calendar.get(12) < 55) ? max : max + 86400000;
    }

    public final void Q6() {
        if (p7()) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity != null) {
                mMActivity.setTitleVisibility(8);
            }
            android.view.View c76 = c7();
            android.view.ViewGroup.LayoutParams layoutParams = c7().getLayoutParams();
            layoutParams.height = getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479662c0);
            c76.setLayoutParams(layoutParams);
            jz5.g gVar = this.f292641g;
            android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) gVar).getValue();
            android.view.ViewGroup.LayoutParams layoutParams2 = ((android.widget.ImageView) ((jz5.n) gVar).getValue()).getLayoutParams();
            layoutParams2.height = getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479714d7);
            layoutParams2.width = getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479714d7);
            imageView.setLayoutParams(layoutParams2);
            android.view.View f76 = f7();
            android.view.ViewGroup.LayoutParams layoutParams3 = f76.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams3;
            android.view.ViewGroup.LayoutParams layoutParams4 = f76.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
            int i17 = marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0;
            int dimensionPixelOffset = getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
            android.view.ViewGroup.LayoutParams layoutParams5 = f76.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams5 : null;
            int i18 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
            android.view.ViewGroup.LayoutParams layoutParams6 = f76.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams6 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams6 : null;
            marginLayoutParams.setMargins(i17, dimensionPixelOffset, i18, marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0);
            android.view.View view = (android.view.View) ((jz5.n) this.f292663v).getValue();
            android.view.ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams7, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = (android.view.ViewGroup.MarginLayoutParams) layoutParams7;
            android.view.ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams8 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams8 : null;
            int i19 = marginLayoutParams6 != null ? marginLayoutParams6.leftMargin : 0;
            int dimensionPixelOffset2 = getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz);
            android.view.ViewGroup.LayoutParams layoutParams9 = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams9 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams9 : null;
            int i27 = marginLayoutParams7 != null ? marginLayoutParams7.rightMargin : 0;
            android.view.ViewGroup.LayoutParams layoutParams10 = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams10 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams10 : null;
            marginLayoutParams5.setMargins(i19, dimensionPixelOffset2, i27, marginLayoutParams8 != null ? marginLayoutParams8.bottomMargin : 0);
            android.view.View c77 = c7();
            android.view.ViewGroup.LayoutParams layoutParams11 = c77.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams11, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams9 = (android.view.ViewGroup.MarginLayoutParams) layoutParams11;
            android.view.ViewGroup.LayoutParams layoutParams12 = c77.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams12 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams12 : null;
            int i28 = marginLayoutParams10 != null ? marginLayoutParams10.leftMargin : 0;
            int dimensionPixelOffset3 = getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
            android.view.ViewGroup.LayoutParams layoutParams13 = c77.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams13 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams13 : null;
            int i29 = marginLayoutParams11 != null ? marginLayoutParams11.rightMargin : 0;
            android.view.ViewGroup.LayoutParams layoutParams14 = c77.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams14 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams14 : null;
            marginLayoutParams9.setMargins(i28, dimensionPixelOffset3, i29, marginLayoutParams12 != null ? marginLayoutParams12.bottomMargin : 0);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.X).getValue();
            android.view.ViewGroup.LayoutParams layoutParams15 = viewGroup.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams15, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams13 = (android.view.ViewGroup.MarginLayoutParams) layoutParams15;
            android.view.ViewGroup.LayoutParams layoutParams16 = viewGroup.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams14 = layoutParams16 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams16 : null;
            int i37 = marginLayoutParams14 != null ? marginLayoutParams14.leftMargin : 0;
            int dimensionPixelOffset4 = getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
            android.view.ViewGroup.LayoutParams layoutParams17 = viewGroup.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams15 = layoutParams17 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams17 : null;
            int i38 = marginLayoutParams15 != null ? marginLayoutParams15.rightMargin : 0;
            android.view.ViewGroup.LayoutParams layoutParams18 = viewGroup.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams16 = layoutParams18 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams18 : null;
            marginLayoutParams13.setMargins(i37, dimensionPixelOffset4, i38, marginLayoutParams16 != null ? marginLayoutParams16.bottomMargin : 0);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) ((jz5.n) this.Y).getValue();
            int dimensionPixelOffset5 = getActivity().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), dimensionPixelOffset5, viewGroup2.getPaddingRight(), dimensionPixelOffset5);
            android.view.View view2 = (android.view.View) ((jz5.n) this.T).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC", "checkAndChange2HalfScreenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC", "checkAndChange2HalfScreenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = (android.view.View) ((jz5.n) this.U).getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC", "checkAndChange2HalfScreenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC", "checkAndChange2HalfScreenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) ((jz5.n) this.V).getValue()).setVisibility(0);
            jz5.g gVar2 = this.W;
            android.view.View view4 = (android.view.View) ((jz5.n) gVar2).getValue();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC", "checkAndChange2HalfScreenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC", "checkAndChange2HalfScreenMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.view.View) ((jz5.n) gVar2).getValue()).setOnClickListener(new im2.c0(this));
            android.widget.TextView b76 = b7();
            if (b76 == null) {
                return;
            }
            b76.setVisibility(8);
        }
    }

    public final void R6() {
        if (this.C1 == null) {
            return;
        }
        if (this.f292652m2) {
            b7().setClickable(true);
            b7().setBackgroundResource(com.tencent.mm.R.drawable.a7_);
        } else {
            b7().setClickable(false);
            b7().setBackgroundResource(com.tencent.mm.R.drawable.d3z);
        }
    }

    public final boolean S6() {
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        int integer = I1 != null ? I1.u0().getInteger(6) : 0;
        return pm0.v.z(integer, 8) && pm0.v.z(integer, 16);
    }

    public final void T6(android.view.View view) {
        view.setClickable(false);
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
                T6(childAt);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U6(int i17, java.lang.String str, int i18) {
        if (this.L1 <= 0) {
            com.tencent.mars.xlog.Log.i(this.f292635d, "illegel time");
            return;
        }
        if (this.f292634c2 && this.f292667x1 == 0) {
            android.widget.Toast makeText = db5.t7.makeText(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.e1q), 0);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            return;
        }
        x7(this, true, null, 2, null);
        r45.h32 X6 = X6(i17);
        X6.set(12, str);
        if (i18 != -1) {
            X6.set(24, java.lang.Integer.valueOf(i18));
        }
        ((q30.i) ((r30.q) i95.n0.c(r30.q.class))).Ai(i17);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        im2.s sVar = this.f292672z1;
        if (sVar instanceof im2.r) {
            r45.jb jbVar = new r45.jb();
            jbVar.set(0, 1);
            r45.h94 h94Var = new r45.h94();
            h94Var.getList(0).add(((im2.r) sVar).f292512a);
            jbVar.set(1, hc2.b.a(h94Var));
            linkedList.add(jbVar);
        } else if (sVar instanceof im2.u) {
            r45.jb jbVar2 = new r45.jb();
            jbVar2.set(0, 2);
            r45.i94 i94Var = new r45.i94();
            java.util.LinkedList list = i94Var.getList(0);
            java.util.List list2 = ((im2.u) sVar).f292568a;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(((im2.t) it.next()).f292538a));
            }
            list.addAll(arrayList);
            jbVar2.set(1, hc2.b.a(i94Var));
            linkedList.add(jbVar2);
        } else if (sVar != null) {
            throw new jz5.j();
        }
        r45.t32 t32Var = new r45.t32();
        t32Var.set(0, java.lang.Integer.valueOf(this.f292634c2 ? this.f292667x1 : 0));
        java.lang.Object list3 = this.f292670y1.getList(0);
        if (list3 == null) {
            list3 = new java.util.LinkedList();
        }
        t32Var.set(1, list3);
        java.util.LinkedList list4 = this.f292670y1.getList(4);
        kotlin.jvm.internal.o.f(list4, "getLabel_list(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list4, 10));
        java.util.Iterator it6 = list4.iterator();
        while (it6.hasNext()) {
            arrayList2.add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.b8.a((java.lang.String) it6.next())));
        }
        t32Var.set(6, new java.util.LinkedList(arrayList2));
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList list5 = this.f292670y1.getList(0);
        if (list5 != null) {
            java.util.Iterator it7 = list5.iterator();
            while (it7.hasNext()) {
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) it7.next(), true);
                if (n17 != null) {
                    java.lang.String d17 = n17.d1();
                    if ((d17 == null || d17.length() == 0) == false) {
                        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                        java.lang.String d18 = n17.d1();
                        ((sg3.a) v0Var).getClass();
                        linkedList2.add(c01.a2.c(n17, d18));
                    }
                }
            }
        }
        t32Var.set(3, linkedList2);
        t32Var.set(5, java.lang.Integer.valueOf(((com.tencent.mm.ui.widget.MMSwitchBtn) ((jz5.n) this.f292657p1).getValue()).f211363x ? 1 : 0));
        java.lang.Object list6 = this.f292670y1.getList(1);
        if (list6 == null) {
            list6 = new java.util.LinkedList();
        }
        t32Var.set(2, list6);
        java.lang.String e17 = xy2.c.e(getContext());
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(getActivity());
        gm0.j1.d().g(new db2.f5(e17, X6, 0, Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null, linkedList, t32Var, null, java.lang.Integer.valueOf(this.Y1), null, 0L, 832, null));
    }

    public final void V6(java.lang.String str, int i17) {
        if (this.M1 <= 0) {
            com.tencent.mars.xlog.Log.i(this.f292635d, "doCreateUnspecificNoticeCgi: illegel time, afterOneWeekTime=" + this.M1);
            return;
        }
        x7(this, true, null, 2, null);
        r45.h32 Y6 = Y6();
        Y6.set(12, str);
        if (i17 != -1) {
            Y6.set(24, java.lang.Integer.valueOf(i17));
        }
        ((q30.i) ((r30.q) i95.n0.c(r30.q.class))).Ai(this.M1);
        java.lang.String e17 = xy2.c.e(getContext());
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(getActivity());
        gm0.j1.d().g(new db2.f5(e17, Y6, 0, Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null, null, null, null, 0, null, 0L, nd1.y0.CTRL_INDEX, null));
    }

    public final int W6(java.util.List list, int i17) {
        int size = list.size();
        for (int i18 = 0; i18 < size; i18++) {
            java.lang.String input = list.get(i18).toString();
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[^0-9]");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            kotlin.jvm.internal.o.g(input, "input");
            java.lang.String replaceAll = compile.matcher(input).replaceAll("");
            kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
            java.lang.Integer h17 = r26.h0.h(replaceAll);
            if ((h17 != null ? h17.intValue() : 0) == i17) {
                return i18;
            }
        }
        return 0;
    }

    public final r45.h32 X6(int i17) {
        r45.h32 h32Var = new r45.h32();
        h32Var.set(0, java.lang.Integer.valueOf(i17));
        if (this.f292637e) {
            int integer = h32Var.getInteger(6);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            h32Var.set(6, java.lang.Integer.valueOf(integer | 2));
            h32Var.set(3, e7().getEditableText().toString());
            h32Var.set(23, d7().getEditableText().toString());
        } else {
            h32Var.set(3, d7().getEditableText().toString());
        }
        im2.s sVar = this.f292672z1;
        if (sVar != null) {
            if (sVar instanceof im2.r) {
                java.lang.String wording = ((im2.r) sVar).f292513b;
                kotlin.jvm.internal.o.g(wording, "wording");
                r45.ov2 ov2Var = new r45.ov2();
                ov2Var.set(20, wording);
                r45.pv2 pv2Var = new r45.pv2();
                pv2Var.getList(0).add(ov2Var);
                r45.k34 k34Var = new r45.k34();
                k34Var.set(0, 10);
                k34Var.set(1, hc2.b.a(pv2Var));
                h32Var.addElement(11, k34Var);
            } else if (sVar instanceof im2.u) {
                java.util.List list = ((im2.u) sVar).f292568a;
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((im2.t) it.next()).f292539b);
                }
                java.util.List<java.lang.String> S0 = kz5.n0.S0(arrayList);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(S0, 10));
                for (java.lang.String str : S0) {
                    r45.k94 k94Var = new r45.k94();
                    k94Var.set(2, str);
                    arrayList2.add(k94Var);
                }
                r45.l94 l94Var = new r45.l94();
                l94Var.getList(0).addAll(arrayList2);
                l94Var.set(1, java.lang.Integer.valueOf(S0.size()));
                r45.k34 k34Var2 = new r45.k34();
                k34Var2.set(0, 22);
                k34Var2.set(1, hc2.b.a(l94Var));
                h32Var.addElement(11, k34Var2);
            }
        }
        if (this.f292634c2 || this.Y1 == 1) {
            h32Var.set(18, 0);
        } else {
            r45.vw4 vw4Var = this.f292666x0;
            h32Var.set(18, java.lang.Integer.valueOf(vw4Var != null ? vw4Var.f388624d : 0));
        }
        return h32Var;
    }

    public final r45.h32 Y6() {
        r45.h32 h32Var = new r45.h32();
        h32Var.set(0, java.lang.Integer.valueOf(this.M1));
        if (this.f292637e) {
            int integer = h32Var.getInteger(6);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            h32Var.set(6, java.lang.Integer.valueOf(integer | 2));
            h32Var.set(3, e7().getEditableText().toString());
            h32Var.set(23, d7().getEditableText().toString());
        } else {
            h32Var.set(3, d7().getEditableText().toString());
        }
        h32Var.set(20, 1);
        h32Var.set(18, 0);
        return h32Var;
    }

    public final com.tencent.mm.plugin.finder.live.view.FinderLiveCreateNoticeCommonRowView Z6() {
        java.lang.Object value = ((jz5.n) this.I).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.plugin.finder.live.view.FinderLiveCreateNoticeCommonRowView) value;
    }

    public final int a7() {
        return ((java.lang.Number) ((jz5.n) this.f292644h2).getValue()).intValue();
    }

    public final android.widget.TextView b7() {
        return (android.widget.TextView) ((jz5.n) this.D).getValue();
    }

    public final android.view.View c7() {
        return (android.view.View) ((jz5.n) this.f292660s).getValue();
    }

    public final com.tencent.mm.ui.widget.MMEditText d7() {
        return (com.tencent.mm.ui.widget.MMEditText) ((jz5.n) this.f292659r).getValue();
    }

    public final com.tencent.mm.ui.widget.MMEditText e7() {
        return (com.tencent.mm.ui.widget.MMEditText) ((jz5.n) this.f292655p).getValue();
    }

    public final android.view.View f7() {
        return (android.view.View) ((jz5.n) this.f292661t).getValue();
    }

    public final android.widget.TextView g7() {
        return (android.widget.TextView) ((jz5.n) this.F).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aw8;
    }

    public final android.widget.TextView h7() {
        return (android.widget.TextView) ((jz5.n) this.B).getValue();
    }

    public final android.widget.LinearLayout i7() {
        return (android.widget.LinearLayout) ((jz5.n) this.f292631J).getValue();
    }

    public final android.widget.ScrollView k7() {
        return (android.widget.ScrollView) ((jz5.n) this.H).getValue();
    }

    public final int l7() {
        return ((java.lang.Number) ((jz5.n) this.f292640f2).getValue()).intValue();
    }

    public final int m7() {
        return ((java.lang.Number) ((jz5.n) this.f292642g2).getValue()).intValue();
    }

    public final void n7(r45.d32 d32Var) {
        bw5.x7 ecs_jump_info;
        bw5.x7 ecs_jump_info2;
        int i17 = d32Var.f372032d;
        if (i17 == 1) {
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.app.Activity context = getContext();
            r45.ac4 ac4Var = new r45.ac4();
            ac4Var.set(1, d32Var.f372033e);
            l81.b1 b1Var = new l81.b1();
            b1Var.f317037o = new im2.e0(this);
            c61.yb.Yi((c61.yb) c17, context, ac4Var, b1Var, null, 8, null);
            return;
        }
        if (i17 != 2) {
            return;
        }
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = d32Var.f372033e;
        bw5.v7 g17 = (finderJumpInfo == null || (ecs_jump_info2 = finderJumpInfo.getEcs_jump_info()) == null) ? null : ecs_jump_info2.g();
        if (g17 != null) {
            bw5.y7 y7Var = new bw5.y7();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.D1;
            if (finderContact == null) {
                kotlin.jvm.internal.o.o("contact");
                throw null;
            }
            y7Var.f35389d = finderContact.getUsername();
            boolean[] zArr = y7Var.f35391f;
            zArr[1] = true;
            im2.s sVar = this.f292672z1;
            im2.u uVar = sVar instanceof im2.u ? (im2.u) sVar : null;
            if (uVar != null) {
                java.util.List list = uVar.f292568a;
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Long.valueOf(((im2.t) it.next()).f292538a));
                }
                y7Var.f35390e = new java.util.LinkedList(arrayList);
                zArr[2] = true;
            }
            g17.f34184e = hc2.b.a(y7Var);
            g17.f34186g[2] = true;
        }
        if (finderJumpInfo == null || (ecs_jump_info = finderJumpInfo.getEcs_jump_info()) == null) {
            return;
        }
        ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).wi(new pq.a(getContext()), ecs_jump_info, new im2.f0(this));
    }

    public final boolean o7() {
        return ((java.lang.Boolean) ((jz5.n) this.f292633b2).getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (r2 == null) goto L19;
     */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            super.onActivityResult(r7, r8, r9)
            r0 = 3
            if (r7 != r0) goto L9d
            if (r9 == 0) goto Ld0
            java.lang.String r7 = "KEY_PARAMS_WHITE_LIST"
            byte[] r7 = r9.getByteArrayExtra(r7)
            if (r7 == 0) goto Ld0
            r45.re2 r8 = new r45.re2
            r8.<init>()
            r8.parseFrom(r7)
            r6.f292670y1 = r8
            jz5.g r7 = r6.P
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.getValue()
            android.widget.TextView r7 = (android.widget.TextView) r7
            r45.re2 r8 = r6.f292670y1
            r9 = 2
            java.util.LinkedList r8 = r8.getList(r9)
            if (r8 != 0) goto L32
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
        L32:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.util.Iterator r0 = r8.iterator()
            r1 = 0
        L3c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L90
            java.lang.Object r2 = r0.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L8b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class<vg3.x3> r4 = vg3.x3.class
            lm0.a r4 = gm0.j1.s(r4)
            vg3.x3 r4 = (vg3.x3) r4
            com.tencent.mm.plugin.messenger.foundation.h2 r4 = (com.tencent.mm.plugin.messenger.foundation.h2) r4
            com.tencent.mm.storage.k4 r4 = r4.Bi()
            com.tencent.mm.storage.z3 r2 = r4.q(r2)
            if (r2 == 0) goto L77
            java.lang.Class<tg3.v0> r4 = tg3.v0.class
            i95.m r4 = i95.n0.c(r4)
            tg3.v0 r4 = (tg3.v0) r4
            java.lang.String r5 = r2.d1()
            sg3.a r4 = (sg3.a) r4
            r4.getClass()
            java.lang.String r2 = c01.a2.c(r2, r5)
            if (r2 != 0) goto L79
        L77:
            java.lang.String r2 = ""
        L79:
            r9.append(r2)
            int r2 = r8.size()
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L89
            java.lang.String r1 = ","
            r9.append(r1)
        L89:
            r1 = r3
            goto L3c
        L8b:
            kz5.c0.p()
            r7 = 0
            throw r7
        L90:
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "toString(...)"
            kotlin.jvm.internal.o.f(r8, r9)
            r7.setText(r8)
            goto Ld0
        L9d:
            boolean r0 = r6.p7()
            if (r0 != 0) goto Ld0
            android.app.Activity r0 = r6.getContext()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.o.g(r0, r1)
            pf5.z r1 = pf5.z.f353948a
            boolean r2 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r2 == 0) goto Lc4
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            pf5.v r0 = r1.a(r0)
            java.lang.Class<te2.s8> r1 = te2.s8.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            te2.s8 r0 = (te2.s8) r0
            r0.onActivityResult(r7, r8, r9)
            goto Ld0
        Lc4:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Check failed."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.z3.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (p7()) {
            return super.onBackPressed();
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        android.view.View findViewById = ((te2.s8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(te2.s8.class)).findViewById(com.tencent.mm.R.id.umn);
        if (!(findViewById != null && findViewById.isShown())) {
            return super.onBackPressed();
        }
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((te2.s8) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(te2.s8.class)).y7();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0a18  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0abf  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0b5b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0d95  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0c09  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0acb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0d92  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x061e  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r45) {
        /*
            Method dump skipped, instructions count: 3510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.z3.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        gm0.j1.d().q(6653, this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.P1;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        android.view.View decorView;
        android.view.Window window = getActivity().getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new im2.v2(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.tencent.mm.ui.widget.dialog.j0] */
    /* JADX WARN: Type inference failed for: r12v9, types: [jz5.f0] */
    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        byte[] bArr;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object obj;
        df2.od odVar;
        com.tencent.mars.xlog.Log.i(this.f292635d, "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        boolean z17 = false;
        x7(this, false, null, 2, null);
        boolean z18 = m1Var instanceof db2.f5;
        if (z18) {
            if (i17 != 0 || i18 != 0) {
                if (str != null) {
                    java.lang.String str4 = (str.length() <= 0 ? 0 : 1) != 0 ? str : null;
                    if (str4 != null) {
                        switch (i18) {
                            case -200417:
                            case -200165:
                            case -200164:
                                bArr = db5.e1.E(getContext(), str4, null, getContext().getResources().getString(com.tencent.mm.R.string.f490454vi), false, new im2.x2(this));
                                break;
                            default:
                                android.widget.Toast makeText = db5.t7.makeText(getContext(), str4, 0);
                                makeText.setGravity(17, 0, 0);
                                makeText.show();
                                bArr = jz5.f0.f302826a;
                                break;
                        }
                        r1 = bArr;
                    }
                }
                if (r1 == null) {
                    db5.t7.i(getActivity(), getActivity().getResources().getString(com.tencent.mm.R.string.e0f), com.tencent.mm.R.raw.icons_filled_info);
                    return;
                }
                return;
            }
            db2.f5 f5Var = (db2.f5) m1Var;
            com.tencent.mm.modelbase.o oVar = f5Var.f227972h;
            if (oVar == null) {
                kotlin.jvm.internal.o.o("rr");
                throw null;
            }
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderCreateLiveNoticeResponse");
            r45.h01 h01Var = (r45.h01) fVar;
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
            if (liveRoomControllerStore != null && (odVar = (df2.od) liveRoomControllerStore.controller(df2.od.class)) != null) {
                odVar.e7(r45.n72.kActionType_CreateNotice);
            }
            r45.h32 h32Var = (r45.h32) h01Var.getCustom(2);
            if (h32Var != null) {
                ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
                java.util.List createNoticeList = com.tencent.mm.plugin.finder.feed.model.i1.f107933d;
                kotlin.jvm.internal.o.f(createNoticeList, "createNoticeList");
                synchronized (createNoticeList) {
                    java.util.Iterator it = createNoticeList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (com.tencent.mm.sdk.platformtools.t8.D0(((r45.h32) obj).getString(4), h32Var.getString(4))) {
                                break;
                            }
                        }
                    }
                }
                if (obj == null) {
                    com.tencent.mm.plugin.finder.feed.model.i1.f107933d.add(h32Var);
                }
            }
            if (((r45.h32) h01Var.getCustom(2)) != null) {
                ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                ml2.y2 y2Var = ml2.y2.f328254g;
                java.lang.String valueOf = java.lang.String.valueOf((((r45.h32) h01Var.getCustom(2)) != null ? r6.getInteger(0) : 0) * 1000);
                r45.h32 h32Var2 = (r45.h32) h01Var.getCustom(2);
                if (h32Var2 == null || (str3 = h32Var2.getString(3)) == null) {
                    str3 = "";
                }
                j0Var.Ij(y2Var, valueOf, str3, (java.lang.String) ((jz5.n) this.K1).getValue());
            }
            if (p7()) {
                android.content.Intent intent = new android.content.Intent();
                r45.h32 h32Var3 = (r45.h32) h01Var.getCustom(2);
                intent.putExtra("KEY_FINDER_LIVE_NOTICE_INFO", h32Var3 != null ? h32Var3.toByteArray() : null);
                getActivity().setResult(-1, intent);
                ((android.view.View) ((jz5.n) this.f292639f).getValue()).performClick();
                return;
            }
            db5.t7.i(getActivity(), getActivity().getResources().getString((z18 && f5Var.f227971g == 2) ? com.tencent.mm.R.string.de9 : com.tencent.mm.R.string.ddi), com.tencent.mm.R.raw.icons_filled_done);
            boolean booleanExtra = getIntent().getBooleanExtra("KEY_FINDER_LIVE_NOTICE_CREATE_ENTER_QR_CODE_BACK_PROFILE", false);
            if (this.F1 || this.G1 || this.H1) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", xy2.c.e(getContext()));
                r45.h32 h32Var4 = (r45.h32) h01Var.getCustom(2);
                intent2.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", h32Var4 != null ? h32Var4.toByteArray() : null);
                intent2.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", false);
                intent2.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VIP", this.Y1 == 1);
                intent2.putExtra("KEY_FINDER_LIVE_NOTICE_QR_NEED_BACK_MEMBER", (this.Y1 != 1 || this.H1 || this.G1) ? false : true);
                intent2.putExtra("KEY_FINDER_LIVE_NOTICE_QR_NEED_BACK_PROFILE", booleanExtra);
                pm0.v.V(500L, new im2.w(h01Var, this));
            } else {
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("KEY_FINDER_LIVE_NOTICE_QR_CONTACT", xy2.c.e(getContext()));
                r45.h32 h32Var5 = (r45.h32) h01Var.getCustom(2);
                intent3.putExtra("KEY_FINDER_LIVE_NOTICE_QR_INFO", h32Var5 != null ? h32Var5.toByteArray() : null);
                intent3.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VISITOR", false);
                intent3.putExtra("KEY_FINDER_LIVE_NOTICE_QR_NEED_BACK_PROFILE", booleanExtra || this.Z1 || this.Y1 == 0);
                intent3.putExtra("KEY_FINDER_LIVE_NOTICE_QR_NEED_BACK_MEMBER", this.Y1 == 1 && !this.H1);
                intent3.putExtra("KEY_FINDER_LIVE_NOTICE_QR_IS_VIP", this.Y1 == 1);
                pm0.v.V(500L, new im2.x(this));
            }
            ml2.j0 j0Var2 = (ml2.j0) i95.n0.c(ml2.j0.class);
            ml2.y2 y2Var2 = ml2.y2.f328255h;
            cl0.g gVar = new cl0.g();
            r45.h32 h32Var6 = (r45.h32) h01Var.getCustom(2);
            if (h32Var6 != null && h32Var6.getInteger(20) == 1) {
                z17 = true;
            }
            gVar.o("notice_type", z17 ? 2 : 1);
            java.lang.String gVar2 = gVar.toString();
            r45.h32 h32Var7 = (r45.h32) h01Var.getCustom(2);
            if (h32Var7 == null || (str2 = h32Var7.getString(3)) == null) {
                str2 = "";
            }
            j0Var2.Ij(y2Var2, gVar2, str2, (java.lang.String) ((jz5.n) this.K1).getValue());
        }
    }

    public final boolean p7() {
        return ((java.lang.Boolean) ((jz5.n) this.f292649l1).getValue()).booleanValue();
    }

    public final void r7() {
        v7(false);
        this.f292670y1 = new r45.re2();
        this.Y1 = 1;
        ((android.widget.LinearLayout) ((jz5.n) this.f292631J).getValue()).setVisibility(8);
        w7(r45.vw4.Auto);
    }

    public final void s7(int i17, int i18, int i19, jz5.o oVar, java.util.Date date) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(5, calendar.get(5) + i17);
        java.lang.String input = (java.lang.String) ((java.util.List) ((java.util.ArrayList) oVar.f302842e).get(i17)).get(i18);
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[^0-9]");
        kotlin.jvm.internal.o.f(compile, "compile(...)");
        kotlin.jvm.internal.o.g(input, "input");
        java.lang.String replaceAll = compile.matcher(input).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
        java.lang.Integer h17 = r26.h0.h(replaceAll);
        calendar.set(11, h17 != null ? h17.intValue() : 0);
        int i27 = 0;
        for (int i28 = 0; i28 < i17; i28++) {
            i27 += ((java.util.List) ((java.util.ArrayList) oVar.f302842e).get(i28)).size();
        }
        int i29 = i27 + i18;
        java.util.ArrayList arrayList = (java.util.ArrayList) oVar.f302843f;
        if (i29 >= arrayList.size()) {
            i29 = arrayList.size() - 1;
        }
        java.lang.String input2 = (java.lang.String) ((java.util.List) arrayList.get(i29)).get(i19);
        java.util.regex.Pattern compile2 = java.util.regex.Pattern.compile("[^0-9]");
        kotlin.jvm.internal.o.f(compile2, "compile(...)");
        kotlin.jvm.internal.o.g(input2, "input");
        java.lang.String replaceAll2 = compile2.matcher(input2).replaceAll("");
        kotlin.jvm.internal.o.f(replaceAll2, "replaceAll(...)");
        java.lang.Integer h18 = r26.h0.h(replaceAll2);
        calendar.set(12, h18 != null ? h18.intValue() : 0);
        calendar.set(13, 0);
        com.tencent.mars.xlog.Log.i(this.f292635d, "chosen time:" + calendar.getTime() + ",timeInMills:" + calendar.getTimeInMillis());
        this.L1 = (int) (calendar.getTimeInMillis() / ((long) 1000));
        java.lang.String r17 = zl2.q4.r(zl2.q4.f473933a, calendar.getTimeInMillis(), null, false, false, 10, null);
        ((android.widget.TextView) ((jz5.n) this.f292662u).getValue()).setText(r17);
        ((android.widget.TextView) ((jz5.n) this.f292668y).getValue()).setText(r17);
    }

    public final void u7(int i17) {
        if (i17 != 0 && !o7()) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.d(com.tencent.mm.R.string.mm7);
            e4Var.c();
            return;
        }
        if (i17 != 0 && this.f292634c2) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(activity2);
            e4Var2.d(com.tencent.mm.R.string.mm6);
            e4Var2.c();
            return;
        }
        if (i17 != 0 && this.Y1 == 1) {
            androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
            int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(activity3);
            e4Var3.d(com.tencent.mm.R.string.f491718mm5);
            e4Var3.c();
            return;
        }
        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
        ml2.y2 y2Var = ml2.y2.f328264t;
        cl0.g gVar = new cl0.g();
        gVar.o("notice_type", i17 == 0 ? 1 : 2);
        ((ml2.j0) zbVar).Ij(y2Var, gVar.toString(), "", (java.lang.String) ((jz5.n) this.K1).getValue());
        jz5.g gVar2 = this.C;
        jz5.g gVar3 = this.A;
        jz5.g gVar4 = this.f292668y;
        jz5.g gVar5 = this.f292665x;
        jz5.g gVar6 = this.f292646i2;
        jz5.g gVar7 = this.f292671z;
        jz5.g gVar8 = this.f292647j2;
        jz5.g gVar9 = this.f292664w;
        jz5.g gVar10 = this.X;
        if (i17 == 0) {
            this.Z1 = false;
            ((android.view.ViewGroup) ((jz5.n) gVar10).getValue()).setVisibility(0);
            ((android.view.View) ((jz5.n) gVar9).getValue()).setBackground((android.graphics.drawable.Drawable) ((jz5.n) gVar6).getValue());
            ((android.view.View) ((jz5.n) gVar7).getValue()).setBackground((android.graphics.drawable.Drawable) ((jz5.n) gVar8).getValue());
            ((android.widget.TextView) ((jz5.n) gVar5).getValue()).setTextColor(l7());
            ((android.widget.TextView) ((jz5.n) gVar4).getValue()).setTextColor(l7());
            ((android.widget.TextView) ((jz5.n) gVar3).getValue()).setTextColor(o7() ? m7() : a7());
            h7().setTextColor(o7() ? m7() : a7());
            ((android.widget.TextView) ((jz5.n) gVar2).getValue()).setText((java.lang.String) ((jz5.n) this.f292648k2).getValue());
            return;
        }
        this.Z1 = true;
        ((android.view.ViewGroup) ((jz5.n) gVar10).getValue()).setVisibility(8);
        ((android.view.View) ((jz5.n) gVar9).getValue()).setBackground((android.graphics.drawable.Drawable) ((jz5.n) gVar8).getValue());
        ((android.view.View) ((jz5.n) gVar7).getValue()).setBackground((android.graphics.drawable.Drawable) ((jz5.n) gVar6).getValue());
        ((android.widget.TextView) ((jz5.n) gVar5).getValue()).setTextColor(m7());
        ((android.widget.TextView) ((jz5.n) gVar4).getValue()).setTextColor(m7());
        ((android.widget.TextView) ((jz5.n) gVar3).getValue()).setTextColor(l7());
        h7().setTextColor(l7());
        ((android.widget.TextView) ((jz5.n) gVar2).getValue()).setText((java.lang.String) ((jz5.n) this.f292650l2).getValue());
    }

    public final void v7(boolean z17) {
        java.lang.String string;
        if (!z17 || this.f292672z1 == null) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_PRE_SALE_ANCHOR_LICENSE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((java.lang.Boolean) m17).booleanValue();
            if (!z17 || booleanValue) {
                q7(this, z17);
            } else {
                v7(false);
                pf5.e.launchUI$default(this, null, null, new im2.w2(this, z17, null), 3, null);
            }
        } else {
            v7(false);
            im2.s sVar = this.f292672z1;
            if (sVar == null) {
                string = "";
            } else if (sVar instanceof im2.r) {
                string = getContext().getResources().getString(com.tencent.mm.R.string.oxm);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            } else {
                if (!(sVar instanceof im2.u)) {
                    throw new jz5.j();
                }
                string = getContext().getResources().getString(com.tencent.mm.R.string.oxo);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            }
            android.widget.Toast makeText = db5.t7.makeText(getContext(), string, 0);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            ((android.widget.TextView) ((jz5.n) this.S).getValue()).setText(getString(com.tencent.mm.R.string.e0u));
            v7(false);
            this.f292670y1 = new r45.re2();
            this.Y1 = 0;
            i7().setVisibility(8);
        }
        this.f292634c2 = z17;
    }

    public final void w7(r45.vw4 vw4Var) {
        ((android.widget.TextView) ((jz5.n) this.f292656p0).getValue()).setText(zl2.r4.f473950a.e1(vw4Var));
        this.f292666x0 = vw4Var;
    }
}
