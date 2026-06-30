package l85;

/* loaded from: classes12.dex */
public class t0 extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317212g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f317213h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f317214i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f317215m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f317216n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.Intent intent2, boolean z17, android.content.Intent intent3, android.content.Context context) {
        super(intent);
        this.f317211f = str;
        this.f317212g = str2;
        this.f317213h = intent2;
        this.f317214i = z17;
        this.f317215m = intent3;
        this.f317216n = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        l85.l1.a(2L, 1L, false);
        java.lang.String str = this.f317211f;
        java.lang.String str2 = this.f317212g;
        if (iBinder == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s onServiceConnected() service == null", str, str2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s onServiceConnected()", str, str2);
        java.util.Vector vector = l85.h1.f317178b;
        android.content.Intent intent = this.f317213h;
        try {
            if (vector.contains(intent)) {
                try {
                    l85.n0 d17 = l85.l0.d(iBinder);
                    d17.startService(intent);
                    l85.h1.f317177a.put(str2, d17);
                    vector.remove(intent);
                } catch (java.lang.Exception e17) {
                    if (this.f317214i) {
                        l85.l1.a(5L, 1L, false);
                        l85.h1.e(intent, str2, false, this.f317215m);
                    }
                    l85.l1.a(3L, 1L, false);
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startService ClassName = %s ProcessName = %s  exception = %s stack[%s]", str, str2, e17.getMessage(), new com.tencent.mm.sdk.platformtools.z3());
                    l85.h1.f317178b.remove(intent);
                }
            }
        } catch (java.lang.Throwable th6) {
            l85.h1.f317178b.remove(intent);
            throw th6;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f317177a;
        java.lang.String str = this.f317212g;
        concurrentHashMap.remove(str);
        this.f317216n.unbindService(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s onServiceDisconnected()", this.f317211f, str);
        l85.l1.a(4L, 1L, false);
    }
}
