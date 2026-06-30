package ol;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f346118a;

    public i(java.lang.Object obj) {
        this.f346118a = obj;
    }

    public synchronized boolean a(java.lang.Object... objArr) {
        for (java.lang.Object obj : objArr) {
            if (this.f346118a.equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
