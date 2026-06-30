package io.flutter.plugin.platform;

/* loaded from: classes15.dex */
public class PlatformViewsController2 implements io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate {
    private static final java.lang.String TAG = "PlatformViewsController2";
    private io.flutter.embedding.android.AndroidTouchProcessor androidTouchProcessor;
    private android.content.Context context;
    private io.flutter.embedding.android.FlutterView flutterView;
    private io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2 platformViewsChannel;
    private io.flutter.plugin.platform.PlatformViewRegistryImpl registry;
    private io.flutter.plugin.editing.TextInputPlugin textInputPlugin;
    private io.flutter.embedding.engine.FlutterJNI flutterJNI = null;
    private android.view.Surface overlayerSurface = null;
    private android.view.SurfaceControl overlaySurfaceControl = null;
    private final io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler channelHandler = new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler() { // from class: io.flutter.plugin.platform.PlatformViewsController2.1
        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void clearFocus(int i17) {
            io.flutter.plugin.platform.PlatformView platformView = (io.flutter.plugin.platform.PlatformView) io.flutter.plugin.platform.PlatformViewsController2.this.platformViews.get(i17);
            if (platformView == null) {
                io.flutter.Log.e(io.flutter.plugin.platform.PlatformViewsController2.TAG, "Clearing focus on an unknown view with id: " + i17);
                return;
            }
            android.view.View view = platformView.getView();
            if (view != null) {
                view.clearFocus();
                return;
            }
            io.flutter.Log.e(io.flutter.plugin.platform.PlatformViewsController2.TAG, "Clearing focus on a null view with id: " + i17);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void createPlatformView(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewCreationRequest platformViewCreationRequest) {
            io.flutter.plugin.platform.PlatformViewsController2.this.createFlutterPlatformView(platformViewCreationRequest);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void dispose(int i17) {
            io.flutter.plugin.platform.PlatformView platformView = (io.flutter.plugin.platform.PlatformView) io.flutter.plugin.platform.PlatformViewsController2.this.platformViews.get(i17);
            if (platformView == null) {
                io.flutter.Log.e(io.flutter.plugin.platform.PlatformViewsController2.TAG, "Disposing unknown platform view with id: " + i17);
                return;
            }
            if (platformView.getView() != null) {
                android.view.View view = platformView.getView();
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            io.flutter.plugin.platform.PlatformViewsController2.this.platformViews.remove(i17);
            try {
                platformView.dispose();
            } catch (java.lang.RuntimeException e17) {
                io.flutter.Log.e(io.flutter.plugin.platform.PlatformViewsController2.TAG, "Disposing platform view threw an exception", e17);
            }
            io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView flutterMutatorView = (io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView) io.flutter.plugin.platform.PlatformViewsController2.this.platformViewParent.get(i17);
            if (flutterMutatorView != null) {
                flutterMutatorView.removeAllViews();
                flutterMutatorView.unsetOnDescendantFocusChangeListener();
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) flutterMutatorView.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(flutterMutatorView);
                }
                io.flutter.plugin.platform.PlatformViewsController2.this.platformViewParent.remove(i17);
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public boolean isSurfaceControlEnabled() {
            if (io.flutter.plugin.platform.PlatformViewsController2.this.flutterJNI == null) {
                return false;
            }
            return io.flutter.plugin.platform.PlatformViewsController2.this.flutterJNI.IsSurfaceControlEnabled();
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void onTouch(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewTouch platformViewTouch) {
            int i17 = platformViewTouch.viewId;
            float f17 = io.flutter.plugin.platform.PlatformViewsController2.this.context.getResources().getDisplayMetrics().density;
            io.flutter.plugin.platform.PlatformView platformView = (io.flutter.plugin.platform.PlatformView) io.flutter.plugin.platform.PlatformViewsController2.this.platformViews.get(i17);
            if (platformView == null) {
                io.flutter.Log.e(io.flutter.plugin.platform.PlatformViewsController2.TAG, "Sending touch to an unknown view with id: " + i17);
                return;
            }
            android.view.View view = platformView.getView();
            if (view != null) {
                view.dispatchTouchEvent(io.flutter.plugin.platform.PlatformViewsController2.this.toMotionEvent(f17, platformViewTouch));
                return;
            }
            io.flutter.Log.e(io.flutter.plugin.platform.PlatformViewsController2.TAG, "Sending touch to a null view with id: " + i17);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler
        public void setDirection(int i17, int i18) {
            io.flutter.plugin.platform.PlatformView platformView = (io.flutter.plugin.platform.PlatformView) io.flutter.plugin.platform.PlatformViewsController2.this.platformViews.get(i17);
            if (platformView == null) {
                io.flutter.Log.e(io.flutter.plugin.platform.PlatformViewsController2.TAG, "Setting direction to an unknown view with id: " + i17);
                return;
            }
            android.view.View view = platformView.getView();
            if (view != null) {
                view.setLayoutDirection(i18);
                return;
            }
            io.flutter.Log.e(io.flutter.plugin.platform.PlatformViewsController2.TAG, "Setting direction to a null view with id: " + i17);
        }
    };
    private final io.flutter.plugin.platform.AccessibilityEventsDelegate accessibilityEventsDelegate = new io.flutter.plugin.platform.AccessibilityEventsDelegate();
    private final android.util.SparseArray<io.flutter.plugin.platform.PlatformView> platformViews = new android.util.SparseArray<>();
    private final android.util.SparseArray<io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView> platformViewParent = new android.util.SparseArray<>();
    private final java.util.ArrayList<android.view.SurfaceControl.Transaction> pendingTransactions = new java.util.ArrayList<>();
    private final java.util.ArrayList<android.view.SurfaceControl.Transaction> activeTransactions = new java.util.ArrayList<>();
    private final io.flutter.embedding.android.MotionEventTracker motionEventTracker = io.flutter.embedding.android.MotionEventTracker.getInstance();

    private void diposeAllViews() {
        while (this.platformViews.size() > 0) {
            this.channelHandler.dispose(this.platformViews.keyAt(0));
        }
    }

    private float getDisplayDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializePlatformViewIfNeeded$0(int i17, android.view.View view, boolean z17) {
        if (z17) {
            this.platformViewsChannel.invokeViewFocused(i17);
            return;
        }
        io.flutter.plugin.editing.TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin != null) {
            textInputPlugin.clearPlatformViewClient(i17);
        }
    }

    private void lockInputConnection(io.flutter.plugin.platform.VirtualDisplayController virtualDisplayController) {
        io.flutter.plugin.editing.TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.lockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionLocked();
    }

    private void maybeInvokeOnFlutterViewAttached(io.flutter.plugin.platform.PlatformView platformView) {
        io.flutter.embedding.android.FlutterView flutterView = this.flutterView;
        if (flutterView == null) {
            io.flutter.Log.i(TAG, "null flutterView");
        } else {
            platformView.onFlutterViewAttached(flutterView);
        }
    }

    private static android.view.MotionEvent.PointerCoords parsePointerCoords(java.lang.Object obj, float f17) {
        java.util.List list = (java.util.List) obj;
        android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((java.lang.Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((java.lang.Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((java.lang.Double) list.get(2)).doubleValue();
        double d17 = f17;
        pointerCoords.toolMajor = (float) (((java.lang.Double) list.get(3)).doubleValue() * d17);
        pointerCoords.toolMinor = (float) (((java.lang.Double) list.get(4)).doubleValue() * d17);
        pointerCoords.touchMajor = (float) (((java.lang.Double) list.get(5)).doubleValue() * d17);
        pointerCoords.touchMinor = (float) (((java.lang.Double) list.get(6)).doubleValue() * d17);
        pointerCoords.x = (float) (((java.lang.Double) list.get(7)).doubleValue() * d17);
        pointerCoords.y = (float) (((java.lang.Double) list.get(8)).doubleValue() * d17);
        return pointerCoords;
    }

    private static java.util.List<android.view.MotionEvent.PointerCoords> parsePointerCoordsList(java.lang.Object obj, float f17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerCoords(it.next(), f17));
        }
        return arrayList;
    }

    private static android.view.MotionEvent.PointerProperties parsePointerProperties(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
        pointerProperties.id = ((java.lang.Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((java.lang.Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    private static java.util.List<android.view.MotionEvent.PointerProperties> parsePointerPropertiesList(java.lang.Object obj) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(parsePointerProperties(it.next()));
        }
        return arrayList;
    }

    private int toLogicalPixels(double d17, float f17) {
        return (int) java.lang.Math.round(d17 / f17);
    }

    private int toPhysicalPixels(double d17) {
        return (int) java.lang.Math.round(d17 * getDisplayDensity());
    }

    private static void translateMotionEvent(android.view.MotionEvent motionEvent, android.view.MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    private void unlockInputConnection(io.flutter.plugin.platform.VirtualDisplayController virtualDisplayController) {
        io.flutter.plugin.editing.TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.unlockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionUnlocked();
    }

    private static boolean validateDirection(int i17) {
        return i17 == 0 || i17 == 1;
    }

    public void applyTransactions() {
        android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
        for (int i17 = 0; i17 < this.pendingTransactions.size(); i17++) {
            transaction = transaction.merge(this.pendingTransactions.get(i17));
        }
        transaction.apply();
        this.pendingTransactions.clear();
    }

    public void attach(android.content.Context context, io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        if (this.context != null) {
            throw new java.lang.AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.context = context;
        io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2 platformViewsChannel2 = new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2(dartExecutor);
        this.platformViewsChannel = platformViewsChannel2;
        platformViewsChannel2.setPlatformViewsHandler(this.channelHandler);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void attachAccessibilityBridge(io.flutter.view.AccessibilityBridge accessibilityBridge) {
        this.accessibilityEventsDelegate.setAccessibilityBridge(accessibilityBridge);
    }

    public void attachTextInputPlugin(io.flutter.plugin.editing.TextInputPlugin textInputPlugin) {
        this.textInputPlugin = textInputPlugin;
    }

    public void attachToFlutterRenderer(io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer) {
        this.androidTouchProcessor = new io.flutter.embedding.android.AndroidTouchProcessor(flutterRenderer, true);
    }

    public void attachToView(io.flutter.embedding.android.FlutterView flutterView) {
        this.flutterView = flutterView;
        for (int i17 = 0; i17 < this.platformViewParent.size(); i17++) {
            this.flutterView.addView(this.platformViewParent.valueAt(i17));
        }
        for (int i18 = 0; i18 < this.platformViews.size(); i18++) {
            this.platformViews.valueAt(i18).onFlutterViewAttached(this.flutterView);
        }
    }

    public io.flutter.plugin.platform.PlatformView createFlutterPlatformView(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewCreationRequest platformViewCreationRequest) {
        io.flutter.plugin.platform.PlatformViewFactory factory = this.registry.getFactory(platformViewCreationRequest.viewType);
        if (factory == null) {
            throw new java.lang.IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
        }
        io.flutter.plugin.platform.PlatformView create = factory.create(this.context, platformViewCreationRequest.viewId, platformViewCreationRequest.params != null ? factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params) : null);
        android.view.View view = create.getView();
        if (view == null) {
            throw new java.lang.IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(platformViewCreationRequest.direction);
        this.platformViews.put(platformViewCreationRequest.viewId, create);
        maybeInvokeOnFlutterViewAttached(create);
        return create;
    }

    public io.flutter.embedding.engine.FlutterOverlaySurface createOverlaySurface() {
        if (this.overlayerSurface == null) {
            android.view.SurfaceControl.Builder builder = new android.view.SurfaceControl.Builder();
            builder.setBufferSize(this.flutterView.getWidth(), this.flutterView.getHeight());
            builder.setFormat(1);
            builder.setName("Flutter Overlay Surface");
            builder.setOpaque(false);
            builder.setHidden(false);
            android.view.SurfaceControl build = builder.build();
            android.view.SurfaceControl.Transaction buildReparentTransaction = this.flutterView.getRootSurfaceControl().buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, 1000);
            buildReparentTransaction.apply();
            this.overlayerSurface = new android.view.Surface(build);
            this.overlaySurfaceControl = build;
        }
        return new io.flutter.embedding.engine.FlutterOverlaySurface(0, this.overlayerSurface);
    }

    public android.view.SurfaceControl.Transaction createTransaction() {
        android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
        this.pendingTransactions.add(transaction);
        return transaction;
    }

    public void destroyOverlaySurface() {
        android.view.Surface surface = this.overlayerSurface;
        if (surface != null) {
            surface.release();
            this.overlayerSurface = null;
            this.overlaySurfaceControl = null;
        }
    }

    public void detach() {
        io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2 platformViewsChannel2 = this.platformViewsChannel;
        if (platformViewsChannel2 != null) {
            platformViewsChannel2.setPlatformViewsHandler(null);
        }
        destroyOverlaySurface();
        this.platformViewsChannel = null;
        this.context = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void detachAccessibilityBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge(null);
    }

    public void detachFromView() {
        for (int i17 = 0; i17 < this.platformViewParent.size(); i17++) {
            this.flutterView.removeView(this.platformViewParent.valueAt(i17));
        }
        destroyOverlaySurface();
        this.flutterView = null;
        for (int i18 = 0; i18 < this.platformViews.size(); i18++) {
            this.platformViews.valueAt(i18).onFlutterViewDetached();
        }
    }

    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    public void disposePlatformView(int i17) {
        this.channelHandler.dispose(i17);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public android.view.View getPlatformViewById(int i17) {
        io.flutter.plugin.platform.PlatformView platformView = this.platformViews.get(i17);
        if (platformView == null) {
            return null;
        }
        return platformView.getView();
    }

    public io.flutter.plugin.platform.PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    public void hideOverlaySurface() {
        if (this.overlaySurfaceControl == null) {
            return;
        }
        android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
        transaction.setVisibility(this.overlaySurfaceControl, false);
        transaction.apply();
    }

    public boolean initializePlatformViewIfNeeded(final int i17) {
        io.flutter.plugin.platform.PlatformView platformView = this.platformViews.get(i17);
        if (platformView == null) {
            return false;
        }
        if (this.platformViewParent.get(i17) != null) {
            return true;
        }
        android.view.View view = platformView.getView();
        if (view == null) {
            throw new java.lang.IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (view.getParent() != null) {
            throw new java.lang.IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        android.content.Context context = this.context;
        io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView flutterMutatorView = new io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView(context, context.getResources().getDisplayMetrics().density, this.androidTouchProcessor);
        flutterMutatorView.setOnDescendantFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.PlatformViewsController2$$a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view2, boolean z17) {
                io.flutter.plugin.platform.PlatformViewsController2.this.lambda$initializePlatformViewIfNeeded$0(i17, view2, z17);
            }
        });
        this.platformViewParent.put(i17, flutterMutatorView);
        view.setImportantForAccessibility(4);
        flutterMutatorView.addView(view);
        this.flutterView.addView(flutterMutatorView);
        return true;
    }

    public void onDetachedFromJNI() {
        diposeAllViews();
    }

    public void onDisplayPlatformView(int i17, int i18, int i19, int i27, int i28, int i29, int i37, io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack flutterMutatorsStack) {
        if (initializePlatformViewIfNeeded(i17)) {
            io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView flutterMutatorView = this.platformViewParent.get(i17);
            flutterMutatorView.readyToDisplay(flutterMutatorsStack, i18, i19, i27, i28);
            flutterMutatorView.setVisibility(0);
            flutterMutatorView.bringToFront();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i29, i37);
            android.view.View view = this.platformViews.get(i17).getView();
            if (view != null) {
                view.setLayoutParams(layoutParams);
                view.bringToFront();
            }
        }
    }

    public void onEndFrame() {
        android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
        for (int i17 = 0; i17 < this.activeTransactions.size(); i17++) {
            transaction = transaction.merge(this.activeTransactions.get(i17));
        }
        this.activeTransactions.clear();
        this.flutterView.invalidate();
        this.flutterView.getRootSurfaceControl().applyTransactionOnDraw(transaction);
    }

    public void onPreEngineRestart() {
        diposeAllViews();
    }

    public void setFlutterJNI(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    public void setRegistry(io.flutter.plugin.platform.PlatformViewRegistry platformViewRegistry) {
        this.registry = (io.flutter.plugin.platform.PlatformViewRegistryImpl) platformViewRegistry;
    }

    public void showOverlaySurface() {
        if (this.overlaySurfaceControl == null) {
            return;
        }
        android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
        transaction.setVisibility(this.overlaySurfaceControl, true);
        transaction.apply();
    }

    public synchronized void swapTransactions() {
        this.activeTransactions.clear();
        for (int i17 = 0; i17 < this.pendingTransactions.size(); i17++) {
            this.activeTransactions.add(this.pendingTransactions.get(i17));
        }
        this.pendingTransactions.clear();
    }

    public android.view.MotionEvent toMotionEvent(float f17, io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewTouch platformViewTouch) {
        android.view.MotionEvent pop = this.motionEventTracker.pop(io.flutter.embedding.android.MotionEventTracker.MotionEventId.from(platformViewTouch.motionEventId));
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = (android.view.MotionEvent.PointerCoords[]) parsePointerCoordsList(platformViewTouch.rawPointerCoords, f17).toArray(new android.view.MotionEvent.PointerCoords[platformViewTouch.pointerCount]);
        if (pop != null) {
            translateMotionEvent(pop, pointerCoordsArr);
            return pop;
        }
        return android.view.MotionEvent.obtain(platformViewTouch.downTime.longValue(), platformViewTouch.eventTime.longValue(), platformViewTouch.action, platformViewTouch.pointerCount, (android.view.MotionEvent.PointerProperties[]) parsePointerPropertiesList(platformViewTouch.rawPointerPropertiesList).toArray(new android.view.MotionEvent.PointerProperties[platformViewTouch.pointerCount]), pointerCoordsArr, platformViewTouch.metaState, platformViewTouch.buttonState, platformViewTouch.xPrecision, platformViewTouch.yPrecision, platformViewTouch.deviceId, platformViewTouch.edgeFlags, platformViewTouch.source, platformViewTouch.flags);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public boolean usesVirtualDisplay(int i17) {
        return false;
    }

    private int toLogicalPixels(double d17) {
        return toLogicalPixels(d17, getDisplayDensity());
    }
}
