package td4;

/* loaded from: classes.dex */
public final class n1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI f417711d;

    public n1(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        this.f417711d = snsAlbumPickerUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumNextButton$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI$initSnsAlbumNextButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI = this.f417711d;
        td4.g0 a76 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.a7(snsAlbumPickerUI);
        a76.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectedItemList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        java.util.List Q = a76.Q();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedItemList", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerListAdapter");
        snsAlbumPickerUI.k7(Q);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI$initSnsAlbumNextButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initSnsAlbumNextButton$1");
    }
}
