package qt5;

/* loaded from: classes12.dex */
public class f0 {

    /* renamed from: c, reason: collision with root package name */
    public static qt5.f0 f366685c;

    /* renamed from: a, reason: collision with root package name */
    public final rt5.a f366686a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f366687b;

    public f0() {
        rt5.a aVar = rt5.c.f399546a;
        this.f366686a = aVar == null ? new rt5.b() : aVar;
        this.f366687b = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public static qt5.f0 a() {
        if (f366685c == null) {
            synchronized (qt5.f0.class) {
                if (f366685c == null) {
                    f366685c = new qt5.f0();
                }
            }
        }
        return f366685c;
    }
}
