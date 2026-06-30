package sn1;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn1.f f410002d;

    public d(sn1.f fVar) {
        this.f410002d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = sn1.i.f410013g;
        synchronized (concurrentHashMap) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            int i17 = 0;
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                if (entry != null) {
                    try {
                        com.tencent.mm.pointers.PByteArray pByteArray = ((sn1.i) entry.getValue()).f410025e;
                        if (pByteArray != null) {
                            sn1.e eVar = sn1.i.f410016m;
                            if (eVar != null) {
                                ((ln1.g) eVar).d(((java.lang.Integer) entry.getKey()).intValue(), pByteArray.value, ((sn1.i) entry.getValue()).getType());
                                com.tencent.mars.xlog.Log.i("MicroMsg.BackupBaseScene", "resendSceneMap sceneSeq[%d], type[%d], sceneBuf[%d]", entry.getKey(), java.lang.Integer.valueOf(((sn1.i) entry.getValue()).getType()), java.lang.Integer.valueOf(pByteArray.value.length));
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.BackupBaseScene", "resendSceneMap engineSender null, sceneSeq[%d], type[%d], sceneBuf[%d]", entry.getKey(), java.lang.Integer.valueOf(((sn1.i) entry.getValue()).getType()), java.lang.Integer.valueOf(pByteArray.value.length));
                            }
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.BackupBaseScene", "resendSceneMap sceneBuf null, sceneSeq[%d]", entry.getKey());
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupBaseScene", e17, "req to buf fail: " + e17.toString(), new java.lang.Object[0]);
                    }
                    i17++;
                }
                if (i17 > 0 && i17 % 5 == 0) {
                    ((qn1.w) this.f410002d).a(false);
                }
            }
            ((qn1.w) this.f410002d).a(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupBaseScene", "resendSceneMap finish, sceneMap[%d], time[%d]", java.lang.Integer.valueOf(sn1.i.f410013g.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
    }
}
