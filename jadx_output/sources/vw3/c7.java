package vw3;

/* loaded from: classes.dex */
public final class c7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f440914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f440915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440917g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f440918h;

    public c7(com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI, com.tencent.mm.ui.widget.MMEditText mMEditText, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f440914d = repairerUploadTestUI;
        this.f440915e = mMEditText;
        this.f440916f = str;
        this.f440917g = str2;
        this.f440918h = str3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f440914d;
        repairerUploadTestUI.g = com.tencent.mm.ui.widget.dialog.u3.f(repairerUploadTestUI, "正在发送...", true, 0, null);
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI2 = this.f440914d;
        v65.i.b(repairerUploadTestUI2.e, null, new vw3.b7(this.f440915e, this.f440916f, this.f440917g, this.f440918h, repairerUploadTestUI2, null), 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
