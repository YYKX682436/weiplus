package t21;

/* loaded from: classes12.dex */
public class o0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.r0 f414847d;

    public o0(t21.r0 r0Var) {
        this.f414847d = r0Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        int i18;
        t21.r0 r0Var = this.f414847d;
        if (i17 == -21006) {
            r0Var.J();
            java.lang.String str2 = r0Var.f414911o;
            return 0;
        }
        if (i17 != 0) {
            t21.d3.G(r0Var.f414905f);
            r0Var.f414903d.onSceneEnd(3, i17, "", r0Var);
            return 0;
        }
        r0Var.f414909m = t21.d3.h(r0Var.f414905f);
        t21.v2 v2Var = r0Var.f414909m;
        if (v2Var == null || v2Var.f415011i == 113) {
            int i19 = v2Var == null ? -1 : v2Var.f415011i;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVideo", "%s upload video info is null or has paused, status:%d", r0Var.J(), java.lang.Integer.valueOf(i19));
            r0Var.I();
            r0Var.f414903d.onSceneEnd(3, i17, "upload video info is null or has paused, status" + i19, r0Var);
            return 0;
        }
        if (gVar != null) {
            long j17 = gVar.field_finishedLength;
            if (j17 == r0Var.f414913q) {
                return 0;
            }
            if (v2Var.f415007e > j17 && !r0Var.f414907h) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneDownloadVideo", "%s cdnEndProc error oldpos:%d newpos:%d", r0Var.J(), java.lang.Integer.valueOf(r0Var.f414909m.f415007e), java.lang.Long.valueOf(gVar.field_finishedLength));
                t21.d3.G(r0Var.f414905f);
                r0Var.f414903d.onSceneEnd(3, i17, "", r0Var);
                return 0;
            }
            v2Var.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
            t21.v2 v2Var2 = r0Var.f414909m;
            long j18 = v2Var2.f415007e;
            long j19 = gVar.field_finishedLength;
            if (j18 < j19) {
                v2Var2.f415007e = (int) j19;
                i18 = 1040;
            } else {
                i18 = 1024;
            }
            v2Var2.U = i18;
            t21.d3.Q(v2Var2);
            r0Var.J();
            java.lang.String str3 = r0Var.f414911o;
            return 0;
        }
        if (hVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVideo", "%s cdntra sceneResult.retCode:%d useTime:%d ", r0Var.J(), java.lang.Integer.valueOf(hVar.field_retCode), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r0Var.f414919w));
            dn.o oVar = r0Var.f414910n;
            r0Var.getClass();
            if (oVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneDownloadVideo", "it had not task info or scene Result, don't report.");
            } else if (oVar.field_smallVideoFlag == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVideo", "it download short video, don't report.");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadVideo", "%s sceneResult.field_recvedBytes %d, time [%d, %d]", r0Var.J(), java.lang.Long.valueOf(hVar.field_recvedBytes), java.lang.Long.valueOf(hVar.field_startTime), java.lang.Long.valueOf(hVar.field_endTime));
                t21.o2.Di().r(null, hVar, oVar, true);
            }
            if (hVar.field_retCode != 0) {
                t21.d3.G(r0Var.f414905f);
                if (r0Var.f414907h) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 13L, 1L, false);
                }
                if (r0Var.f414908i) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 252L, 1L, false);
                }
                r0Var.f414903d.onSceneEnd(3, hVar.field_retCode, "", r0Var);
            } else {
                if (r0Var.f414907h) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 12L, 1L, false);
                }
                if (r0Var.f414908i) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 137L, 1L, false);
                }
                r0Var.H((int) hVar.field_fileLength);
            }
            t21.b.a(r0Var.f414909m, 1);
            r0Var.f414910n = null;
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
