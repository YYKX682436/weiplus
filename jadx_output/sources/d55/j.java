package d55;

/* loaded from: classes12.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public long f226588a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f226589b;

    /* renamed from: c, reason: collision with root package name */
    public final d55.x f226590c;

    /* renamed from: d, reason: collision with root package name */
    public final d55.k f226591d;

    public j(d55.k kVar, d55.x xVar) {
        this.f226590c = xVar;
        this.f226591d = kVar;
    }

    public static d55.j b(android.content.Context context) {
        d55.v vVar = new d55.v(context, "recovery_crash_count");
        vVar.a();
        d55.k kVar = new d55.k(vVar);
        d55.j jVar = new d55.j(kVar, new d55.v(context, "recovery_crash"));
        kVar.f226597a = java.lang.Math.max(vVar.getInt("crash_count", 0), 0);
        jVar.a();
        return jVar;
    }

    public static d55.j c(android.content.Context context) {
        d55.v vVar = new d55.v(context, "recovery_crash_count_isolated");
        vVar.a();
        d55.k kVar = new d55.k(vVar);
        d55.j jVar = new d55.j(kVar, new d55.v(context, "recovery_crash_isolated"));
        kVar.f226597a = java.lang.Math.max(vVar.getInt("crash_count", 0), 0);
        jVar.a();
        return jVar;
    }

    public void a() {
        d55.x xVar = this.f226590c;
        xVar.a();
        if (this.f226589b != null) {
            return;
        }
        this.f226589b = xVar.getString("crash_version", null);
        this.f226588a = java.lang.Math.max(xVar.getLong("crash_time", 0L), 0L);
    }

    public d55.j d() {
        d55.o0.a(5, "MicroMsg.recovery.crash", "reset crash record!");
        this.f226591d.f226597a = 0;
        this.f226588a = 0L;
        this.f226589b = null;
        return this;
    }

    public void e() {
        d55.k kVar = this.f226591d;
        kVar.f226598b.putInt("crash_count", kVar.f226597a).c();
        this.f226590c.putString("crash_version", this.f226589b).putLong("crash_time", this.f226588a).c();
    }

    public j(long j17, java.lang.String str, d55.k kVar, d55.x xVar) {
        this.f226588a = j17;
        this.f226589b = str;
        this.f226590c = xVar;
        this.f226591d = kVar;
    }
}
