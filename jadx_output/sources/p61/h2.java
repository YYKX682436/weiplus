package p61;

/* loaded from: classes5.dex */
public class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI f352280d;

    public h2(com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI bindMobileStatusUI) {
        this.f352280d = bindMobileStatusUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMobileStatusUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI bindMobileStatusUI = this.f352280d;
        bindMobileStatusUI.f73019n = java.lang.Boolean.valueOf(!bindMobileStatusUI.f73019n.booleanValue());
        if (bindMobileStatusUI.f73019n.booleanValue()) {
            bindMobileStatusUI.f73017i.setImageResource(com.tencent.mm.R.raw.checkbox_selected);
        } else {
            bindMobileStatusUI.f73017i.setImageResource(com.tencent.mm.R.drawable.f481256oo);
        }
        bindMobileStatusUI.a7(!bindMobileStatusUI.f73019n.booleanValue(), 512, 8);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileStatusUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
