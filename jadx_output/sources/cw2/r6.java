package cw2;

/* loaded from: classes15.dex */
public final class r6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f223974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f223975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223976f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.h f223977g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ cw2.s6 f223978h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, int i17, java.lang.String str, dn.h hVar, cw2.s6 s6Var) {
        super(0);
        this.f223974d = finderThumbPlayerProxy;
        this.f223975e = i17;
        this.f223976f = str;
        this.f223977g = hVar;
        this.f223978h = s6Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        java.util.HashSet hashSet = com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.f130641g2;
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f223974d;
        finderThumbPlayerProxy.m0(null);
        cw2.s6 s6Var = this.f223978h;
        int i17 = this.f223975e;
        if (i17 != -10012) {
            dn.h hVar = this.f223977g;
            if (i17 != 0) {
                cu2.x xVar = cu2.x.f222449a;
                cw2.wa mediaSource = finderThumbPlayerProxy.getMediaSource();
                long feedId = (mediaSource == null || (feedData = mediaSource.f224099f) == null) ? -1L : feedData.getFeedId();
                java.lang.String str = this.f223976f;
                java.lang.String string = s6Var.f224000e.f224098e.e().getString(9);
                if (string == null) {
                    string = "";
                }
                cw2.wa waVar = s6Var.f224000e;
                java.lang.String str2 = waVar.f224094a;
                java.lang.String str3 = str2 == null ? "" : str2;
                mn2.j4 j4Var = waVar.f224098e;
                cu2.x.h(xVar, feedId, str, string, str3, j4Var.b(), j4Var.g(), j4Var.c(), 0L, 0L, -1, j4Var.e().getInteger(3), "", "", j4Var.d(), false, 16384, null);
                cw2.eb downloadCallback = finderThumbPlayerProxy.getDownloadCallback();
                if (downloadCallback != null) {
                    downloadCallback.q(i17, j4Var, hVar);
                }
            } else {
                cu2.x xVar2 = cu2.x.f222449a;
                java.lang.String str4 = this.f223976f;
                long j17 = hVar.field_fileLength;
                xVar2.n(str4, j17, j17, 3);
                cw2.eb downloadCallback2 = finderThumbPlayerProxy.getDownloadCallback();
                if (downloadCallback2 != null) {
                    downloadCallback2.q(i17, s6Var.f224000e.f224098e, hVar);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i(finderThumbPlayerProxy.getFTPPTag(), "FTPP.onFinish mediaId=" + this.f223976f + " ret=" + i17 + " restart downloader.");
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy.j0(finderThumbPlayerProxy, null, 1, null);
        }
        s6Var.b();
        s6Var.c(false);
        return jz5.f0.f302826a;
    }
}
