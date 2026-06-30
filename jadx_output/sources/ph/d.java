package ph;

/* loaded from: classes12.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f354257d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f354258e;

    /* renamed from: f, reason: collision with root package name */
    public int f354259f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f354260g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f354261h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ph.t f354262i;

    public d(ph.t tVar, java.lang.String action, boolean z17) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f354262i = tVar;
        this.f354260g = action;
        this.f354261h = z17;
        this.f354257d = new android.os.Handler(tVar.m().getLooper());
        this.f354259f = 1;
    }

    public final void a() {
        synchronized (this) {
            oj.j.f("Matrix.battery.LifeCycle", "ChargeStatusRestore cancel", new java.lang.Object[0]);
            this.f354257d.removeCallbacksAndMessages(null);
            if (this.f354258e) {
                this.f354262i.getClass();
            }
            this.f354258e = false;
            this.f354262i.f354293h = null;
        }
    }

    public final int b(int i17) {
        if (i17 <= 1) {
            return i17;
        }
        return b(i17 - 2) + b(i17 - 1);
    }

    public final void c() {
        synchronized (this) {
            if (this.f354258e) {
                oj.j.f("Matrix.battery.LifeCycle", "ChargeStatusRestore post: already running", new java.lang.Object[0]);
                return;
            }
            this.f354259f = 1;
            this.f354258e = true;
            long b17 = b(1) * 1000;
            oj.j.f("Matrix.battery.LifeCycle", "ChargeStatusRestore post: round=" + this.f354259f + ", delayMs=" + b17 + ", action=" + this.f354260g, new java.lang.Object[0]);
            this.f354257d.postDelayed(this, b17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.d.run():void");
    }
}
