package df2;

/* loaded from: classes3.dex */
public final class xk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f231784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FakeEditText f231785e;

    public xk(df2.pl plVar, com.tencent.mm.plugin.finder.view.FakeEditText fakeEditText) {
        this.f231784d = plVar;
        this.f231785e = fakeEditText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.pl plVar = this.f231784d;
        com.tencent.mm.plugin.finder.view.FakeEditText fakeEditText = plVar.f231100z;
        if (fakeEditText != null) {
            fakeEditText.requestFocus();
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f231785e.getContext().getSystemService("input_method");
        if (plVar.G || inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(plVar.f231100z, 0);
    }
}
