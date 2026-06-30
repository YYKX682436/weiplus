package g44;

/* loaded from: classes4.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g44.g f268817d;

    public e(g44.g gVar) {
        this.f268817d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper$showBottomSheet$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/halfscreen/AdDownloadAppHalfScreenHelper$showBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMBottomSheet$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        g44.g gVar = this.f268817d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = gVar.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMBottomSheet$p", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper");
        if (k0Var != null) {
            k0Var.s(gVar.g(), true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/halfscreen/AdDownloadAppHalfScreenHelper$showBottomSheet$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.halfscreen.AdDownloadAppHalfScreenHelper$showBottomSheet$2");
    }
}
