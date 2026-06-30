package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class f3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cw1 f118304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h3 f118305e;

    public f3(r45.cw1 cw1Var, com.tencent.mm.plugin.finder.live.widget.h3 h3Var) {
        this.f118304d = cw1Var;
        this.f118305e = h3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setInfo$1$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        ml2.c4 c4Var = ml2.c4.f327334f;
        r45.cw1 infoItem = this.f118304d;
        r0Var.pj(c4Var, infoItem.getInteger(5), infoItem.getString(0));
        com.tencent.mm.plugin.finder.live.widget.h3 h3Var = this.f118305e;
        h3Var.f118518g.h();
        h3Var.getClass();
        kotlin.jvm.internal.o.g(infoItem, "infoItem");
        java.lang.String string = infoItem.getString(0);
        r45.cw1 cw1Var = h3Var.f118515d;
        boolean b17 = kotlin.jvm.internal.o.b(string, cw1Var != null ? cw1Var.getString(0) : null);
        dk2.q4 q4Var = dk2.q4.f233938a;
        android.content.Context context = h3Var.f118512a;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = h3Var.f118513b;
        if (b17) {
            if (infoItem.getInteger(5) == 2) {
                java.lang.String string2 = infoItem.getString(0);
                if (string2 != null) {
                    zl2.q4.f473933a.G(string2, ((mm2.c1) lVar.P0(mm2.c1.class)).f328852o, h3Var.f118512a, ((mm2.c1) lVar.P0(mm2.c1.class)).f328861p2, java.lang.String.valueOf(((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0)), 4);
                }
            } else {
                android.content.Context context2 = h3Var.f118512a;
                gk2.e S0 = lVar.S0();
                java.lang.String str = ((mm2.c1) lVar.P0(mm2.c1.class)).f328852o;
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                dk2.q4.j(q4Var, context2, S0, true, str, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6(), true, null, 64, null);
            }
        } else if (infoItem.getInteger(5) == 2) {
            java.lang.String string3 = infoItem.getString(0);
            if (string3 != null) {
                zl2.q4.f473933a.G(string3, "", h3Var.f118512a, ((mm2.c1) lVar.P0(mm2.c1.class)).f328861p2, java.lang.String.valueOf(((mm2.e1) lVar.P0(mm2.e1.class)).f328988r.getLong(0)), 4);
            }
        } else {
            java.lang.String string4 = infoItem.getString(0);
            if (string4 != null) {
                android.content.Context context3 = h3Var.f118512a;
                gk2.e S02 = lVar.S0();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                dk2.q4.j(q4Var, context3, S02, false, string4, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6(), true, null, 64, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAdGuideWidget$setInfo$1$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
