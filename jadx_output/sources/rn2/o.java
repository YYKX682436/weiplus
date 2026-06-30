package rn2;

/* loaded from: classes15.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.w f397806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.h3 f397807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f397808f;

    public o(rn2.w wVar, rn2.h3 h3Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f397806d = wVar;
        this.f397807e = h3Var;
        this.f397808f = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper$showGiftSelectorPanel$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn2.h3 h3Var = this.f397807e;
        java.util.LinkedList x17 = h3Var.x();
        rn2.w wVar = this.f397806d;
        rn2.t2 t2Var = wVar.f397902a;
        rn2.f fVar = t2Var.f397854f;
        r45.gz1 gz1Var = fVar != null ? ((rn2.c1) fVar).f397683z : null;
        java.lang.String str = wVar.f397903b;
        if (gz1Var == null) {
            com.tencent.mars.xlog.Log.e(str, "saveLotteryGiftSelectorResult but prizeMethod is null");
        }
        if (gz1Var != null && gz1Var.getInteger(0) == 2) {
            rn2.f fVar2 = t2Var.f397854f;
            if (fVar2 != null) {
                r45.vd4 vd4Var = (r45.vd4) gz1Var.getCustom(2);
                java.lang.Integer valueOf = java.lang.Integer.valueOf(vd4Var != null ? vd4Var.getInteger(0) : 0);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : x17) {
                    if (((rn2.y2) obj).f397926a) {
                        arrayList2.add(obj);
                    }
                }
                ((rn2.c1) fVar2).C(valueOf, arrayList2);
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveLotteryGiftSelectorResult but prize_type:");
            sb6.append(gz1Var != null ? java.lang.Integer.valueOf(gz1Var.getInteger(0)) : null);
            sb6.append(" is error!");
            com.tencent.mars.xlog.Log.e(str, sb6.toString());
        }
        rn2.f fVar3 = wVar.f397902a.f397854f;
        wVar.b(fVar3 != null ? ((rn2.c1) fVar3).f397683z : null, h3Var.x());
        this.f397808f.q();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftHelper$showGiftSelectorPanel$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
