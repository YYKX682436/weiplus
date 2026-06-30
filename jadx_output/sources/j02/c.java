package j02;

/* loaded from: classes8.dex */
public class c implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI f296980d;

    public c(com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI fileDownloadConfirmUI) {
        this.f296980d = fileDownloadConfirmUI;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        this.f296980d.finish();
    }
}
