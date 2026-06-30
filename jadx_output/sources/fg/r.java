package fg;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f261805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f261806e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(fg.b0 b0Var, int i17) {
        super(0);
        this.f261805d = b0Var;
        this.f261806e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f261806e;
        this.f261805d.onKeyboardHeightChanged(i17 > 0, i17, false);
        return jz5.f0.f302826a;
    }
}
