package com.tencent.qqmusic.mediaplayer.perf;

/* loaded from: classes13.dex */
public class UploadVisitor implements com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.Visitor, com.tencent.qqmusic.mediaplayer.perf.Collectable {
    private java.util.HashMap<java.lang.String, java.lang.Long> prefInfos = new java.util.HashMap<>();

    @Override // com.tencent.qqmusic.mediaplayer.perf.Collectable
    public void accept(com.tencent.qqmusic.mediaplayer.perf.ErrorUploadCollector errorUploadCollector) {
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.Visitor
    public void visitSpeedCheck(java.util.List<com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.SpeedCheck> list, com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.OverallInfo overallInfo) {
        for (com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.SpeedCheck speedCheck : list) {
            this.prefInfos.put(speedCheck.getName() + ".ms", java.lang.Long.valueOf(speedCheck.getTotalTimeMs()));
            this.prefInfos.put(speedCheck.getName() + ".bytes", java.lang.Long.valueOf(speedCheck.getTotalBufferLength()));
        }
    }

    @Override // com.tencent.qqmusic.mediaplayer.perf.Collectable
    public void accept(com.tencent.qqmusic.mediaplayer.perf.PlayerInfoCollector playerInfoCollector) {
        if (this.prefInfos.entrySet().isEmpty()) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : this.prefInfos.entrySet()) {
            playerInfoCollector.putLong(entry.getKey(), entry.getValue().longValue());
        }
    }
}
