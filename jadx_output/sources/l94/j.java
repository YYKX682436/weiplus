package l94;

/* loaded from: classes4.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d43 f317369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h94.a f317370e;

    public j(r45.d43 d43Var, h94.a aVar) {
        this.f317369d = d43Var;
        this.f317370e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent$onBindData$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldAdCardComponent$onBindData$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.d43 d43Var = this.f317369d;
        java.util.LinkedList click_action_info = d43Var.f372072e;
        kotlin.jvm.internal.o.f(click_action_info, "click_action_info");
        if (!click_action_info.isEmpty()) {
            l94.e.f317340e.a(l94.m.f317380f, 183, this.f317370e.d(), (r45.x30) d43Var.f372072e.get(0));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldAdCardComponent$onBindData$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent$onBindData$3");
    }
}
