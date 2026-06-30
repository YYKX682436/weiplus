package hq5;

/* loaded from: classes5.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.t0 f283243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(hq5.t0 t0Var) {
        super(0);
        this.f283243d = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f283243d.getRootView().findViewById(com.tencent.mm.R.id.saf);
        if (findViewById != null) {
            return new em.k4(findViewById);
        }
        return null;
    }
}
