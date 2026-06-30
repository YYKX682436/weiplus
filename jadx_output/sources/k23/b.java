package k23;

/* loaded from: classes12.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.c f303517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k23.c cVar) {
        super(0);
        this.f303517d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        boolean z17 = true;
        java.lang.String j17 = j62.e.g().j("clicfg_fts_search_whole_page_hint_wording_android", "", true, true);
        k23.c cVar = this.f303517d;
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(cVar.f303533a);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(j17);
            kotlin.jvm.internal.o.d(f17);
            str = pv4.a.d(jSONObject, f17);
            if (str == null) {
                str = pv4.a.d(jSONObject, "en");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FTSFloatingRecognizingPanelHintHandler", e17, "parse expt failed", new java.lang.Object[0]);
            str = null;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            str = (java.lang.String) ((jz5.n) cVar.f303534b).getValue();
        }
        com.tencent.mars.xlog.Log.i("FTSFloatingRecognizingPanelHintHandler", "getHint: " + str + " (expt: " + j17 + ", language: " + f17 + ')');
        return str;
    }
}
