package vw3;

/* loaded from: classes.dex */
public final class n1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerFolderUI f441038d;

    public n1(com.tencent.mm.plugin.repairer.ui.RepairerFolderUI repairerFolderUI) {
        this.f441038d = repairerFolderUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerFolderUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent((android.content.Context) this.f441038d, (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerFileListUI.class);
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "头像");
        intent.putExtra("dirPath", "wcf://avatar/");
        com.tencent.mm.plugin.repairer.ui.RepairerFolderUI repairerFolderUI = this.f441038d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(repairerFolderUI, arrayList2.toArray(), "com/tencent/mm/plugin/repairer/ui/RepairerFolderUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        repairerFolderUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(repairerFolderUI, "com/tencent/mm/plugin/repairer/ui/RepairerFolderUI$onCreate$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerFolderUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
