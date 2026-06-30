package com.tencent.mm.ui.tipsbar;

/* loaded from: classes5.dex */
public final class n extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public final /* synthetic */ com.tencent.mm.ui.tipsbar.ChatTipsBarGroup I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.ui.tipsbar.ChatTipsBarGroup chatTipsBarGroup, in5.s sVar, java.util.ArrayList arrayList) {
        super(sVar, arrayList, false);
        this.I = chatTipsBarGroup;
        registerAdapterDataObserver(new com.tencent.mm.ui.tipsbar.m());
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public int x() {
        int x17 = super.x();
        if (this.I.f209914p.f209925a != com.tencent.mm.ui.tipsbar.c.f209922d || x17 <= 1) {
            return x17;
        }
        return 1;
    }
}
