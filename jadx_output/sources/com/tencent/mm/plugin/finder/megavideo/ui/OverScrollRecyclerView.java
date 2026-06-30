package com.tencent.mm.plugin.finder.megavideo.ui;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001b\u0010\t\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/ui/OverScrollRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Landroidx/coordinatorlayout/widget/a;", "Lcom/tencent/mm/plugin/finder/megavideo/ui/OverScrollVerticalBehavior;", "getBehavior", "j2", "Ljz5/g;", "getOverScrollBehavior", "()Lcom/tencent/mm/plugin/finder/megavideo/ui/OverScrollVerticalBehavior;", "overScrollBehavior", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class OverScrollRecyclerView extends com.tencent.mm.view.recyclerview.WxRecyclerView implements androidx.coordinatorlayout.widget.a {

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public final jz5.g overScrollBehavior;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverScrollRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.overScrollBehavior = jz5.h.b(do2.l.f242089d);
    }

    public final com.tencent.mm.plugin.finder.megavideo.ui.OverScrollVerticalBehavior getOverScrollBehavior() {
        return (com.tencent.mm.plugin.finder.megavideo.ui.OverScrollVerticalBehavior) this.overScrollBehavior.getValue();
    }

    @Override // androidx.coordinatorlayout.widget.a
    /* renamed from: getBehavior */
    public com.tencent.mm.plugin.finder.megavideo.ui.OverScrollVerticalBehavior getF150581j2() {
        return getOverScrollBehavior();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverScrollRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.overScrollBehavior = jz5.h.b(do2.l.f242089d);
    }
}
