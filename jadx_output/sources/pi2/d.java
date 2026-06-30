package pi2;

/* loaded from: classes3.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi2.n f354770d;

    public d(pi2.n nVar) {
        this.f354770d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pi2.n nVar = this.f354770d;
        android.widget.CheckBox checkBox = nVar.M;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        checkBox.setChecked(!checkBox.isChecked());
        fg2.u0 u0Var = nVar.R;
        if (u0Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.widget.CheckBox checkBox2 = nVar.M;
        if (checkBox2 == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        u0Var.f262349g.setEnabled(checkBox2.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pay/panel/FinderLiveMicPayExchangePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
