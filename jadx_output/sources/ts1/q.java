package ts1;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final ts1.q f421614a = new ts1.q();

    public final r45.o97 a(java.lang.String webId, java.lang.String str) {
        byte[] j17;
        kotlin.jvm.internal.o.g(webId, "webId");
        ts1.p pVar = ts1.p.f421612a;
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.sdk.platformtools.v3 v3Var = ts1.p.f421613b;
        if (!z17 && !v3Var.m(webId)) {
            webId = "";
            java.lang.String s17 = v3Var.s(str, "");
            if (s17 != null) {
                webId = s17;
            }
        }
        java.lang.Object obj = null;
        if (!(webId.length() > 0)) {
            return null;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) v3Var.d(webId);
        if (o4Var != null && o4Var.f(webId) && (j17 = o4Var.j(webId)) != null) {
            if (!(j17.length == 0)) {
                try {
                    java.lang.Object newInstance = r45.o97.class.newInstance();
                    ((com.tencent.mm.protobuf.f) newInstance).parseFrom(j17);
                    obj = (com.tencent.mm.protobuf.f) newInstance;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e17, "decode ProtoBuffer", new java.lang.Object[0]);
                }
            }
        }
        return (r45.o97) obj;
    }

    public final java.lang.String b(java.lang.String url, java.lang.String str, boolean z17) {
        java.util.List urlQueryList;
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherCacheManager", "getPrefetchInfoId urlQueryKeys: " + str + ", readUrlQueryKeysFromLocal: " + z17);
        if ((str == null || str.length() == 0) || z17) {
            com.tencent.mm.sdk.platformtools.v3 v3Var = ts1.u.f421618a;
            java.util.ArrayList arrayList = null;
            if (!(url.length() == 0)) {
                java.lang.String a17 = ts1.u.a(url);
                if (!(a17.length() == 0)) {
                    java.lang.String s17 = ts1.u.f421618a.s(a17, "");
                    java.lang.String str2 = s17 == null ? "" : s17;
                    if (str2.length() > 0) {
                        java.util.List f07 = r26.n0.f0(str2, new java.lang.String[]{","}, false, 0, 6, null);
                        arrayList = new java.util.ArrayList(kz5.d0.q(f07, 10));
                        java.util.Iterator it = f07.iterator();
                        while (it.hasNext()) {
                            arrayList.add(java.net.URLDecoder.decode((java.lang.String) it.next()));
                        }
                    }
                }
            }
            urlQueryList = arrayList;
        } else {
            urlQueryList = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
        }
        if (urlQueryList == null || urlQueryList.isEmpty()) {
            return "";
        }
        com.tencent.mm.sdk.platformtools.v3 v3Var2 = ts1.u.f421618a;
        kotlin.jvm.internal.o.g(urlQueryList, "urlQueryList");
        if (!urlQueryList.isEmpty()) {
            try {
                android.net.Uri parse = android.net.Uri.parse(url);
                android.net.Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                java.util.Set<java.lang.String> queryParameterNames = parse.getQueryParameterNames();
                kotlin.jvm.internal.o.f(queryParameterNames, "getQueryParameterNames(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : queryParameterNames) {
                    java.lang.String str3 = (java.lang.String) obj;
                    kotlin.jvm.internal.o.d(str3);
                    if ((str3.length() > 0) && urlQueryList.contains(str3)) {
                        arrayList2.add(obj);
                    }
                }
                java.util.List<java.lang.String> D0 = kz5.n0.D0(arrayList2);
                for (java.lang.String str4 : D0) {
                    java.lang.String queryParameter = parse.getQueryParameter(str4);
                    if (queryParameter == null) {
                        queryParameter = "";
                    }
                    clearQuery.appendQueryParameter(str4, queryParameter);
                }
                java.lang.String builder = clearQuery.toString();
                kotlin.jvm.internal.o.f(builder, "toString(...)");
                com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherUrlQueryManager", "filterUrl url: " + url + ", newUrl: " + builder + ", queryKeyList: " + D0);
                url = builder;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebPrefetcherUrlQueryManager", e17, "filterUrl exception", new java.lang.Object[0]);
            }
        }
        return com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.i(url, false);
    }
}
