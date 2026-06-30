package pk2;

/* loaded from: classes3.dex */
public final class s4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.t4 f356234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f356235e;

    public s4(pk2.t4 t4Var, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        this.f356234d = t4Var;
        this.f356235e = e3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorWhiteListOption$addItem$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pk2.t4 t4Var = this.f356234d;
        t4Var.x(2);
        this.f356235e.h();
        df2.o oVar = (df2.o) t4Var.f364427a.e(df2.o.class);
        if (oVar != null) {
            com.tencent.mm.plugin.finder.live.widget.q50 q50Var = oVar.f230900q;
            if (q50Var == null) {
                q50Var = new com.tencent.mm.plugin.finder.live.widget.q50(oVar.O6(), oVar.getStore());
                oVar.f230900q = q50Var;
            }
            q50Var.f119501x1 = false;
            q50Var.V(null, false, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorWhiteListOption$addItem$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
