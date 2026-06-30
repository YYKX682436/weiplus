package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f181474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f181475f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ su4.j1 f181476g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.d2 f181477h;

    public c2(com.tencent.mm.plugin.websearch.d2 d2Var, int i17, java.lang.Object obj, java.lang.Object obj2, su4.j1 j1Var) {
        this.f181477h = d2Var;
        this.f181473d = i17;
        this.f181474e = obj;
        this.f181475f = obj2;
        this.f181476g = j1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f181473d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object obj = this.f181474e;
        java.lang.Object obj2 = this.f181475f;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PGetController", "step_cgiEnd type:%s reqTag:%s cgiResult:%s", valueOf, obj, obj2);
        com.tencent.mm.plugin.websearch.d2 d2Var = this.f181477h;
        su4.d2 d2Var2 = (su4.d2) ((java.util.Map) ((java.util.ArrayList) d2Var.f181494b).get(i17)).get(obj);
        if (d2Var2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.PGetController", "step_cgiEnd weird null");
            return;
        }
        d2Var2.f412856e = obj2;
        d2Var2.f412854c = true;
        if (d2Var2.f412853b) {
            su4.j1 j1Var = this.f181476g;
            if (j1Var != null) {
                j1Var.a(d2Var2);
            }
            ((java.util.Map) ((java.util.ArrayList) d2Var.f181494b).get(i17)).remove(obj);
        }
    }
}
