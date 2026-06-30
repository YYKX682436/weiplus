package com.tencent.tav.core.parallel.viewmodel;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002R<\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0013j\b\u0012\u0004\u0012\u00020\r`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/tencent/tav/core/parallel/viewmodel/ParallelResultViewModel;", "Landroidx/lifecycle/c1;", "Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "work", "Lcom/tencent/tav/core/AssetExportSession$AssetExportSessionStatus;", "status", "Lcom/tencent/tav/core/ExportErrorStatus;", com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, "Ljz5/f0;", "updateWorkResult", "updateWorkResultSuccess", "Landroidx/lifecycle/j0;", "", "Lcom/tencent/tav/core/parallel/viewmodel/ParallelWorkResult;", "<set-?>", "resultLiveData", "Landroidx/lifecycle/j0;", "getResultLiveData", "()Landroidx/lifecycle/j0;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "resultList", "Ljava/util/ArrayList;", "<init>", "()V", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class ParallelResultViewModel extends androidx.lifecycle.c1 {
    private androidx.lifecycle.j0 resultLiveData = new androidx.lifecycle.j0();
    private final java.util.ArrayList<com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult> resultList = new java.util.ArrayList<>();

    public final androidx.lifecycle.j0 getResultLiveData() {
        return this.resultLiveData;
    }

    public final void updateWorkResult(com.tencent.tav.core.parallel.info.PipelineWorkInfo work, com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus status, com.tencent.tav.core.ExportErrorStatus errorCode) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(work, "work");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(errorCode, "errorCode");
        java.util.Iterator<T> it = this.resultList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult) obj).getIndicatorInfo(), work.getIndicator())) {
                    break;
                }
            }
        }
        com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult parallelWorkResult = (com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult) obj;
        if (parallelWorkResult != null) {
            parallelWorkResult.setStatus(status);
            parallelWorkResult.setExportErrorStatus(errorCode);
        } else {
            java.util.ArrayList<com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult> arrayList = this.resultList;
            com.tencent.tav.core.parallel.info.PipelineIndicatorInfo indicator = work.getIndicator();
            kotlin.jvm.internal.o.f(indicator, "getIndicator(...)");
            arrayList.add(new com.tencent.tav.core.parallel.viewmodel.ParallelWorkResult(indicator, status, errorCode));
        }
        this.resultLiveData.postValue(this.resultList);
    }

    public final void updateWorkResultSuccess(com.tencent.tav.core.parallel.info.PipelineWorkInfo work) {
        kotlin.jvm.internal.o.g(work, "work");
        updateWorkResult(work, com.tencent.tav.core.AssetExportSession.AssetExportSessionStatus.AssetExportSessionStatusCompleted, new com.tencent.tav.core.ExportErrorStatus(0));
    }
}
