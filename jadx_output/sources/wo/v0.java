package wo;

/* loaded from: classes12.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f447818a;

    /* renamed from: b, reason: collision with root package name */
    public volatile android.net.LocalServerSocket f447819b = null;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f447820c = 0;

    public v0(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("lockName is null or empty.");
        }
        synchronized (this) {
            this.f447818a = str;
        }
    }

    public synchronized void a() {
        while (!b()) {
            try {
                java.lang.Thread.sleep(10L);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public synchronized boolean b() {
        if (this.f447819b != null) {
            this.f447820c++;
            return true;
        }
        try {
            this.f447819b = new android.net.LocalServerSocket(this.f447818a);
            this.f447820c++;
            return true;
        } catch (java.lang.Throwable unused) {
            this.f447819b = null;
            return false;
        }
    }

    public synchronized void c() {
        if (this.f447820c > 0) {
            this.f447820c--;
        }
        if (this.f447820c == 0 && this.f447819b != null) {
            try {
                this.f447819b.close();
            } catch (java.lang.Throwable unused) {
            }
            this.f447819b = null;
        }
    }
}
