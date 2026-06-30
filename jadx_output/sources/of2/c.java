package of2;

/* loaded from: classes8.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of2.d f345068d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf2.l1 f345069e;

    public c(of2.d dVar, nf2.l1 l1Var) {
        this.f345068d = dVar;
        this.f345069e = l1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/lyrics/panel/FinderLiveLyricsStyleEditPanel$ColorStyleAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f345068d.f345070d.invoke(this.f345069e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/lyrics/panel/FinderLiveLyricsStyleEditPanel$ColorStyleAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
