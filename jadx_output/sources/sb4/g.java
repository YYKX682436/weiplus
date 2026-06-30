package sb4;

/* loaded from: classes4.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb4.e f405499d;

    public g(sb4.e eVar) {
        this.f405499d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() instanceof com.tencent.mm.protocal.protobuf.TimeLineObject) {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = (com.tencent.mm.protocal.protobuf.TimeLineObject) view.getTag();
            sb4.e eVar = this.f405499d;
            com.tencent.mm.plugin.sns.ui.wm.e(timeLineObject, eVar.f405455d, 1);
            eVar.notifyDataSetChanged();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter$2");
    }
}
