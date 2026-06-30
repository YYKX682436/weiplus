package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class m3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f119028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f119029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f119030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f119031g;

    public m3(com.tencent.mm.plugin.finder.live.widget.b4 b4Var, r45.h32 h32Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject, android.widget.TextView textView) {
        this.f119028d = b4Var;
        this.f119029e = h32Var;
        this.f119030f = finderObject;
        this.f119031g = textView;
    }

    public static final void a(java.lang.String str, com.tencent.mm.plugin.finder.live.widget.b4 b4Var, r45.h32 h32Var, android.widget.TextView textView, r45.h32 h32Var2, int i17) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
        java.lang.String string = h32Var2.getString(4);
        if (string == null) {
            string = "";
        }
        r45.h32 e17 = i1Var.e(str, string);
        if (e17 != null) {
            e17.set(1, java.lang.Integer.valueOf(h32Var2.getInteger(1)));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String string2 = h32Var2.getString(4);
            i1Var.a(str, string2 != null ? string2 : "", h32Var2);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3 t3Var = vd2.t3.f435921a;
        ml2.q1 q1Var = ml2.q1.f327812e;
        java.lang.String l17 = t3Var.l("temp_30", -1, null, null, null);
        java.lang.String string3 = h32Var2.getString(4);
        kotlin.jvm.internal.o.d(string3);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = b4Var.f117821b.Y().f410651f;
        gm0.j1.d().g(new db2.e5(str, string3, i17, null, null, 102, java.lang.Long.valueOf(finderObject != null ? finderObject.getId() : -1L), null, l17, null, null, null, null, null, 16016, null));
        h32Var2.set(1, java.lang.Integer.valueOf(h32Var2.getInteger(1)));
        com.tencent.mm.plugin.finder.live.widget.b4.a(h32Var, textView, b4Var);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.nw1 liveInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterNextLiveInfoWidget$bindNextLiveNotice$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.f119028d;
        java.lang.String str = b4Var.f117821b.Y().f410646a;
        r45.h32 h32Var = this.f119029e;
        if (h32Var.getInteger(1) == 1) {
            h32Var.set(1, 0);
            db5.t7.m(b4Var.f117820a.getContext(), b4Var.f117820a.getContext().getString(com.tencent.mm.R.string.e0j));
            com.tencent.mm.plugin.finder.live.widget.b4 b4Var2 = this.f119028d;
            r45.h32 h32Var2 = this.f119029e;
            a(str, b4Var2, h32Var2, this.f119031g, h32Var2, 1);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c50.c1 c1Var = (c50.c1) c17;
            ml2.i5 i5Var = ml2.i5.f327571f;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f119030f;
            long j17 = (finderObject == null || (liveInfo = finderObject.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0);
            ml2.q1 q1Var = ml2.q1.f327812e;
            java.lang.String string = h32Var.getString(3);
            if (string == null) {
                string = "";
            }
            java.lang.String str2 = string;
            java.lang.String string2 = h32Var.getString(4);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("notice_type", 1);
            c50.c1.l9(c1Var, i5Var, str, j17, 0, "temp_30", null, null, null, null, str2, null, string2, jSONObject.toString(), 0L, 0, null, 58848, null);
        } else {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(b4Var.f117820a.getContext(), 1, true);
            k0Var.t(true);
            com.tencent.mm.plugin.finder.live.widget.b4 b4Var3 = this.f119028d;
            k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.k3(b4Var3);
            k0Var.f211881s = new com.tencent.mm.plugin.finder.live.widget.l3(this.f119029e, str, this.f119030f, b4Var3, this.f119031g);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterNextLiveInfoWidget$bindNextLiveNotice$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
