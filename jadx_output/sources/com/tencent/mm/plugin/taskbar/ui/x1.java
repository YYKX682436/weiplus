package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class x1 extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172749d;

    public x1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView, com.tencent.mm.plugin.taskbar.ui.TaskBarView.AnonymousClass1 anonymousClass1) {
        this.f172749d = taskBarView;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        int emptyViewTopMargin;
        super.getItemOffsets(rect, view, recyclerView, h3Var);
        androidx.recyclerview.widget.k3 w07 = recyclerView.w0(view);
        if (w07 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TaskBarView", "null holder");
            return;
        }
        int adapterPosition = w07.getAdapterPosition();
        if (h3Var.f12069k && adapterPosition == -1) {
            adapterPosition = w07.getOldPosition();
        }
        int itemViewType = w07.getItemViewType();
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172749d;
        if (adapterPosition == 0) {
            rect.top = 0;
        } else if (itemViewType == 2 || itemViewType == 7) {
            rect.top = 0;
        } else if (itemViewType == 4) {
            if (taskBarView.f172525e2.contains(2) || taskBarView.f172525e2.contains(1) || taskBarView.f172525e2.contains(7)) {
                rect.top = i65.a.f(view.getContext(), com.tencent.mm.R.dimen.f479704cz);
            } else {
                rect.top = 0;
            }
        }
        if (itemViewType == 3) {
            emptyViewTopMargin = taskBarView.getEmptyViewTopMargin();
            rect.top = emptyViewTopMargin;
        }
        java.util.ArrayList arrayList = taskBarView.f172525e2;
        if (itemViewType == ((java.lang.Integer) arrayList.get(arrayList.size() - 1)).intValue()) {
            rect.bottom = i65.a.f(view.getContext(), com.tencent.mm.R.dimen.f479718db);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "getItemOffsets index:%d sectionType:%d rect:%s", java.lang.Integer.valueOf(adapterPosition), java.lang.Integer.valueOf(itemViewType), rect);
    }
}
