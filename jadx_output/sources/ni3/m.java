package ni3;

/* loaded from: classes2.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni3.n f337630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ni3.n nVar) {
        super(0);
        this.f337630d = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ni3.n nVar = this.f337630d;
        if (nVar.isBelongFragment()) {
            return nVar.getRootView();
        }
        android.view.View decorView = nVar.getActivity().getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        return decorView;
    }
}
