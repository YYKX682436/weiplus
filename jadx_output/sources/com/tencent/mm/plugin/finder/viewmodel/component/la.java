package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes15.dex */
public final class la extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC f135032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC) {
        super(0);
        this.f135032d = finderEmojiListUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC = this.f135032d;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout rlLayout = finderEmojiListUIC.getRlLayout();
        kotlin.jvm.internal.o.f(rlLayout, "access$getRlLayout(...)");
        return new com.tencent.mm.plugin.finder.viewmodel.component.ka(finderEmojiListUIC, rlLayout);
    }
}
