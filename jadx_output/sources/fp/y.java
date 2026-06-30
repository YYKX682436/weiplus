package fp;

/* loaded from: classes12.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f265243a;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f265244b = 0;

    /* renamed from: c, reason: collision with root package name */
    public android.net.LocalServerSocket f265245c = null;

    public y(java.lang.String str) {
        this.f265243a = str;
    }

    public synchronized void a() {
        if (this.f265245c != null) {
            this.f265244b++;
            return;
        }
        do {
            try {
                this.f265245c = new android.net.LocalServerSocket(this.f265243a + android.os.Process.myUid());
                this.f265244b = this.f265244b + 1;
                break;
            } catch (java.lang.Throwable unused) {
                try {
                    java.lang.Thread.sleep(1L);
                } catch (java.lang.Throwable unused2) {
                }
            }
        } while (this.f265245c != null);
    }

    public synchronized void b() {
        android.net.LocalServerSocket localServerSocket;
        if (this.f265244b == 0) {
            return;
        }
        this.f265244b--;
        if (this.f265244b == 0 && (localServerSocket = this.f265245c) != null) {
            fp.d0.e(localServerSocket);
            this.f265245c = null;
        }
    }

    public synchronized void finalize() {
        android.net.LocalServerSocket localServerSocket = this.f265245c;
        if (localServerSocket != null) {
            fp.d0.e(localServerSocket);
            this.f265245c = null;
        }
        super.finalize();
    }
}
