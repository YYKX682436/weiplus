package fg;

/* loaded from: classes7.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg.b0 f261813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f261814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(fg.b0 b0Var, int i17) {
        super(0);
        this.f261813d = b0Var;
        this.f261814e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f261813d.onKeyboardHeightChanged(true, this.f261814e, false);
        return jz5.f0.f302826a;
    }
}
