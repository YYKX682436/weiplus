package h72;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f279422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f279423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f279424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f279425g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f279426h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f279427i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f279428m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f279429n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h72.s f279430o;

    public e(h72.s sVar, int i17, int i18, int i19, boolean z17, int i27, boolean z18, int i28, int i29) {
        this.f279430o = sVar;
        this.f279422d = i17;
        this.f279423e = i18;
        this.f279424f = i19;
        this.f279425g = z17;
        this.f279426h = i27;
        this.f279427i = z18;
        this.f279428m = i28;
        this.f279429n = i29;
    }

    @Override // java.lang.Runnable
    public void run() {
        h72.s sVar;
        this.f279430o.j("MicroMsg.FaceVideoRecorder", "hy: initRecorder runnable exec.", new java.lang.Object[0]);
        int i17 = this.f279422d;
        if (i17 == 90 || i17 == 270) {
            this.f279430o.j("MicroMsg.FaceVideoRecorder", "hy: need make width and height upside down", new java.lang.Object[0]);
            h72.s sVar2 = this.f279430o;
            sVar2.f279476j = this.f279423e;
            sVar2.f279477k = this.f279424f;
        } else {
            h72.s sVar3 = this.f279430o;
            sVar3.f279476j = this.f279424f;
            sVar3.f279477k = this.f279423e;
        }
        synchronized (this.f279430o.f279468b) {
            sVar = this.f279430o;
            sVar.f279471e = this.f279422d;
            sVar.f279472f = this.f279425g;
            sVar.f279473g = this.f279426h;
        }
        h72.s.a(sVar);
        h72.s.b(this.f279430o);
        h72.s.c(this.f279430o);
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            this.f279430o.j("MicroMsg.FaceVideoRecorder", "hy: not init.", new java.lang.Object[0]);
            com.tencent.mm.sdk.platformtools.u3.h(new h72.b(this));
            return;
        }
        synchronized (this.f279430o.f279468b) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            h72.s sVar4 = this.f279430o;
            sVar4.f279467a = sVar4.f279481o.a();
            h72.s sVar5 = this.f279430o;
            sVar5.f279467a.f(sVar5.f279478l);
            h72.s sVar6 = this.f279430o;
            sVar6.f279467a.w(sVar6.f279479m);
            this.f279430o.f279467a.v(this.f279427i);
            h72.s sVar7 = this.f279430o;
            sVar7.f279467a.r(sVar7.f279476j, sVar7.f279477k, this.f279428m, this.f279429n);
            this.f279430o.f279467a.setMute(true);
            h72.s sVar8 = this.f279430o;
            sVar8.f279467a.k(sVar8.f279471e);
            h72.s sVar9 = this.f279430o;
            sVar9.f279467a.u(sVar9.f279483q);
            h72.s sVar10 = this.f279430o;
            sVar10.f279470d = h72.q.INITIALIZED;
            sVar10.j("MicroMsg.FaceVideoRecorder", "hy: init in main thread cost %d ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }
}
