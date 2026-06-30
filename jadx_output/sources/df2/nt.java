package df2;

/* loaded from: classes3.dex */
public final class nt extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f230882m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f230883n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230884o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230882m = "LivePromoteReportController";
        this.f230883n = java.util.Collections.synchronizedList(new java.util.LinkedList());
    }

    public final void Z6(java.util.List list) {
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = k0Var instanceof com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout ? (com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) k0Var : null;
        r45.qt2 reportObj = finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.getReportObj() : null;
        gk2.e liveRoomData = getStore().getLiveRoomData();
        r45.jn0 jn0Var = new r45.jn0();
        jn0Var.set(1, xy2.c.e(O6()));
        jn0Var.set(0, java.lang.Long.valueOf(((mm2.e1) liveRoomData.a(mm2.e1.class)).f328983m));
        jn0Var.set(2, ((mm2.e1) liveRoomData.a(mm2.e1.class)).f328993w);
        r45.w42 w42Var = new r45.w42();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(list);
        w42Var.set(0, linkedList);
        jn0Var.set(7, w42Var);
        mm2.e1 e1Var = (mm2.e1) efVar.i(mm2.e1.class);
        ((c61.p2) ybVar).Lj(reportObj, 5, jn0Var, e1Var != null ? e1Var.f328993w : null);
    }

    public final void a7(r45.yp5 item) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[report] extInfo = ");
        r45.x42 x42Var = ((mm2.f6) business(mm2.f6.class)).F1;
        if (x42Var == null || (obj = pm0.b0.g(x42Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f230882m;
        com.tencent.mars.xlog.Log.i(str, sb7);
        r45.x42 x42Var2 = ((mm2.f6) business(mm2.f6.class)).F1;
        jz5.f0 f0Var = null;
        if (x42Var2 != null) {
            if (!(x42Var2.getInteger(1) > 0)) {
                x42Var2 = null;
            }
            if (x42Var2 != null) {
                if (!x42Var2.getBoolean(0)) {
                    this.f230883n.add(item);
                    kotlinx.coroutines.r2 r2Var = this.f230884o;
                    if (r2Var != null ? r2Var.a() : false) {
                        com.tencent.mars.xlog.Log.i(str, "delay job running, so add to list enough");
                    } else {
                        com.tencent.mars.xlog.Log.i(str, "no delay job, launch it");
                        this.f230884o = kotlinx.coroutines.l.d(getStore().getLiveRoomData().f272475i, null, null, new df2.mt(x42Var2, this, null), 3, null);
                    }
                }
                f0Var = jz5.f0.f302826a;
            }
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(str, "doReportInternal immediately");
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(item);
            Z6(linkedList);
        }
    }

    public final void b7(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[reportAllItem] fromScene = ");
        sb6.append(str);
        sb6.append(", size = ");
        java.util.List list = this.f230883n;
        sb6.append(list.size());
        com.tencent.mars.xlog.Log.i(this.f230882m, sb6.toString());
        kotlin.jvm.internal.o.d(list);
        java.util.List list2 = list.isEmpty() ^ true ? list : null;
        if (list2 != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(list2);
            Z6(linkedList);
            list.clear();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        kotlinx.coroutines.r2 r2Var = this.f230884o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        b7("onExitLive");
    }
}
