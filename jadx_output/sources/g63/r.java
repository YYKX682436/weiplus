package g63;

/* loaded from: classes8.dex */
public final class r implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g63.s f269165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z53.i f269166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f269167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g63.b f269168g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f269169h;

    public r(g63.s sVar, z53.i iVar, int i17, g63.b bVar, android.view.View view) {
        this.f269165d = sVar;
        this.f269166e = iVar;
        this.f269167f = i17;
        this.f269168g = bVar;
        this.f269169h = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$onBindViewHolder$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        z53.i iVar = this.f269166e;
        g63.s sVar = this.f269165d;
        int i17 = this.f269167f;
        g63.s.a(sVar, iVar, 72L, i17);
        z53.i iVar2 = (z53.i) this.f269168g.f293125i;
        g63.d dVar = sVar.f269173c;
        if (dVar != null) {
            kotlin.jvm.internal.o.d(iVar2);
            ((g63.n) dVar).a(this.f269169h, i17, iVar2, ((g63.j) sVar.f269164a).x());
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/gamelife/ui/GameLifeConversationNormalViewProvider$onBindViewHolder$2$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
