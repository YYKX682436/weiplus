package tc2;

/* loaded from: classes.dex */
public final class f extends java.util.HashMap {

    /* renamed from: d, reason: collision with root package name */
    public final int f417143d;

    public f(int i17) {
        this.f417143d = i17;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedControllerStore", "clear(" + hashCode() + ')');
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object get(java.lang.Object obj) {
        return super.get(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedControllerStore", "put(" + hashCode() + ") ,FinderFeedController(" + this.f417143d + ") " + obj);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object remove(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedControllerStore", "remove(" + hashCode() + ") " + obj);
        return super.remove(obj);
    }
}
