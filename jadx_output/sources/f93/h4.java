package f93;

/* loaded from: classes.dex */
public class h4 implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelUI f260350a;

    public h4(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI) {
        this.f260350a = contactLabelUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public void dismiss() {
        android.widget.EditText editText;
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260350a;
        db5.f3 f3Var = contactLabelUI.f143297e;
        if (f3Var == null || (editText = f3Var.M) == null) {
            return;
        }
        contactLabelUI.hideVKB(editText);
    }
}
