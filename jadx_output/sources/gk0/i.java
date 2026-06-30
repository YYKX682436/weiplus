package gk0;

/* loaded from: classes9.dex */
public final class i implements g75.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f272426a;

    public i(java.lang.ref.WeakReference weakReference) {
        this.f272426a = weakReference;
    }

    @Override // g75.s
    public void a(g75.x result) {
        kotlin.jvm.internal.o.g(result, "result");
        g75.s sVar = (g75.s) this.f272426a.get();
        if (sVar != null) {
            sVar.a(result);
        }
    }
}
