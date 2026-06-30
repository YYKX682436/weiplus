package sl2;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl2.c f409239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uh4.a f409240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f409241f;

    public b(sl2.c cVar, uh4.a aVar, r45.g92 g92Var) {
        this.f409239d = cVar;
        this.f409240e = aVar;
        this.f409241f = g92Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/teenmode/FinderLiveAuthorizationFiller$fillCellByWard$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sl2.c.f(this.f409239d, this.f409240e, this.f409241f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/teenmode/FinderLiveAuthorizationFiller$fillCellByWard$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
