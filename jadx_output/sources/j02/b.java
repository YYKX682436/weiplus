package j02;

/* loaded from: classes8.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f296977d;

    public b(com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI fileDownloadConfirmUI, long j17) {
        this.f296977d = j17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(this.f296977d);
        if (c17 == null || c17.field_fileType != 5) {
            return;
        }
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).nj(c17.field_extInfo, 11311002L, 2L, 2, null);
    }
}
