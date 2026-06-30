package cw1;

/* loaded from: classes12.dex */
public final class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.CancellationSignal f223137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI f223138e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f223139f;

    public m2(android.os.CancellationSignal cancellationSignal, com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI, long j17) {
        this.f223137d = cancellationSignal;
        this.f223138e = cleanCacheUI;
        this.f223139f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        long j18;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.os.CancellationSignal cancellationSignal = this.f223137d;
            if (cancellationSignal != null) {
                cancellationSignal.throwIfCanceled();
            }
            java.util.List<com.tencent.mm.plugin.appbrand.appstorage.m0> Sa = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Sa();
            kotlin.jvm.internal.o.f(Sa, "calculateAppBrandFileStorageLogic(...)");
            android.os.CancellationSignal cancellationSignal2 = this.f223137d;
            if (cancellationSignal2 != null) {
                cancellationSignal2.throwIfCanceled();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(16);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (Sa.size() <= 15) {
                long j19 = 0;
                for (com.tencent.mm.plugin.appbrand.appstorage.m0 m0Var : Sa) {
                    arrayList.add(new cw1.j(cw1.t2.a(m0Var), m0Var.f76267c, m0Var.f76268d, m0Var));
                    j19 += m0Var.f76268d;
                }
                j18 = j19;
                j17 = 0;
            } else {
                int i17 = 0;
                j17 = 0;
                j18 = 0;
                for (com.tencent.mm.plugin.appbrand.appstorage.m0 m0Var2 : Sa) {
                    int i18 = i17 + 1;
                    if (i17 >= 8) {
                        arrayList2.add(m0Var2.f76265a);
                        j17 += m0Var2.f76268d;
                        i17 = i18;
                    } else {
                        arrayList.add(new cw1.j(cw1.t2.a(m0Var2), m0Var2.f76267c, m0Var2.f76268d, m0Var2));
                        j18 += m0Var2.f76268d;
                        i17 = i18;
                        j17 = j17;
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                java.lang.String string = this.f223138e.getString(com.tencent.mm.R.string.b7l, java.lang.Integer.valueOf(arrayList2.size()));
                kotlin.jvm.internal.o.f(string, "getString(...)");
                arrayList.add(new cw1.j(-1L, string, j17, null));
            }
            long j27 = j18 + j17;
            if (this.f223139f > j27) {
                java.lang.String string2 = this.f223138e.getString(com.tencent.mm.R.string.b7m);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                arrayList.add(new cw1.j(-2L, string2, (this.f223139f - j18) - j17, null));
            }
            android.os.CancellationSignal cancellationSignal3 = this.f223137d;
            if (cancellationSignal3 != null) {
                cancellationSignal3.throwIfCanceled();
            }
            yv1.h1.g(0, null, 2, null);
            this.f223138e.f95695m = java.lang.System.currentTimeMillis() - currentTimeMillis;
            this.f223138e.f95696n = Sa.size();
            this.f223138e.f95697o = j27;
            ((ku5.t0) ku5.t0.f312615d).B(new cw1.l2(this.f223138e, arrayList2, arrayList));
        } catch (android.os.OperationCanceledException unused) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanCacheUI", "Loading appbrand list cancelled.");
        }
    }
}
