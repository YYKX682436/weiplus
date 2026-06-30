package o53;

/* loaded from: classes8.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.e f343107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f343108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f343109f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f343110g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f343111h;

    public a(o53.e eVar, int i17, int i18, int i19, boolean z17) {
        this.f343107d = eVar;
        this.f343108e = i17;
        this.f343109f = i18;
        this.f343110g = i19;
        this.f343111h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o53.e.c(this.f343107d, this.f343108e, this.f343109f, this.f343110g, this.f343111h);
    }
}
