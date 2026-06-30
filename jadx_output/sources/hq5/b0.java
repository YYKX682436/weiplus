package hq5;

/* loaded from: classes5.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.k0 f283219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(hq5.k0 k0Var) {
        super(0);
        this.f283219d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f283219d.getRootView().findViewById(com.tencent.mm.R.id.f486470uv3);
        if (findViewById != null) {
            return new em.i4(findViewById);
        }
        return null;
    }
}
