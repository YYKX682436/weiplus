package df2;

/* loaded from: classes3.dex */
public final class qu extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        r45.zc2 zc2Var = new r45.zc2();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (dk2.ef.f233372a.e() != null) {
            linkedList.add(4);
            linkedList.add(5);
            linkedList.add(6);
        }
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        zc2Var.set(0, linkedList);
        dk2.ef.f233392k.e(29, zc2Var, new df2.pu(this, r45.ad2.class), false);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        dk2.ef.f233392k.f(29);
    }
}
