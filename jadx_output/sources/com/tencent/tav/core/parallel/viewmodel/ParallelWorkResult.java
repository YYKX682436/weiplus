package com.tencent.tav.core.parallel.viewmodel;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/tencent/tav/core/parallel/viewmodel/ParallelWorkResult;", "", "indicatorInfo", "Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;", "status", "Lcom/tencent/tav/core/AssetExportSession$AssetExportSessionStatus;", "exportErrorStatus", "Lcom/tencent/tav/core/ExportErrorStatus;", "(Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;Lcom/tencent/tav/core/AssetExportSession$AssetExportSessionStatus;Lcom/tencent/tav/core/ExportErrorStatus;)V", "getExportErrorStatus", "()Lcom/tencent/tav/core/ExportErrorStatus;", "setExportErrorStatus", "(Lcom/tencent/tav/core/ExportErrorStatus;)V", "getIndicatorInfo", "()Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;", "setIndicatorInfo", "(Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;)V", "getStatus", "()Lcom/tencent/tav/core/AssetExportSession$AssetExportSessionStatus;", "setStatus", "(Lcom/tencent/tav/core/AssetExportSession$AssetExportSessionStatus;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "tav-foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ParallelWorkResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult.Companion INSTANCE = new com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult.Companion(null);
    private com.tencent.tav.core.ExportErrorStatus exportErrorStatus;
    private com.tencent.tav.core.parallel.info.PipelineIndicatorInfo indicatorInfo;
    private com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus status;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/tav/core/parallel/viewmodel/ParallelWorkResult$Companion;", "", "()V", "getSuccessResult", "Lcom/tencent/tav/core/parallel/viewmodel/ParallelWorkResult;", "indicatorInfo", "Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;", "tav-foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult getSuccessResult(com.tencent.tav.core.parallel.info.PipelineIndicatorInfo indicatorInfo) {
            kotlin.jvm.internal.o.g(indicatorInfo, "indicatorInfo");
            return new com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult(indicatorInfo, com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCompleted, new com.tencent.tav.core.ExportErrorStatus(0));
        }
    }

    public ParallelWorkResult(com.tencent.tav.core.parallel.info.PipelineIndicatorInfo indicatorInfo, com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus status, com.tencent.tav.core.ExportErrorStatus exportErrorStatus) {
        kotlin.jvm.internal.o.g(indicatorInfo, "indicatorInfo");
        kotlin.jvm.internal.o.g(status, "status");
        this.indicatorInfo = indicatorInfo;
        this.status = status;
        this.exportErrorStatus = exportErrorStatus;
    }

    public static /* synthetic */ com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult copy$default(com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult parallelWorkResult, com.tencent.tav.core.parallel.info.PipelineIndicatorInfo pipelineIndicatorInfo, com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus assetExportSessionStatus, com.tencent.tav.core.ExportErrorStatus exportErrorStatus, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            pipelineIndicatorInfo = parallelWorkResult.indicatorInfo;
        }
        if ((i17 & 2) != 0) {
            assetExportSessionStatus = parallelWorkResult.status;
        }
        if ((i17 & 4) != 0) {
            exportErrorStatus = parallelWorkResult.exportErrorStatus;
        }
        return parallelWorkResult.copy(pipelineIndicatorInfo, assetExportSessionStatus, exportErrorStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final com.tencent.tav.core.parallel.info.PipelineIndicatorInfo getIndicatorInfo() {
        return this.indicatorInfo;
    }

    /* renamed from: component2, reason: from getter */
    public final com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final com.tencent.tav.core.ExportErrorStatus getExportErrorStatus() {
        return this.exportErrorStatus;
    }

    public final com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult copy(com.tencent.tav.core.parallel.info.PipelineIndicatorInfo indicatorInfo, com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus status, com.tencent.tav.core.ExportErrorStatus exportErrorStatus) {
        kotlin.jvm.internal.o.g(indicatorInfo, "indicatorInfo");
        kotlin.jvm.internal.o.g(status, "status");
        return new com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult(indicatorInfo, status, exportErrorStatus);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult)) {
            return false;
        }
        com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult parallelWorkResult = (com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult) other;
        return kotlin.jvm.internal.o.b(this.indicatorInfo, parallelWorkResult.indicatorInfo) && this.status == parallelWorkResult.status && kotlin.jvm.internal.o.b(this.exportErrorStatus, parallelWorkResult.exportErrorStatus);
    }

    public final com.tencent.tav.core.ExportErrorStatus getExportErrorStatus() {
        return this.exportErrorStatus;
    }

    public final com.tencent.tav.core.parallel.info.PipelineIndicatorInfo getIndicatorInfo() {
        return this.indicatorInfo;
    }

    public final com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int hashCode = ((this.indicatorInfo.hashCode() * 31) + this.status.hashCode()) * 31;
        com.tencent.tav.core.ExportErrorStatus exportErrorStatus = this.exportErrorStatus;
        return hashCode + (exportErrorStatus == null ? 0 : exportErrorStatus.hashCode());
    }

    public final void setExportErrorStatus(com.tencent.tav.core.ExportErrorStatus exportErrorStatus) {
        this.exportErrorStatus = exportErrorStatus;
    }

    public final void setIndicatorInfo(com.tencent.tav.core.parallel.info.PipelineIndicatorInfo pipelineIndicatorInfo) {
        kotlin.jvm.internal.o.g(pipelineIndicatorInfo, "<set-?>");
        this.indicatorInfo = pipelineIndicatorInfo;
    }

    public final void setStatus(com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus assetExportSessionStatus) {
        kotlin.jvm.internal.o.g(assetExportSessionStatus, "<set-?>");
        this.status = assetExportSessionStatus;
    }

    public java.lang.String toString() {
        return "ParallelWorkResult(indicatorInfo=" + this.indicatorInfo + ", status=" + this.status + ", exportErrorStatus=" + this.exportErrorStatus + ')';
    }

    public /* synthetic */ ParallelWorkResult(com.tencent.tav.core.parallel.info.PipelineIndicatorInfo pipelineIndicatorInfo, com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus assetExportSessionStatus, com.tencent.tav.core.ExportErrorStatus exportErrorStatus, int i17, kotlin.jvm.internal.i iVar) {
        this(pipelineIndicatorInfo, assetExportSessionStatus, (i17 & 4) != 0 ? null : exportErrorStatus);
    }
}
