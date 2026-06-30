package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public class VideoDecoderTrack implements com.tencent.tav.decoder.IDecoderTrack {
    public static boolean LOG_VERBOSE = false;
    public static boolean PRE_READ = true;
    private static java.lang.String TAG = "VDecoderTrack";
    private android.view.Surface _outputSurface;
    private float _speed;
    private com.tencent.tav.decoder.IVideoDecoder currentDecoder;
    private final java.lang.Object currentDecoderLock;
    private com.tencent.tav.coremedia.CMSampleBuffer currentFrame;
    private com.tencent.tav.coremedia.CMTime currentSegmentStartTime;
    private boolean decodeError;
    private java.lang.Exception decodeException;
    private final com.tencent.tav.report.AverageTimeReporter decodeReporter;
    private com.tencent.tav.decoder.VideoDecoderTrack.DecoderCreateThread decoderCreateThread;
    private com.tencent.tav.codec.IDecoderFactory decoderFactory;
    private final com.tencent.tav.decoder.VideoDecoderTrack.DecoderThread decoderThread;
    private com.tencent.tav.coremedia.CMTime duration;
    private boolean isReleased;
    private com.tencent.tav.coremedia.CMSampleState lastSampleState;
    private com.tencent.tav.decoder.logger.WXLogger logger;
    private com.tencent.tav.decoder.VideoDecoderTrack.DecoderWrapper nextDecoder;
    private final java.lang.Object nextDecoderLock;
    private com.tencent.tav.coremedia.CMSampleBuffer nextFrame;
    private final java.lang.Object nextFrameDecoderLock;
    private boolean started;
    private com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator;
    private int trackId;
    private com.tencent.tav.core.composition.VideoComposition videoComposition;
    private com.tencent.tav.coremedia.CMTime frameDuration = new com.tencent.tav.coremedia.CMTime(1, 44);
    private int frameRate = 44;
    private java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> segments = new java.util.ArrayList<>();
    private java.util.ArrayList<com.tencent.tav.report.AverageTimeReporter> preReadReporters = new java.util.ArrayList<>();
    private com.tencent.tav.decoder.IDecoder.DecodeType decodeType = com.tencent.tav.decoder.IDecoder.DecodeType.Video;
    private int segmentIndex = -1;

    /* loaded from: classes16.dex */
    public class DecoderCreateThread extends java.lang.Thread {
        private android.view.Surface outputSurface;
        private int segmentIndex;
        com.tencent.tav.decoder.DecoderAssetTrack videoAsset;

        private void checkCreateDecoder() {
            if (com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoder == null || !com.tencent.tav.extractor.ExtractorUtils.isSameExtractor(com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoder.extractor, this.videoAsset)) {
                if (com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoder == null) {
                    createDecoder();
                    return;
                }
                com.tencent.tav.decoder.VideoDecoderTrack.this.logger.d(com.tencent.tav.decoder.VideoDecoderTrack.TAG, "DecoderCreateThread create - " + this.videoAsset.assetPath);
                if (com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoder.decoder != null && com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoder.decoder != com.tencent.tav.decoder.VideoDecoderTrack.this.currentDecoder) {
                    releaseNextDecoder();
                }
                createDecoder();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void createDecoder() {
            com.tencent.tav.decoder.IVideoDecoder videoDecoder;
            if (com.tencent.tav.decoder.VideoDecoderTrack.this.segments == null || this.segmentIndex >= com.tencent.tav.decoder.VideoDecoderTrack.this.segments.size()) {
                return;
            }
            com.tencent.tav.decoder.IVideoDecoder iVideoDecoder = null;
            java.lang.Object[] objArr = 0;
            try {
                android.view.Surface surface = this.outputSurface;
                com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack = this.videoAsset;
                if (decoderAssetTrack.sourceType == 3) {
                    videoDecoder = new com.tencent.tav.decoder.ImageDecoder();
                    try {
                        com.tencent.tav.decoder.VideoDecoderTrack.this.free(surface);
                        videoDecoder.init(this.videoAsset.assetPath, com.tencent.tav.decoder.ImageDecoder.IMAGE_DECODE_SIZE, null);
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        iVideoDecoder = videoDecoder;
                        com.tencent.tav.decoder.VideoDecoderTrack.this.logger.e(com.tencent.tav.decoder.VideoDecoderTrack.TAG, "createDecoder: ", e);
                        com.tencent.tav.decoder.VideoDecoderTrack.this.tryReleaseDecoder(iVideoDecoder);
                        return;
                    }
                } else {
                    videoDecoder = new com.tencent.tav.decoder.VideoDecoder(decoderAssetTrack.assetPath, surface, com.tencent.tav.decoder.VideoDecoderTrack.this.surfaceCreator.videoTextureForSurface(this.outputSurface), com.tencent.tav.decoder.VideoDecoderTrack.this.decoderFactory, com.tencent.tav.decoder.VideoDecoderTrack.this.videoComposition);
                }
                videoDecoder.start(com.tencent.tav.decoder.VideoDecoderTrack.this.getSegment(this.segmentIndex).getTimeRange(), com.tencent.tav.decoder.VideoDecoderTrack.this.getSegment(this.segmentIndex).getDecoderStartTime());
                com.tencent.tav.decoder.VideoDecoderTrack videoDecoderTrack = com.tencent.tav.decoder.VideoDecoderTrack.this;
                videoDecoderTrack.nextDecoder = new com.tencent.tav.decoder.VideoDecoderTrack.DecoderWrapper();
                com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoder.outputSurface = surface;
                com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoder.decoder = videoDecoder;
                com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoder.extractor = this.videoAsset;
                com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoder.segmentIndex = this.segmentIndex;
                ((com.tencent.tav.report.AverageTimeReporter) com.tencent.tav.decoder.VideoDecoderTrack.this.preReadReporters.get(this.segmentIndex)).add(videoDecoder.getPreReadCost());
                com.tencent.tav.decoder.VideoDecoderTrack.this.logger.d(com.tencent.tav.decoder.VideoDecoderTrack.TAG, "DecoderCreateThread success - " + this.videoAsset.assetPath);
            } catch (java.lang.Exception e18) {
                e = e18;
            }
        }

        private void releaseNextDecoder() {
            synchronized (com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoderLock) {
                if (com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoder != null) {
                    com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoder.release();
                    com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoder = null;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            com.tencent.tav.decoder.logger.WXLogger wXLogger = com.tencent.tav.decoder.VideoDecoderTrack.this.logger;
            java.lang.String str = com.tencent.tav.decoder.VideoDecoderTrack.TAG;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DecoderCreateThread start - ");
            sb6.append(this.videoAsset.assetPath);
            sb6.append(" - ");
            sb6.append(this.outputSurface != null);
            wXLogger.d(str, sb6.toString());
            if (com.tencent.tav.decoder.VideoDecoderTrack.this.isReleased) {
                com.tencent.tav.decoder.VideoDecoderTrack.this.decoderCreateThread = null;
                return;
            }
            synchronized (com.tencent.tav.decoder.VideoDecoderTrack.this.nextDecoderLock) {
                checkCreateDecoder();
            }
            com.tencent.tav.decoder.VideoDecoderTrack.this.decoderCreateThread = null;
            if (com.tencent.tav.decoder.VideoDecoderTrack.this.isReleased) {
                releaseNextDecoder();
            }
            com.tencent.tav.decoder.VideoDecoderTrack.this.logger.d(com.tencent.tav.decoder.VideoDecoderTrack.TAG, "DecoderCreateThread finish - " + this.videoAsset.assetPath);
        }

        private DecoderCreateThread(com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack, android.view.Surface surface, int i17) {
            super("DecoderCreateThread " + decoderAssetTrack.assetPath);
            this.videoAsset = decoderAssetTrack;
            this.outputSurface = surface;
            this.segmentIndex = i17;
        }
    }

    /* loaded from: classes16.dex */
    public class DecoderThread extends com.tencent.tav.decoder.thread.ReActionHandlerThread {
        private static final java.lang.String NAME = "VideoDecoder";

        private void doActionInDecoderLock() {
            if (com.tencent.tav.decoder.VideoDecoderTrack.this.nextFrame == null) {
                return;
            }
            if (com.tencent.tav.decoder.VideoDecoderTrack.this.lastSampleState.isInvalid()) {
                com.tencent.tav.decoder.VideoDecoderTrack.this.logVerbose("DecoderThread doAction: CMTime.CMTimeZero");
                com.tencent.tav.decoder.VideoDecoderTrack videoDecoderTrack = com.tencent.tav.decoder.VideoDecoderTrack.this;
                videoDecoderTrack.nextFrame = videoDecoderTrack.doReadSample(com.tencent.tav.coremedia.CMTime.CMTimeZero, true);
            } else if (com.tencent.tav.decoder.VideoDecoderTrack.this.lastSampleState.getStateCode() >= 0) {
                com.tencent.tav.decoder.VideoDecoderTrack.this.logVerbose("DecoderThread doAction: lastSampleTime.add(frameDuration) ");
                com.tencent.tav.coremedia.CMSampleState state = com.tencent.tav.decoder.VideoDecoderTrack.this.nextFrame.getState();
                if (state != null) {
                    com.tencent.tav.decoder.VideoDecoderTrack videoDecoderTrack2 = com.tencent.tav.decoder.VideoDecoderTrack.this;
                    videoDecoderTrack2.nextFrame = videoDecoderTrack2.doReadSample(state.getTime(), true);
                } else {
                    com.tencent.tav.decoder.VideoDecoderTrack.this.logger.e(com.tencent.tav.decoder.VideoDecoderTrack.TAG, "frame state is null");
                    com.tencent.tav.decoder.VideoDecoderTrack.this.nextFrame = new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-211L));
                }
            }
        }

        @Override // com.tencent.tav.decoder.thread.ReActionHandlerThread
        public void doAction() {
            synchronized (com.tencent.tav.decoder.VideoDecoderTrack.this.nextFrameDecoderLock) {
                doActionInDecoderLock();
            }
        }

        private DecoderThread() {
            super(NAME);
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
            com.tencent.tav.decoder.VideoDecoderTrack.this.logger.d(com.tencent.tav.decoder.VideoDecoderTrack.TAG, "Video DecoderWrapper release: ");
            com.tencent.tav.decoder.VideoDecoderTrack.this.tryReleaseDecoder(this.decoder);
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
                com.tencent.tav.decoder.VideoDecoderTrack.this.logger.d(com.tencent.tav.decoder.VideoDecoderTrack.TAG, "ReleaseDecoderThread start");
                this.decoder.release(true);
                com.tencent.tav.decoder.VideoDecoderTrack.this.free(this.decoder.outputSurface());
                this.decoder = null;
                com.tencent.tav.decoder.VideoDecoderTrack.this.logger.d(com.tencent.tav.decoder.VideoDecoderTrack.TAG, "ReleaseDecoderThread end");
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

    public VideoDecoderTrack(com.tencent.tav.asset.AssetTrack assetTrack, com.tencent.tav.codec.IDecoderFactory iDecoderFactory) {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        this.currentSegmentStartTime = cMTime;
        this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState();
        this.decoderCreateThread = null;
        this.nextDecoderLock = new java.lang.Object();
        this.currentDecoderLock = new java.lang.Object();
        this.nextFrameDecoderLock = new java.lang.Object();
        this.isReleased = false;
        this.nextFrame = null;
        this.currentFrame = null;
        this.duration = cMTime;
        this.decoderThread = new com.tencent.tav.decoder.VideoDecoderTrack.DecoderThread();
        this.surfaceCreator = null;
        this.decodeReporter = new com.tencent.tav.report.AverageTimeReporter();
        this._speed = 1.0f;
        this.started = false;
        this.decodeError = false;
        this.decodeException = null;
        this.logger = new com.tencent.tav.decoder.logger.WXLogger();
        this.decoderFactory = iDecoderFactory;
        this.trackId = assetTrack.getTrackID();
        java.util.List segments = assetTrack.getSegments();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.preReadReporters.clear();
        java.util.Iterator it = segments.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.tencent.tav.decoder.DecoderTrackSegment(assetTrack, (com.tencent.tav.asset.AssetTrackSegment) it.next()));
            this.preReadReporters.add(new com.tencent.tav.report.AverageTimeReporter());
        }
        setTrackSegments(arrayList);
        setFrameRate(getFrameRate() > 0 ? getFrameRate() : (int) assetTrack.getNominalFrameRate());
        setVolume(assetTrack.getPreferredVolume());
        setDecodeType(com.tencent.tav.decoder.IDecoder.DecodeType.Video);
        if (assetTrack.getTimeRange() != null) {
            clipRangeAndClearRange(assetTrack.getTimeRange().m414clone());
        }
    }

    private void clipRangeAndRemoveRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        if (cMTimeRange == null || cMTimeRange.getDurationUs() <= 0 || this.segments.size() == 0) {
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
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:18|(4:22|78|43|44)|(2:48|49)|(2:51|(11:53|54|55|56|(4:58|59|60|61)(1:90)|62|63|64|65|67|68))|93|55|56|(0)(0)|62|63|64|65|67|68) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01bd, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01eb, code lost:
    
        r5.release(true);
        free(r5.outputSurface());
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157 A[Catch: Exception -> 0x01c3, all -> 0x0210, TryCatch #1 {, blocks: (B:4:0x0007, B:10:0x0010, B:13:0x002c, B:16:0x003c, B:18:0x0042, B:20:0x004e, B:22:0x005c, B:23:0x0078, B:47:0x00d1, B:49:0x0153, B:51:0x0157, B:53:0x015d, B:56:0x016a, B:58:0x016f, B:60:0x0174, B:62:0x0194, B:65:0x019f, B:70:0x01c7, B:73:0x01fa, B:75:0x01fe, B:77:0x0206, B:85:0x01f7, B:90:0x0180, B:97:0x00d2, B:99:0x00f0, B:101:0x00f8, B:103:0x00fe, B:104:0x0100, B:128:0x0152, B:106:0x0101, B:108:0x0105, B:110:0x0109, B:113:0x010d, B:115:0x0115, B:116:0x0120, B:119:0x0135, B:120:0x014b, B:124:0x014e, B:81:0x01eb, B:25:0x0079, B:27:0x007d, B:29:0x0085, B:32:0x008b, B:34:0x0093, B:35:0x009e, B:38:0x00b3, B:39:0x00c9, B:43:0x00cc), top: B:3:0x0007, inners: #0, #5, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016f A[Catch: Exception -> 0x01bf, all -> 0x0210, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0007, B:10:0x0010, B:13:0x002c, B:16:0x003c, B:18:0x0042, B:20:0x004e, B:22:0x005c, B:23:0x0078, B:47:0x00d1, B:49:0x0153, B:51:0x0157, B:53:0x015d, B:56:0x016a, B:58:0x016f, B:60:0x0174, B:62:0x0194, B:65:0x019f, B:70:0x01c7, B:73:0x01fa, B:75:0x01fe, B:77:0x0206, B:85:0x01f7, B:90:0x0180, B:97:0x00d2, B:99:0x00f0, B:101:0x00f8, B:103:0x00fe, B:104:0x0100, B:128:0x0152, B:106:0x0101, B:108:0x0105, B:110:0x0109, B:113:0x010d, B:115:0x0115, B:116:0x0120, B:119:0x0135, B:120:0x014b, B:124:0x014e, B:81:0x01eb, B:25:0x0079, B:27:0x007d, B:29:0x0085, B:32:0x008b, B:34:0x0093, B:35:0x009e, B:38:0x00b3, B:39:0x00c9, B:43:0x00cc), top: B:3:0x0007, inners: #0, #5, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0180 A[Catch: Exception -> 0x01bf, all -> 0x0210, TRY_ENTER, TryCatch #1 {, blocks: (B:4:0x0007, B:10:0x0010, B:13:0x002c, B:16:0x003c, B:18:0x0042, B:20:0x004e, B:22:0x005c, B:23:0x0078, B:47:0x00d1, B:49:0x0153, B:51:0x0157, B:53:0x015d, B:56:0x016a, B:58:0x016f, B:60:0x0174, B:62:0x0194, B:65:0x019f, B:70:0x01c7, B:73:0x01fa, B:75:0x01fe, B:77:0x0206, B:85:0x01f7, B:90:0x0180, B:97:0x00d2, B:99:0x00f0, B:101:0x00f8, B:103:0x00fe, B:104:0x0100, B:128:0x0152, B:106:0x0101, B:108:0x0105, B:110:0x0109, B:113:0x010d, B:115:0x0115, B:116:0x0120, B:119:0x0135, B:120:0x014b, B:124:0x014e, B:81:0x01eb, B:25:0x0079, B:27:0x007d, B:29:0x0085, B:32:0x008b, B:34:0x0093, B:35:0x009e, B:38:0x00b3, B:39:0x00c9, B:43:0x00cc), top: B:3:0x0007, inners: #0, #5, #8, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized com.tencent.tav.decoder.IVideoDecoder createDecoder(com.tencent.tav.decoder.DecoderTrackSegment r17, com.tencent.tav.coremedia.CMTime r18) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tav.decoder.VideoDecoderTrack.createDecoder(com.tencent.tav.decoder.DecoderTrackSegment, com.tencent.tav.coremedia.CMTime):com.tencent.tav.decoder.IVideoDecoder");
    }

    private void createNextDecoder(int i17) {
        int i18;
        java.util.ArrayList<com.tencent.tav.decoder.DecoderTrackSegment> arrayList = this.segments;
        if (arrayList == null || !PRE_READ || (i18 = i17 + 1) >= arrayList.size() || this.decoderCreateThread != null) {
            return;
        }
        com.tencent.tav.decoder.DecoderAssetTrack videoAsset = getSegment(i18).getVideoAsset();
        if (videoAsset != null) {
            com.tencent.tav.decoder.VideoDecoderTrack.DecoderWrapper decoderWrapper = this.nextDecoder;
            if (decoderWrapper == null || !com.tencent.tav.extractor.ExtractorUtils.isSameExtractor(decoderWrapper.extractor, videoAsset)) {
                createDecoder(videoAsset, i18);
                return;
            }
            return;
        }
        com.tencent.tav.decoder.VideoDecoderTrack.DecoderWrapper decoderWrapper2 = this.nextDecoder;
        if (decoderWrapper2 == null || decoderWrapper2.segmentIndex == i17) {
            return;
        }
        decoderWrapper2.decoder.start(getSegment(i17).getTimeRange());
        this.nextDecoder.segmentIndex = i17;
    }

    private com.tencent.tav.coremedia.CMSampleBuffer createSampleBuffer(boolean z17) {
        com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = this.currentFrame;
        if (cMSampleBuffer != null) {
            return createSampleBuffer(this.lastSampleState, cMSampleBuffer.getTextureInfo(), z17);
        }
        com.tencent.tav.coremedia.CMSampleState cMSampleState = this.lastSampleState;
        com.tencent.tav.decoder.IVideoDecoder iVideoDecoder = this.currentDecoder;
        return createSampleBuffer(cMSampleState, iVideoDecoder == null ? null : iVideoDecoder.getTextureInfo(), z17);
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
            com.tencent.tav.coremedia.CMTime scaledDuration = it.next().getScaledDuration();
            if (cMTime.compare(cMTime2) >= 0 && cMTime.smallThan(cMTime2.add(scaledDuration))) {
                z19 = true;
                break;
            }
            cMTime2 = cMTime2.add(scaledDuration);
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

    private com.tencent.tav.coremedia.CMTime getSegmentStartTime(int i17) {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        for (int i18 = 0; i18 < i17 && i18 < this.segments.size(); i18++) {
            cMTime = com.tencent.tav.coremedia.CMTime.add(cMTime, getSegment(i18).getScaledDuration());
        }
        return cMTime;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void logVerbose(java.lang.String str) {
        this.logger.v(TAG, str);
    }

    private boolean needSwitchNextFrame(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer, com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer2, com.tencent.tav.coremedia.CMTime cMTime) {
        if (cMSampleBuffer == null) {
            return true;
        }
        com.tencent.tav.coremedia.CMTime time = cMSampleBuffer2.getTime();
        com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        if (time.smallThan(cMTime2)) {
            return true;
        }
        long timeUs = cMSampleBuffer2.getTime().getTimeUs();
        long timeUs2 = cMTime.getTimeUs();
        if (cMSampleBuffer2.isNewFrame()) {
            for (int i17 = 0; i17 < this.segmentIndex && i17 < this.segments.size(); i17++) {
                cMTime2.add(this.segments.get(i17).getScaledDuration());
            }
            if (cMTime.bigThan(cMSampleBuffer.getTime()) && !cMTime.smallThan(cMTime2)) {
                return true;
            }
        }
        return java.lang.Math.abs(timeUs2) >= java.lang.Math.abs(timeUs);
    }

    private boolean nextSegment(boolean z17) {
        this.logger.d(TAG, "nextSegment:" + z17);
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
                    new com.tencent.tav.decoder.VideoDecoderTrack.ReleaseDecoderThread(this.currentDecoder).start();
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
            this.logger.d(TAG, "nextSegment: videoAsset is null");
            synchronized (this.currentDecoderLock) {
                if (this.currentDecoder != null) {
                    new com.tencent.tav.decoder.VideoDecoderTrack.ReleaseDecoderThread(this.currentDecoder).start();
                    this.currentDecoder = null;
                }
            }
        }
        if (currentSegment.getScaledDuration().getTimeUs() > 0) {
            this._speed = (((float) currentSegment.getTimeRange().getDurationUs()) * 1.0f) / ((float) currentSegment.getScaledDuration().getTimeUs());
        }
        com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
        java.lang.String str = TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("nextSegment:");
        sb6.append(this.currentDecoder == null);
        sb6.append(" ");
        sb6.append(this._speed);
        wXLogger.d(str, sb6.toString());
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
                new com.tencent.tav.decoder.VideoDecoderTrack.ReleaseDecoderThread(this.currentDecoder).start();
                this.currentDecoder = null;
            }
        }
    }

    private com.tencent.tav.coremedia.CMTime segmentsDuration() {
        return getSegmentStartTime(this.segments.size());
    }

    private com.tencent.tav.coremedia.CMSampleBuffer switchToNextFrame() {
        com.tencent.tav.decoder.VideoTexture texture;
        this.currentFrame = createSampleBuffer(this.nextFrame.getState(), this.nextFrame.getTextureInfo(), this.nextFrame.isNewFrame());
        if (this.nextFrame.isNewFrame()) {
            com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = this.nextFrame;
            if ((cMSampleBuffer instanceof com.tencent.tav.decoder.CacheSampleBuffer) && (texture = ((com.tencent.tav.decoder.CacheSampleBuffer) cMSampleBuffer).getTexture()) != null && !java.lang.Thread.currentThread().getName().equals("VideoDecoder")) {
                logVerbose("readSample: awaitNewImage: " + this.nextFrame.getTime());
                try {
                    texture.awaitNewImage();
                } catch (java.lang.Throwable th6) {
                    this.logger.e(TAG, "readSample: videoTexture.awaitNewImage() error", th6);
                    return createSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-3L));
                }
            }
        }
        this.nextFrame = createSampleBuffer(new com.tencent.tav.coremedia.CMSampleState());
        if (!this.currentFrame.getTime().smallThan(com.tencent.tav.coremedia.CMTime.CMTimeZero)) {
            return null;
        }
        this.lastSampleState = this.currentFrame.getState();
        return createSampleBuffer(this.currentFrame.getState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryReleaseDecoder(com.tencent.tav.decoder.IVideoDecoder iVideoDecoder) {
        if (iVideoDecoder != null) {
            try {
                iVideoDecoder.release(true);
                free(iVideoDecoder.outputSurface());
            } catch (java.lang.Exception e17) {
                this.logger.e(TAG, "tryReleaseDecoder Exception, ignore", e17);
            }
        }
    }

    private boolean unNeedReDecoderNextFrame(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = this.nextFrame;
        boolean z17 = cMSampleBuffer != null && cMSampleBuffer.getTime().bigThan(cMTime);
        com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer2 = this.nextFrame;
        return z17 || (cMSampleBuffer2 != null && this.currentFrame != null && cMSampleBuffer2.getTime().bigThan(this.currentFrame.getTime()));
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public synchronized void asyncReadNextSample(com.tencent.tav.coremedia.CMTime cMTime) {
        if (unNeedReDecoderNextFrame(cMTime)) {
            return;
        }
        if (this.isReleased) {
            return;
        }
        this.nextFrame = new com.tencent.tav.coremedia.CMSampleBuffer(cMTime);
        synchronized (this.decoderThread) {
            this.decoderThread.action();
        }
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
        com.tencent.tav.coremedia.CMTime cMTime = this.duration;
        com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        if (cMTime == cMTime2) {
            java.util.Iterator<com.tencent.tav.decoder.DecoderTrackSegment> it = this.segments.iterator();
            while (it.hasNext()) {
                cMTime2 = cMTime2.add(it.next().getScaledDuration());
            }
            this.duration = cMTime2;
        }
        return this.duration;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getFrameDuration() {
        return this.frameDuration;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public int getFrameRate() {
        return this.frameRate;
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
        return readSample(this.lastSampleState.getTime().add(this.frameDuration));
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer seekTo(com.tencent.tav.coremedia.CMTime cMTime, boolean z17, boolean z18) {
        logVerbose("seekTo:[time " + cMTime + "] [needRead " + z17 + "] [quickSeek " + z18 + "]");
        synchronized (this.nextFrameDecoderLock) {
            this.currentFrame = null;
            this.nextFrame = null;
        }
        synchronized (this) {
            if (this.started && !this.isReleased) {
                int findSegmentIndexAt = findSegmentIndexAt(cMTime, true);
                if (findSegmentIndexAt == -1) {
                    this.segmentIndex = -1;
                    this.logger.e(TAG, "seekTo: [failed] [index " + findSegmentIndexAt + "]");
                    return null;
                }
                com.tencent.tav.coremedia.CMTime segmentStartTime = getSegmentStartTime(findSegmentIndexAt);
                if (this.segmentIndex != findSegmentIndexAt || this.currentDecoder == null) {
                    this.segmentIndex = findSegmentIndexAt - 1;
                    nextSegment(false);
                }
                com.tencent.tav.coremedia.CMTime multi = cMTime.sub(segmentStartTime).multi(this._speed);
                com.tencent.tav.decoder.DecoderTrackSegment currentSegment = getCurrentSegment();
                com.tencent.tav.decoder.IVideoDecoder iVideoDecoder = this.currentDecoder;
                if (iVideoDecoder == null) {
                    this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime);
                    this.logger.e(TAG, "seekTo: [failed] [currentDecoder == null]");
                    return null;
                }
                iVideoDecoder.seekTo(currentSegment.getDecoderStartTime().add(multi), z18);
                if (cMTime.bigThan(this.frameDuration)) {
                    this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime.sub(this.frameDuration));
                } else {
                    this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime);
                }
                com.tencent.tav.coremedia.CMSampleBuffer readSample = z17 ? readSample() : null;
                this.currentFrame = null;
                this.nextFrame = null;
                logVerbose("seekTo: [success] [lastSampleState " + this.lastSampleState + "] [sampleBuffer " + readSample + "]");
                return readSample;
            }
            this.logger.e(TAG, "seekTo: [failed] [started " + this.started + "] [isReleased " + this.isReleased + "]");
            return null;
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setDecodeType(com.tencent.tav.decoder.IDecoder.DecodeType decodeType) {
        this.decodeType = decodeType;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setFrameRate(int i17) {
        this.frameRate = i17;
        this.frameDuration = new com.tencent.tav.coremedia.CMTime(600 / i17, 600);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setLogger(com.tencent.tav.decoder.logger.WXLogger wXLogger) {
        this.logger = wXLogger;
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

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized com.tencent.tav.coremedia.CMSampleBuffer doReadSample(com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        com.tencent.tav.decoder.IVideoDecoder iVideoDecoder;
        com.tencent.tav.coremedia.CMSampleBuffer createSampleBuffer;
        logVerbose("doReadSample: step 1 ");
        if (this.isReleased) {
            return createSampleBuffer(-100L);
        }
        if (cMTime == null) {
            return createSampleBuffer(-3L);
        }
        if (this.segmentIndex == -1) {
            if (this.lastSampleState.getStateCode() >= -1) {
                createSampleBuffer = createSampleBuffer(-1L);
            } else {
                createSampleBuffer = createSampleBuffer(-100L);
            }
            return createSampleBuffer;
        }
        com.tencent.tav.decoder.DecoderTrackSegment currentSegment = getCurrentSegment();
        com.tencent.tav.coremedia.CMSampleState fromError = com.tencent.tav.coremedia.CMSampleState.fromError(-1L);
        boolean z18 = false;
        boolean z19 = false;
        while (true) {
            logVerbose("doReadSample: step 2 ");
            if (this.currentDecoder == null) {
                this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(this.lastSampleState.getTime().add(this.frameDuration));
                if (this.lastSampleState.getTime().smallThan(this.currentSegmentStartTime.add(currentSegment.getScaledDuration()))) {
                    com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator = this.surfaceCreator;
                    if (surfaceCreator == null) {
                        return createSampleBuffer(this.lastSampleState);
                    }
                    return createSampleBuffer(this.lastSampleState, surfaceCreator.videoTextureForSurface(this._outputSurface), false);
                }
            } else {
                com.tencent.tav.coremedia.CMTime limitMin = cMTime.sub(this.currentSegmentStartTime).multi(this._speed).limitMin(com.tencent.tav.coremedia.CMTime.CMTimeZero);
                if (((float) limitMin.getTimeUs()) > ((float) currentSegment.getScaledDuration().getTimeUs()) * this._speed) {
                    fromError = com.tencent.tav.coremedia.CMSampleState.fromError(-1L);
                } else {
                    com.tencent.tav.coremedia.CMTime add = limitMin.add(currentSegment.getDecoderStartTime());
                    com.tencent.tav.decoder.IVideoDecoder iVideoDecoder2 = this.currentDecoder;
                    if (iVideoDecoder2 == null) {
                        fromError = com.tencent.tav.coremedia.CMSampleState.fromError(-100L);
                    } else {
                        fromError = iVideoDecoder2.readSample(add);
                    }
                    z19 = true;
                }
            }
            if (!fromError.stateMatchingTo(-1) && !fromError.getTime().bigThan(currentSegment.getTimeRange().getDuration())) {
                if (fromError.getStateCode() >= 0) {
                    logVerbose("doReadSample: step 3 ");
                    com.tencent.tav.coremedia.CMTime sub = fromError.getTime().sub(currentSegment.getDecoderStartTime());
                    if (sub.bigThan(currentSegment.getTimeRange().getDuration())) {
                        sub = currentSegment.getTimeRange().getDuration();
                    }
                    com.tencent.tav.coremedia.CMSampleState cMSampleState = new com.tencent.tav.coremedia.CMSampleState(this.currentSegmentStartTime.add(sub.divide(this._speed)), fromError.performance);
                    logVerbose("readSample: currentTime = " + cMTime + "  sampleState = " + cMSampleState);
                    return createSampleBuffer(cMSampleState, true);
                }
                if (!fromError.stateMatchingTo(-3)) {
                    return createSampleBuffer(this.lastSampleState);
                }
                return createSampleBuffer(fromError);
            }
            if (currentSegment.getScaledDuration().add(this.currentSegmentStartTime).sub(this.frameDuration).bigThan(cMTime)) {
                if (z19 && (iVideoDecoder = this.currentDecoder) != null && iVideoDecoder.isLastFrameValid()) {
                    z18 = true;
                }
                return createSampleBuffer(new com.tencent.tav.coremedia.CMSampleState(cMTime), z18);
            }
            if (z17) {
                this.logger.d(TAG, "async read finish , skip it!");
                return null;
            }
            if (!nextSegment(true)) {
                return createSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L), false);
            }
            currentSegment = getCurrentSegment();
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public synchronized void release() {
        this.decoderThread.release();
        this.logger.d(TAG, "release: start " + this);
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
            com.tencent.tav.decoder.VideoDecoderTrack.DecoderWrapper decoderWrapper = this.nextDecoder;
            if (decoderWrapper != null) {
                decoderWrapper.release();
                this.nextDecoder = null;
            }
        }
        com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = this.currentFrame;
        if (cMSampleBuffer != null && cMSampleBuffer.getTextureInfo() != null) {
            this.currentFrame.getTextureInfo().release();
        }
        com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer2 = this.nextFrame;
        if (cMSampleBuffer2 != null && (cMSampleBuffer2 instanceof com.tencent.tav.decoder.CacheSampleBuffer) && ((com.tencent.tav.decoder.CacheSampleBuffer) cMSampleBuffer2).getTexture() != null) {
            ((com.tencent.tav.decoder.CacheSampleBuffer) this.nextFrame).getTexture().release();
        }
        this.logger.d(TAG, "release: finish");
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator) {
        start(surfaceCreator, null);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.logger.d(TAG, "VideoDecoderTrack start:" + cMTimeRange);
        if (this.segments.size() == 0) {
            release();
            return;
        }
        this.isReleased = false;
        this.started = true;
        this.surfaceCreator = surfaceCreator;
        this.segmentIndex = -1;
        this.decoderThread.start();
        clipRangeAndRemoveRange(cMTimeRange);
        nextSegment(true);
        this.logger.d(TAG, "VideoDecoderTrack start finish:");
    }

    private com.tencent.tav.coremedia.CMSampleBuffer createSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState, boolean z17) {
        com.tencent.tav.decoder.IVideoDecoder iVideoDecoder = this.currentDecoder;
        if (iVideoDecoder instanceof com.tencent.tav.decoder.VideoDecoder) {
            return createSampleBuffer(cMSampleState, this.surfaceCreator.videoTextureForSurface(this._outputSurface), z17);
        }
        return createSampleBuffer(cMSampleState, iVideoDecoder == null ? null : iVideoDecoder.getTextureInfo(), z17);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer readSample(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.coremedia.CMSampleBuffer switchToNextFrame;
        com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer;
        logVerbose("readSample: start expectFrameTime = " + cMTime);
        if (this.isReleased) {
            releaseDecoder();
            return createSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-100L));
        }
        if (cMTime.bigThan(getDuration())) {
            releaseDecoder();
            return createSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L));
        }
        if (this.decodeError) {
            this.logger.w(TAG, "skip this frame by decode error, expectFrameTime = " + cMTime);
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromExportError(-3L, -201, "", this.decodeException));
        }
        com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer2 = this.currentFrame;
        if (cMSampleBuffer2 != null && cMSampleBuffer2.getTime().getTimeUs() >= 0 && this.currentFrame.getTextureInfo() != null && !this.currentFrame.getTime().smallThan(cMTime)) {
            com.tencent.tav.coremedia.CMSampleState cMSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime);
            this.lastSampleState = cMSampleState;
            com.tencent.tav.coremedia.CMSampleBuffer createSampleBuffer = createSampleBuffer(cMSampleState, this.currentFrame.getTextureInfo(), false);
            createSampleBuffer.getState().performance.stage = com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage.DECODE_JUMP;
            com.tencent.tav.decoder.logger.WXLogger wXLogger = this.logger;
            java.lang.String str = TAG;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("skip frame by jump, expectFrameTime = ");
            sb6.append(cMTime);
            sb6.append(" currentFrame = ");
            com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer3 = this.currentFrame;
            sb6.append(cMSampleBuffer3 == null ? com.tencent.tav.coremedia.CMTime.CMTimeZero : cMSampleBuffer3.getTime());
            wXLogger.i(str, sb6.toString());
            return createSampleBuffer;
        }
        logVerbose("readSample: step 1 ");
        com.tencent.tav.coremedia.CMTime add = cMTime.sub(this.frameDuration).add(new com.tencent.tav.coremedia.CMTime(1L, cMTime.timeScale));
        if (findSegmentIndexAt(cMTime, false) == this.segmentIndex && (cMSampleBuffer = this.nextFrame) != null && cMSampleBuffer.getState().getStateCode() >= 0 && this.decodeType == com.tencent.tav.decoder.IDecoder.DecodeType.Video) {
            synchronized (this.nextFrameDecoderLock) {
                com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer4 = this.nextFrame;
                if (cMSampleBuffer4 == null || cMSampleBuffer4.getState().getStateCode() < -1 || (this.nextFrame.getTextureInfo() == null && this.nextFrame.getSampleByteBuffer() == null)) {
                    logVerbose("readSample:" + add + " nextFrame not hit time");
                    this.nextFrame = doReadSample(add);
                }
            }
        } else {
            logVerbose("readSample:" + add + " nextFrame not hit");
            if (findSegmentIndexAt(cMTime, false) != this.segmentIndex) {
                this.nextFrame = doReadSample(cMTime);
            } else {
                this.nextFrame = doReadSample(add);
            }
        }
        logVerbose("readSample: step 2 ");
        boolean needSwitchNextFrame = needSwitchNextFrame(this.currentFrame, this.nextFrame, cMTime);
        com.tencent.tav.decoder.logger.WXLogger wXLogger2 = this.logger;
        java.lang.String str2 = TAG;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("readSample: needSwitch: ");
        sb7.append(needSwitchNextFrame);
        sb7.append(" expectFrameTime = ");
        sb7.append(cMTime);
        sb7.append(" currentFrame = ");
        com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer5 = this.currentFrame;
        sb7.append(cMSampleBuffer5 == null ? com.tencent.tav.coremedia.CMTime.CMTimeZero : cMSampleBuffer5.getTime());
        sb7.append("  nextFrame = ");
        sb7.append(this.nextFrame);
        wXLogger2.frame(str2, sb7.toString());
        if (needSwitchNextFrame && (switchToNextFrame = switchToNextFrame()) != null) {
            return switchToNextFrame;
        }
        logVerbose("readSample: step 3 ");
        createNextDecoder(this.segmentIndex);
        com.tencent.tav.coremedia.CMSampleState cMSampleState2 = new com.tencent.tav.coremedia.CMSampleState(cMTime);
        this.lastSampleState = cMSampleState2;
        cMSampleState2.performance = this.currentFrame.getState().performance;
        logVerbose("readSample: step 4 ");
        return createSampleBuffer(needSwitchNextFrame);
    }

    private com.tencent.tav.coremedia.CMSampleBuffer createSampleBuffer(long j17) {
        return createSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(j17));
    }

    private com.tencent.tav.coremedia.CMSampleBuffer createSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState) {
        return new com.tencent.tav.coremedia.CMSampleBuffer(cMSampleState);
    }

    private com.tencent.tav.coremedia.CMSampleBuffer createSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState, com.tencent.tav.decoder.VideoTexture videoTexture, boolean z17) {
        com.tencent.tav.decoder.CacheSampleBuffer cacheSampleBuffer = new com.tencent.tav.decoder.CacheSampleBuffer(cMSampleState, videoTexture == null ? null : videoTexture.getTextureInfo(), z17);
        cacheSampleBuffer.setTexture(videoTexture);
        return cacheSampleBuffer;
    }

    private com.tencent.tav.coremedia.CMSampleBuffer createSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState, com.tencent.tav.coremedia.TextureInfo textureInfo, boolean z17) {
        return new com.tencent.tav.coremedia.CMSampleBuffer(cMSampleState, textureInfo, z17);
    }

    private void createDecoder(com.tencent.tav.decoder.DecoderAssetTrack decoderAssetTrack, int i17) {
        com.tencent.tav.coremedia.CGSize cGSize;
        try {
            com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator = this.surfaceCreator;
            if (surfaceCreator == null || (cGSize = decoderAssetTrack.size) == null) {
                return;
            }
            com.tencent.tav.decoder.VideoDecoderTrack.DecoderCreateThread decoderCreateThread = new com.tencent.tav.decoder.VideoDecoderTrack.DecoderCreateThread(decoderAssetTrack, surfaceCreator.createOutputSurface((int) cGSize.width, (int) cGSize.height, decoderAssetTrack.preferRotation), i17);
            this.decoderCreateThread = decoderCreateThread;
            decoderCreateThread.start();
        } catch (java.lang.Exception e17) {
            this.logger.e(TAG, "createNextDecoder: try start DecoderCreateThread", e17);
        }
    }
}
