package h72;

/* loaded from: classes14.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f279434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f279435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f279436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f279437g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f279438h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f279439i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f279440m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f279441n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h72.s f279442o;

    public h(h72.s sVar, int i17, int i18, int i19, boolean z17, int i27, int i28, int i29, java.lang.Runnable runnable) {
        this.f279442o = sVar;
        this.f279434d = i17;
        this.f279435e = i18;
        this.f279436f = i19;
        this.f279437g = z17;
        this.f279438h = i27;
        this.f279439i = i28;
        this.f279440m = i29;
        this.f279441n = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        h72.s sVar;
        int i17 = this.f279434d;
        if (i17 == 90 || i17 == 270) {
            this.f279442o.j("MicroMsg.FaceVideoRecorder", "hy: need make width and height upside down", new java.lang.Object[0]);
            h72.s sVar2 = this.f279442o;
            sVar2.f279476j = this.f279435e;
            sVar2.f279477k = this.f279436f;
        } else {
            h72.s sVar3 = this.f279442o;
            sVar3.f279476j = this.f279436f;
            sVar3.f279477k = this.f279435e;
        }
        synchronized (this.f279442o.f279468b) {
            sVar = this.f279442o;
            sVar.f279471e = this.f279434d;
            sVar.f279472f = this.f279437g;
            sVar.f279473g = this.f279438h;
        }
        h72.s.a(sVar);
        h72.s.b(this.f279442o);
        h72.s.c(this.f279442o);
        com.tencent.mm.sdk.platformtools.u3.h(new h72.g(this));
    }
}
