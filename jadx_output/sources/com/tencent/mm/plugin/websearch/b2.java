package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f181466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f181467f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f181468g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ su4.j1 f181469h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.d2 f181470i;

    public b2(com.tencent.mm.plugin.websearch.d2 d2Var, int i17, java.lang.Object obj, java.lang.Object obj2, java.lang.Runnable runnable, su4.j1 j1Var) {
        this.f181470i = d2Var;
        this.f181465d = i17;
        this.f181466e = obj;
        this.f181467f = obj2;
        this.f181468g = runnable;
        this.f181469h = j1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f181465d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object obj = this.f181466e;
        java.lang.Object obj2 = this.f181467f;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PGetController", "step_getJsApi type:%s, reqTag:%s, jsParams:%s", valueOf, obj, obj2);
        com.tencent.mm.plugin.websearch.d2 d2Var = this.f181470i;
        su4.d2 d2Var2 = (su4.d2) ((java.util.Map) ((java.util.ArrayList) d2Var.f181494b).get(i17)).get(obj);
        if (d2Var2 == null) {
            d2Var2 = new su4.d2();
            ((java.util.Map) ((java.util.ArrayList) d2Var.f181494b).get(i17)).put(obj, d2Var2);
        }
        d2Var2.f412853b = true;
        if (d2Var2.f412855d != null) {
            d2Var2.f412857f = obj2;
        } else {
            d2Var2.f412855d = obj2;
        }
        if (!d2Var2.f412852a) {
            this.f181468g.run();
            d2Var.c(i17, obj);
        } else if (d2Var2.f412854c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PGetController", "step_getJsApi preget hit type:%s, reqTag:%s, jsParams:%s", java.lang.Integer.valueOf(i17), obj, obj2);
            su4.j1 j1Var = this.f181469h;
            if (j1Var != null) {
                j1Var.a(d2Var2);
            }
            ((java.util.Map) ((java.util.ArrayList) d2Var.f181494b).get(i17)).remove(obj);
        }
    }
}
