package com.tencent.qqmusic.mediaplayer.perf;

/* loaded from: classes13.dex */
public class Reporters {
    public static com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.Visitor detail(final com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation, final java.util.Map<java.lang.String, java.lang.String> map) {
        return new com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.Visitor() { // from class: com.tencent.qqmusic.mediaplayer.perf.Reporters.1
            @Override // com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.Visitor
            public void visitSpeedCheck(java.util.List<com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.SpeedCheck> list, com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.OverallInfo overallInfo) {
                long round = java.lang.Math.round(overallInfo.totalPcmToBePlayed / overallInfo.timeCostInMs);
                double playSample = ((com.tencent.qqmusic.mediaplayer.AudioInformation.this.getPlaySample() * com.tencent.qqmusic.mediaplayer.AudioInformation.this.getChannels()) * (com.tencent.qqmusic.mediaplayer.AudioInformation.this.getBitDepth() != 1 ? 2 : 1)) / 1000.0d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n============== Info start ==============\n");
                sb6.append("媒体文件信息:\n\t播放时间: ");
                sb6.append(new java.util.Date().toString());
                sb6.append("\n\t音频类型: ");
                sb6.append(com.tencent.qqmusic.mediaplayer.AudioInformation.this.getAudioType().toString());
                sb6.append("\n\t文件采样率: ");
                sb6.append(com.tencent.qqmusic.mediaplayer.AudioInformation.this.getSampleRate());
                sb6.append("\n\t播放采样率: ");
                sb6.append(com.tencent.qqmusic.mediaplayer.AudioInformation.this.getPlaySample());
                sb6.append("\n\t位深: ");
                sb6.append(com.tencent.qqmusic.mediaplayer.AudioInformation.this.getBitDepth());
                sb6.append("\n\t声道数: ");
                sb6.append(com.tencent.qqmusic.mediaplayer.AudioInformation.this.getChannels());
                sb6.append("\n\t时长: ");
                sb6.append(com.tencent.qqmusic.mediaplayer.AudioInformation.this.getDuration());
                sb6.append("\n\n整体性能\n\t总耗时 (ms): ");
                sb6.append(overallInfo.timeCostInMs);
                sb6.append("\n\t播放PCM数据量 (byte): ");
                sb6.append(overallInfo.totalPcmToBePlayed);
                sb6.append("\n\t总速度 (byte/ms): ");
                sb6.append(round);
                sb6.append(" (");
                sb6.append(java.lang.Math.round(round / playSample));
                sb6.append(" 倍于最低要求速度)\n\t最低要求速度 (byte/ms): ");
                sb6.append(playSample);
                sb6.append("\n\n额外信息:");
                for (java.util.Map.Entry entry : map.entrySet()) {
                    sb6.append("\n\t");
                    sb6.append((java.lang.String) entry.getKey());
                    sb6.append(": ");
                    sb6.append((java.lang.String) entry.getValue());
                }
                sb6.append("\n");
                com.tencent.qqmusic.mediaplayer.perf.Reporters.generateDetailedPerformance(list, sb6, overallInfo.timeCostInMs);
                sb6.append("============== Info end ==============");
                com.tencent.qqmusic.mediaplayer.util.Logger.i("PERFORMANCE", sb6.toString());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void generateDetailedPerformance(java.util.List<com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.SpeedCheck> list, java.lang.StringBuilder sb6, long j17) {
        sb6.append("\n详细性能数据:\n");
        sb6.append(java.lang.String.format(java.util.Locale.getDefault(), "\t%15s%15s%15s%15s%15s", "名称", "平均速度(byte/ms)", "耗时(ms)", "数据量(byte)", "占总耗时比"));
        for (com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.SpeedCheck speedCheck : list) {
            sb6.append("\n");
            sb6.append(java.lang.String.format(java.util.Locale.getDefault(), "\t%15s%15.0f%15d%15d%13.2f", speedCheck.getName(), java.lang.Double.valueOf(speedCheck.getAvg()), java.lang.Long.valueOf(speedCheck.getTotalTimeMs()), java.lang.Long.valueOf(speedCheck.getTotalBufferLength()), java.lang.Double.valueOf(speedCheck.getTotalTimeMs() / j17)));
        }
        sb6.append("\n");
    }
}
