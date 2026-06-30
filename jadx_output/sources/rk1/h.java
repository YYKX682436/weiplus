package rk1;

/* loaded from: classes7.dex */
public final class h implements com.tencent.mm.plugin.appbrand.jsruntime.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.g f396413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rk1.e f396414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396415c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f396416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct f396417e;

    public h(com.tencent.mm.plugin.appbrand.jsruntime.g gVar, rk1.e eVar, java.lang.String str, java.nio.ByteBuffer byteBuffer, com.tencent.mm.autogen.mmdata.rpt.WeAppQualityWasmCachePrecompileStruct weAppQualityWasmCachePrecompileStruct) {
        this.f396413a = gVar;
        this.f396414b = eVar;
        this.f396415c = str;
        this.f396416d = byteBuffer;
        this.f396417e = weAppQualityWasmCachePrecompileStruct;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.d0
    public final void a() {
        com.tencent.mm.plugin.appbrand.jsruntime.g gVar = this.f396413a;
        long L = gVar.L();
        long G = gVar.G();
        com.tencent.mm.appbrand.commonjni.TWasmCacheManagerJni a17 = rk1.c.a(rk1.m.f396430e);
        rk1.e eVar = this.f396414b;
        rk1.m.f396433h.put(eVar.f396404a, new rk1.d(this.f396413a, a17.createTask(L, G, eVar.f396404a, eVar.f396406c, eVar.f396407d, eVar.f396408e, this.f396415c, java.lang.Runtime.getRuntime().availableProcessors(), this.f396416d), this.f396416d, this.f396417e));
        gVar.k(new rk1.g(eVar), false);
    }
}
