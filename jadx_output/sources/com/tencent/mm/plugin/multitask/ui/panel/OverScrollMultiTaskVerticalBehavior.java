package com.tencent.mm.plugin.multitask.ui.panel;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/panel/OverScrollMultiTaskVerticalBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "<init>", "()V", "ui-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class OverScrollMultiTaskVerticalBehavior extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.tencent.mm.view.recyclerview.WxRecyclerView> {

    /* renamed from: d, reason: collision with root package name */
    public vk3.a f150582d;

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void o(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View target, int i17, int i18, int i19, int i27, int i28) {
        com.tencent.mm.view.recyclerview.WxRecyclerView child = (com.tencent.mm.view.recyclerview.WxRecyclerView) view;
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        if (child != target) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = child.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
        if (linearLayoutManager.y() == (child.getAdapter() != null ? r4.getItemCount() : -1) - 1 || linearLayoutManager.w() == 0) {
            if (i27 > 0 && i28 == 0) {
                child.getTranslationY();
                child.animate().cancel();
                child.setTranslationY(child.getTranslationY() - (i27 / 2));
                vk3.a aVar = this.f150582d;
                if (aVar != null) {
                    ((zk3.x) aVar).a();
                    return;
                }
                return;
            }
            if (i27 >= 0 || i28 != 0) {
                return;
            }
            child.getTranslationY();
            child.animate().cancel();
            child.setTranslationY(child.getTranslationY() - (i27 / 2));
            vk3.a aVar2 = this.f150582d;
            if (aVar2 != null) {
                ((zk3.x) aVar2).a();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean u(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View directTargetChild, android.view.View target, int i17, int i18) {
        com.tencent.mm.view.recyclerview.WxRecyclerView child = (com.tencent.mm.view.recyclerview.WxRecyclerView) view;
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(directTargetChild, "directTargetChild");
        kotlin.jvm.internal.o.g(target, "target");
        return child == target && (i17 & 2) != 0 && i18 == 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void w(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View target, int i17) {
        com.tencent.mm.view.recyclerview.WxRecyclerView child = (com.tencent.mm.view.recyclerview.WxRecyclerView) view;
        kotlin.jvm.internal.o.g(coordinatorLayout, "coordinatorLayout");
        kotlin.jvm.internal.o.g(child, "child");
        kotlin.jvm.internal.o.g(target, "target");
        if (i17 != 0) {
            return;
        }
        if (child.getTranslationY() < 0.0f) {
            child.getTranslationY();
            oa5.b.b(child).n(0.0f).k(new yk3.j(this)).l();
        } else if (child.getTranslationY() > 0.0f) {
            child.getTranslationY();
            oa5.b.b(child).n(0.0f).k(new yk3.k(this)).l();
        }
    }
}
