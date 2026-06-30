package df2;

/* loaded from: classes3.dex */
public final class v6 extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        r45.xc2 xc2Var = new r45.xc2();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        sg2.a0 a0Var = sg2.a0.f407882a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(sg2.a0.f407884c);
        linkedList.addAll(arrayList);
        xc2Var.set(0, linkedList);
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        xc2Var.set(1, java.lang.Long.valueOf(tq5.i.f421269a));
        dk2.ef.f233392k.e(18, xc2Var, new df2.u6(r45.yc2.class), false);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        dk2.ef.f233392k.f(18);
    }
}
