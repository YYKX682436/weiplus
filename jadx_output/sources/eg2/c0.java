package eg2;

/* loaded from: classes3.dex */
public abstract class c0 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f252544d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f252545e;

    /* renamed from: f, reason: collision with root package name */
    public final qc0.a f252546f;

    public c0(ju3.d0 status, android.view.ViewGroup parent, qc0.a editContext) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(editContext, "editContext");
        this.f252544d = status;
        this.f252545e = parent;
        this.f252546f = editContext;
        status.f(this);
    }

    @Override // yt3.r2
    public java.lang.String name() {
        return getClass().getName();
    }
}
