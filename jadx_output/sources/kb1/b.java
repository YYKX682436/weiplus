package kb1;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: f, reason: collision with root package name */
    public static volatile kb1.b f306215f = null;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f306216g = true;

    /* renamed from: a, reason: collision with root package name */
    public final int f306217a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f306218b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f306219c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f306220d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f306221e;

    public b(kb1.a aVar) {
        this.f306217a = aVar.f306210a;
        this.f306218b = aVar.f306211b;
        this.f306219c = aVar.f306212c;
        this.f306220d = aVar.f306213d;
        this.f306221e = aVar.f306214e;
    }

    public static synchronized kb1.b a() {
        kb1.b bVar;
        synchronized (kb1.b.class) {
            if (f306215f == null) {
                f306215f = new kb1.b(new kb1.a());
            }
            bVar = f306215f;
        }
        return bVar;
    }

    public java.lang.String toString() {
        return "BleConfig{interval=" + this.f306217a + ", allowDuplicatesKey=" + this.f306218b + ", actionTimeOutTime=33000, debug=false, mainThread=true, serial=true, mode='" + this.f306219c + "', actionDelayTime=10, scanWorkaround=" + this.f306221e + '}';
    }
}
