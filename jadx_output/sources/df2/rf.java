package df2;

/* loaded from: classes3.dex */
public final class rf extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        java.util.Collections.synchronizedList(new java.util.ArrayList());
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        super.onLiveActivate();
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = ((mm2.x4) getStore().business(mm2.x4.class)).f329528f;
        kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
        arrayList.addAll(list);
        dk2.q5 q5Var = dk2.q5.f233939a;
        pm0.v.w(new dk2.m5(((mm2.e1) getStore().business(mm2.e1.class)).f328988r.getLong(0), arrayList));
        super.onLiveDeactivate();
    }
}
