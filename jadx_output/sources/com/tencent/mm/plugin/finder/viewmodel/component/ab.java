package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class ab implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC f133762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f133763e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f133764f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f133765g;

    public ab(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, int i17) {
        this.f133762d = finderEmojiListUIC;
        this.f133763e = f0Var;
        this.f133764f = f0Var2;
        this.f133765g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f133763e.f310116d;
        int i18 = this.f133764f.f310116d;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC = this.f133762d;
        if (finderEmojiListUIC.f133553y) {
            return;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.xa xaVar = new com.tencent.mm.plugin.finder.viewmodel.component.xa(i18, i17, this.f133765g, finderEmojiListUIC.getContext());
        xaVar.f12049a = i17;
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = finderEmojiListUIC.A;
        if (gridLayoutManager != null) {
            gridLayoutManager.startSmoothScroll(xaVar);
        }
        finderEmojiListUIC.f133553y = true;
    }
}
