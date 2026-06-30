package o25;

/* loaded from: classes8.dex */
public final class r {
    public r(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(21:137|138|139|(18:141|142|143|144|145|(12:147|148|149|150|151|152|153|154|(1:156)|157|158|159)|167|148|149|150|151|152|153|154|(0)|157|158|159)|171|143|144|145|(0)|167|148|149|150|151|152|153|154|(0)|157|158|159) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x066a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x066b, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.StartWebSearchService", r0, "extParams package failed", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0629, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x062a, code lost:
    
        r17 = r3;
        r25 = r11;
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.StartWebSearchService", r0, "openSdkBypassInfo json parse failed", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x05ed, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x05ee, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.StartWebSearchService", r0, "bypassInfo json parse failed", new java.lang.Object[0]);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0047. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:147:0x05d0 A[Catch: JSONException -> 0x05ed, TRY_LEAVE, TryCatch #9 {JSONException -> 0x05ed, blocks: (B:145:0x05ca, B:147:0x05d0), top: B:144:0x05ca }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0655  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o25.r.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public final void b(java.lang.String businessType, java.lang.String str, java.lang.String str2, int i17) {
        kotlin.jvm.internal.o.g(businessType, "businessType");
        try {
            cl0.g gVar = new cl0.g(str2);
            long E1 = com.tencent.mm.sdk.platformtools.t8.E1(gVar.optString("canvasId"));
            java.lang.String optString = gVar.optString("uxInfo");
            boolean z17 = gVar.optInt("videoMuted") == 0;
            java.lang.String optString2 = gVar.optString("canvasDynamicInfo");
            boolean z18 = gVar.optInt("forbidBackToBizApp") == 1;
            boolean z19 = z17;
            long optLong = gVar.optLong("outPlaybackTimeMs");
            java.lang.String wi6 = ((ee0.z3) ((fe0.y3) i95.n0.c(fe0.y3.class))).wi(E1, str, optString);
            if (i17 == 1) {
                ((ee0.z3) ((fe0.y3) i95.n0.c(fe0.y3.class))).Ai(wi6, 23);
            } else {
                ((ee0.z3) ((fe0.y3) i95.n0.c(fe0.y3.class))).Ai(wi6, 3);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BusinessViewHandler", "handleOpenAdCanvas, appid=" + str + ", bType=" + businessType + ", extInfo=" + str2);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) && E1 != 0) {
                p94.v0 v0Var = new p94.v0();
                v0Var.f352917e = 29;
                v0Var.f352919g = optString2;
                v0Var.f352918f = wi6;
                v0Var.f352920h = z19;
                v0Var.f352923k = z18;
                v0Var.f352924l = optLong;
                ((p34.t) ((p94.g0) i95.n0.c(p94.g0.class))).wi(null, E1, optString, v0Var);
                if (i17 == 1) {
                    ((ee0.z3) ((fe0.y3) i95.n0.c(fe0.y3.class))).Ai(wi6, 24);
                } else {
                    ((ee0.z3) ((fe0.y3) i95.n0.c(fe0.y3.class))).Ai(wi6, 4);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BusinessViewHandler", "handleOpenAdCanvas ex " + e17.getMessage());
        }
    }
}
