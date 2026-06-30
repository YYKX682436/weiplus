package fc4;

/* loaded from: classes3.dex */
public final class q implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc4.v f261199d;

    public q(fc4.v vVar) {
        this.f261199d = vVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC$onCreate$1$onLongPress$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/flexible/FlexibleScaleUIC$onCreate$1$onLongPress$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        androidx.appcompat.app.AppCompatActivity activity = this.f261199d.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((fc4.j0) pf5.z.f353948a.a(activity).a(fc4.j0.class)).Q6();
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleScaleUIC$onCreate$1$onLongPress$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleScaleUIC$onCreate$1$onLongPress$1");
        return true;
    }
}
