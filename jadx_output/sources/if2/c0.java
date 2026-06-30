package if2;

/* loaded from: classes3.dex */
public final class c0 extends java.util.HashMap {

    /* renamed from: d, reason: collision with root package name */
    public final int f291104d;

    public c0(int i17) {
        this.f291104d = i17;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore.Companion.getClass();
        str = com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore.TAG;
        com.tencent.mars.xlog.Log.i(str, "clear(" + hashCode() + ')');
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object get(java.lang.Object obj) {
        return super.get(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore.Companion.getClass();
        str = com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore.TAG;
        com.tencent.mars.xlog.Log.i(str, "put(" + hashCode() + ") ,LiveRoomController(" + this.f291104d + ") " + obj);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object remove(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore.Companion.getClass();
        str = com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore.TAG;
        com.tencent.mars.xlog.Log.i(str, "remove(" + hashCode() + ") " + obj);
        return super.remove(obj);
    }
}
