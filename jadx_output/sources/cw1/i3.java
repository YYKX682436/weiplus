package cw1;

/* loaded from: classes.dex */
public final class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseUI f222990d;

    public i3(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseUI cleanChattingChooseUI) {
        this.f222990d = cleanChattingChooseUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseUI cleanChattingChooseUI = this.f222990d;
        android.content.Intent putExtra = new android.content.Intent(cleanChattingChooseUI, (java.lang.Class<?>) com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI.class).putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2).putExtra("clean_ui_scene", cleanChattingChooseUI.f95722d);
        kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
        lk5.s.e(putExtra, true);
        cleanChattingChooseUI.startActivityForResult(putExtra, 2);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
