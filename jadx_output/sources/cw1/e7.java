package cw1;

/* loaded from: classes3.dex */
public final class e7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI f222921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222922e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f222924g;

    public e7(com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI, android.widget.TextView textView, android.widget.TextView textView2, android.view.View view) {
        this.f222921d = cleanOtherAccountUI;
        this.f222922e = textView;
        this.f222923f = textView2;
        this.f222924g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI = this.f222921d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) cleanOtherAccountUI, 1, true);
        k0Var.q(cleanOtherAccountUI.getString(com.tencent.mm.R.string.dzy), 17);
        k0Var.f211872n = new cw1.b7(cleanOtherAccountUI);
        k0Var.f211854d = new cw1.c7(cleanOtherAccountUI);
        k0Var.f211881s = new cw1.d7(this.f222922e, cleanOtherAccountUI, this.f222923f, this.f222924g);
        k0Var.v();
        cleanOtherAccountUI.f95798h = k0Var;
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanOtherAccountUI$initUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
