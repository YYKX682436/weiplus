package dv2;

/* loaded from: classes2.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.a1 f243974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.redpacket.FinderRedPacketScaleLayoutManager f243975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f243976f;

    public y0(dv2.a1 a1Var, com.tencent.mm.plugin.finder.redpacket.FinderRedPacketScaleLayoutManager finderRedPacketScaleLayoutManager, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f243974d = a1Var;
        this.f243975e = finderRedPacketScaleLayoutManager;
        this.f243976f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.redpacket.FinderRedPacketScaleLayoutManager finderRedPacketScaleLayoutManager = this.f243975e;
        dv2.a1 a1Var = this.f243974d;
        int O6 = dv2.a1.O6(a1Var, finderRedPacketScaleLayoutManager);
        if (O6 >= 0 && O6 < a1Var.f243807e.size()) {
            java.lang.Object obj = a1Var.f243807e.get(O6);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            r45.m66 m66Var = (r45.m66) obj;
            aw2.n nVar = a1Var.f243810h;
            if (nVar != null) {
                nVar.c(m66Var, true);
            }
            this.f243976f.q();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/uic/FinderPostRedPackCoverUIC$showRedPackCoverDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
