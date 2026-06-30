package y94;

/* loaded from: classes10.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y94.i f460361d;

    public e(y94.i iVar) {
        this.f460361d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$initThumbBarView$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin$initThumbBarView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        y94.i iVar = this.f460361d;
        iVar.B();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showNormalLayout", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin");
        ju3.d0.k(iVar.f465332d, ju3.c0.f301920z1, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/cover/edit/plugin/SnsCoverCropVideoPlugin$initThumbBarView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverCropVideoPlugin$initThumbBarView$3");
    }
}
