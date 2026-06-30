package df2;

/* loaded from: classes3.dex */
public final class z3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.d4 f231926d;

    public z3(df2.d4 d4Var) {
        this.f231926d = d4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/FinderLiveShoppingQuestionController$changeToInputMode$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.d4 d4Var = this.f231926d;
        android.widget.CheckBox a76 = d4Var.a7();
        boolean z17 = !(a76 != null ? a76.isChecked() : false);
        android.widget.CheckBox a77 = d4Var.a7();
        if (a77 != null) {
            a77.setChecked(z17);
        }
        df2.nw nwVar = df2.xw.f231808w;
        if (z17) {
            android.view.View b76 = d4Var.b7();
            if (b76 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(b76, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveShoppingQuestionController$changeToInputMode$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b76.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(b76, "com/tencent/mm/plugin/finder/live/controller/FinderLiveShoppingQuestionController$changeToInputMode$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            nwVar.a(1, kz5.b1.e(new jz5.l("result", "1")));
        } else {
            android.view.View b77 = d4Var.b7();
            if (b77 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(b77, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/FinderLiveShoppingQuestionController$changeToInputMode$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b77.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(b77, "com/tencent/mm/plugin/finder/live/controller/FinderLiveShoppingQuestionController$changeToInputMode$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            nwVar.a(1, kz5.b1.e(new jz5.l("result", "0")));
        }
        d4Var.f229941p.setValue(java.lang.Boolean.valueOf(z17));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/FinderLiveShoppingQuestionController$changeToInputMode$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
