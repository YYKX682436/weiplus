package if2;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qs5.o f291137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(qs5.o oVar, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore) {
        super(0);
        this.f291137d = oVar;
        this.f291138e = liveRoomControllerStore;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2;
        qs5.o oVar = qs5.o.f366451d;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = this.f291138e;
        qs5.o mode = this.f291137d;
        if (mode == oVar) {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore.Companion.getClass();
            str2 = com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore.TAG;
            com.tencent.mars.xlog.Log.i(str2, com.tencent.tinker.loader.shareutil.ShareConstants.RES_STORE_TITLE + liveRoomControllerStore.hashCode() + " mode invalid, skip initController");
        } else if (liveRoomControllerStore.hasInitialized()) {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore.Companion.getClass();
            str = com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore.TAG;
            com.tencent.mars.xlog.Log.i(str, com.tencent.tinker.loader.shareutil.ShareConstants.RES_STORE_TITLE + liveRoomControllerStore.hashCode() + " hasInitialized, skip initController");
        } else {
            if2.z zVar = if2.z.f291153a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(if2.z.f291154b);
            java.util.Map map = if2.z.f291155c;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) map).entrySet()) {
                if (((java.util.List) entry.getValue()).contains(mode)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            arrayList.addAll(linkedHashMap.keySet());
            kotlin.jvm.internal.o.g(mode, "mode");
            java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
            qs5.o oVar2 = qs5.o.f366452e;
            linkedHashMap2.put(yf2.c.class, kz5.b0.c(oVar2));
            java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
            linkedHashMap3.put(yf2.z.class, kz5.b0.c(oVar2));
            linkedHashMap3.put(df2.yp.class, kz5.b0.c(oVar2));
            linkedHashMap2.putAll(linkedHashMap3);
            java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
            linkedHashMap4.put(yf2.i2.class, kz5.b0.c(oVar2));
            linkedHashMap4.put(com.tencent.mm.plugin.finder.live.widget.u70.class, kz5.b0.c(oVar2));
            linkedHashMap2.putAll(linkedHashMap4);
            linkedHashMap2.put(com.tencent.mm.plugin.finder.live.viewmodel.r5.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(yf2.m1.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(yf2.o.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(yf2.s0.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(yf2.t1.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(yf2.z0.class, kz5.c0.i(oVar2, qs5.o.f366454g, qs5.o.f366453f));
            linkedHashMap2.put(yf2.g0.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(df2.jx.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(df2.fi.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(df2.wi.class, kz5.b0.c(oVar2));
            linkedHashMap2.put(yf2.q.class, kz5.b0.c(oVar2));
            java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
            for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (((java.util.List) entry2.getValue()).contains(mode)) {
                    linkedHashMap5.put(entry2.getKey(), entry2.getValue());
                }
            }
            arrayList.addAll(kz5.n0.S0(linkedHashMap5.keySet()));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                java.lang.Class cls = (java.lang.Class) it.next();
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore.Companion.getClass();
                liveRoomControllerStore.getControllers().add((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) new androidx.lifecycle.j1(liveRoomControllerStore.getViewModel(), new if2.a0(liveRoomControllerStore)).b(liveRoomControllerStore.getKey(cls), cls));
            }
            java.util.Iterator<T> it6 = liveRoomControllerStore.getControllers().iterator();
            while (it6.hasNext()) {
                ((com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it6.next()).onLiveActivate();
            }
        }
        return jz5.f0.f302826a;
    }
}
