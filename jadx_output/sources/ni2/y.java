package ni2;

/* loaded from: classes3.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.d0 f337507d;

    public y(ni2.d0 d0Var) {
        this.f337507d = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicLisencePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ni2.d0 d0Var = this.f337507d;
        android.widget.CheckBox checkBox = d0Var.f337271m;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        checkBox.setChecked(!checkBox.isChecked());
        android.widget.CheckBox checkBox2 = d0Var.f337271m;
        if (checkBox2 == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        d0Var.f337276r = checkBox2.isChecked() ? 1 : 0;
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicLisencePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
