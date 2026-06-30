package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class nd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView f119176d;

    public nd(com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView) {
        this.f119176d = finderLiveDescEditView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.FinderLiveDescEditView finderLiveDescEditView = this.f119176d;
        boolean z17 = finderLiveDescEditView.f117609i;
        fg2.q qVar = finderLiveDescEditView.f117608h;
        if (z17) {
            yz5.l lVar = finderLiveDescEditView.f117606f;
            if (lVar != null) {
                lVar.invoke(new com.tencent.mm.plugin.finder.live.widget.id(true, r26.n0.u0(qVar.f262252f.getText().toString()).toString(), r26.n0.u0(qVar.f262250d.getText().toString()).toString()));
            }
        } else {
            yz5.l lVar2 = finderLiveDescEditView.f117606f;
            if (lVar2 != null) {
                lVar2.invoke(new com.tencent.mm.plugin.finder.live.widget.id(false, r26.n0.u0(qVar.f262250d.getText().toString()).toString(), ""));
            }
        }
        finderLiveDescEditView.a();
        java.lang.String obj = r26.n0.u0((finderLiveDescEditView.f117609i ? qVar.f262252f : qVar.f262250d).getText().toString()).toString();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (obj == null) {
            obj = "";
        }
        java.lang.String b17 = fp.s0.b(obj, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        if (finderLiveDescEditView.fromScene == 1) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("content", b17);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.O = jSONObject2;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            kotlin.jvm.internal.o.d(b17);
            ml2.k5 k5Var = y4Var.T;
            k5Var.getClass();
            k5Var.f327656c = b17;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 8L, jSONObject2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c18;
            ml2.z4 z4Var = ml2.z4.T;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            ml2.e1[] e1VarArr = ml2.e1.f327373d;
            ml2.f1[] f1VarArr = ml2.f1.f327422d;
            jSONObject3.put("type", 3);
            jSONObject3.put("live_version", finderLiveDescEditView.f117609i ? 1 : 0);
            java.lang.String str = finderLiveDescEditView.f117610m;
            if (!(str == null || str.length() == 0)) {
                jSONObject3.put("ai_msg_id", finderLiveDescEditView.f117610m);
            }
            if (finderLiveDescEditView.f117609i) {
                jSONObject3.put("title_before", finderLiveDescEditView.f117611n);
                jSONObject3.put("title_after", r26.n0.u0(qVar.f262252f.getText().toString()).toString());
                jSONObject3.put("describe_before", finderLiveDescEditView.f117612o);
                jSONObject3.put("describe_after", r26.n0.u0(qVar.f262250d.getText().toString()).toString());
            } else {
                jSONObject3.put("title_before", finderLiveDescEditView.f117612o);
                jSONObject3.put("title_after", r26.n0.u0(qVar.f262250d.getText().toString()).toString());
                jSONObject3.put("describe_before", "");
                jSONObject3.put("describe_after", "");
            }
            zy2.zb.y6(zbVar2, z4Var, jSONObject3.toString(), null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
