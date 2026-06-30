package e14;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f246430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.Exception exc) {
        super(0);
        this.f246430d = exc;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Exception exc = this.f246430d;
        return "[error] " + exc.getMessage() + ", stack: " + jz5.a.b(exc);
    }
}
