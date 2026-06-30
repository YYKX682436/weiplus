package wb1;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wb1.h f444354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf.f f444355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f444356f;

    public a(wb1.h hVar, sf.f fVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f444354d = hVar;
        this.f444355e = fVar;
        this.f444356f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wb1.h hVar = this.f444354d;
        sf.f fVar = this.f444355e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f444356f;
        synchronized (hVar) {
            com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = ((com.tencent.mm.plugin.appbrand.extendplugin.b) fVar).f78021c;
            if (k0Var instanceof xb1.b) {
                org.json.JSONObject jSONObject = ((com.tencent.mm.plugin.appbrand.extendplugin.b) fVar).f78020b;
                kotlin.jvm.internal.o.f(jSONObject, "getData(...)");
                com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var2 = ((com.tencent.mm.plugin.appbrand.extendplugin.b) fVar).f78021c;
                kotlin.jvm.internal.o.f(k0Var2, "getJsApi(...)");
                wb1.h.r(hVar, lVar, jSONObject, k0Var2, ((com.tencent.mm.plugin.appbrand.extendplugin.b) fVar).f78019a);
            } else if (k0Var instanceof xb1.d) {
                org.json.JSONObject jSONObject2 = ((com.tencent.mm.plugin.appbrand.extendplugin.b) fVar).f78020b;
                kotlin.jvm.internal.o.f(jSONObject2, "getData(...)");
                com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var3 = ((com.tencent.mm.plugin.appbrand.extendplugin.b) fVar).f78021c;
                kotlin.jvm.internal.o.f(k0Var3, "getJsApi(...)");
                wb1.h.t(hVar, lVar, jSONObject2, k0Var3, ((com.tencent.mm.plugin.appbrand.extendplugin.b) fVar).f78019a);
            } else if (k0Var instanceof xb1.c) {
                org.json.JSONObject jSONObject3 = ((com.tencent.mm.plugin.appbrand.extendplugin.b) fVar).f78020b;
                kotlin.jvm.internal.o.f(jSONObject3, "getData(...)");
                com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var4 = ((com.tencent.mm.plugin.appbrand.extendplugin.b) fVar).f78021c;
                kotlin.jvm.internal.o.f(k0Var4, "getJsApi(...)");
                wb1.h.s(hVar, lVar, jSONObject3, k0Var4, ((com.tencent.mm.plugin.appbrand.extendplugin.b) fVar).f78019a);
            }
        }
    }
}
