package cw1;

/* loaded from: classes.dex */
public final class h3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseUI f222962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f222963e;

    public h3(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseUI cleanChattingChooseUI, boolean z17) {
        this.f222962d = cleanChattingChooseUI;
        this.f222963e = z17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingChooseUI cleanChattingChooseUI = this.f222962d;
        android.content.Intent putExtra = new android.content.Intent(cleanChattingChooseUI, (java.lang.Class<?>) com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingNewUI.class).putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1).putExtra("clean_ui_scene", cleanChattingChooseUI.f95722d).putExtra("withOrigin", this.f222963e);
        kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
        lk5.s.e(putExtra, true);
        cleanChattingChooseUI.startActivityForResult(putExtra, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanChattingChooseUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
