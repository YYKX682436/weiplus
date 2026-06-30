package u94;

/* loaded from: classes4.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f425865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u94.p f425866e;

    public i(u94.p pVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f425866e = pVar;
        this.f425865d = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/controller/HalfSubscribeController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("HalfSubscribeController", "mmBottomSheet tryHide click");
        u94.p pVar = this.f425866e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
        pVar.f425883a = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
        com.tencent.mm.sdk.platformtools.u3.h(new u94.h(this));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/controller/HalfSubscribeController$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$2");
    }
}
