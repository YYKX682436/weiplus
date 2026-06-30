package nq3;

/* loaded from: classes12.dex */
public class d implements com.tencent.mm.modelbase.u0, com.tencent.mm.modelbase.v0, zs3.t {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f338992d = "";

    /* renamed from: e, reason: collision with root package name */
    public bt3.l0 f338993e;

    @Override // zs3.t
    public void B0(int i17, zs3.y yVar) {
        if (yVar.field_dataId.equals(this.f338992d)) {
            int i18 = yVar.field_status;
            if (i18 == 2) {
                b(yVar, true);
                jx3.f.INSTANCE.idkeyStat(1241L, 3L, 1L, false);
            } else if (i18 == 3 || i18 == 4) {
                b(yVar, false);
                jx3.f.INSTANCE.idkeyStat(1241L, 5L, 1L, false);
            }
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).P0(this);
            this.f338992d = "";
            c();
        }
    }

    @Override // com.tencent.mm.modelbase.v0
    public void S(long j17, long j18, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "onSceneProgressEnd %s %s %s", this.f338992d, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j17));
    }

    public boolean a() {
        if (!com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return false;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = calendar.get(11);
        int i18 = calendar.get(12);
        return (i17 != 1 || i18 < 30) ? i17 >= 2 && i17 <= 6 : i18 >= (java.lang.Math.abs(gm0.j1.b().h()) % 30) + 30;
    }

    public final void b(zs3.y yVar, boolean z17) {
        if (1 == yVar.field_type) {
            int i17 = yVar.field_fileType;
            if (i17 == 7 || i17 == 5) {
                try {
                    com.tencent.mm.storage.f9 Li = pt0.f0.Li(yVar.field_toUser, java.lang.Long.valueOf(yVar.field_mediaId.split("@")[2]).longValue());
                    ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).wi(true, yVar.field_dataId, Li.I0(), z17, false, Li.Q0());
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CFileAutoDownloader", "start to download next file");
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        nVar.f265536u.a(new nq3.c(this, null));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.equals(this.f338993e) && this.f338992d.equals(java.lang.String.valueOf(this.f338993e.f24318m))) {
            gm0.j1.d().q(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, this);
            this.f338992d = "";
            c();
            if (i17 == 0 && i18 == 0) {
                jx3.f.INSTANCE.idkeyStat(1241L, 2L, 1L, false);
            } else {
                jx3.f.INSTANCE.idkeyStat(1241L, 4L, 1L, false);
            }
        }
    }
}
