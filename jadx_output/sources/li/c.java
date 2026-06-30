package li;

/* loaded from: classes12.dex */
public class c implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ li.d f318743d;

    public c(li.d dVar) {
        this.f318743d = dVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        new java.lang.Thread(new li.b(this, iBinder)).start();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        try {
            this.f318743d.f318745h.unbindService(this);
        } catch (java.lang.Throwable th6) {
            oj.j.d("matrix.OpenglLeakPlugin", th6, "unbindService Error", new java.lang.Object[0]);
        }
    }
}
