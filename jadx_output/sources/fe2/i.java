package fe2;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final fe2.i f261517d = new fe2.i();

    public i() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        if (c1Var != null) {
            c1Var.N1 = true;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", ((mm2.c1) c1Var.business(mm2.c1.class)).N1);
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
            if (k0Var != null) {
                k0Var.statusChange(qo0.b.Z2, bundle);
            }
        }
        return jz5.f0.f302826a;
    }
}
