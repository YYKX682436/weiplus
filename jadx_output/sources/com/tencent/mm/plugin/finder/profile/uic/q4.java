package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class q4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124142d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC) {
        super(0);
        this.f124142d = finderProfileFeedUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f124142d.getIntent().getIntExtra("finder_from_feed_comment_scene", -1));
    }
}
