package g2;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f267725d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context) {
        super(0);
        this.f267725d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f267725d.getSystemService("input_method");
        if (systemService != null) {
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
