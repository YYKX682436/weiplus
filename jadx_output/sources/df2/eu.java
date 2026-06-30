package df2;

/* loaded from: classes3.dex */
public final class eu implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ju f230083d;

    public eu(df2.ju juVar) {
        this.f230083d = juVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveSharePromptTipsController$showTips$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.ju juVar = this.f230083d;
        df2.ox oxVar = (df2.ox) juVar.controller(df2.ox.class);
        if (oxVar != null) {
            oxVar.d7();
        }
        kotlinx.coroutines.r2 r2Var = juVar.f230500n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        juVar.d7();
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Lk(2, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveSharePromptTipsController$showTips$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
