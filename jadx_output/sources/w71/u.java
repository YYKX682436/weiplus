package w71;

/* loaded from: classes11.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.z f443451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w71.y f443452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f443453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f443454g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(bw5.z zVar, w71.y yVar, long j17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f443451d = zVar;
        this.f443452e = yVar;
        this.f443453f = j17;
        this.f443454g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new w71.u(this.f443451d, this.f443452e, this.f443453f, this.f443454g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((w71.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object m521constructorimpl;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            bw5.z zVar = this.f443451d;
            w71.y yVar = this.f443452e;
            w71.s sVar = new w71.s(zVar, yVar.f443468a, yVar.f443469b);
            w71.r rVar = new w71.r(sVar, new w71.t(this.f443452e, this.f443454g));
            synchronized (sVar) {
                sVar.f443446g = rVar;
                sVar.f443447h.a();
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(((gm0.n) com.tencent.mm.modelbase.z2.f70847b).f273260a.f273288b.h(sVar.f443445f, 0)));
                } catch (java.lang.Throwable th6) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                }
                if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                    m521constructorimpl = null;
                }
                java.lang.Boolean bool = (java.lang.Boolean) m521constructorimpl;
                if (!(bool != null ? bool.booleanValue() : false)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "FTSCgi doScene failed");
                    sVar.a(3, -1, "RunCgi doScene failed", null);
                }
            }
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "create fts cgi error " + this.f443453f + ", " + th7.getMessage());
            yz5.l lVar = this.f443454g;
            bw5.a0 a0Var = new bw5.a0();
            a0Var.c(this.f443453f);
            a0Var.b(-1);
            a0Var.f24954f = th7.getMessage();
            a0Var.f24957i[3] = true;
            lVar.invoke(a0Var);
            return jz5.f0.f302826a;
        }
    }
}
