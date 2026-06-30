package r02;

/* loaded from: classes8.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.DownloadUpdateDescView f368341d;

    public x(com.tencent.mm.plugin.downloader_app.ui.DownloadUpdateDescView downloadUpdateDescView) {
        this.f368341d = downloadUpdateDescView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader_app/ui/DownloadUpdateDescView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.downloader_app.ui.DownloadUpdateDescView downloadUpdateDescView = this.f368341d;
        if (downloadUpdateDescView.f97386e.getText().equals(downloadUpdateDescView.getResources().getString(com.tencent.mm.R.string.c5v))) {
            downloadUpdateDescView.f97385d.setMaxLines(Integer.MAX_VALUE);
            downloadUpdateDescView.f97385d.setText(downloadUpdateDescView.f97387f.f97322k);
            downloadUpdateDescView.f97386e.setText(com.tencent.mm.R.string.hfw);
        } else {
            downloadUpdateDescView.f97385d.setMaxLines(2);
            downloadUpdateDescView.f97386e.setText(com.tencent.mm.R.string.c5v);
            downloadUpdateDescView.f97385d.post(new r02.y(downloadUpdateDescView));
        }
        o02.a.b(10, 1003, 0, 2, downloadUpdateDescView.f97387f.f97317f, "", "");
        yj0.a.h(this, "com/tencent/mm/plugin/downloader_app/ui/DownloadUpdateDescView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
