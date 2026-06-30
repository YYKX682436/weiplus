package ps3;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.m f358094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f358095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358097g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f358098h;

    public k(ps3.m mVar, boolean z17, java.lang.String str, java.lang.String str2, long j17) {
        this.f358094d = mVar;
        this.f358095e = z17;
        this.f358096f = str;
        this.f358097g = str2;
        this.f358098h = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mm.plugin.radar.ui.RadarViewController) this.f358094d.f358102d).n(this.f358095e, this.f358096f, this.f358097g, this.f358098h);
    }
}
