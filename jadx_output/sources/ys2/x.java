package ys2;

/* loaded from: classes3.dex */
public final class x extends if2.b implements android.view.View.OnTouchListener {

    /* renamed from: m, reason: collision with root package name */
    public if2.d0 f465196m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.ViewGroup f465197n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f465198o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f465199p;

    /* renamed from: q, reason: collision with root package name */
    public float f465200q;

    /* renamed from: r, reason: collision with root package name */
    public long f465201r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6() {
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, 0.0f, this.f465197n != null ? r1.getHeight() : 0.0f);
        translateAnimation.setDuration(200L);
        translateAnimation.setFillAfter(false);
        translateAnimation.setAnimationListener(new ys2.u(this));
        android.view.ViewGroup viewGroup = this.f465197n;
        if (viewGroup != null) {
            viewGroup.startAnimation(translateAnimation);
        }
    }

    public final void a7() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", true);
        ((mm2.c1) business(mm2.c1.class)).N1 = true;
        X6(qo0.b.Z2, bundle);
        if2.d0 d0Var = this.f465196m;
        if (d0Var != null) {
            d0Var.d(0);
        }
        android.view.ViewGroup viewGroup = this.f465197n;
        if (viewGroup != null) {
            viewGroup.measure(0, 0);
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, viewGroup.getMeasuredHeight(), 0.0f);
            translateAnimation.setDuration(200L);
            translateAnimation.setFillAfter(true);
            viewGroup.startAnimation(translateAnimation);
        }
        r45.i72 i72Var = (r45.i72) ((mm2.e1) business(mm2.e1.class)).f328988r.getCustom(44);
        java.lang.Iterable<r45.w94> list = i72Var != null ? i72Var.getList(7) : null;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        org.json.JSONObject b17 = ml2.z0.b(ml2.z0.f328330a, null, 1, null);
        b17.put("wonderful_list_type", 1);
        for (r45.w94 w94Var : list) {
            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
            ml2.o3[] o3VarArr = ml2.o3.f327773d;
            java.lang.String jSONObject = b17.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            ((ml2.j0) zbVar).Wj("watch_live_wonderful_list_exp", jSONObject);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r0 != 3) goto L33;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r10)
            r4.add(r11)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r9
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "v"
            kotlin.jvm.internal.o.g(r10, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.g(r11, r0)
            int r0 = r11.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L82
            r3 = 0
            if (r0 == r2) goto L62
            r4 = 2
            if (r0 == r4) goto L3b
            r11 = 3
            if (r0 == r11) goto L62
            goto L9d
        L3b:
            android.view.ViewGroup r10 = r9.f465197n
            if (r10 == 0) goto L46
            int r10 = r10.getVisibility()
            if (r10 != 0) goto L46
            r3 = r2
        L46:
            if (r3 != 0) goto L9d
            float r10 = r9.f465200q
            float r11 = r11.getY()
            float r10 = r10 - r11
            android.content.Context r11 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.view.ViewConfiguration r11 = android.view.ViewConfiguration.get(r11)
            int r11 = r11.getScaledTouchSlop()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L9d
            r9.a7()
            goto L9d
        L62:
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r9.f465201r
            long r4 = r4 - r6
            int r11 = android.view.ViewConfiguration.getTapTimeout()
            long r6 = (long) r11
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 > 0) goto L75
            r9.Z6()
        L75:
            boolean r11 = r10 instanceof android.view.ViewGroup
            if (r11 == 0) goto L7c
            r1 = r10
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L7c:
            if (r1 == 0) goto L9d
            r1.requestDisallowInterceptTouchEvent(r3)
            goto L9d
        L82:
            r11.getX()
            float r11 = r11.getY()
            r9.f465200q = r11
            long r3 = java.lang.System.currentTimeMillis()
            r9.f465201r = r3
            boolean r11 = r10 instanceof android.view.ViewGroup
            if (r11 == 0) goto L98
            r1 = r10
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L98:
            if (r1 == 0) goto L9d
            r1.requestDisallowInterceptTouchEvent(r2)
        L9d:
            java.lang.String r5 = "com/tencent/mm/plugin/finder/replay/controller/WonderfulFragmentController"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r3 = 1
            r4 = r9
            yj0.a.i(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ys2.x.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) pluginLayout.findViewById(com.tencent.mm.R.id.fkc);
        kotlin.jvm.internal.o.d(viewGroup);
        this.f465196m = new if2.d0(viewGroup, this);
        viewGroup.setOnClickListener(new ys2.v(this));
        this.f465199p = viewGroup.findViewById(com.tencent.mm.R.id.f485242h03);
        this.f465198o = (androidx.recyclerview.widget.RecyclerView) viewGroup.findViewById(com.tencent.mm.R.id.pnu);
        this.f465197n = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.pnv);
        android.view.View view = this.f465199p;
        if (view != null) {
            view.setOnClickListener(new ys2.w(this));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f465198o;
        if (recyclerView != null) {
            recyclerView.setAdapter(new ys2.t(this));
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(viewGroup.getContext(), 0, false));
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        if2.d0 d0Var = this.f465196m;
        if (d0Var != null) {
            d0Var.d(8);
        }
        this.f465197n = null;
        this.f465198o = null;
        this.f465199p = null;
    }
}
