package d55;

/* loaded from: classes12.dex */
public class y {

    /* renamed from: e, reason: collision with root package name */
    public static final long f226624e = java.util.concurrent.TimeUnit.DAYS.toMillis(1) / 2;

    /* renamed from: a, reason: collision with root package name */
    public long f226625a;

    /* renamed from: b, reason: collision with root package name */
    public final long f226626b;

    /* renamed from: c, reason: collision with root package name */
    public final long f226627c;

    /* renamed from: d, reason: collision with root package name */
    public final d55.x f226628d;

    public y(android.content.Context context) {
        d55.w wVar = new d55.w(context, "recovery_internal");
        wVar.e();
        this.f226628d = wVar;
        this.f226627c = wVar.getLong("internal_overheat_enable", 1L);
        this.f226625a = wVar.getLong("internal_last_ui_launched", 0L);
        this.f226626b = wVar.getLong("internal_ui_launch_interval", f226624e);
    }

    public void a() {
        d55.w wVar = (d55.w) this.f226628d;
        wVar.g("internal_overheat_enable", this.f226627c);
        wVar.g("internal_last_ui_launched", this.f226625a);
        wVar.g("internal_ui_launch_interval", this.f226626b);
        wVar.h();
    }
}
