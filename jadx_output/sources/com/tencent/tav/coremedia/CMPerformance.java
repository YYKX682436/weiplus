package com.tencent.tav.coremedia;

/* loaded from: classes15.dex */
public class CMPerformance {
    private long endMs;
    private com.tencent.tav.coremedia.CMPerformance nextNode;
    public java.util.ArrayList<com.tencent.tav.coremedia.CMPerformance> preNodes;
    public com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage stage;
    private long startMs;

    /* loaded from: classes15.dex */
    public enum CMPerformanceStage {
        DEFAULT,
        EXTRACTOR,
        DECODE_WAIT,
        DECODE_JUMP,
        DECODE_CACHE,
        DECODE,
        RENDER,
        ENCODE_RENDER_CLEAR,
        ENCODE_RENDER,
        ENCODE_SWAP_BUFFER,
        ENCODE,
        ENCODE_WAIT
    }

    public CMPerformance() {
        this.stage = com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage.DEFAULT;
        this.startMs = -1L;
        this.endMs = -1L;
        this.preNodes = new java.util.ArrayList<>();
    }

    public void addPreNode(com.tencent.tav.coremedia.CMPerformance cMPerformance) {
        this.preNodes.add(cMPerformance);
    }

    public long costMs() {
        return this.endMs - this.startMs;
    }

    public com.tencent.tav.coremedia.CMPerformance getNextNode() {
        return this.nextNode;
    }

    public void markEnd() {
        this.endMs = java.lang.System.currentTimeMillis();
    }

    public void markStart() {
        this.startMs = java.lang.System.currentTimeMillis();
    }

    public void setNextNode(com.tencent.tav.coremedia.CMPerformance cMPerformance) {
        this.nextNode = cMPerformance;
    }

    public boolean stageValid() {
        return this.stage != com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage.DEFAULT;
    }

    public java.lang.String toString() {
        return "CMPerformance{stage=" + this.stage + ", startMs=" + this.startMs + ", endMs=" + this.endMs + '}';
    }

    public CMPerformance(com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage cMPerformanceStage) {
        this.stage = com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage.DEFAULT;
        this.startMs = -1L;
        this.endMs = -1L;
        this.preNodes = new java.util.ArrayList<>();
        this.stage = cMPerformanceStage;
    }
}
