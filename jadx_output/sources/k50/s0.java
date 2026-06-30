package k50;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k50.y0 f304258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(k50.y0 y0Var) {
        super(0);
        this.f304258d = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f304258d.getIntent().getBooleanExtra("KEY_IS_SUPPORT_FORWARD_TO_CLAWBOT", false));
    }
}
