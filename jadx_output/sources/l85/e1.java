package l85;

/* loaded from: classes12.dex */
public class e1 extends l85.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f317159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.ServiceConnection f317162g;

    public e1(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.ServiceConnection serviceConnection) {
        this.f317159d = intent;
        this.f317160e = str;
        this.f317161f = str2;
        this.f317162g = serviceConnection;
    }

    @Override // l85.j0
    public void bd(android.os.IBinder iBinder) {
        java.lang.String className = this.f317159d.getComponent().getClassName();
        java.lang.String str = this.f317161f;
        java.lang.String str2 = this.f317160e;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", className, str2, str);
        if (iBinder == null) {
            return;
        }
        android.content.ComponentName componentName = new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, str2);
        android.content.ServiceConnection serviceConnection = this.f317162g;
        serviceConnection.onServiceConnected(componentName, iBinder);
        l85.h1.f317181e.put(java.lang.Integer.valueOf(serviceConnection.hashCode()), iBinder);
        iBinder.linkToDeath(new l85.d1(this), 0);
    }
}
