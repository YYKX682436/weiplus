package l85;

/* loaded from: classes12.dex */
public class x0 implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f317229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f317232g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.ServiceConnection f317233h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f317234i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f317235m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f317236n;

    public x0(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.Intent intent2, android.content.ServiceConnection serviceConnection, boolean z17, int i17, android.content.Context context) {
        this.f317229d = intent;
        this.f317230e = str;
        this.f317231f = str2;
        this.f317232g = intent2;
        this.f317233h = serviceConnection;
        this.f317234i = z17;
        this.f317235m = i17;
        this.f317236n = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.content.Intent intent = this.f317229d;
        java.lang.String className = intent.getComponent().getClassName();
        java.lang.String str = this.f317230e;
        java.lang.String str2 = this.f317231f;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindServiceNotAutoCreate() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected()", className, str, str2);
        l85.l1.a(33L, 1L, false);
        java.util.Vector vector = l85.h1.f317179c;
        android.content.Intent intent2 = this.f317232g;
        if (!vector.contains(intent2)) {
            l85.h1.f317183g = false;
            return;
        }
        if (iBinder == null) {
            l85.h1.f317183g = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindServiceNotAutoCreate() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected() service == null", intent.getComponent().getClassName(), str, str2);
            return;
        }
        try {
            try {
                l85.n0 d17 = l85.l0.d(iBinder);
                d17.og(intent2, new l85.w0(this));
                l85.h1.f317177a.put(str2, d17);
            } catch (java.lang.Exception e17) {
                l85.h1.f317183g = false;
                if (this.f317234i) {
                    l85.h1.a(this.f317232g, this.f317233h, this.f317235m, this.f317231f, false, this.f317229d);
                    l85.l1.a(36L, 1L, false);
                }
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMServiceHelper", e17, "bindServiceNotAutoCreate()  ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected() exception = %s stack[%s]", intent.getComponent().getClassName(), str, str2, e17.getMessage(), new com.tencent.mm.sdk.platformtools.z3());
                l85.l1.a(34L, 1L, false);
                vector = l85.h1.f317179c;
            }
            vector.remove(intent2);
        } catch (java.lang.Throwable th6) {
            l85.h1.f317179c.remove(intent2);
            throw th6;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f317177a;
        java.lang.String str = this.f317231f;
        concurrentHashMap.remove(str);
        this.f317236n.unbindService(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceDisconnected()", this.f317229d.getComponent().getClassName(), this.f317230e, str);
        l85.l1.a(35L, 1L, false);
    }
}
