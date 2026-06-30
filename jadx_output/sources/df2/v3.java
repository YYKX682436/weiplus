package df2;

/* loaded from: classes3.dex */
public final class v3 extends if2.b implements if2.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.ic1 ic1Var;
        r45.fc1 fc1Var;
        super.onLiveStart(hc1Var);
        boolean z17 = false;
        if (hc1Var != null && (ic1Var = (r45.ic1) hc1Var.getCustom(85)) != null && (fc1Var = (r45.fc1) ic1Var.getCustom(3)) != null && fc1Var.getBoolean(0)) {
            z17 = true;
        }
        if (z17) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.ch1 ch1Var = new r45.ch1();
            ch1Var.set(1, 1000069);
            linkedList.add(new dk2.ff(ch1Var));
            ((mm2.x4) business(mm2.x4.class)).f329530h.addAll(linkedList);
        }
    }
}
