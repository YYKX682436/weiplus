package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class en extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f134280a = new java.util.HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mn f134281b;

    public en(com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar) {
        this.f134281b = mnVar;
    }

    @Override // ym5.m0
    public boolean a(androidx.recyclerview.widget.k3 k3Var) {
        if (k3Var == null) {
            return false;
        }
        ws5.g gVar = (ws5.g) i95.n0.c(ws5.g.class);
        android.view.View itemView = k3Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        ((wo2.k) gVar).getClass();
        return !dp2.a.f242183a.b(1, itemView, 0.2f);
    }

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        java.lang.String str;
        fc2.q f76;
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = exposedHolders.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.util.HashSet hashSet2 = this.f134280a;
            if (!hasNext) {
                hashSet2.clear();
                hashSet2.addAll(hashSet);
                return;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f293125i;
                so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                if (u1Var != null) {
                    hashSet.add(java.lang.Long.valueOf(u1Var.getItemId()));
                    if (!hashSet2.contains(java.lang.Long.valueOf(u1Var.getItemId()))) {
                        androidx.recyclerview.widget.f2 f2Var = s0Var.f293122f;
                        in5.n0 n0Var = f2Var instanceof in5.n0 ? (in5.n0) f2Var : null;
                        int adapterPosition = s0Var.getAdapterPosition();
                        int a07 = n0Var != null ? adapterPosition - n0Var.a0() : adapterPosition - 1;
                        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
                        com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = this.f134281b;
                        android.app.Activity context = mnVar.getContext();
                        kotlin.jvm.internal.o.g(context, "context");
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("feedid", pm0.v.u(mnVar.f135179d));
                        jSONObject.put("recommend_feedid", pm0.v.u(u1Var.getItemId()));
                        jSONObject.put("recommend_feed_location_id", a07);
                        r45.ru2 flow_card_recommand_reason = u1Var.getFeedObject().getFeedObject().getFlow_card_recommand_reason();
                        if (flow_card_recommand_reason == null || (str = flow_card_recommand_reason.getString(0)) == null) {
                            str = "";
                        }
                        jSONObject.put("recommend_reason", str);
                        jSONObject.put("expose_type", mnVar.f135180e);
                        com.tencent.mm.plugin.finder.report.b6.d(b6Var, V6, "more_recommend_feed", 0, jSONObject, false, null, 48, null);
                        android.app.Activity context2 = mnVar.getContext();
                        kotlin.jvm.internal.o.g(context2, "context");
                        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                        if (nyVar2 != null && (f76 = nyVar2.f7()) != null) {
                            fc2.s sVar = new fc2.s(1);
                            sVar.f260981e = u1Var;
                            f76.a(sVar);
                        }
                    }
                }
            }
        }
    }
}
