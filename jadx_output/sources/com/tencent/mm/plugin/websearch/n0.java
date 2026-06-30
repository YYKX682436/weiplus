package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f181572d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f181573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.q0 f181574f;

    public n0(com.tencent.mm.plugin.websearch.q0 q0Var, com.tencent.mm.plugin.websearch.f0 f0Var) {
        this.f181574f = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List list;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(this.f181572d);
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                com.tencent.mm.protocal.protobuf.TimeLineObject Ai = ((n34.v4) ((p94.s0) i95.n0.c(p94.s0.class))).Ai(jSONArray.getString(i17));
                t90.e eVar = (t90.e) i95.n0.c(t90.e.class);
                gm0.j1.i();
                java.lang.String d17 = gm0.j1.u().d();
                ((s90.e) eVar).getClass();
                b21.r c17 = b21.u.c(d17, Ai, 9, null);
                if (c17 != null) {
                    arrayList.add(c17);
                }
            }
            boolean z17 = this.f181573e;
            com.tencent.mm.plugin.websearch.q0 q0Var = this.f181574f;
            if (!z17 || (list = q0Var.f181599o) == null) {
                q0Var.f181599o = arrayList;
            } else {
                list.addAll(arrayList);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.FTSWebViewLogic", e17, "", new java.lang.Object[0]);
        }
    }
}
