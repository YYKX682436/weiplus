package st2;

/* loaded from: classes.dex */
public final class l1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.s1 f412391d;

    public l1(st2.s1 s1Var) {
        this.f412391d = s1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        st2.s1 s1Var = this.f412391d;
        java.lang.Object systemService = s1Var.f412441a.getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(s1Var.f412448h.getWindowToken(), 0);
        }
        android.text.Editable text = s1Var.f412448h.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        s1Var.b(r26.n0.u0(text).toString());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListSearchPage$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
