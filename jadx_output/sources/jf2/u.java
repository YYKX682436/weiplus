package jf2;

/* loaded from: classes3.dex */
public final class u extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f299398m;

    /* renamed from: n, reason: collision with root package name */
    public final int f299399n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f299400o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f299401p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f299402q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f299403r;

    /* renamed from: s, reason: collision with root package name */
    public final jf2.w f299404s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f299398m = "LiveAnchorBottomEntranceController";
        this.f299399n = 4;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f299400o = linkedList;
        this.f299401p = new java.util.LinkedList();
        this.f299402q = new java.util.LinkedList();
        this.f299403r = new java.util.LinkedList();
        this.f299404s = new jf2.w(store, linkedList);
    }

    public static void a7(jf2.u uVar, java.lang.String scene, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        uVar.getClass();
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i(uVar.f299398m, "[calculateFoldedState-" + scene + "], forceRefresh = " + z17);
        com.tencent.mm.plugin.finder.live.util.y.d(uVar, null, null, new jf2.r(uVar, scene, z17, null), 3, null);
    }

    public final java.lang.String Z6(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((jf2.h) it.next()).type()));
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

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r4.f() == true) goto L10;
     */
    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLiveMsg(r45.r71 r4) {
        /*
            r3 = this;
            super.onLiveMsg(r4)
            tn0.w0 r4 = r3.Q6()
            r0 = 0
            if (r4 == 0) goto L16
            kn0.p r4 = r4.D
            if (r4 == 0) goto L16
            boolean r4 = r4.f()
            r1 = 1
            if (r4 != r1) goto L16
            goto L17
        L16:
            r1 = r0
        L17:
            if (r1 == 0) goto L1a
            return
        L1a:
            r4 = 2
            r1 = 0
            java.lang.String r2 = "onLiveMsg"
            a7(r3, r2, r0, r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jf2.u.onLiveMsg(r45.r71):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        a7(this, "onLiveStart", false, 2, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f299400o.clear();
        this.f299401p.clear();
        this.f299402q.clear();
        this.f299403r.clear();
    }
}
