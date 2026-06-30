package qd2;

/* loaded from: classes10.dex */
public final class l1 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Context r13, qd2.k1 r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qd2.l1.a(android.content.Context, qd2.k1):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final qd2.k1 b(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qd2.l1.b(java.lang.String):qd2.k1");
    }

    public final qd2.k1 c(java.lang.String str) {
        try {
            java.lang.String simpleMp4InfoVFS = ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getSimpleMp4InfoVFS(str);
            com.tencent.mars.xlog.Log.i("LogPost.FinderSharePostHelper", "get simple mp4 info %s", simpleMp4InfoVFS);
            org.json.JSONObject jSONObject = new org.json.JSONObject(simpleMp4InfoVFS);
            qd2.k1 k1Var = new qd2.k1();
            kotlin.jvm.internal.o.g(str, "<set-?>");
            k1Var.f361787a = str;
            jSONObject.getInt("videoDuration");
            k1Var.f361790d = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT);
            k1Var.f361791e = jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH);
            jSONObject.getInt("videoBitrate");
            jSONObject.getInt("videoFPS");
            ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).getMp4RotateVFS(str);
            k1Var.f361788b = j33.q.a(jSONObject.getString("videoType"));
            k1Var.f361789c = j33.q.a(jSONObject.getString("audioType"));
            return k1Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LogPost.FinderSharePostHelper", e17, "loadItemFromSimpleMP4Info fail", new java.lang.Object[0]);
            return null;
        }
    }
}
