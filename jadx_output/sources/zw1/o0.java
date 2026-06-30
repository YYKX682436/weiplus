package zw1;

/* loaded from: classes5.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.edittext.PasterEditText f476746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zw1.q0 f476747e;

    public o0(zw1.q0 q0Var, com.tencent.mm.ui.widget.edittext.PasterEditText pasterEditText) {
        this.f476747e = q0Var;
        this.f476746d = pasterEditText;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.edittext.PasterEditText pasterEditText = this.f476746d;
        pasterEditText.requestFocus();
        ((android.view.inputmethod.InputMethodManager) this.f476747e.f476763a.getContext().getSystemService("input_method")).showSoftInput(pasterEditText, 0);
    }
}
