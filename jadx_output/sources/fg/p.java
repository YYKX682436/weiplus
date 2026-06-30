package fg;

/* loaded from: classes7.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f261799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f261800e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(fg.b0 b0Var, boolean z17) {
        super(0);
        this.f261799d = b0Var;
        this.f261800e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fg.b0 b0Var = this.f261799d;
        boolean z17 = this.f261800e;
        b0Var.onKeyboardHeightChanged(z17, z17 ? b0Var.f261732i : 0, false);
        return jz5.f0.f302826a;
    }
}
