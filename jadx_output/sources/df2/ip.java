package df2;

/* loaded from: classes3.dex */
public final class ip extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230418m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f230419n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.j0 f230420o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.j0 f230421p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Long f230422q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Long f230423r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230418m = "LivePkgGiftBubbleGuideController";
        this.f230420o = new androidx.lifecycle.j0();
        this.f230421p = new androidx.lifecycle.j0();
    }

    public final void Z6() {
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.tb tbVar = dk2.ef.f233392k;
        tbVar.f(26);
        r45.kc2 kc2Var = new r45.kc2();
        kc2Var.set(0, this.f230419n);
        tbVar.e(26, kc2Var, new df2.hp(this, r45.lc2.class), true);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233392k.f(26);
        this.f230419n = null;
        this.f230422q = null;
        this.f230423r = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        Z6();
    }
}
