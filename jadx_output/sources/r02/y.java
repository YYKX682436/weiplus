package r02;

/* loaded from: classes8.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.DownloadUpdateDescView f368343d;

    public y(com.tencent.mm.plugin.downloader_app.ui.DownloadUpdateDescView downloadUpdateDescView) {
        this.f368343d = downloadUpdateDescView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.downloader_app.ui.DownloadUpdateDescView downloadUpdateDescView = this.f368343d;
        int lineCount = downloadUpdateDescView.f97385d.getLineCount();
        if (lineCount > 2) {
            return;
        }
        android.text.Layout layout = downloadUpdateDescView.f97385d.getLayout();
        android.text.TextPaint paint = downloadUpdateDescView.f97385d.getPaint();
        if (layout == null || lineCount <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        int lineEnd = layout.getLineEnd(0);
        java.lang.String charSequence = downloadUpdateDescView.f97385d.getText().toString();
        java.lang.String substring = charSequence.substring(lineEnd, lineEnd * 2);
        int measureText = (int) paint.measureText(substring);
        int measureText2 = (int) paint.measureText(".");
        int measureText3 = (int) paint.measureText(downloadUpdateDescView.getResources().getString(com.tencent.mm.R.string.c5v));
        while (measureText + (measureText2 * 3) + measureText3 > layout.getEllipsizedWidth() && substring.length() > 0) {
            substring = substring.substring(0, substring.length() - 1);
            measureText = (int) paint.measureText(substring);
        }
        downloadUpdateDescView.f97385d.setText(charSequence.substring(0, lineEnd) + substring + "...");
        downloadUpdateDescView.f97386e.setVisibility(0);
    }
}
