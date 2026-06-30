package os3;

/* loaded from: classes8.dex */
public class u0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI f348216d;

    public u0(com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI compressPreviewUI) {
        this.f348216d = compressPreviewUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI compressPreviewUI = this.f348216d;
        os3.a1 item = compressPreviewUI.f154867q.getItem(i17);
        java.lang.String str = item.f348026a;
        os3.a1 a1Var = compressPreviewUI.f154867q.f348050d;
        if (str.equals(a1Var == null ? null : a1Var.f348026a)) {
            compressPreviewUI.U6(compressPreviewUI.f154867q.c());
            yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        boolean z17 = item.f348029d == 1;
        java.lang.String str2 = item.f348026a;
        if (z17) {
            compressPreviewUI.U6(str2);
            yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        if (item.f348031f) {
            java.lang.String[] strArr = {"mailid=" + compressPreviewUI.f154857d, "attachid=" + str2, "compressfilepath=" + compressPreviewUI.f154863m, "texttype=html"};
            android.content.Intent intent = new android.content.Intent(compressPreviewUI, (java.lang.Class<?>) com.tencent.mm.plugin.qqmail.ui.MailWebViewUI.class);
            intent.putExtra("uri", "/cgi-bin/viewdocument");
            intent.putExtra("params", strArr);
            intent.putExtra("baseurl", ks3.k0.c());
            intent.putExtra(ya.b.METHOD, "get");
            intent.putExtra("singleColumn", com.tencent.mm.sdk.platformtools.g1.a(item.f348027b));
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, compressPreviewUI.getString(com.tencent.mm.R.string.hrp));
            com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI compressPreviewUI2 = this.f348216d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(compressPreviewUI2, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            compressPreviewUI2.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(compressPreviewUI2, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/CompressPreviewUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
