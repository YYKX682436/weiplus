package df2;

/* loaded from: classes3.dex */
public final class x4 extends df2.de implements df2.l9 {

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.yx f231756p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.lifecycle.j0 f231757q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.r2 f231758r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231757q = new androidx.lifecycle.j0();
    }

    @Override // df2.l9
    public void b5() {
        m7("autoDismiss", false);
    }

    @Override // df2.l9
    public java.lang.String getTag() {
        return "FinderLiveSwitchStreamGuideController";
    }

    @Override // df2.de
    public void i7(r45.tm1 info) {
        kotlin.jvm.internal.o.g(info, "info");
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
            androidx.lifecycle.j0 r1 = r4.f231757q
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
            kotlinx.coroutines.r2 r5 = r4.f231758r
            if (r5 == 0) goto L2c
            kotlinx.coroutines.p2.a(r5, r2, r0, r2)
        L2c:
            r4.f231758r = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.x4.m7(java.lang.String, boolean):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mars.xlog.Log.i("FinderLiveSwitchStreamGuideController", "onViewMount");
        this.f231757q.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.s4(this));
    }

    @Override // df2.de, if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewUnmount(pluginLayout);
        m7("onViewUnmount", true);
    }
}
