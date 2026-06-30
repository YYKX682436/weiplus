package df2;

/* loaded from: classes10.dex */
public final class es implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230081d;

    public es(df2.lt ltVar) {
        this.f230081d = ltVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$initFestivalSnsTips$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.G1;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        zy2.zb.T8(zbVar, t1Var, linkedHashMap, b17, null, null, null, false, 120, null);
        df2.lt ltVar = this.f230081d;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = ltVar.E;
        boolean z17 = false;
        if (constraintLayout != null && constraintLayout.getVisibility() == 0) {
            z17 = true;
        }
        if (z17) {
            ltVar.o7(new df2.ds(ltVar));
        } else {
            df2.lt.c7(ltVar, 1);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$initFestivalSnsTips$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
