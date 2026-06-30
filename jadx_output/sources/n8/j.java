package n8;

/* loaded from: classes15.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f335528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f335529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f335530f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n8.m f335531g;

    public j(n8.m mVar, int i17, long j17, long j18) {
        this.f335531g = mVar;
        this.f335528d = i17;
        this.f335529e = j17;
        this.f335530f = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f335531g.f335537b.x(this.f335528d, this.f335529e, this.f335530f);
    }
}
