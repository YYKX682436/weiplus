package cs;

/* loaded from: classes4.dex */
public final class b implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f222035a;

    public b(kotlin.coroutines.Continuation continuation) {
        this.f222035a = continuation;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kotlin.coroutines.Continuation continuation = this.f222035a;
        if (booleanValue) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LivePhotoExportPermissionChain", "permission is granted");
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new aq.s0(true, 0)));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.LivePhotoExportPermissionChain", "export permission is error");
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new aq.s0(true, 100)));
        }
    }
}
