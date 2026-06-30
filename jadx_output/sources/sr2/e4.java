package sr2;

/* loaded from: classes5.dex */
public final class e4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f411547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411548e;

    public e4(android.widget.EditText editText, com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411547d = editText;
        this.f411548e = postMainUIC;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/PostMainUIC$initContainers$4$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getActionMasked() == 0) {
            android.widget.EditText editText = this.f411547d;
            if (editText.hasFocus()) {
                com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411548e;
                if (postMainUIC.F7().X6().getVisibility() == 0) {
                    java.lang.Object systemService = postMainUIC.getActivity().getSystemService("input_method");
                    android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    }
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/post/PostMainUIC$initContainers$4$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
