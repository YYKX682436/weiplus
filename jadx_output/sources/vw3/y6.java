package vw3;

/* loaded from: classes.dex */
public final class y6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI f441196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f441197e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f441198f;

    public y6(com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI, com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.ui.widget.MMEditText mMEditText2) {
        this.f441196d = repairerUploadTestUI;
        this.f441197e = mMEditText;
        this.f441198f = mMEditText2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerUploadTestUI repairerUploadTestUI = this.f441196d;
        repairerUploadTestUI.g = com.tencent.mm.ui.widget.dialog.u3.f(repairerUploadTestUI, "正在发送...", true, 0, null);
        v65.i.b(repairerUploadTestUI.e, null, new vw3.x6(this.f441197e, this.f441198f, repairerUploadTestUI, null), 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerUploadTestUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
