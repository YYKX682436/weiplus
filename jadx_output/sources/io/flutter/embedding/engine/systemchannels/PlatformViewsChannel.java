package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class PlatformViewsChannel {
    private static final java.lang.String TAG = "PlatformViewsChannel";
    private io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.CachedParsingHandler cachedParsingHandler;
    private final io.flutter.plugin.common.MethodChannel channel;
    private io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler handler;
    private final io.flutter.plugin.common.MethodChannel.MethodCallHandler parsingHandler;

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass1 implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {
        public AnonymousClass1() {
        }

        private void clearFocus(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
            try {
                io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.this.handler.clearFocus(((java.lang.Integer) methodCall.arguments()).intValue());
                result.success(null);
            } catch (java.lang.IllegalStateException e17) {
                result.error("error", io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.detailedExceptionString(e17), null);
            }
        }

        private void create(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
            java.util.Map map = (java.util.Map) methodCall.arguments();
            boolean z17 = true;
            boolean z18 = map.containsKey("hybrid") && ((java.lang.Boolean) map.get("hybrid")).booleanValue();
            java.nio.ByteBuffer wrap = map.containsKey("params") ? java.nio.ByteBuffer.wrap((byte[]) map.get("params")) : null;
            try {
                if (z18) {
                    io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.this.handler.createForPlatformViewLayer(new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest(((java.lang.Integer) map.get(dm.i4.COL_ID)).intValue(), (java.lang.String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((java.lang.Integer) map.get(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION)).intValue(), io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.HYBRID_ONLY, wrap));
                    result.success(null);
                    return;
                }
                if (!map.containsKey("hybridFallback") || !((java.lang.Boolean) map.get("hybridFallback")).booleanValue()) {
                    z17 = false;
                }
                long createForTextureLayer = io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.this.handler.createForTextureLayer(new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest(((java.lang.Integer) map.get(dm.i4.COL_ID)).intValue(), (java.lang.String) map.get("viewType"), map.containsKey("top") ? ((java.lang.Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((java.lang.Double) map.get("left")).doubleValue() : 0.0d, ((java.lang.Double) map.get("width")).doubleValue(), ((java.lang.Double) map.get("height")).doubleValue(), ((java.lang.Integer) map.get(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION)).intValue(), z17 ? io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK : io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, wrap));
                if (createForTextureLayer != -2) {
                    result.success(java.lang.Long.valueOf(createForTextureLayer));
                } else {
                    if (!z17) {
                        throw new java.lang.AssertionError("Platform view attempted to fall back to hybrid mode when not requested.");
                    }
                    result.success(null);
                }
            } catch (java.lang.IllegalStateException e17) {
                result.error("error", io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.detailedExceptionString(e17), null);
            }
        }

        private void dispose(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
            try {
                io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.this.handler.dispose(((java.lang.Integer) ((java.util.Map) methodCall.arguments()).get(dm.i4.COL_ID)).intValue());
                result.success(null);
            } catch (java.lang.IllegalStateException e17) {
                result.error("error", io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.detailedExceptionString(e17), null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$resize$0(io.flutter.plugin.common.MethodChannel.Result result, io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferSize platformViewBufferSize) {
            if (platformViewBufferSize == null) {
                result.error("error", "Failed to resize the platform view", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("width", java.lang.Double.valueOf(platformViewBufferSize.width));
            hashMap.put("height", java.lang.Double.valueOf(platformViewBufferSize.height));
            result.success(hashMap);
        }

        private void offset(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
            java.util.Map map = (java.util.Map) methodCall.arguments();
            try {
                io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.this.handler.offset(((java.lang.Integer) map.get(dm.i4.COL_ID)).intValue(), ((java.lang.Double) map.get("top")).doubleValue(), ((java.lang.Double) map.get("left")).doubleValue());
                result.success(null);
            } catch (java.lang.IllegalStateException e17) {
                result.error("error", io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.detailedExceptionString(e17), null);
            }
        }

        private void resize(io.flutter.plugin.common.MethodCall methodCall, final io.flutter.plugin.common.MethodChannel.Result result) {
            java.util.Map map = (java.util.Map) methodCall.arguments();
            try {
                io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.this.handler.resize(new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewResizeRequest(((java.lang.Integer) map.get(dm.i4.COL_ID)).intValue(), ((java.lang.Double) map.get("width")).doubleValue(), ((java.lang.Double) map.get("height")).doubleValue()), new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized() { // from class: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$1$$a
                    @Override // io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized
                    public final void run(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferSize platformViewBufferSize) {
                        io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.AnonymousClass1.lambda$resize$0(io.flutter.plugin.common.MethodChannel.Result.this, platformViewBufferSize);
                    }
                });
            } catch (java.lang.IllegalStateException e17) {
                result.error("error", io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.detailedExceptionString(e17), null);
            }
        }

        private void setDirection(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
            java.util.Map map = (java.util.Map) methodCall.arguments();
            try {
                io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.this.handler.setDirection(((java.lang.Integer) map.get(dm.i4.COL_ID)).intValue(), ((java.lang.Integer) map.get(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION)).intValue());
                result.success(null);
            } catch (java.lang.IllegalStateException e17) {
                result.error("error", io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.detailedExceptionString(e17), null);
            }
        }

        private void synchronizeToNativeViewHierarchy(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
            try {
                io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.this.handler.synchronizeToNativeViewHierarchy(((java.lang.Boolean) methodCall.arguments()).booleanValue());
                result.success(null);
            } catch (java.lang.IllegalStateException e17) {
                result.error("error", io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.detailedExceptionString(e17), null);
            }
        }

        private void touch(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
            io.flutter.plugin.common.MethodChannel.Result result2;
            java.util.List list = (java.util.List) methodCall.arguments();
            try {
                io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.this.handler.onTouch(new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewTouch(((java.lang.Integer) list.get(0)).intValue(), (java.lang.Number) list.get(1), (java.lang.Number) list.get(2), ((java.lang.Integer) list.get(3)).intValue(), ((java.lang.Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((java.lang.Integer) list.get(7)).intValue(), ((java.lang.Integer) list.get(8)).intValue(), (float) ((java.lang.Double) list.get(9)).doubleValue(), (float) ((java.lang.Double) list.get(10)).doubleValue(), ((java.lang.Integer) list.get(11)).intValue(), ((java.lang.Integer) list.get(12)).intValue(), ((java.lang.Integer) list.get(13)).intValue(), ((java.lang.Integer) list.get(14)).intValue(), ((java.lang.Number) list.get(15)).longValue()));
                result2 = result;
            } catch (java.lang.IllegalStateException e17) {
                e = e17;
                result2 = result;
            }
            try {
                result2.success(null);
            } catch (java.lang.IllegalStateException e18) {
                e = e18;
                result2.error("error", io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.detailedExceptionString(e), null);
            }
        }

        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
            if (io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.this.handler == null) {
                return;
            }
            io.flutter.Log.v(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.TAG, "Received '" + methodCall.method + "' message.");
            java.lang.String str = methodCall.method;
            str.getClass();
            char c17 = 65535;
            switch (str.hashCode()) {
                case -1352294148:
                    if (str.equals("create")) {
                        c17 = 0;
                        break;
                    }
                    break;
                case -1019779949:
                    if (str.equals("offset")) {
                        c17 = 1;
                        break;
                    }
                    break;
                case -934437708:
                    if (str.equals("resize")) {
                        c17 = 2;
                        break;
                    }
                    break;
                case -756050293:
                    if (str.equals("clearFocus")) {
                        c17 = 3;
                        break;
                    }
                    break;
                case -308988850:
                    if (str.equals("synchronizeToNativeViewHierarchy")) {
                        c17 = 4;
                        break;
                    }
                    break;
                case 110550847:
                    if (str.equals("touch")) {
                        c17 = 5;
                        break;
                    }
                    break;
                case 576796989:
                    if (str.equals("setDirection")) {
                        c17 = 6;
                        break;
                    }
                    break;
                case 1671767583:
                    if (str.equals("dispose")) {
                        c17 = 7;
                        break;
                    }
                    break;
            }
            switch (c17) {
                case 0:
                    create(methodCall, result);
                    return;
                case 1:
                    offset(methodCall, result);
                    return;
                case 2:
                    resize(methodCall, result);
                    return;
                case 3:
                    clearFocus(methodCall, result);
                    return;
                case 4:
                    synchronizeToNativeViewHierarchy(methodCall, result);
                    return;
                case 5:
                    touch(methodCall, result);
                    return;
                case 6:
                    setDirection(methodCall, result);
                    return;
                case 7:
                    dispose(methodCall, result);
                    return;
                default:
                    result.notImplemented();
                    return;
            }
        }
    }

    /* loaded from: classes15.dex */
    public interface PlatformViewBufferResized {
        void run(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferSize platformViewBufferSize);
    }

    /* loaded from: classes15.dex */
    public static class PlatformViewBufferSize {
        public final int height;
        public final int width;

        public PlatformViewBufferSize(int i17, int i18) {
            this.width = i17;
            this.height = i18;
        }
    }

    /* loaded from: classes15.dex */
    public static class PlatformViewCreationRequest {
        public final int direction;
        public final io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode displayMode;
        public final double logicalHeight;
        public final double logicalLeft;
        public final double logicalTop;
        public final double logicalWidth;
        public final java.nio.ByteBuffer params;
        public final int viewId;
        public final java.lang.String viewType;

        /* loaded from: classes15.dex */
        public enum RequestedDisplayMode {
            TEXTURE_WITH_VIRTUAL_FALLBACK,
            TEXTURE_WITH_HYBRID_FALLBACK,
            HYBRID_ONLY
        }

        public PlatformViewCreationRequest(int i17, java.lang.String str, double d17, double d18, double d19, double d27, int i18, java.nio.ByteBuffer byteBuffer) {
            this(i17, str, d17, d18, d19, d27, i18, io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_VIRTUAL_FALLBACK, byteBuffer);
        }

        public PlatformViewCreationRequest(int i17, java.lang.String str, double d17, double d18, double d19, double d27, int i18, io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode requestedDisplayMode, java.nio.ByteBuffer byteBuffer) {
            this.viewId = i17;
            this.viewType = str;
            this.logicalTop = d17;
            this.logicalLeft = d18;
            this.logicalWidth = d19;
            this.logicalHeight = d27;
            this.direction = i18;
            this.displayMode = requestedDisplayMode;
            this.params = byteBuffer;
        }
    }

    /* loaded from: classes15.dex */
    public static class PlatformViewResizeRequest {
        public final double newLogicalHeight;
        public final double newLogicalWidth;
        public final int viewId;

        public PlatformViewResizeRequest(int i17, double d17, double d18) {
            this.viewId = i17;
            this.newLogicalWidth = d17;
            this.newLogicalHeight = d18;
        }
    }

    /* loaded from: classes15.dex */
    public static class PlatformViewTouch {
        public final int action;
        public final int buttonState;
        public final int deviceId;
        public final java.lang.Number downTime;
        public final int edgeFlags;
        public final java.lang.Number eventTime;
        public final int flags;
        public final int metaState;
        public final long motionEventId;
        public final int pointerCount;
        public final java.lang.Object rawPointerCoords;
        public final java.lang.Object rawPointerPropertiesList;
        public final int source;
        public final int viewId;
        public final float xPrecision;
        public final float yPrecision;

        public PlatformViewTouch(int i17, java.lang.Number number, java.lang.Number number2, int i18, int i19, java.lang.Object obj, java.lang.Object obj2, int i27, int i28, float f17, float f18, int i29, int i37, int i38, int i39, long j17) {
            this.viewId = i17;
            this.downTime = number;
            this.eventTime = number2;
            this.action = i18;
            this.pointerCount = i19;
            this.rawPointerPropertiesList = obj;
            this.rawPointerCoords = obj2;
            this.metaState = i27;
            this.buttonState = i28;
            this.xPrecision = f17;
            this.yPrecision = f18;
            this.deviceId = i29;
            this.edgeFlags = i37;
            this.source = i38;
            this.flags = i39;
            this.motionEventId = j17;
        }
    }

    /* loaded from: classes15.dex */
    public interface PlatformViewsHandler {
        public static final long NON_TEXTURE_FALLBACK = -2;

        void clearFocus(int i17);

        void createForPlatformViewLayer(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest);

        long createForTextureLayer(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest);

        void dispose(int i17);

        void offset(int i17, double d17, double d18);

        void onTouch(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewTouch platformViewTouch);

        void resize(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewResizeRequest platformViewResizeRequest, io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized platformViewBufferResized);

        void setDirection(int i17, int i18);

        void synchronizeToNativeViewHierarchy(boolean z17);
    }

    public PlatformViewsChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.AnonymousClass1 anonymousClass1 = new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.AnonymousClass1();
        this.parsingHandler = anonymousClass1;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/platform_views", io.flutter.plugin.common.StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(anonymousClass1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String detailedExceptionString(java.lang.Exception exc) {
        return io.flutter.Log.getStackTraceString(exc);
    }

    public void clearCachedCalls() {
        io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.CachedParsingHandler cachedParsingHandler = this.cachedParsingHandler;
        if (cachedParsingHandler == null) {
            return;
        }
        cachedParsingHandler.clear();
        this.cachedParsingHandler = null;
    }

    public void enableCaching() {
        io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.CachedParsingHandler cachedParsingHandler = new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.CachedParsingHandler(null);
        this.cachedParsingHandler = cachedParsingHandler;
        this.channel.setMethodCallHandler(cachedParsingHandler);
    }

    public void flushCachedCalls() {
        if (this.cachedParsingHandler == null) {
            return;
        }
        this.channel.setMethodCallHandler(this.parsingHandler);
        io.flutter.Log.i(TAG, "flushCachedCalls: pendingCalls count = " + this.cachedParsingHandler.getPendingCalls().size());
        for (io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.CachedParsingHandler.PendingCall pendingCall : this.cachedParsingHandler.getPendingCalls()) {
            this.parsingHandler.onMethodCall(pendingCall.call, pendingCall.result);
        }
        this.cachedParsingHandler = null;
    }

    public void invokeViewFocused(int i17) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            return;
        }
        methodChannel.invokeMethod("viewFocused", java.lang.Integer.valueOf(i17));
    }

    public void setPlatformViewsHandler(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler platformViewsHandler) {
        this.handler = platformViewsHandler;
    }

    /* loaded from: classes15.dex */
    public static class CachedParsingHandler implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {
        private static final java.lang.String TAG = "CachedParsingHandler";
        private final java.util.List<io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.CachedParsingHandler.PendingCall> pendingCalls;

        /* loaded from: classes15.dex */
        public static class PendingCall {
            final io.flutter.plugin.common.MethodCall call;
            final io.flutter.plugin.common.MethodChannel.Result result;

            public PendingCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                this.call = methodCall;
                this.result = result;
            }
        }

        private CachedParsingHandler() {
            this.pendingCalls = new java.util.ArrayList();
        }

        public void clear() {
            java.util.Iterator<io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.CachedParsingHandler.PendingCall> it = this.pendingCalls.iterator();
            while (it.hasNext()) {
                it.next().result.error("error", "Platform views handler is not available", null);
            }
            this.pendingCalls.clear();
        }

        public java.util.List<io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.CachedParsingHandler.PendingCall> getPendingCalls() {
            return this.pendingCalls;
        }

        @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
        public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
            io.flutter.Log.i(TAG, "Caching platform view method call: " + methodCall.method);
            this.pendingCalls.add(new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.CachedParsingHandler.PendingCall(methodCall, result));
        }

        public /* synthetic */ CachedParsingHandler(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.AnonymousClass1 anonymousClass1) {
            this();
        }
    }
}
