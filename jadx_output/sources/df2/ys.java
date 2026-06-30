package df2;

/* loaded from: classes10.dex */
public final class ys implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231892d;

    public ys(df2.lt ltVar) {
        this.f231892d = ltVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.bm1 bm1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$showFestivalSnsHalf$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.lt ltVar = this.f231892d;
        com.tencent.mm.plugin.finder.view.e3 e3Var = ltVar.S;
        if (e3Var != null) {
            e3Var.h();
        }
        df2.lt.c7(ltVar, 2);
        in5.c cVar = ltVar.f230710r;
        java.lang.String str = null;
        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
        if (hVar != null && (bm1Var = hVar.f233545h) != null) {
            str = bm1Var.getString(0);
        }
        ltVar.t7(ltVar.k7(str, 7));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$showFestivalSnsHalf$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
