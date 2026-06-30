package n8;

/* loaded from: classes15.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f335523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f335524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n8.m f335525g;

    public h(n8.m mVar, java.lang.String str, long j17, long j18) {
        this.f335525g = mVar;
        this.f335522d = str;
        this.f335523e = j17;
        this.f335524f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f335525g.f335537b.c(this.f335522d, this.f335523e, this.f335524f);
    }
}
