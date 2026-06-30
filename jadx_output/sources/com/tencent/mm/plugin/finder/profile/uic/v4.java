package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class v4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC f124283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f124284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f124285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f124286g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f124287h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f124288i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, long j17, android.widget.ImageView imageView, android.graphics.Rect rect) {
        super(2);
        this.f124283d = finderProfileFeedUIC;
        this.f124284e = baseFinderFeed;
        this.f124285f = i17;
        this.f124286g = j17;
        this.f124287h = imageView;
        this.f124288i = rect;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileFeedUIC finderProfileFeedUIC = this.f124283d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f124284e;
        int i17 = this.f124285f;
        long j17 = this.f124286g;
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        android.widget.ImageView thumbView = this.f124287h;
        kotlin.jvm.internal.o.f(thumbView, "$thumbView");
        finderProfileFeedUIC.enterFinderLiveVisitorUI(baseFinderFeed, i17, booleanValue, j17, intent2, thumbView, this.f124288i);
        return jz5.f0.f302826a;
    }
}
