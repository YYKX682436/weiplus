package h5;

/* loaded from: classes13.dex */
public class j {

    /* renamed from: e, reason: collision with root package name */
    public static h5.j f278997e;

    /* renamed from: a, reason: collision with root package name */
    public final h5.a f278998a;

    /* renamed from: b, reason: collision with root package name */
    public final h5.b f278999b;

    /* renamed from: c, reason: collision with root package name */
    public final h5.h f279000c;

    /* renamed from: d, reason: collision with root package name */
    public final h5.i f279001d;

    public j(android.content.Context context, m5.a aVar) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f278998a = new h5.a(applicationContext, aVar);
        this.f278999b = new h5.b(applicationContext, aVar);
        this.f279000c = new h5.h(applicationContext, aVar);
        this.f279001d = new h5.i(applicationContext, aVar);
    }

    public static synchronized h5.j a(android.content.Context context, m5.a aVar) {
        h5.j jVar;
        synchronized (h5.j.class) {
            if (f278997e == null) {
                f278997e = new h5.j(context, aVar);
            }
            jVar = f278997e;
        }
        return jVar;
    }
}
