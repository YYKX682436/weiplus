package fg;

/* loaded from: classes7.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f261820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f261821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(fg.b0 b0Var, int i17) {
        super(0);
        this.f261820d = b0Var;
        this.f261821e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f261820d.onKeyboardHeightChanged(true, this.f261821e, false);
        return jz5.f0.f302826a;
    }
}
