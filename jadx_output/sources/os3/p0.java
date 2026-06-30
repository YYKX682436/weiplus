package os3;

/* loaded from: classes8.dex */
public class p0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ComposeUI f348168d;

    public p0(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI) {
        this.f348168d = composeUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        if (z17) {
            android.widget.EditText editText = this.f348168d.f154844q;
            editText.setSelection(editText.getText().length());
        }
    }
}
