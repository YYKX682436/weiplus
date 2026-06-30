package com.tencent.tav.core.parallel.control;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007¢\u0006\u0004\b:\u0010;J \u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J \u0010\f\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J \u0010\u0010\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002JB\u0010\u0015\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\"\u0010\u0014\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013J\u0016\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016J\u0016\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0016J\u001e\u0010\u001a\u001a\u00020\u00062\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004J\u0006\u0010\u001b\u001a\u00020\u0006J\u0016\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u001d\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\u0011J\u0006\u0010\u001f\u001a\u00020\u0011J\u0006\u0010 \u001a\u00020\u0011J\u0010\u0010\"\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010!R\u0016\u0010#\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R0\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&0%j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020&`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R*\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R&\u0010\u000b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010,R2\u0010\u0014\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00102R\u0016\u00104\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00100R\"\u00105\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00102\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/tencent/tav/core/parallel/control/ParallelExportController;", "", "Ljava/util/ArrayList;", "Lcom/tencent/tav/core/parallel/info/PipelineWorkInfo;", "Lkotlin/collections/ArrayList;", "info", "Ljz5/f0;", "setupWorkInfo", "", "currentFrameRate", "Lkotlin/Function1;", "startWork", "reuseWork", "Ljava/lang/Runnable;", "callback", "releaseWorkResource", "createNewWork", "", "hasPreparedWork", "Lkotlin/Function3;", "releaseWork", "registerFunction", "Lcom/tencent/tav/coremedia/CMSampleBuffer;", "buffer", "analyseGetSampleBuffer", "analyseAppendSampleBuffer", "startExport", "tryStartOneMoreWork", "handleWorkFinish", "currentRunSize", "canWorkReuse", "allWorkFinish", "allSuccess", "Lcom/tencent/tav/core/parallel/info/PipelineIndicatorInfo;", "markHardwareLimit", "hardwareLimit", "Z", "Ljava/util/HashMap;", "Lcom/tencent/tav/core/parallel/control/ParallelExportAnalyse;", "Lkotlin/collections/HashMap;", "performanceMap", "Ljava/util/HashMap;", "exportWork", "Ljava/util/ArrayList;", "Lyz5/l;", "Lyz5/q;", "", "startTimeMs", "J", "totalFrame", "I", "lastFrameRate", "lastTimestampMs", "maxParallelCount", "getMaxParallelCount", "()I", "setMaxParallelCount", "(I)V", "<init>", "()V", "Companion", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class ParallelExportController {
    private static final int DEFAULT_FRAME = 20;
    private static final int FRAME_BUFF = 10;
    private static final int MAX_WORK_COUNT = 5;
    private static final java.lang.String TAG = "ParallelExportController";
    private static final int TIME_INTERVAL = 3000;
    private java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineWorkInfo> exportWork;
    private boolean hardwareLimit;
    private long lastTimestampMs;
    private int maxParallelCount;
    private yz5.q releaseWork;
    private long startTimeMs;
    private yz5.l startWork;
    private final java.util.HashMap<com.tencent.tav.core.parallel.info.PipelineWorkInfo, com.tencent.tav.core.parallel.control.ParallelExportAnalyse> performanceMap = new java.util.HashMap<>();
    private int totalFrame = 30;
    private int lastFrameRate = 20;
    private int currentFrameRate = 20;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[EDGE_INSN: B:13:0x0033->B:14:0x0033 BREAK  A[LOOP:0: B:5:0x000b->B:23:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:5:0x000b->B:23:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void createNewWork(yz5.l r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L5d
            java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineWorkInfo> r0 = r6.exportWork
            r1 = 0
            if (r0 == 0) goto L36
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.tencent.tav.core.parallel.info.PipelineWorkInfo r3 = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) r3
            com.tencent.tav.core.parallel.info.PipelineIndicatorInfo r4 = r3.getIndicator()
            com.tencent.tav.core.AssetParallelSegmentStatus r4 = r4.getSegmentStatus()
            com.tencent.tav.core.AssetParallelSegmentStatus r5 = com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusPrepared
            if (r4 != r5) goto L2e
            com.tencent.tav.core.parallel.info.PipelineIndicatorInfo r3 = r3.getIndicator()
            int r3 = r3.type
            r4 = 1
            if (r3 != r4) goto L2e
            goto L2f
        L2e:
            r4 = 0
        L2f:
            if (r4 == 0) goto Lb
            goto L33
        L32:
            r2 = r1
        L33:
            com.tencent.tav.core.parallel.info.PipelineWorkInfo r2 = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) r2
            goto L37
        L36:
            r2 = r1
        L37:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "tryStartOneMoreWork index:"
            r0.<init>(r3)
            if (r2 == 0) goto L4e
            com.tencent.tav.core.parallel.info.PipelineIndicatorInfo r3 = r2.getIndicator()
            if (r3 == 0) goto L4e
            int r1 = r3.getIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L4e:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ParallelExportController"
            com.tencent.tav.decoder.logger.Logger.i(r1, r0)
            r7.invoke(r2)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.parallel.control.ParallelExportController.createNewWork(yz5.l):void");
    }

    private final int currentFrameRate() {
        return (this.currentFrameRate * 1000) / 3000;
    }

    private final boolean hasPreparedWork() {
        java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineWorkInfo> arrayList = this.exportWork;
        java.lang.Object obj = null;
        if (arrayList != null) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                com.tencent.tav.core.parallel.info.PipelineWorkInfo pipelineWorkInfo = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) next;
                if (pipelineWorkInfo.getIndicator().getSegmentStatus() == com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusPrepared && pipelineWorkInfo.getIndicator().type == 1) {
                    obj = next;
                    break;
                }
            }
            obj = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) obj;
        }
        return obj != null;
    }

    private final void releaseWorkResource(java.lang.Runnable runnable) {
        java.lang.Object obj;
        java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineWorkInfo> arrayList = this.exportWork;
        if (arrayList != null) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                com.tencent.tav.core.parallel.info.PipelineWorkInfo pipelineWorkInfo = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) obj;
                boolean z17 = false;
                if (pipelineWorkInfo.getIndicator().getSegmentStatus() == com.tencent.tav.core.AssetParallelSegmentStatus.AssetReaderStatusWriteFinish && pipelineWorkInfo.getIndicator().type == 1) {
                    android.os.HandlerThread handlerThread = pipelineWorkInfo.thread;
                    if (handlerThread != null && handlerThread.isAlive()) {
                        z17 = true;
                    }
                }
                if (z17) {
                    break;
                }
            }
            com.tencent.tav.core.parallel.info.PipelineWorkInfo pipelineWorkInfo2 = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) obj;
            if (pipelineWorkInfo2 != null) {
                yz5.q qVar = this.releaseWork;
                if (qVar != null) {
                    qVar.invoke(pipelineWorkInfo2, runnable, java.lang.Boolean.FALSE);
                    return;
                }
                return;
            }
        }
        runnable.run();
    }

    private final void reuseWork(yz5.l lVar) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineWorkInfo> arrayList;
        java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineWorkInfo> arrayList2 = this.exportWork;
        if (arrayList2 != null) {
            java.util.Iterator<T> it = arrayList2.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                com.tencent.tav.core.parallel.info.PipelineWorkInfo pipelineWorkInfo = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) obj2;
                if (pipelineWorkInfo.getIndicator().getSegmentStatus() == com.tencent.tav.core.AssetParallelSegmentStatus.AssetReaderStatusWriteFinish && pipelineWorkInfo.getIndicator().type == 1) {
                    break;
                }
            }
            com.tencent.tav.core.parallel.info.PipelineWorkInfo pipelineWorkInfo2 = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) obj2;
            if (pipelineWorkInfo2 == null || (arrayList = this.exportWork) == null) {
                return;
            }
            java.util.Iterator<T> it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                com.tencent.tav.core.parallel.info.PipelineWorkInfo pipelineWorkInfo3 = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) next;
                if (pipelineWorkInfo3.getIndicator().getSegmentStatus() == com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusPrepared && pipelineWorkInfo3.getIndicator().type == 1) {
                    obj = next;
                    break;
                }
            }
            com.tencent.tav.core.parallel.info.PipelineWorkInfo pipelineWorkInfo4 = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) obj;
            if (pipelineWorkInfo4 == null) {
                return;
            }
            com.tencent.tav.decoder.logger.Logger.i(TAG, "try reuse Work from:" + pipelineWorkInfo2.getIndicator().getIndex() + " to:" + pipelineWorkInfo4.getIndicator().getIndex());
            pipelineWorkInfo2.reuseWork(pipelineWorkInfo4);
            if (lVar != null) {
                lVar.invoke(pipelineWorkInfo2);
            }
        }
    }

    private final void setupWorkInfo(java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineWorkInfo> arrayList) {
        this.exportWork = arrayList;
        java.lang.Object obj = null;
        if (arrayList != null) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((com.tencent.tav.core.parallel.info.PipelineWorkInfo) next).type == 2) {
                    obj = next;
                    break;
                }
            }
            obj = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) obj;
        }
        int i17 = obj == null ? 0 : 1;
        com.tencent.tav.decoder.logger.Logger.i(TAG, "exportWork video count:" + (arrayList.size() - i17) + " audio count:" + i17);
        for (com.tencent.tav.core.parallel.info.PipelineWorkInfo pipelineWorkInfo : arrayList) {
            this.performanceMap.put(pipelineWorkInfo, new com.tencent.tav.core.parallel.control.ParallelExportAnalyse(pipelineWorkInfo));
        }
    }

    public final boolean allSuccess() {
        java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineWorkInfo> arrayList = this.exportWork;
        java.lang.Object obj = null;
        if (arrayList != null) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((com.tencent.tav.core.parallel.info.PipelineWorkInfo) next).getIndicator().getSegmentStatus() != com.tencent.tav.core.AssetParallelSegmentStatus.AssetReaderStatusWriteFinish) {
                    obj = next;
                    break;
                }
            }
            obj = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) obj;
        }
        return obj == null;
    }

    public final boolean allWorkFinish() {
        java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineWorkInfo> arrayList = this.exportWork;
        java.lang.Object obj = null;
        if (arrayList != null) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                com.tencent.tav.core.parallel.info.PipelineWorkInfo pipelineWorkInfo = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) next;
                if ((pipelineWorkInfo.getIndicator().getSegmentStatus() == com.tencent.tav.core.AssetParallelSegmentStatus.AssetReaderStatusWriteFinish && pipelineWorkInfo.getIndicator().getSegmentStatus() == com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusFailed) ? false : true) {
                    obj = next;
                    break;
                }
            }
            obj = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) obj;
        }
        return obj == null;
    }

    public final void analyseAppendSampleBuffer(com.tencent.tav.core.parallel.info.PipelineWorkInfo info, com.tencent.tav.coremedia.CMSampleBuffer buffer) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(buffer, "buffer");
        com.tencent.tav.core.parallel.control.ParallelExportAnalyse parallelExportAnalyse = this.performanceMap.get(info);
        if (parallelExportAnalyse != null) {
            parallelExportAnalyse.analyseAppendSampleBuffer(buffer);
        }
    }

    public final void analyseGetSampleBuffer(com.tencent.tav.core.parallel.info.PipelineWorkInfo info, com.tencent.tav.coremedia.CMSampleBuffer buffer) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(buffer, "buffer");
        com.tencent.tav.core.parallel.control.ParallelExportAnalyse parallelExportAnalyse = this.performanceMap.get(info);
        if (parallelExportAnalyse != null) {
            parallelExportAnalyse.analyseGetSampleBuffer(buffer);
        }
        this.totalFrame++;
        this.currentFrameRate++;
        if (java.lang.System.currentTimeMillis() - this.lastTimestampMs >= 3000) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.lastTimestampMs = currentTimeMillis;
            long j17 = (this.totalFrame * 1000) / (currentTimeMillis - this.startTimeMs);
            if (currentFrameRate() - this.lastFrameRate >= 10 && !this.hardwareLimit) {
                tryStartOneMoreWork();
            }
            com.tencent.tav.decoder.logger.Logger.i(TAG, "current work size:" + currentRunSize() + " frameRate:" + j17 + " currentRate:" + currentFrameRate() + " lastFrameRate:" + this.lastFrameRate);
            int currentFrameRate = currentFrameRate();
            int i17 = this.lastFrameRate;
            if (currentFrameRate < i17) {
                currentFrameRate = i17;
            }
            this.lastFrameRate = currentFrameRate;
            this.currentFrameRate = 0;
        }
        int i18 = this.maxParallelCount;
        int currentRunSize = currentRunSize();
        if (i18 < currentRunSize) {
            i18 = currentRunSize;
        }
        this.maxParallelCount = i18;
    }

    public final boolean canWorkReuse() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r4.getIndicator().type == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int currentRunSize() {
        /*
            r7 = this;
            java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineWorkInfo> r0 = r7.exportWork
            r1 = 0
            if (r0 == 0) goto L3c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r0.next()
            r4 = r3
            com.tencent.tav.core.parallel.info.PipelineWorkInfo r4 = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) r4
            com.tencent.tav.core.parallel.info.PipelineIndicatorInfo r5 = r4.getIndicator()
            com.tencent.tav.core.AssetParallelSegmentStatus r5 = r5.getSegmentStatus()
            com.tencent.tav.core.AssetParallelSegmentStatus r6 = com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusStarted
            if (r5 != r6) goto L31
            com.tencent.tav.core.parallel.info.PipelineIndicatorInfo r4 = r4.getIndicator()
            int r4 = r4.type
            r5 = 1
            if (r4 != r5) goto L31
            goto L32
        L31:
            r5 = r1
        L32:
            if (r5 == 0) goto Le
            r2.add(r3)
            goto Le
        L38:
            int r1 = r2.size()
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.core.parallel.control.ParallelExportController.currentRunSize():int");
    }

    public final int getMaxParallelCount() {
        return this.maxParallelCount;
    }

    public final void handleWorkFinish(com.tencent.tav.core.parallel.info.PipelineWorkInfo info, java.lang.Runnable callback) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!hasPreparedWork()) {
            yz5.q qVar = this.releaseWork;
            if (qVar != null) {
                qVar.invoke(info, callback, java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        if (canWorkReuse()) {
            reuseWork(this.startWork);
            return;
        }
        yz5.q qVar2 = this.releaseWork;
        if (qVar2 != null) {
            qVar2.invoke(info, new java.lang.Runnable() { // from class: com.tencent.tav.core.parallel.control.ParallelExportController$handleWorkFinish$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.tav.core.parallel.control.ParallelExportController.this.tryStartOneMoreWork();
                }
            }, java.lang.Boolean.FALSE);
        }
    }

    public final void markHardwareLimit(com.tencent.tav.core.parallel.info.PipelineIndicatorInfo pipelineIndicatorInfo) {
        com.tencent.tav.decoder.logger.Logger.i(TAG, "markHardwareLimit:" + pipelineIndicatorInfo);
        this.hardwareLimit = true;
    }

    public final void registerFunction(yz5.l lVar, yz5.q qVar) {
        this.startWork = lVar;
        this.releaseWork = qVar;
    }

    public final void setMaxParallelCount(int i17) {
        this.maxParallelCount = i17;
    }

    public final void startExport(java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineWorkInfo> info) {
        kotlin.jvm.internal.o.g(info, "info");
        setupWorkInfo(info);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.lastTimestampMs = currentTimeMillis;
        this.startTimeMs = currentTimeMillis;
        yz5.l lVar = this.startWork;
        if (lVar != null) {
            java.util.ArrayList<com.tencent.tav.core.parallel.info.PipelineWorkInfo> arrayList = this.exportWork;
            java.lang.Object obj = null;
            if (arrayList != null) {
                java.util.Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    com.tencent.tav.core.parallel.info.PipelineWorkInfo pipelineWorkInfo = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) next;
                    if (pipelineWorkInfo.getIndicator().getSegmentStatus() == com.tencent.tav.core.AssetParallelSegmentStatus.AssetParallelStatusPrepared && pipelineWorkInfo.getIndicator().type == 2) {
                        obj = next;
                        break;
                    }
                }
                obj = (com.tencent.tav.core.parallel.info.PipelineWorkInfo) obj;
            }
            lVar.invoke(obj);
        }
        tryStartOneMoreWork();
    }

    public final synchronized void tryStartOneMoreWork() {
        com.tencent.tav.decoder.logger.Logger.i(TAG, "tryStartOneMoreWork currentRunSize:%d", java.lang.Integer.valueOf(currentRunSize()));
        if (currentRunSize() >= 5) {
            return;
        }
        if (hasPreparedWork()) {
            createNewWork(this.startWork);
        }
    }
}
