package g53;

/* loaded from: classes8.dex */
public final class d implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f268904d;

    public d(long j17) {
        this.f268904d = j17;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f268904d;
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            if (fVar instanceof m53.g2) {
                kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.protobuf.GetGameIndexPreloadCgiResponse");
                com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel a17 = g53.e.f268905a.a();
                a17.f139855g = ((m53.g2) fVar).f323702d;
                a17.f139854f = false;
                a17.f139852d = java.lang.System.currentTimeMillis();
                a17.f139853e = currentTimeMillis;
                g53.e.d(true);
            }
            com.tencent.mars.xlog.Log.i("GameH5CgiPreloadManager", "gamelog.preloadH5CgiData, docgi , success cgiResponseStr= " + g53.e.f268905a.a());
        } else {
            com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel a18 = g53.e.f268905a.a();
            a18.f139855g = null;
            a18.f139854f = true;
            a18.f139852d = java.lang.System.currentTimeMillis();
            a18.f139853e = currentTimeMillis;
            g53.e.d(true);
            com.tencent.mars.xlog.Log.i("GameH5CgiPreloadManager", "gamelog.preloadH5CgiData, docgi , falied  errorCode =" + i18 + " errorMsg = " + str);
        }
        g53.b bVar = g53.e.f268910f;
        if (bVar != null) {
            g53.e eVar = g53.e.f268905a;
            com.tencent.mm.plugin.game.luggage.model.H5CgiPreloadModel data = eVar.a();
            kotlin.jvm.internal.o.g(data, "data");
            com.tencent.mm.ipcinvoker.r rVar = ((g53.k) bVar).f268922a;
            if (rVar != null) {
                rVar.a(eVar.a());
            }
            eVar.getClass();
            g53.e.f268910f = null;
        }
        return 0;
    }
}
