package hq5;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.a0 f283282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(hq5.a0 a0Var) {
        super(0);
        this.f283282d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f283282d.getRootView().findViewById(com.tencent.mm.R.id.l3o);
        if (findViewById != null) {
            return new em.h4(findViewById);
        }
        return null;
    }
}
