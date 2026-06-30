package df2;

/* loaded from: classes3.dex */
public final class yp extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.mr f231888m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // if2.e
    public void T2(boolean z17, int i17) {
        com.tencent.mm.plugin.finder.live.widget.mr mrVar;
        com.tencent.mm.plugin.finder.live.widget.mr mrVar2 = this.f231888m;
        boolean z18 = false;
        if (mrVar2 != null && mrVar2.P()) {
            z18 = true;
        }
        if (!z18 || (mrVar = this.f231888m) == null) {
            return;
        }
        mrVar.e0(i17);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.plugin.finder.live.widget.mr mrVar = new com.tencent.mm.plugin.finder.live.widget.mr(O6(), getStore().getLiveRoomData());
        this.f231888m = mrVar;
        mrVar.A1 = new df2.xp(this);
    }
}
