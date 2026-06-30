package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes14.dex */
public class MouseCursorChannel {
    private static final java.lang.String TAG = "MouseCursorChannel";
    public final io.flutter.plugin.common.MethodChannel channel;
    private io.flutter.embedding.engine.systemchannels.MouseCursorChannel.MouseCursorMethodHandler mouseCursorMethodHandler;
    private final io.flutter.plugin.common.MethodChannel.MethodCallHandler parsingMethodCallHandler;

    /* loaded from: classes14.dex */
    public interface MouseCursorMethodHandler {
        void activateSystemCursor(java.lang.String str);
    }

    public MouseCursorChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.MouseCursorChannel.1
            /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[Catch: Exception -> 0x0070, TRY_LEAVE, TryCatch #0 {Exception -> 0x0070, blocks: (B:7:0x0028, B:14:0x0040, B:17:0x0055, B:21:0x005c, B:23:0x0032, B:16:0x004c), top: B:6:0x0028, inners: #1 }] */
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onMethodCall(io.flutter.plugin.common.MethodCall r7, io.flutter.plugin.common.MethodChannel.Result r8) {
                /*
                    r6 = this;
                    java.lang.String r0 = "error"
                    java.lang.String r1 = "Error when setting cursors: "
                    io.flutter.embedding.engine.systemchannels.MouseCursorChannel r2 = io.flutter.embedding.engine.systemchannels.MouseCursorChannel.this
                    io.flutter.embedding.engine.systemchannels.MouseCursorChannel$MouseCursorMethodHandler r2 = io.flutter.embedding.engine.systemchannels.MouseCursorChannel.access$000(r2)
                    if (r2 != 0) goto Ld
                    return
                Ld:
                    java.lang.String r2 = r7.method
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r4 = "Received '"
                    r3.<init>(r4)
                    r3.append(r2)
                    java.lang.String r4 = "' message."
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    java.lang.String r4 = "MouseCursorChannel"
                    io.flutter.Log.v(r4, r3)
                    r3 = 0
                    int r4 = r2.hashCode()     // Catch: java.lang.Exception -> L70
                    r5 = -1307105544(0xffffffffb21726f8, float:-8.798217E-9)
                    if (r4 == r5) goto L32
                    goto L3c
                L32:
                    java.lang.String r4 = "activateSystemCursor"
                    boolean r2 = r2.equals(r4)     // Catch: java.lang.Exception -> L70
                    if (r2 == 0) goto L3c
                    r2 = 0
                    goto L3d
                L3c:
                    r2 = -1
                L3d:
                    if (r2 == 0) goto L40
                    goto L86
                L40:
                    java.lang.Object r7 = r7.arguments     // Catch: java.lang.Exception -> L70
                    java.util.HashMap r7 = (java.util.HashMap) r7     // Catch: java.lang.Exception -> L70
                    java.lang.String r2 = "kind"
                    java.lang.Object r7 = r7.get(r2)     // Catch: java.lang.Exception -> L70
                    java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L70
                    io.flutter.embedding.engine.systemchannels.MouseCursorChannel r2 = io.flutter.embedding.engine.systemchannels.MouseCursorChannel.this     // Catch: java.lang.Exception -> L5b
                    io.flutter.embedding.engine.systemchannels.MouseCursorChannel$MouseCursorMethodHandler r2 = io.flutter.embedding.engine.systemchannels.MouseCursorChannel.access$000(r2)     // Catch: java.lang.Exception -> L5b
                    r2.activateSystemCursor(r7)     // Catch: java.lang.Exception -> L5b
                    java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L70
                    r8.success(r7)     // Catch: java.lang.Exception -> L70
                    goto L86
                L5b:
                    r7 = move-exception
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L70
                    r2.<init>(r1)     // Catch: java.lang.Exception -> L70
                    java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Exception -> L70
                    r2.append(r7)     // Catch: java.lang.Exception -> L70
                    java.lang.String r7 = r2.toString()     // Catch: java.lang.Exception -> L70
                    r8.error(r0, r7, r3)     // Catch: java.lang.Exception -> L70
                    goto L86
                L70:
                    r7 = move-exception
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    java.lang.String r2 = "Unhandled error: "
                    r1.<init>(r2)
                    java.lang.String r7 = r7.getMessage()
                    r1.append(r7)
                    java.lang.String r7 = r1.toString()
                    r8.error(r0, r7, r3)
                L86:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.MouseCursorChannel.AnonymousClass1.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
            }
        };
        this.parsingMethodCallHandler = methodCallHandler;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/mousecursor", io.flutter.plugin.common.StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void setMethodHandler(io.flutter.embedding.engine.systemchannels.MouseCursorChannel.MouseCursorMethodHandler mouseCursorMethodHandler) {
        this.mouseCursorMethodHandler = mouseCursorMethodHandler;
    }

    public void synthesizeMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        this.parsingMethodCallHandler.onMethodCall(methodCall, result);
    }
}
