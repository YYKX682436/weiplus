package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class yy extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    public yy(com.tencent.mm.plugin.finder.viewmodel.component.FinderSelfContinueWatchUIC$onCreate$2 finderSelfContinueWatchUIC$onCreate$2, java.util.ArrayList arrayList) {
        super(finderSelfContinueWatchUIC$onCreate$2, arrayList, false);
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerAdapter, in5.n0
    public int x() {
        if (super.x() > 5) {
            return 5;
        }
        return super.x();
    }
}
