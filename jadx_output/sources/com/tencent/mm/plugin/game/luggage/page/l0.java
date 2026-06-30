package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139920d;

    public l0(com.tencent.mm.plugin.game.luggage.page.x0 x0Var) {
        this.f139920d = x0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            com.tencent.mm.plugin.game.luggage.page.x0 r0 = r8.f139920d
            com.tencent.mm.plugin.webview.luggage.y1 r1 = r0.f182186t
            r2 = 0
            java.lang.String r3 = "MicroMsg.GameWebPage"
            if (r1 == 0) goto L2b
            int r1 = r1.getTopBarHeight()
            int r1 = ik1.w.e(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r4 = "javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gameTopBarHeight__= %d; })()"
            java.lang.String r1 = java.lang.String.format(r4, r1)
            java.lang.String r4 = "gameTopHeight:%s"
            java.lang.Object[] r5 = new java.lang.Object[]{r1}
            com.tencent.mars.xlog.Log.i(r3, r4, r5)
            r0.o(r1, r2)
        L2b:
            java.lang.String r1 = r0.O()
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L38
            goto L3f
        L38:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3f
            r4.<init>(r1)     // Catch: org.json.JSONException -> L3f
            r4 = r5
            goto L40
        L3f:
            r4 = r6
        L40:
            if (r4 == 0) goto L61
            java.lang.String r4 = "javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__gamePreInjectData__= %s; })()"
            java.lang.Object[] r7 = new java.lang.Object[]{r1}
            java.lang.String r4 = java.lang.String.format(r4, r7)
            byte[] r1 = r1.getBytes()
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r7 = "preInjectData, size:%d"
            com.tencent.mars.xlog.Log.i(r3, r7, r1)
            r0.o(r4, r2)
        L61:
            java.lang.String r1 = "game_liteapp_pass_data"
            android.os.Bundle r4 = r0.f406657n
            java.lang.String r1 = r4.getString(r1)
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r4 == 0) goto L70
            goto L76
        L70:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L76
            r4.<init>(r1)     // Catch: org.json.JSONException -> L76
            goto L77
        L76:
            r5 = r6
        L77:
            if (r5 == 0) goto L98
            java.lang.String r4 = "javascript:(function(){ window.wgclient = window.wgclient || {}; window.wgclient.__passbyData__= %s; })()"
            java.lang.Object[] r5 = new java.lang.Object[]{r1}
            java.lang.String r4 = java.lang.String.format(r4, r5)
            byte[] r1 = r1.getBytes()
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r5 = "liteAppPassByData, size:%d"
            com.tencent.mars.xlog.Log.i(r3, r5, r1)
            r0.o(r4, r2)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.page.l0.run():void");
    }
}
