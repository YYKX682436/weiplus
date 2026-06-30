package com.tencent.tav.decoder.ofs;

/* loaded from: classes16.dex */
public class OptimizedFrameSamplingVideoDecoderTrack implements com.tencent.tav.decoder.IDecoderTrack {
    public static boolean LOG_VERBOSE = false;
    public static boolean PRE_READ = true;
    private static final java.lang.String TAG = "OFSVDecoderTrack";
    private android.view.Surface _outputSurface;
    private com.tencent.tav.decoder.IVideoDecoder currentDecoder;
    private final java.lang.Object currentDecoderLock;
    private com.tencent.tav.coremedia.CMTime currentSegmentStartTime;
    private boolean decodeError;
    private java.lang.Exception decodeException;
    private final com.tencent.tav.report.AverageTimeReporter decodeReporter;
    private com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.DecoderCreateThread decoderCreateThread;
    private com.tencent.tav.codec.IDecoderFactory decoderFactory;
    private com.tencent.tav.coremedia.CMTime duration;
    private boolean isReleased;
    private com.tencent.tav.coremedia.CMSampleState lastSampleState;
    private com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.DecoderWrapper nextDecoder;
    private final java.lang.Object nextDecoderLock;
    private final java.lang.Object nextFrameDecoderLock;
    private final java.util.ArrayList<com.tencent.tav.report.AverageTimeReporter> preReadReporters;
    private int segmentIndex;
    private boolean started;
    private com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator;
    private final int trackId;
    private com.tencent.tav.core.composition.VideoComposition videoComposition;
    private com.tencent.tav.coremedia.CMTime outputFrameDuration = new com.tencent.tav.coremedia.CMTime(1, 30);
    private java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> segments = new java.util.ArrayList<>();

    /* loaded from: classes16.dex */
    public class DecoderCreateThread extends java.lang.Thread {
        private android.view.Surface outputSurface;
        private int segmentIndex;
        com.tencent.tav.decoder.DecoderAssetTrack videoAsset;

        private void checkCreateDecoder() {
            if (com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoder == null || !com.tencent.tav.extractor.ExtractorUtils.isSameExtractor(com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoder.extractor, this.videoAsset)) {
                if (com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoder == null) {
                    createDecoder();
                    return;
                }
                com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.TAG, "DecoderCreateThread create - " + this.videoAsset.assetPath);
                if (com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoder.decoder != null && com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoder.decoder != com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.currentDecoder) {
                    releaseNextDecoder();
                }
                createDecoder();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void createDecoder() {
            com.tencent.tav.decoder.IVideoDecoder optimizedFrameSamplingVideoDecoder;
            if (com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.segments == null || this.segmentIndex >= com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.segments.size()) {
                return;
            }
            com.tencent.tav.decoder.IVideoDecoder iVideoDecoder = null;
            java.lang.Object[] objArr = 0;
            try {
                android.view.Surface surface = this.outputSurface;
                com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack = this.videoAsset;
                if (decoderAssetTrack.sourceType == 3) {
                    optimizedFrameSamplingVideoDecoder = new com.tencent.tav.decoder.ImageDecoder();
                    try {
                        com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.free(surface);
                        optimizedFrameSamplingVideoDecoder.init(this.videoAsset.assetPath, com.tencent.tav.decoder.ImageDecoder.IMAGE_DECODE_SIZE, null);
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        iVideoDecoder = optimizedFrameSamplingVideoDecoder;
                        com.tencent.tav.decoder.logger.Logger.e(com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.TAG, "createDecoder: ", e);
                        com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.tryReleaseDecoder(iVideoDecoder);
                        return;
                    }
                } else {
                    optimizedFrameSamplingVideoDecoder = new com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder(decoderAssetTrack.assetPath, (com.tencent.tav.decoder.RenderContext) com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.surfaceCreator, surface, com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.surfaceCreator.videoTextureForSurface(this.outputSurface), com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.decoderFactory, com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.videoComposition, com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.outputFrameDuration);
                }
                optimizedFrameSamplingVideoDecoder.start(com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.getSegment(this.segmentIndex).getTimeRange(), com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.getSegment(this.segmentIndex).getDecoderStartTime());
                com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack optimizedFrameSamplingVideoDecoderTrack = com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this;
                optimizedFrameSamplingVideoDecoderTrack.nextDecoder = new com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.DecoderWrapper();
                com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoder.outputSurface = surface;
                com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoder.decoder = optimizedFrameSamplingVideoDecoder;
                com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoder.extractor = this.videoAsset;
                com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoder.segmentIndex = this.segmentIndex;
                ((com.tencent.tav.report.AverageTimeReporter) com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.preReadReporters.get(this.segmentIndex)).add(optimizedFrameSamplingVideoDecoder.getPreReadCost());
                com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.TAG, "DecoderCreateThread success - " + this.videoAsset.assetPath);
            } catch (java.lang.Exception e18) {
                e = e18;
            }
        }

        private void releaseNextDecoder() {
            synchronized (com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoderLock) {
                if (com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoder != null) {
                    com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoder.release();
                    com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoder = null;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DecoderCreateThread start - ");
            sb6.append(this.videoAsset.assetPath);
            sb6.append(" - ");
            sb6.append(this.outputSurface != null);
            com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.TAG, sb6.toString());
            if (com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.isReleased) {
                com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.decoderCreateThread = null;
                return;
            }
            synchronized (com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.nextDecoderLock) {
                checkCreateDecoder();
            }
            com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.decoderCreateThread = null;
            if (com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.isReleased) {
                releaseNextDecoder();
            }
            com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.TAG, "DecoderCreateThread finish - " + this.videoAsset.assetPath);
        }

        private DecoderCreateThread(com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack, android.view.Surface surface, int i17) {
            super("DecoderCreateThread " + decoderAssetTrack.assetPath);
            this.videoAsset = decoderAssetTrack;
            this.outputSurface = surface;
            this.segmentIndex = i17;
        }
    }

    /* loaded from: classes16.dex */
    public class DecoderWrapper {
        com.tencent.tav.decoder.IVideoDecoder decoder;
        com.tencent.tav.decoder.DecoderAssetTrack extractor;
        android.view.Surface outputSurface;
        int segmentIndex;

        private DecoderWrapper() {
            this.segmentIndex = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void release() {
            com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.TAG, "Video DecoderWrapper release: ");
            com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.tryReleaseDecoder(this.decoder);
        }
    }

    /* loaded from: classes16.dex */
    public class ReleaseDecoderThread extends java.lang.Thread {
        private com.tencent.tav.decoder.IVideoDecoder decoder;

        public ReleaseDecoderThread(com.tencent.tav.decoder.IVideoDecoder iVideoDecoder) {
            super("ReleaseDecoderThread");
            this.decoder = iVideoDecoder;
        }

        private void doRelease() {
            if (this.decoder != null) {
                com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.TAG, "ReleaseDecoderThread start");
                this.decoder.release(true);
                com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.this.free(this.decoder.outputSurface());
                this.decoder = null;
                com.tencent.tav.decoder.logger.Logger.d(com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.TAG, "ReleaseDecoderThread end");
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            doRelease();
        }

        @Override // java.lang.Thread
        public void start() {
            if (!(this.decoder instanceof com.tencent.tav.decoder.VideoDecoder)) {
                doRelease();
            }
            super.start();
        }
    }

    public OptimizedFrameSamplingVideoDecoderTrack(com.tencent.tav.asset.AssetTrack assetTrack, com.tencent.tav.codec.IDecoderFactory iDecoderFactory) {
        java.util.ArrayList<com.tencent.tav.report.AverageTimeReporter> arrayList = new java.util.ArrayList<>();
        this.preReadReporters = arrayList;
        this.segmentIndex = -1;
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        this.currentSegmentStartTime = cMTime;
        this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState();
        this.decoderCreateThread = null;
        this.nextDecoderLock = new java.lang.Object();
        this.currentDecoderLock = new java.lang.Object();
        this.nextFrameDecoderLock = new java.lang.Object();
        this.isReleased = false;
        this.duration = cMTime;
        this.surfaceCreator = null;
        this.decodeReporter = new com.tencent.tav.report.AverageTimeReporter();
        this.started = false;
        this.decodeError = false;
        this.decodeException = null;
        this.decoderFactory = iDecoderFactory;
        this.trackId = assetTrack.getTrackID();
        java.util.List segments = assetTrack.getSegments();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList.clear();
        java.util.Iterator it = segments.iterator();
        while (it.hasNext()) {
            arrayList2.add(new com.tencent.tav.decoder.DecoderTrackSegment(assetTrack, (com.tencent.tav.asset.AssetTrackSegment) it.next()));
            this.preReadReporters.add(new com.tencent.tav.report.AverageTimeReporter());
        }
        setTrackSegments(arrayList2);
        setFrameRate(getFrameRate() > 0 ? getFrameRate() : (int) assetTrack.getNominalFrameRate());
        setVolume(assetTrack.getPreferredVolume());
        setDecodeType(com.tencent.tav.decoder.IDecoder.DecodeType.Video);
        if (assetTrack.getTimeRange() != null) {
            clipRangeAndClearRange(assetTrack.getTimeRange().m414clone());
        }
    }

    private com.tencent.tav.coremedia.CMTime ceilAlignToOutputFrameDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        return this.outputFrameDuration.multi((int) java.lang.Math.ceil(cMTime.getTimeSeconds() / this.outputFrameDuration.getTimeSeconds()));
    }

    private void clipRangeAndRemoveRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        if (cMTimeRange == null || cMTimeRange.getDurationUs() <= 0 || this.segments.isEmpty()) {
            return;
        }
        com.tencent.tav.coremedia.CMTime start = cMTimeRange.getStart();
        com.tencent.tav.coremedia.CMTime end = cMTimeRange.getEnd();
        int findSegmentIndexAt = findSegmentIndexAt(start, false);
        if (findSegmentIndexAt == -1) {
            return;
        }
        int findSegmentIndexAt2 = findSegmentIndexAt(end, false);
        if (findSegmentIndexAt2 == -1) {
            findSegmentIndexAt2 = this.segments.size() - 1;
        } else if (getSegmentStartTime(findSegmentIndexAt2) == end) {
            findSegmentIndexAt2--;
        }
        com.tencent.tav.coremedia.CMTime segmentStartTime = getSegmentStartTime(findSegmentIndexAt);
        com.tencent.tav.coremedia.CMTime segmentStartTime2 = getSegmentStartTime(findSegmentIndexAt2);
        com.tencent.tav.decoder.DecoderTrackSegment segment = getSegment(findSegmentIndexAt);
        com.tencent.tav.decoder.DecoderTrackSegment segment2 = getSegment(findSegmentIndexAt2);
        if (segment2.getTimeRange().getDurationUs() > 0 && !getSegmentStartTime(findSegmentIndexAt2 + 1).smallThan(cMTimeRange.getEnd())) {
            com.tencent.tav.coremedia.CMTime sub = cMTimeRange.getEnd().sub(segmentStartTime2);
            segment2.setTimeRange(new com.tencent.tav.coremedia.CMTimeRange(segment2.getTimeRange().getStart(), sub.divide((((float) segment2.getScaledDuration().getTimeUs()) * 1.0f) / ((float) segment2.getTimeRange().getDurationUs()))));
            segment2.setScaledDuration(sub);
        }
        if (segment.getTimeRange().getDurationUs() > 0) {
            float timeUs = (((float) segment.getScaledDuration().getTimeUs()) * 1.0f) / ((float) segment.getTimeRange().getDurationUs());
            com.tencent.tav.coremedia.CMTime sub2 = cMTimeRange.getStart().sub(segmentStartTime);
            com.tencent.tav.coremedia.CMTime divide = sub2.divide(timeUs);
            segment.setTimeRange(new com.tencent.tav.coremedia.CMTimeRange(segment.getTimeRange().getStart().add(divide), segment.getTimeRange().getDuration().sub(divide)));
            segment.setScaledDuration(segment.getScaledDuration().sub(sub2));
        }
        for (int size = this.segments.size() - 1; size >= 0; size--) {
            if (size > findSegmentIndexAt2 || size < findSegmentIndexAt) {
                this.segments.remove(size);
            }
        }
        if (getSegmentStartTime(findSegmentIndexAt2 + 1).smallThan(cMTimeRange.getEnd())) {
            this.segments.add(new com.tencent.tav.decoder.DecoderTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, end.sub(segment2.getScaledDuration().add(segmentStartTime2))), (com.tencent.tav.decoder.DecoderAssetTrack) null));
        }
        updateTotalDuration();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:18|(4:22|74|43|44)|(2:48|49)|(2:51|(12:53|54|55|56|57|(5:91|92|94|95|96)(4:59|60|61|62)|63|64|65|66|68|69))|105|55|56|57|(0)(0)|63|64|65|66|68|69) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:18|(4:22|74|43|44)|48|49|(2:51|(12:53|54|55|56|57|(5:91|92|94|95|96)(4:59|60|61|62)|63|64|65|66|68|69))|105|55|56|57|(0)(0)|63|64|65|66|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01bf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f3, code lost:
    
        r5.release(true);
        free(r5.outputSurface());
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d A[Catch: Exception -> 0x01cd, all -> 0x0218, TryCatch #2 {Exception -> 0x01cd, blocks: (B:49:0x0149, B:51:0x014d, B:53:0x0153), top: B:48:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017c A[Catch: Exception -> 0x01c7, all -> 0x0218, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0007, B:10:0x0010, B:13:0x002a, B:16:0x003a, B:18:0x0040, B:20:0x004c, B:22:0x005a, B:23:0x0074, B:47:0x00cb, B:49:0x0149, B:51:0x014d, B:53:0x0153, B:56:0x0160, B:92:0x0165, B:95:0x016a, B:63:0x019d, B:66:0x01a3, B:72:0x01d1, B:75:0x0202, B:77:0x0206, B:79:0x020e, B:87:0x01ff, B:59:0x017c, B:62:0x0199, B:109:0x00cc, B:111:0x00e8, B:113:0x00f0, B:115:0x00f6, B:116:0x00f8, B:140:0x0148, B:118:0x00f9, B:120:0x00fd, B:122:0x0101, B:125:0x0105, B:127:0x010d, B:128:0x0118, B:131:0x012b, B:132:0x0141, B:136:0x0144, B:25:0x0075, B:27:0x0079, B:29:0x0081, B:32:0x0087, B:34:0x008f, B:35:0x009a, B:38:0x00ad, B:39:0x00c3, B:43:0x00c6, B:83:0x01f3), top: B:3:0x0007, inners: #3, #7, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0202 A[Catch: all -> 0x0218, TryCatch #5 {, blocks: (B:4:0x0007, B:10:0x0010, B:13:0x002a, B:16:0x003a, B:18:0x0040, B:20:0x004c, B:22:0x005a, B:23:0x0074, B:47:0x00cb, B:49:0x0149, B:51:0x014d, B:53:0x0153, B:56:0x0160, B:92:0x0165, B:95:0x016a, B:63:0x019d, B:66:0x01a3, B:72:0x01d1, B:75:0x0202, B:77:0x0206, B:79:0x020e, B:87:0x01ff, B:59:0x017c, B:62:0x0199, B:109:0x00cc, B:111:0x00e8, B:113:0x00f0, B:115:0x00f6, B:116:0x00f8, B:140:0x0148, B:118:0x00f9, B:120:0x00fd, B:122:0x0101, B:125:0x0105, B:127:0x010d, B:128:0x0118, B:131:0x012b, B:132:0x0141, B:136:0x0144, B:25:0x0075, B:27:0x0079, B:29:0x0081, B:32:0x0087, B:34:0x008f, B:35:0x009a, B:38:0x00ad, B:39:0x00c3, B:43:0x00c6, B:83:0x01f3), top: B:3:0x0007, inners: #3, #7, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized com.tencent.tav.decoder.IVideoDecoder createDecoder(com.tencent.tav.decoder.DecoderTrackSegment r20, com.tencent.tav.coremedia.CMTime r21) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.createDecoder(com.tencent.tav.decoder.DecoderTrackSegment, com.tencent.tav.coremedia.CMTime):com.tencent.tav.decoder.IVideoDecoder");
    }

    private void createNextDecoder(int i17) {
        int i18;
        java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> arrayList = this.segments;
        if (arrayList == null || !PRE_READ || (i18 = i17 + 1) >= arrayList.size() || this.decoderCreateThread != null) {
            return;
        }
        com.tencent.tav.decoder.DecoderAssetTrack videoAsset = getSegment(i18).getVideoAsset();
        if (videoAsset != null) {
            com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.DecoderWrapper decoderWrapper = this.nextDecoder;
            if (decoderWrapper == null || !com.tencent.tav.extractor.ExtractorUtils.isSameExtractor(decoderWrapper.extractor, videoAsset)) {
                createDecoder(videoAsset, i18);
                return;
            }
            return;
        }
        com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.DecoderWrapper decoderWrapper2 = this.nextDecoder;
        if (decoderWrapper2 == null || decoderWrapper2.segmentIndex == i17) {
            return;
        }
        decoderWrapper2.decoder.start(getSegment(i17).getTimeRange());
        this.nextDecoder.segmentIndex = i17;
    }

    private com.tencent.tav.coremedia.CMSampleBuffer createSampleBufferFromError(long j17) {
        return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(j17));
    }

    private synchronized com.tencent.tav.coremedia.CMSampleBuffer doReadSample(com.tencent.tav.coremedia.CMTime cMTime) {
        return doReadSample(cMTime, false);
    }

    private int findSegmentIndexAt(com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        boolean z18;
        com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        java.util.Iterator<com.tencent.tav.decoder.DecoderTrackSegment> it = this.segments.iterator();
        boolean z19 = false;
        int i17 = 0;
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                break;
            }
            com.tencent.tav.coremedia.CMTime segmentAlignedScaledDuration = getSegmentAlignedScaledDuration(it.next());
            if (cMTime.compare(cMTime2) >= 0 && cMTime.smallThan(cMTime2.add(segmentAlignedScaledDuration))) {
                z19 = true;
                break;
            }
            cMTime2 = cMTime2.add(segmentAlignedScaledDuration);
            i17++;
        }
        if (z19 || cMTime != cMTime2 || i17 <= 0 || !z17) {
            z18 = z19;
        } else {
            i17--;
        }
        if (z18) {
            return i17;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void free(android.view.Surface surface) {
        if (surface != null) {
            try {
                this.surfaceCreator.free(surface);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private com.tencent.tav.decoder.DecoderTrackSegment getCurrentSegment() {
        return getSegment(this.segmentIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.tav.decoder.DecoderTrackSegment getSegment(int i17) {
        return this.segments.get(i17);
    }

    private com.tencent.tav.coremedia.CMTime getSegmentAlignedScaledDuration(com.tencent.tav.decoder.DecoderTrackSegment decoderTrackSegment) {
        return ceilAlignToOutputFrameDuration(decoderTrackSegment.getScaledDuration());
    }

    private com.tencent.tav.coremedia.CMTime getSegmentStartTime(int i17) {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        for (int i18 = 0; i18 < i17 && i18 < this.segments.size(); i18++) {
            cMTime = com.tencent.tav.coremedia.CMTime.add(cMTime, getSegmentAlignedScaledDuration(getSegment(i18)));
        }
        return cMTime;
    }

    private void logVerbose(java.lang.String str) {
        com.tencent.tav.decoder.logger.Logger.v(TAG, str);
    }

    private boolean nextSegment(boolean z17) {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "nextSegment:" + z17);
        int i17 = this.segmentIndex + 1;
        this.segmentIndex = i17;
        this._outputSurface = null;
        if (i17 >= this.segments.size()) {
            this.segmentIndex = -1;
            return false;
        }
        com.tencent.tav.coremedia.CMTime segmentStartTime = getSegmentStartTime(this.segmentIndex);
        this.currentSegmentStartTime = segmentStartTime;
        this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(segmentStartTime);
        com.tencent.tav.decoder.DecoderTrackSegment currentSegment = getCurrentSegment();
        if (currentSegment.getVideoAsset() != null) {
            synchronized (this.currentDecoderLock) {
                com.tencent.tav.decoder.IVideoDecoder iVideoDecoder = this.currentDecoder;
                if (iVideoDecoder != null && iVideoDecoder.getSourcePath() != null) {
                    new com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.ReleaseDecoderThread(this.currentDecoder).start();
                    this.currentDecoder = null;
                }
            }
            com.tencent.tav.decoder.IVideoDecoder createDecoder = createDecoder(currentSegment, z17 ? getCurrentSegment().getDecoderStartTime() : com.tencent.tav.coremedia.CMTime.CMTimeInvalid);
            synchronized (this.currentDecoderLock) {
                this.currentDecoder = createDecoder;
                if (createDecoder != null && createDecoder.hasTrack()) {
                    if (z17) {
                        this.currentDecoder.seekTo(currentSegment.getDecoderStartTime());
                    }
                    this._outputSurface = this.currentDecoder.outputSurface();
                }
            }
        } else {
            com.tencent.tav.decoder.logger.Logger.d(TAG, "nextSegment: videoAsset is null");
            synchronized (this.currentDecoderLock) {
                if (this.currentDecoder != null) {
                    new com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.ReleaseDecoderThread(this.currentDecoder).start();
                    this.currentDecoder = null;
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nextSegment:");
        sb6.append(this.currentDecoder == null);
        com.tencent.tav.decoder.logger.Logger.d(TAG, sb6.toString());
        return true;
    }

    private void release(android.view.Surface surface) {
        if (surface != null) {
            try {
                surface.release();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private void releaseDecoder() {
        if (this.currentDecoder == null) {
            return;
        }
        synchronized (this.currentDecoderLock) {
            com.tencent.tav.decoder.IVideoDecoder iVideoDecoder = this.currentDecoder;
            if (iVideoDecoder != null && iVideoDecoder.getSourcePath() != null) {
                this.decodeReporter.add(this.currentDecoder.getDecodePerformance());
                new com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.ReleaseDecoderThread(this.currentDecoder).start();
                this.currentDecoder = null;
            }
        }
    }

    private com.tencent.tav.coremedia.CMTime segmentsDuration() {
        return getSegmentStartTime(this.segments.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryReleaseDecoder(com.tencent.tav.decoder.IVideoDecoder iVideoDecoder) {
        if (iVideoDecoder != null) {
            try {
                iVideoDecoder.release(true);
                free(iVideoDecoder.outputSurface());
            } catch (java.lang.Exception e17) {
                com.tencent.tav.decoder.logger.Logger.e(TAG, "tryReleaseDecoder Exception, ignore", e17);
            }
        }
    }

    private void updateTotalDuration() {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        java.util.Iterator<com.tencent.tav.decoder.DecoderTrackSegment> it = this.segments.iterator();
        while (it.hasNext()) {
            cMTime = cMTime.add(getSegmentAlignedScaledDuration(it.next()));
        }
        this.duration = cMTime;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public synchronized void asyncReadNextSample(com.tencent.tav.coremedia.CMTime cMTime) {
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void clipRangeAndClearRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        if (cMTimeRange == null || cMTimeRange.getDurationUs() <= 0 || this.segments.size() == 0) {
            return;
        }
        com.tencent.tav.coremedia.CMTime start = cMTimeRange.getStart();
        com.tencent.tav.coremedia.CMTime end = cMTimeRange.getEnd();
        com.tencent.tav.coremedia.CMTime segmentsDuration = segmentsDuration();
        clipRangeAndRemoveRange(cMTimeRange);
        if (start.getValue() != 0) {
            this.segments.add(0, new com.tencent.tav.decoder.DecoderTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, start), (com.tencent.tav.decoder.DecoderAssetTrack) null));
        }
        if (end.getTimeUs() < segmentsDuration.getTimeUs()) {
            this.segments.add(new com.tencent.tav.decoder.DecoderTrackSegment(new com.tencent.tav.coremedia.CMTimeRange(end, new com.tencent.tav.coremedia.CMTime(segmentsDuration.getTimeSeconds() - end.getTimeSeconds())), (com.tencent.tav.decoder.DecoderAssetTrack) null));
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getCurrentSampleTime() {
        return this.lastSampleState.getTime();
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.report.AverageTimeReporter getDecodePerformance() {
        return this.decodeReporter;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getDuration() {
        if (this.duration == com.tencent.tav.coremedia.CMTime.CMTimeZero) {
            updateTotalDuration();
        }
        return this.duration;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getFrameDuration() {
        return this.outputFrameDuration;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public int getFrameRate() {
        return (int) (1.0f / this.outputFrameDuration.getTimeSeconds());
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public long getLaggingTime() {
        long j17 = 0;
        for (int i17 = 1; i17 < this.preReadReporters.size(); i17++) {
            j17 += java.lang.Math.max(0L, this.preReadReporters.get(i17).average() - (this.segments.get(i17).getScaledDuration().getTimeUs() / 1000));
        }
        return j17;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public int getTrackId() {
        return this.trackId;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer readSample() {
        if (this.lastSampleState.isInvalid()) {
            return readSample(com.tencent.tav.coremedia.CMTime.CMTimeZero);
        }
        return readSample(this.lastSampleState.getTime().add(this.outputFrameDuration));
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer seekTo(com.tencent.tav.coremedia.CMTime cMTime, boolean z17, boolean z18) {
        logVerbose("seekTo:[time " + cMTime + "] [needRead " + z17 + "] [quickSeek " + z18 + "]");
        synchronized (this) {
            if (this.started && !this.isReleased) {
                int findSegmentIndexAt = findSegmentIndexAt(cMTime, true);
                if (findSegmentIndexAt == -1) {
                    this.segmentIndex = -1;
                    com.tencent.tav.decoder.logger.Logger.e(TAG, "seekTo: [failed] [index " + findSegmentIndexAt + "]");
                    return null;
                }
                com.tencent.tav.coremedia.CMTime segmentStartTime = getSegmentStartTime(findSegmentIndexAt);
                if (this.segmentIndex != findSegmentIndexAt || this.currentDecoder == null) {
                    this.segmentIndex = findSegmentIndexAt - 1;
                    nextSegment(false);
                }
                com.tencent.tav.coremedia.CMTime sub = cMTime.sub(segmentStartTime);
                com.tencent.tav.decoder.DecoderTrackSegment currentSegment = getCurrentSegment();
                com.tencent.tav.decoder.IVideoDecoder iVideoDecoder = this.currentDecoder;
                if (iVideoDecoder == null) {
                    this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime);
                    com.tencent.tav.decoder.logger.Logger.e(TAG, "seekTo: [failed] [currentDecoder == null]");
                    return null;
                }
                iVideoDecoder.seekTo(currentSegment.getDecoderStartTime().add(sub), z18);
                if (cMTime.bigThan(this.outputFrameDuration)) {
                    this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime.sub(this.outputFrameDuration));
                } else {
                    this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime);
                }
                com.tencent.tav.coremedia.CMSampleBuffer readSample = z17 ? readSample() : null;
                logVerbose("seekTo: [success] [lastSampleState " + this.lastSampleState + "] [sampleBuffer " + readSample + "]");
                return readSample;
            }
            com.tencent.tav.decoder.logger.Logger.e(TAG, "seekTo: [failed] [started " + this.started + "] [isReleased " + this.isReleased + "]");
            return null;
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setDecodeType(com.tencent.tav.decoder.IDecoder.DecodeType decodeType) {
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setFrameRate(int i17) {
        this.outputFrameDuration = new com.tencent.tav.coremedia.CMTime(600 / i17, 600);
        updateTotalDuration();
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setLogger(com.tencent.tav.decoder.logger.WXLogger wXLogger) {
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setTrackSegments(java.util.List<com.tencent.tav.decoder.DecoderTrackSegment> list) {
        if (this.segments == null) {
            this.segments = new java.util.ArrayList<>();
        }
        this.segments.clear();
        this.segments.addAll(list);
    }

    public void setVideoComposition(com.tencent.tav.core.composition.VideoComposition videoComposition) {
        this.videoComposition = videoComposition;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setVolume(float f17) {
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start() {
        start(null);
    }

    private com.tencent.tav.coremedia.CMSampleBuffer createSampleBufferFromError(long j17, java.lang.String str, java.lang.Throwable th6) {
        return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(j17, str, th6));
    }

    private synchronized com.tencent.tav.coremedia.CMSampleBuffer doReadSample(com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        com.tencent.tav.coremedia.CMSampleBuffer readVideoSampleBuffer;
        com.tencent.tav.coremedia.CMSampleBuffer createSampleBufferFromError;
        logVerbose("doReadSample: step 1 ");
        if (this.isReleased) {
            return createSampleBufferFromError(-100L);
        }
        if (cMTime == null) {
            return createSampleBufferFromError(-3L);
        }
        if (this.segmentIndex == -1) {
            if (this.lastSampleState.getStateCode() >= -1) {
                createSampleBufferFromError = createSampleBufferFromError(-1L);
            } else {
                createSampleBufferFromError = createSampleBufferFromError(-100L);
            }
            return createSampleBufferFromError;
        }
        com.tencent.tav.decoder.DecoderTrackSegment currentSegment = getCurrentSegment();
        while (true) {
            logVerbose("doReadSample: step 2 ");
            if (this.currentDecoder == null) {
                if (this.lastSampleState.isInvalid()) {
                    this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(com.tencent.tav.coremedia.CMTime.CMTimeZero);
                } else {
                    this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(this.lastSampleState.getTime().add(this.outputFrameDuration));
                }
                if (this.lastSampleState.getTime().smallThan(this.currentSegmentStartTime.add(getSegmentAlignedScaledDuration(currentSegment)))) {
                    return createSampleBufferFromError(-3L, "Failed to create decoder", null);
                }
                readVideoSampleBuffer = createSampleBufferFromError(-1L);
            } else {
                com.tencent.tav.coremedia.CMTime limitMin = cMTime.sub(this.currentSegmentStartTime).limitMin(com.tencent.tav.coremedia.CMTime.CMTimeZero);
                if (!limitMin.smallThan(getSegmentAlignedScaledDuration(currentSegment))) {
                    readVideoSampleBuffer = createSampleBufferFromError(-1L);
                } else {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    com.tencent.tav.coremedia.CMTime add = limitMin.add(currentSegment.getDecoderStartTime());
                    com.tencent.tav.decoder.IVideoDecoder iVideoDecoder = this.currentDecoder;
                    if (iVideoDecoder == null) {
                        readVideoSampleBuffer = createSampleBufferFromError(-100L);
                    } else {
                        readVideoSampleBuffer = iVideoDecoder.readVideoSampleBuffer(add);
                    }
                    com.tencent.tav.decoder.logger.Logger.v(TAG, "readVideoSampleBuffer cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            }
            if (!readVideoSampleBuffer.getState().stateMatchingTo(-1)) {
                if (readVideoSampleBuffer.getState().getStateCode() < 0) {
                    return readVideoSampleBuffer;
                }
                logVerbose("doReadSample: step 3 ");
                com.tencent.tav.coremedia.CMSampleState state = readVideoSampleBuffer.getState();
                com.tencent.tav.coremedia.CMTime sub = state.getTime().sub(currentSegment.getDecoderStartTime());
                if (sub.bigThan(currentSegment.getTimeRange().getDuration())) {
                    sub = currentSegment.getTimeRange().getDuration();
                }
                com.tencent.tav.coremedia.CMSampleState cMSampleState = new com.tencent.tav.coremedia.CMSampleState(this.currentSegmentStartTime.add(sub), state.performance);
                logVerbose("readSample: currentTime = " + cMTime + "  sampleState = " + cMSampleState);
                return new com.tencent.tav.coremedia.CMSampleBuffer(cMSampleState, readVideoSampleBuffer.getTextureInfo());
            }
            if (z17) {
                com.tencent.tav.decoder.logger.Logger.d(TAG, "async read finish , skip it!");
                return null;
            }
            if (!nextSegment(true)) {
                return createSampleBufferFromError(-1L);
            }
            currentSegment = getCurrentSegment();
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public synchronized void release() {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "release: start " + this);
        this.isReleased = true;
        this.segments.clear();
        com.tencent.tav.decoder.IVideoDecoder iVideoDecoder = this.currentDecoder;
        if (iVideoDecoder != null) {
            this.decodeReporter.add(iVideoDecoder.getDecodePerformance());
            this.currentDecoder.release(true);
            release(this.currentDecoder.outputSurface());
            this.currentDecoder = null;
        }
        synchronized (this.nextDecoderLock) {
            com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.DecoderWrapper decoderWrapper = this.nextDecoder;
            if (decoderWrapper != null) {
                decoderWrapper.release();
                this.nextDecoder = null;
            }
        }
        com.tencent.tav.decoder.logger.Logger.d(TAG, "release: finish");
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator) {
        start(surfaceCreator, null);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "VideoDecoderTrack start:" + cMTimeRange);
        if (this.segments.size() == 0) {
            release();
            return;
        }
        this.isReleased = false;
        this.started = true;
        this.surfaceCreator = surfaceCreator;
        this.segmentIndex = -1;
        clipRangeAndRemoveRange(cMTimeRange);
        nextSegment(true);
        com.tencent.tav.decoder.logger.Logger.d(TAG, "VideoDecoderTrack start finish:");
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer readSample(com.tencent.tav.coremedia.CMTime cMTime) {
        logVerbose("readSample: start expectFrameTime = " + cMTime);
        if (this.isReleased) {
            releaseDecoder();
            return createSampleBufferFromError(-100L);
        }
        if (cMTime.bigThan(getDuration())) {
            releaseDecoder();
            return createSampleBufferFromError(-1L);
        }
        if (this.decodeError) {
            com.tencent.tav.decoder.logger.Logger.w(TAG, "skip this frame by decode error, expectFrameTime = " + cMTime);
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromExportError(-3L, -201, "", this.decodeException));
        }
        com.tencent.tav.coremedia.CMSampleBuffer doReadSample = doReadSample(cMTime);
        createNextDecoder(this.segmentIndex);
        com.tencent.tav.coremedia.CMSampleState cMSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime);
        this.lastSampleState = cMSampleState;
        cMSampleState.performance = doReadSample.getState().performance;
        logVerbose("readSample: step 4 ");
        return doReadSample;
    }

    private void createDecoder(com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack, int i17) {
        com.tencent.tav.coremedia.CGSize cGSize;
        try {
            com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator = this.surfaceCreator;
            if (surfaceCreator == null || (cGSize = decoderAssetTrack.size) == null) {
                return;
            }
            com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.DecoderCreateThread decoderCreateThread = new com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack.DecoderCreateThread(decoderAssetTrack, surfaceCreator.createOutputSurface((int) cGSize.width, (int) cGSize.height, decoderAssetTrack.preferRotation), i17);
            this.decoderCreateThread = decoderCreateThread;
            decoderCreateThread.start();
        } catch (java.lang.Exception e17) {
            com.tencent.tav.decoder.logger.Logger.e(TAG, "createNextDecoder: try start DecoderCreateThread", e17);
        }
    }
}
