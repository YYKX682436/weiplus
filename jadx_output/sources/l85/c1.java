package l85;

/* loaded from: classes12.dex */
public class c1 extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f317136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317137g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317138h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f317139i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.ServiceConnection f317140m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f317141n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f317142o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f317143p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(android.content.Intent intent, android.content.Intent intent2, java.lang.String str, java.lang.String str2, android.content.Intent intent3, android.content.ServiceConnection serviceConnection, boolean z17, int i17, android.content.Context context) {
        super(intent);
        this.f317136f = intent2;
        this.f317137g = str;
        this.f317138h = str2;
        this.f317139i = intent3;
        this.f317140m = serviceConnection;
        this.f317141n = z17;
        this.f317142o = i17;
        this.f317143p = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.content.Intent intent = this.f317136f;
        java.lang.String className = intent.getComponent().getClassName();
        java.lang.String str = this.f317137g;
        java.lang.String str2 = this.f317138h;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected()", className, str, str2);
        l85.l1.a(33L, 1L, false);
        java.util.Vector vector = l85.h1.f317179c;
        android.content.Intent intent2 = this.f317139i;
        if (vector.contains(intent2)) {
            if (iBinder == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected() service == null", intent.getComponent().getClassName(), str, str2);
                return;
            }
            try {
                try {
                    l85.n0 d17 = l85.l0.d(iBinder);
                    d17.og(intent2, new l85.b1(this));
                    l85.h1.f317177a.put(str2, d17);
                } catch (java.lang.Exception e17) {
                    if (this.f317141n) {
                        l85.h1.a(this.f317139i, this.f317140m, this.f317142o, this.f317138h, false, this.f317136f);
                        l85.l1.a(36L, 1L, false);
                    }
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService()  ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected() exception = %s stack[%s]", intent.getComponent().getClassName(), str, str2, e17.getMessage(), new com.tencent.mm.sdk.platformtools.z3());
                    l85.l1.a(34L, 1L, false);
                    vector = l85.h1.f317179c;
                }
                vector.remove(intent2);
            } catch (java.lang.Throwable th6) {
                l85.h1.f317179c.remove(intent2);
                throw th6;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f317177a;
        java.lang.String str = this.f317138h;
        concurrentHashMap.remove(str);
        this.f317143p.unbindService(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceDisconnected()", this.f317136f.getComponent().getClassName(), this.f317137g, str);
        l85.l1.a(35L, 1L, false);
    }
}
