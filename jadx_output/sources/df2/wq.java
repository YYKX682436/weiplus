package df2;

/* loaded from: classes.dex */
public final class wq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ar f231704d;

    public wq(df2.ar arVar) {
        this.f231704d = arVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.mv1 mv1Var;
        r45.mv1 mv1Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveProductGiftController$setClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.ar arVar = this.f231704d;
        r45.lv1 lv1Var = arVar.f229746v;
        boolean z17 = false;
        if (lv1Var != null && (mv1Var2 = (r45.mv1) lv1Var.getCustom(11)) != null && mv1Var2.getBoolean(0)) {
            z17 = true;
        }
        if (!z17) {
            arVar.i7(2);
            arVar.k7(true);
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveProductGiftController$setClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Context O6 = arVar.O6();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
        r45.lv1 lv1Var2 = arVar.f229746v;
        e4Var.f211776c = (lv1Var2 == null || (mv1Var = (r45.mv1) lv1Var2.getCustom(11)) == null) ? null : mv1Var.getString(1);
        e4Var.c();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveProductGiftController$setClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
