package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class n2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.s2 f119149d;

    public n2(com.tencent.mm.plugin.finder.live.widget.s2 s2Var) {
        this.f119149d = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLicenseBottomSheet$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.s2 s2Var = this.f119149d;
        android.widget.CheckBox checkBox = s2Var.f119709k;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        if (checkBox.isChecked()) {
            s2Var.f119700b.invoke();
            s2Var.b().h();
        } else {
            android.widget.CheckBox checkBox2 = s2Var.f119709k;
            if (checkBox2 == null) {
                kotlin.jvm.internal.o.o("checkBox");
                throw null;
            }
            checkBox2.requestFocus();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLicenseBottomSheet$createContentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
