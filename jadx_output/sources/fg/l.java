package fg;

/* loaded from: classes7.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f261782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f261783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(fg.b0 b0Var, int i17) {
        super(0);
        this.f261782d = b0Var;
        this.f261783e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f261783e;
        this.f261782d.onKeyboardHeightChanged(i17 > 0, i17, false);
        return jz5.f0.f302826a;
    }
}
