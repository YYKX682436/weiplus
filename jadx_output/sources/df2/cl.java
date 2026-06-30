package df2;

/* loaded from: classes3.dex */
public final class cl implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f229889d;

    public cl(df2.pl plVar) {
        this.f229889d = plVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.pl plVar = this.f229889d;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = plVar.f231090p;
        if (liveBottomSheetPanel != null) {
            com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
        }
        com.tencent.mm.plugin.finder.view.FakeEditText fakeEditText = plVar.f231100z;
        if (fakeEditText != null) {
            if (fakeEditText != null) {
                fakeEditText.clearFocus();
            }
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) fakeEditText.getContext().getSystemService("input_method");
            if (plVar.G && inputMethodManager != null) {
                com.tencent.mm.plugin.finder.view.FakeEditText fakeEditText2 = plVar.f231100z;
                inputMethodManager.hideSoftInputFromWindow(fakeEditText2 != null ? fakeEditText2.getWindowToken() : null, 0);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
