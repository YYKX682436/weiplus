package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ud extends ym5.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f124265a = new java.util.HashSet();

    @Override // ym5.m0
    public boolean d() {
        return true;
    }

    @Override // ym5.m0
    public void e(android.view.View parent, java.util.List exposedHolders) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(exposedHolders, "exposedHolders");
        java.util.Iterator it = exposedHolders.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
            if (s0Var != null) {
                java.lang.Object obj = s0Var.f293125i;
                so2.q2 q2Var = obj instanceof so2.q2 ? (so2.q2) obj : null;
                if (q2Var != null) {
                    java.util.HashSet hashSet = this.f124265a;
                    if (!hashSet.contains(java.lang.Long.valueOf(q2Var.m2()))) {
                        hashSet.add(java.lang.Long.valueOf(q2Var.m2()));
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("object_id", pm0.v.u(q2Var.m2()));
                        jSONObject.put("page_type", com.google.android.gms.common.Scopes.PROFILE);
                        if (q2Var.q2()) {
                            jSONObject.put("object_type", 1);
                        } else {
                            jSONObject.put("object_type", 2);
                        }
                        zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                        ml2.o3[] o3VarArr = ml2.o3.f327773d;
                        java.lang.String jSONObject2 = jSONObject.toString();
                        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                        ((ml2.j0) zbVar).Wj("watch_live_expose", jSONObject2);
                    }
                }
            }
        }
    }
}
