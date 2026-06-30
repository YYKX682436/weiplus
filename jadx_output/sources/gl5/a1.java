package gl5;

/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f272902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(gl5.d1 d1Var) {
        super(0);
        this.f272902d = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(android.view.ViewConfiguration.get(this.f272902d.f272924a).getScaledTouchSlop());
    }
}
