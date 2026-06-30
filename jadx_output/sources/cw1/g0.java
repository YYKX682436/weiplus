package cw1;

/* loaded from: classes3.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI f222941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222943f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222944g;

    public g0(com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI, android.widget.TextView textView, android.widget.TextView textView2, android.view.View view) {
        this.f222941d = cleanAllMessagesUI;
        this.f222942e = textView;
        this.f222943f = textView2;
        this.f222944g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanAllMessagesUI cleanAllMessagesUI = this.f222941d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) cleanAllMessagesUI, 1, true);
        k0Var.q(cleanAllMessagesUI.getString(com.tencent.mm.R.string.a_j), 17);
        k0Var.f211872n = new cw1.d0(cleanAllMessagesUI);
        k0Var.f211854d = new cw1.e0(cleanAllMessagesUI);
        k0Var.f211881s = new cw1.f0(this.f222942e, cleanAllMessagesUI, this.f222943f, this.f222944g);
        k0Var.v();
        cleanAllMessagesUI.f95648e = k0Var;
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanAllMessagesUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
