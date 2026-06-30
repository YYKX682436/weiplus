package wu2;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FeedUpdateEvent f449708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment f449709e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent, com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment finderLikeFeedGridFragment) {
        super(0);
        this.f449708d = feedUpdateEvent;
        this.f449709e = finderLikeFeedGridFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet hashSet;
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = this.f449708d;
        feedUpdateEvent.f54252g.getClass();
        am.ia iaVar = feedUpdateEvent.f54252g;
        if (iaVar.f6919b == 4) {
            int i17 = iaVar.f6922e;
            com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment finderLikeFeedGridFragment = this.f449709e;
            if (i17 == 0) {
                java.util.HashSet hashSet2 = finderLikeFeedGridFragment.f129277z;
                if (hashSet2 != null) {
                    hashSet2.add(java.lang.Long.valueOf(iaVar.f6918a));
                }
            } else if (i17 == 1 && (hashSet = finderLikeFeedGridFragment.f129277z) != null) {
                hashSet.remove(java.lang.Long.valueOf(iaVar.f6918a));
            }
        }
        return jz5.f0.f302826a;
    }
}
