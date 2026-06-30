package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI f192089d;

    public x0(com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI fileSelectorPreviewUI) {
        this.f192089d = fileSelectorPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI.f189767i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doSend() called dataList:");
        com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI fileSelectorPreviewUI = this.f192089d;
        sb6.append(fileSelectorPreviewUI.f189770f.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorPreviewUI", sb6.toString());
        if (!com.tencent.mm.sdk.platformtools.t8.L0(fileSelectorPreviewUI.f189770f)) {
            fileSelectorPreviewUI.f189771g.putExtra("RESULT_KEY_ACTION_SEND", true);
            fileSelectorPreviewUI.overridePendingTransition(0, 0);
            fileSelectorPreviewUI.finish();
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
