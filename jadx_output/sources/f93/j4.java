package f93;

/* loaded from: classes.dex */
public class j4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelUI f260366d;

    public j4(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI) {
        this.f260366d = contactLabelUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260366d;
        contactLabelUI.f143297e.M.performClick();
        contactLabelUI.f143297e.M.requestFocus();
        android.widget.EditText editText = contactLabelUI.f143297e.M;
        editText.setSelection(editText.getText().length());
        ((android.view.inputmethod.InputMethodManager) contactLabelUI.getContext().getSystemService("input_method")).showSoftInput(contactLabelUI.f143297e.M, 0);
    }
}
