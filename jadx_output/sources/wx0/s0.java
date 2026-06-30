package wx0;

/* loaded from: classes5.dex */
public final class s0 extends mx0.a {

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f450537g;

    /* renamed from: h, reason: collision with root package name */
    public final mx0.z f450538h;

    /* renamed from: i, reason: collision with root package name */
    public final yx0.b8 f450539i;

    /* renamed from: m, reason: collision with root package name */
    public wx0.m0 f450540m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView f450541n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f450542o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s0(android.view.ViewGroup r3, android.view.ViewGroup r4, android.view.View r5, mx0.z r6, yx0.b8 r7) {
        /*
            r2 = this;
            java.lang.String r0 = "sideToolbar"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "frontMask"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = "controller"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "templateCorePlugin"
            kotlin.jvm.internal.o.g(r7, r0)
            r0 = 2131299174(0x7f090b66, float:1.8216342E38)
            android.view.View r0 = r3.findViewById(r0)
            java.lang.String r1 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r2.<init>(r0)
            r2.f450537g = r5
            r2.f450538h = r6
            r2.f450539i = r7
            wx0.m0 r5 = wx0.m0.f450512d
            r2.f450540m = r5
            wx0.q0 r5 = wx0.q0.f450530d
            jz5.g r5 = jz5.h.b(r5)
            r2.f450542o = r5
            android.view.View r5 = r2.f331814d
            wx0.l0 r6 = new wx0.l0
            r6.<init>(r2, r3, r4)
            r5.setOnClickListener(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.s0.<init>(android.view.ViewGroup, android.view.ViewGroup, android.view.View, mx0.z, yx0.b8):void");
    }

    public final void b(boolean z17) {
        if (z17) {
            android.view.View view = this.f450537g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/FlashControlPlugin", "refreshFrontFlashMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/FlashControlPlugin", "refreshFrontFlashMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f450537g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/FlashControlPlugin", "refreshFrontFlashMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/FlashControlPlugin", "refreshFrontFlashMask", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void c(wx0.m0 flashMode) {
        kotlin.jvm.internal.o.g(flashMode, "flashMode");
        this.f450540m = flashMode;
        android.view.View view = this.f331814d;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView");
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView sideBarItemView = (com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SideBarItemView) view;
        int ordinal = this.f450540m.ordinal();
        mx0.z zVar = this.f450538h;
        if (ordinal == 0) {
            sideBarItemView.setImageResource(com.tencent.mm.R.drawable.cyr);
            ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar).i1(false);
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.m6(m7Var, null), 3, null);
            return;
        }
        if (ordinal == 1) {
            sideBarItemView.setImageResource(com.tencent.mm.R.drawable.ckz);
            ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar).i1(true);
            yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            kotlinx.coroutines.l.d(m7Var2.Di(), null, null, new yy0.o6(m7Var2, null), 3, null);
            return;
        }
        if (ordinal != 2) {
            return;
        }
        sideBarItemView.setImageResource(com.tencent.mm.R.drawable.cky);
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar).i1(false);
        yy0.m7 m7Var3 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        kotlinx.coroutines.l.d(m7Var3.Di(), null, null, new yy0.n6(m7Var3, null), 3, null);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView selectorView = this.f450541n;
        if (selectorView != null) {
            return selectorView.a();
        }
        return false;
    }
}
