package df2;

/* loaded from: classes3.dex */
public final class c9 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final zg2.d f229867m;

    /* renamed from: n, reason: collision with root package name */
    public r45.kv1 f229868n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        zg2.d dVar = new zg2.d(null, 1, null);
        dVar.f472822d = new df2.b9(this);
        this.f229867m = dVar;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f229868n = null;
    }
}
