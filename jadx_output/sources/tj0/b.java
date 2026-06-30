package tj0;

/* loaded from: classes13.dex */
public enum b {
    INSTANCE;

    public final void a(long j17, tj0.a aVar) {
        if (aVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageReporter", "reportImageDecodeInfo sessionId: %d, from: %s, imageType: %d, w: %d, h: %d, fileSize: %d, orientation: %d, decodeResult: %d, decodeTime: %d, fullSampleSzie: %d, onlyDecodeTime: %d", java.lang.Long.valueOf(j17), aVar.f419677b, java.lang.Integer.valueOf(aVar.f419678c), java.lang.Integer.valueOf(aVar.f419679d), java.lang.Integer.valueOf(aVar.f419680e), java.lang.Integer.valueOf(aVar.f419681f), java.lang.Integer.valueOf(aVar.f419682g), java.lang.Integer.valueOf(aVar.f419683h), java.lang.Integer.valueOf(aVar.f419684i), java.lang.Integer.valueOf(aVar.f419685j), java.lang.Integer.valueOf(aVar.f419686k));
        jx3.f.INSTANCE.d(15467, java.lang.Long.valueOf(j17), aVar.f419677b, java.lang.Integer.valueOf(aVar.f419678c), java.lang.Integer.valueOf(aVar.f419679d), java.lang.Integer.valueOf(aVar.f419680e), java.lang.Integer.valueOf(aVar.f419681f), java.lang.Integer.valueOf(aVar.f419682g), java.lang.Integer.valueOf(aVar.f419683h), java.lang.Integer.valueOf(aVar.f419684i), java.lang.Integer.valueOf(aVar.f419685j), java.lang.Integer.valueOf(aVar.f419686k));
    }

    public void b(sj0.a aVar, sj0.c cVar) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (cVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageReporter", "reportPerformance sessionId: %d, fps.maxFps: %f, fps.minFps: %f, fps.averageFps: %f, memory.memoryUsedWhenInit: %f, memory.currentMaxUsedMemory: %f, memory.currentMinUsedMemory: %f, memory.averUsed: %f, memory.currentVarianceSum: %f", java.lang.Long.valueOf(currentTimeMillis), java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(cVar.f408342d), java.lang.Double.valueOf(cVar.f408343e), java.lang.Double.valueOf(cVar.f408344f), java.lang.Double.valueOf(cVar.f408346h), java.lang.Double.valueOf(cVar.f408345g));
            jx3.f.INSTANCE.d(15471, java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf((int) 0.0d), java.lang.Integer.valueOf((int) 0.0d), java.lang.Integer.valueOf((int) 0.0d), java.lang.Integer.valueOf((int) cVar.f408342d), java.lang.Integer.valueOf((int) cVar.f408343e), java.lang.Integer.valueOf((int) cVar.f408346h), java.lang.Integer.valueOf((int) cVar.f408345g), 1);
        }
    }
}
