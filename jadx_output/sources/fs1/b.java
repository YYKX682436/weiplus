package fs1;

/* loaded from: classes5.dex */
public final class b implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f266276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f266277b;

    public b(yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        this.f266276a = lVar;
        this.f266277b = continuation;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        kotlin.jvm.internal.o.d(str);
        this.f266276a.invoke(str);
        this.f266277b.resumeWith(kotlin.Result.m521constructorimpl(str));
    }
}
