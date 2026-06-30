package dz0;

/* loaded from: classes5.dex */
public final class x0 implements com.tencent.maas.instamovie.MJMovieSession.SnapshotAndExportClipBundleCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f245057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f245059c;

    public x0(kotlinx.coroutines.q qVar, java.lang.String str, long j17) {
        this.f245057a = qVar;
        this.f245058b = str;
        this.f245059c = j17;
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.SnapshotAndExportClipBundleCallback
    public void onError(com.tencent.maas.instamovie.base.MJError mJError) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f245057a.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new az0.p7(mJError))));
        az0.rc.i(this.f245058b, this.f245059c, mJError, false, 0, 24, null);
    }

    @Override // com.tencent.maas.instamovie.MJMovieSession.SnapshotAndExportClipBundleCallback
    public void onSuccess(com.tencent.maas.instamovie.MJMovieSession.ClipBundleInfo clipBundleInfo) {
        r45.bm0 bm0Var;
        if (clipBundleInfo != null) {
            bm0Var = new r45.bm0();
            bm0Var.f370865d = clipBundleInfo.getClipbundleId();
            bm0Var.f370866e = clipBundleInfo.getClipbundlePath();
            bm0Var.f370867f = clipBundleInfo.coverPath;
            bm0Var.f370868g = clipBundleInfo.sizeInDisk;
        } else {
            bm0Var = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("snapshotAndExportClipBundle onSuccess: ");
        sb6.append(bm0Var != null ? az0.rc.j(az0.rc.c(bm0Var), 0) : null);
        com.tencent.mars.xlog.Log.i("MaasMultiTemplate.MaasSdkUIC", sb6.toString());
        this.f245057a.resumeWith(kotlin.Result.m521constructorimpl(bm0Var));
        az0.rc.i(this.f245058b, this.f245059c, null, false, 0, 28, null);
    }
}
