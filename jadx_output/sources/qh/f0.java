package qh;

/* loaded from: classes12.dex */
public class f0 implements rh.r3, com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesListener, rh.t, rh.i3, android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final qh.a0 f363335d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f363336e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f363337f;

    /* renamed from: g, reason: collision with root package name */
    public qh.d0 f363338g;

    /* renamed from: h, reason: collision with root package name */
    public qh.c0 f363339h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.Callable f363340i;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f363341m = false;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f363342n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f363343o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f363344p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f363345q;

    /* renamed from: r, reason: collision with root package name */
    public final long f363346r;

    /* renamed from: s, reason: collision with root package name */
    public final long f363347s;

    /* renamed from: t, reason: collision with root package name */
    public final long f363348t;

    public f0(qh.a0 a0Var) {
        this.f363340i = new qh.b0(this);
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        this.f363343o = com.tencent.matrix.lifecycle.owners.f0.f52739u;
        this.f363335d = a0Var;
        qh.w wVar = a0Var.f363283b;
        if (wVar instanceof qh.v) {
            ((qh.v) wVar).i(this);
        }
        java.util.concurrent.Callable callable = a0Var.f363284c;
        if (callable != null) {
            this.f363340i = callable;
        }
        android.os.HandlerThread handlerThread = a0Var.f363282a;
        if (handlerThread != null) {
            this.f363336e = new android.os.Handler(handlerThread.getLooper(), this);
            this.f363337f = new android.os.Handler(handlerThread.getLooper(), this);
        } else {
            android.os.Handler handler = new android.os.Handler(oj.g.b().getLooper(), this);
            this.f363336e = handler;
            this.f363337f = handler;
        }
        boolean z17 = a0Var.f363293l;
        this.f363344p = z17;
        if (z17) {
            this.f363338g = new qh.d0(this, null);
        }
        this.f363345q = a0Var.f363294m;
        this.f363346r = a0Var.f363286e;
        this.f363347s = a0Var.f363287f;
        this.f363348t = a0Var.f363288g;
        java.util.Iterator it = ((java.util.ArrayList) a0Var.f363306y).iterator();
        while (it.hasNext()) {
            ((rh.e3) it.next()).h(this);
        }
    }

    @Override // rh.i3
    public void a(rh.h3 h3Var) {
        this.f363335d.f363283b.a(h3Var);
    }

    @Override // rh.r3
    public void b(rh.w3 w3Var, long j17) {
        this.f363335d.f363283b.b(w3Var, j17);
    }

    public qh.a0 c() {
        return this.f363335d;
    }

    public android.content.Context d() {
        return ih.d.d().f291471b;
    }

    @Override // rh.t
    public void e(boolean z17, int i17, int i18, android.content.ComponentName componentName, long j17) {
        this.f363335d.f363283b.e(z17, i17, i18, componentName, j17);
    }

    @Override // rh.r3
    public void h(int i17, rh.w3 w3Var) {
        this.f363335d.f363283b.h(i17, w3Var);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 1) {
            oj.j.a("Matrix.battery.BatteryMonitorCore", "#onTraceBegin", new java.lang.Object[0]);
            synchronized (qh.f0.class) {
                this.f363342n = true;
                this.f363335d.f363283b.d();
            }
            return true;
        }
        if (i17 != 2) {
            return false;
        }
        boolean z17 = message.arg1 == 3;
        oj.j.a("Matrix.battery.BatteryMonitorCore", "#onTraceEnd", new java.lang.Object[0]);
        synchronized (qh.f0.class) {
            if (this.f363342n) {
                this.f363335d.f363283b.c(z17);
                this.f363342n = false;
            }
        }
        return true;
    }

    public rh.e3 i(java.lang.Class cls) {
        java.util.Iterator it = ((java.util.ArrayList) this.f363335d.f363306y).iterator();
        while (it.hasNext()) {
            rh.e3 e3Var = (rh.e3) it.next();
            if (cls.isAssignableFrom(e3Var.getClass())) {
                return e3Var;
            }
        }
        return null;
    }
}
