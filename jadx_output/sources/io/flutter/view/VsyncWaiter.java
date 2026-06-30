package io.flutter.view;

/* loaded from: classes14.dex */
public class VsyncWaiter {
    private static io.flutter.view.VsyncWaiter instance;
    private static io.flutter.view.VsyncWaiter.DisplayListener listener;
    private io.flutter.embedding.engine.FlutterJNI flutterJNI;
    private long refreshPeriodNanos = -1;
    private io.flutter.view.VsyncWaiter.FrameCallback frameCallback = new io.flutter.view.VsyncWaiter.FrameCallback(0);
    private final io.flutter.embedding.engine.FlutterJNI.AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = new io.flutter.embedding.engine.FlutterJNI.AsyncWaitForVsyncDelegate() { // from class: io.flutter.view.VsyncWaiter.1
        private android.view.Choreographer.FrameCallback obtainFrameCallback(long j17) {
            if (io.flutter.view.VsyncWaiter.this.frameCallback == null) {
                return new io.flutter.view.VsyncWaiter.FrameCallback(j17);
            }
            io.flutter.view.VsyncWaiter.this.frameCallback.cookie = j17;
            io.flutter.view.VsyncWaiter.FrameCallback frameCallback = io.flutter.view.VsyncWaiter.this.frameCallback;
            io.flutter.view.VsyncWaiter.this.frameCallback = null;
            return frameCallback;
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.AsyncWaitForVsyncDelegate
        public void asyncWaitForVsync(long j17) {
            android.view.Choreographer.getInstance().postFrameCallback(obtainFrameCallback(j17));
        }
    };

    /* loaded from: classes14.dex */
    public class DisplayListener implements android.hardware.display.DisplayManager.DisplayListener {
        private android.hardware.display.DisplayManager displayManager;

        public DisplayListener(android.hardware.display.DisplayManager displayManager) {
            this.displayManager = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i17) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i17) {
            if (i17 == 0) {
                float refreshRate = this.displayManager.getDisplay(0).getRefreshRate();
                io.flutter.view.VsyncWaiter.this.refreshPeriodNanos = (long) (1.0E9d / refreshRate);
                io.flutter.view.VsyncWaiter.this.flutterJNI.setRefreshRateFPS(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i17) {
        }

        public void register() {
            this.displayManager.registerDisplayListener(this, null);
        }
    }

    /* loaded from: classes14.dex */
    public class FrameCallback implements android.view.Choreographer.FrameCallback {
        private long cookie;

        public FrameCallback(long j17) {
            this.cookie = j17;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j17) {
            long nanoTime = java.lang.System.nanoTime() - j17;
            io.flutter.view.VsyncWaiter.this.flutterJNI.onVsync(nanoTime < 0 ? 0L : nanoTime, io.flutter.view.VsyncWaiter.this.refreshPeriodNanos, this.cookie);
            io.flutter.view.VsyncWaiter.this.frameCallback = this;
        }
    }

    private VsyncWaiter(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    public static io.flutter.view.VsyncWaiter getInstance(float f17, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        if (instance == null) {
            instance = new io.flutter.view.VsyncWaiter(flutterJNI);
        }
        flutterJNI.setRefreshRateFPS(f17);
        io.flutter.view.VsyncWaiter vsyncWaiter = instance;
        vsyncWaiter.refreshPeriodNanos = (long) (1.0E9d / f17);
        return vsyncWaiter;
    }

    public static void reset() {
        instance = null;
        listener = null;
    }

    public void init() {
        this.flutterJNI.setAsyncWaitForVsyncDelegate(this.asyncWaitForVsyncDelegate);
    }

    public static io.flutter.view.VsyncWaiter getInstance(android.hardware.display.DisplayManager displayManager, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        if (instance == null) {
            instance = new io.flutter.view.VsyncWaiter(flutterJNI);
        }
        if (listener == null) {
            io.flutter.view.VsyncWaiter vsyncWaiter = instance;
            java.util.Objects.requireNonNull(vsyncWaiter);
            io.flutter.view.VsyncWaiter.DisplayListener displayListener = new io.flutter.view.VsyncWaiter.DisplayListener(displayManager);
            listener = displayListener;
            displayListener.register();
        }
        if (instance.refreshPeriodNanos == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            instance.refreshPeriodNanos = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return instance;
    }
}
