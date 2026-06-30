package os3;

/* loaded from: classes8.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage f348061d;

    public e(com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage) {
        this.f348061d = attachDownloadPage;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage = this.f348061d;
        attachDownloadPage.A = 2;
        if (!attachDownloadPage.D) {
            ((hs3.s) ((ks3.t) i95.n0.c(ks3.t.class))).wi().b(attachDownloadPage.B);
            attachDownloadPage.B = 0L;
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(attachDownloadPage.E)) {
            ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).cancelTask(attachDownloadPage.E);
            attachDownloadPage.E = null;
        }
        attachDownloadPage.b7();
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
