package k73;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile k73.a f304781b;

    /* renamed from: a, reason: collision with root package name */
    public r45.uv3 f304782a = null;

    public static k73.a b() {
        k73.a aVar;
        if (f304781b != null) {
            return f304781b;
        }
        synchronized (k73.a.class) {
            if (f304781b == null) {
                f304781b = new k73.a();
            }
            aVar = f304781b;
        }
        return aVar;
    }

    public r45.uv3 a() {
        if (this.f304782a == null) {
            this.f304782a = new r45.uv3();
        }
        return this.f304782a;
    }
}
