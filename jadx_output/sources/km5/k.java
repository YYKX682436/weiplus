package km5;

/* loaded from: classes7.dex */
public class k implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.util.Pair f309326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f309327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.RuntimeException f309328c;

    public k(km5.q qVar, android.util.Pair pair, java.lang.Object obj, java.lang.RuntimeException runtimeException) {
        this.f309326a = pair;
        this.f309327b = obj;
        this.f309328c = runtimeException;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        try {
            ((km5.f) this.f309326a.first).a(this.f309327b);
            return null;
        } catch (java.lang.ClassCastException e17) {
            java.lang.RuntimeException runtimeException = this.f309328c;
            if (runtimeException.getCause() != null) {
                throw runtimeException;
            }
            runtimeException.initCause(e17);
            throw runtimeException;
        }
    }
}
