package wu2;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedUpdateEvent f449684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment f449685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent, com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment finderFavFeedFragment) {
        super(0);
        this.f449684d = feedUpdateEvent;
        this.f449685e = finderFavFeedFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet hashSet;
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = this.f449684d;
        feedUpdateEvent.f54252g.getClass();
        am.ia iaVar = feedUpdateEvent.f54252g;
        if (iaVar.f6919b == 5) {
            int i17 = iaVar.f6920c;
            com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment finderFavFeedFragment = this.f449685e;
            if (i17 == 2) {
                java.util.HashSet hashSet2 = finderFavFeedFragment.f129260z;
                if (hashSet2 != null) {
                    hashSet2.add(java.lang.Long.valueOf(iaVar.f6918a));
                }
            } else if (i17 == 1 && (hashSet = finderFavFeedFragment.f129260z) != null) {
                hashSet.remove(java.lang.Long.valueOf(iaVar.f6918a));
            }
        }
        return jz5.f0.f302826a;
    }
}
