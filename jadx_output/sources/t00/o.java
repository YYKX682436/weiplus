package t00;

/* loaded from: classes9.dex */
public final class o implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414332m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
    
        if (((java.lang.Long) r6.remove(r5)) == null) goto L27;
     */
    @Override // t00.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r5, android.content.Context r6, org.json.JSONObject r7, c00.n3 r8, org.json.JSONObject r9) {
        /*
            r4 = this;
            java.lang.String r5 = "data"
            kotlin.jvm.internal.o.g(r7, r5)
            java.lang.String r6 = "callback"
            kotlin.jvm.internal.o.g(r8, r6)
            org.json.JSONObject r5 = r7.optJSONObject(r5)
            if (r5 != 0) goto L14
            r8.a()
            return
        L14:
            java.lang.String r6 = "stepName"
            java.lang.String r5 = r5.optString(r6)
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L27
            int r9 = r5.length()
            if (r9 != 0) goto L25
            goto L27
        L25:
            r9 = r6
            goto L28
        L27:
            r9 = r7
        L28:
            if (r9 == 0) goto L2e
            r8.a()
            return
        L2e:
            java.lang.Class<c00.v3> r9 = c00.v3.class
            i95.m r0 = i95.n0.c(r9)
            c00.v3 r0 = (c00.v3) r0
            r0.getClass()
            java.lang.String r0 = "ecsExtraFreightPay"
            boolean r0 = kotlin.jvm.internal.o.b(r5, r0)
            if (r0 == 0) goto Lb2
            i95.m r9 = i95.n0.c(r9)
            c00.v3 r9 = (c00.v3) r9
            kotlin.jvm.internal.o.d(r5)
            b00.c0 r9 = (b00.c0) r9
            r9.getClass()
            int r0 = r5.length()
            if (r0 <= 0) goto L56
            r6 = r7
        L56:
            java.lang.String r7 = "Ecs.EcsMonitorService"
            if (r6 == 0) goto La8
            java.util.Map r6 = r9.f16647d
            r9 = r6
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            java.lang.Object r9 = r9.get(r5)
            java.lang.Long r9 = (java.lang.Long) r9
            if (r9 == 0) goto L9e
            long r0 = r9.longValue()
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "endStep stepName = "
            r9.<init>(r0)
            r9.append(r5)
            java.lang.String r0 = ", duration = "
            r9.append(r0)
            r9.append(r2)
            java.lang.String r0 = " ms"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.i(r7, r9)
            com.tencent.wechat.aff.brand_service.a r9 = com.tencent.wechat.aff.brand_service.a.f216045b
            com.tencent.wechat.mm.brand_service.n1 r0 = com.tencent.wechat.mm.brand_service.n1.EcsStepMonitor
            int r1 = (int) r2
            r9.d(r0, r1, r5)
            java.lang.Object r6 = r6.remove(r5)
            java.lang.Long r6 = (java.lang.Long) r6
            if (r6 != 0) goto Lad
        L9e:
            java.lang.String r6 = "endStep called without matching beginStep for stepName = "
            java.lang.String r5 = r6.concat(r5)
            com.tencent.mars.xlog.Log.w(r7, r5)
            goto Lad
        La8:
            java.lang.String r5 = "endStep called with empty stepName"
            com.tencent.mars.xlog.Log.w(r7, r5)
        Lad:
            r5 = 0
            r8.b(r5)
            return
        Lb2:
            r8.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t00.o.c(int, android.content.Context, org.json.JSONObject, c00.n3, org.json.JSONObject):void");
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
