package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0010B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderContactSortView;", "Lcom/tencent/mm/ui/base/sortview/BaseSortView;", "Lcom/tencent/mm/ui/base/VerticalScrollBar;", "getScrollBar", "Landroid/widget/ListView;", "getListView", "Landroid/view/View;", "getNoResultView", "Lfb5/l;", "getItemViewCreator", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/plugin/finder/view/r7", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class FinderContactSortView extends com.tencent.mm.ui.base.sortview.BaseSortView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderContactSortView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        setOnItemClickListener(new com.tencent.mm.plugin.finder.view.t7(this));
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.view.View b() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.afo, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public boolean c(java.lang.String str, fb5.n nVar) {
        if (str == null) {
            return false;
        }
        java.lang.String str2 = nVar != null ? nVar.f260897a : null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        return r26.i0.y(str, str2, false);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public fb5.l getItemViewCreator() {
        return new com.tencent.mm.plugin.finder.view.s7(this);
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.widget.ListView getListView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.i3p);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (android.widget.ListView) findViewById;
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public android.view.View getNoResultView() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kch);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // com.tencent.mm.ui.base.sortview.BaseSortView
    public com.tencent.mm.ui.base.VerticalScrollBar getScrollBar() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nds);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.ui.base.VerticalScrollBar) findViewById;
    }
}
