package gs0;

/* loaded from: classes10.dex */
public final class q implements ru5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gs0.r f275010a;

    public q(gs0.r rVar) {
        this.f275010a = rVar;
    }

    @Override // ru5.a
    public java.lang.Object a(java.lang.Object obj) {
        gs0.r rVar;
        int i17;
        while (true) {
            rVar = this.f275010a;
            boolean z17 = rVar.f275014d;
            i17 = rVar.f275011a;
            if (z17) {
                break;
            }
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            int triggerEncode = com.tencent.mm.plugin.sight.base.SightVideoJNI.triggerEncode(i17, java.lang.Math.max(0, rVar.f275018h), false);
            com.tencent.mars.xlog.Log.i("MicroMsg.X264TransEncoder", "ing: trgger encode use %dms, Encode index[%d, %d), threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Integer.valueOf(rVar.f275018h), java.lang.Integer.valueOf(triggerEncode), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            if (java.lang.Math.abs(triggerEncode - rVar.f275018h) <= 5) {
                try {
                    java.lang.Thread.sleep(100L);
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.X264TransEncoder", "thread sleep error");
                }
            }
            rVar.f275018h = triggerEncode;
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        if (!rVar.f275015e) {
            rVar.f275018h = com.tencent.mm.plugin.sight.base.SightVideoJNI.triggerEncode(i17, rVar.f275018h, true);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.X264TransEncoder", "end: trgger encode use %dms, curEncode index %d, markCancel %s, threadId: %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), java.lang.Integer.valueOf(rVar.f275018h), java.lang.Boolean.valueOf(rVar.f275015e), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        return jz5.f0.f302826a;
    }
}
