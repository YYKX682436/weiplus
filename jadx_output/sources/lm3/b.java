package lm3;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.d f319466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f319467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm3.q f319468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f319469g;

    public b(lm3.d dVar, int i17, fm3.q qVar, in5.s0 s0Var) {
        this.f319466d = dVar;
        this.f319467e = i17;
        this.f319468f = qVar;
        this.f319469g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.uic.d3 d3Var = this.f319466d.f319479e;
        android.view.View itemView = this.f319469g.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.mv.ui.uic.f3 f3Var = (com.tencent.mm.plugin.mv.ui.uic.f3) d3Var;
        f3Var.getClass();
        fm3.q item = this.f319468f;
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRollback: ");
        int i17 = this.f319467e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", sb6.toString());
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = f3Var.f151124a;
        java.util.ArrayList arrayList2 = h4Var.f151162f;
        if (i17 < arrayList2.size()) {
            java.lang.Object obj = arrayList2.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            fm3.q qVar = (fm3.q) obj;
            qVar.f264110h = item.f264110h;
            item.f264114o = null;
            h4Var.f151161e.set(i17, qVar);
            h4Var.R6().notifyItemChanged(i17);
            h4Var.V6(i17);
        }
        com.tencent.mm.plugin.mv.ui.uic.g3 g3Var = h4Var.f151171r;
        if (g3Var != null) {
            jm3.c0 c0Var = (jm3.c0) g3Var;
            if (!c0Var.f300301b.P6()) {
                com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.V6(c0Var.f300300a);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
