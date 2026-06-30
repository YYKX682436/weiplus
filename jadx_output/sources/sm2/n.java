package sm2;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f409580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409581e;

    public n(sm2.o4 o4Var) {
        this.f409581e = o4Var;
    }

    public final boolean a() {
        return this.f409580d;
    }

    public final void b(boolean z17) {
        this.f409580d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        qf2.v0 v0Var;
        boolean z17 = false;
        this.f409580d = false;
        com.tencent.mars.xlog.Log.i(this.f409581e.f409610f, "getNewAnchorPkRunnable invoke");
        fm2.a aVar = this.f409581e.f19595c;
        if (aVar == null || (data = aVar.getData()) == null || (liveRoomControllerStore = data.f309131f) == null || (v0Var = (qf2.v0) liveRoomControllerStore.controller(qf2.v0.class)) == null) {
            return;
        }
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.N0).getValue()).r()).intValue() != 1) {
            com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "getNewAnchorPkInfoData x switch is close");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.List<km2.q> list = ((mm2.o4) v0Var.business(mm2.o4.class)).f329324s;
        kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserList>(...)");
        synchronized (list) {
            for (km2.q qVar : list) {
                java.lang.String str = qVar.f309170a;
                if (str == null) {
                    str = "";
                }
                hashMap.put(str, qVar);
            }
        }
        java.util.List<km2.q> list2 = ((mm2.o4) v0Var.business(mm2.o4.class)).f329325t;
        kotlin.jvm.internal.o.f(list2, "<get-anchorPkMicUserTempList>(...)");
        synchronized (list2) {
            for (km2.q qVar2 : list2) {
                java.lang.String str2 = qVar2.f309170a;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put(str2, qVar2);
            }
        }
        java.util.ArrayList arrayList = zn0.x.f474414a.f474415a;
        kotlin.jvm.internal.o.f(arrayList, "getRemoteUserConfigList(...)");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zn0.v vVar = (zn0.v) it.next();
            if (vVar != null && hashMap.get(vVar.f474406d) == null && !z17) {
                z17 = true;
            }
        }
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "getNewAnchorPkInfoData isNeedRequest: " + z17 + " anchorCacheMap: " + hashMap);
        if (z17) {
            com.tencent.mm.plugin.finder.live.util.y.d(v0Var, kotlinx.coroutines.q1.f310570c, null, new qf2.p0(v0Var, hashMap, null), 2, null);
        }
    }
}
