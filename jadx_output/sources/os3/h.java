package os3;

/* loaded from: classes8.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage f348091d;

    public h(com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage) {
        this.f348091d = attachDownloadPage;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage.F;
        com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage = this.f348091d;
        com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage.T6(attachDownloadPage, attachDownloadPage.Z6(false));
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
