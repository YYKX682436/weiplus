package com.tencent.mm.plugin.taskbar.ui;

/* loaded from: classes8.dex */
public class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.taskbar.ui.TaskBarContainer f172653d;

    public o0(com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer) {
        this.f172653d = taskBarContainer;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/TaskBarContainer$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.taskbar.ui.TaskBarContainer taskBarContainer = this.f172653d;
        com.tencent.mm.plugin.taskbar.ui.z zVar = taskBarContainer.f172497d;
        if (zVar != null) {
            if (zVar.h() && zVar.N) {
                taskBarContainer.f172497d.a(14);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/TaskBarContainer$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
