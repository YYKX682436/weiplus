package sb4;

/* loaded from: classes4.dex */
public class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb4.v f405574d;

    public t(sb4.v vVar) {
        this.f405574d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SnsEventListeners$8");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SnsEventListeners$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SnsEventListeners$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SnsEventListeners$8");
            return;
        }
        if (view.getTag() instanceof sb4.u) {
            sb4.u uVar = (sb4.u) view.getTag();
            sb4.v vVar = this.f405574d;
            vVar.f405586i = uVar;
            sb4.u uVar2 = vVar.f405586i;
            vVar.a(uVar2.f405576b, uVar2.f405577c, uVar2.f405575a);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsSelfBaseAdapter", "tag !instanceof ClickInfo");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$SnsEventListeners$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$SnsEventListeners$8");
    }
}
