package qs3;

/* loaded from: classes15.dex */
public final class p0 extends qs3.b {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f366374d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.oi5[] f366375e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f366376f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f366377g;

    /* renamed from: h, reason: collision with root package name */
    public final qs3.n0 f366378h;

    /* renamed from: i, reason: collision with root package name */
    public int f366379i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f366380j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarViewController f366381k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController, com.tencent.mm.plugin.radar.ui.RadarSpecialGridView radarGridView, android.content.Context context) {
        super(radarGridView, context);
        kotlin.jvm.internal.o.g(radarGridView, "radarGridView");
        kotlin.jvm.internal.o.g(context, "context");
        this.f366381k = radarViewController;
        this.f366374d = context;
        this.f366375e = new r45.oi5[12];
        this.f366376f = new java.util.HashMap();
        this.f366377g = new java.util.HashMap();
        this.f366380j = new java.util.HashMap();
        this.f366378h = new qs3.n0(radarViewController);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if ((r1 == null || r26.n0.N(r1)) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(r45.oi5 r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == 0) goto L26
            java.lang.String r1 = r5.f382283d
            r2 = 0
            if (r1 == 0) goto L11
            boolean r1 = r26.n0.N(r1)
            if (r1 == 0) goto Lf
            goto L11
        Lf:
            r1 = r2
            goto L12
        L11:
            r1 = r0
        L12:
            if (r1 == 0) goto L25
            java.lang.String r1 = r5.f382287h
            if (r1 == 0) goto L21
            boolean r1 = r26.n0.N(r1)
            if (r1 == 0) goto L1f
            goto L21
        L1f:
            r1 = r2
            goto L22
        L21:
            r1 = r0
        L22:
            if (r1 == 0) goto L25
            goto L26
        L25:
            r0 = r2
        L26:
            if (r0 == 0) goto L29
            return
        L29:
            kotlin.jvm.internal.o.d(r5)
            java.lang.String r0 = r5.f382283d
            if (r0 != 0) goto L36
            java.lang.String r0 = r5.f382287h
            if (r0 != 0) goto L36
            java.lang.String r0 = ""
        L36:
            com.tencent.mm.plugin.radar.ui.RadarViewController r5 = r4.f366381k
            ps3.w r1 = r5.f155043o
            r2 = 0
            java.lang.String r3 = "radarManager"
            if (r1 == 0) goto L66
            java.util.Map r1 = r1.f358138n
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L60
            ps3.w r5 = r5.f155043o
            if (r5 == 0) goto L5c
            java.util.Map r5 = r5.f358138n
            java.util.LinkedHashMap r5 = (java.util.LinkedHashMap) r5
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.o.e(r5, r0)
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
            goto L60
        L5c:
            kotlin.jvm.internal.o.o(r3)
            throw r2
        L60:
            java.util.HashMap r5 = r4.f366376f
            r5.put(r0, r0)
            return
        L66:
            kotlin.jvm.internal.o.o(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qs3.p0.b(r45.oi5):void");
    }

    public final android.view.View c(android.view.View view, int i17) {
        android.view.View view2;
        if (view == null) {
            view2 = android.view.View.inflate(this.f366374d, com.tencent.mm.R.layout.cbu, null);
            kotlin.jvm.internal.o.d(view2);
            com.tencent.mm.plugin.radar.ui.RadarViewController radarViewController = this.f366381k;
            int i18 = radarViewController.f155049u;
            qs3.n0 n0Var = this.f366378h;
            int i19 = n0Var.f366363a + 1;
            n0Var.f366363a = i19;
            view2.setTag(i18, java.lang.Integer.valueOf(i19));
            view2.setTag(radarViewController.f155050v, n0Var.a());
        } else {
            view2 = view;
        }
        android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.lhh);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.lhi);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.lhj);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(4);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById4 = view2.findViewById(com.tencent.mm.R.id.lhb);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(4);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById5 = view2.findViewById(com.tencent.mm.R.id.lha);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(4);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == 7 || i17 % 3 == 1) {
            android.view.View findViewById6 = view2.findViewById(com.tencent.mm.R.id.avn);
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById7 = view2.findViewById(com.tencent.mm.R.id.ogj);
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById7, arrayList7.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById7, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View findViewById8 = view2.findViewById(com.tencent.mm.R.id.ogj);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById8, arrayList8.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById8, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById9 = view2.findViewById(com.tencent.mm.R.id.avn);
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(findViewById9, arrayList9.toArray(), "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(findViewById9, "com/tencent/mm/plugin/radar/ui/RadarViewController$RadarSearchAdapter", "makePlaceHolderView", "(Landroid/view/View;I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }
}
