package zx4;

/* loaded from: classes8.dex */
public final class r implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f477179a;

    public r(kotlin.coroutines.Continuation continuation) {
        this.f477179a = continuation;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        this.f477179a.resumeWith(kotlin.Result.m521constructorimpl((com.tencent.xweb.n2) obj));
    }
}
