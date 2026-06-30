package qb2;

/* loaded from: classes10.dex */
public final class y implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wn.j f361310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qb2.b0 f361311e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f361312f;

    public y(wn.j jVar, qb2.b0 b0Var, android.view.View view) {
        this.f361310d = jVar;
        this.f361311e = b0Var;
        this.f361312f = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/conv/FinderConversationAdapter$onCreateViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        wn.j jVar = this.f361310d;
        qb2.t tVar = (qb2.t) jVar.f293125i;
        qb2.v vVar = this.f361311e.f361177s;
        if (vVar != null) {
            int adapterPosition = jVar.getAdapterPosition();
            kotlin.jvm.internal.o.d(tVar);
            qb2.l0 l0Var = (qb2.l0) vVar;
            android.view.View view2 = this.f361312f;
            kotlin.jvm.internal.o.g(view2, "view");
            l0Var.f361234e = tVar;
            rl5.r rVar = new rl5.r(view2.getContext());
            rVar.L = l0Var;
            rVar.g(view2, adapterPosition, 0L, l0Var, l0Var, com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
            rVar.m();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/conv/FinderConversationAdapter$onCreateViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
