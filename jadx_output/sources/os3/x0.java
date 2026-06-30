package os3;

/* loaded from: classes8.dex */
public class x0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI f348246d;

    public x0(com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI compressPreviewUI) {
        this.f348246d = compressPreviewUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI compressPreviewUI = this.f348246d;
        android.content.Intent intent = new android.content.Intent(compressPreviewUI, (java.lang.Class<?>) com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage.class);
        intent.putExtra("attach_name", compressPreviewUI.f154860g);
        intent.putExtra("mail_id", compressPreviewUI.f154857d);
        intent.putExtra("attach_id", compressPreviewUI.f154858e);
        intent.putExtra("total_size", compressPreviewUI.f154859f);
        intent.putExtra("is_preview", 0);
        intent.putExtra("is_compress", true);
        com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI compressPreviewUI2 = this.f348246d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(compressPreviewUI2, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$4", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        compressPreviewUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(compressPreviewUI2, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$4", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
