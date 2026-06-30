package jx0;

/* loaded from: classes5.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jx0.k f302376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jx0.d f302377e;

    public j(jx0.k kVar, jx0.d dVar) {
        this.f302376d = kVar;
        this.f302377e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJExportDialog$setCancelClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jx0.k kVar = this.f302376d;
        if (!kVar.f302383i) {
            kVar.c(true);
            kVar.f302384m = ((hx0.d) this.f302377e).f285613a.c("click");
            boolean z17 = kVar.f302383i;
            boolean z18 = kVar.f302384m;
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/widgets/MJExportDialog$setCancelClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
