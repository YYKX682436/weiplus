package jh;

/* loaded from: classes13.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public volatile android.os.Messenger f299762a;

    /* renamed from: b, reason: collision with root package name */
    public volatile android.os.Messenger f299763b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle[] f299764c = {null};

    /* renamed from: d, reason: collision with root package name */
    public final android.os.HandlerThread[] f299765d = {null};

    /* renamed from: e, reason: collision with root package name */
    public final android.content.ServiceConnection f299766e = new jh.w(this);

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f299767f = {false};

    public void a(android.content.Context context) {
        try {
            context.unbindService(this.f299766e);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.WarmUpInvoker", th6, "", new java.lang.Object[0]);
        }
        oj.j.c("Matrix.WarmUpInvoker", "Start disconnecting to remote. (%s)", java.lang.Integer.valueOf(hashCode()));
        synchronized (this.f299765d) {
            android.os.HandlerThread handlerThread = this.f299765d[0];
            if (handlerThread != null) {
                handlerThread.quitSafely();
                this.f299765d[0] = null;
            }
        }
        synchronized (this.f299764c) {
            android.os.Bundle[] bundleArr = this.f299764c;
            bundleArr[0] = null;
            bundleArr.notifyAll();
        }
    }
}
