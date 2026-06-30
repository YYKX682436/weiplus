package vi0;

/* loaded from: classes2.dex */
public final class f implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f437252a;

    public f(kotlinx.coroutines.q qVar) {
        this.f437252a = qVar;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.w("MicroMsg.FinderDataSource", "onImageDownload: success=" + z17);
        if (z17) {
            return;
        }
        this.f437252a.resumeWith(kotlin.Result.m521constructorimpl(null));
    }
}
