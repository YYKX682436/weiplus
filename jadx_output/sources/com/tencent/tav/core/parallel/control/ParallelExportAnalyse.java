package com.tencent.tav.core.parallel.control;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/tencent/tav/core/parallel/control/ParallelExportAnalyse;", "", "Lcom/tencent/tav/coremedia/CMPerformance;", "performanceData", "Ljz5/f0;", "analyseSingleStage", "", "analyseToString", "Lcom/tencent/tav/coremedia/CMSampleBuffer;", "sample", "analyseGetSampleBuffer", "analyseAppendSampleBuffer", "Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "info", "Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "getInfo", "()Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "setInfo", "(Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;)V", "Ljava/util/ArrayList;", "Lcom/tencent/tav/core/parallel/control/ParallelExportAnalyse$StageAnalyse;", "Lkotlin/collections/ArrayList;", "stageAnalysis", "Ljava/util/ArrayList;", "<init>", "Companion", "StageAnalyse", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class ParallelExportAnalyse {
    private static final java.lang.String TAG = "MicroMsg.ParallelExportAnalyse";
    private com.tencent.tav.core.parallel.info.PipelineWorkInfo info;
    private final java.util.ArrayList<com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse> stageAnalysis;

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/tencent/tav/core/parallel/control/ParallelExportAnalyse$StageAnalyse;", "", "stage", "Lcom/tencent/tav/coremedia/CMPerformance$CMPerformanceStage;", "count", "", "totalCostMs", "", "(Lcom/tencent/tav/coremedia/CMPerformance$CMPerformanceStage;IJ)V", "getCount", "()I", "setCount", "(I)V", "getStage", "()Lcom/tencent/tav/coremedia/CMPerformance$CMPerformanceStage;", "setStage", "(Lcom/tencent/tav/coremedia/CMPerformance$CMPerformanceStage;)V", "getTotalCostMs", "()J", "setTotalCostMs", "(J)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "tav-foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class StageAnalyse {
        private int count;
        private com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage stage;
        private long totalCostMs;

        public StageAnalyse(com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage stage, int i17, long j17) {
            kotlin.jvm.internal.o.g(stage, "stage");
            this.stage = stage;
            this.count = i17;
            this.totalCostMs = j17;
        }

        public static /* synthetic */ com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse copy$default(com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse stageAnalyse, com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage cMPerformanceStage, int i17, long j17, int i18, java.lang.Object obj) {
            if ((i18 & 1) != 0) {
                cMPerformanceStage = stageAnalyse.stage;
            }
            if ((i18 & 2) != 0) {
                i17 = stageAnalyse.count;
            }
            if ((i18 & 4) != 0) {
                j17 = stageAnalyse.totalCostMs;
            }
            return stageAnalyse.copy(cMPerformanceStage, i17, j17);
        }

        /* renamed from: component1, reason: from getter */
        public final com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage getStage() {
            return this.stage;
        }

        /* renamed from: component2, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* renamed from: component3, reason: from getter */
        public final long getTotalCostMs() {
            return this.totalCostMs;
        }

        public final com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse copy(com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage stage, int count, long totalCostMs) {
            kotlin.jvm.internal.o.g(stage, "stage");
            return new com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse(stage, count, totalCostMs);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse)) {
                return false;
            }
            com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse stageAnalyse = (com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse) other;
            return this.stage == stageAnalyse.stage && this.count == stageAnalyse.count && this.totalCostMs == stageAnalyse.totalCostMs;
        }

        public final int getCount() {
            return this.count;
        }

        public final com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage getStage() {
            return this.stage;
        }

        public final long getTotalCostMs() {
            return this.totalCostMs;
        }

        public int hashCode() {
            return (((this.stage.hashCode() * 31) + java.lang.Integer.hashCode(this.count)) * 31) + java.lang.Long.hashCode(this.totalCostMs);
        }

        public final void setCount(int i17) {
            this.count = i17;
        }

        public final void setStage(com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage cMPerformanceStage) {
            kotlin.jvm.internal.o.g(cMPerformanceStage, "<set-?>");
            this.stage = cMPerformanceStage;
        }

        public final void setTotalCostMs(long j17) {
            this.totalCostMs = j17;
        }

        public java.lang.String toString() {
            return "StageAnalyse(stage=" + this.stage + ", count=" + this.count + ", totalCostMs=" + this.totalCostMs + ')';
        }
    }

    public ParallelExportAnalyse(com.tencent.tav.core.parallel.info.PipelineWorkInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.info = info;
        this.stageAnalysis = new java.util.ArrayList<>();
    }

    private final void analyseSingleStage(com.tencent.tav.coremedia.CMPerformance cMPerformance) {
        java.lang.Object obj;
        java.util.Iterator<T> it = this.stageAnalysis.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse) obj).getStage() == cMPerformance.stage) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse stageAnalyse = (com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse) obj;
        if (stageAnalyse == null) {
            com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage stage = cMPerformance.stage;
            kotlin.jvm.internal.o.f(stage, "stage");
            this.stageAnalysis.add(new com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse(stage, 1, cMPerformance.costMs()));
        } else {
            stageAnalyse.setCount(stageAnalyse.getCount() + 1);
            stageAnalyse.setTotalCostMs(stageAnalyse.getTotalCostMs() + cMPerformance.costMs());
        }
        java.util.ArrayList<com.tencent.tav.coremedia.CMPerformance> preNodes = cMPerformance.preNodes;
        kotlin.jvm.internal.o.f(preNodes, "preNodes");
        for (com.tencent.tav.coremedia.CMPerformance cMPerformance2 : preNodes) {
            kotlin.jvm.internal.o.d(cMPerformance2);
            analyseSingleStage(cMPerformance2);
        }
    }

    private final java.lang.String analyseToString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("\n");
        for (com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse stageAnalyse : this.stageAnalysis) {
            stringBuffer.append("[" + stageAnalyse.getStage() + ':' + (stageAnalyse.getTotalCostMs() / stageAnalyse.getCount()) + "]\n");
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    public final void analyseAppendSampleBuffer(com.tencent.tav.coremedia.CMSampleBuffer sample) {
        kotlin.jvm.internal.o.g(sample, "sample");
        com.tencent.tav.coremedia.CMPerformance cMPerformance = sample.getState().performance;
        kotlin.jvm.internal.o.d(cMPerformance);
        analyseSingleStage(cMPerformance);
        com.tencent.tav.decoder.logger.Logger.d(TAG, "[" + this.info.getIndicator().getIndex() + "]analyse output buffer: " + analyseToString());
    }

    public final void analyseGetSampleBuffer(com.tencent.tav.coremedia.CMSampleBuffer sample) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(sample, "sample");
        com.tencent.tav.coremedia.CMPerformance cMPerformance = sample.getState().performance;
        kotlin.jvm.internal.o.d(cMPerformance);
        analyseSingleStage(cMPerformance);
        java.util.Iterator<T> it = this.stageAnalysis.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse stageAnalyse = (com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse) obj;
            if (stageAnalyse.getStage() == com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage.RENDER && stageAnalyse.getCount() % 30 == 0) {
                break;
            }
        }
        if (((com.tencent.tav.core.parallel.control.ParallelExportAnalyse.StageAnalyse) obj) != null) {
            com.tencent.tav.decoder.logger.Logger.d(TAG, "[" + this.info.getIndicator().getIndex() + "]analyse input buffer: " + analyseToString());
        }
    }

    public final com.tencent.tav.core.parallel.info.PipelineWorkInfo getInfo() {
        return this.info;
    }

    public final void setInfo(com.tencent.tav.core.parallel.info.PipelineWorkInfo pipelineWorkInfo) {
        kotlin.jvm.internal.o.g(pipelineWorkInfo, "<set-?>");
        this.info = pipelineWorkInfo;
    }
}
