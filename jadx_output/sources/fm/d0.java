package fm;

@j95.b(dependencies = {com.tencent.mm.udr.e0.class})
/* loaded from: classes13.dex */
public final class d0 extends i95.w {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mm.vfs.r6[] G;
        com.tencent.mm.vfs.r6[] G2;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        if (c06.e.f37716d.e(1, 101) <= 2 && !com.tencent.mm.sdk.platformtools.a0.c()) {
            com.tencent.wechat.aff.udr.w Zi = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Zi("ilinkres_9f0a6b36");
            com.tencent.mm.autogen.mmdata.rpt.MMBaseStringResourceLoadStruct mMBaseStringResourceLoadStruct = new com.tencent.mm.autogen.mmdata.rpt.MMBaseStringResourceLoadStruct();
            mMBaseStringResourceLoadStruct.f58773d = gm0.j1.b().n() ? 1 : 0;
            mMBaseStringResourceLoadStruct.f58774e = mMBaseStringResourceLoadStruct.b("userLanguage", com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a), true);
            mMBaseStringResourceLoadStruct.f58775f = mMBaseStringResourceLoadStruct.b("systemLanguage", com.tencent.mm.sdk.platformtools.m2.f192848b.toString(), true);
            mMBaseStringResourceLoadStruct.f58778i = mMBaseStringResourceLoadStruct.b("curResVersion", "96b2c56e4056b923191227d71602c0ce", true);
            fm.a[] aVarArr = fm.a.f263961d;
            mMBaseStringResourceLoadStruct.f58776g = 3;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("preloadListSize", (Zi == null || (linkedList2 = Zi.f217586d) == null) ? 0 : linkedList2.size());
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (Zi != null && (linkedList = Zi.f217586d) != null) {
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((com.tencent.wechat.aff.udr.x) it.next()).getName());
                }
            }
            jSONObject.put("preloadListName", jSONArray);
            k65.l lVar = k65.l.f304617a;
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            try {
                com.tencent.mm.vfs.r6 r6Var = j65.b.f297918g;
                if (r6Var.m() && (G = r6Var.G()) != null) {
                    java.util.Iterator a17 = kotlin.jvm.internal.c.a(G);
                    while (true) {
                        kotlin.jvm.internal.b bVar = (kotlin.jvm.internal.b) a17;
                        if (!bVar.hasNext()) {
                            break;
                        }
                        com.tencent.mm.vfs.r6 r6Var2 = (com.tencent.mm.vfs.r6) bVar.next();
                        if (r6Var2.y() && (G2 = r6Var2.G()) != null) {
                            if ((G2.length == 0) ^ true) {
                                jSONArray2.put(r6Var2.getName());
                            }
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMBaseStringConstant", th6, "getLocalResourceFileList", new java.lang.Object[0]);
            }
            jSONObject.put("localUnCompressResourceList", jSONArray2);
            jSONObject.put("localUnCompressResource", !j65.b.g(com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a)) ? 1 : 0);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            mMBaseStringResourceLoadStruct.p(r26.i0.t(jSONObject2, ",", ";", false));
            com.tencent.mars.xlog.Log.i("MMBaseStringResFeatureService", "onAccountInitialized report coverage, struct: " + mMBaseStringResourceLoadStruct.n());
            mMBaseStringResourceLoadStruct.k();
        }
        ((ku5.t0) ku5.t0.f312615d).g(fm.c0.f263975d);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("MMBaseStringResFeatureService", "onCreate");
    }
}
