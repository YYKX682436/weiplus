package kt0;

/* loaded from: classes14.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public static volatile kt0.g f311912c;

    /* renamed from: d, reason: collision with root package name */
    public static final lt0.a f311913d;

    /* renamed from: a, reason: collision with root package name */
    public kt0.f f311914a = null;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f311915b = new java.util.concurrent.ConcurrentHashMap();

    static {
        lt0.a aVar = lt0.a.f321162c;
        f311913d = aVar;
        kt0.g b17 = b();
        kt0.e eVar = new kt0.e(aVar);
        b17.f311915b.put(aVar.f321164b, eVar);
        if (aVar.equals(aVar)) {
            b17.f311914a = eVar;
        }
    }

    public static lt0.c a(lt0.a aVar) {
        if (aVar == null || aVar.equals("")) {
            return null;
        }
        if (f311913d.equals(aVar)) {
            return ((kt0.e) b().f311914a).f311909a;
        }
        b().getClass();
        return ((kt0.e) ((kt0.f) b().f311915b.get(aVar.f321164b))).f311909a;
    }

    public static kt0.g b() {
        if (f311912c == null) {
            synchronized (kt0.g.class) {
                if (f311912c == null) {
                    f311912c = new kt0.g();
                }
            }
        }
        return f311912c;
    }
}
