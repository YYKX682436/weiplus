package k5;

/* loaded from: classes13.dex */
public class r implements java.lang.Runnable {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f304153m = a5.a0.e("WorkForegroundRunnable");

    /* renamed from: d, reason: collision with root package name */
    public final l5.m f304154d = new l5.m();

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f304155e;

    /* renamed from: f, reason: collision with root package name */
    public final j5.w f304156f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.work.ListenableWorker f304157g;

    /* renamed from: h, reason: collision with root package name */
    public final a5.p f304158h;

    /* renamed from: i, reason: collision with root package name */
    public final m5.a f304159i;

    public r(android.content.Context context, j5.w wVar, androidx.work.ListenableWorker listenableWorker, a5.p pVar, m5.a aVar) {
        this.f304155e = context;
        this.f304156f = wVar;
        this.f304157g = listenableWorker;
        this.f304158h = pVar;
        this.f304159i = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f304156f.f297780q || j3.b.b()) {
            this.f304154d.i(null);
            return;
        }
        l5.m mVar = new l5.m();
        m5.a aVar = this.f304159i;
        ((m5.b) ((m5.c) aVar).f323472c).execute(new k5.p(this, mVar));
        mVar.addListener(new k5.q(this, mVar), ((m5.c) aVar).f323472c);
    }
}
