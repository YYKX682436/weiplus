package z73;

/* loaded from: classes11.dex */
public class f extends sc0.a {
    public f(z73.g gVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        sc0.g gVar = (sc0.g) i95.n0.c(sc0.g.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        sc0.f fVar = sc0.f.TINKER_CHECK_UPDATE_CGI_FAILURE;
        ((rc0.i) gVar).getClass();
        com.tencent.recovery.wx.service.WXRecoveryUploadService.fetchTinkerPatch(context, fVar, null, false, true);
    }
}
