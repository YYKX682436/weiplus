package ps3;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.m f358084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f358085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f358086f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358087g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358088h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f358089i;

    public h(ps3.m mVar, boolean z17, boolean z18, java.lang.String str, java.lang.String str2, long j17) {
        this.f358084d = mVar;
        this.f358085e = z17;
        this.f358086f = z18;
        this.f358087g = str;
        this.f358088h = str2;
        this.f358089i = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((com.tencent.mm.plugin.radar.ui.RadarViewController) this.f358084d.f358102d).g(this.f358085e, this.f358086f, this.f358087g, this.f358088h, this.f358089i);
    }
}
