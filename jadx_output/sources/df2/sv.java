package df2;

/* loaded from: classes3.dex */
public final class sv extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f231374m;

    /* renamed from: n, reason: collision with root package name */
    public long f231375n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f231374m = null;
    }
}
