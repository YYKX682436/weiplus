package vm3;

/* loaded from: classes14.dex */
public final class d extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f438144d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f438145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f438144d = jz5.h.b(new vm3.c(this));
    }

    public final void T6() {
        android.view.View currentFocus = getActivity().getWindow().getCurrentFocus();
        if (currentFocus != null) {
            int[] iArr = new int[2];
            currentFocus.getLocationInWindow(iArr);
            android.view.ViewParent parent = currentFocus.getParent();
            int height = iArr[1] + currentFocus.getHeight() + com.tencent.mm.ui.kk.a(currentFocus);
            if (parent instanceof android.view.ViewGroup) {
                int[] iArr2 = new int[2];
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                viewGroup.getLocationInWindow(iArr2);
                height = iArr2[1] + viewGroup.getHeight();
            }
            android.view.View decorView = getActivity().getWindow().getDecorView();
            kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
            android.graphics.Rect rect = new android.graphics.Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            int i17 = height - rect.bottom;
            int i18 = -i65.a.b(getContext(), 56);
            if (i17 > i18) {
                int scrollY = (i17 + U6().getScrollY()) - i18;
                android.widget.ScrollView U6 = U6();
                if (U6 != null) {
                    U6.post(new vm3.a(scrollY, this));
                }
            }
        }
    }

    public final android.widget.ScrollView U6() {
        return (android.widget.ScrollView) ((jz5.n) this.f438144d).getValue();
    }

    public final void V6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.KeyboardInputChangeUIC", "onFocusChange() called with: focus = " + z17 + " isKeyboardShow:" + this.f438145e);
        if (z17 && this.f438145e) {
            T6();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        com.tencent.mm.ui.widget.InputPanelLinearLayout inputPanelLinearLayout = (com.tencent.mm.ui.widget.InputPanelLinearLayout) findViewById(com.tencent.mm.R.id.keyboard_change_input_panel);
        if (inputPanelLinearLayout != null) {
            inputPanelLinearLayout.e(new vm3.b(this));
        }
    }
}
