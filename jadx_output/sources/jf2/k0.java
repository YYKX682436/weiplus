package jf2;

/* loaded from: classes3.dex */
public final class k0 extends if2.b implements if2.e {

    /* renamed from: y, reason: collision with root package name */
    public static final jf2.x f299377y = new jf2.x(null);

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f299378m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f299379n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f299380o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f299381p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f299382q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f299383r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f299384s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f299385t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f299386u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f299387v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f299388w;

    /* renamed from: x, reason: collision with root package name */
    public jf2.g f299389x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f299379n = kz5.c0.i(14, 20, 15, 27, 22, 10, 11, 21, 16, 7, 19, 12, 17);
        this.f299380o = new java.util.LinkedList();
        this.f299381p = new java.util.LinkedList();
        this.f299382q = new java.util.LinkedList();
        this.f299383r = new java.util.LinkedList();
        this.f299384s = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f299385t = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f299386u = jz5.h.b(new jf2.b0(this));
        this.f299387v = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f299388w = jz5.h.b(new jf2.y(this));
    }

    public final java.lang.String Z6(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((jf2.o) it.next()).type()));
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                sb6.append(((java.lang.Number) it6.next()).intValue());
                sb6.append("-");
            }
            java.lang.String sb7 = sb6.toString();
            if (sb7 != null) {
                return r26.n0.Z(sb7, "-");
            }
        }
        return "";
    }

    public final void a7(java.lang.String scene, boolean z17) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i("LiveVisitorBottomEntranceController", "[calculateFoldedState-" + scene + "], forceRefresh = " + z17);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new jf2.a0(scene, this, z17, null), 3, null);
    }

    public final int b7() {
        return U6() ? i65.a.f(O6(), com.tencent.mm.R.dimen.f479688cn) : i65.a.f(O6(), com.tencent.mm.R.dimen.f479672c9);
    }

    public final int c7() {
        return !U6() ? (d7() - i65.a.f(O6(), com.tencent.mm.R.dimen.f479653br)) - ((java.lang.Number) ((jz5.n) this.f299388w).getValue()).intValue() : d7();
    }

    public final int d7() {
        return java.lang.Math.min(com.tencent.mm.ui.bl.b(O6()).x, com.tencent.mm.ui.bl.b(O6()).y);
    }

    public final int e7(xt2.o6 o6Var) {
        return o6Var.x(xt2.n6.f456912d, O6());
    }

    public final boolean f7(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f299382q.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jf2.o) obj).type() == i17) {
                break;
            }
        }
        return obj != null;
    }

    public final boolean g7(jf2.o view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f299382q.contains(view);
    }

    public final void h7(jf2.o entrance) {
        kotlin.jvm.internal.o.g(entrance, "entrance");
        java.util.LinkedList linkedList = this.f299380o;
        if (linkedList.contains(entrance)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("LiveVisitorBottomEntranceController", "registerEntrance = " + entrance);
        linkedList.add(entrance);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        this.f299378m = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveMsg(r45.r71 r71Var) {
        super.onLiveMsg(r71Var);
        a7("onLiveMsg", false);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.ic1 ic1Var;
        java.util.LinkedList list;
        super.onLiveStart(hc1Var);
        if (hc1Var != null && (ic1Var = (r45.ic1) hc1Var.getCustom(85)) != null && (list = ic1Var.getList(7)) != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                com.tencent.mars.xlog.Log.i("LiveVisitorBottomEntranceController", "priority_list:" + list);
                this.f299378m = list;
            }
        }
        a7("onJoinLive", false);
        pm0.v.V(3000L, new jf2.i0(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        jf2.k0 k0Var;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mars.xlog.Log.i("LiveVisitorBottomEntranceController", "onViewMount");
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = (com.tencent.mm.plugin.finder.live.plugin.ag0) R6(com.tencent.mm.plugin.finder.live.plugin.ag0.class);
        boolean z17 = true;
        if (ag0Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : ag0Var.M) {
                if ((obj instanceof jf2.o) && ((jf2.o) obj).u()) {
                    arrayList.add(obj);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                jf2.o oVar = next instanceof jf2.o ? (jf2.o) next : null;
                if (oVar != null && (k0Var = (jf2.k0) ag0Var.U0(jf2.k0.class)) != null) {
                    k0Var.h7(oVar);
                }
            }
        }
        java.util.LinkedList linkedList = this.f299378m;
        if (linkedList != null && !linkedList.isEmpty()) {
            z17 = false;
        }
        if (!z17) {
            a7("onViewMount", false);
        }
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new jf2.g0(this, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        com.tencent.mars.xlog.Log.i("LiveVisitorBottomEntranceController", "onViewUnmount");
        this.f299380o.clear();
        this.f299381p.clear();
        this.f299382q.clear();
        this.f299383r.clear();
        this.f299389x = null;
    }
}
