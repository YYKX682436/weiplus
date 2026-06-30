package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.f0 f138263d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.fts.ui.widget.f0 f0Var) {
        super(0);
        this.f138263d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        com.tencent.mm.plugin.fts.ui.widget.f0 f0Var = this.f138263d;
        boolean g17 = com.tencent.mm.plugin.fts.ui.n3.g(f0Var.f138266a);
        jz5.g gVar = f0Var.f138267b;
        if (!g17 || !com.tencent.mm.plugin.fts.ui.n3.h()) {
            java.lang.String str2 = (java.lang.String) ((jz5.n) gVar).getValue();
            kotlin.jvm.internal.o.f(str2, "access$getDefaultHint(...)");
            return str2;
        }
        boolean z17 = true;
        java.lang.String a17 = j62.e.g().a("clicfg_fts_guide_page_search_bar_hint_android", "", true, true);
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(f0Var.f138266a);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(a17);
            kotlin.jvm.internal.o.d(f17);
            str = pv4.a.d(jSONObject, f17);
            if (str == null) {
                str = pv4.a.d(jSONObject, "en");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FTSGuidePageSearchBarHint", e17, "parse expt failed", new java.lang.Object[0]);
            str = null;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            str = (java.lang.String) ((jz5.n) gVar).getValue();
        }
        com.tencent.mars.xlog.Log.i("FTSGuidePageSearchBarHint", "getHint: " + str + " (expt: " + a17 + ", language: " + f17 + ')');
        return str;
    }
}
