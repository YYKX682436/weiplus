package vw3;

/* loaded from: classes.dex */
public final class p6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f441070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f441071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f441072f;

    public p6(com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.ui.widget.MMEditText mMEditText2, com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI) {
        this.f441070d = mMEditText;
        this.f441071e = mMEditText2;
        this.f441072f = repairerUploadTestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String obj = this.f441070d.getText().toString();
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f441071e;
        android.text.Editable text = mMEditText.getText();
        long parseLong = !(text == null || r26.n0.N(text)) ? java.lang.Long.parseLong(mMEditText.getText().toString()) : 0L;
        if (!r26.n0.N(obj)) {
            com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f441072f;
            v65.i.b(repairerUploadTestUI.e, null, new vw3.o6(parseLong, obj, repairerUploadTestUI, null), 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
