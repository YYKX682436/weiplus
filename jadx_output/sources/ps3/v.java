package ps3;

/* loaded from: classes15.dex */
public final class v implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps3.w f358130d;

    public v(ps3.w wVar) {
        this.f358130d = wVar;
    }

    @Override // i11.c
    public final boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.pluginsdk.model.lbs.Location location;
        ps3.w wVar = this.f358130d;
        if (wVar.f358133f || (location = wVar.f358134g) != null) {
            return false;
        }
        ps3.q qVar = wVar.f358131d;
        if (z17) {
            ((com.tencent.mm.plugin.radar.ui.RadarViewController) qVar).i(true, location);
            int i18 = (int) d18;
            ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_END, f17, f18, i18);
            wVar.f358134g = new com.tencent.mm.pluginsdk.model.lbs.Location(f18, f17, i18, i17, "", "");
            wVar.f358143s.c(0L, 0L);
        } else {
            ((com.tencent.mm.plugin.radar.ui.RadarViewController) qVar).i(false, location);
            wVar.g();
        }
        return false;
    }
}
