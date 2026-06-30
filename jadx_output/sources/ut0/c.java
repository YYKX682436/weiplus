package ut0;

/* loaded from: classes7.dex */
public final class c implements com.tencent.mm.minigame.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ut0.d f430799a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f430800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f430801c;

    public c(ut0.d dVar, int i17, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f430799a = dVar;
        this.f430800b = i17;
        this.f430801c = c0Var;
    }

    @Override // com.tencent.mm.minigame.f1
    public void a(com.tencent.mm.minigame.e1 result) {
        jc1.d dVar;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke: onResult exists=");
        boolean z17 = result.f69062a;
        sb6.append(z17);
        sb6.append(",pkgPath=");
        sb6.append(result.f69063b);
        sb6.append(", version=");
        int i17 = result.f69064c;
        sb6.append(i17);
        sb6.append(", size=");
        long j17 = result.f69065d;
        sb6.append(j17);
        sb6.append(", hasOldVersion=");
        boolean z18 = result.f69066e;
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i("JsApiGetLocalWVAPackageInfo", sb6.toString());
        ut0.d dVar2 = this.f430799a;
        dVar2.getClass();
        if (!z17 && j17 <= 0) {
            com.tencent.mars.xlog.Log.w("JsApiGetLocalWVAPackageInfo", "handleFinalResult: invalid pkgSize=" + j17);
            dVar = jc1.f.f298915d;
        } else if (z17 || fp.i.a(j17)) {
            dVar = jc1.f.f298912a;
        } else {
            com.tencent.mars.xlog.Log.w("JsApiGetLocalWVAPackageInfo", "handleFinalResult: storage insufficient, pkgSize=" + j17);
            dVar = jc1.e.f298909e;
        }
        java.util.Map e17 = kz5.b1.e(new jz5.l("hasOldVersion", java.lang.Boolean.valueOf(z18)));
        java.util.Map l17 = kz5.c1.l(new jz5.l("exists", java.lang.Boolean.valueOf(z17)), new jz5.l("version", java.lang.Integer.valueOf(i17)), new jz5.l("size", java.lang.Long.valueOf(j17)));
        l17.putAll(e17);
        this.f430801c.a(this.f430800b, dVar2.r(null, dVar, new org.json.JSONObject(l17)));
    }
}
