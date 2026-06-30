package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarView f172684d;

    public p1(com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView) {
        this.f172684d = taskBarView;
    }

    @Override // java.lang.Runnable
    public void run() {
        ph4.e eVar;
        java.lang.Object obj;
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = this.f172684d;
        if (!taskBarView.f172525e2.contains(4) || (eVar = taskBarView.f172534n2) == null) {
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) eVar.getViewModel().f318724d).iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) it.next()).field_type == 21) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        if (i17 != -1) {
            java.util.Iterator it6 = eVar.getViewModel().f318723c.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if (((com.tencent.mm.plugin.multitask.model.MultiTaskInfo) obj).field_type == 21) {
                        break;
                    }
                }
            }
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) obj;
            if (multiTaskInfo != null) {
                ((java.util.ArrayList) eVar.getViewModel().f318724d).set(i17, multiTaskInfo);
            }
            eVar.f354474n.notifyItemChanged(i17);
        }
    }
}
