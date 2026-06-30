package sc3;

/* loaded from: classes7.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f406453e;

    public h1(sc3.k1 k1Var, java.util.List list) {
        this.f406452d = k1Var;
        this.f406453e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sc3.k1 k1Var = this.f406452d;
        com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni appBrandCommonBindingJni = k1Var.f406491w;
        jc3.x xVar = k1Var.f406486r;
        if (xVar == null) {
            kotlin.jvm.internal.o.o("pkgManagement");
            throw null;
        }
        appBrandCommonBindingJni.notifyRuntimeReady(k1Var.D, xVar.d(), "");
        com.tencent.mars.xlog.Log.i(k1Var.Q, "ready to evaluate main scripts");
        java.util.List list = this.f406453e;
        if (list.isEmpty()) {
            je3.i.t8(je3.k.f299298e, k1Var.D, "descriptors not found", "", null, 1.0f, 8, null);
            k1Var.Y0();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(k1Var.V0((lc3.g0) it.next()));
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        k1Var.M0().l0(new java.util.ArrayList(arrayList), (java.lang.String) ((jz5.n) k1Var.K).getValue(), new sc3.g1(k1Var, android.os.SystemClock.elapsedRealtime()));
    }
}
