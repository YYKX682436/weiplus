package ib2;

/* loaded from: classes2.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.w f290117d;

    public h(ib2.w wVar) {
        this.f290117d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$initViews$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ib2.w wVar = this.f290117d;
        r45.ev2 O6 = ib2.w.O6(wVar);
        if (O6 != null) {
            so2.v0 v0Var = so2.v0.f410644a;
            r45.vx0 vx0Var = wVar.f290156d;
            android.app.Activity context = wVar.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            so2.v0.a(v0Var, vx0Var, O6, (androidx.appcompat.app.AppCompatActivity) context, null, null, 24, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/collection/FinderCollectionHeaderUIC$initViews$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
