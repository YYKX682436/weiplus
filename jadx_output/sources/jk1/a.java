package jk1;

/* loaded from: classes7.dex */
public enum a implements jk1.g, com.tencent.mm.plugin.appbrand.utils.y0 {
    INST;


    /* renamed from: g, reason: collision with root package name */
    public static final jk1.e f300048g = new jk1.e();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f300051e = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final jk1.g f300050d = new jk1.d();

    a() {
    }

    public void a(android.content.Context context) {
        if (this.f300051e.getAndSet(true)) {
            return;
        }
        jk1.d dVar = (jk1.d) this.f300050d;
        synchronized (dVar) {
            dVar.f300056g = null;
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            dVar.f300053d = context;
        }
    }

    public void h() {
        try {
            jk1.d dVar = (jk1.d) this.f300050d;
            synchronized (dVar) {
                android.content.Context context = dVar.f300053d;
                if (context != null) {
                    jk1.c cVar = dVar.f300058i;
                    if (cVar != null) {
                        try {
                            context.unregisterReceiver(cVar);
                        } catch (java.lang.IllegalArgumentException unused) {
                        }
                    }
                    dVar.f300053d = null;
                }
            }
        } finally {
            this.f300051e.set(false);
        }
    }
}
