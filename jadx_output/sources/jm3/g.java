package jm3;

/* loaded from: classes10.dex */
public final class g implements com.tencent.mm.plugin.mv.ui.uic.f8 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h6 f300318d;

    public g(com.tencent.mm.plugin.mv.ui.uic.h6 h6Var) {
        this.f300318d = h6Var;
    }

    @Override // com.tencent.mm.plugin.mv.ui.uic.f8
    public void select(int i17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        pk4.c cVar = this.f300318d.f151186n;
        if (cVar != null) {
            gk4.r rVar = ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).f174566f;
            java.lang.String str = rVar.f272602g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("seekToIndex:");
            sb6.append(i17);
            sb6.append(", renderPts:");
            sb6.append(rVar.f272612q);
            sb6.append(", playingPlayers.size:");
            sb6.append(rVar.f272606k.size());
            sb6.append(", status:");
            sb6.append(rVar.f272611p);
            sb6.append(", trackList.size:");
            gk4.t tVar = rVar.f272609n;
            sb6.append((tVar == null || (arrayList2 = tVar.f272630a) == null) ? null : java.lang.Integer.valueOf(arrayList2.size()));
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            gk4.t tVar2 = rVar.f272609n;
            if (tVar2 == null || (arrayList = tVar2.f272630a) == null || i17 > arrayList.size()) {
                return;
            }
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            gk4.s sVar = (gk4.s) obj;
            long j17 = sVar.f272625d;
            com.tencent.mars.xlog.Log.i(rVar.f272602g, "found seek target track:" + sVar + ", trackSeekTime:" + j17 + ", trackStartTimeMs:" + sVar.f272625d);
            rVar.f272619x = sVar.f272623b;
            rVar.g(sVar, j17);
        }
    }
}
