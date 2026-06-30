package ms4;

/* loaded from: classes8.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ms4.n f331051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331052e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f331054g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ im5.b f331055h;

    public k(ms4.n nVar, java.lang.String str, java.lang.String str2, int i17, im5.b bVar) {
        this.f331051d = nVar;
        this.f331052e = str;
        this.f331053f = str2;
        this.f331054g = i17;
        this.f331055h = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f331051d.N6(this.f331052e, this.f331053f, this.f331054g, this.f331055h);
    }
}
