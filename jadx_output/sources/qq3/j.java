package qq3;

/* loaded from: classes12.dex */
public final class j implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq3.k f365963d;

    public j(qq3.k kVar) {
        this.f365963d = kVar;
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        qq3.k kVar = this.f365963d;
        kVar.f365962g = j17;
        kVar.f();
        com.tencent.mars.xlog.Log.i("MicroMsg.C2CVideoMsgTask", "c2c video pre download progress, msgId:" + kVar.f365960e.getMsgId() + ", msgSvrId:" + kVar.f365961f + "offset:" + kVar.f365962g + ", total:" + j18);
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        qq3.k kVar = this.f365963d;
        if (i17 != 0) {
            if (((rq3.i) ((cc0.k) i95.n0.c(cc0.k.class))).f398926d != null) {
                java.lang.String filename = kVar.f365964h.E1;
                kotlin.jvm.internal.o.f(filename, "filename");
                long j17 = kVar.f365962g;
                t21.d3.y(filename);
            }
            kVar.d(2, i17);
            return;
        }
        bx1.s sVar = (bx1.s) i95.n0.c(bx1.s.class);
        long j18 = kVar.f365961f;
        java.lang.String w07 = kVar.f365960e.w0();
        kotlin.jvm.internal.o.f(w07, "getFromUser(...)");
        ((kq3.e) sVar).Bi(3L, j18, w07, kVar.f365960e.u0(), kVar.f365960e.G0(), kVar.f365960e.v0(), kVar.f365960e.getCreateTime());
        if (((rq3.i) ((cc0.k) i95.n0.c(cc0.k.class))).f398926d != null) {
            java.lang.String filename2 = kVar.f365964h.E1;
            kotlin.jvm.internal.o.f(filename2, "filename");
            t21.d3.N(filename2, (int) kVar.f365962g);
        }
        qq3.i.e(kVar, 1, 0, 2, null);
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
    }
}
