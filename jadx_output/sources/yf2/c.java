package yf2;

/* loaded from: classes3.dex */
public final class c extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f461665m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f461666n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mars.xlog.Log.i("FinderStartLiveCloseController", "onViewMount: Creating close UI");
        this.f461665m = pluginLayout.findViewById(com.tencent.mm.R.id.thm);
        this.f461666n = pluginLayout.findViewById(com.tencent.mm.R.id.tho);
        android.view.View view = this.f461665m;
        if (view != null) {
            view.setOnClickListener(new yf2.a(this));
        }
        android.view.View view2 = this.f461665m;
        if (view2 != null) {
            view2.setOnTouchListener(new yf2.b(this));
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        com.tencent.mars.xlog.Log.i("FinderStartLiveCloseController", "onViewUnmount: Cleaning up close button");
        this.f461665m = null;
        this.f461666n = null;
    }
}
