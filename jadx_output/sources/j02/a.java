package j02;

/* loaded from: classes8.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f296975d;

    public a(com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI fileDownloadConfirmUI, long j17) {
        this.f296975d = j17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.downloader.model.r0 i18 = com.tencent.mm.plugin.downloader.model.r0.i();
        long j17 = this.f296975d;
        i18.t(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadConfirmUI", "Remove task: %d", java.lang.Long.valueOf(j17));
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(j17);
        if (c17 == null || c17.field_fileType != 5) {
            return;
        }
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).nj(c17.field_extInfo, 11311002L, 2L, 7, null);
    }
}
