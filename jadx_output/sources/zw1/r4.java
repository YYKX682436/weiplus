package zw1;

/* loaded from: classes5.dex */
public class r4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.edittext.PasterEditText f476779d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zw1.t4 f476780e;

    public r4(zw1.t4 t4Var, com.tencent.mm.ui.widget.edittext.PasterEditText pasterEditText) {
        this.f476780e = t4Var;
        this.f476779d = pasterEditText;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.edittext.PasterEditText pasterEditText = this.f476779d;
        pasterEditText.requestFocus();
        ((android.view.inputmethod.InputMethodManager) this.f476780e.f476806c.getContext().getSystemService("input_method")).showSoftInput(pasterEditText, 0);
    }
}
