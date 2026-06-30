package mp5;

/* loaded from: classes9.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f330488d;

    public k(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard) {
        this.f330488d = wcPayKeyboard;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/keyboard/WcPayKeyboard$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = view.getId() == com.tencent.mm.R.id.keyboard_0 ? 7 : view.getId() == com.tencent.mm.R.id.keyboard_1 ? 8 : view.getId() == com.tencent.mm.R.id.keyboard_2 ? 9 : view.getId() == com.tencent.mm.R.id.keyboard_3 ? 10 : view.getId() == com.tencent.mm.R.id.keyboard_4 ? 11 : view.getId() == com.tencent.mm.R.id.keyboard_5 ? 12 : view.getId() == com.tencent.mm.R.id.keyboard_6 ? 13 : view.getId() == com.tencent.mm.R.id.keyboard_7 ? 14 : view.getId() == com.tencent.mm.R.id.keyboard_8 ? 15 : view.getId() == com.tencent.mm.R.id.keyboard_9 ? 16 : view.getId() == com.tencent.mm.R.id.keyboard_del ? 67 : view.getId() == com.tencent.mm.R.id.keyboard_dot ? 56 : (view.getId() == com.tencent.mm.R.id.keyboard_action || view.getId() == com.tencent.mm.R.id.keyboard_animation_action) ? 66 : 0;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (!(i17 == 0)) {
            view.performHapticFeedback(0, 2);
        }
        if (view.getId() != com.tencent.mm.R.id.keyboard_action) {
            view.getId();
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = this.f330488d;
        wcPayKeyboard.K = i17;
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard.a(wcPayKeyboard, i17);
        android.widget.EditText editText = wcPayKeyboard.f213821y;
        if (editText != null) {
            editText.dispatchKeyEvent(new android.view.KeyEvent(0, i17));
            wcPayKeyboard.f213821y.dispatchKeyEvent(new android.view.KeyEvent(1, i17));
        }
        yj0.a.h(this, "com/tencent/mm/wallet_core/keyboard/WcPayKeyboard$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
