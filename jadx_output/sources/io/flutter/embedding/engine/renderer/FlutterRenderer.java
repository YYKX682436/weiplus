package io.flutter.embedding.engine.renderer;

/* loaded from: classes15.dex */
public class FlutterRenderer implements io.flutter.view.TextureRegistry {
    public static int SURFACE_PRODUCER_USE_IMAGE_DEFAULT = 0;
    public static int SURFACE_PRODUCER_USE_IMAGE_FORCE = 1;
    public static int SURFACE_PRODUCER_USE_IMAGE_FORCE_NOT = -1;
    private static final java.lang.String TAG = "FlutterRenderer";
    public static boolean debugDisableSurfaceClear;
    public static boolean debugForceSurfaceProducerGlTextures;
    private final io.flutter.embedding.engine.FlutterJNI flutterJNI;
    private final io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener;
    private androidx.lifecycle.f processLifecycleOwnerObserver;
    private android.view.Surface surface;
    private final java.util.concurrent.atomic.AtomicLong nextTextureId = new java.util.concurrent.atomic.AtomicLong(0);
    private java.util.concurrent.Executor backgroundExecutor = new io.flutter.util.ImmediateExecutor();
    private boolean isDisplayingFlutterUi = false;
    private android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
    private boolean checkSurfaceOnStopOrPause = false;
    private int surfaceProducerUseImage = SURFACE_PRODUCER_USE_IMAGE_DEFAULT;
    private final java.util.Set<java.lang.ref.WeakReference<io.flutter.view.TextureRegistry.OnTrimMemoryListener>> onTrimMemoryListeners = new java.util.HashSet();
    private final java.util.List<io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer> imageReaderProducers = new java.util.ArrayList();

    /* loaded from: classes15.dex */
    public static final class DisplayFeature {
        public final android.graphics.Rect bounds;
        public final io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureState state;
        public final io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureType type;

        public DisplayFeature(android.graphics.Rect rect, io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureType displayFeatureType, io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureState displayFeatureState) {
            this.bounds = rect;
            this.type = displayFeatureType;
            this.state = displayFeatureState;
        }
    }

    /* loaded from: classes15.dex */
    public enum DisplayFeatureState {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);

        public final int encodedValue;

        DisplayFeatureState(int i17) {
            this.encodedValue = i17;
        }
    }

    /* loaded from: classes15.dex */
    public enum DisplayFeatureType {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);

        public final int encodedValue;

        DisplayFeatureType(int i17) {
            this.encodedValue = i17;
        }
    }

    /* loaded from: classes15.dex */
    public final class ImageReaderSurfaceProducer implements io.flutter.view.TextureRegistry.SurfaceProducer, io.flutter.view.TextureRegistry.ImageConsumer, io.flutter.view.TextureRegistry.OnTrimMemoryListener {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_DEQUEUED_IMAGES = 2;
        private static final int MAX_IMAGES = 6;
        private static final java.lang.String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private static final boolean trimOnMemoryPressure = true;

        /* renamed from: id, reason: collision with root package name */
        private final long f293228id;
        private boolean released;
        private boolean ignoringFence = false;
        private int requestedWidth = 1;
        private int requestedHeight = 1;
        private boolean createNewReader = true;
        private boolean notifiedDestroy = false;
        private long lastDequeueTime = 0;
        private long lastQueueTime = 0;
        private long lastScheduleTime = 0;
        private int numTrims = 0;
        private final java.lang.Object lock = new java.lang.Object();
        private final java.util.ArrayDeque<io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader> imageReaderQueue = new java.util.ArrayDeque<>();
        private final java.util.HashMap<android.media.ImageReader, io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader> perImageReaders = new java.util.HashMap<>();
        private java.util.ArrayList<io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImage> lastDequeuedImage = new java.util.ArrayList<>();
        private io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader lastReaderDequeuedFrom = null;
        private io.flutter.view.TextureRegistry.SurfaceProducer.Callback callback = null;
        private io.flutter.view.TextureRegistry.OnFrameAvailableListener listener = null;

        /* loaded from: classes15.dex */
        public class PerImage {
            public final android.media.Image image;
            public final long queuedTime;

            public PerImage(android.media.Image image, long j17) {
                this.image = image;
                this.queuedTime = j17;
            }
        }

        /* loaded from: classes15.dex */
        public class PerImageReader {
            public final android.media.ImageReader reader;
            private final java.util.ArrayDeque<io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImage> imageQueue = new java.util.ArrayDeque<>();
            private boolean closed = false;

            public PerImageReader(android.media.ImageReader imageReader) {
                this.reader = imageReader;
                imageReader.setOnImageAvailableListener(new android.media.ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer$PerImageReader$$a
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(android.media.ImageReader imageReader2) {
                        io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader.this.lambda$new$0(imageReader2);
                    }
                }, new android.os.Handler(android.os.Looper.getMainLooper()));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$new$0(android.media.ImageReader imageReader) {
                android.media.Image image;
                try {
                    image = imageReader.acquireLatestImage();
                } catch (java.lang.IllegalStateException e17) {
                    io.flutter.Log.e(io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e17);
                    image = null;
                }
                if (image == null) {
                    return;
                }
                if (io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.this.released || this.closed) {
                    image.close();
                } else {
                    io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.this.onImage(imageReader, image);
                }
            }

            public boolean canPrune() {
                return this.imageQueue.isEmpty() && io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom != this;
            }

            public void close() {
                this.closed = true;
                this.reader.close();
                this.imageQueue.clear();
            }

            public io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImage dequeueImage() {
                if (this.imageQueue.isEmpty()) {
                    return null;
                }
                return this.imageQueue.removeFirst();
            }

            public boolean imageQueueIsEmpty() {
                return this.imageQueue.isEmpty();
            }

            public io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImage queueImage(android.media.Image image) {
                if (this.closed) {
                    return null;
                }
                io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImage perImage = new io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImage(image, java.lang.System.nanoTime());
                this.imageQueue.add(perImage);
                while (this.imageQueue.size() > 2) {
                    this.imageQueue.removeFirst().image.close();
                }
                return perImage;
            }
        }

        public ImageReaderSurfaceProducer(long j17) {
            this.f293228id = j17;
        }

        private void cleanup() {
            synchronized (this.lock) {
                for (io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader perImageReader : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == perImageReader) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    perImageReader.close();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    java.util.Iterator<io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImage> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().image.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader perImageReader2 = this.lastReaderDequeuedFrom;
                if (perImageReader2 != null) {
                    perImageReader2.close();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            }
        }

        private android.media.ImageReader createImageReader29() {
            return android.media.ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 6, 256L);
        }

        private android.media.ImageReader createImageReader33() {
            android.media.ImageReader.Builder builder = new android.media.ImageReader.Builder(this.requestedWidth, this.requestedHeight);
            builder.setMaxImages(6);
            builder.setImageFormat(34);
            builder.setUsage(256L);
            return builder.build();
        }

        private io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader getActiveReader() {
            io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader peekLast;
            synchronized (this.lock) {
                if (!this.createNewReader && (peekLast = this.imageReaderQueue.peekLast()) != null && peekLast.reader.getSurface().isValid()) {
                    return peekLast;
                }
                this.createNewReader = false;
                return getOrCreatePerImageReader(createImageReader());
            }
        }

        private io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader getOrCreatePerImageReader(android.media.ImageReader imageReader) {
            io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader perImageReader = this.perImageReaders.get(imageReader);
            if (perImageReader != null) {
                return perImageReader;
            }
            io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader createPerImageReader = createPerImageReader(imageReader);
            this.perImageReaders.put(imageReader, createPerImageReader);
            this.imageReaderQueue.add(createPerImageReader);
            return createPerImageReader;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$dequeueImage$0() {
            if (this.released) {
                return;
            }
            io.flutter.embedding.engine.renderer.FlutterRenderer.this.scheduleEngineFrame();
        }

        private void maybeWaitOnFence(android.media.Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                io.flutter.Log.w(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
            io.flutter.embedding.engine.renderer.FlutterRenderer.this.removeOnTrimMemoryListener(this);
            io.flutter.embedding.engine.renderer.FlutterRenderer.this.imageReaderProducers.remove(this);
        }

        private void waitOnFence(android.media.Image image) {
            try {
                image.getFence().awaitForever();
            } catch (java.io.IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        public android.media.Image acquireLatestImage() {
            io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImage dequeueImage = dequeueImage();
            if (dequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(dequeueImage.image);
            return dequeueImage.image;
        }

        public android.media.ImageReader createImageReader() {
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 >= 33) {
                return createImageReader33();
            }
            if (i17 >= 29) {
                return createImageReader29();
            }
            throw new java.lang.UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        public io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader createPerImageReader(android.media.ImageReader imageReader) {
            return new io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader(imageReader);
        }

        public double deltaMillis(long j17) {
            return j17 / 1000000.0d;
        }

        public io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImage dequeueImage() {
            io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImage perImage;
            boolean z17;
            synchronized (this.lock) {
                java.util.Iterator<io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader> it = this.imageReaderQueue.iterator();
                perImage = null;
                while (true) {
                    z17 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader next = it.next();
                    io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImage dequeueImage = next.dequeueImage();
                    if (dequeueImage == null) {
                        perImage = dequeueImage;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).image.close();
                        }
                        this.lastDequeuedImage.add(dequeueImage);
                        this.lastReaderDequeuedFrom = next;
                        perImage = dequeueImage;
                    }
                }
                pruneImageReaderQueue();
                java.util.Iterator<io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader> it6 = this.imageReaderQueue.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    if (!it6.next().imageQueueIsEmpty()) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                io.flutter.embedding.engine.renderer.FlutterRenderer.this.handler.post(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer$ImageReaderSurfaceProducer$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.this.lambda$dequeueImage$0();
                    }
                });
            }
            return perImage;
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        public void finalize() {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                io.flutter.embedding.engine.renderer.FlutterRenderer.this.handler.post(new io.flutter.embedding.engine.renderer.FlutterRenderer.TextureFinalizerRunnable(this.f293228id, io.flutter.embedding.engine.renderer.FlutterRenderer.this.flutterJNI));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public android.view.Surface getForcedNewSurface() {
            this.createNewReader = true;
            return getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getHeight() {
            return this.requestedHeight;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public android.view.Surface getSurface() {
            return getActiveReader().reader.getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getWidth() {
            return this.requestedWidth;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public boolean handlesCropAndRotation() {
            return false;
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public long id() {
            return this.f293228id;
        }

        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        public int numImages() {
            int i17;
            synchronized (this.lock) {
                java.util.Iterator<io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader> it = this.imageReaderQueue.iterator();
                i17 = 0;
                while (it.hasNext()) {
                    i17 += it.next().imageQueue.size();
                }
            }
            return i17;
        }

        public int numTrims() {
            int i17;
            synchronized (this.lock) {
                i17 = this.numTrims;
            }
            return i17;
        }

        public void onImage(android.media.ImageReader imageReader, android.media.Image image) {
            io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImage queueImage;
            boolean z17;
            synchronized (this.lock) {
                io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
                queueImage = orCreatePerImageReader.queueImage(image);
                z17 = true;
                if (this.listener != null && orCreatePerImageReader != this.imageReaderQueue.peekLast()) {
                    z17 = false;
                }
            }
            if (queueImage == null) {
                return;
            }
            io.flutter.view.TextureRegistry.OnFrameAvailableListener onFrameAvailableListener = this.listener;
            if (onFrameAvailableListener != null) {
                onFrameAvailableListener.onFrameAvailable(z17);
            }
            io.flutter.embedding.engine.renderer.FlutterRenderer.this.scheduleEngineFrame();
        }

        @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
        public void onTrimMemory(int i17) {
            if (i17 < 40) {
                return;
            }
            synchronized (this.lock) {
                this.numTrims++;
            }
            io.flutter.view.TextureRegistry.SurfaceProducer.Callback callback = this.callback;
            if (callback != null) {
                this.notifiedDestroy = true;
                callback.onSurfaceCleanup();
            }
            cleanup();
            this.createNewReader = true;
        }

        public int pendingDequeuedImages() {
            return this.lastDequeuedImage.size();
        }

        public void pruneImageReaderQueue() {
            io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer.PerImageReader peekFirst;
            while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null && peekFirst.canPrune()) {
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(peekFirst.reader);
                peekFirst.close();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            io.flutter.embedding.engine.renderer.FlutterRenderer.this.unregisterTexture(this.f293228id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void scheduleFrame() {
            io.flutter.embedding.engine.renderer.FlutterRenderer.this.scheduleEngineFrame();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setCallback(io.flutter.view.TextureRegistry.SurfaceProducer.Callback callback) {
            this.callback = callback;
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void setOnFrameAvailableListener(io.flutter.view.TextureRegistry.OnFrameAvailableListener onFrameAvailableListener) {
            this.listener = onFrameAvailableListener;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setSize(int i17, int i18) {
            int max = java.lang.Math.max(1, i17);
            int max2 = java.lang.Math.max(1, i18);
            if (this.requestedWidth == max && this.requestedHeight == max2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = max2;
            this.requestedWidth = max;
        }
    }

    /* loaded from: classes15.dex */
    public final class ImageTextureRegistryEntry implements io.flutter.view.TextureRegistry.ImageTextureEntry, io.flutter.view.TextureRegistry.ImageConsumer {
        private static final java.lang.String TAG = "ImageTextureRegistryEntry";

        /* renamed from: id, reason: collision with root package name */
        private final long f293229id;
        private boolean ignoringFence = false;
        private android.media.Image image;
        private boolean released;

        public ImageTextureRegistryEntry(long j17) {
            this.f293229id = j17;
        }

        private void maybeWaitOnFence(android.media.Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                io.flutter.Log.d(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void waitOnFence(android.media.Image image) {
            try {
                image.getFence().awaitForever();
            } catch (java.io.IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        public android.media.Image acquireLatestImage() {
            android.media.Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        public void finalize() {
            try {
                if (this.released) {
                    return;
                }
                android.media.Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                io.flutter.embedding.engine.renderer.FlutterRenderer.this.handler.post(new io.flutter.embedding.engine.renderer.FlutterRenderer.TextureFinalizerRunnable(this.f293229id, io.flutter.embedding.engine.renderer.FlutterRenderer.this.flutterJNI));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public long id() {
            return this.f293229id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void pushImage(android.media.Image image) {
            android.media.Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                io.flutter.Log.e(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                io.flutter.embedding.engine.renderer.FlutterRenderer.this.scheduleEngineFrame();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            android.media.Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            io.flutter.embedding.engine.renderer.FlutterRenderer.this.unregisterTexture(this.f293229id);
        }
    }

    /* loaded from: classes15.dex */
    public final class SurfaceTextureRegistryEntry implements io.flutter.view.TextureRegistry.SurfaceTextureEntry, io.flutter.view.TextureRegistry.OnTrimMemoryListener {
        private io.flutter.view.TextureRegistry.OnFrameAvailableListener frameAvailableListener;
        private io.flutter.view.TextureRegistry.OnFrameConsumedListener frameConsumedListener;

        /* renamed from: id, reason: collision with root package name */
        private final long f293230id;
        private boolean released;
        private final io.flutter.embedding.engine.renderer.SurfaceTextureWrapper textureWrapper;
        private io.flutter.view.TextureRegistry.OnTrimMemoryListener trimMemoryListener;

        public SurfaceTextureRegistryEntry(long j17, android.graphics.SurfaceTexture surfaceTexture) {
            this.f293230id = j17;
            this.textureWrapper = new io.flutter.embedding.engine.renderer.SurfaceTextureWrapper(surfaceTexture, new java.lang.Runnable() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer$SurfaceTextureRegistryEntry$$a
                @Override // java.lang.Runnable
                public final void run() {
                    io.flutter.embedding.engine.renderer.FlutterRenderer.SurfaceTextureRegistryEntry.this.lambda$new$0();
                }
            });
            surfaceTexture().setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer$SurfaceTextureRegistryEntry$$b
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                    io.flutter.embedding.engine.renderer.FlutterRenderer.SurfaceTextureRegistryEntry.this.lambda$new$1(surfaceTexture2);
                }
            }, new android.os.Handler());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$0() {
            io.flutter.view.TextureRegistry.OnFrameConsumedListener onFrameConsumedListener = this.frameConsumedListener;
            if (onFrameConsumedListener != null) {
                onFrameConsumedListener.onFrameConsumed();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$new$1(android.graphics.SurfaceTexture surfaceTexture) {
            if (this.released || !io.flutter.embedding.engine.renderer.FlutterRenderer.this.flutterJNI.isAttached()) {
                return;
            }
            this.textureWrapper.markDirty();
            io.flutter.view.TextureRegistry.OnFrameAvailableListener onFrameAvailableListener = this.frameAvailableListener;
            if (onFrameAvailableListener != null) {
                onFrameAvailableListener.onFrameAvailable(true);
            }
            io.flutter.embedding.engine.renderer.FlutterRenderer.this.scheduleEngineFrame();
        }

        private void removeListener() {
            io.flutter.embedding.engine.renderer.FlutterRenderer.this.removeOnTrimMemoryListener(this);
        }

        public void finalize() {
            try {
                if (this.released) {
                    return;
                }
                io.flutter.embedding.engine.renderer.FlutterRenderer.this.handler.post(new io.flutter.embedding.engine.renderer.FlutterRenderer.TextureFinalizerRunnable(this.f293230id, io.flutter.embedding.engine.renderer.FlutterRenderer.this.flutterJNI));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public long id() {
            return this.f293230id;
        }

        @Override // io.flutter.view.TextureRegistry.OnTrimMemoryListener
        public void onTrimMemory(int i17) {
            io.flutter.view.TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = this.trimMemoryListener;
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i17);
            }
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            io.flutter.Log.i(io.flutter.embedding.engine.renderer.FlutterRenderer.TAG, "Releasing a SurfaceTexture (" + this.f293230id + ").");
            io.flutter.embedding.engine.renderer.FlutterRenderer.this.backgroundExecutor.execute(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.SurfaceTextureRegistryEntry.1
                @Override // java.lang.Runnable
                public void run() {
                    io.flutter.embedding.engine.renderer.FlutterRenderer.SurfaceTextureRegistryEntry.this.textureWrapper.release();
                }
            });
            io.flutter.embedding.engine.renderer.FlutterRenderer.this.unregisterTexture(this.f293230id);
            removeListener();
            this.released = true;
        }

        @Override // io.flutter.view.TextureRegistry.TextureEntry
        public void setOnFrameAvailableListener(io.flutter.view.TextureRegistry.OnFrameAvailableListener onFrameAvailableListener) {
            this.frameAvailableListener = onFrameAvailableListener;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnFrameConsumedListener(io.flutter.view.TextureRegistry.OnFrameConsumedListener onFrameConsumedListener) {
            this.frameConsumedListener = onFrameConsumedListener;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnTrimMemoryListener(io.flutter.view.TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
            this.trimMemoryListener = onTrimMemoryListener;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public android.graphics.SurfaceTexture surfaceTexture() {
            return this.textureWrapper.surfaceTexture();
        }

        public io.flutter.embedding.engine.renderer.SurfaceTextureWrapper textureWrapper() {
            return this.textureWrapper;
        }
    }

    /* loaded from: classes15.dex */
    public static final class TextureFinalizerRunnable implements java.lang.Runnable {
        private final io.flutter.embedding.engine.FlutterJNI flutterJNI;

        /* renamed from: id, reason: collision with root package name */
        private final long f293231id;

        public TextureFinalizerRunnable(long j17, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
            this.f293231id = j17;
            this.flutterJNI = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.flutterJNI.isAttached()) {
                io.flutter.Log.v(io.flutter.embedding.engine.renderer.FlutterRenderer.TAG, "Releasing a Texture (" + this.f293231id + ").");
                this.flutterJNI.unregisterTexture(this.f293231id);
            }
        }
    }

    /* loaded from: classes11.dex */
    public static final class ViewportMetrics {
        public static final int unsetValue = -1;
        public float devicePixelRatio = 1.0f;
        public int width = 0;
        public int height = 0;
        public int viewPaddingTop = 0;
        public int viewPaddingRight = 0;
        public int viewPaddingBottom = 0;
        public int viewPaddingLeft = 0;
        public int viewInsetTop = 0;
        public int viewInsetRight = 0;
        public int viewInsetBottom = 0;
        public int viewInsetLeft = 0;
        public int systemGestureInsetTop = 0;
        public int systemGestureInsetRight = 0;
        public int systemGestureInsetBottom = 0;
        public int systemGestureInsetLeft = 0;
        public int physicalTouchSlop = -1;
        private final java.util.List<io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature> displayFeatures = new java.util.ArrayList();
        private final java.util.List<io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature> displayCutouts = new java.util.ArrayList();
        public io.flutter.embedding.engine.renderer.FlutterRenderer.WindowStatus windowStatus = io.flutter.embedding.engine.renderer.FlutterRenderer.WindowStatus.NORMAL;

        public java.util.List<io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature> getDisplayCutouts() {
            return this.displayCutouts;
        }

        public java.util.List<io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature> getDisplayFeatures() {
            return this.displayFeatures;
        }

        public void setDisplayCutouts(java.util.List<io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature> list) {
            this.displayCutouts.clear();
            this.displayCutouts.addAll(list);
        }

        public void setDisplayFeatures(java.util.List<io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature> list) {
            this.displayFeatures.clear();
            this.displayFeatures.addAll(list);
        }

        public boolean validate() {
            return this.width > 0 && this.height > 0 && this.devicePixelRatio > 0.0f;
        }
    }

    /* loaded from: classes11.dex */
    public enum WindowStatus {
        NORMAL(0),
        FLOATING(1),
        SPLIT_SCREEN(2);

        public final int encodedValue;

        WindowStatus(int i17) {
            this.encodedValue = i17;
        }
    }

    public FlutterRenderer(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener = new io.flutter.embedding.engine.renderer.FlutterUiDisplayListener() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.1
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                io.flutter.embedding.engine.renderer.FlutterRenderer.this.isDisplayingFlutterUi = true;
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
                io.flutter.embedding.engine.renderer.FlutterRenderer.this.isDisplayingFlutterUi = false;
            }
        };
        this.flutterUiDisplayListener = flutterUiDisplayListener;
        this.flutterJNI = flutterJNI;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
            setupLifecycleCallback();
        } else {
            flutterJNI.addIsDisplayingFlutterUiListenerNotInMainThread(flutterUiDisplayListener);
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.2
                @Override // java.lang.Runnable
                public void run() {
                    io.flutter.embedding.engine.renderer.FlutterRenderer.this.setupLifecycleCallback();
                }
            });
        }
    }

    private void clearDeadListeners() {
        java.util.Iterator<java.lang.ref.WeakReference<io.flutter.view.TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            if (it.next().get() == null) {
                it.remove();
            }
        }
    }

    private void registerImageTexture(long j17, io.flutter.view.TextureRegistry.ImageConsumer imageConsumer, boolean z17) {
        this.flutterJNI.registerImageTexture(j17, imageConsumer, z17);
    }

    private void registerTexture(long j17, io.flutter.embedding.engine.renderer.SurfaceTextureWrapper surfaceTextureWrapper) {
        this.flutterJNI.registerTexture(j17, surfaceTextureWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupLifecycleCallback() {
        androidx.lifecycle.f fVar = new androidx.lifecycle.f() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.3
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public /* bridge */ /* synthetic */ void onCreate(androidx.lifecycle.y yVar) {
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public /* bridge */ /* synthetic */ void onDestroy(androidx.lifecycle.y yVar) {
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public /* bridge */ /* synthetic */ void onPause(androidx.lifecycle.y yVar) {
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onResume(androidx.lifecycle.y yVar) {
                io.flutter.Log.v(io.flutter.embedding.engine.renderer.FlutterRenderer.TAG, "onResume called; notifying SurfaceProducers");
                for (io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer imageReaderSurfaceProducer : io.flutter.embedding.engine.renderer.FlutterRenderer.this.imageReaderProducers) {
                    if (imageReaderSurfaceProducer.callback != null && imageReaderSurfaceProducer.notifiedDestroy) {
                        imageReaderSurfaceProducer.notifiedDestroy = false;
                        imageReaderSurfaceProducer.callback.onSurfaceAvailable();
                    }
                }
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public /* bridge */ /* synthetic */ void onStart(androidx.lifecycle.y yVar) {
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public /* bridge */ /* synthetic */ void onStop(androidx.lifecycle.y yVar) {
            }
        };
        this.processLifecycleOwnerObserver = fVar;
        androidx.lifecycle.q0.f11640o.f11646i.a(fVar);
    }

    private void translateFeatureBounds(int[] iArr, int i17, android.graphics.Rect rect) {
        iArr[i17] = rect.left;
        iArr[i17 + 1] = rect.top;
        iArr[i17 + 2] = rect.right;
        iArr[i17 + 3] = rect.bottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterTexture(long j17) {
        this.flutterJNI.unregisterTexture(j17);
    }

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            this.flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
        } else {
            this.flutterJNI.addIsDisplayingFlutterUiListenerNotInMainThread(flutterUiDisplayListener);
        }
        if (this.isDisplayingFlutterUi) {
            flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    public void addOnTrimMemoryListener(io.flutter.view.TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        clearDeadListeners();
        this.onTrimMemoryListeners.add(new java.lang.ref.WeakReference<>(onTrimMemoryListener));
    }

    public void clearNextFrameDisplayedListener() {
        this.flutterJNI.clearDisplayNextFrameListener();
    }

    @Override // io.flutter.view.TextureRegistry
    public io.flutter.view.TextureRegistry.ImageTextureEntry createImageTexture() {
        io.flutter.embedding.engine.renderer.FlutterRenderer.ImageTextureRegistryEntry imageTextureRegistryEntry = new io.flutter.embedding.engine.renderer.FlutterRenderer.ImageTextureRegistryEntry(this.nextTextureId.getAndIncrement());
        io.flutter.Log.v(TAG, "New ImageTextureEntry ID: " + imageTextureRegistryEntry.id());
        registerImageTexture(imageTextureRegistryEntry.id(), imageTextureRegistryEntry, false);
        return imageTextureRegistryEntry;
    }

    @Override // io.flutter.view.TextureRegistry
    public io.flutter.view.TextureRegistry.SurfaceProducer createSurfaceProducer(io.flutter.view.TextureRegistry.SurfaceLifecycle surfaceLifecycle) {
        int i17 = this.surfaceProducerUseImage;
        boolean z17 = i17 != SURFACE_PRODUCER_USE_IMAGE_DEFAULT ? i17 > 0 : android.os.Build.VERSION.SDK_INT >= 29;
        if (debugForceSurfaceProducerGlTextures || !z17) {
            io.flutter.view.TextureRegistry.SurfaceTextureEntry createSurfaceTexture = createSurfaceTexture();
            io.flutter.embedding.engine.renderer.SurfaceTextureSurfaceProducer surfaceTextureSurfaceProducer = new io.flutter.embedding.engine.renderer.SurfaceTextureSurfaceProducer(createSurfaceTexture.id(), this.handler, this.flutterJNI, createSurfaceTexture);
            io.flutter.Log.v(TAG, "New SurfaceTextureSurfaceProducer ID: " + createSurfaceTexture.id());
            return surfaceTextureSurfaceProducer;
        }
        long andIncrement = this.nextTextureId.getAndIncrement();
        io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer imageReaderSurfaceProducer = new io.flutter.embedding.engine.renderer.FlutterRenderer.ImageReaderSurfaceProducer(andIncrement);
        boolean z18 = surfaceLifecycle == io.flutter.view.TextureRegistry.SurfaceLifecycle.resetInBackground;
        registerImageTexture(andIncrement, imageReaderSurfaceProducer, z18);
        if (z18) {
            addOnTrimMemoryListener(imageReaderSurfaceProducer);
        }
        this.imageReaderProducers.add(imageReaderSurfaceProducer);
        io.flutter.Log.v(TAG, "New ImageReaderSurfaceProducer ID: " + andIncrement);
        return imageReaderSurfaceProducer;
    }

    @Override // io.flutter.view.TextureRegistry
    public io.flutter.view.TextureRegistry.SurfaceTextureEntry createSurfaceTexture() {
        io.flutter.Log.v(TAG, "Creating a SurfaceTexture.");
        return registerSurfaceTexture(new android.graphics.SurfaceTexture(0));
    }

    public void dispatchPointerDataPacket(java.nio.ByteBuffer byteBuffer, int i17) {
        this.flutterJNI.dispatchPointerDataPacket(byteBuffer, i17);
    }

    public void dispatchSemanticsAction(int i17, int i18, java.nio.ByteBuffer byteBuffer, int i19) {
        this.flutterJNI.dispatchSemanticsAction(i17, i18, byteBuffer, i19);
    }

    public android.graphics.Bitmap getBitmap() {
        return this.flutterJNI.getBitmap();
    }

    public boolean getCheckSurfaceOnStopOrPause() {
        return this.checkSurfaceOnStopOrPause;
    }

    public int getSurfaceProducerUseImage() {
        return this.surfaceProducerUseImage;
    }

    public boolean isDisplayingFlutterUi() {
        return this.isDisplayingFlutterUi;
    }

    public boolean isSoftwareRenderingEnabled() {
        return this.flutterJNI.getIsSoftwareRenderingEnabled();
    }

    public void onNextFrameDisplayed(final java.lang.Runnable runnable) {
        io.flutter.embedding.engine.FlutterJNI flutterJNI = this.flutterJNI;
        java.util.Objects.requireNonNull(runnable);
        flutterJNI.addDisplayNextFrameListener(new io.flutter.embedding.engine.renderer.FlutterNextFrameDisplayListener() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer$$a
            @Override // io.flutter.embedding.engine.renderer.FlutterNextFrameDisplayListener
            public final void onFlutterDisplayNextFrame() {
                runnable.run();
            }
        });
    }

    @Override // io.flutter.view.TextureRegistry
    public void onTrimMemory(int i17) {
        java.util.Iterator<java.lang.ref.WeakReference<io.flutter.view.TextureRegistry.OnTrimMemoryListener>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            io.flutter.view.TextureRegistry.OnTrimMemoryListener onTrimMemoryListener = it.next().get();
            if (onTrimMemoryListener != null) {
                onTrimMemoryListener.onTrimMemory(i17);
            } else {
                it.remove();
            }
        }
    }

    public void pauseRenderingToSurface() {
        pauseRenderingToSurface(null);
    }

    public void pauseScheduleFrame() {
        this.flutterJNI.pauseScheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry
    public io.flutter.view.TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture) {
        return registerSurfaceTexture(this.nextTextureId.getAndIncrement(), surfaceTexture);
    }

    public void release() {
        if (this.processLifecycleOwnerObserver != null) {
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                androidx.lifecycle.q0.f11640o.f11646i.c(this.processLifecycleOwnerObserver);
            } else {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.renderer.FlutterRenderer.4
                    @Override // java.lang.Runnable
                    public void run() {
                        androidx.lifecycle.q0.f11640o.f11646i.c(io.flutter.embedding.engine.renderer.FlutterRenderer.this.processLifecycleOwnerObserver);
                    }
                });
            }
        }
    }

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterJNI.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener);
    }

    public void removeOnTrimMemoryListener(io.flutter.view.TextureRegistry.OnTrimMemoryListener onTrimMemoryListener) {
        for (java.lang.ref.WeakReference<io.flutter.view.TextureRegistry.OnTrimMemoryListener> weakReference : this.onTrimMemoryListeners) {
            if (weakReference.get() == onTrimMemoryListener) {
                this.onTrimMemoryListeners.remove(weakReference);
                return;
            }
        }
    }

    public void requestDrawLastFrame() {
        this.flutterJNI.requestDrawLastFrame();
    }

    public void resumeScheduleFrame() {
        this.flutterJNI.resumeScheduleFrame();
    }

    public void scheduleEngineFrame() {
        this.flutterJNI.scheduleFrame();
    }

    public void setAccessibilityFeatures(int i17) {
        this.flutterJNI.setAccessibilityFeatures(i17);
    }

    public void setBackgroundExecutor(java.util.concurrent.Executor executor) {
        this.backgroundExecutor = executor;
    }

    public void setCheckSurfaceOnStopOrPause(boolean z17) {
        io.flutter.Log.i(TAG, "setCheckSurfaceOnStopOrPause: " + z17);
        this.checkSurfaceOnStopOrPause = z17;
    }

    public void setSemanticsEnabled(boolean z17) {
        this.flutterJNI.setSemanticsEnabled(z17);
    }

    public void setSurfaceProducerUseImage(int i17) {
        io.flutter.Log.i(TAG, "setSurfaceProducerUseImage: " + i17);
        this.surfaceProducerUseImage = i17;
    }

    public void setViewportMetrics(io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics viewportMetrics) {
        if (viewportMetrics.validate()) {
            io.flutter.Log.v(TAG, "Setting viewport metrics\nSize: " + viewportMetrics.width + " x " + viewportMetrics.height + "\nPadding - L: " + viewportMetrics.viewPaddingLeft + ", T: " + viewportMetrics.viewPaddingTop + ", R: " + viewportMetrics.viewPaddingRight + ", B: " + viewportMetrics.viewPaddingBottom + "\nInsets - L: " + viewportMetrics.viewInsetLeft + ", T: " + viewportMetrics.viewInsetTop + ", R: " + viewportMetrics.viewInsetRight + ", B: " + viewportMetrics.viewInsetBottom + "\nSystem Gesture Insets - L: " + viewportMetrics.systemGestureInsetLeft + ", T: " + viewportMetrics.systemGestureInsetTop + ", R: " + viewportMetrics.systemGestureInsetRight + ", B: " + viewportMetrics.systemGestureInsetRight + "\nDisplay Features: " + viewportMetrics.displayFeatures.size() + "\nDisplay Cutouts: " + viewportMetrics.displayCutouts.size());
            int size = viewportMetrics.displayFeatures.size() + viewportMetrics.displayCutouts.size();
            int[] iArr = new int[size * 4];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i17 = 0; i17 < viewportMetrics.displayFeatures.size(); i17++) {
                io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature displayFeature = (io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature) viewportMetrics.displayFeatures.get(i17);
                translateFeatureBounds(iArr, i17 * 4, displayFeature.bounds);
                iArr2[i17] = displayFeature.type.encodedValue;
                iArr3[i17] = displayFeature.state.encodedValue;
            }
            int size2 = viewportMetrics.displayFeatures.size() * 4;
            for (int i18 = 0; i18 < viewportMetrics.displayCutouts.size(); i18++) {
                io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature displayFeature2 = (io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature) viewportMetrics.displayCutouts.get(i18);
                translateFeatureBounds(iArr, (i18 * 4) + size2, displayFeature2.bounds);
                iArr2[viewportMetrics.displayFeatures.size() + i18] = displayFeature2.type.encodedValue;
                iArr3[viewportMetrics.displayFeatures.size() + i18] = displayFeature2.state.encodedValue;
            }
            this.flutterJNI.setViewportMetrics(viewportMetrics.devicePixelRatio, viewportMetrics.width, viewportMetrics.height, viewportMetrics.viewPaddingTop, viewportMetrics.viewPaddingRight, viewportMetrics.viewPaddingBottom, viewportMetrics.viewPaddingLeft, viewportMetrics.viewInsetTop, viewportMetrics.viewInsetRight, viewportMetrics.viewInsetBottom, viewportMetrics.viewInsetLeft, viewportMetrics.systemGestureInsetTop, viewportMetrics.systemGestureInsetRight, viewportMetrics.systemGestureInsetBottom, viewportMetrics.systemGestureInsetLeft, viewportMetrics.physicalTouchSlop, iArr, iArr2, iArr3, viewportMetrics.windowStatus.encodedValue);
        }
    }

    public void startRenderingToSurface(android.view.Surface surface, boolean z17) {
        io.flutter.Log.i(TAG, "startRendering to surface, keepCurrentSurface:" + z17 + ", surface:" + surface);
        if (this.surface != null && !z17) {
            stopRenderingToSurface();
        }
        this.surface = surface;
        if (z17) {
            this.flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            this.flutterJNI.onSurfaceCreated(surface);
        }
    }

    public void stopRenderingToSurface() {
        stopRenderingToSurface(null);
    }

    public void surfaceChanged(int i17, int i18) {
        io.flutter.Log.i(TAG, "surfaceChange: " + i17 + "," + i18 + ", surface: " + this.surface);
        if (this.surface == null) {
            io.flutter.Log.e(TAG, "not attach a surface when surfaceChanged call");
        } else {
            this.flutterJNI.onSurfaceChanged(i17, i18);
        }
    }

    public void swapSurface(android.view.Surface surface) {
        this.surface = surface;
        this.flutterJNI.onSurfaceWindowChanged(surface);
    }

    private io.flutter.view.TextureRegistry.SurfaceTextureEntry registerSurfaceTexture(long j17, android.graphics.SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        io.flutter.embedding.engine.renderer.FlutterRenderer.SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new io.flutter.embedding.engine.renderer.FlutterRenderer.SurfaceTextureRegistryEntry(j17, surfaceTexture);
        io.flutter.Log.v(TAG, "New SurfaceTexture ID: " + surfaceTextureRegistryEntry.id() + ", " + surfaceTexture);
        registerTexture(surfaceTextureRegistryEntry.id(), surfaceTextureRegistryEntry.textureWrapper());
        addOnTrimMemoryListener(surfaceTextureRegistryEntry);
        return surfaceTextureRegistryEntry;
    }

    public void pauseRenderingToSurface(android.view.Surface surface) {
        io.flutter.Log.i(TAG, "pauseRenderingToSurface " + surface);
        if (this.checkSurfaceOnStopOrPause && surface != null && this.surface != surface) {
            io.flutter.Log.i(TAG, "surface  " + this.surface + " != targetSurface " + surface + ", do not pauseRenderingToSurface");
            return;
        }
        this.flutterJNI.clearCurrentRenderSurface();
        this.surface = null;
    }

    public void stopRenderingToSurface(android.view.Surface surface) {
        io.flutter.Log.i(TAG, "stopRenderingToSurface " + surface);
        if (this.checkSurfaceOnStopOrPause && surface != null && this.surface != surface) {
            io.flutter.Log.i(TAG, "surface  " + this.surface + " != targetSurface " + surface + ", do not stopRenderingToSurface");
            return;
        }
        if (this.surface == null) {
            io.flutter.Log.i(TAG, "stopRenderingToSurface surface is null");
            return;
        }
        this.flutterJNI.onSurfaceDestroyed();
        if (this.isDisplayingFlutterUi) {
            this.flutterUiDisplayListener.onFlutterUiNoLongerDisplayed();
        }
        this.isDisplayingFlutterUi = false;
        this.surface = null;
    }
}
