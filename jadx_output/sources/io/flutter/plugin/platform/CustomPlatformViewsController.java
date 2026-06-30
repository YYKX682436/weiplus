package io.flutter.plugin.platform;

/* loaded from: classes15.dex */
public class CustomPlatformViewsController extends io.flutter.plugin.platform.PlatformViewsController {
    private static final java.lang.String TAG = "CustomPlatformViewsController";
    private static java.lang.Class[] VIEW_TYPES_REQUIRE_VIRTUAL_DISPLAY = {android.view.SurfaceView.class};
    private static boolean enableImageRenderTarget = true;
    private static boolean enableSurfaceProducerRenderTarget = true;
    private byte _hellAccFlag_;
    private io.flutter.embedding.android.AndroidTouchProcessor androidTouchProcessor;
    protected android.content.Context context;
    private io.flutter.embedding.android.FlutterView flutterView;
    protected io.flutter.embedding.engine.systemchannels.PlatformViewsChannel platformViewsChannel;
    private io.flutter.plugin.editing.TextInputPlugin textInputPlugin;
    protected io.flutter.view.TextureRegistry textureRegistry;
    private int nextOverlayLayerId = 0;
    private boolean flutterViewConvertedToImageView = false;
    private boolean synchronizeToNativeViewHierarchy = true;
    private boolean usesSoftwareRendering = false;
    protected final io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler channelHandler = new io.flutter.plugin.platform.CustomPlatformViewsController.AnonymousClass1();
    private final io.flutter.plugin.platform.PlatformViewRegistryImpl registry = new io.flutter.plugin.platform.PlatformViewRegistryImpl();
    final java.util.HashMap<java.lang.Integer, io.flutter.plugin.platform.VirtualDisplayController> vdControllers = new java.util.HashMap<>();
    private final io.flutter.plugin.platform.AccessibilityEventsDelegate accessibilityEventsDelegate = new io.flutter.plugin.platform.AccessibilityEventsDelegate();
    final java.util.HashMap<android.content.Context, android.view.View> contextToEmbeddedView = new java.util.HashMap<>();
    private final android.util.SparseArray<io.flutter.plugin.platform.PlatformOverlayView> overlayLayerViews = new android.util.SparseArray<>();
    private final java.util.HashSet<java.lang.Integer> currentFrameUsedOverlayLayerIds = new java.util.HashSet<>();
    private final java.util.HashSet<java.lang.Integer> currentFrameUsedPlatformViewIds = new java.util.HashSet<>();
    private final android.util.SparseArray<io.flutter.plugin.platform.PlatformViewWrapper> viewWrappers = new android.util.SparseArray<>();
    private final android.util.SparseArray<io.flutter.plugin.platform.PlatformView> platformViews = new android.util.SparseArray<>();
    private final android.util.SparseArray<io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView> platformViewParent = new android.util.SparseArray<>();
    private final io.flutter.embedding.android.MotionEventTracker motionEventTracker = io.flutter.embedding.android.MotionEventTracker.getInstance();

    /* renamed from: io.flutter.plugin.platform.CustomPlatformViewsController$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass1 implements io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$resize$0(io.flutter.plugin.platform.VirtualDisplayController virtualDisplayController, float f17, io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
            io.flutter.plugin.platform.CustomPlatformViewsController.this.unlockInputConnection(virtualDisplayController);
            io.flutter.plugin.platform.CustomPlatformViewsController customPlatformViewsController = io.flutter.plugin.platform.CustomPlatformViewsController.this;
            if (customPlatformViewsController.context != null) {
                f17 = customPlatformViewsController.getDisplayDensity();
            }
            platformViewBufferResized.run(new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferSize(io.flutter.plugin.platform.CustomPlatformViewsController.this.toLogicalPixels(virtualDisplayController.getRenderTargetWidth(), f17), io.flutter.plugin.platform.CustomPlatformViewsController.this.toLogicalPixels(virtualDisplayController.getRenderTargetHeight(), f17)));
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void clearFocus(int i17) {
            android.view.View view;
            if (io.flutter.plugin.platform.CustomPlatformViewsController.this.usesVirtualDisplay(i17)) {
                view = io.flutter.plugin.platform.CustomPlatformViewsController.this.vdControllers.get(java.lang.Integer.valueOf(i17)).getView();
            } else {
                io.flutter.plugin.platform.PlatformView platformView = (io.flutter.plugin.platform.PlatformView) io.flutter.plugin.platform.CustomPlatformViewsController.this.platformViews.get(i17);
                if (platformView == null) {
                    io.flutter.Log.e(io.flutter.plugin.platform.CustomPlatformViewsController.TAG, "Clearing focus on an unknown view with id: " + i17);
                    return;
                }
                view = platformView.getView();
            }
            if (view != null) {
                view.clearFocus();
                return;
            }
            io.flutter.Log.e(io.flutter.plugin.platform.CustomPlatformViewsController.TAG, "Clearing focus on a null view with id: " + i17);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void createForPlatformViewLayer(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            io.flutter.plugin.platform.CustomPlatformViewsController.this.enforceMinimumAndroidApiVersion(19);
            io.flutter.plugin.platform.CustomPlatformViewsController.this.ensureValidRequest(platformViewCreationRequest);
            io.flutter.plugin.platform.CustomPlatformViewsController.this.configureForHybridComposition(io.flutter.plugin.platform.CustomPlatformViewsController.this.createPlatformView(platformViewCreationRequest, false), platformViewCreationRequest);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public long createForTextureLayer(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            io.flutter.plugin.platform.CustomPlatformViewsController.this.ensureValidRequest(platformViewCreationRequest);
            int i17 = platformViewCreationRequest.viewId;
            if (io.flutter.plugin.platform.CustomPlatformViewsController.this.viewWrappers.get(i17) != null) {
                throw new java.lang.IllegalStateException("Trying to create an already created platform view, view id: " + i17);
            }
            io.flutter.plugin.platform.CustomPlatformViewsController customPlatformViewsController = io.flutter.plugin.platform.CustomPlatformViewsController.this;
            if (customPlatformViewsController.textureRegistry == null) {
                throw new java.lang.IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i17);
            }
            if (customPlatformViewsController.flutterView == null) {
                throw new java.lang.IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i17);
            }
            io.flutter.plugin.platform.PlatformView createPlatformView = io.flutter.plugin.platform.CustomPlatformViewsController.this.createPlatformView(platformViewCreationRequest, true);
            android.view.View view = createPlatformView.getView();
            if (view.getParent() != null) {
                throw new java.lang.IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
            }
            if (!(io.flutter.util.ViewUtils.hasChildViewOfType(view, io.flutter.plugin.platform.CustomPlatformViewsController.VIEW_TYPES_REQUIRE_VIRTUAL_DISPLAY) ? false : true)) {
                if (platformViewCreationRequest.displayMode == io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK) {
                    io.flutter.plugin.platform.CustomPlatformViewsController.this.configureForHybridComposition(createPlatformView, platformViewCreationRequest);
                    return -2L;
                }
                if (!io.flutter.plugin.platform.CustomPlatformViewsController.this.usesSoftwareRendering) {
                    return io.flutter.plugin.platform.CustomPlatformViewsController.this.configureForVirtualDisplay(createPlatformView, platformViewCreationRequest);
                }
            }
            return io.flutter.plugin.platform.CustomPlatformViewsController.this.configureForTextureLayerComposition(createPlatformView, platformViewCreationRequest);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void dispose(int i17) {
            io.flutter.plugin.platform.PlatformView platformView = (io.flutter.plugin.platform.PlatformView) io.flutter.plugin.platform.CustomPlatformViewsController.this.platformViews.get(i17);
            if (platformView == null) {
                io.flutter.Log.e(io.flutter.plugin.platform.CustomPlatformViewsController.TAG, "Disposing unknown platform view with id: " + i17);
                return;
            }
            if (platformView.getView() != null) {
                android.view.View view = platformView.getView();
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            io.flutter.plugin.platform.CustomPlatformViewsController.this.platformViews.remove(i17);
            try {
                platformView.dispose();
            } catch (java.lang.RuntimeException e17) {
                io.flutter.Log.e(io.flutter.plugin.platform.CustomPlatformViewsController.TAG, "Disposing platform view threw an exception", e17);
            }
            if (io.flutter.plugin.platform.CustomPlatformViewsController.this.usesVirtualDisplay(i17)) {
                io.flutter.plugin.platform.VirtualDisplayController virtualDisplayController = io.flutter.plugin.platform.CustomPlatformViewsController.this.vdControllers.get(java.lang.Integer.valueOf(i17));
                android.view.View view2 = virtualDisplayController.getView();
                if (view2 != null) {
                    io.flutter.plugin.platform.CustomPlatformViewsController.this.contextToEmbeddedView.remove(view2.getContext());
                }
                virtualDisplayController.dispose();
                io.flutter.plugin.platform.CustomPlatformViewsController.this.vdControllers.remove(java.lang.Integer.valueOf(i17));
                return;
            }
            io.flutter.plugin.platform.PlatformViewWrapper platformViewWrapper = (io.flutter.plugin.platform.PlatformViewWrapper) io.flutter.plugin.platform.CustomPlatformViewsController.this.viewWrappers.get(i17);
            if (platformViewWrapper != null) {
                platformViewWrapper.removeAllViews();
                platformViewWrapper.release();
                platformViewWrapper.unsetOnDescendantFocusChangeListener();
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) platformViewWrapper.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(platformViewWrapper);
                }
                io.flutter.plugin.platform.CustomPlatformViewsController.this.viewWrappers.remove(i17);
                return;
            }
            io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView flutterMutatorView = (io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView) io.flutter.plugin.platform.CustomPlatformViewsController.this.platformViewParent.get(i17);
            if (flutterMutatorView != null) {
                flutterMutatorView.removeAllViews();
                flutterMutatorView.unsetOnDescendantFocusChangeListener();
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) flutterMutatorView.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(flutterMutatorView);
                }
                io.flutter.plugin.platform.CustomPlatformViewsController.this.platformViewParent.remove(i17);
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void offset(int i17, double d17, double d18) {
            if (io.flutter.plugin.platform.CustomPlatformViewsController.this.usesVirtualDisplay(i17)) {
                return;
            }
            io.flutter.plugin.platform.PlatformViewWrapper platformViewWrapper = (io.flutter.plugin.platform.PlatformViewWrapper) io.flutter.plugin.platform.CustomPlatformViewsController.this.viewWrappers.get(i17);
            if (platformViewWrapper == null) {
                io.flutter.Log.e(io.flutter.plugin.platform.CustomPlatformViewsController.TAG, "Setting offset for unknown platform view with id: " + i17);
            } else {
                int physicalPixels = io.flutter.plugin.platform.CustomPlatformViewsController.this.toPhysicalPixels(d17);
                int physicalPixels2 = io.flutter.plugin.platform.CustomPlatformViewsController.this.toPhysicalPixels(d18);
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) platformViewWrapper.getLayoutParams();
                layoutParams.topMargin = physicalPixels;
                layoutParams.leftMargin = physicalPixels2;
                platformViewWrapper.setLayoutParams(layoutParams);
            }
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void onTouch(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewTouch platformViewTouch) {
            int i17 = platformViewTouch.viewId;
            float f17 = io.flutter.plugin.platform.CustomPlatformViewsController.this.context.getResources().getDisplayMetrics().density;
            if (io.flutter.plugin.platform.CustomPlatformViewsController.this.usesVirtualDisplay(i17)) {
                io.flutter.plugin.platform.CustomPlatformViewsController.this.vdControllers.get(java.lang.Integer.valueOf(i17)).dispatchTouchEvent(io.flutter.plugin.platform.CustomPlatformViewsController.this.toMotionEvent(f17, platformViewTouch, true));
                return;
            }
            io.flutter.plugin.platform.PlatformView platformView = (io.flutter.plugin.platform.PlatformView) io.flutter.plugin.platform.CustomPlatformViewsController.this.platformViews.get(i17);
            if (platformView == null) {
                io.flutter.Log.e(io.flutter.plugin.platform.CustomPlatformViewsController.TAG, "Sending touch to an unknown view with id: " + i17);
                return;
            }
            android.view.View view = platformView.getView();
            if (view != null) {
                view.dispatchTouchEvent(io.flutter.plugin.platform.CustomPlatformViewsController.this.toMotionEvent(f17, platformViewTouch, false));
                return;
            }
            io.flutter.Log.e(io.flutter.plugin.platform.CustomPlatformViewsController.TAG, "Sending touch to a null view with id: " + i17);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void resize(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewResizeRequest platformViewResizeRequest, final io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized) {
            int physicalPixels = io.flutter.plugin.platform.CustomPlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalWidth);
            int physicalPixels2 = io.flutter.plugin.platform.CustomPlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalHeight);
            int i17 = platformViewResizeRequest.viewId;
            if (io.flutter.plugin.platform.CustomPlatformViewsController.this.usesVirtualDisplay(i17)) {
                final float displayDensity = io.flutter.plugin.platform.CustomPlatformViewsController.this.getDisplayDensity();
                final io.flutter.plugin.platform.VirtualDisplayController virtualDisplayController = io.flutter.plugin.platform.CustomPlatformViewsController.this.vdControllers.get(java.lang.Integer.valueOf(i17));
                io.flutter.plugin.platform.CustomPlatformViewsController.this.lockInputConnection(virtualDisplayController);
                virtualDisplayController.resize(physicalPixels, physicalPixels2, new java.lang.Runnable() { // from class: io.flutter.plugin.platform.CustomPlatformViewsController$1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        io.flutter.plugin.platform.CustomPlatformViewsController.AnonymousClass1.this.lambda$resize$0(virtualDisplayController, displayDensity, platformViewBufferResized);
                    }
                });
                return;
            }
            io.flutter.plugin.platform.PlatformView platformView = (io.flutter.plugin.platform.PlatformView) io.flutter.plugin.platform.CustomPlatformViewsController.this.platformViews.get(i17);
            io.flutter.plugin.platform.PlatformViewWrapper platformViewWrapper = (io.flutter.plugin.platform.PlatformViewWrapper) io.flutter.plugin.platform.CustomPlatformViewsController.this.viewWrappers.get(i17);
            if (platformView == null || platformViewWrapper == null) {
                io.flutter.Log.e(io.flutter.plugin.platform.CustomPlatformViewsController.TAG, "Resizing unknown platform view with id: " + i17);
                return;
            }
            if (physicalPixels > platformViewWrapper.getRenderTargetWidth() || physicalPixels2 > platformViewWrapper.getRenderTargetHeight()) {
                platformViewWrapper.resizeRenderTarget(physicalPixels, physicalPixels2);
            }
            android.view.ViewGroup.LayoutParams layoutParams = platformViewWrapper.getLayoutParams();
            layoutParams.width = physicalPixels;
            layoutParams.height = physicalPixels2;
            platformViewWrapper.setLayoutParams(layoutParams);
            android.view.View view = platformView.getView();
            if (view != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = physicalPixels;
                layoutParams2.height = physicalPixels2;
                view.setLayoutParams(layoutParams2);
            }
            platformViewBufferResized.run(new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferSize(io.flutter.plugin.platform.CustomPlatformViewsController.this.toLogicalPixels(platformViewWrapper.getRenderTargetWidth()), io.flutter.plugin.platform.CustomPlatformViewsController.this.toLogicalPixels(platformViewWrapper.getRenderTargetHeight())));
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void setDirection(int i17, int i18) {
            android.view.View view;
            if (!io.flutter.plugin.platform.CustomPlatformViewsController.validateDirection(i18)) {
                throw new java.lang.IllegalStateException("Trying to set unknown direction value: " + i18 + "(view id: " + i17 + ")");
            }
            if (io.flutter.plugin.platform.CustomPlatformViewsController.this.usesVirtualDisplay(i17)) {
                view = io.flutter.plugin.platform.CustomPlatformViewsController.this.vdControllers.get(java.lang.Integer.valueOf(i17)).getView();
            } else {
                io.flutter.plugin.platform.PlatformView platformView = (io.flutter.plugin.platform.PlatformView) io.flutter.plugin.platform.CustomPlatformViewsController.this.platformViews.get(i17);
                if (platformView == null) {
                    io.flutter.Log.e(io.flutter.plugin.platform.CustomPlatformViewsController.TAG, "Setting direction to an unknown view with id: " + i17);
                    return;
                }
                view = platformView.getView();
            }
            if (view != null) {
                view.setLayoutDirection(i18);
                return;
            }
            io.flutter.Log.e(io.flutter.plugin.platform.CustomPlatformViewsController.TAG, "Setting direction to a null view with id: " + i17);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void synchronizeToNativeViewHierarchy(boolean z17) {
            io.flutter.plugin.platform.CustomPlatformViewsController.this.synchronizeToNativeViewHierarchy = z17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void configureForHybridComposition(io.flutter.plugin.platform.PlatformView platformView, io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        enforceMinimumAndroidApiVersion(19);
        io.flutter.Log.i(TAG, "Using hybrid composition for platform view: " + platformViewCreationRequest.viewId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long configureForVirtualDisplay(io.flutter.plugin.platform.PlatformView platformView, final io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        enforceMinimumAndroidApiVersion(20);
        io.flutter.Log.i(TAG, "Hosting view in a virtual display for platform view: " + platformViewCreationRequest.viewId);
        io.flutter.plugin.platform.PlatformViewRenderTarget makePlatformViewRenderTarget = makePlatformViewRenderTarget(this.textureRegistry);
        io.flutter.plugin.platform.VirtualDisplayController create = io.flutter.plugin.platform.VirtualDisplayController.create(this.context, this.accessibilityEventsDelegate, platformView, makePlatformViewRenderTarget, toPhysicalPixels(platformViewCreationRequest.logicalWidth), toPhysicalPixels(platformViewCreationRequest.logicalHeight), platformViewCreationRequest.viewId, null, new android.view.View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.CustomPlatformViewsController$$d
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z17) {
                io.flutter.plugin.platform.CustomPlatformViewsController.this.lambda$configureForVirtualDisplay$0(platformViewCreationRequest, view, z17);
            }
        });
        if (create != null) {
            this.vdControllers.put(java.lang.Integer.valueOf(platformViewCreationRequest.viewId), create);
            android.view.View view = platformView.getView();
            this.contextToEmbeddedView.put(view.getContext(), view);
            return makePlatformViewRenderTarget.getId();
        }
        throw new java.lang.IllegalStateException("Failed creating virtual display for a " + platformViewCreationRequest.viewType + " with id: " + platformViewCreationRequest.viewId);
    }

    private void diposeAllViews() {
        while (this.platformViews.size() > 0) {
            this.channelHandler.dispose(this.platformViews.keyAt(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void enforceMinimumAndroidApiVersion(int i17) {
        int i18 = android.os.Build.VERSION.SDK_INT;
        if (i18 >= i17) {
            return;
        }
        throw new java.lang.IllegalStateException("Trying to use platform views with API " + i18 + ", required API level is: " + i17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ensureValidRequest(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        if (validateDirection(platformViewCreationRequest.direction)) {
            return;
        }
        throw new java.lang.IllegalStateException("Trying to create a view with unknown direction value: " + platformViewCreationRequest.direction + "(view id: " + platformViewCreationRequest.viewId + ")");
    }

    private void finishFrame(boolean z17) {
        for (int i17 = 0; i17 < this.overlayLayerViews.size(); i17++) {
            int keyAt = this.overlayLayerViews.keyAt(i17);
            io.flutter.plugin.platform.PlatformOverlayView valueAt = this.overlayLayerViews.valueAt(i17);
            if (this.currentFrameUsedOverlayLayerIds.contains(java.lang.Integer.valueOf(keyAt))) {
                this.flutterView.attachOverlaySurfaceToRender(valueAt);
                z17 &= valueAt.acquireLatestImage();
            } else {
                if (!this.flutterViewConvertedToImageView) {
                    valueAt.detachFromRenderer();
                }
                valueAt.setVisibility(8);
                this.flutterView.removeView(valueAt);
            }
        }
        for (int i18 = 0; i18 < this.platformViewParent.size(); i18++) {
            int keyAt2 = this.platformViewParent.keyAt(i18);
            io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView flutterMutatorView = this.platformViewParent.get(keyAt2);
            if (!this.currentFrameUsedPlatformViewIds.contains(java.lang.Integer.valueOf(keyAt2)) || (!z17 && this.synchronizeToNativeViewHierarchy)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(flutterMutatorView, arrayList.toArray(), "io/flutter/plugin/platform/CustomPlatformViewsController", "finishFrame", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                flutterMutatorView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(flutterMutatorView, "io/flutter/plugin/platform/CustomPlatformViewsController", "finishFrame", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(flutterMutatorView, arrayList2.toArray(), "io/flutter/plugin/platform/CustomPlatformViewsController", "finishFrame", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                flutterMutatorView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(flutterMutatorView, "io/flutter/plugin/platform/CustomPlatformViewsController", "finishFrame", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayDensity() {
        return this.context.getResources().getDisplayMetrics().density;
    }

    private void initializeRootImageViewIfNeeded() {
        if (!this.synchronizeToNativeViewHierarchy || this.flutterViewConvertedToImageView) {
            return;
        }
        this.flutterView.convertToImageView();
        this.flutterViewConvertedToImageView = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureForTextureLayerComposition$1(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, android.view.View view, boolean z17) {
        if (z17) {
            this.platformViewsChannel.invokeViewFocused(platformViewCreationRequest.viewId);
            return;
        }
        io.flutter.plugin.editing.TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin != null) {
            textInputPlugin.clearPlatformViewClient(platformViewCreationRequest.viewId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$configureForVirtualDisplay$0(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, android.view.View view, boolean z17) {
        if (z17) {
            this.platformViewsChannel.invokeViewFocused(platformViewCreationRequest.viewId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializePlatformViewIfNeeded$2(int i17, android.view.View view, boolean z17) {
        if (z17) {
            this.platformViewsChannel.invokeViewFocused(i17);
            return;
        }
        io.flutter.plugin.editing.TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin != null) {
            textInputPlugin.clearPlatformViewClient(i17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEndFrame$3() {
        finishFrame(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lockInputConnection(io.flutter.plugin.platform.VirtualDisplayController virtualDisplayController) {
        io.flutter.plugin.editing.TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.lockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionLocked();
    }

    private static io.flutter.plugin.platform.PlatformViewRenderTarget makePlatformViewRenderTarget(io.flutter.view.TextureRegistry textureRegistry) {
        if (enableSurfaceProducerRenderTarget && android.os.Build.VERSION.SDK_INT >= 29) {
            io.flutter.view.TextureRegistry.SurfaceProducer createSurfaceProducer = textureRegistry.createSurfaceProducer();
            io.flutter.Log.i(TAG, "PlatformView is using SurfaceProducer backend");
            return new io.flutter.plugin.platform.SurfaceProducerPlatformViewRenderTarget(createSurfaceProducer);
        }
        if (!enableImageRenderTarget || android.os.Build.VERSION.SDK_INT < 29) {
            io.flutter.view.TextureRegistry.SurfaceTextureEntry createSurfaceTexture = textureRegistry.createSurfaceTexture();
            io.flutter.Log.i(TAG, "PlatformView is using SurfaceTexture backend");
            return new io.flutter.plugin.platform.SurfaceTexturePlatformViewRenderTarget(createSurfaceTexture);
        }
        io.flutter.view.TextureRegistry.ImageTextureEntry createImageTexture = textureRegistry.createImageTexture();
        io.flutter.Log.i(TAG, "PlatformView is using ImageReader backend");
        return new io.flutter.plugin.platform.ImageReaderPlatformViewRenderTarget(createImageTexture);
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

    private void removeOverlaySurfaces() {
        if (this.flutterView == null) {
            io.flutter.Log.e(TAG, "removeOverlaySurfaces called while flutter view is null");
            return;
        }
        for (int i17 = 0; i17 < this.overlayLayerViews.size(); i17++) {
            this.flutterView.removeView(this.overlayLayerViews.valueAt(i17));
        }
        this.overlayLayerViews.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toLogicalPixels(double d17, float f17) {
        return (int) java.lang.Math.round(d17 / f17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unlockInputConnection(io.flutter.plugin.platform.VirtualDisplayController virtualDisplayController) {
        io.flutter.plugin.editing.TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.unlockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionUnlocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean validateDirection(int i17) {
        return i17 == 0 || i17 == 1;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void attach(android.content.Context context, io.flutter.view.TextureRegistry textureRegistry, io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        if (this.context != null) {
            throw new java.lang.AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.context = context;
        this.textureRegistry = textureRegistry;
        io.flutter.embedding.engine.systemchannels.PlatformViewsChannel platformViewsChannel = new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel(dartExecutor);
        this.platformViewsChannel = platformViewsChannel;
        platformViewsChannel.setPlatformViewsHandler(this.channelHandler);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController, io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void attachAccessibilityBridge(io.flutter.view.AccessibilityBridge accessibilityBridge) {
        this.accessibilityEventsDelegate.setAccessibilityBridge(accessibilityBridge);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void attachTextInputPlugin(io.flutter.plugin.editing.TextInputPlugin textInputPlugin) {
        this.textInputPlugin = textInputPlugin;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void attachToFlutterRenderer(io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer) {
        this.androidTouchProcessor = new io.flutter.embedding.android.AndroidTouchProcessor(flutterRenderer, true);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void attachToView(io.flutter.embedding.android.FlutterView flutterView) {
        this.flutterView = flutterView;
        for (int i17 = 0; i17 < this.viewWrappers.size(); i17++) {
            this.flutterView.addView(this.viewWrappers.valueAt(i17));
        }
        for (int i18 = 0; i18 < this.platformViewParent.size(); i18++) {
            this.flutterView.addView(this.platformViewParent.valueAt(i18));
        }
        for (int i19 = 0; i19 < this.platformViews.size(); i19++) {
            this.platformViews.valueAt(i19).onFlutterViewAttached(this.flutterView);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public boolean checkInputConnectionProxy(android.view.View view) {
        if (view == null || !this.contextToEmbeddedView.containsKey(view.getContext())) {
            return false;
        }
        android.view.View view2 = this.contextToEmbeddedView.get(view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public long configureForTextureLayerComposition(io.flutter.plugin.platform.PlatformView platformView, final io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        io.flutter.plugin.platform.PlatformViewWrapper platformViewWrapper;
        long j17;
        enforceMinimumAndroidApiVersion(23);
        io.flutter.Log.i(TAG, "Hosting view in view hierarchy for platform view: " + platformViewCreationRequest.viewId);
        int physicalPixels = toPhysicalPixels(platformViewCreationRequest.logicalWidth);
        int physicalPixels2 = toPhysicalPixels(platformViewCreationRequest.logicalHeight);
        if (this.usesSoftwareRendering) {
            platformViewWrapper = new io.flutter.plugin.platform.PlatformViewWrapper(this.context);
            j17 = -1;
        } else {
            io.flutter.plugin.platform.PlatformViewRenderTarget makePlatformViewRenderTarget = makePlatformViewRenderTarget(this.textureRegistry);
            io.flutter.plugin.platform.PlatformViewWrapper platformViewWrapper2 = new io.flutter.plugin.platform.PlatformViewWrapper(this.context, makePlatformViewRenderTarget);
            long id6 = makePlatformViewRenderTarget.getId();
            platformViewWrapper = platformViewWrapper2;
            j17 = id6;
        }
        platformViewWrapper.setTouchProcessor(this.androidTouchProcessor);
        platformViewWrapper.resizeRenderTarget(physicalPixels, physicalPixels2);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(physicalPixels, physicalPixels2);
        int physicalPixels3 = toPhysicalPixels(platformViewCreationRequest.logicalTop);
        int physicalPixels4 = toPhysicalPixels(platformViewCreationRequest.logicalLeft);
        layoutParams.topMargin = physicalPixels3;
        layoutParams.leftMargin = physicalPixels4;
        platformViewWrapper.setLayoutParams(layoutParams);
        android.view.View view = platformView.getView();
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(physicalPixels, physicalPixels2));
        view.setImportantForAccessibility(4);
        platformViewWrapper.addView(view);
        platformViewWrapper.setOnDescendantFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.CustomPlatformViewsController$$c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view2, boolean z17) {
                io.flutter.plugin.platform.CustomPlatformViewsController.this.lambda$configureForTextureLayerComposition$1(platformViewCreationRequest, view2, z17);
            }
        });
        this.flutterView.addView(platformViewWrapper);
        this.viewWrappers.append(platformViewCreationRequest.viewId, platformViewWrapper);
        maybeInvokeOnFlutterViewAttached(platformView);
        return j17;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public io.flutter.embedding.engine.FlutterOverlaySurface createOverlaySurface(io.flutter.plugin.platform.PlatformOverlayView platformOverlayView) {
        int i17 = this.nextOverlayLayerId;
        this.nextOverlayLayerId = i17 + 1;
        this.overlayLayerViews.put(i17, platformOverlayView);
        return new io.flutter.embedding.engine.FlutterOverlaySurface(i17, platformOverlayView.getSurface());
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public io.flutter.plugin.platform.PlatformView createPlatformView(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, boolean z17) {
        io.flutter.plugin.platform.PlatformViewFactory factory = this.registry.getFactory(platformViewCreationRequest.viewType);
        if (factory == null) {
            throw new java.lang.IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.viewType);
        }
        io.flutter.plugin.platform.PlatformView create = factory.create(z17 ? new android.content.MutableContextWrapper(this.context) : this.context, platformViewCreationRequest.viewId, platformViewCreationRequest.params != null ? factory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params) : null);
        android.view.View view = create.getView();
        if (view == null) {
            throw new java.lang.IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        view.setLayoutDirection(platformViewCreationRequest.direction);
        this.platformViews.put(platformViewCreationRequest.viewId, create);
        maybeInvokeOnFlutterViewAttached(create);
        return create;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void destroyOverlaySurfaces() {
        io.flutter.Log.i(TAG, "overlayLayerViews size=" + this.overlayLayerViews.size());
        for (int i17 = 0; i17 < this.overlayLayerViews.size(); i17++) {
            io.flutter.plugin.platform.PlatformOverlayView valueAt = this.overlayLayerViews.valueAt(i17);
            valueAt.detachFromRenderer();
            valueAt.closeImageReader();
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void detach() {
        io.flutter.embedding.engine.systemchannels.PlatformViewsChannel platformViewsChannel = this.platformViewsChannel;
        if (platformViewsChannel != null) {
            platformViewsChannel.setPlatformViewsHandler(null);
        }
        destroyOverlaySurfaces();
        this.platformViewsChannel = null;
        this.context = null;
        this.textureRegistry = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController, io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public void detachAccessibilityBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge(null);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void detachFromView() {
        for (int i17 = 0; i17 < this.viewWrappers.size(); i17++) {
            this.flutterView.removeView(this.viewWrappers.valueAt(i17));
        }
        for (int i18 = 0; i18 < this.platformViewParent.size(); i18++) {
            this.flutterView.removeView(this.platformViewParent.valueAt(i18));
        }
        destroyOverlaySurfaces();
        removeOverlaySurfaces();
        this.flutterView = null;
        this.flutterViewConvertedToImageView = false;
        for (int i19 = 0; i19 < this.platformViews.size(); i19++) {
            this.platformViews.valueAt(i19).onFlutterViewDetached();
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void disposePlatformView(int i17) {
        this.channelHandler.dispose(i17);
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public android.util.SparseArray<io.flutter.plugin.platform.PlatformOverlayView> getOverlayLayerViews() {
        return this.overlayLayerViews;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController, io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public android.view.View getPlatformViewById(int i17) {
        if (usesVirtualDisplay(i17)) {
            return this.vdControllers.get(java.lang.Integer.valueOf(i17)).getView();
        }
        io.flutter.plugin.platform.PlatformView platformView = this.platformViews.get(i17);
        if (platformView == null) {
            return null;
        }
        return platformView.getView();
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public io.flutter.plugin.platform.PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
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
        flutterMutatorView.setOnDescendantFocusChangeListener(new android.view.View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.CustomPlatformViewsController$$a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view2, boolean z17) {
                io.flutter.plugin.platform.CustomPlatformViewsController.this.lambda$initializePlatformViewIfNeeded$2(i17, view2, z17);
            }
        });
        this.platformViewParent.put(i17, flutterMutatorView);
        view.setImportantForAccessibility(4);
        flutterMutatorView.addView(view);
        this.flutterView.addView(flutterMutatorView);
        return true;
    }

    public void onAttachedToJNI() {
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void onBeginFrame() {
        this.currentFrameUsedOverlayLayerIds.clear();
        this.currentFrameUsedPlatformViewIds.clear();
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void onDetachedFromJNI() {
        diposeAllViews();
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void onDisplayOverlaySurface(int i17, int i18, int i19, int i27, int i28) {
        if (this.overlayLayerViews.get(i17) == null) {
            throw new java.lang.IllegalStateException("The overlay surface (id:" + i17 + ") doesn't exist");
        }
        initializeRootImageViewIfNeeded();
        io.flutter.plugin.platform.PlatformOverlayView platformOverlayView = this.overlayLayerViews.get(i17);
        if (platformOverlayView.getParent() == null) {
            this.flutterView.addView(platformOverlayView);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i27, i28);
        layoutParams.leftMargin = i18;
        layoutParams.topMargin = i19;
        platformOverlayView.setLayoutParams(layoutParams);
        platformOverlayView.setVisibility(0);
        platformOverlayView.bringToFront();
        this.currentFrameUsedOverlayLayerIds.add(java.lang.Integer.valueOf(i17));
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void onDisplayPlatformView(int i17, int i18, int i19, int i27, int i28, int i29, int i37, io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack flutterMutatorsStack) {
        initializeRootImageViewIfNeeded();
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
            this.currentFrameUsedPlatformViewIds.add(java.lang.Integer.valueOf(i17));
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void onEndFrame() {
        boolean z17 = false;
        if (this.flutterViewConvertedToImageView && this.currentFrameUsedPlatformViewIds.isEmpty()) {
            this.flutterViewConvertedToImageView = false;
            this.flutterView.revertImageView(new java.lang.Runnable() { // from class: io.flutter.plugin.platform.CustomPlatformViewsController$$b
                @Override // java.lang.Runnable
                public final void run() {
                    io.flutter.plugin.platform.CustomPlatformViewsController.this.lambda$onEndFrame$3();
                }
            });
        } else {
            if (this.flutterViewConvertedToImageView && this.flutterView.acquireLatestImageViewFrame()) {
                z17 = true;
            }
            finishFrame(z17);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void onPreEngineRestart() {
        diposeAllViews();
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void onResume() {
        java.util.Iterator<io.flutter.plugin.platform.VirtualDisplayController> it = this.vdControllers.values().iterator();
        while (it.hasNext()) {
            it.next().resetSurface();
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void onTrimMemory(int i17) {
        if (i17 < 40) {
            return;
        }
        java.util.Iterator<io.flutter.plugin.platform.VirtualDisplayController> it = this.vdControllers.values().iterator();
        while (it.hasNext()) {
            it.next().clearSurface();
        }
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public void setSoftwareRendering(boolean z17) {
        this.usesSoftwareRendering = z17;
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public android.view.MotionEvent toMotionEvent(float f17, io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewTouch platformViewTouch, boolean z17) {
        android.view.MotionEvent pop = this.motionEventTracker.pop(io.flutter.embedding.android.MotionEventTracker.MotionEventId.from(platformViewTouch.motionEventId));
        if (!z17 && pop != null) {
            return pop;
        }
        return android.view.MotionEvent.obtain(platformViewTouch.downTime.longValue(), platformViewTouch.eventTime.longValue(), platformViewTouch.action, platformViewTouch.pointerCount, (android.view.MotionEvent.PointerProperties[]) parsePointerPropertiesList(platformViewTouch.rawPointerPropertiesList).toArray(new android.view.MotionEvent.PointerProperties[platformViewTouch.pointerCount]), (android.view.MotionEvent.PointerCoords[]) parsePointerCoordsList(platformViewTouch.rawPointerCoords, f17).toArray(new android.view.MotionEvent.PointerCoords[platformViewTouch.pointerCount]), platformViewTouch.metaState, platformViewTouch.buttonState, platformViewTouch.xPrecision, platformViewTouch.yPrecision, platformViewTouch.deviceId, platformViewTouch.edgeFlags, platformViewTouch.source, platformViewTouch.flags);
    }

    public int toPhysicalPixels(double d17) {
        return (int) java.lang.Math.round(d17 * getDisplayDensity());
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController, io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public boolean usesVirtualDisplay(int i17) {
        return this.vdControllers.containsKey(java.lang.Integer.valueOf(i17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int toLogicalPixels(double d17) {
        return toLogicalPixels(d17, getDisplayDensity());
    }

    @Override // io.flutter.plugin.platform.PlatformViewsController
    public io.flutter.embedding.engine.FlutterOverlaySurface createOverlaySurface() {
        return createOverlaySurface(new io.flutter.plugin.platform.PlatformOverlayView(this.flutterView.getContext(), this.flutterView.getWidth(), this.flutterView.getHeight(), this.accessibilityEventsDelegate));
    }
}
