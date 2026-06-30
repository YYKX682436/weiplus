package l85;

/* loaded from: classes12.dex */
public class f1 extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317164f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317165g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f317166h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f317167i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.ServiceConnection f317168m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f317169n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f317170o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.Intent intent2, boolean z17, android.content.ServiceConnection serviceConnection, android.content.Intent intent3, android.content.Context context) {
        super(intent);
        this.f317164f = str;
        this.f317165g = str2;
        this.f317166h = intent2;
        this.f317167i = z17;
        this.f317168m = serviceConnection;
        this.f317169n = intent3;
        this.f317170o = context;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        l85.l1.a(48L, 1L, false);
        java.lang.String str = this.f317164f;
        java.lang.String str2 = this.f317165g;
        if (iBinder == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s onServiceConnected() service == null", str, str2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s onServiceConnected()", str, str2);
        try {
            l85.n0 d17 = l85.l0.d(iBinder);
            d17.nb(this.f317166h);
            l85.h1.f317177a.put(str2, d17);
        } catch (java.lang.Exception e17) {
            if (this.f317167i) {
                l85.h1.g(this.f317168m, str2, false, this.f317169n);
                l85.l1.a(51L, 1L, false);
            }
            l85.l1.a(49L, 1L, false);
            java.lang.String message = e17.getMessage();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s onServiceConnected() exception = %s stack[%s]", str, str2, message, new com.tencent.mm.sdk.platformtools.z3());
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        java.lang.String str = this.f317164f;
        java.lang.String str2 = this.f317165g;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s onServiceDisconnected()", str, str2);
        l85.h1.f317177a.remove(str2);
        this.f317170o.unbindService(this);
        l85.l1.a(50L, 1L, false);
    }
}
