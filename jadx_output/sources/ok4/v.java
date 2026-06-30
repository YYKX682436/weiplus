package ok4;

/* loaded from: classes4.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ok4.w f346043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ok4.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f346043d = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ok4.v(this.f346043d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ok4.v vVar = (ok4.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sight.base.b d17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ok4.w wVar = this.f346043d;
        if (com.tencent.mm.vfs.w6.j(wVar.f346059p) && (d17 = com.tencent.mm.plugin.sight.base.e.d(wVar.f346059p, true)) != null) {
            com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct = wVar.f346044a;
            tPVideoPlayReportStruct.L = d17.f162388g;
            tPVideoPlayReportStruct.M = d17.f162387f;
            tPVideoPlayReportStruct.f61043J = d17.f162389h;
            tPVideoPlayReportStruct.C = d17.f162383b;
            tPVideoPlayReportStruct.G = d17.f162382a;
            tPVideoPlayReportStruct.E = d17.f162384c;
            tPVideoPlayReportStruct.F = d17.f162385d;
            tPVideoPlayReportStruct.H = d17.f162386e;
            tPVideoPlayReportStruct.f61050e0 = tPVideoPlayReportStruct.b("VideoCodeCTAG", d17.f162401t, true);
            com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct2 = wVar.f346044a;
            tPVideoPlayReportStruct2.f61052f0 = tPVideoPlayReportStruct2.b("AudioCodeCTAG", d17.f162400s, true);
            if (d17.f162394m) {
                wVar.f346044a.D = 1L;
            } else if (t21.u2.b(wVar.f346059p)) {
                wVar.f346044a.D = 2L;
            }
            com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct tPVideoPlayReportStruct3 = wVar.f346044a;
            if (tPVideoPlayReportStruct3.f61054h <= 0) {
                tPVideoPlayReportStruct3.f61054h = com.tencent.mm.vfs.w6.k(wVar.f346059p);
            }
        }
        wVar.f346044a.k();
        return jz5.f0.f302826a;
    }
}
