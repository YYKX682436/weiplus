package fe;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: l, reason: collision with root package name */
    public static final android.util.SparseArray f261352l = new android.util.SparseArray();

    /* renamed from: f, reason: collision with root package name */
    public yg.h f261358f;

    /* renamed from: a, reason: collision with root package name */
    public int f261353a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f261354b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f261355c = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f261356d = "";

    /* renamed from: e, reason: collision with root package name */
    public boolean f261357e = false;

    /* renamed from: g, reason: collision with root package name */
    public int f261359g = -1;

    /* renamed from: h, reason: collision with root package name */
    public float f261360h = -1.0f;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f261361i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final fe.f f261362j = new fe.f(null);

    /* renamed from: k, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.v0 f261363k = new fe.c(this);

    public static fe.g a(java.lang.String str) {
        fe.g gVar;
        int hashCode = str.hashCode();
        android.util.SparseArray sparseArray = f261352l;
        synchronized (sparseArray) {
            gVar = (fe.g) sparseArray.get(hashCode);
            if (gVar == null) {
                gVar = new fe.g();
                sparseArray.put(hashCode, gVar);
            }
        }
        return gVar;
    }

    public static void b(java.lang.String str) {
        fe.g gVar;
        int hashCode = str.hashCode();
        android.util.SparseArray sparseArray = f261352l;
        synchronized (sparseArray) {
            int indexOfKey = sparseArray.indexOfKey(hashCode);
            if (indexOfKey >= 0) {
                gVar = (fe.g) sparseArray.valueAt(indexOfKey);
                sparseArray.removeAt(indexOfKey);
            } else {
                gVar = null;
            }
        }
        if (gVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MBNiReporter", "hy: release!");
            com.tencent.mm.plugin.appbrand.x0.e(gVar.f261356d, gVar.f261363k);
        }
    }
}
