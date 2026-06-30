package yi2;

/* loaded from: classes10.dex */
public final class l0 implements yi2.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f462543a;

    /* renamed from: b, reason: collision with root package name */
    public final xi2.e f462544b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.Space f462545c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f462546d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f462547e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f462548f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f462549g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f462550h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f462551i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f462552j;

    public l0(android.view.View root, xi2.e server) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(server, "server");
        this.f462543a = root;
        this.f462544b = server;
        qo0.c cVar = ((com.tencent.mm.plugin.finder.live.widget.p8) server).f119370a.f119592c.f113325g;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = cVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) cVar : null;
        this.f462545c = k0Var != null ? (android.widget.Space) k0Var.findViewById(com.tencent.mm.R.id.qxq) : null;
        this.f462546d = "VisitorSingleBattleBarWidget_" + hashCode();
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.f484568ep2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f462547e = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.epf);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f462548f = findViewById2;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.q9p);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f462549g = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.epg);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f462550h = textView;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.qva);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f462551i = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById5;
        this.f462552j = new com.tencent.mm.sdk.platformtools.b4(new yi2.j0(this), true);
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Object systemService = context.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (12.6f * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
    }

    @Override // yi2.o0
    public void a(int i17, boolean z17) {
        this.f462551i.setVisibility(8);
        android.view.View view = this.f462547e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleFinishPublicityCountDown", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleFinishPublicityCountDown", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f462548f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleFinishPublicityCountDown", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleFinishPublicityCountDown", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f462543a;
        android.widget.TextView textView = this.f462550h;
        if (i17 < 10) {
            textView.setText(view3.getContext().getResources().getString(com.tencent.mm.R.string.lzu) + " 0" + i17);
        } else {
            textView.setText(view3.getContext().getResources().getString(com.tencent.mm.R.string.lzu) + ' ' + i17);
        }
        if (z17) {
            h();
        }
    }

    @Override // yi2.o0
    public void b() {
        g();
        this.f462551i.setVisibility(0);
        android.view.View view = this.f462548f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f462547e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yi2.o0
    public void c(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("battleEnd curBattle:");
        xi2.e eVar = this.f462544b;
        sb6.append(((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) eVar).a().a(mm2.o4.class)).Z);
        com.tencent.mars.xlog.Log.i(this.f462546d, sb6.toString());
        this.f462550h.setText(no0.m.f338730a.b(0, ":"));
        this.f462552j.d();
        if (((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) eVar).a().a(mm2.o4.class)).Z == null || z17) {
            return;
        }
        g();
    }

    @Override // yi2.o0
    public void d() {
        pm0.v.X(new yi2.k0(this));
    }

    @Override // yi2.o0
    public void e() {
        com.tencent.mars.xlog.Log.i(this.f462546d, "onAnimationStart status:");
    }

    @Override // yi2.o0
    public android.view.View f() {
        return this.f462543a;
    }

    public final void g() {
        com.tencent.mm.plugin.finder.live.widget.p8 p8Var = (com.tencent.mm.plugin.finder.live.widget.p8) this.f462544b;
        dk2.u4 u4Var = ((mm2.o4) p8Var.a().a(mm2.o4.class)).Z;
        if (u4Var != null) {
            ce2.i e17 = dk2.u7.f234181a.e(u4Var.f234162i);
            int i17 = u4Var.f234161h;
            android.widget.ImageView imageView = this.f462549g;
            if (i17 != 1) {
                imageView.setVisibility(8);
                return;
            }
            if (((mm2.o4) p8Var.a().a(mm2.o4.class)).f329324s.size() != 1) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
            java.lang.String str = e17 != null ? e17.field_thumbnailFileUrl : null;
            if (str == null) {
                str = "";
            }
            ((wo0.b) d1Var.a(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f))).c(imageView);
        }
    }

    public final void h() {
        this.f462552j.d();
        android.view.View view = this.f462548f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleCreated", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleCreated", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f462547e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleCreated", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "onBattleCreated", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f462551i.setVisibility(8);
        this.f462550h.setText("PK" + this.f462543a.getContext().getResources().getString(com.tencent.mm.R.string.lzt));
        g();
        setVisible(0);
    }

    @Override // yi2.o0
    public void i(boolean z17) {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f462552j;
        b4Var.d();
        b4Var.c(1000L, 1000L);
        no0.l lVar = no0.m.f338730a;
        dk2.u4 u4Var = ((mm2.o4) ((com.tencent.mm.plugin.finder.live.widget.p8) this.f462544b).a().a(mm2.o4.class)).Z;
        this.f462550h.setText(lVar.b(u4Var != null ? u4Var.f234156c : 0, ":"));
        this.f462551i.setVisibility(0);
        g();
        if (!z17) {
            android.view.View view = this.f462548f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f462547e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "battleStart", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        setVisible(0);
    }

    @Override // yi2.o0
    public void reset() {
        this.f462552j.d();
        android.view.View view = this.f462548f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f462547e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget", "reset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f462551i.setVisibility(8);
        this.f462550h.setText("PK" + this.f462543a.getContext().getResources().getString(com.tencent.mm.R.string.lzt));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    @Override // yi2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setVisible(int r12) {
        /*
            r11 = this;
            android.view.View r0 = r11.f462543a
            android.content.Context r1 = r0.getContext()
            boolean r1 = r1 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L3a
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            pf5.z r1 = pf5.z.f353948a
            boolean r2 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r2 == 0) goto L2e
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            pf5.v r0 = r1.a(r0)
            java.lang.Class<pl2.x> r1 = pl2.x.class
            androidx.lifecycle.c1 r0 = r0.a(r1)
            pl2.x r0 = (pl2.x) r0
            boolean r0 = r0.f356683f
            if (r0 == 0) goto L3a
            r0 = 8
            goto L3b
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L3a:
            r0 = r12
        L3b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "battle setVisible: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r11.f462546d
            com.tencent.mars.xlog.Log.i(r2, r1)
            android.view.View r1 = r11.f462543a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.add(r0)
            java.util.Collections.reverse(r2)
            java.lang.Object[] r4 = r2.toArray()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget"
            java.lang.String r6 = "setVisible"
            java.lang.String r7 = "(I)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r1
            yj0.a.d(r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/mic/pk/widget/FinderLiveVisitorSingleBattleBarWidget"
            java.lang.String r5 = "setVisible"
            java.lang.String r6 = "(I)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r1
            yj0.a.f(r3, r4, r5, r6, r7, r8, r9)
            android.widget.Space r1 = r11.f462545c
            if (r1 == 0) goto La0
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            goto La1
        La0:
            r1 = 0
        La1:
            if (r1 != 0) goto La4
            goto Lb0
        La4:
            if (r12 != 0) goto Lae
            android.content.Context r12 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r0 = 20
            int r0 = i65.a.b(r12, r0)
        Lae:
            r1.height = r0
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yi2.l0.setVisible(int):void");
    }
}
