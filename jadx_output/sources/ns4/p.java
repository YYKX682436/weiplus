package ns4;

/* loaded from: classes8.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f339606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ns4.s f339607e;

    public p(android.widget.CheckBox checkBox, ns4.s sVar) {
        this.f339606d = checkBox;
        this.f339607e = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updateCheckBox$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.widget.CheckBox checkBox = this.f339606d;
        boolean isChecked = checkBox.isChecked();
        ns4.s sVar = this.f339607e;
        if (isChecked) {
            checkBox.setChecked(false);
            sVar.f339640e.O6(4);
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updateCheckBox$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            checkBox.setChecked(true);
            sVar.f339640e.O6(3);
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/BuyGoodsBottomDialog$updateCheckBox$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
