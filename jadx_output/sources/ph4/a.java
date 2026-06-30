package ph4;

/* loaded from: classes8.dex */
public final class a extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ph4.e f354460d;

    public a(ph4.e eVar) {
        this.f354460d = eVar;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f354460d.getViewModel().f318724d).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        ph4.b viewHolder = (ph4.b) k3Var;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ph4.e eVar = this.f354460d;
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) eVar.getViewModel().f318724d).get(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionBaseView", "configItemViewHolderOnBind %d %d", java.lang.Integer.valueOf(viewHolder.getAdapterPosition()), java.lang.Integer.valueOf(eVar.f318711e));
        android.view.View view = viewHolder.itemView;
        view.setTag(com.tencent.mm.R.id.cvq, new rl5.r(eVar.getContext(), view));
        view.setOnClickListener(new lh4.c(viewHolder, eVar));
        view.setOnLongClickListener(new lh4.g(eVar, viewHolder));
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo2 = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) eVar.getViewModel().f318724d).get(i17);
        kotlin.jvm.internal.o.g(multiTaskInfo2, "multiTaskInfo");
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = (com.tencent.mm.plugin.taskbar.ui.TaskBarView) eVar.f318710d;
        if (!taskBarView.f172545y2) {
            com.tencent.mm.plugin.taskbar.ui.o2 o2Var = taskBarView.f172523c2;
            o2Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarViewPresenter", "reportOnItemAppear type:%d,multiTaskId:%s", java.lang.Integer.valueOf(multiTaskInfo2.field_type), multiTaskInfo2.field_id);
            int a17 = o2Var.f172674t.a(multiTaskInfo2.field_type);
            com.tencent.mm.plugin.taskbar.ui.a2 a2Var = o2Var.f172655a;
            if (a2Var != null && ((com.tencent.mm.plugin.taskbar.ui.TaskBarView) a2Var).f172542v2) {
                o2Var.f172674t.d(2, a17, multiTaskInfo2.field_id, 1, "", "", 0, o2Var.f172666l, "", -1);
            } else {
                com.tencent.mm.plugin.taskbar.ui.b2 b2Var = new com.tencent.mm.plugin.taskbar.ui.b2();
                b2Var.f172569a = 1;
                b2Var.f172570b = a17;
                b2Var.f172571c = multiTaskInfo2.field_id;
                b2Var.f172572d = multiTaskInfo2;
                o2Var.f172677w.add(b2Var);
            }
        }
        ph4.j jVar = (ph4.j) eVar.f354475o.get(java.lang.Integer.valueOf(multiTaskInfo.field_type));
        if (jVar != null) {
            jVar.d(i17, viewHolder, eVar.getViewModel());
        }
        android.view.View view2 = viewHolder.itemView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) viewHolder.f354464g.getText());
        sb6.append(',');
        sb6.append((java.lang.Object) viewHolder.f354463f.getText());
        view2.setContentDescription(sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionOtherView", "onBindViewHolder end " + multiTaskInfo.field_type + ' ' + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ' ' + multiTaskInfo.v0().getString(1));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup p07, int i17) {
        kotlin.jvm.internal.o.g(p07, "p0");
        android.view.View inflate = android.view.LayoutInflater.from(p07.getContext()).inflate(com.tencent.mm.R.layout.cxx, p07, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new ph4.b(inflate);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        ph4.b holder = (ph4.b) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i17, payloads);
        }
    }
}
