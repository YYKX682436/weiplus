package va3;

/* loaded from: classes15.dex */
public class f0 {

    /* renamed from: j, reason: collision with root package name */
    public i11.e f434287j;

    /* renamed from: b, reason: collision with root package name */
    public final va3.e0 f434279b = new va3.e0(this);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f434280c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public double f434281d = 900.0d;

    /* renamed from: e, reason: collision with root package name */
    public double f434282e = 900.0d;

    /* renamed from: f, reason: collision with root package name */
    public double f434283f = -1000.0d;

    /* renamed from: g, reason: collision with root package name */
    public double f434284g = -1000.0d;

    /* renamed from: h, reason: collision with root package name */
    public double f434285h = 0.0d;

    /* renamed from: i, reason: collision with root package name */
    public boolean f434286i = false;

    /* renamed from: k, reason: collision with root package name */
    public final i11.c f434288k = new va3.c0(this);

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.SensorManager f434278a = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");

    public void a(va3.d0 d0Var) {
        java.util.HashSet hashSet = this.f434280c;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null && ((va3.d0) weakReference.get()).equals(d0Var)) {
                return;
            }
        }
        hashSet.add(new java.lang.ref.WeakReference(d0Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.OrientationSensorMgr", "registerSensorListener %d", java.lang.Integer.valueOf(hashSet.size()));
        if (hashSet.size() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OrientationSensorMgr", "registerSensor ");
            if (this.f434287j == null) {
                ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                this.f434287j = i11.h.e();
            }
            ((i11.h) this.f434287j).j(this.f434288k, true);
            android.hardware.SensorManager sensorManager = this.f434278a;
            sensorManager.registerListener(this.f434279b, sensorManager.getDefaultSensor(3), 1);
        }
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.OrientationSensorMgr", "unregisterSensor ");
        this.f434278a.unregisterListener(this.f434279b);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        i11.h.e().m(this.f434288k);
    }

    public void c(va3.d0 d0Var) {
        java.util.HashSet hashSet = this.f434280c;
        if (hashSet == null || d0Var == null) {
            return;
        }
        java.util.Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference != null && weakReference.get() != null && ((va3.d0) weakReference.get()).equals(d0Var)) {
                hashSet.remove(weakReference);
                break;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OrientationSensorMgr", "unregisterSensorListener %d", java.lang.Integer.valueOf(hashSet.size()));
        if (hashSet.size() == 0) {
            b();
        }
    }
}
