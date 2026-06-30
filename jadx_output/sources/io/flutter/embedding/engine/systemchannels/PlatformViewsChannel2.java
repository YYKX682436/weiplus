package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class PlatformViewsChannel2 {
    private static final java.lang.String TAG = "PlatformViewsChannel2";
    private final io.flutter.plugin.common.MethodChannel channel;
    private io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler handler;
    private final io.flutter.plugin.common.MethodChannel.MethodCallHandler parsingHandler;

    /* loaded from: classes15.dex */
    public static class PlatformViewCreationRequest {
        public final int direction;
        public final double logicalHeight;
        public final double logicalWidth;
        public final java.nio.ByteBuffer params;
        public final int viewId;
        public final java.lang.String viewType;

        public PlatformViewCreationRequest(int i17, java.lang.String str, double d17, double d18, int i18, java.nio.ByteBuffer byteBuffer) {
            this.viewId = i17;
            this.viewType = str;
            this.logicalWidth = d17;
            this.logicalHeight = d18;
            this.direction = i18;
            this.params = byteBuffer;
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
        void clearFocus(int i17);

        void createPlatformView(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewCreationRequest platformViewCreationRequest);

        void dispose(int i17);

        boolean isSurfaceControlEnabled();

        void onTouch(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewTouch platformViewTouch);

        void setDirection(int i17, int i18);
    }

    public PlatformViewsChannel2(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.1
            private void clearFocus(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                try {
                    io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.this.handler.clearFocus(((java.lang.Integer) methodCall.arguments()).intValue());
                    result.success(null);
                } catch (java.lang.IllegalStateException e17) {
                    result.error("error", io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.detailedExceptionString(e17), null);
                }
            }

            private void create(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                java.util.Map map = (java.util.Map) methodCall.arguments();
                try {
                    io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.this.handler.createPlatformView(new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewCreationRequest(((java.lang.Integer) map.get(dm.i4.COL_ID)).intValue(), (java.lang.String) map.get("viewType"), 0.0d, 0.0d, ((java.lang.Integer) map.get(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION)).intValue(), map.containsKey("params") ? java.nio.ByteBuffer.wrap((byte[]) map.get("params")) : null));
                    result.success(null);
                } catch (java.lang.IllegalStateException e17) {
                    result.error("error", io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.detailedExceptionString(e17), null);
                }
            }

            private void dispose(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                try {
                    io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.this.handler.dispose(((java.lang.Integer) ((java.util.Map) methodCall.arguments()).get(dm.i4.COL_ID)).intValue());
                    result.success(null);
                } catch (java.lang.IllegalStateException e17) {
                    result.error("error", io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.detailedExceptionString(e17), null);
                }
            }

            private void isSurfaceControlEnabled(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                result.success(java.lang.Boolean.valueOf(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.this.handler.isSurfaceControlEnabled()));
            }

            private void setDirection(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                java.util.Map map = (java.util.Map) methodCall.arguments();
                try {
                    io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.this.handler.setDirection(((java.lang.Integer) map.get(dm.i4.COL_ID)).intValue(), ((java.lang.Integer) map.get(com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION)).intValue());
                    result.success(null);
                } catch (java.lang.IllegalStateException e17) {
                    result.error("error", io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.detailedExceptionString(e17), null);
                }
            }

            private void touch(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                io.flutter.plugin.common.MethodChannel.Result result2;
                java.util.List list = (java.util.List) methodCall.arguments();
                try {
                    io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.this.handler.onTouch(new io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewTouch(((java.lang.Integer) list.get(0)).intValue(), (java.lang.Number) list.get(1), (java.lang.Number) list.get(2), ((java.lang.Integer) list.get(3)).intValue(), ((java.lang.Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((java.lang.Integer) list.get(7)).intValue(), ((java.lang.Integer) list.get(8)).intValue(), (float) ((java.lang.Double) list.get(9)).doubleValue(), (float) ((java.lang.Double) list.get(10)).doubleValue(), ((java.lang.Integer) list.get(11)).intValue(), ((java.lang.Integer) list.get(12)).intValue(), ((java.lang.Integer) list.get(13)).intValue(), ((java.lang.Integer) list.get(14)).intValue(), ((java.lang.Number) list.get(15)).longValue()));
                    result2 = result;
                } catch (java.lang.IllegalStateException e17) {
                    e = e17;
                    result2 = result;
                }
                try {
                    result2.success(null);
                } catch (java.lang.IllegalStateException e18) {
                    e = e18;
                    result2.error("error", io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.detailedExceptionString(e), null);
                }
            }

            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                if (io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.this.handler == null) {
                    return;
                }
                io.flutter.Log.v(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.TAG, "Received '" + methodCall.method + "' message.");
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
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c17 = 2;
                            break;
                        }
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c17 = 3;
                            break;
                        }
                        break;
                    case 751366695:
                        if (str.equals("isSurfaceControlEnabled")) {
                            c17 = 4;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c17 = 5;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        create(methodCall, result);
                        return;
                    case 1:
                        clearFocus(methodCall, result);
                        return;
                    case 2:
                        touch(methodCall, result);
                        return;
                    case 3:
                        setDirection(methodCall, result);
                        return;
                    case 4:
                        isSurfaceControlEnabled(methodCall, result);
                        return;
                    case 5:
                        dispose(methodCall, result);
                        return;
                    default:
                        result.notImplemented();
                        return;
                }
            }
        };
        this.parsingHandler = methodCallHandler;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/platform_views_2", io.flutter.plugin.common.StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String detailedExceptionString(java.lang.Exception exc) {
        return io.flutter.Log.getStackTraceString(exc);
    }

    public void invokeViewFocused(int i17) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            return;
        }
        methodChannel.invokeMethod("viewFocused", java.lang.Integer.valueOf(i17));
    }

    public void setPlatformViewsHandler(io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.PlatformViewsHandler platformViewsHandler) {
        this.handler = platformViewsHandler;
    }
}
