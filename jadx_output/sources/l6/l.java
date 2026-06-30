package l6;

/* loaded from: classes16.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public int f316732a;

    /* renamed from: b, reason: collision with root package name */
    public int f316733b;

    /* renamed from: c, reason: collision with root package name */
    public int f316734c = 255;

    /* renamed from: d, reason: collision with root package name */
    public int f316735d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.HandlerThread f316736e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Handler f316737f;

    /* renamed from: g, reason: collision with root package name */
    public l6.k f316738g;

    public synchronized void a(int i17, int i18, int i19, l6.k kVar) {
        if (i17 < 1 || i19 < 0 || kVar == null) {
            return;
        }
        try {
            this.f316733b = i17;
            this.f316732a = i18;
            this.f316735d = i19;
            this.f316738g = kVar;
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("RepeatExecutor");
            this.f316736e = handlerThread;
            handlerThread.start();
            l6.j jVar = new l6.j(this, this.f316736e.getLooper());
            this.f316737f = jVar;
            jVar.sendEmptyMessage(101);
        } catch (java.lang.Throwable unused) {
        }
    }
}
