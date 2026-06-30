package p61;

/* loaded from: classes5.dex */
public class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI f352291d;

    public i2(com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI bindMobileStatusUI) {
        this.f352291d = bindMobileStatusUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMobileStatusUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI bindMobileStatusUI = this.f352291d;
        bindMobileStatusUI.f73020o = java.lang.Boolean.valueOf(!bindMobileStatusUI.f73020o.booleanValue());
        if (bindMobileStatusUI.f73020o.booleanValue()) {
            bindMobileStatusUI.f73018m.setImageResource(com.tencent.mm.R.raw.checkbox_selected);
        } else {
            bindMobileStatusUI.f73018m.setImageResource(com.tencent.mm.R.drawable.f481256oo);
        }
        bindMobileStatusUI.a7(!bindMobileStatusUI.f73020o.booleanValue(), 256, 7);
        if (!bindMobileStatusUI.f73020o.booleanValue()) {
            bindMobileStatusUI.a7(false, 2097152, 32);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileStatusUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
