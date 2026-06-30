package td4;

/* loaded from: classes4.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI f417705d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI) {
        super(0);
        this.f417705d = snsAlbumPickerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$5");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$5");
        com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI snsAlbumPickerUI = this.f417705d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Y6(snsAlbumPickerUI).getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int x17 = ((androidx.recyclerview.widget.GridLayoutManager) layoutManager).x();
        if (x17 == r3.getItemCount() - 2) {
            androidx.recyclerview.widget.RecyclerView Y6 = com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI.Y6(snsAlbumPickerUI);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(x17 + 1));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(Y6, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI$initPickerAdapter$5", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
            Y6.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(Y6, "com/tencent/mm/plugin/sns/ui/picker/SnsAlbumPickerUI$initPickerAdapter$5", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$5");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.picker.SnsAlbumPickerUI$initPickerAdapter$5");
        return f0Var;
    }
}
