package com.tencent.mm.plugin.lite.jsapi.comms;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/q;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "com/tencent/mm/plugin/lite/jsapi/comms/l", "com/tencent/mm/plugin/lite/jsapi/comms/m", "com/tencent/mm/plugin/lite/jsapi/comms/n", "com/tencent/mm/plugin/lite/jsapi/comms/o", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class q extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f143720g;

    static {
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        f143720g = lp0.b.h0("liteappjsapi_addfiletofavorites");
    }

    public final void A(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        java.lang.String str6;
        r45.bq0 bq0Var;
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
        if (str3 == null) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str7 = a17.f213279f;
            if (str7 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str7, false, false);
                if (!str7.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            java.lang.String str8 = a17.f213279f;
            int lastIndexOf = str8.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str8 = str8.substring(lastIndexOf + 1);
            }
            kotlin.jvm.internal.o.f(str8, "getName(...)");
            str6 = str8;
        } else {
            str6 = str3;
        }
        java.lang.String str9 = str4 == null ? "" : str4;
        ((com.tencent.mm.pluginsdk.model.b2) c5Var).getClass();
        com.tencent.mm.pluginsdk.model.a2.k(doFavoriteEvent, 37, str, str6, str9, str5);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        r45.jq0 jq0Var = (c4Var == null || (bq0Var = c4Var.f6315a) == null) ? null : bq0Var.f370962d;
        if (jq0Var != null) {
            jq0Var.i("c2c_file_preview_" + str2);
        }
        doFavoriteEvent.e();
        am.d4 d4Var = doFavoriteEvent.f54091h;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiAddFileToFavorites", "addFileToFavorites, ret: " + (d4Var != null ? java.lang.Integer.valueOf(d4Var.f6433a) : null));
    }

    public final void B(java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.lite.jsapi.comms.n nVar = (com.tencent.mm.plugin.lite.jsapi.comms.n) it.next();
            java.lang.String str = nVar.f143686a;
            byte[] bytes = (nVar.f143686a + nVar.f143687b).getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            java.lang.String g17 = kk.k.g(bytes);
            kotlin.jvm.internal.o.f(g17, "getMessageDigest(...)");
            java.lang.String str2 = nVar.f143687b;
            A(str, g17, str2, nVar.f143688c, com.tencent.mm.vfs.w6.n(str2));
        }
    }

    public final java.lang.Integer C(com.tencent.mm.storage.f9 f9Var, android.app.Activity activity) {
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
        com.tencent.mm.pluginsdk.model.a2.j(doFavoriteEvent, f9Var, false);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (c4Var != null) {
            c4Var.f6323i = activity;
        }
        doFavoriteEvent.e();
        am.d4 d4Var = doFavoriteEvent.f54091h;
        java.lang.Integer valueOf = d4Var != null ? java.lang.Integer.valueOf(d4Var.f6433a) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiAddFileToFavorites", "addMessageToFavorites, ret: " + valueOf);
        return valueOf;
    }

    public final void D(java.util.List list) {
        e40.c0 c0Var = (e40.c0) i95.n0.c(e40.c0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.lite.jsapi.comms.o oVar = (com.tencent.mm.plugin.lite.jsapi.comms.o) it.next();
            arrayList.add(new e40.y(oVar.f143694a, oVar.f143695b, oVar.f143698e, oVar.f143696c, oVar.f143697d, 0L, 32, null));
        }
        ((d40.t) c0Var).Zi(arrayList, new com.tencent.mm.plugin.lite.jsapi.comms.p(this, list));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[Catch: Exception -> 0x01da, TryCatch #0 {Exception -> 0x01da, blocks: (B:3:0x0011, B:6:0x001f, B:8:0x0029, B:13:0x0035, B:15:0x0050, B:17:0x0058, B:18:0x005d, B:22:0x0092, B:23:0x009d, B:25:0x009e, B:27:0x00a4, B:28:0x00b2, B:31:0x00b9, B:34:0x00c7, B:36:0x00d7, B:38:0x0115, B:39:0x011b, B:41:0x0125, B:43:0x0135, B:45:0x0166, B:47:0x017c, B:51:0x0184, B:53:0x0197, B:55:0x01b7, B:59:0x00a9), top: B:2:0x0011 }] */
    @Override // jd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r26, org.json.JSONObject r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.jsapi.comms.q.a(java.lang.String, org.json.JSONObject, boolean):void");
    }
}
