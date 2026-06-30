package mx0;

/* loaded from: classes5.dex */
public final class b1 implements com.tencent.maas.camstudio.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f331843a;

    public b1(kotlin.coroutines.Continuation continuation) {
        this.f331843a = continuation;
    }

    @Override // com.tencent.maas.camstudio.j0
    public final void a(com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo, com.tencent.maas.instamovie.base.MJError mJError) {
        kotlin.coroutines.Continuation continuation = this.f331843a;
        if (mJError == null && mJRecordingFinishInfo != null) {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(mJRecordingFinishInfo));
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startExportingVideoForMaterialImport: mjError ");
        sb6.append(mJError != null ? mJError.message : null);
        com.tencent.mars.xlog.Log.e("MicroMsg.MaterialImportHelper", sb6.toString());
        continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
    }
}
