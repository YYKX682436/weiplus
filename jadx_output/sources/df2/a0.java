package df2;

/* loaded from: classes3.dex */
public final class a0 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final zg2.d f229647m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        zg2.d dVar = new zg2.d(null, 1, null);
        dVar.f472822d = new df2.z(this);
        this.f229647m = dVar;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
    }
}
