package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ha0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ma0 f112791d;

    public ha0(com.tencent.mm.plugin.finder.live.plugin.ma0 ma0Var) {
        this.f112791d = ma0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ay1 ay1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveSingSongBannerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.ef efVar = dk2.ef.f233372a;
        boolean z17 = dk2.ef.f233384g;
        com.tencent.mm.plugin.finder.live.plugin.ma0 ma0Var = this.f112791d;
        mm2.m6 m6Var = (mm2.m6) ma0Var.P0(mm2.m6.class);
        r45.z22 a17 = ((mm2.j6) ((kotlinx.coroutines.flow.h3) m6Var.f329251s).getValue()).a();
        java.lang.String str = null;
        if (a17 != null) {
            androidx.lifecycle.j0 j0Var = m6Var.f329244i;
            r45.by1 by1Var = a17.f391631h;
            if (by1Var != null && (ay1Var = by1Var.f371143d) != null) {
                str = ay1Var.f370351e;
            }
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = a17.f391629f;
            j0Var.postValue(new mm2.j7(str, str2 != null ? str2 : ""));
        } else if (z17) {
            sf2.x xVar = (sf2.x) ma0Var.U0(sf2.x.class);
            if (xVar != null) {
                xVar.s7(false);
            }
        } else {
            qo0.c.a(ma0Var.f113479q, qo0.b.f365407r2, null, 2, null);
        }
        if (z17) {
            sf2.x xVar2 = (sf2.x) ma0Var.U0(sf2.x.class);
            if (xVar2 != null) {
                xVar2.c7();
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.z4 z4Var = ml2.z4.f328370p1;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.e1[] e1VarArr = ml2.e1.f327373d;
            jSONObject.put("type", "2");
            zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
        } else {
            te2.a9.g(te2.a9.f417883a, 2, null, null, null, null, ((mm2.m6) ma0Var.P0(mm2.m6.class)).f329248p, 30, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveSingSongBannerPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
