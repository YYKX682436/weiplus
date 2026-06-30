package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class rg extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC f124190a;

    public rg(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTemplateUIC finderProfileTemplateUIC) {
        this.f124190a = finderProfileTemplateUIC;
    }

    @Override // ym5.q3
    public void b(int i17) {
        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(this.f124190a.R6(), false, 1, null);
    }
}
