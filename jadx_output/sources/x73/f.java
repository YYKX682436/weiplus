package x73;

/* loaded from: classes11.dex */
public class f implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x73.g f452446d;

    public f(x73.g gVar) {
        this.f452446d = gVar;
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(android.content.ComponentName componentName) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        android.content.ServiceConnection serviceConnection;
        x73.g gVar = this.f452446d;
        android.content.Context context = gVar.f452447a;
        if (context == null || (serviceConnection = gVar.f452448b) == null) {
            return;
        }
        try {
            context.unbindService(serviceConnection);
        } catch (java.lang.Throwable unused) {
        }
    }
}
