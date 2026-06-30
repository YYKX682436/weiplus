package td4;

/* loaded from: classes4.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI f417708d;

    public m0(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
        this.f417708d = snsAlbumPickerPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initBackButton$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerPreviewUI$initBackButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI.B1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$goBack", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        this.f417708d.y7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$goBack", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerPreviewUI$initBackButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initBackButton$1");
    }
}
