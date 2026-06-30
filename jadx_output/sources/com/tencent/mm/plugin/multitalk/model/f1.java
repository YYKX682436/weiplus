package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes13.dex */
public class f1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.v0 f149952a;

    public f1(com.tencent.mm.plugin.multitalk.model.v0 v0Var) {
        this.f149952a = v0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:9|(4:11|(1:13)(2:20|(1:22)(1:23))|14|(2:16|17)(2:18|19))|25|26|27|(5:32|(1:34)(3:37|(1:39)|44)|35|14|(0)(0))|41|35|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r5.equals("OFFHOOK") != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.PhoneStatusWatcher", "getCallingState failed %s,", r6.fillInStackTrace());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c7  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            com.tencent.mm.plugin.multitalk.model.v0 r5 = r4.f149952a
            boolean r0 = r5.x()
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.String r0 = r6.getAction()
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L29
            com.tencent.mm.sdk.platformtools.n3 r6 = r5.A1
            r0 = 0
            r6.removeCallbacksAndMessages(r0)
            com.tencent.mm.sdk.platformtools.n3 r5 = r5.A1
            com.tencent.mm.plugin.multitalk.model.c1 r6 = new com.tencent.mm.plugin.multitalk.model.c1
            r6.<init>(r4)
            r0 = 8000(0x1f40, double:3.9525E-320)
            r5.postDelayed(r6, r0)
            goto Lcf
        L29:
            java.lang.String r5 = "state"
            java.lang.String r5 = r6.getStringExtra(r5)
            r6 = 2
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L52
            java.lang.String r2 = "IDLE"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L3f
            r6 = r1
            goto Lad
        L3f:
            java.lang.String r2 = "RINGING"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L49
            r6 = r0
            goto Lad
        L49:
            java.lang.String r2 = "OFFHOOK"
            boolean r5 = r5.equals(r2)
            if (r5 == 0) goto L52
            goto Lad
        L52:
            java.lang.String r5 = "MicroMsg.PhoneStatusWatcher"
            r2 = 31
            boolean r2 = fp.h.a(r2)     // Catch: java.lang.Throwable -> L91
            if (r2 != 0) goto L82
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> L91
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L91
            int r2 = r2.targetSdkVersion     // Catch: java.lang.Throwable -> L91
            r3 = 30
            if (r2 > r3) goto L69
            goto L82
        L69:
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> L91
            java.lang.String r3 = "audio"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch: java.lang.Throwable -> L91
            android.media.AudioManager r2 = (android.media.AudioManager) r2     // Catch: java.lang.Throwable -> L91
            int r3 = r2.getMode()     // Catch: java.lang.Throwable -> L91
            if (r3 != r0) goto L7b
            r6 = r0
            goto La0
        L7b:
            int r0 = r2.getMode()     // Catch: java.lang.Throwable -> L91
            if (r0 != r6) goto L9f
            goto La0
        L82:
            android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Throwable -> L91
            java.lang.String r0 = "phone"
            java.lang.Object r6 = r6.getSystemService(r0)     // Catch: java.lang.Throwable -> L91
            android.telephony.TelephonyManager r6 = (android.telephony.TelephonyManager) r6     // Catch: java.lang.Throwable -> L91
            int r6 = r6.getCallState()     // Catch: java.lang.Throwable -> L91
            goto La0
        L91:
            r6 = move-exception
            java.lang.Throwable r6 = r6.fillInStackTrace()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r0 = "getCallingState failed %s,"
            com.tencent.mars.xlog.Log.e(r5, r0, r6)
        L9f:
            r6 = r1
        La0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "calling state: %d"
            com.tencent.mars.xlog.Log.i(r5, r1, r0)
        Lad:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r0 = "MicroMsg.MT.MultiTalkManager"
            java.lang.String r1 = "phone state %d"
            com.tencent.mars.xlog.Log.i(r0, r1, r5)
            if (r6 != 0) goto Lc7
            com.tencent.mm.plugin.multitalk.model.d1 r5 = new com.tencent.mm.plugin.multitalk.model.d1
            r5.<init>(r4)
            com.tencent.mm.sdk.platformtools.u3.h(r5)
            goto Lcf
        Lc7:
            com.tencent.mm.plugin.multitalk.model.e1 r5 = new com.tencent.mm.plugin.multitalk.model.e1
            r5.<init>(r4)
            com.tencent.mm.sdk.platformtools.u3.h(r5)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.multitalk.model.f1.onReceive(android.content.Context, android.content.Intent):void");
    }
}
