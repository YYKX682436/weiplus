package lh4;

/* loaded from: classes8.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f318701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lh4.h f318702e;

    public c(androidx.recyclerview.widget.k3 k3Var, lh4.h hVar) {
        this.f318701d = k3Var;
        this.f318702e = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionBaseView$configItemViewHolderOnBind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int adapterPosition = this.f318701d.getAdapterPosition();
        if (adapterPosition >= 0) {
            lh4.h hVar = this.f318702e;
            if (adapterPosition < ((java.util.ArrayList) hVar.getViewModel().f318724d).size()) {
                com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = (com.tencent.mm.plugin.taskbar.ui.TaskBarView) hVar.getCallback();
                taskBarView.E2 = hVar.g(adapterPosition);
                taskBarView.D2 = true;
                lh4.b callback = hVar.getCallback();
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) hVar.getViewModel().f318724d).get(adapterPosition);
                com.tencent.mm.plugin.taskbar.ui.o2 o2Var = ((com.tencent.mm.plugin.taskbar.ui.TaskBarView) callback).f172523c2;
                o2Var.getClass();
                kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemClicked type:%d,pos:%d", java.lang.Integer.valueOf(multiTaskInfo.field_type), java.lang.Integer.valueOf(adapterPosition));
                int a17 = o2Var.f172674t.a(multiTaskInfo.field_type);
                o2Var.f172678x = a17;
                o2Var.f172674t.e(a17, adapterPosition, multiTaskInfo.field_id, 1, null, "", o2Var.f172666l, "", -1);
                gh4.e0 e0Var = (gh4.e0) i95.n0.c(gh4.e0.class);
                android.content.Context context = hVar.getContext();
                com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) hVar.f318714h.f318724d).get(adapterPosition);
                e0Var.getClass();
                kotlin.jvm.internal.o.g(multiTaskInfo2, "multiTaskInfo");
                gh4.s0 s0Var = (gh4.s0) i95.n0.c(gh4.s0.class);
                s0Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewService", "notifyClick " + multiTaskInfo2.v0().getString(1) + ' ' + multiTaskInfo2.field_id + ' ' + multiTaskInfo2.field_type);
                java.util.HashSet hashSet = (java.util.HashSet) s0Var.f271954d.get(multiTaskInfo2.field_type);
                if (hashSet != null) {
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((hh4.k) it.next()).a(multiTaskInfo2);
                    }
                }
                fs.g.c(hh4.j.class, java.lang.Integer.valueOf(multiTaskInfo2.field_type), new gh4.p0(context, multiTaskInfo2));
                yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionBaseView$configItemViewHolderOnBind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionBaseView$configItemViewHolderOnBind$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
