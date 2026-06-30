package p61;

/* loaded from: classes.dex */
public class d2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI f352233d;

    public d2(com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI bindMobilePolicyUI) {
        this.f352233d = bindMobilePolicyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMobilePolicyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindMobilePolicyUI bindMobilePolicyUI = this.f352233d;
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(bindMobilePolicyUI.getContext());
        u1Var.g(bindMobilePolicyUI.getString(com.tencent.mm.R.string.agf));
        u1Var.m(com.tencent.mm.R.string.agg);
        u1Var.a(true);
        u1Var.b(new p61.c2(this));
        u1Var.q(false);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobilePolicyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
