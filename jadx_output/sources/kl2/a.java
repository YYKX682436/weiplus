package kl2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl2.g f308749d;

    public a(kl2.g gVar) {
        this.f308749d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveCloseRestrictConsumePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kl2.g gVar = this.f308749d;
        android.widget.CheckBox checkBox = gVar.f308776q;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        checkBox.setChecked(!checkBox.isChecked());
        android.widget.TextView textView = gVar.f308775p;
        if (textView == null) {
            kotlin.jvm.internal.o.o("rightBtn");
            throw null;
        }
        android.widget.CheckBox checkBox2 = gVar.f308776q;
        if (checkBox2 == null) {
            kotlin.jvm.internal.o.o("lisenceCheck");
            throw null;
        }
        textView.setEnabled(checkBox2.isChecked());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/quota/widget/FinderLiveCloseRestrictConsumePanel$initContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
