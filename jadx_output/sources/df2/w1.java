package df2;

/* loaded from: classes10.dex */
public final class w1 extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public final androidx.lifecycle.j0 f231649m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f231650n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.yc f231651o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231649m = new androidx.lifecycle.j0();
        this.f231650n = new java.util.HashSet();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        r45.tm1 tm1Var;
        super.onLiveMsg(r71Var);
        if (r71Var == null || (tm1Var = (r45.tm1) r71Var.getCustom(43)) == null || tm1Var.getInteger(0) != 5) {
            return;
        }
        this.f231649m.postValue(tm1Var);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        this.f231649m.observe((com.tencent.mm.plugin.finder.live.view.k0) pluginLayout, new df2.s1(this));
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        com.tencent.mm.plugin.finder.live.widget.yc ycVar = this.f231651o;
        if (ycVar != null) {
            ycVar.f120434c.dismiss();
            kotlinx.coroutines.r2 r2Var = ycVar.f120438g;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        }
        this.f231651o = null;
        this.f291103i = null;
    }
}
