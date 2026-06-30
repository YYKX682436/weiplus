package f93;

/* loaded from: classes.dex */
public class i4 implements db5.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelUI f260357a;

    public i4(com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI) {
        this.f260357a = contactLabelUI;
    }

    @Override // db5.d3
    public void a(java.lang.CharSequence charSequence) {
        android.widget.EditText editText;
        com.tencent.mm.plugin.label.ui.ContactLabelUI contactLabelUI = this.f260357a;
        db5.f3 f3Var = contactLabelUI.f143297e;
        if (f3Var != null && (editText = f3Var.M) != null) {
            contactLabelUI.hideVKB(editText);
        }
        contactLabelUI.f143297e.B();
        if (!contactLabelUI.f143307r.getTagList().contains(charSequence.toString())) {
            contactLabelUI.f143300h = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(charSequence.toString());
            c01.d9.e().g(new e93.a(arrayList));
            contactLabelUI.U6(contactLabelUI.getString(com.tencent.mm.R.string.g9k));
        }
        com.tencent.mm.ui.tools.f5 f5Var = contactLabelUI.f143298f;
        if (f5Var != null) {
            f5Var.d();
        }
    }
}
