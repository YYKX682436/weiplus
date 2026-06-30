package qw3;

/* loaded from: classes3.dex */
public class x implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f367220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI f367221e;

    public x(com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI, android.widget.EditText editText) {
        this.f367221e = bankRemitBankcardInputUI;
        this.f367220d = editText;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.widget.EditText editText = this.f367220d;
        if (editText != null) {
            editText.clearFocus();
        }
        com.tencent.mm.plugin.remittance.bankcard.ui.BankRemitBankcardInputUI bankRemitBankcardInputUI = this.f367221e;
        ((android.view.inputmethod.InputMethodManager) bankRemitBankcardInputUI.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        android.widget.ListView listView = bankRemitBankcardInputUI.f156486p;
        if (listView != null) {
            listView.setVisibility(8);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/remittance/bankcard/ui/BankRemitBankcardInputUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
