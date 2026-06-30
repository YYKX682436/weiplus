package xz4;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public static volatile xz4.d f458265b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f458266c = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f458267a = new java.util.concurrent.ConcurrentHashMap();

    public static xz4.d a() {
        if (f458265b == null) {
            synchronized (f458266c) {
                if (f458265b == null) {
                    f458265b = new xz4.d();
                }
            }
        }
        return f458265b;
    }

    public boolean b() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f458267a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return false;
        }
        java.util.Collection values = concurrentHashMap.values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            arrayList.add((xz4.c) it.next());
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            xz4.c cVar = (xz4.c) it6.next();
            xz4.k kVar = cVar.f458253d;
            if (kVar.f458286j && concurrentHashMap.containsKey(kVar.f458277a)) {
                cVar.f458262p = true;
                try {
                    java.net.HttpURLConnection httpURLConnection = cVar.f458255f;
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.getInputStream().close();
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WePkgDownloadTask", e17.getMessage());
                        }
                        cVar.f458255f.disconnect();
                    }
                    java.util.concurrent.Future future = cVar.f458254e;
                    if (future != null) {
                        future.cancel(false);
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.WePkgDownloadTask", "stop, " + e18.getMessage());
                }
                concurrentHashMap.remove(cVar.f458253d.f458277a);
            }
        }
        arrayList.clear();
        return true;
    }
}
