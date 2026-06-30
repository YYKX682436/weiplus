package jh;

/* loaded from: classes13.dex */
public class w implements android.content.ServiceConnection {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jh.y f299760d;

    public w(jh.y yVar) {
        this.f299760d = yVar;
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f299760d.f299763b = new android.os.Messenger(iBinder);
        synchronized (this.f299760d.f299767f) {
            boolean[] zArr = this.f299760d.f299767f;
            zArr[0] = true;
            zArr.notifyAll();
        }
        oj.j.c("Matrix.WarmUpInvoker", "This remote invoker(%s) connected.", this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f299760d.f299763b = null;
        synchronized (this.f299760d.f299767f) {
            boolean[] zArr = this.f299760d.f299767f;
            zArr[0] = false;
            zArr.notifyAll();
        }
        oj.j.c("Matrix.WarmUpInvoker", "This remote invoker(%s) disconnected.", this);
        synchronized (this.f299760d.f299764c) {
            android.os.Bundle[] bundleArr = this.f299760d.f299764c;
            bundleArr[0] = null;
            bundleArr.notifyAll();
        }
    }
}
