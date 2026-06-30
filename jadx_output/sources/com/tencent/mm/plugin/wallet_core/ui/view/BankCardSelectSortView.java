package com.tencent.mm.plugin.wallet_core.ui.view;

/* loaded from: classes9.dex */
public class BankCardSelectSortView extends com.tencent.mm.ui.base.sortview.BaseSortView {
    public BankCardSelectSortView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.view.View b() {
        return android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488192k2, this);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public boolean c(java.lang.String str, fb5.n nVar) {
        return ((gt4.n) nVar.f260898b).f275473c.toUpperCase().contains(str.toUpperCase());
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public fb5.l getItemViewCreator() {
        return new gt4.m(this);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.widget.ListView getListView() {
        return (android.widget.ListView) findViewById(com.tencent.mm.R.id.i3y);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.view.View getNoResultView() {
        return findViewById(com.tencent.mm.R.id.aep);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public com.tencent.mm.ui.base.VerticalScrollBar getScrollBar() {
        return (com.tencent.mm.ui.base.VerticalScrollBar) findViewById(com.tencent.mm.R.id.mwe);
    }
}
