package i53;

/* loaded from: classes8.dex */
public class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.m0 f288605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f288606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p33.l f288607f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i53.k0 f288608g;

    public j0(i53.k0 k0Var, i53.m0 m0Var, int i17, p33.l lVar) {
        this.f288608g = k0Var;
        this.f288605d = m0Var;
        this.f288606e = i17;
        this.f288607f = lVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/GameHaowanRecycleView$GameHaowanAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i53.k0 k0Var = this.f288608g;
        vl1.p pVar = k0Var.f288628m;
        i53.m0 m0Var = this.f288605d;
        android.view.View view2 = m0Var.itemView;
        long itemId = m0Var.getItemId();
        int i17 = this.f288606e;
        pVar.a(view2, i17, itemId);
        int x17 = k0Var.x(i17);
        p33.l lVar = this.f288607f;
        k0Var.y(x17, 2, lVar.f351614s, lVar.f351619x);
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/GameHaowanRecycleView$GameHaowanAdapter$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
