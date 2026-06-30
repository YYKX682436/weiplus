package zh0;

/* loaded from: classes11.dex */
public final class b implements k70.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f472854d;

    public b(kotlinx.coroutines.q qVar) {
        this.f472854d = qVar;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ui.widget.dialog.f4 f4Var = (com.tencent.mm.ui.widget.dialog.f4) obj;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        boolean z17 = i19 == 0 && i27 == 0;
        kotlinx.coroutines.q qVar = this.f472854d;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadHelper", "[+] onImgTaskEnd called and download successfully, img_local_id:" + j17 + ", msg_local_id:" + j18);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new vh0.p1(vh0.h1.OK, null)));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.DownloadHelper", "[-] onImgTaskEnd called with download failure, " + i19 + ',' + i27 + ", img_local_id:" + j17 + ", msg_local_id:" + j18);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(new vh0.p1(vh0.h1.IMG_DOWNLOAD_FAILURE, null)));
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadHelper", "[+] onImgTaskCanceled called, img_local_id:" + j17 + ", msg_local_id:" + j18);
        try {
            kotlinx.coroutines.q qVar = this.f472854d;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new vh0.p1(vh0.h1.CANCELLED, null)));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DownloadHelper", th6, "[-] fail to resume cont.", new java.lang.Object[0]);
        }
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.tencent.mm.modelbase.m1 m1Var) {
    }
}
