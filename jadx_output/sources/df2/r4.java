package df2;

/* loaded from: classes3.dex */
public final class r4 extends df2.de implements df2.l9 {

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.j0 f231220p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r2 f231221q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231220p = new androidx.lifecycle.j0();
    }

    @Override // df2.l9
    public void b5() {
        m7("autoDismiss", false);
    }

    @Override // df2.l9
    public java.lang.String getTag() {
        return "FinderLiveSubscribeNextLiveGuideController";
    }

    @Override // df2.de
    public void i7(r45.tm1 info) {
        kotlin.jvm.internal.o.g(info, "info");
        super.i7(info);
        if (info.getInteger(0) == 4) {
            this.f231220p.postValue(info);
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
            androidx.lifecycle.j0 r1 = r4.f231220p
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
            kotlinx.coroutines.r2 r5 = r4.f231221q
            if (r5 == 0) goto L2c
            kotlinx.coroutines.p2.a(r5, r2, r0, r2)
        L2c:
            r4.f231221q = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.r4.m7(java.lang.String, boolean):void");
    }

    public final void n7(long j17, java.lang.String str) {
        kotlinx.coroutines.r2 r2Var = this.f231221q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f231221q = com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.m4(str, j17, this, null), 3, null);
    }

    public final void o7(int i17) {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f327244l2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", i17);
        jSONObject.put("notice_id", 0);
        jSONObject.put("notice_type", 2);
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mars.xlog.Log.i("FinderLiveSubscribeNextLiveGuideController", "onViewMount");
        this.f231220p.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.n4(this));
    }

    @Override // df2.de, if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewUnmount(pluginLayout);
        m7("onViewUnmount", true);
    }
}
