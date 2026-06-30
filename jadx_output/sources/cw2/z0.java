package cw2;

/* loaded from: classes2.dex */
public final class z0 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f224127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout f224128f;

    public z0(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout finderFeedNewSeekBarLayout) {
        this.f224127e = baseFinderFeed;
        this.f224128f = finderFeedNewSeekBarLayout;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "seeker@" + hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f224127e.B1(false);
        com.tencent.mm.plugin.finder.video.FinderFeedNewSeekBarLayout.E(this.f224128f, true, 0L, false, 6, null);
    }
}
