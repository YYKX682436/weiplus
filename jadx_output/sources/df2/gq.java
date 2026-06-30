package df2;

/* loaded from: classes3.dex */
public final class gq extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230237m;

    /* renamed from: n, reason: collision with root package name */
    public r45.fu1 f230238n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.et f230239o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230237m = "LivePrizeController";
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z6(df2.gq r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.gq.Z6(df2.gq, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.tencent.mm.plugin.finder.live.widget.et a7() {
        com.tencent.mm.plugin.finder.live.widget.et etVar = this.f230239o;
        if (etVar == null) {
            if (this.f291099e != null) {
                android.content.Context O6 = O6();
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store = getStore();
                com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
                kotlin.jvm.internal.o.e(ubVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
                etVar = new com.tencent.mm.plugin.finder.live.widget.et(O6, store, (com.tencent.mm.plugin.finder.live.view.k0) ubVar);
            } else {
                etVar = null;
            }
            this.f230239o = etVar;
        }
        return etVar;
    }

    public final void b7() {
        if (zl2.r4.f473950a.y1(getStore().getLiveRoomData())) {
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.dq(this, null), 3, null);
        }
    }

    public final void c7(yz5.l lVar) {
        if (!zl2.r4.f473950a.y1(getStore().getLiveRoomData())) {
            if (lVar != null) {
                com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.fq(lVar, this, null), 3, null);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.et a76 = a7();
        boolean z17 = false;
        if (a76 != null && a76.P()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.eq(this, lVar, null), 3, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        super.onLiveMsg(r71Var);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f230239o = null;
    }
}
