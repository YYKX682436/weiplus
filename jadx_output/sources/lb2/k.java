package lb2;

/* loaded from: classes.dex */
public final class k extends lb2.j {

    /* renamed from: t, reason: collision with root package name */
    public final yz5.l f317748t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String title, yz5.l onClick) {
        super("", title);
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        this.f317748t = onClick;
    }

    @Override // lb2.j
    public void n(int i17) {
        java.lang.ref.WeakReference weakReference = this.f317751f;
        this.f317748t.invoke(weakReference != null ? (android.app.Activity) weakReference.get() : null);
    }

    @Override // lb2.j
    public void o() {
    }

    @Override // lb2.j
    public /* bridge */ /* synthetic */ java.lang.Object r() {
        return "";
    }
}
