package sc2;

/* loaded from: classes2.dex */
public final class r4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406192e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView f406193f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406194g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406195h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f406196i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(xc2.p0 p0Var, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView, in5.s0 s0Var, java.lang.String str, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(0);
        this.f406191d = p0Var;
        this.f406192e = h0Var;
        this.f406193f = finderFeedLiveNoticeView;
        this.f406194g = s0Var;
        this.f406195h = str;
        this.f406196i = baseFinderFeed;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f406191d.f453244f;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (str = feedObject.getUserName()) == null) {
            str = "";
        }
        java.lang.String string = ((r45.h32) this.f406192e.f310123d).getString(4);
        r45.h32 bj6 = ((b92.d1) zbVar).bj(str, string != null ? string : "");
        if (bj6 != null) {
            com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView finderFeedLiveNoticeView = this.f406193f;
            java.lang.String str2 = this.f406195h;
            android.content.Context context = this.f406194g.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f406196i;
            finderFeedLiveNoticeView.b(context, bj6, str2, true, baseFinderFeed2 != null ? java.lang.Long.valueOf(baseFinderFeed2.getItemId()) : null, baseFinderFeed2 != null ? baseFinderFeed2.w() : null);
        }
        return jz5.f0.f302826a;
    }
}
