package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181439d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f181440e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.d2 f181441f;

    public a2(com.tencent.mm.plugin.websearch.d2 d2Var, int i17, java.lang.Object obj) {
        this.f181441f = d2Var;
        this.f181439d = i17;
        this.f181440e = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f181439d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object obj = this.f181440e;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.PGetController", "step_doCgiReq type:%s, reqTag:%s", valueOf, obj);
        com.tencent.mm.plugin.websearch.d2 d2Var = this.f181441f;
        su4.d2 d2Var2 = (su4.d2) ((java.util.Map) ((java.util.ArrayList) d2Var.f181494b).get(i17)).get(obj);
        if (d2Var2 == null) {
            d2Var2 = new su4.d2();
            ((java.util.Map) ((java.util.ArrayList) d2Var.f181494b).get(i17)).put(obj, d2Var2);
        }
        d2Var2.f412852a = true;
    }
}
