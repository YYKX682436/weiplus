package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class v20 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f136198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f136199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.f03 f136200f;

    public v20(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var) {
        this.f136198d = f50Var;
        this.f136199e = jbVar;
        this.f136200f = f03Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.f03 f03Var;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPostBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f136198d;
        zy2.zb.qd(zbVar, 2, ((im2.p4) f50Var.e7()).f292497q.f463009b, ((im2.p4) f50Var.e7()).f292497q.f463010c, null, 8, null);
        zy2.m8 e76 = f50Var.e7();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("POST_BTN_CLICK_SCENE_KEY", 1);
        ((im2.p4) e76).R6(intent);
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        ml2.j0.f327583i.m(ml2.y3.f328270e);
        i95.m c18 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb zbVar2 = (zy2.zb) c18;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar2, 2L, "", null, 4, null);
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f136199e;
        if (jbVar != null && (f03Var = this.f136200f) != null) {
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            androidx.appcompat.app.AppCompatActivity context = f50Var.getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "4", jbVar, f03Var, 2, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N("finderprofile.startlive");
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("FinderEntrance", new int[]{1010});
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().T0("TLPersonalCenter", new int[]{1010});
            c61.ac acVar = (c61.ac) i95.n0.c(c61.ac.class);
            ml2.c1 c1Var2 = ml2.c1.f327325e;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 2);
            r45.vs2 vs2Var = jbVar.field_ctrInfo;
            if (vs2Var == null || (str = vs2Var.f388490h) == null) {
                str = "";
            }
            jSONObject.put("reddot_id", str);
            jSONObject.put(ya.b.SOURCE, 1);
            ((b92.g1) acVar).Ni(60L, jSONObject);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderSelfUIC$initPostBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
