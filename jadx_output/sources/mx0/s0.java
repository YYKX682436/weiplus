package mx0;

/* loaded from: classes5.dex */
public final class s0 implements com.tencent.maas.camstudio.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f332299a;

    public s0(kotlin.coroutines.Continuation continuation) {
        this.f332299a = continuation;
    }

    @Override // com.tencent.maas.camstudio.d0
    public final void onComplete(com.tencent.maas.instamovie.base.MJError mJError) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openAsyncAIGCDraft: mjError ");
        sb6.append(mJError != null ? java.lang.Integer.valueOf(mJError.getErrorCode()) : null);
        sb6.append(' ');
        sb6.append(mJError != null ? mJError.message : null);
        com.tencent.mars.xlog.Log.e("MicroMsg.MaterialImportHelper", sb6.toString());
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f332299a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(mJError == null)));
    }
}
