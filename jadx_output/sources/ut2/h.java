package ut2;

/* loaded from: classes3.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.p f430894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.i0 f430895e;

    public h(ut2.p pVar, cm2.i0 i0Var) {
        this.f430894d = pVar;
        this.f430895e = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder$bindPromoteBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.p pVar = this.f430894d;
        pVar.getClass();
        cm2.i0 i0Var = this.f430895e;
        r45.hw0 hw0Var = i0Var.f43354v;
        int i17 = hw0Var.getInteger(14) == 1 ? 2 : 1;
        android.content.Context context = pVar.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        gk2.e eVar = pVar.f431027e;
        long j17 = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0);
        long j18 = ((mm2.e1) eVar.a(mm2.e1.class)).f328983m;
        java.lang.String str = ((mm2.e1) eVar.a(mm2.e1.class)).f328984n;
        android.content.Context context2 = pVar.itemView.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        new ek2.e2(j17, j18, str, xy2.c.e(context2), hw0Var.getLong(0), 3, i17, 0, V6, 3, new ut2.o(hw0Var, i17, pVar, i0Var)).l();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveBulkBuyViewHolder$bindPromoteBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
