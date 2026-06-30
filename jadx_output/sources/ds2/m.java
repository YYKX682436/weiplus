package ds2;

/* loaded from: classes10.dex */
public final class m implements dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final int f242875d;

    /* renamed from: e, reason: collision with root package name */
    public final long f242876e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f242877f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f242878g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f242879h;

    public m(ds2.b0 b0Var, int i17, long j17, java.util.HashMap loadingMap, java.util.concurrent.ConcurrentLinkedQueue preLoadCallbacks) {
        kotlin.jvm.internal.o.g(loadingMap, "loadingMap");
        kotlin.jvm.internal.o.g(preLoadCallbacks, "preLoadCallbacks");
        this.f242879h = b0Var;
        this.f242875d = i17;
        this.f242876e = j17;
        this.f242877f = loadingMap;
        this.f242878g = preLoadCallbacks;
    }

    @Override // dn.l
    public void x(java.lang.String mediaId, dn.h hVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        ((c61.l7) i95.n0.c(c61.l7.class)).Uj().i(mediaId, hVar, "worker#complete");
        boolean z17 = hVar != null && hVar.field_retCode == -21112;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f242878g;
        if (z17) {
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                ((vr2.i) it.next()).a(mediaId);
            }
            return;
        }
        java.util.HashMap hashMap = this.f242877f;
        ds2.b0 b0Var = this.f242879h;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e(b0Var.f242859g, "[onPreloadCompleted] sceneResult == null");
            cs2.p pVar = (cs2.p) b0Var.f("onPreloadCompleted", new ds2.k(this, mediaId));
            if (pVar != null) {
                java.util.Iterator it6 = concurrentLinkedQueue.iterator();
                while (it6.hasNext()) {
                    ((vr2.i) it6.next()).e(mediaId, "onPreloadCompleted sceneResult null error", pVar, hashMap.size(), b0Var.f242856d.size());
                }
                return;
            }
            return;
        }
        long[] jArr = new long[3];
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).queryDownloadedSize(mediaId, jArr);
        long j17 = jArr[0];
        long j18 = jArr[2];
        cs2.p pVar2 = (cs2.p) b0Var.f("onPreloadCompleted", new ds2.l(this, mediaId));
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(mediaId);
        cu2.x xVar = cu2.x.f222449a;
        java.lang.String profile = hVar.f241778m;
        kotlin.jvm.internal.o.f(profile, "profile");
        xVar.l(mediaId, profile);
        int i17 = this.f242875d;
        long j19 = this.f242876e;
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
            if (pVar2.f222095l2 == cs2.n.f222080e && c17.field_firstStagePreloadSize == 0) {
                c17.field_firstStagePreloadSize = j17;
            }
            java.lang.String str = hVar.field_videoFlag;
            if (str == null) {
                str = pVar2.k();
            }
            c17.field_fileFormat = str;
            xVar.g(c17, "onPreloadCompleted");
            java.lang.String str2 = b0Var.f242859g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPreloadCompleted] successfully! mediaId=");
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
            java.util.Iterator it7 = concurrentLinkedQueue.iterator();
            while (it7.hasNext()) {
                ((vr2.i) it7.next()).d(mediaId, j18 == j17, a06.d.b(f17), pVar2, j17, hashMap.size(), b0Var.f242856d.size());
            }
            vr2.h.a(hVar, pVar2);
            pm0.v.X(new ds2.j(mediaId));
            return;
        }
        if (j17 <= 0 || j18 <= 0) {
            com.tencent.mars.xlog.Log.e(b0Var.f242859g, "[onPreloadCompleted] ERROR! mediaId=" + mediaId + " startTick=" + j19 + " recvedBytes=" + j17 + " fileLength=" + j18 + " fileFormat=" + hVar.field_videoFlag + " videoFormat=" + hVar.field_videoFormat);
            if (pVar2 != null) {
                java.util.Iterator it8 = concurrentLinkedQueue.iterator();
                while (it8.hasNext()) {
                    ((vr2.i) it8.next()).e(mediaId, "onPreloadCompleted error", pVar2, hashMap.size(), b0Var.f242856d.size());
                }
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(b0Var.f242859g, "[onPreloadCompleted] canceled! mediaId=" + mediaId + " startTick=" + j19 + " receivedBytes=" + j17 + " (query[0]:" + jArr[0] + " x:" + hVar.field_recvedBytes + ") fileLength=" + j18 + " expect=" + i17 + "% result=" + ((int) ((((float) j17) * 100.0f) / ((float) j18))) + "% fileFormat=" + hVar.field_videoFlag + " videoFormat=" + hVar.field_videoFormat);
        so2.i3 c18 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
        c18.field_cacheSize = j17;
        c18.field_totalSize = j18;
        xVar.g(c18, "onPreloadCompleted#cancel");
    }
}
