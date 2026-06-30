package gk2;

/* loaded from: classes.dex */
public final class f extends java.util.HashMap {

    /* renamed from: d, reason: collision with root package name */
    public final int f272477d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f272478e;

    public f(int i17, java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f272477d = i17;
        this.f272478e = tag;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized void clear() {
        com.tencent.mars.xlog.Log.i("LiveContext", "clear(" + hashCode() + ')');
        super.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object get(java.lang.Object obj) {
        return super.get(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mars.xlog.Log.i("LiveContext", "put(" + hashCode() + ") ,buContext(" + this.f272477d + ") buContextTag(" + this.f272478e + ")," + obj);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public synchronized java.lang.Object remove(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("LiveContext", "remove(" + hashCode() + ") " + obj);
        return super.remove(obj);
    }
}
