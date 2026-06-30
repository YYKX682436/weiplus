package l85;

/* loaded from: classes12.dex */
public class g1 extends l85.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f317173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f317174h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f317175i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(android.content.Intent intent, java.lang.String str, android.content.Context context, boolean z17, android.content.Intent intent2) {
        super(intent);
        this.f317172f = str;
        this.f317173g = context;
        this.f317174h = z17;
        this.f317175i = intent2;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        java.lang.String str = this.f317172f;
        if (iBinder == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startProcessService() ProcessName = %s onServiceConnected() service == null", str);
            return;
        }
        l85.h1.f317177a.put(str, l85.l0.d(iBinder));
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startProcessService() ProcessName = %s onServiceConnected()", str);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = l85.h1.f317177a;
        java.lang.String str = this.f317172f;
        concurrentHashMap.remove(str);
        this.f317173g.unbindService(this);
        if (this.f317174h) {
            l85.h1.d(str, false, this.f317175i);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "startProcessService() ProcessName = %s onServiceDisconnected()", str);
        l85.l1.a(4L, 1L, false);
    }
}
