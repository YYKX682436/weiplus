package se2;

/* loaded from: classes3.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ se2.e0 f406838d;

    public b0(se2.e0 e0Var) {
        this.f406838d = e0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.List arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/comment/BoxCommentViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        se2.e0 e0Var = this.f406838d;
        java.lang.Object value = ((jz5.n) e0Var.f406853c).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.view.ViewGroup) value).setVisibility(8);
        try {
            int i17 = ((mm2.e0) e0Var.a(mm2.e0.class)).f328975r;
            com.tencent.mm.plugin.finder.live.plugin.tb tbVar = e0Var.f406851a;
            if (i17 > 0) {
                int i18 = ((mm2.e0) e0Var.a(mm2.e0.class)).f328972o;
                int u17 = tbVar.u1() - 1;
                int i19 = i18 + 1;
                int i27 = ((mm2.e0) e0Var.a(mm2.e0.class)).f328975r;
                if (i19 <= i27 && i27 <= u17) {
                    tbVar.v1().d(((mm2.e0) e0Var.a(mm2.e0.class)).f328975r, java.lang.Boolean.TRUE);
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = tbVar.f114375w;
                    if (wxRecyclerAdapter == null || (arrayList = wxRecyclerAdapter.getData()) == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    lm2.c cVar = (lm2.c) arrayList.get(((mm2.e0) e0Var.a(mm2.e0.class)).f328975r);
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Gk(cVar.c(), 1, cVar.a());
                } else {
                    tbVar.v1().c(java.lang.Boolean.FALSE);
                }
                ((mm2.e0) e0Var.a(mm2.e0.class)).V6(0);
            } else {
                tbVar.v1().c(java.lang.Boolean.FALSE);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, e0Var.f406852b + "-newTipGroupClick");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/comment/BoxCommentViewCallback$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
