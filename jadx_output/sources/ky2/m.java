package ky2;

/* loaded from: classes.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f313562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ky2.w f313563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f313564f;

    public m(int i17, ky2.w wVar, android.widget.EditText editText) {
        this.f313562d = i17;
        this.f313563e = wVar;
        this.f313564f = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yz5.l lVar;
        ky2.w wVar = this.f313563e;
        int size = wVar.f313585e.size() - 2;
        int i17 = this.f313562d;
        if (i17 == size && (lVar = wVar.f313594q) != null) {
            lVar.invoke(java.lang.Integer.valueOf(i17 + 1));
        }
        android.widget.EditText editText = this.f313564f;
        java.lang.Object systemService = editText.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(editText, 2);
    }
}
