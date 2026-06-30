package mx0;

/* loaded from: classes5.dex */
public final class f0 implements com.tencent.maas.camstudio.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f331971a;

    public f0(kotlin.coroutines.Continuation continuation) {
        this.f331971a = continuation;
    }

    @Override // com.tencent.maas.camstudio.d0
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        if (mJError != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MaterialImportHelper", "beginUseAssetInput: mjError " + mJError.message);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f331971a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(mJError == null)));
    }
}
