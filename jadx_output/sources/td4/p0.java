package td4;

/* loaded from: classes4.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI f417716d;

    public p0(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI) {
        this.f417716d = snsAlbumPickerPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initNextButton$1$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerPreviewUI$initNextButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI snsAlbumPickerPreviewUI = this.f417716d;
        if (com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI.r7(snsAlbumPickerPreviewUI).isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCurrentMediaId$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            java.lang.String str = snsAlbumPickerPreviewUI.f170221p1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCurrentMediaId$p", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI");
            snsAlbumPickerPreviewUI.s7(str, com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI.r7(snsAlbumPickerPreviewUI));
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sns_album_select_mediaobj_id_list", com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI.r7(snsAlbumPickerPreviewUI));
        snsAlbumPickerPreviewUI.setResult(-1, intent);
        snsAlbumPickerPreviewUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerPreviewUI$initNextButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerPreviewUI$initNextButton$1$1");
    }
}
