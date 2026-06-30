package pq5;

/* loaded from: classes9.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public volatile java.lang.Object f357685a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f357686b = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public final pq5.d f357687c;

    public i(pq5.d dVar) {
        this.f357687c = dVar;
    }

    public java.lang.Object a() {
        if (this.f357685a == null) {
            synchronized (this.f357686b) {
                if (this.f357685a == null) {
                    this.f357685a = this.f357687c.get();
                }
            }
        }
        return this.f357685a;
    }
}
