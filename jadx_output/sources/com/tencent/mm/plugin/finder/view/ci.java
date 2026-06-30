package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ci implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.ei f131778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f131779e;

    public ci(com.tencent.mm.plugin.finder.view.ei eiVar, android.widget.TextView textView) {
        this.f131778d = eiVar;
        this.f131779e = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List list = this.f131778d.f132015j;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.rw4 rw4Var = (r45.rw4) it.next();
            r45.qw4 qw4Var = new r45.qw4();
            qw4Var.set(0, java.lang.Integer.valueOf(rw4Var.getInteger(0)));
            qw4Var.set(1, rw4Var.getString(2));
            arrayList2.add(qw4Var);
            java.lang.String string = rw4Var.getString(1);
            if (string != null) {
                arrayList3.add(string);
            }
        }
        com.tencent.mm.autogen.events.FinderFeedDislikeEvent finderFeedDislikeEvent = new com.tencent.mm.autogen.events.FinderFeedDislikeEvent();
        finderFeedDislikeEvent.f54274g.f6547a = this.f131778d.f132008c;
        finderFeedDislikeEvent.e();
        com.tencent.mm.plugin.finder.view.ei eiVar = this.f131778d;
        long j17 = eiVar.f132008c;
        java.lang.String str = eiVar.f132009d;
        android.content.Context context = eiVar.f132007b;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        new db2.j0(j17, str, "", 8, 1, nyVar != null ? nyVar.V6() : null, java.lang.Boolean.FALSE, arrayList2).l();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.finder.view.bi biVar = new com.tencent.mm.plugin.finder.view.bi(this.f131778d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(biVar, 200L, false);
        jz5.l[] lVarArr = new jz5.l[1];
        java.lang.String g07 = kz5.n0.g0(arrayList3, "|", null, null, 0, null, null, 62, null);
        if (g07.length() == 0) {
            g07 = "";
        }
        lVarArr[0] = new jz5.l("click_reason", g07);
        java.util.Map l17 = kz5.c1.l(lVarArr);
        java.util.Map map = this.f131778d.f132010e;
        if (map != null) {
            l17.putAll(map);
        }
        hc2.v0.d(this.f131779e, "product_feed_feedback_finish", "view_clk", false, l17, null, 20, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderProductFeedbackWindow$initSecondPage$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
