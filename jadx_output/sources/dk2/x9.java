package dk2;

/* loaded from: classes.dex */
public final class x9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.t9 f234339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234340e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234341f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f234342g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f234343h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(dk2.t9 t9Var, java.lang.String str, java.lang.String str2, int i17, int i18) {
        super(0);
        this.f234339d = t9Var;
        this.f234340e = str;
        this.f234341f = str2;
        this.f234342g = i17;
        this.f234343h = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.ui.oa oaVar = (com.tencent.mm.plugin.finder.feed.ui.oa) this.f234339d;
        oaVar.getClass();
        java.lang.String filePath = this.f234340e;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        java.lang.String micReplayUrl = this.f234341f;
        kotlin.jvm.internal.o.g(micReplayUrl, "micReplayUrl");
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayUI", "onVideoDownloaded: filePath=".concat(filePath));
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveKTVReplayUI finderLiveKTVReplayUI = oaVar.f110370a;
        kotlinx.coroutines.l.d(v65.m.b(finderLiveKTVReplayUI), null, null, new com.tencent.mm.plugin.finder.feed.ui.na(finderLiveKTVReplayUI, filePath, micReplayUrl, null), 3, null);
        int i17 = this.f234342g + 1;
        oaVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onProgress: ");
        sb6.append(i17);
        sb6.append('/');
        int i18 = this.f234343h;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVReplayUI", sb6.toString());
        pm0.v.X(new com.tencent.mm.plugin.finder.feed.ui.la(oaVar.f110370a, i17, i18));
        return jz5.f0.f302826a;
    }
}
