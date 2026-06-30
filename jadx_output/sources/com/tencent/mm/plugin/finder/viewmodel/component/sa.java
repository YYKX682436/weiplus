package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes15.dex */
public final class sa extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC f135881c;

    public sa(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC) {
        this.f135881c = finderEmojiListUIC;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f135881c.f133544p;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter.getItemViewType(i17) == so2.n0.class.getName().hashCode() ? 1 : 3;
        }
        kotlin.jvm.internal.o.o("emojiAdapter");
        throw null;
    }
}
