package lm3;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.d f319474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f319475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm3.q f319476f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f319477g;

    public c(lm3.d dVar, int i17, fm3.q qVar, in5.s0 s0Var) {
        this.f319474d = dVar;
        this.f319475e = i17;
        this.f319476f = qVar;
        this.f319477g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.uic.d3 d3Var = this.f319474d.f319479e;
        android.view.View itemView = this.f319477g.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.mv.ui.uic.f3 f3Var = (com.tencent.mm.plugin.mv.ui.uic.f3) d3Var;
        f3Var.getClass();
        fm3.q item = this.f319476f;
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onEdit: ");
        int i17 = this.f319475e;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", sb6.toString());
        android.widget.ImageView imageView = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.k1o);
        if (imageView != null) {
            fm3.w a17 = fm3.x.a(imageView);
            com.tencent.mm.plugin.mv.ui.uic.g3 g3Var = f3Var.f151124a.f151171r;
            if (g3Var != null) {
                ((jm3.c0) g3Var).a(i17, item, false, a17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MusicMVVideoItemConverter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
