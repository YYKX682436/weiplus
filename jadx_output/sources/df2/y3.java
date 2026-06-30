package df2;

/* loaded from: classes3.dex */
public final class y3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.d4 f231846d;

    public y3(df2.d4 d4Var) {
        this.f231846d = d4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/FinderLiveShoppingQuestionController$changeToInputMode$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.xw.f231808w.a(3, null);
        df2.d4 d4Var = this.f231846d;
        d4Var.getClass();
        com.tencent.mm.plugin.finder.live.util.y.o(d4Var, null, null, new df2.c4(d4Var, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/FinderLiveShoppingQuestionController$changeToInputMode$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
