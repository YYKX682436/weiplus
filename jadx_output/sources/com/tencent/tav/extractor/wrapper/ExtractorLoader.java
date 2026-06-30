package com.tencent.tav.extractor.wrapper;

/* loaded from: classes16.dex */
public class ExtractorLoader {
    private static android.os.Handler loadHandler;
    private static android.os.HandlerThread loadThread;

    /* loaded from: classes16.dex */
    public static class ExtractorLoaderRunnable implements java.lang.Runnable {
        private com.tencent.tav.extractor.AssetExtractor extractor;

        public ExtractorLoaderRunnable(com.tencent.tav.extractor.AssetExtractor assetExtractor) {
            this.extractor = assetExtractor;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.tencent.tav.extractor.wrapper.ExtractorWrapperPool.contains(this.extractor.getSourcePath())) {
                return;
            }
            com.tencent.tav.extractor.wrapper.ExtractorWrapper extractorWrapper = new com.tencent.tav.extractor.wrapper.ExtractorWrapper(this.extractor.getSourcePath());
            extractorWrapper.checkAndLoad(this.extractor);
            com.tencent.tav.extractor.wrapper.ExtractorWrapperPool.put(extractorWrapper);
            this.extractor.dispose();
            this.extractor = null;
        }
    }

    /* loaded from: classes16.dex */
    public static class VideoPathLoaderRunnable implements java.lang.Runnable {
        private java.lang.String videoPath;

        public VideoPathLoaderRunnable(java.lang.String str) {
            this.videoPath = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.tencent.tav.extractor.wrapper.ExtractorWrapperPool.contains(this.videoPath) || this.videoPath == null) {
                return;
            }
            com.tencent.tav.extractor.AssetExtractor assetExtractor = new com.tencent.tav.extractor.AssetExtractor();
            assetExtractor.setDataSource(this.videoPath);
            com.tencent.tav.extractor.wrapper.ExtractorWrapper extractorWrapper = new com.tencent.tav.extractor.wrapper.ExtractorWrapper(this.videoPath);
            extractorWrapper.checkAndLoad(assetExtractor);
            com.tencent.tav.extractor.wrapper.ExtractorWrapperPool.put(extractorWrapper);
            assetExtractor.dispose();
        }
    }

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExtractorLoader");
        loadThread = handlerThread;
        handlerThread.start();
    }

    public static void cacheExtractor(java.lang.String str) {
        checkAndStart();
        loadHandler.post(new com.tencent.tav.extractor.wrapper.ExtractorLoader.VideoPathLoaderRunnable(str));
    }

    private static void checkAndStart() {
        if (loadHandler != null || loadThread.getLooper() == null) {
            return;
        }
        loadHandler = new android.os.Handler(loadThread.getLooper());
    }

    public static void cacheExtractor(com.tencent.tav.extractor.AssetExtractor assetExtractor) {
        checkAndStart();
        loadHandler.post(new com.tencent.tav.extractor.wrapper.ExtractorLoader.ExtractorLoaderRunnable(assetExtractor));
    }
}
