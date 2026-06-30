package com.tencent.mm.plugin.multitask.ui.panel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/panel/OverScrollMultiTaskRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Landroidx/coordinatorlayout/widget/a;", "Lcom/tencent/mm/plugin/multitask/ui/panel/OverScrollMultiTaskVerticalBehavior;", "getBehavior", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class OverScrollMultiTaskRecyclerView extends com.tencent.mm.view.recyclerview.WxRecyclerView implements androidx.coordinatorlayout.widget.a {

    /* renamed from: j2, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitask.ui.panel.OverScrollMultiTaskVerticalBehavior f150581j2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverScrollMultiTaskRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f150581j2 = new com.tencent.mm.plugin.multitask.ui.panel.OverScrollMultiTaskVerticalBehavior();
    }

    @Override // androidx.coordinatorlayout.widget.a
    /* renamed from: getBehavior, reason: from getter */
    public com.tencent.mm.plugin.multitask.ui.panel.OverScrollMultiTaskVerticalBehavior getF150581j2() {
        return this.f150581j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverScrollMultiTaskRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f150581j2 = new com.tencent.mm.plugin.multitask.ui.panel.OverScrollMultiTaskVerticalBehavior();
    }
}
