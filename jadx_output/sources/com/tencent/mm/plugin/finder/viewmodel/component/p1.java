package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class p1 extends com.tencent.mm.ui.component.UIComponent implements zy2.s5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f135498d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f135499e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135498d = new java.util.LinkedHashMap();
        this.f135499e = new java.util.LinkedHashMap();
    }

    public final void O6(long j17, java.lang.String step, org.json.JSONObject extraData, long j18) {
        kotlin.jvm.internal.o.g(step, "step");
        kotlin.jvm.internal.o.g(extraData, "extraData");
        com.tencent.mars.xlog.Log.i("Finder.AdTraceUIC", "recordTrace feedId=" + pm0.v.u(j17) + " step=" + step + " extraData=" + extraData);
        java.util.Map map = this.f135498d;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.lang.Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.ArrayList();
            linkedHashMap.put(valueOf, obj);
        }
        ((java.util.List) obj).add(new com.tencent.mm.plugin.finder.viewmodel.component.n1(j17, step, extraData, j18));
    }

    public final void P6(long j17) {
        java.lang.String str;
        java.util.List list = (java.util.List) this.f135498d.remove(java.lang.Long.valueOf(j17));
        if (list == null || com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            return;
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int i17 = 0;
        int i18 = nyVar != null ? nyVar.f135380n : 0;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.plugin.finder.viewmodel.component.j1 j1Var = (com.tencent.mm.plugin.finder.viewmodel.component.j1) com.tencent.mm.plugin.finder.viewmodel.component.m1.f135109d.a().f135112a.get(new com.tencent.mm.plugin.finder.viewmodel.component.k1(j17, i18));
        int i19 = j1Var != null ? j1Var.f134794f : 0;
        if (i19 == 0) {
            str = "None";
        } else if (i19 == 1) {
            str = "Dispatched";
        } else if (i19 == 2) {
            str = "Consumed";
        } else if (i19 == 3) {
            str = "Focused";
        } else if (i19 != 4) {
            str = "Unknown#" + i19;
        } else {
            str = "UnFocused";
        }
        jSONObject.put("status", str);
        long j18 = 0;
        for (java.lang.Object obj : list) {
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.finder.viewmodel.component.n1 n1Var = (com.tencent.mm.plugin.finder.viewmodel.component.n1) obj;
            long j19 = n1Var.f135247d;
            if (j19 != 0) {
                org.json.JSONObject jSONObject2 = n1Var.f135246c;
                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_STEP, i27);
                jSONObject.put(n1Var.f135245b, jSONObject2);
                j18 = j19;
            }
            i17 = i27;
        }
        qc2.b bVar = qc2.b.f361509a;
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        qc2.b.a(bVar, 2, j17, i18, j18, false, "", 0, 0, false, jSONObject3, com.tencent.wcdb.FileUtils.S_IRWXU, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.util.HashMap hashMap = new java.util.HashMap(this.f135498d);
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Long l17 = (java.lang.Long) ((java.util.Map.Entry) it.next()).getKey();
            if (l17 == null || l17.longValue() != 0) {
                kotlin.jvm.internal.o.d(l17);
                P6(l17.longValue());
            }
        }
        hashMap.clear();
    }
}
