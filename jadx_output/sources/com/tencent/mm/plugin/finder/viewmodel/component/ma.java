package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes15.dex */
public final class ma extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC f135154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC) {
        super(0);
        this.f135154d = finderEmojiListUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC = this.f135154d;
        return new com.tencent.mm.plugin.finder.feed.model.FinderEmojiListLoader(finderEmojiListUIC.f133545q, finderEmojiListUIC.getActivity() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderEmojiSelectUI);
    }
}
