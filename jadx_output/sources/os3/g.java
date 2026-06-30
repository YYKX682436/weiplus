package os3;

/* loaded from: classes8.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage f348083d;

    public g(com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage) {
        this.f348083d = attachDownloadPage;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage attachDownloadPage = this.f348083d;
        if (attachDownloadPage.f154823t) {
            android.content.Intent intent = new android.content.Intent(attachDownloadPage.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI.class);
            intent.putExtra("mail_id", attachDownloadPage.f154825v);
            intent.putExtra("attach_id", attachDownloadPage.f154826w);
            intent.putExtra("attach_size", attachDownloadPage.f154828y);
            intent.putExtra("attach_name", attachDownloadPage.f154824u);
            androidx.appcompat.app.AppCompatActivity context = attachDownloadPage.getContext();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "previewAttach", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "previewAttach", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            java.lang.String[] strArr = {"mailid=" + attachDownloadPage.f154825v, "attachid=" + attachDownloadPage.f154826w, "texttype=html"};
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("uri", "/cgi-bin/viewdocument");
            intent2.putExtra("params", strArr);
            intent2.putExtra("baseurl", ks3.k0.c());
            intent2.putExtra(ya.b.METHOD, "get");
            intent2.putExtra("singleColumn", com.tencent.mm.sdk.platformtools.g1.a(attachDownloadPage.f154824u));
            intent2.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, attachDownloadPage.f154824u);
            intent2.setClass(attachDownloadPage, com.tencent.mm.plugin.qqmail.ui.MailWebViewUI.class);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(attachDownloadPage, arrayList3.toArray(), "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "previewAttach", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            attachDownloadPage.startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(attachDownloadPage, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage", "previewAttach", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
