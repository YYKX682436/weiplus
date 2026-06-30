package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class m1 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172647d;

    public m1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView) {
        this.f172647d = taskBarView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/TaskBarView$19", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172647d;
        if (i17 == 0) {
            if (taskBarView.f172520a3) {
                taskBarView.f172520a3 = false;
            } else {
                int i18 = taskBarView.Z2;
                if (i18 == 1 || i18 == 2) {
                    taskBarView.getClass();
                }
            }
        }
        taskBarView.Z2 = i17;
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/TaskBarView$19", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/TaskBarView$19", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172647d;
        if (taskBarView.f172529i2) {
            taskBarView.f172529i2 = false;
            if (taskBarView.f172528h2 != null) {
                taskBarView.getClass();
                int w17 = 0 - taskBarView.f172528h2.w();
                if (w17 >= 0 && w17 < taskBarView.getChildCount()) {
                    taskBarView.scrollBy(0, taskBarView.getChildAt(w17).getTop());
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/TaskBarView$19", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
