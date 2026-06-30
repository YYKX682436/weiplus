package sb4;

/* loaded from: classes4.dex */
public class s implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb4.v f405573d;

    public s(sb4.v vVar) {
        this.f405573d = vVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SnsEventListeners$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SnsEventListeners$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view.getTag() == null) {
            yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SnsEventListeners$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SnsEventListeners$7");
            return true;
        }
        sb4.u uVar = (sb4.u) view.getTag();
        sb4.v vVar = this.f405573d;
        vVar.f405586i = uVar;
        sb4.u uVar2 = vVar.f405586i;
        vVar.b(uVar2.f405576b, uVar2.f405577c, uVar2.f405575a);
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SnsEventListeners$7", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLongClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SnsEventListeners$7");
        return true;
    }
}
