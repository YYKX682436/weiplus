package io.flutter.plugin.platform;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\"\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lio/flutter/plugin/platform/SkylinePlatformViewsController;", "Lio/flutter/plugin/platform/CustomPlatformViewsController;", "Landroid/content/Context;", "context", "Lio/flutter/view/TextureRegistry;", "textureRegistry", "Lio/flutter/embedding/engine/dart/DartExecutor;", "dartExecutor", "Ljz5/f0;", "attach", "onDetachedFromJNI", "", "viewId", "Landroid/view/View;", "getPlatformViewById", "engineId", "I", "getEngineId", "()I", "Landroid/util/SparseArray;", "Lio/flutter/view/TextureRegistry$SurfaceTextureEntry;", "textureEntryList", "Landroid/util/SparseArray;", "Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewsHandler;", "skylineChannelHandler", "Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewsHandler;", "<init>", "(I)V", "Companion", "SkylineEmptyView", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public class SkylinePlatformViewsController extends io.flutter.plugin.platform.CustomPlatformViewsController {
    private static final java.lang.String TAG = "SkylinePlatformViewsController";
    private final int engineId;
    private android.util.SparseArray<io.flutter.view.TextureRegistry.SurfaceTextureEntry> textureEntryList = new android.util.SparseArray<>();
    private final io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler skylineChannelHandler = new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler() { // from class: io.flutter.plugin.platform.SkylinePlatformViewsController$skylineChannelHandler$1
        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void clearFocus(int i17) {
            if (io.flutter.plugin.platform.SkylineTextureLogic.isSkylineTexture(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), i17)) {
                return;
            }
            ((io.flutter.plugin.platform.CustomPlatformViewsController) io.flutter.plugin.platform.SkylinePlatformViewsController.this).channelHandler.clearFocus(i17);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void createForPlatformViewLayer(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest request) {
            kotlin.jvm.internal.o.g(request, "request");
            ((io.flutter.plugin.platform.CustomPlatformViewsController) io.flutter.plugin.platform.SkylinePlatformViewsController.this).channelHandler.createForPlatformViewLayer(request);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public long createForTextureLayer(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest request) {
            android.util.SparseArray sparseArray;
            kotlin.jvm.internal.o.g(request, "request");
            java.lang.String viewType = request.viewType;
            kotlin.jvm.internal.o.f(viewType, "viewType");
            if (!io.flutter.plugin.platform.SkylineTextureLogic.isSkylineTextureType(viewType)) {
                return ((io.flutter.plugin.platform.CustomPlatformViewsController) io.flutter.plugin.platform.SkylinePlatformViewsController.this).channelHandler.createForTextureLayer(request);
            }
            int i17 = request.viewId;
            java.nio.ByteBuffer byteBuffer = request.params;
            io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = null;
            java.util.Map map = (java.util.Map) (byteBuffer != null ? io.flutter.plugin.common.StandardMessageCodec.INSTANCE.decodeMessage(byteBuffer) : null);
            java.lang.String str = (java.lang.String) (map != null ? map.get("type") : null);
            if (str == null) {
                str = "empty";
            }
            java.lang.String str2 = str;
            int physicalPixels = io.flutter.plugin.platform.SkylinePlatformViewsController.this.toPhysicalPixels(request.logicalWidth);
            int physicalPixels2 = io.flutter.plugin.platform.SkylinePlatformViewsController.this.toPhysicalPixels(request.logicalHeight);
            android.graphics.SurfaceTexture onCreateTexture = io.flutter.plugin.platform.SkylineTextureLogic.onCreateTexture(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), str2, i17);
            if (onCreateTexture != null) {
                io.flutter.view.TextureRegistry textureRegistry = ((io.flutter.plugin.platform.CustomPlatformViewsController) io.flutter.plugin.platform.SkylinePlatformViewsController.this).textureRegistry;
                if (textureRegistry != null) {
                    surfaceTextureEntry = textureRegistry.registerSurfaceTexture(onCreateTexture);
                }
            } else {
                io.flutter.view.TextureRegistry textureRegistry2 = ((io.flutter.plugin.platform.CustomPlatformViewsController) io.flutter.plugin.platform.SkylinePlatformViewsController.this).textureRegistry;
                if (textureRegistry2 != null) {
                    surfaceTextureEntry = textureRegistry2.createSurfaceTexture();
                }
            }
            if (surfaceTextureEntry == null) {
                return -1L;
            }
            sparseArray = io.flutter.plugin.platform.SkylinePlatformViewsController.this.textureEntryList;
            sparseArray.put(i17, surfaceTextureEntry);
            io.flutter.plugin.platform.SkylineTextureLogic.addSkylineTexture(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), i17, str2);
            io.flutter.plugin.platform.SkylineTextureLogic.onTextureReady(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), str2, i17, surfaceTextureEntry.surfaceTexture(), physicalPixels, physicalPixels2);
            return surfaceTextureEntry.id();
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void dispose(int i17) {
            android.util.SparseArray sparseArray;
            android.util.SparseArray sparseArray2;
            if (!io.flutter.plugin.platform.SkylineTextureLogic.isSkylineTexture(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), i17)) {
                ((io.flutter.plugin.platform.CustomPlatformViewsController) io.flutter.plugin.platform.SkylinePlatformViewsController.this).channelHandler.dispose(i17);
                return;
            }
            java.lang.String skylineTextureType = io.flutter.plugin.platform.SkylineTextureLogic.getSkylineTextureType(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), i17);
            io.flutter.plugin.platform.SkylineTextureLogic.removeSkylineTexture(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), i17);
            io.flutter.plugin.platform.SkylineTextureLogic.onTextureDestroy(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), skylineTextureType, i17);
            if (io.flutter.plugin.platform.SkylineTextureLogic.onDestroyTexture(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), skylineTextureType, i17)) {
                return;
            }
            sparseArray = io.flutter.plugin.platform.SkylinePlatformViewsController.this.textureEntryList;
            io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = (io.flutter.view.TextureRegistry.SurfaceTextureEntry) sparseArray.get(i17);
            if (surfaceTextureEntry != null) {
                surfaceTextureEntry.release();
            }
            sparseArray2 = io.flutter.plugin.platform.SkylinePlatformViewsController.this.textureEntryList;
            sparseArray2.remove(i17);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void offset(int i17, double d17, double d18) {
            if (io.flutter.plugin.platform.SkylineTextureLogic.isSkylineTexture(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), i17)) {
                return;
            }
            ((io.flutter.plugin.platform.CustomPlatformViewsController) io.flutter.plugin.platform.SkylinePlatformViewsController.this).channelHandler.offset(i17, d17, d18);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void onTouch(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewTouch touch) {
            kotlin.jvm.internal.o.g(touch, "touch");
            int i17 = touch.viewId;
            if (!io.flutter.plugin.platform.SkylineTextureLogic.isSkylineTexture(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), i17)) {
                ((io.flutter.plugin.platform.CustomPlatformViewsController) io.flutter.plugin.platform.SkylinePlatformViewsController.this).channelHandler.onTouch(touch);
                return;
            }
            android.view.MotionEvent motionEvent = io.flutter.plugin.platform.SkylinePlatformViewsController.this.toMotionEvent(((io.flutter.plugin.platform.CustomPlatformViewsController) io.flutter.plugin.platform.SkylinePlatformViewsController.this).context.getResources().getDisplayMetrics().density, touch, false);
            io.flutter.plugin.platform.SkylineTextureLogic.onTextureTouch(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), io.flutter.plugin.platform.SkylineTextureLogic.getSkylineTextureType(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), i17), i17, motionEvent);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void resize(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewResizeRequest request, io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized onComplete) {
            android.util.SparseArray sparseArray;
            android.graphics.SurfaceTexture surfaceTexture;
            kotlin.jvm.internal.o.g(request, "request");
            kotlin.jvm.internal.o.g(onComplete, "onComplete");
            int i17 = request.viewId;
            if (!io.flutter.plugin.platform.SkylineTextureLogic.isSkylineTexture(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), i17)) {
                ((io.flutter.plugin.platform.CustomPlatformViewsController) io.flutter.plugin.platform.SkylinePlatformViewsController.this).channelHandler.resize(request, onComplete);
                return;
            }
            java.lang.String skylineTextureType = io.flutter.plugin.platform.SkylineTextureLogic.getSkylineTextureType(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), i17);
            int physicalPixels = io.flutter.plugin.platform.SkylinePlatformViewsController.this.toPhysicalPixels(request.newLogicalWidth);
            int physicalPixels2 = io.flutter.plugin.platform.SkylinePlatformViewsController.this.toPhysicalPixels(request.newLogicalHeight);
            sparseArray = io.flutter.plugin.platform.SkylinePlatformViewsController.this.textureEntryList;
            io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = (io.flutter.view.TextureRegistry.SurfaceTextureEntry) sparseArray.get(i17);
            if (surfaceTextureEntry != null && (surfaceTexture = surfaceTextureEntry.surfaceTexture()) != null) {
                surfaceTexture.setDefaultBufferSize(physicalPixels, physicalPixels2);
            }
            io.flutter.plugin.platform.SkylineTextureLogic.onTextureUpdate(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), skylineTextureType, i17, physicalPixels, physicalPixels2);
            onComplete.run(new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferSize((int) request.newLogicalWidth, (int) request.newLogicalHeight));
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void setDirection(int i17, int i18) {
            if (io.flutter.plugin.platform.SkylineTextureLogic.isSkylineTexture(io.flutter.plugin.platform.SkylinePlatformViewsController.this.getEngineId(), i17)) {
                return;
            }
            ((io.flutter.plugin.platform.CustomPlatformViewsController) io.flutter.plugin.platform.SkylinePlatformViewsController.this).channelHandler.setDirection(i17, i18);
        }

        @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler
        public void synchronizeToNativeViewHierarchy(boolean z17) {
            ((io.flutter.plugin.platform.CustomPlatformViewsController) io.flutter.plugin.platform.SkylinePlatformViewsController.this).channelHandler.synchronizeToNativeViewHierarchy(z17);
        }
    };

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lio/flutter/plugin/platform/SkylinePlatformViewsController$SkylineEmptyView;", "Landroid/view/View;", "", "mode", "Ljz5/f0;", "setImportantForAccessibility", "viewId", "I", "getViewId", "()I", "Landroid/content/Context;", "context", "<init>", "(Lio/flutter/plugin/platform/SkylinePlatformViewsController;ILandroid/content/Context;)V", "skyline_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes15.dex */
    public final class SkylineEmptyView extends android.view.View {
        private final int viewId;

        public SkylineEmptyView(int i17, android.content.Context context) {
            super(context);
            this.viewId = i17;
        }

        public final int getViewId() {
            return this.viewId;
        }

        @Override // android.view.View
        public void setImportantForAccessibility(int i17) {
        }
    }

    public SkylinePlatformViewsController(int i17) {
        this.engineId = i17;
    }

    @Override // io.flutter.plugin.platform.CustomPlatformViewsController, io.flutter.plugin.platform.PlatformViewsController
    public void attach(android.content.Context context, io.flutter.view.TextureRegistry textureRegistry, io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        kotlin.jvm.internal.o.g(textureRegistry, "textureRegistry");
        kotlin.jvm.internal.o.g(dartExecutor, "dartExecutor");
        super.attach(context, textureRegistry, dartExecutor);
        ((io.flutter.plugin.platform.CustomPlatformViewsController) this).platformViewsChannel.setPlatformViewsHandler(this.skylineChannelHandler);
    }

    public final int getEngineId() {
        return this.engineId;
    }

    @Override // io.flutter.plugin.platform.CustomPlatformViewsController, io.flutter.plugin.platform.PlatformViewsController, io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
    public android.view.View getPlatformViewById(int viewId) {
        return !io.flutter.plugin.platform.SkylineTextureLogic.isSkylineTexture(this.engineId, viewId) ? super.getPlatformViewById(viewId) : new io.flutter.plugin.platform.SkylinePlatformViewsController.SkylineEmptyView(viewId, ((io.flutter.plugin.platform.CustomPlatformViewsController) this).context);
    }

    @Override // io.flutter.plugin.platform.CustomPlatformViewsController, io.flutter.plugin.platform.PlatformViewsController
    public void onDetachedFromJNI() {
        io.flutter.plugin.platform.SkylineTextureLogic.destroy(this.engineId);
        int size = this.textureEntryList.size();
        for (int i17 = 0; i17 < size; i17++) {
            io.flutter.view.TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = this.textureEntryList.get(this.textureEntryList.keyAt(i17));
            if (surfaceTextureEntry != null) {
                surfaceTextureEntry.release();
            }
        }
        this.textureEntryList.clear();
        super.onDetachedFromJNI();
    }
}
