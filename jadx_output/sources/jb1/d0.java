package jb1;

/* loaded from: classes7.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final jb1.d0 f298705a = new jb1.d0();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f298706b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.v0 f298707c;

    /* renamed from: d, reason: collision with root package name */
    public static com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o f298708d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f298709e;

    public final void a() {
        synchronized (this) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) f298706b;
            java.util.ArrayList<jb1.a0> arrayList = new java.util.ArrayList(concurrentHashMap.size());
            java.util.Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((jb1.a0) ((java.util.Map.Entry) it.next()).getValue());
            }
            for (jb1.a0 a0Var : arrayList) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BLE.PeripheralBleServerManager", "destroy server #" + a0Var.f298691d);
                a0Var.c();
            }
            ((java.util.concurrent.ConcurrentHashMap) f298706b).clear();
        }
    }

    public final jb1.a0 b(int i17) {
        if (f298709e) {
            return null;
        }
        return (jb1.a0) ((java.util.concurrent.ConcurrentHashMap) f298706b).get(java.lang.Integer.valueOf(i17));
    }
}
