package ns4;

/* loaded from: classes8.dex */
public final class x3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.b4 f339678d;

    public x3(ns4.b4 b4Var) {
        this.f339678d = b4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel$bindAction$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ot5.g.c("WeCoinSubscribePanel", "click agreement");
        android.widget.CheckBox checkBox = this.f339678d.f339453m;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("checkbox");
            throw null;
        }
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("checkbox");
            throw null;
        }
        checkBox.setChecked(!checkBox.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel$bindAction$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
