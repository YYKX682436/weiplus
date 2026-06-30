package cv2;

/* loaded from: classes10.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cv2.c f222560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uh4.a f222561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kv2 f222562f;

    public a(cv2.c cVar, uh4.a aVar, r45.kv2 kv2Var) {
        this.f222560d = cVar;
        this.f222561e = aVar;
        this.f222562f = kv2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/teenmode/FinderAuthorizationFiller$fillCellByGuard$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cv2.c.f(this.f222560d, this.f222561e, this.f222562f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/teenmode/FinderAuthorizationFiller$fillCellByGuard$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
