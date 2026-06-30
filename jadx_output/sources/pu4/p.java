package pu4;

/* loaded from: classes12.dex */
public class p extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pu4.q f358459b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(pu4.q qVar) {
        super(qVar);
        this.f358459b = qVar;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr) {
        pu4.o oVar = (pu4.o) eVar;
        pu4.q qVar = (pu4.q) gVar;
        com.tencent.mm.plugin.fts.ui.n3.j(oVar.f358458d, this.f358459b.f423761d);
        oVar.f358455a.setTextSize(2, 17.0f);
        com.tencent.mm.plugin.fts.ui.n3.a(qVar.f358461r, oVar.f358455a);
        com.tencent.mm.plugin.fts.ui.n3.c(qVar.f358463t, oVar.f358457c, i65.a.f(context, com.tencent.mm.R.dimen.f479788f9) * i65.a.m(context));
        oVar.f358456b.setTextSize(2, 14.0f);
        com.tencent.mm.plugin.fts.ui.n3.a(qVar.f358462s, oVar.f358456b);
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489114ef5, viewGroup, false);
        pu4.o oVar = this.f358459b.f358467x;
        oVar.f358455a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf);
        oVar.f358456b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.cut);
        oVar.f358457c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o7z);
        oVar.f358458d = inflate.findViewById(com.tencent.mm.R.id.d0v);
        inflate.setTag(oVar);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr) {
        java.lang.String str;
        java.lang.String str2;
        pu4.q qVar = (pu4.q) gVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        p13.y yVar = qVar.f358460q;
        objArr2[0] = yVar != null ? yVar.f351187e : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAIHistoryMessageDataItem", "onItemClick: searchId=%s", objArr2);
        try {
            p13.y yVar2 = qVar.f358460q;
            java.lang.String str3 = "";
            if (yVar2 == null || (str = yVar2.f351190h) == null) {
                str = "";
            }
            if (yVar2 != null && (str2 = yVar2.f351187e) != null) {
                str3 = str2;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("localSearchSid", str3);
            jSONObject.put("titleHighlightKeywords", new org.json.JSONArray((java.util.Collection) qVar.f358464u));
            jSONObject.put("detailHighlightKeywords", new org.json.JSONArray((java.util.Collection) qVar.f358465v));
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("ftsSearchId", o13.p.f342251d);
            jSONObject2.put("pageType", qVar.f423763f);
            jSONObject2.put("boxIndex", qVar.f423766i);
            jSONObject2.put("docIndex", qVar.f423767j);
            jSONObject.put("parentSidExtInfo", jSONObject2);
            su4.j2 j2Var = new su4.j2();
            j2Var.f412938a = context;
            j2Var.f412939b = 4825;
            j2Var.f412941d = str;
            j2Var.f412954q = str;
            j2Var.f412942e = java.lang.String.valueOf(o13.p.f342250c);
            j2Var.f412943f = true;
            j2Var.f412945h = true;
            j2Var.f412946i = true;
            j2Var.f412947j = true;
            j2Var.f412960w = false;
            j2Var.f412944g.put("chatbotExtParams", jSONObject.toString());
            ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FTS.FTSAIHistoryMessageDataItem", e17, "onItemClick jump failed", new java.lang.Object[0]);
        }
        return true;
    }
}
