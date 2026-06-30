package com.tencent.mm.plugin.remittance.bankcard.ui;

/* loaded from: classes9.dex */
public class BankRemitSortView extends com.tencent.mm.ui.base.sortview.BaseSortView {
    public BankRemitSortView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.view.View b() {
        return android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488192k2, this);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public boolean c(java.lang.String str, fb5.n nVar) {
        return false;
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public fb5.l getItemViewCreator() {
        return new qw3.u1(this);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.widget.ListView getListView() {
        return (android.widget.ListView) findViewById(com.tencent.mm.R.id.i3y);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.view.View getNoResultView() {
        return null;
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public com.tencent.mm.ui.base.VerticalScrollBar getScrollBar() {
        return (com.tencent.mm.ui.base.VerticalScrollBar) findViewById(com.tencent.mm.R.id.mwe);
    }
}
