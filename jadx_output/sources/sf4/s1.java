package sf4;

/* loaded from: classes4.dex */
public final class s1 implements dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final long f407578d;

    public s1(long j17) {
        this.f407578d = j17;
    }

    @Override // dn.l
    public void x(java.lang.String str, dn.h hVar) {
        if4.h hVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted, mediaId:" + str + ", sceneResult:" + hVar);
        boolean z17 = false;
        if (hVar != null && hVar.field_retCode == -21112) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted, mediaId:" + str + ", video source change!");
            sf4.u1.a(sf4.u1.f407583a, str);
            return;
        }
        if (str == null || hVar == null) {
            return;
        }
        java.util.Map map = sf4.u1.f407588f;
        if (!map.containsKey(str) || (hVar2 = (if4.h) map.get(str)) == null) {
            return;
        }
        if (hVar.field_recvedBytes <= 0 || hVar.field_fileLength <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StoryVideoPreloadMgr", hashCode() + " onPreloadCompleted error, recvedBytes:" + hVar.field_recvedBytes + ", fileLength:" + hVar.field_fileLength);
            return;
        }
        nf4.o b17 = ef4.k0.f252459a.b(hVar2);
        b17.field_cacheSize = (int) hVar.field_recvedBytes;
        b17.field_totalSize = (int) hVar.field_fileLength;
        ef4.w.f252468t.k().D0(b17);
        sf4.u1.f407590h.add(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(hashCode());
        sb6.append(" onPreloadCompleted update cacheSize:");
        sb6.append(b17.field_cacheSize);
        sb6.append(", totalSize:");
        sb6.append(b17.field_totalSize);
        sb6.append(", preloadCost:");
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f407578d);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", sb6.toString());
        pm0.v.X(new sf4.r1(str));
    }
}
