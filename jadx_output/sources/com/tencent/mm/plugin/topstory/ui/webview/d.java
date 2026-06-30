package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes8.dex */
public class d implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.webview.j f175184d;

    public d(com.tencent.mm.plugin.topstory.ui.webview.j jVar) {
        this.f175184d = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r6, int r7, java.lang.String r8, com.tencent.mm.modelbase.m1 r9) {
        /*
            r5 = this;
            com.tencent.mm.plugin.topstory.ui.webview.j r0 = r5.f175184d
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "retCode"
            r1.put(r2, r7)     // Catch: org.json.JSONException -> L5d
            java.lang.String r2 = "errMsg"
            r1.put(r2, r8)     // Catch: org.json.JSONException -> L5d
            if (r6 != 0) goto L42
            if (r7 == 0) goto L17
            goto L42
        L17:
            aw4.q r6 = r0.f14844d     // Catch: org.json.JSONException -> L5d
            com.tencent.mm.plugin.topstory.ui.home.a r6 = (com.tencent.mm.plugin.topstory.ui.home.a) r6     // Catch: org.json.JSONException -> L5d
            if (r6 == 0) goto L5d
            r6 = r9
            sm4.f r6 = (sm4.f) r6     // Catch: org.json.JSONException -> L5d
            com.tencent.mm.modelbase.o r6 = r6.f409938e     // Catch: org.json.JSONException -> L5d
            com.tencent.mm.modelbase.n r6 = r6.f70711b     // Catch: org.json.JSONException -> L5d
            com.tencent.mm.protobuf.f r6 = r6.f70700a     // Catch: org.json.JSONException -> L5d
            r45.ln6 r6 = (r45.ln6) r6     // Catch: org.json.JSONException -> L5d
            java.lang.String r6 = r6.f379667d     // Catch: org.json.JSONException -> L5d
            sm4.f r9 = (sm4.f) r9     // Catch: org.json.JSONException -> L5d
            com.tencent.mm.modelbase.o r7 = r9.f409938e     // Catch: org.json.JSONException -> L5d
            com.tencent.mm.modelbase.n r7 = r7.f70711b     // Catch: org.json.JSONException -> L5d
            com.tencent.mm.protobuf.f r7 = r7.f70700a     // Catch: org.json.JSONException -> L5d
            r45.ln6 r7 = (r45.ln6) r7     // Catch: org.json.JSONException -> L5d
            java.lang.String r7 = r7.f379668e     // Catch: org.json.JSONException -> L5d
            java.lang.String r8 = "commentId"
            r1.put(r8, r6)     // Catch: org.json.JSONException -> L5d
            java.lang.String r6 = "requestId"
            r1.put(r6, r7)     // Catch: org.json.JSONException -> L5d
            goto L5d
        L42:
            java.lang.String r9 = "MicroMsg.TopStory.TopStoryWebData"
            java.lang.String r2 = "NetSceneTopStoryPostComment response, errType:%s, errCode:%s, errMsg:%s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: org.json.JSONException -> L5d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: org.json.JSONException -> L5d
            r4 = 0
            r3[r4] = r6     // Catch: org.json.JSONException -> L5d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: org.json.JSONException -> L5d
            r7 = 1
            r3[r7] = r6     // Catch: org.json.JSONException -> L5d
            r6 = 2
            r3[r6] = r8     // Catch: org.json.JSONException -> L5d
            com.tencent.mars.xlog.Log.w(r9, r2, r3)     // Catch: org.json.JSONException -> L5d
        L5d:
            aw4.q r6 = r0.f14844d
            com.tencent.mm.plugin.topstory.ui.home.a r6 = (com.tencent.mm.plugin.topstory.ui.home.a) r6
            if (r6 == 0) goto L76
            java.lang.String r7 = r1.toString()
            com.tencent.mm.plugin.topstory.ui.home.j r6 = (com.tencent.mm.plugin.topstory.ui.home.j) r6
            com.tencent.mm.plugin.topstory.ui.webview.l r6 = r6.f174993m
            r6.getClass()
            com.tencent.mm.plugin.topstory.ui.webview.m0 r8 = new com.tencent.mm.plugin.topstory.ui.webview.m0
            r8.<init>(r6, r7)
            com.tencent.mm.sdk.platformtools.u3.h(r8)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.topstory.ui.webview.d.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}
