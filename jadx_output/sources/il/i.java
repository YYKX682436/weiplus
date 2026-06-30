package il;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: c, reason: collision with root package name */
    public static il.i f291999c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f292000a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f292001b = new java.lang.Object();

    public static il.i a() {
        if (f291999c == null) {
            synchronized (il.i.class) {
                if (f291999c == null) {
                    f291999c = new il.i();
                }
            }
        }
        return f291999c;
    }

    public hl.e b() {
        synchronized (this.f292001b) {
            if (this.f292000a.size() <= 0) {
                return new hl.e();
            }
            return (hl.e) this.f292000a.remove(r1.size() - 1);
        }
    }
}
