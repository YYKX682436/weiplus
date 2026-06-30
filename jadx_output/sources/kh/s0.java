package kh;

/* loaded from: classes12.dex */
public final class s0 implements jj.d {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f307907d = jz5.h.a(jz5.i.f302829d, kh.r0.f307901d);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kh.k1 f307908e;

    public s0(kh.k1 k1Var) {
        this.f307908e = k1Var;
    }

    @Override // jj.d
    public void b(java.lang.String x17, long j17, long j18) {
        kotlin.jvm.internal.o.g(x17, "x");
        boolean z17 = kh.k1.f307838n;
        kh.k1 k1Var = this.f307908e;
        if (k1Var.f395294a.f363335d.f363300s) {
            oj.j.c("Matrix.battery.LooperTaskMonitorFeatureKt", "[" + java.lang.Thread.currentThread().getName() + ']' + x17, new java.lang.Object[0]);
        }
        jz5.g gVar = this.f307907d;
        kh.g1 g1Var = (kh.g1) ((java.lang.ThreadLocal) gVar.getValue()).get();
        if (g1Var != null) {
            ((java.lang.ThreadLocal) gVar.getValue()).set(null);
            kh.k1.y(k1Var, g1Var);
        }
    }

    @Override // jj.d
    public void c(java.lang.String x17) {
        kotlin.jvm.internal.o.g(x17, "x");
        boolean z17 = kh.k1.f307838n;
        kh.k1 k1Var = this.f307908e;
        if (k1Var.f395294a.f363335d.f363300s) {
            oj.j.c("Matrix.battery.LooperTaskMonitorFeatureKt", "[" + java.lang.Thread.currentThread().getName() + ']' + x17, new java.lang.Object[0]);
        }
        kh.g1 g1Var = null;
        if (!android.text.TextUtils.isEmpty(x17)) {
            try {
                int L = r26.n0.L(x17, " to Handler (", 0, false, 6, null);
                if (L >= 0) {
                    java.lang.String substring = x17.substring(L + 13);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    int P = r26.n0.P(substring, ") ", 0, false, 6, null);
                    if (P >= 0) {
                        java.lang.String substring2 = substring.substring(0, P);
                        kotlin.jvm.internal.o.f(substring2, "substring(...)");
                        int L2 = r26.n0.L(substring, "} ", 0, false, 6, null);
                        if (L2 >= 0) {
                            java.lang.String substring3 = substring.substring(L2 + 2);
                            kotlin.jvm.internal.o.f(substring3, "substring(...)");
                            int P2 = r26.n0.P(substring3, ": ", 0, false, 6, null);
                            if (P2 >= 0) {
                                java.lang.String substring4 = substring3.substring(0, P2);
                                kotlin.jvm.internal.o.f(substring4, "substring(...)");
                                if (r26.n0.B(substring4, "@", false)) {
                                    substring4 = substring4.substring(0, r26.n0.L(substring4, "@", 0, false, 6, null));
                                    kotlin.jvm.internal.o.f(substring4, "substring(...)");
                                }
                                java.lang.String substring5 = substring3.substring(P2 + 2);
                                kotlin.jvm.internal.o.f(substring5, "substring(...)");
                                g1Var = kh.g1.f307805f.a(substring2, substring4, java.lang.Integer.parseInt(substring5), null);
                            }
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.LooperTaskMonitorFeatureKt", e17, "deconstructTask failed: ".concat(x17), new java.lang.Object[0]);
            }
        }
        if (g1Var != null) {
            if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper()) && kotlin.jvm.internal.o.b(g1Var.f307809b, "android.view.Choreographer$FrameDisplayEventReceiver")) {
                kh.i0 i0Var = kh.i0.f307826a;
                android.view.Choreographer choreographer = android.view.Choreographer.getInstance();
                kotlin.jvm.internal.o.f(choreographer, "getInstance(...)");
                i0Var.b(choreographer);
            }
            ((java.lang.ThreadLocal) this.f307907d.getValue()).set(g1Var);
            kh.k1.z(k1Var, g1Var);
        }
    }

    @Override // jj.d
    public boolean isValid() {
        boolean z17;
        kh.k1 k1Var = this.f307908e;
        boolean z18 = kh.k1.f307838n;
        qh.f0 f0Var = k1Var.f395294a;
        f0Var.getClass();
        synchronized (qh.f0.class) {
            z17 = f0Var.f363341m;
        }
        return z17;
    }
}
