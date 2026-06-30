package nl1;

/* loaded from: classes5.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView f338168d;

    public a(com.tencent.mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView baseNumberKeyboardView) {
        this.f338168d = baseNumberKeyboardView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/numberpad/BaseNumberKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.input.numberpad.BaseNumberKeyboardView baseNumberKeyboardView = this.f338168d;
        if (baseNumberKeyboardView.f91570t == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/numberpad/BaseNumberKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() != com.tencent.mm.R.id.tenpay_keyboard_x) {
            int i17 = view.getId() == com.tencent.mm.R.id.tenpay_keyboard_1 ? 8 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_2 ? 9 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_3 ? 10 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_4 ? 11 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_5 ? 12 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_6 ? 13 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_7 ? 14 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_8 ? 15 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_9 ? 16 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_0 ? 7 : view.getId() == com.tencent.mm.R.id.tenpay_keyboard_d ? 67 : 0;
            baseNumberKeyboardView.f91570t.dispatchKeyEvent(new android.view.KeyEvent(0, i17));
            baseNumberKeyboardView.f91570t.dispatchKeyEvent(new android.view.KeyEvent(1, i17));
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/numberpad/BaseNumberKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int i18 = baseNumberKeyboardView.f91557d;
        if (i18 == 1) {
            baseNumberKeyboardView.f91570t.dispatchKeyEvent(new android.view.KeyEvent(0, 59));
            baseNumberKeyboardView.f91570t.dispatchKeyEvent(new android.view.KeyEvent(0, 52));
            baseNumberKeyboardView.f91570t.dispatchKeyEvent(new android.view.KeyEvent(1, 59));
        } else if (i18 == 2) {
            baseNumberKeyboardView.f91570t.dispatchKeyEvent(new android.view.KeyEvent(0, 56));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/numberpad/BaseNumberKeyboardView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
