package l85;

/* loaded from: classes12.dex */
public class z0 extends l85.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f317240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f317242f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.ServiceConnection f317243g;

    public z0(android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.ServiceConnection serviceConnection) {
        this.f317240d = intent;
        this.f317241e = str;
        this.f317242f = str2;
        this.f317243g = serviceConnection;
    }

    @Override // l85.j0
    public void bd(android.os.IBinder iBinder) {
        java.lang.String className = this.f317240d.getComponent().getClassName();
        java.lang.String str = this.f317242f;
        java.lang.String str2 = this.f317241e;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", className, str2, str);
        if (iBinder == null) {
            return;
        }
        android.content.ComponentName componentName = new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193071a, str2);
        android.content.ServiceConnection serviceConnection = this.f317243g;
        serviceConnection.onServiceConnected(componentName, iBinder);
        l85.h1.f317181e.put(java.lang.Integer.valueOf(serviceConnection.hashCode()), iBinder);
        iBinder.linkToDeath(new l85.y0(this), 0);
    }
}
