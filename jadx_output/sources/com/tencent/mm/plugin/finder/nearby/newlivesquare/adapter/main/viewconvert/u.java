package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.v f121964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.le1 f121965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ue1 f121966f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121967g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vp2.g f121968h;

    public u(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.v vVar, r45.le1 le1Var, r45.ue1 ue1Var, in5.s0 s0Var, vp2.g gVar) {
        this.f121964d = vVar;
        this.f121965e = le1Var;
        this.f121966f = ue1Var;
        this.f121967g = s0Var;
        this.f121968h = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.k74 lite_app_info;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardProductItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f121965e.C;
        r45.ue1 ue1Var = this.f121966f;
        java.lang.String str = ue1Var.f387295h;
        java.lang.String str2 = "";
        if (str == null) {
            str = "";
        }
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.v vVar = this.f121964d;
        vVar.getClass();
        if (finderJumpInfo != null && (lite_app_info = finderJumpInfo.getLite_app_info()) != null && (string = lite_app_info.getString(2)) != null) {
            str2 = string;
        }
        try {
            org.json.JSONObject jSONObject = str2.length() > 0 ? new org.json.JSONObject(str2) : new org.json.JSONObject();
            jSONObject.put("jump_bypass_buffer", str);
            r45.k74 lite_app_info2 = finderJumpInfo != null ? finderJumpInfo.getLite_app_info() : null;
            if (lite_app_info2 != null) {
                lite_app_info2.set(2, jSONObject.toString());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(vVar.f121979g, e17, "addBufferToQuery ", new java.lang.Object[0]);
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        in5.s0 s0Var = this.f121967g;
        android.content.Context context = s0Var.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.ac4 ac4Var = new r45.ac4();
        ac4Var.set(1, this.f121968h.f438922e.C);
        ac4Var.set(4, 1);
        c61.yb.Yi(ybVar, context, ac4Var, null, null, 8, null);
        android.content.Context context2 = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        vVar.getClass();
        pf5.z zVar = pf5.z.f353948a;
        boolean z17 = context2 instanceof androidx.appcompat.app.AppCompatActivity;
        if (!z17) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context2;
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.putOpt("topic_id", vVar.f121977e);
        java.util.LinkedList product_item = ue1Var.f387293f;
        kotlin.jvm.internal.o.f(product_item, "product_item");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(product_item, 10));
        java.util.Iterator it = product_item.iterator();
        while (it.hasNext()) {
            arrayList2.add(java.lang.Long.valueOf(((r45.te1) it.next()).f386349i));
        }
        jSONObject2.put("product_id_list", kz5.n0.g0(arrayList2, "#", null, null, 0, null, null, 62, null));
        java.lang.String jSONObject3 = jSONObject2.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject3, ",", ";", false);
        pf5.z zVar2 = pf5.z.f353948a;
        if (!z17) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rq2.w wVar = (rq2.w) zVar2.a(appCompatActivity).a(rq2.w.class);
        if (wVar != null) {
            wVar.Q6(V6.getString(1), "main_page_topic_card", t17);
        }
        com.tencent.mars.xlog.Log.i(vVar.f121979g, "report click with json ".concat(t17));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardProductItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
