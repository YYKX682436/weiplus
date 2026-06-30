package em1;

/* loaded from: classes7.dex */
public class k extends com.tencent.luggage.sdk.jsapi.component.service.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ em1.l f255052g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(em1.l lVar, com.tencent.mm.plugin.appbrand.jsapi.m mVar) {
        super(mVar);
        this.f255052g = lVar;
    }

    @Override // bl.a
    public void W(int i17) {
    }

    @Override // com.tencent.luggage.sdk.jsapi.component.service.b, bl.a
    public java.lang.String c0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, int i19) {
        em1.l lVar = this.f255052g;
        java.util.List list = lVar.f255054e;
        if (list == null || !list.contains(str)) {
            com.tencent.mm.plugin.appbrand.jsapi.m mVar = lVar.f255053d;
            mVar.d0(i17, mVar.s0(str, "fail:not supported"), lVar.f255055f);
            return "fail:not supported";
        }
        try {
            return lVar.f255053d.q0(str, str2, str3, i17, z17, lVar.f255055f, i19);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.V8EngineWorkerManagerLU", th6, "IMBInvokeHandler.invoke", new java.lang.Object[0]);
            com.tencent.mm.sdk.platformtools.u3.h(new em1.j(this, th6));
            return "";
        }
    }

    @Override // bl.a
    public void e() {
        ((cl.a) this.f255052g.f255056g.f42724b).f42569b.e();
    }

    @Override // bl.a
    public boolean j() {
        return ((cl.a) this.f255052g.f255056g.f42724b).f42569b.j();
    }

    @Override // bl.a
    public java.lang.String k(int i17, long j17, long j18, long j19) {
        return "";
    }
}
