package ps3;

/* loaded from: classes15.dex */
public final class u implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.w f358129d;

    public u(ps3.w wVar) {
        this.f358129d = wVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        ps3.w wVar = this.f358129d;
        if (!wVar.f358133f) {
            wVar.f358136i = ps3.s.f358126f;
            com.tencent.mm.pluginsdk.model.lbs.Location location = wVar.f358134g;
            if (location != null) {
                float f17 = location.f189366d;
                if (f17 == -85.0f || location.f189367e == -1000.0f) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Radar.RadarManager", "error! location is null!");
                    return false;
                }
                float f18 = location.f189367e;
                int i17 = location.f189368f;
                int i18 = location.f189369g;
                java.lang.String mac = location.f189370h;
                kotlin.jvm.internal.o.f(mac, "mac");
                java.lang.String cellId = location.f189371i;
                kotlin.jvm.internal.o.f(cellId, "cellId");
                wVar.f358135h = new ps3.a(1, f17, f18, i17, i18, mac, cellId);
                gm0.j1.d().g(wVar.f358135h);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Radar.RadarManager", "error! location is null!");
            }
        }
        return false;
    }
}
