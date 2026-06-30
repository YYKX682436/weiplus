package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172603e;

    public e1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView, int i17) {
        this.f172603e = taskBarView;
        this.f172602d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f172602d;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "onSectionDeleted %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172603e;
        if (i17 == 4 && !((java.util.ArrayList) taskBarView.f172523c2.a(4).f318724d).isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "showDataList not empty!");
            return;
        }
        int i18 = com.tencent.mm.plugin.taskbar.ui.TaskBarView.f172519c3;
        int indexOf = taskBarView.f172525e2.indexOf(java.lang.Integer.valueOf(i17));
        if (indexOf == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "section not found!");
            return;
        }
        java.util.ArrayList arrayList = taskBarView.f172525e2;
        arrayList.remove(indexOf);
        taskBarView.getAdapter().notifyItemRemoved(indexOf);
        int size = arrayList.size();
        boolean z17 = false;
        int i19 = (arrayList.contains(5) || arrayList.contains(10)) ? 1 : 0;
        if (size - i19 == 1 && ((java.lang.Integer) arrayList.get(i19)).intValue() == 3) {
            z17 = true;
        }
        taskBarView.w1();
        if (arrayList.size() > size || z17) {
            if (z17) {
                taskBarView.getAdapter().notifyItemChanged(arrayList.indexOf(3));
                return;
            }
            if (arrayList.size() > i19 + 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarView", "other tips show[remove section], mark");
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TASKBAR_HAS_SHOWED_EMPTY_OTHER_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            }
            taskBarView.getAdapter().notifyItemInserted(arrayList.size() - 1);
        }
    }
}
