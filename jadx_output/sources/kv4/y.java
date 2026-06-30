package kv4;

/* loaded from: classes12.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv4.i0 f312749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv4.b0 f312750e;

    public y(rv4.i0 i0Var, kv4.b0 b0Var) {
        this.f312749d = i0Var;
        this.f312750e = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHotSearchLineItem$bindData$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rv4.i0 i0Var = this.f312749d;
        java.lang.String str2 = "";
        if (i0Var.f400501l == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            rv4.p pVar = i0Var.f400494e;
            if (pVar == null || (str = pVar.f400530e) == null) {
                str = "";
            }
            sb6.append(str);
            sb6.append(java.lang.System.currentTimeMillis());
            i0Var.f400501l = sb6.toString();
        }
        rv4.p pVar2 = i0Var.f400494e;
        boolean z17 = true;
        if (pVar2 != null) {
            pVar2.k(vu4.a.f440246p, vu4.b.f440259f, i0Var.f400490a, i0Var.f400495f, pVar2.g(true, i0Var.f400501l, false));
        }
        rv4.p pVar3 = i0Var.f400494e;
        if (pVar3 != null) {
            java.lang.String str3 = i0Var.f400501l;
            java.lang.String docInfo = i0Var.f400495f;
            kotlin.jvm.internal.o.g(docInfo, "docInfo");
            java.lang.String str4 = pVar3.f400530e;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("searchid", str4);
            jSONObject.put("docinfo", fp.s0.b(docInfo, com.tencent.mapsdk.internal.rv.f51270c));
            try {
                java.lang.String g17 = pVar3.g(true, str3, false);
                if (g17.length() <= 0) {
                    z17 = false;
                }
                if (z17) {
                    jSONObject.put("extinfo", fp.s0.b(g17, com.tencent.mapsdk.internal.rv.f51270c));
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FTSGlobalTeachHotSearchData", "getParentsSearchIdInfo error", e17);
            }
            str2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(str2, "toString(...)");
        }
        java.nio.charset.Charset charset = vv5.d.f440550a;
        java.lang.String parentSearchId = "57::::" + java.net.URLEncoder.encode(java.net.URLEncoder.encode(str2, charset.toString()), charset.toString());
        java.lang.String str5 = i0Var.f400493d;
        kv4.m mVar = this.f312750e.f312685b;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        qv4.r0 r0Var = (qv4.r0) mVar;
        r0Var.getClass();
        java.lang.String query = i0Var.f400491b;
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(parentSearchId, "parentSearchId");
        jv4.i iVar = r0Var.f367010d;
        if (iVar != null) {
            jv4.e eVar = (jv4.e) ((jv4.p) iVar).f302262e;
            eVar.getClass();
            eVar.f302235a.i(context, query, 102, parentSearchId, str5);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHotSearchLineItem$bindData$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
