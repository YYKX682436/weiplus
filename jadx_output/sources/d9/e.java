package d9;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f227330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.google.android.exoplayer2.Format f227331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f227332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f227333g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f227334h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d9.g f227335i;

    public e(d9.g gVar, int i17, com.google.android.exoplayer2.Format format, int i18, java.lang.Object obj, long j17) {
        this.f227335i = gVar;
        this.f227330d = i17;
        this.f227331e = format;
        this.f227332f = i18;
        this.f227333g = obj;
        this.f227334h = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        d9.g gVar = this.f227335i;
        gVar.f227350b.a(this.f227330d, this.f227331e, this.f227332f, this.f227333g, d9.g.a(gVar, this.f227334h));
    }
}
