package gl5;

/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f273119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(gl5.d1 d1Var) {
        super(0);
        this.f273119d = d1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f273119d.f272924a.getSystemService("input_method");
        if (systemService instanceof android.view.inputmethod.InputMethodManager) {
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
        return null;
    }
}
