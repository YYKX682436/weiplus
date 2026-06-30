package vx3;

/* loaded from: classes10.dex */
public final class a implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public vx3.i f441261d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f441262e;

    /* renamed from: f, reason: collision with root package name */
    public long f441263f;

    public a(vx3.i iVar, java.lang.String str, long j17, int i17, kotlin.jvm.internal.i iVar2) {
        iVar = (i17 & 1) != 0 ? null : iVar;
        str = (i17 & 2) != 0 ? null : str;
        j17 = (i17 & 4) != 0 ? 0L : j17;
        this.f441261d = iVar;
        this.f441262e = str;
        this.f441263f = j17;
    }

    public final vx3.a a(java.lang.String json) {
        kotlin.jvm.internal.o.g(json, "json");
        vx3.a aVar = new vx3.a(null, null, 0L, 7, null);
        cl0.g gVar = new cl0.g(json);
        try {
            vx3.k kVar = vx3.l.E;
            java.lang.String string = gVar.getString("info");
            kotlin.jvm.internal.o.f(string, "getString(...)");
            aVar.f441261d = kVar.f(string);
            aVar.f441262e = gVar.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            aVar.f441263f = gVar.getLong("order");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExclusiveInfo", "ExclusiveInfo fromJson fail:" + e17);
        }
        return aVar;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        vx3.a other = (vx3.a) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.j(this.f441263f, other.f441263f);
    }
}
