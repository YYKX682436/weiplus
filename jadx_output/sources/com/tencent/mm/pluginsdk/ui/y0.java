package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI f192096d;

    public y0(com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI fileSelectorPreviewUI) {
        this.f192096d = fileSelectorPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) this.f192096d.findViewById(com.tencent.mm.R.id.vfh);
        if (checkBox == null) {
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (checkBox.getVisibility() == 0) {
            checkBox.setChecked(!checkBox.isChecked());
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
