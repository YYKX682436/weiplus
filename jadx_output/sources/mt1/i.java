package mt1;

/* loaded from: classes12.dex */
public final class i implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f331223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f331224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f331225g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f331226h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f331227i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f331228m;

    public i(java.lang.String str, java.util.ArrayList arrayList, com.tencent.wcdb.support.CancellationSignal cancellationSignal, boolean z17, kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.g0 g0Var2, kotlin.jvm.internal.g0 g0Var3) {
        this.f331222d = str;
        this.f331223e = arrayList;
        this.f331224f = cancellationSignal;
        this.f331225g = z17;
        this.f331226h = g0Var;
        this.f331227i = g0Var2;
        this.f331228m = g0Var3;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.String u07;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.g0 g0Var = this.f331227i;
        kotlin.jvm.internal.g0 g0Var2 = this.f331226h;
        java.util.ArrayList arrayList2 = this.f331223e;
        java.lang.String str = this.f331222d;
        boolean z17 = true;
        try {
            mt1.q0.f331258a.b();
            if (mt1.b0.e(mt1.b0.f331191a, str)) {
                int size = arrayList2.size();
                long j17 = -1;
                int i17 = 0;
                while (true) {
                    if (i17 >= size) {
                        break;
                    }
                    java.lang.String str2 = ((mt1.a) arrayList2.get(i17)).f331188b;
                    long j18 = ((mt1.a) arrayList2.get(i17)).f331187a;
                    com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f331224f;
                    if (cancellationSignal != null && cancellationSignal.isCanceled()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.CalcWxNewService", "cs isCanceled, stop linkify");
                        mt1.b0.f331200j = z17;
                        break;
                    }
                    mt1.b0 b0Var = mt1.b0.f331191a;
                    if (mt1.b0.e(b0Var, str2) && (u07 = ot1.h.u0(str2)) != null) {
                        if (kotlin.jvm.internal.o.b(str, u07)) {
                            arrayList = arrayList2;
                            j17 = j18;
                        } else {
                            arrayList = arrayList2;
                            int f17 = mt1.q0.f331258a.f(str, u07, this.f331225g);
                            if (f17 < 0) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.CalcWxNewService", "Linkify Failed ret = " + f17);
                                throw new java.lang.RuntimeException("Linkify Failed ret = " + f17);
                            }
                            if (f17 != 2) {
                                if (f17 == 200 || f17 == 2000) {
                                    g0Var2.f310121d++;
                                    g0Var.f310121d += this.f331228m.f310121d;
                                    b0Var.n().D0(kz5.c0.i(java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17)));
                                }
                            } else if (j17 >= 0) {
                                b0Var.n().D0(kz5.b0.c(java.lang.Long.valueOf(j17)));
                            }
                        }
                        i17++;
                        arrayList2 = arrayList;
                        z17 = true;
                    }
                    arrayList = arrayList2;
                    i17++;
                    arrayList2 = arrayList;
                    z17 = true;
                }
            }
            return jz5.f0.f302826a;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.o4.L().putBoolean("LinkifyError", true);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.d(26980, java.lang.Integer.valueOf(org.chromium.net.NetError.ERR_CERT_COMMON_NAME_INVALID), 0, 0, e17.getMessage(), "", 0);
            fVar.d(26980, 201, java.lang.Long.valueOf(g0Var2.f310121d), java.lang.Long.valueOf(g0Var.f310121d), this.f331222d, "", 0);
            throw e17;
        }
    }
}
