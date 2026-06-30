package of2;

/* loaded from: classes5.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of2.g f345081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nf2.a f345082e;

    public f(of2.g gVar, nf2.a aVar) {
        this.f345081d = gVar;
        this.f345082e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/lyrics/panel/FinderLiveLyricsStyleEditPanel$LayoutStyleAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f345081d.f345083d.invoke(this.f345082e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/lyrics/panel/FinderLiveLyricsStyleEditPanel$LayoutStyleAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
