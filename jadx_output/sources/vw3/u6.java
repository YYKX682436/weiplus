package vw3;

/* loaded from: classes.dex */
public final class u6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f441147d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f441148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f441149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f441150g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f441151h;

    public u6(com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.ui.widget.MMEditText mMEditText2, com.tencent.mm.ui.widget.MMEditText mMEditText3, com.tencent.mm.ui.widget.MMEditText mMEditText4, com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI) {
        this.f441147d = mMEditText;
        this.f441148e = mMEditText2;
        this.f441149f = mMEditText3;
        this.f441150g = mMEditText4;
        this.f441151h = repairerUploadTestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String obj;
        java.lang.String obj2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String obj3 = this.f441147d.getText().toString();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f441148e;
        android.text.Editable text = mMEditText.getText();
        long parseLong = !(text == null || r26.n0.N(text)) ? java.lang.Long.parseLong(mMEditText.getText().toString()) : 0L;
        android.text.Editable text2 = this.f441149f.getText();
        java.lang.String str = (text2 == null || (obj2 = text2.toString()) == null) ? "" : obj2;
        android.text.Editable text3 = this.f441150g.getText();
        java.lang.String str2 = (text3 == null || (obj = text3.toString()) == null) ? "" : obj;
        if (!r26.n0.N(obj3)) {
            com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f441151h;
            v65.i.b(repairerUploadTestUI.e, null, new vw3.t6(str2, parseLong, str, obj3, repairerUploadTestUI, null), 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
