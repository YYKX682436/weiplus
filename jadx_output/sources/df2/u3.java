package df2;

/* loaded from: classes3.dex */
public final class u3 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.uv f231497m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6(int i17, yz5.a aVar) {
        java.lang.String str;
        xh2.e eVar = (xh2.e) ((mm2.y2) business(mm2.y2.class)).B.getValue();
        if (eVar == null || (str = eVar.f454544b) == null) {
            str = "";
        }
        com.tencent.mm.plugin.finder.live.widget.uv uvVar = this.f231497m;
        boolean z17 = false;
        if (uvVar != null && uvVar.q()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveSetMicTopicController", "openMicTopicWidget: isShowing");
            return;
        }
        this.f231497m = new com.tencent.mm.plugin.finder.live.widget.uv(O6(), new df2.t3(this, aVar, i17));
        boolean z18 = ((mm2.e1) business(mm2.e1.class)).Z6() ? ((mm2.y2) business(mm2.y2.class)).C : true;
        com.tencent.mm.plugin.finder.live.widget.uv uvVar2 = this.f231497m;
        if (uvVar2 != null) {
            uvVar2.A(str, z18);
        }
    }
}
