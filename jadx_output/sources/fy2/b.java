package fy2;

/* loaded from: classes10.dex */
public final class b implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fy2.d f267235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fy2.a f267236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f267237f;

    public b(fy2.d dVar, fy2.a aVar, yz5.l lVar) {
        this.f267235d = dVar;
        this.f267236e = aVar;
        this.f267237f = lVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        yz5.l lVar = this.f267237f;
        fy2.a aVar = this.f267236e;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("Finder.LiveDecorationSlice", "mediaId " + mediaId + " startRet " + i17 + " sceneResult " + hVar + " onlyCheckExist " + z17);
        if (hVar == null) {
            com.tencent.mars.xlog.Log.i("Finder.LiveDecorationSlice", "skip fetch pag callback, sceneResult == null");
            return 0;
        }
        if (hVar.field_retCode != 0) {
            com.tencent.mars.xlog.Log.w("Finder.LiveDecorationSlice", "skip fetch pag callback, fetch pag fail:" + hVar.field_retCode);
            return 0;
        }
        try {
            long j17 = ((mm2.e1) this.f267235d.business(mm2.e1.class)).f328988r.getLong(0);
            java.lang.String b17 = kk.k.b(new com.tencent.mm.vfs.r6(aVar.G1), (int) com.tencent.mm.vfs.w6.k(aVar.G1));
            com.tencent.mars.xlog.Log.i("Finder.LiveDecorationSlice", "loadDecorationRes finish. localMd5:" + b17 + " taskMd5:" + aVar.S1 + " curLiveId:" + j17 + " taskLiveId:" + aVar.R1);
            if (j17 == aVar.R1 && com.tencent.mm.sdk.platformtools.t8.D0(b17, aVar.S1)) {
                if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.TRUE);
                }
            } else if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.LiveDecorationSlice", "loadDecorationRes err:" + e17.getMessage());
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}
