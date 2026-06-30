package df2;

/* loaded from: classes3.dex */
public final class k1 extends df2.de implements df2.l9 {

    /* renamed from: p, reason: collision with root package name */
    public final int f230537p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.lifecycle.j0 f230538q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashSet f230539r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230540s;

    /* renamed from: t, reason: collision with root package name */
    public int f230541t;

    /* renamed from: u, reason: collision with root package name */
    public long f230542u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f230543v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        ml2.y3 y3Var = ml2.y3.f328270e;
        this.f230537p = 9;
        this.f230538q = new androidx.lifecycle.j0();
        this.f230539r = new java.util.HashSet();
    }

    @Override // df2.l9
    public void b5() {
        m7("autoDismiss", false);
    }

    @Override // df2.l9
    public java.lang.String getTag() {
        return "FinderCreateLiveGuideController";
    }

    @Override // df2.de
    public void i7(r45.tm1 info) {
        kotlin.jvm.internal.o.g(info, "info");
        super.i7(info);
        if (info.getInteger(0) == 3) {
            this.f230538q.postValue(info);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            r0 = 1
            androidx.lifecycle.j0 r1 = r4.f230538q
            r2 = 0
            if (r6 == 0) goto L1f
            android.view.View r6 = r4.f7(r4)
            r3 = 0
            if (r6 == 0) goto L14
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L14
            r3 = r0
        L14:
            if (r3 != 0) goto L17
            goto L1f
        L17:
            java.lang.Object r6 = r1.getValue()
            r1.setValue(r6)
            goto L22
        L1f:
            r1.setValue(r2)
        L22:
            r4.a7(r5, r4)
            kotlinx.coroutines.r2 r5 = r4.f230540s
            if (r5 == 0) goto L2c
            kotlinx.coroutines.p2.a(r5, r2, r0, r2)
        L2c:
            r4.f230540s = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.k1.m7(java.lang.String, boolean):void");
    }

    public final void n7(int i17, int i18, java.lang.Long l17) {
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.o("entrance_type", i18);
        gVar.h("entrance_id", l17);
        gVar.o("strategy_id", this.f230541t);
        gVar.p("guide_live_id", this.f230542u);
        gVar.h("guide_finderusername", this.f230543v);
        zy2.zb.j5(zbVar, 36L, gVar.toString(), null, 4, null);
    }

    public final void o7(int i17) {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.B2;
        cl0.g gVar = new cl0.g();
        gVar.o("strategy_id", this.f230541t);
        gVar.o("type", i17);
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mars.xlog.Log.i("FinderCreateLiveGuideController", "onViewMount");
        this.f230538q.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.f1(this));
    }

    @Override // df2.de, if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        m7("onViewUnmount", true);
        super.onViewUnmount(pluginLayout);
    }
}
