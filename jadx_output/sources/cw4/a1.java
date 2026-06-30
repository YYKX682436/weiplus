package cw4;

/* loaded from: classes8.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.WebViewTransHelper f224194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224195e;

    public a1(com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper, java.lang.String str) {
        this.f224194d = webViewTransHelper;
        this.f224195e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper = this.f224194d;
        if (webViewTransHelper.f181742e != null) {
            cw4.m0 c17 = webViewTransHelper.c();
            java.lang.String str = c17.f224239e;
            java.lang.String content = this.f224195e;
            kotlin.jvm.internal.o.g(content, "content");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            try {
                cl0.g gVar = new cl0.g(content);
                java.lang.String optString = gVar.optString("randomID");
                cw4.o oVar = c17.f224245n;
                if (!kotlin.jvm.internal.o.b(oVar != null ? ((cw4.f1) oVar).f224218a.f181749o : null, optString)) {
                    com.tencent.mars.xlog.Log.e(str, "localRandomID != randomID");
                    return;
                }
                cl0.e eVar = new cl0.e(gVar.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
                if (eVar.length() == 0) {
                    com.tencent.mars.xlog.Log.w(str, "get nothing from webpage!");
                    return;
                }
                int length = eVar.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.String optString2 = eVar.getJSONObject(i17).optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
                    java.lang.String str2 = "";
                    if (optString2 == null) {
                        optString2 = "";
                    }
                    java.lang.String optString3 = eVar.getJSONObject(i17).optString("hashID");
                    if (optString3 == null) {
                        optString3 = "";
                    }
                    java.lang.String optString4 = eVar.getJSONObject(i17).optString("isFirstScreen");
                    if (optString4 == null) {
                        optString4 = "";
                    }
                    java.lang.String optString5 = eVar.getJSONObject(i17).optString("isTitle");
                    if (optString5 != null) {
                        str2 = optString5;
                    }
                    arrayList.add(kz5.c1.k(new jz5.l(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, optString2), new jz5.l("hashID", optString3), new jz5.l("isFirstScreen", optString4), new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, str2)));
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                cw4.o oVar2 = c17.f224245n;
                java.util.Map map = oVar2 != null ? ((cw4.f1) oVar2).f224218a.f181744g : null;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    java.util.Map map2 = (java.util.Map) it.next();
                    cw4.z zVar = new cw4.z();
                    zVar.f224306a = java.lang.String.valueOf(map2.get("hashID"));
                    java.lang.String valueOf = java.lang.String.valueOf(map2.get(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT));
                    zVar.f224307b = valueOf;
                    if (map == null || !map.containsKey(valueOf)) {
                        arrayList2.add(zVar);
                    } else {
                        java.lang.String str3 = zVar.f224307b;
                        kotlin.jvm.internal.o.d(str3);
                        arrayList3.add(kz5.c1.k(new jz5.l("transText", map.get(str3)), new jz5.l("hashCode", zVar.f224306a)));
                    }
                }
                if (arrayList3.size() > 0) {
                    java.lang.String eVar2 = new cl0.e(arrayList3).toString();
                    kotlin.jvm.internal.o.f(eVar2, "toString(...)");
                    c17.e(eVar2);
                }
                if (arrayList2.size() == 0) {
                    com.tencent.mars.xlog.Log.i(str, "all nodes are in cache");
                    return;
                }
                c17.f224246o.setValue(cw4.q0.f224270e);
                cw4.x xVar = c17.f224241g;
                xVar.getClass();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                if (arrayList2.size() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WebTransCgiLogic", "slicePack parameters are wrong!");
                } else {
                    int size = arrayList2.size() / 20;
                    if (arrayList2.size() % 20 > 0) {
                        size++;
                    }
                    for (int i18 = 0; i18 < size; i18++) {
                        int i19 = i18 * 20;
                        int min = java.lang.Math.min(20, arrayList2.size() - i19);
                        cw4.a0 a0Var = new cw4.a0();
                        java.util.List subList = arrayList2.subList(i19, min + i19);
                        kotlin.jvm.internal.o.f(subList, "subList(...)");
                        java.util.Iterator it6 = subList.iterator();
                        while (it6.hasNext()) {
                            a0Var.f224193a.add((cw4.z) it6.next());
                        }
                        linkedList.add(a0Var);
                    }
                }
                xVar.f224293g.addAll(linkedList);
                xVar.a();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(str, xm5.d.a(e17));
            }
        }
    }
}
