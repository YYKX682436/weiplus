package df2;

/* loaded from: classes10.dex */
public final class a7 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f229683m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f229684n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f229685o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f229683m = "Finder.GiftEffectPlayQueueController";
        this.f229684n = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public final void Z6(java.lang.String tag, java.util.List list) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(list, "list");
        this.f229684n.addAll(list);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkStartJob-");
        sb6.append(tag);
        sb6.append("] displayGiftJob: isCancelled=");
        kotlinx.coroutines.r2 r2Var = this.f229685o;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.isCancelled()) : null);
        sb6.append(", isCompleted=");
        kotlinx.coroutines.r2 r2Var2 = this.f229685o;
        sb6.append(r2Var2 != null ? java.lang.Boolean.valueOf(r2Var2.A()) : null);
        com.tencent.mars.xlog.Log.i(this.f229683m, sb6.toString());
        kotlinx.coroutines.r2 r2Var3 = this.f229685o;
        if ((r2Var3 == null || r2Var3.isCancelled()) ? false : true) {
            kotlinx.coroutines.r2 r2Var4 = this.f229685o;
            if ((r2Var4 == null || r2Var4.A()) ? false : true) {
                return;
            }
        }
        this.f229685o = com.tencent.mm.plugin.finder.live.util.y.d(this, kotlinx.coroutines.q1.f310570c, null, new df2.z6(this, null), 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLivePause() {
        this.f229684n.clear();
        kotlinx.coroutines.r2 r2Var = this.f229685o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f229685o = null;
    }
}
