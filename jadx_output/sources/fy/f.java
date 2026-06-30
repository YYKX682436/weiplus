package fy;

/* loaded from: classes.dex */
public final class f implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f267167d;

    public f(yz5.l lVar) {
        this.f267167d = lVar;
    }

    @Override // o13.x
    public final void X2(p13.v vVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSearchResult ");
        sb6.append(vVar.f351158c == 0);
        sb6.append(" count ");
        sb6.append(vVar.f351160e.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.FunctionCall", sb6.toString());
        java.util.List resultList = vVar.f351160e;
        kotlin.jvm.internal.o.f(resultList, "resultList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(resultList, 10));
        java.util.Iterator it = resultList.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(((p13.y) it.next()).f351187e, true));
        }
        java.util.ArrayList<com.tencent.mm.storage.z3> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) obj;
            if (z3Var.r2() && !fy.i.c(fy.i.f267170b, z3Var)) {
                arrayList2.add(obj);
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.SUCCESS, true);
        jSONObject.put("total_count", arrayList2.size());
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (com.tencent.mm.storage.z3 z3Var2 : arrayList2) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("chat_id", z3Var2.d1());
            jSONObject2.put("nickname", z3Var2.P0());
            jSONObject2.put("remark", z3Var2.w0());
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("chat_list", jSONArray);
        this.f267167d.invoke(jSONObject);
    }
}
