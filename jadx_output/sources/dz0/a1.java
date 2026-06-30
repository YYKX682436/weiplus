package dz0;

/* loaded from: classes5.dex */
public final class a1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244768e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244769f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f244770g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f244768e = maasSdkUIC;
        this.f244769f = str;
        this.f244770g = str2;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = this.f244770g;
        dz0.a1 a1Var = new dz0.a1(this.f244768e, this.f244769f, str, (kotlin.coroutines.Continuation) obj3);
        a1Var.f244767d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        a1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((java.lang.Throwable) this.f244767d) == null) {
            com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", "release after export");
            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = this.f244768e;
            maasSdkUIC.n7();
            az0.n7 n7Var = maasSdkUIC.f69783d;
            if (n7Var != null) {
                n7Var.k();
            }
            bz0.j jVar = bz0.j.f36750a;
            java.lang.String templateId = this.f244769f;
            kotlin.jvm.internal.o.g(templateId, "templateId");
            java.lang.String musicId = this.f244770g;
            kotlin.jvm.internal.o.g(musicId, "musicId");
            com.tencent.mm.autogen.mmdata.rpt.MaasRecommendReportStruct maasRecommendReportStruct = bz0.j.f36751b;
            maasRecommendReportStruct.f58991o = maasRecommendReportStruct.b("savetid", templateId, true);
            maasRecommendReportStruct.f58992p = maasRecommendReportStruct.b("savesid", musicId, true);
            jVar.c(1);
            maasSdkUIC.f69783d = null;
        }
        return jz5.f0.f302826a;
    }
}
