package com.tencent.mm.plugin.sight.decode.model;

/* loaded from: classes3.dex */
public class c implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            ((com.tencent.mm.feature.sight.api.ISightJNIService) i95.n0.c(com.tencent.mm.feature.sight.api.ISightJNIService.class)).freeAll();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SightPlayController", "free all sight error");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SightPlayController", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SightPlayController", "free all, use %d ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
