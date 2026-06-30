package px0;

/* loaded from: classes5.dex */
public final class o implements com.tencent.maas.camstudio.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f358791a;

    public o(kotlinx.coroutines.q qVar) {
        this.f358791a = qVar;
    }

    public final void a(com.tencent.maas.camstudio.MJAsyncAIGCInfo mJAsyncAIGCInfo, com.tencent.maas.instamovie.base.MJError mJError) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveAsyncAIGCDraft onComplete error ");
        sb6.append(mJError != null ? java.lang.Integer.valueOf(mJError.getErrorCode()) : null);
        sb6.append(' ');
        sb6.append(mJError != null ? mJError.message : null);
        sb6.append(' ');
        kotlinx.coroutines.q qVar = this.f358791a;
        sb6.append(((kotlinx.coroutines.r) qVar).n());
        com.tencent.mars.xlog.Log.i("MaterialImportPreviewFragment", sb6.toString());
        if (((kotlinx.coroutines.r) qVar).n()) {
            if (mJAsyncAIGCInfo != null && mJError == null) {
                qVar.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(mJAsyncAIGCInfo, "")));
                return;
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("saveAsyncAIGCDraft onComplete error ");
            sb7.append(mJError != null ? java.lang.Integer.valueOf(mJError.getErrorCode()) : null);
            sb7.append(' ');
            sb7.append(mJError != null ? mJError.message : null);
            qVar.resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(null, sb7.toString())));
        }
    }
}
