package ns4;

/* loaded from: classes8.dex */
public final class y3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.b4 f339685d;

    public y3(ns4.b4 b4Var) {
        this.f339685d = b4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel$bindAction$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click confirm_button, checkbox.isChecked:");
        ns4.b4 b4Var = this.f339685d;
        android.widget.CheckBox checkBox = b4Var.f339453m;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("checkbox");
            throw null;
        }
        sb6.append(checkBox.isChecked());
        ot5.g.c("WeCoinSubscribePanel", sb6.toString());
        android.widget.CheckBox checkBox2 = b4Var.f339453m;
        if (checkBox2 == null) {
            kotlin.jvm.internal.o.o("checkbox");
            throw null;
        }
        if (checkBox2.isChecked()) {
            kotlin.coroutines.Continuation continuation = b4Var.f339457q;
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                continuation.resumeWith(kotlin.Result.m521constructorimpl((pr4.h) b4Var.f339442b.f357990d.get(b4Var.f339456p)));
            }
            b4Var.f339457q = null;
            b4Var.f339443c.q();
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel$bindAction$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(b4Var.f339441a, com.tencent.mm.R.anim.f477737y);
        android.view.View view2 = b4Var.f339452l;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("agreement_layout");
            throw null;
        }
        view2.startAnimation(loadAnimation);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinSubscribePanel$bindAction$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
