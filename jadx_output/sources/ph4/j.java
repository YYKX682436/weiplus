package ph4;

/* loaded from: classes8.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public final ph4.f f354486a;

    public j(ph4.f callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f354486a = callback;
    }

    public abstract int a(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo);

    public abstract java.lang.String b(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo);

    public void c(ph4.b viewHolder) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
    }

    public void d(int i17, ph4.b viewHolder, lh4.n viewModel) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(viewModel, "viewModel");
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) ((java.util.ArrayList) viewModel.f318724d).get(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "onBind " + i17 + ' ' + multiTaskInfo.v0().getString(1) + ' ' + multiTaskInfo.field_type + ' ' + multiTaskInfo.field_id);
        viewHolder.f354464g.setText(b(multiTaskInfo));
        android.view.View view = viewHolder.f354466i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = viewHolder.f354467m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherViewBaseHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        viewHolder.f354468n.setVisibility(8);
        android.widget.ImageView imageView = viewHolder.f354461d;
        imageView.setVisibility(0);
        imageView.setImageResource(a(multiTaskInfo));
        android.widget.ImageView imageView2 = viewHolder.f354462e;
        imageView2.setImageDrawable(null);
        imageView2.setBackground(null);
        if (lh4.n.f318719e.b(multiTaskInfo.field_type)) {
            java.lang.String str = multiTaskInfo.field_id;
            if (str == null) {
                str = "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = gh4.m0.f271939a;
            sb6.append(gh4.m0.f271940b);
            sb6.append(str);
            java.lang.String sb7 = sb6.toString();
            if (!com.tencent.mm.vfs.w6.j(sb7)) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                java.lang.String str3 = gh4.m0.f271939a;
                sb8.append(gh4.m0.f271939a);
                sb8.append(str);
                sb7 = sb8.toString();
            }
            if (com.tencent.mm.vfs.w6.j(sb7)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "load snapshots " + multiTaskInfo.field_id + ' ' + sb7);
                n11.a.b().j(sb7, imageView2, gh4.j0.f271934b, new ph4.h(i17, multiTaskInfo, viewHolder, this));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "loadFallbackImage[file not exist] " + multiTaskInfo.field_id);
                c(viewHolder);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarSectionOtherViewBaseHelper", "loadFallbackImage[disabled] " + multiTaskInfo.field_id);
            c(viewHolder);
        }
        viewHolder.f354465h.setOnClickListener(new ph4.i(this, viewHolder));
    }
}
