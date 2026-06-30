package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class t7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderKitUI f129863d;

    public t7(com.tencent.mm.plugin.finder.ui.FinderKitUI finderKitUI) {
        this.f129863d = finderKitUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.CharSequence text;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderKitUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderKitUI finderKitUI = this.f129863d;
        androidx.appcompat.app.AppCompatActivity context = finderKitUI.getContext();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = "端外H5内测入口";
        aVar.f211714d = "粘贴H5链接，点击确定";
        aVar.f211716f = true;
        aVar.f211732v = "确定";
        aVar.f211733w = "取消";
        aVar.E = new com.tencent.mm.plugin.finder.ui.s7(finderKitUI);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("clipboard");
        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
        android.content.ClipData primaryClip = clipboardManager != null ? clipboardManager.getPrimaryClip() : null;
        if (primaryClip != null) {
            android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt == null || (text = itemAt.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            j0Var.f211837r.setVisibility(0);
            j0Var.f211837r.setText(str);
        }
        j0Var.show();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderKitUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
