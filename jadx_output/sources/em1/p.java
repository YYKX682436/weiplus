package em1;

/* loaded from: classes7.dex */
public final class p implements com.tencent.mm.plugin.appbrand.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em1.t f255069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f255070e;

    public p(em1.t tVar, java.lang.ref.WeakReference weakReference) {
        this.f255069d = tVar;
        this.f255070e = weakReference;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.c0
    public final void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        java.lang.ref.WeakReference weakReference = this.f255070e;
        kotlin.jvm.internal.o.d(weakReference);
        this.f255069d.b((cl.q0) weakReference.get(), str, valueCallback);
    }
}
