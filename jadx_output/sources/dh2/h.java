package dh2;

/* loaded from: classes10.dex */
public final class h implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh2.x f232444d;

    public h(dh2.x xVar) {
        this.f232444d = xVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        int intValue = ((java.lang.Number) obj).intValue();
        dh2.x xVar = this.f232444d;
        boolean S6 = ((om2.g) xVar.f232468e.a(om2.g.class)).S6();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (S6) {
            com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "audioRouteChange: " + intValue);
            gk2.e eVar = xVar.f232468e;
            kotlinx.coroutines.flow.j2 j2Var = ((om2.e) eVar.a(om2.e.class)).f346295n;
            ((kotlinx.coroutines.flow.h3) j2Var).k(java.lang.Boolean.valueOf(intValue == 2));
            ah2.c cVar = xVar.f232473m;
            if (cVar != null) {
                double d17 = (intValue == 2 || intValue == 4) ? 1.0d : 0.8d;
                jh2.c cVar2 = ((dh2.b0) cVar).f232426f;
                if (cVar2 != null) {
                    cVar2.d(d17);
                }
            }
        }
        return f0Var;
    }
}
