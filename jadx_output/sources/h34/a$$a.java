package h34;

/* loaded from: classes8.dex */
public final /* synthetic */ class a$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h34.a f278471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f278472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f278473f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f278474g;

    public /* synthetic */ a$$a(h34.a aVar, byte[] bArr, long j17, int i17) {
        this.f278471d = aVar;
        this.f278472e = bArr;
        this.f278473f = j17;
        this.f278474g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h34.a aVar = this.f278471d;
        c01.d9.e().g(new h34.l(this.f278472e, (int) this.f278473f, this.f278474g, 0, 0L, aVar.f278459f, aVar.f278462i, 0));
    }
}
