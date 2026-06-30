package os3;

/* loaded from: classes8.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage f348110d;

    public j(com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage) {
        this.f348110d = attachDownloadPage;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage = this.f348110d;
        if (attachDownloadPage.A == 3) {
            com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage.T6(attachDownloadPage, attachDownloadPage.Z6(false));
        } else {
            attachDownloadPage.a7();
            attachDownloadPage.C = 0;
            attachDownloadPage.W6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
