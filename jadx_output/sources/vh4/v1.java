package vh4;

/* loaded from: classes.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f437159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437162g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f437163h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f437164i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vh4.t1 f437165m;

    public v1(vh4.t1 t1Var, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17) {
        this.f437165m = t1Var;
        this.f437159d = context;
        this.f437160e = str;
        this.f437161f = str2;
        this.f437162g = str3;
        this.f437163h = j17;
        this.f437164i = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f437165m.Di(this.f437159d, this.f437160e, this.f437161f, this.f437162g, this.f437163h, this.f437164i);
    }
}
