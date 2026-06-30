package un0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f429388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f429389e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(kotlin.jvm.internal.f0 f0Var, java.lang.Exception exc) {
        super(0);
        this.f429388d = f0Var;
        this.f429389e = exc;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "crashCount=" + un0.s.f429419c + " autoRetry=" + this.f429388d.f310116d + ' ' + this.f429389e;
    }
}
