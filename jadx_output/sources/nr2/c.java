package nr2;

/* loaded from: classes.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.l f339167d;

    public c(nr2.l lVar) {
        this.f339167d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/paidcollection/FinderCollectionPreviewItemUIC$createView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nr2.l lVar = this.f339167d;
        android.app.Activity context = lVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        nr2.u0 u0Var = (nr2.u0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(nr2.u0.class);
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(view);
            u0Var.O6(view, lVar.f339256i);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/paidcollection/FinderCollectionPreviewItemUIC$createView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
