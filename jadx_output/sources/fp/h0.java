package fp;

/* loaded from: classes8.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f265200a;

    /* renamed from: b, reason: collision with root package name */
    public volatile android.net.LocalServerSocket f265201b = null;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f265202c = 0;

    public h0(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("lockName is null or empty.");
        }
        synchronized (this) {
            this.f265200a = str + "-" + android.os.Process.myUid();
        }
    }

    public synchronized boolean a() {
        if (this.f265201b != null) {
            this.f265202c++;
            return true;
        }
        try {
            this.f265201b = new android.net.LocalServerSocket(this.f265200a);
            this.f265202c++;
            return true;
        } catch (java.lang.Throwable unused) {
            this.f265201b = null;
            return false;
        }
    }

    public synchronized void b() {
        if (this.f265202c > 0) {
            this.f265202c--;
        }
        if (this.f265202c == 0 && this.f265201b != null) {
            try {
                this.f265201b.close();
            } catch (java.lang.Throwable unused) {
            }
            this.f265201b = null;
        }
    }
}
