package dk2;

/* loaded from: classes.dex */
public final class w9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.t9 f234281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f234282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(dk2.t9 t9Var, java.util.List list) {
        super(0);
        this.f234281d = t9Var;
        this.f234282e = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.oa oaVar = (com.tencent.mm.plugin.finder.feed.ui.oa) this.f234281d;
        oaVar.getClass();
        java.util.List downloadedFiles = this.f234282e;
        kotlin.jvm.internal.o.g(downloadedFiles, "downloadedFiles");
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayUI", "onSuccess: downloadedCount=" + downloadedFiles.size());
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.ma(oaVar.f110370a, downloadedFiles));
        return jz5.f0.f302826a;
    }
}
