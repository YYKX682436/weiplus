package rn2;

/* loaded from: classes15.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397748d;

    public g1(rn2.t2 t2Var) {
        this.f397748d = t2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initGiftPrizeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn2.w wVar = this.f397748d.W;
        if (wVar != null) {
            rn2.t2 t2Var = wVar.f397902a;
            com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(t2Var.f397853e);
            android.view.LayoutInflater from = android.view.LayoutInflater.from(t2Var.f397853e);
            android.view.View view2 = y1Var.f212027f;
            kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            android.view.View inflate = from.inflate(com.tencent.mm.R.layout.deo, (android.view.ViewGroup) view2, false);
            inflate.findViewById(com.tencent.mm.R.id.bys).setOnClickListener(new rn2.j(y1Var));
            inflate.findViewById(com.tencent.mm.R.id.q4h).setOnClickListener(new rn2.k(y1Var, wVar));
            inflate.findViewById(com.tencent.mm.R.id.q4f).setOnClickListener(new rn2.l(y1Var, wVar));
            zl2.r4.f473950a.Q2(inflate);
            y1Var.k(inflate);
            y1Var.s();
            y1Var.f212037s = rn2.m.f397796a;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateViewCallback$initGiftPrizeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
