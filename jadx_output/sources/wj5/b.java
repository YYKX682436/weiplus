package wj5;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f446776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wj5.c f446777e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ db5.t4 f446778f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tipsbar.d f446779g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f446780h;

    public b(int i17, wj5.c cVar, db5.t4 t4Var, com.tencent.mm.ui.tipsbar.d dVar, android.view.View view) {
        this.f446776d = i17;
        this.f446777e = cVar;
        this.f446778f = t4Var;
        this.f446779g = dVar;
        this.f446780h = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/BaseTipsBarConvert$bindLongClickMenu$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        rl5.r rVar = new rl5.r(view.getContext());
        rVar.f397352v = new wj5.a(this.f446780h);
        int i17 = this.f446776d;
        wj5.c cVar = this.f446777e;
        db5.t4 t4Var = this.f446778f;
        int[] iArr = this.f446779g.f209928d;
        rVar.g(view, i17, 0L, cVar, t4Var, iArr[0], iArr[1]);
        yj0.a.i(true, this, "com/tencent/mm/ui/tipsbar/convert/BaseTipsBarConvert$bindLongClickMenu$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
