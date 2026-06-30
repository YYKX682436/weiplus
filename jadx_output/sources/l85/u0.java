package l85;

/* loaded from: classes12.dex */
public class u0 extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317219g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f317220h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f317221i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f317222m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f317223n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.Intent intent2, boolean z17, android.content.Intent intent3, android.content.Context context) {
        super(intent);
        this.f317218f = str;
        this.f317219g = str2;
        this.f317220h = intent2;
        this.f317221i = z17;
        this.f317222m = intent3;
        this.f317223n = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        android.content.Intent intent = this.f317220h;
        l85.l1.a(18L, 1L, false);
        java.lang.String str = this.f317218f;
        java.lang.String str2 = this.f317219g;
        if (iBinder == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s onServiceConnected() service == null", str, str2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s onServiceConnected()", str, str2);
        try {
            l85.n0 d17 = l85.l0.d(iBinder);
            d17.stopService(intent);
            l85.h1.f317177a.put(str2, d17);
        } catch (java.lang.Exception e17) {
            if (this.f317221i) {
                l85.h1.f(intent, str2, false, this.f317222m);
                l85.l1.a(21L, 1L, false);
            }
            java.lang.String message = e17.getMessage();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "stopService ClassName = %s ProcessName = %s onServiceConnected() exception = %s stack[%s]", str, str2, message, new com.tencent.mm.sdk.platformtools.z3());
            l85.l1.a(19L, 1L, false);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f317177a;
        java.lang.String str = this.f317219g;
        concurrentHashMap.remove(str);
        this.f317223n.unbindService(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s onServiceDisconnected()", this.f317218f, str);
        l85.l1.a(20L, 1L, false);
    }
}
