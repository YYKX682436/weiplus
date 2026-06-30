package io.flutter.embedding.android;

/* loaded from: classes15.dex */
public class SurfaceHolderCallbackCompat implements android.view.SurfaceHolder.Callback2 {
    private static final java.lang.String TAG = "SurfaceHolderCallbackCompat";
    final io.flutter.embedding.engine.renderer.FlutterUiDisplayListener alphaCallback = new io.flutter.embedding.engine.renderer.FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.SurfaceHolderCallbackCompat.1
        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiDisplayed() {
            io.flutter.Log.v(io.flutter.embedding.android.SurfaceHolderCallbackCompat.TAG, "onFlutterUiDisplayed()");
            io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterSurfaceView.setAlpha(1.0f);
            if (io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer != null) {
                io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer.removeIsDisplayingFlutterUiListener(this);
            }
        }

        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiNoLongerDisplayed() {
        }
    };
    private io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer;
    private final io.flutter.embedding.android.FlutterSurfaceView flutterSurfaceView;
    private final android.view.SurfaceHolder.Callback innerCallback;
    final io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback lifecycleCallback;
    private final boolean shouldSetAlpha;

    /* loaded from: classes15.dex */
    public interface FlutterRendererLifecycleCallback {
        void onAttachToRenderer(io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer);

        void onDetachFromRenderer();

        void onResume();
    }

    /* loaded from: classes15.dex */
    public class FlutterRendererLifecycleCallbackApi26AndUp implements io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback {
        public FlutterRendererLifecycleCallbackApi26AndUp() {
        }

        @Override // io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback
        public void onAttachToRenderer(io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer) {
            io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer = flutterRenderer;
        }

        @Override // io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback
        public void onDetachFromRenderer() {
            io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer = null;
        }

        @Override // io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback
        public void onResume() {
        }
    }

    /* loaded from: classes15.dex */
    public class FlutterRendererLifecycleCallbackPreApi26 implements io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback {
        public FlutterRendererLifecycleCallbackPreApi26() {
        }

        @Override // io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback
        public void onAttachToRenderer(io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer) {
            if (io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer != null) {
                io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer.removeIsDisplayingFlutterUiListener(io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.alphaCallback);
            }
            io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer = flutterRenderer;
        }

        @Override // io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback
        public void onDetachFromRenderer() {
            io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterSurfaceView.setAlpha(0.0f);
            if (io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer != null) {
                io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer.removeIsDisplayingFlutterUiListener(io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.alphaCallback);
            }
            io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer = null;
        }

        @Override // io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallback
        public void onResume() {
            if (io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer != null) {
                io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer.addIsDisplayingFlutterUiListener(io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.alphaCallback);
            }
        }
    }

    public SurfaceHolderCallbackCompat(android.view.SurfaceHolder.Callback callback, io.flutter.embedding.android.FlutterSurfaceView flutterSurfaceView, io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer) {
        boolean z17 = android.os.Build.VERSION.SDK_INT < 26;
        this.shouldSetAlpha = z17;
        this.lifecycleCallback = z17 ? new io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallbackPreApi26() : new io.flutter.embedding.android.SurfaceHolderCallbackCompat.FlutterRendererLifecycleCallbackApi26AndUp();
        this.innerCallback = callback;
        this.flutterRenderer = flutterRenderer;
        this.flutterSurfaceView = flutterSurfaceView;
        io.flutter.Log.v(TAG, "SurfaceHolderCallbackCompat()");
        if (z17) {
            flutterSurfaceView.setAlpha(0.0f);
        }
    }

    public void onAttachToRenderer(io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer) {
        this.lifecycleCallback.onAttachToRenderer(flutterRenderer);
    }

    public void onDetachFromRenderer() {
        this.lifecycleCallback.onDetachFromRenderer();
    }

    public void onResume() {
        this.lifecycleCallback.onResume();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        android.view.SurfaceHolder.Callback callback = this.innerCallback;
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i17, i18, i19);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        android.view.SurfaceHolder.Callback callback = this.innerCallback;
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        android.view.SurfaceHolder.Callback callback = this.innerCallback;
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(android.view.SurfaceHolder surfaceHolder) {
        io.flutter.Log.v(TAG, "SurfaceHolder.Callback2.surfaceRedrawNeeded()");
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeededAsync(android.view.SurfaceHolder surfaceHolder, final java.lang.Runnable runnable) {
        io.flutter.Log.v(TAG, "SurfaceHolder.Callback2.surfaceRedrawNeededAsync()");
        io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer = this.flutterRenderer;
        if (flutterRenderer == null) {
            return;
        }
        flutterRenderer.addIsDisplayingFlutterUiListener(new io.flutter.embedding.engine.renderer.FlutterUiDisplayListener() { // from class: io.flutter.embedding.android.SurfaceHolderCallbackCompat.2
            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiDisplayed() {
                runnable.run();
                if (io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer != null) {
                    io.flutter.embedding.android.SurfaceHolderCallbackCompat.this.flutterRenderer.removeIsDisplayingFlutterUiListener(this);
                }
            }

            @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
            public void onFlutterUiNoLongerDisplayed() {
            }
        });
    }
}
