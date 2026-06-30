package mn2;

/* loaded from: classes10.dex */
public final class o0 implements dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.q0 f330076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c50.z0 f330077e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f330078f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mn2.g4 f330079g;

    public o0(mn2.q0 q0Var, c50.z0 z0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, mn2.g4 g4Var) {
        this.f330076d = q0Var;
        this.f330077e = z0Var;
        this.f330078f = finderItem;
        this.f330079g = g4Var;
    }

    @Override // dn.l
    public void x(java.lang.String mediaId, dn.h hVar) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        boolean z17 = hVar != null && hVar.field_retCode == -21112;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f330078f;
        c50.z0 z0Var = this.f330077e;
        mn2.q0 q0Var = this.f330076d;
        if (z17) {
            mn2.q0.b(z0Var, finderItem, q0Var, mediaId, -11);
            return;
        }
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e(q0Var.f330092a, "[onPreloadCompleted] sceneResult == null");
            mn2.q0.b(z0Var, finderItem, q0Var, mediaId, -21);
            return;
        }
        long[] jArr = new long[3];
        ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).queryDownloadedSize(mediaId, jArr);
        long j17 = jArr[0];
        long j18 = jArr[2];
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(mediaId);
        if (j17 <= 0 || j18 <= 0) {
            com.tencent.mars.xlog.Log.e(q0Var.f330092a, "[onPreloadCompleted] ERROR! mediaId=" + mediaId + " recvedBytes=" + j17 + " fileLength=" + j18 + " fileFormat=" + hVar.field_videoFlag + " videoFormat=" + hVar.field_videoFormat);
            mn2.q0.b(z0Var, finderItem, q0Var, mediaId, -21);
            return;
        }
        cu2.x xVar = cu2.x.f222449a;
        so2.i3 c17 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
        c17.field_cacheSize = j17;
        c17.field_totalSize = j18;
        c17.field_state = j18 <= j17 ? 3 : 1;
        c17.field_reqFormat = hVar.field_videoFormat;
        java.lang.String str = hVar.field_videoFlag;
        mn2.g4 g4Var = this.f330079g;
        if (str == null) {
            str = g4Var.g();
        }
        c17.field_fileFormat = str;
        xVar.g(c17, "onPreloadCompleted");
        com.tencent.mars.xlog.Log.i(q0Var.f330092a, "[onPreloadCompleted] successfully! mediaId=" + mediaId + " receivedBytes=" + j17 + " (query[0]:" + jArr[0] + " x:" + hVar.field_recvedBytes + ") fileLength=" + j18 + " result=" + ((int) ((((float) j17) * 100.0f) / ((float) j18))) + "% fileFormat=" + hVar.field_videoFlag + " videoFormat=" + hVar.field_videoFormat);
        z0Var.a(finderItem.getId(), 0, g4Var.j());
        q0Var.f330093b.remove(mediaId);
    }
}
