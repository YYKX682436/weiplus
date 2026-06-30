package df2;

/* loaded from: classes3.dex */
public final class q00 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f231124m;

    /* renamed from: n, reason: collision with root package name */
    public if2.d0 f231125n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q00(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewMount(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r0 = "pluginLayout"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.Class<mm2.c1> r5 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r4.business(r5)
            mm2.c1 r0 = (mm2.c1) r0
            int r0 = r0.Q1
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = pm0.v.z(r0, r1)
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L4a
            androidx.lifecycle.c1 r5 = r4.business(r5)
            mm2.c1 r5 = (mm2.c1) r5
            boolean r5 = r5.S
            if (r5 == 0) goto L4a
            java.lang.Class<mm2.e1> r5 = mm2.e1.class
            androidx.lifecycle.c1 r5 = r4.business(r5)
            mm2.e1 r5 = (mm2.e1) r5
            kn0.i r5 = r5.f328990t
            if (r5 == 0) goto L3b
            kn0.g r5 = r5.f309558b
            if (r5 == 0) goto L3b
            r45.ka4 r5 = r5.f309548o
            if (r5 == 0) goto L3b
            java.lang.String r5 = r5.f378559z
            goto L3c
        L3b:
            r5 = r2
        L3c:
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r5)
            if (r5 != 0) goto L4a
            boolean r5 = r4.U6()
            if (r5 == 0) goto L4a
            r5 = r1
            goto L4b
        L4a:
            r5 = r3
        L4b:
            if (r5 == 0) goto L85
            r5 = 2131307669(0x7f092c95, float:1.8233572E38)
            android.view.View r5 = r4.S6(r5)
            r4.f231124m = r5
            if (r5 == 0) goto L60
            df2.o00 r0 = new df2.o00
            r0.<init>(r4)
            r5.setOnClickListener(r0)
        L60:
            android.view.View r5 = r4.f231124m
            if (r5 == 0) goto L69
            if2.d0 r2 = new if2.d0
            r2.<init>(r5, r4)
        L69:
            r4.f231125n = r2
            df2.p00 r5 = new df2.p00
            r5.<init>(r4)
            r4.f291103i = r5
            if (r2 == 0) goto L77
            r2.d(r3)
        L77:
            java.lang.Class<ml2.r0> r5 = ml2.r0.class
            i95.m r5 = i95.n0.c(r5)
            ml2.r0 r5 = (ml2.r0) r5
            ml2.n1 r0 = ml2.n1.f327723e
            r5.xj(r0, r1)
            goto L8e
        L85:
            if2.d0 r5 = r4.f231125n
            if (r5 == 0) goto L8e
            r0 = 8
            r5.d(r0)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.q00.onViewMount(android.view.ViewGroup):void");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f231124m = null;
        this.f231125n = null;
    }
}
