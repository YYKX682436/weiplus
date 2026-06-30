package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0004\u0015B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderRefreshLayout;", "Lcom/tencent/mm/view/refreshLayout/WxRefreshLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "Lcom/tencent/mm/plugin/finder/view/lj;", "I", "Lcom/tencent/mm/plugin/finder/view/lj;", "getReportAction", "()Lcom/tencent/mm/plugin/finder/view/lj;", "setReportAction", "(Lcom/tencent/mm/plugin/finder/view/lj;)V", "reportAction", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/view/mj", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class FinderRefreshLayout extends com.tencent.mm.view.refreshLayout.WxRefreshLayout {

    /* renamed from: I, reason: from kotlin metadata */
    public com.tencent.mm.plugin.finder.view.lj reportAction;

    public FinderRefreshLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        on5.b contentView = getContentView();
        return (androidx.recyclerview.widget.RecyclerView) (contentView != null ? ((un5.b) contentView).f429498m : null);
    }

    public final com.tencent.mm.plugin.finder.view.lj getReportAction() {
        return this.reportAction;
    }

    public final void setReportAction(com.tencent.mm.plugin.finder.view.lj ljVar) {
        this.reportAction = ljVar;
    }

    @Override // com.tencent.mm.view.refreshLayout.WxRefreshLayout
    public void w() {
        com.tencent.mm.plugin.finder.view.lj ljVar = this.reportAction;
        if (ljVar != null) {
            com.tencent.mm.plugin.finder.report.h0 h0Var = (com.tencent.mm.plugin.finder.report.h0) ljVar;
            if (h0Var.f125058a) {
                com.tencent.mm.plugin.finder.report.j0.f125083a.e(h0Var.f125059b.hashCode());
                h0Var.f125058a = false;
            }
        }
    }

    @Override // com.tencent.mm.view.refreshLayout.WxRefreshLayout
    public void x(boolean z17) {
        com.tencent.mm.plugin.finder.view.lj ljVar = this.reportAction;
        if (ljVar != null) {
            com.tencent.mm.plugin.finder.report.h0 h0Var = (com.tencent.mm.plugin.finder.report.h0) ljVar;
            h0Var.f125058a = true;
            if (z17) {
                com.tencent.mm.plugin.finder.report.j0.f125083a.f(h0Var.f125059b.hashCode());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderRefreshLayout(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }
}
