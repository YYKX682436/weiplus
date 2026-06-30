package es2;

/* loaded from: classes10.dex */
public final class l implements dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final int f256384d;

    /* renamed from: e, reason: collision with root package name */
    public final long f256385e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f256386f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f256387g;

    public l(es2.h0 h0Var, int i17, long j17, java.util.HashMap loadingMap, java.util.concurrent.ConcurrentLinkedQueue preLoadCallbacks) {
        kotlin.jvm.internal.o.g(loadingMap, "loadingMap");
        kotlin.jvm.internal.o.g(preLoadCallbacks, "preLoadCallbacks");
        this.f256387g = h0Var;
        this.f256384d = i17;
        this.f256385e = j17;
        this.f256386f = loadingMap;
    }

    @Override // dn.l
    public void x(java.lang.String mediaId, dn.h hVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        ((c61.l7) i95.n0.c(c61.l7.class)).Uj().i(mediaId, hVar, "worker#complete");
        boolean z17 = hVar != null && hVar.field_retCode == -21112;
        es2.h0 h0Var = this.f256387g;
        if (z17) {
            h0Var.f256376i.a(mediaId);
            return;
        }
        java.util.HashMap hashMap = this.f256386f;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e(h0Var.f256375h, "[onPreloadCompleted] sceneResult == null");
            cs2.p pVar = (cs2.p) h0Var.j("onPreloadCompleted", new es2.j(this, mediaId));
            if (pVar != null) {
                h0Var.f256376i.e(mediaId, "onPreloadCompleted sceneResult null error", pVar, hashMap.size(), h0Var.f256372e.size());
                return;
            }
            return;
        }
        long[] jArr = new long[3];
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).queryDownloadedSize(mediaId, jArr);
        long j17 = jArr[0];
        long j18 = jArr[2];
        cs2.p pVar2 = (cs2.p) h0Var.j("onPreloadCompleted", new es2.k(this, mediaId));
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(mediaId);
        cu2.x xVar = cu2.x.f222449a;
        java.lang.String profile = hVar.f241778m;
        kotlin.jvm.internal.o.f(profile, "profile");
        xVar.l(mediaId, profile);
        int i17 = this.f256384d;
        long j19 = this.f256385e;
        if (j17 > 0 && j18 > 0 && pVar2 != null) {
            so2.i3 c17 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
            c17.field_cacheSize = j17;
            c17.field_totalSize = j18;
            c17.field_state = j18 <= j17 ? 3 : 2;
            int i18 = c17.field_reqFormat;
            int i19 = hVar.field_videoFormat;
            if (i18 != i19) {
                c17.field_reqFormat = i19;
            }
            java.lang.String str = hVar.field_videoFlag;
            if (str == null) {
                str = pVar2.k();
            }
            c17.field_fileFormat = str;
            if (pVar2.f222095l2 == cs2.n.f222080e && c17.field_firstStagePreloadSize == 0) {
                c17.field_firstStagePreloadSize = j17;
            }
            xVar.g(c17, "onPreloadCompleted");
            java.lang.String str2 = h0Var.f256375h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPreloadCompleted] successfully! ");
            sb6.append(pVar2);
            sb6.append(" mediaId=");
            sb6.append(mediaId);
            sb6.append(" startTick=");
            sb6.append(j19);
            sb6.append(" receivedBytes=");
            sb6.append(j17);
            sb6.append(" (query[0]:");
            sb6.append(jArr[0]);
            sb6.append(" x:");
            sb6.append(hVar.field_recvedBytes);
            sb6.append(") fileLength=");
            sb6.append(j18);
            sb6.append(" expect=");
            sb6.append(i17);
            sb6.append("% result=");
            float f17 = (((float) j17) * 100.0f) / ((float) j18);
            sb6.append((int) f17);
            sb6.append("% fileFormat=");
            sb6.append(hVar.field_videoFlag);
            sb6.append(" videoFormat=");
            sb6.append(hVar.field_videoFormat);
            com.tencent.mars.xlog.Log.i(str2, sb6.toString());
            h0Var.f256376i.d(mediaId, j18 == j17, a06.d.b(f17), pVar2, j17, hashMap.size(), h0Var.f256372e.size());
            vr2.h.a(hVar, pVar2);
            pm0.v.X(new es2.i(mediaId));
            return;
        }
        if (j17 <= 0 || j18 <= 0) {
            com.tencent.mars.xlog.Log.e(h0Var.f256375h, "[onPreloadCompleted] ERROR! " + pVar2 + " mediaId=" + mediaId + " startTick=" + j19 + " recvedBytes=" + j17 + " fileLength=" + j18 + " fileFormat=" + hVar.field_videoFlag + " videoFormat=" + hVar.field_videoFormat);
            if (pVar2 != null) {
                h0Var.f256376i.e(mediaId, "onPreloadCompleted error", pVar2, hashMap.size(), h0Var.f256372e.size());
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(h0Var.f256375h, "[onPreloadCompleted] canceled! " + pVar2 + " mediaId=" + mediaId + " startTick=" + j19 + " receivedBytes=" + j17 + " (query[0]:" + jArr[0] + " x:" + hVar.field_recvedBytes + ") fileLength=" + j18 + " expect=" + i17 + "% result=" + ((int) ((((float) j17) * 100.0f) / ((float) j18))) + "% fileFormat=" + hVar.field_videoFlag + " videoFormat=" + hVar.field_videoFormat);
        so2.i3 c18 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
        c18.field_cacheSize = j17;
        c18.field_totalSize = j18;
        xVar.g(c18, "onPreloadCompleted#cancel");
    }
}
