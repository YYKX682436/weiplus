package vd2;

/* loaded from: classes3.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f435738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.a0 f435739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.m84 f435740f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(yl2.g1 g1Var, yl2.a0 a0Var, r45.m84 m84Var) {
        super(0);
        this.f435738d = g1Var;
        this.f435739e = a0Var;
        this.f435740f = m84Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_PARAMS_POST_CREATE_LIVE_MODE", 2);
        intent.putExtra("KEY_PARAMS_POST_CREATE_LIVE_SUB_MODE", 8);
        intent.putExtra("KEY_PARAMS_POST_RECOVER_LIVE_SIDEBAR", this.f435740f.toByteArray());
        intent.putExtra("KEY_PARAMS_POST_CREATE_LIVE_FROM_SIDEBAR", true);
        this.f435738d.h(intent, ((yl2.y) this.f435739e).f463083a, false);
        return jz5.f0.f302826a;
    }
}
