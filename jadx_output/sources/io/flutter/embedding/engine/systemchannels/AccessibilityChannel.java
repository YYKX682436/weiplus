package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class AccessibilityChannel {
    private static final java.lang.String TAG = "AccessibilityChannel";
    public final io.flutter.plugin.common.BasicMessageChannel<java.lang.Object> channel;
    public final io.flutter.embedding.engine.FlutterJNI flutterJNI;
    private io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler handler;
    public final io.flutter.plugin.common.BasicMessageChannel.MessageHandler<java.lang.Object> parsingMessageHandler;

    /* loaded from: classes15.dex */
    public interface AccessibilityMessageHandler extends io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate {
        @java.lang.Deprecated(since = "Android API level 36")
        void announce(java.lang.String str);

        void onFocus(int i17);

        void onLongPress(int i17);

        void onTap(int i17);

        void onTooltip(java.lang.String str);
    }

    public AccessibilityChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        io.flutter.plugin.common.BasicMessageChannel.MessageHandler<java.lang.Object> messageHandler = new io.flutter.plugin.common.BasicMessageChannel.MessageHandler<java.lang.Object>() { // from class: io.flutter.embedding.engine.systemchannels.AccessibilityChannel.1
            @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
            public void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                if (io.flutter.embedding.engine.systemchannels.AccessibilityChannel.this.handler == null) {
                    reply.reply(null);
                    return;
                }
                java.util.HashMap hashMap = (java.util.HashMap) obj;
                java.lang.String str = (java.lang.String) hashMap.get("type");
                java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                io.flutter.Log.v(io.flutter.embedding.engine.systemchannels.AccessibilityChannel.TAG, "Received " + str + " message.");
                str.getClass();
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -1140076541:
                        if (str.equals("tooltip")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case -649620375:
                        if (str.equals("announce")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 114595:
                        if (str.equals("tap")) {
                            c17 = 2;
                            break;
                        }
                        break;
                    case 97604824:
                        if (str.equals("focus")) {
                            c17 = 3;
                            break;
                        }
                        break;
                    case 114203431:
                        if (str.equals("longPress")) {
                            c17 = 4;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        java.lang.String str2 = (java.lang.String) hashMap2.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
                        if (str2 != null) {
                            io.flutter.embedding.engine.systemchannels.AccessibilityChannel.this.handler.onTooltip(str2);
                            break;
                        }
                        break;
                    case 1:
                        java.lang.String str3 = (java.lang.String) hashMap2.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
                        if (str3 != null) {
                            io.flutter.embedding.engine.systemchannels.AccessibilityChannel.this.handler.announce(str3);
                            break;
                        }
                        break;
                    case 2:
                        java.lang.Integer num = (java.lang.Integer) hashMap.get("nodeId");
                        if (num != null) {
                            io.flutter.embedding.engine.systemchannels.AccessibilityChannel.this.handler.onTap(num.intValue());
                            break;
                        }
                        break;
                    case 3:
                        java.lang.Integer num2 = (java.lang.Integer) hashMap.get("nodeId");
                        if (num2 != null) {
                            io.flutter.embedding.engine.systemchannels.AccessibilityChannel.this.handler.onFocus(num2.intValue());
                            break;
                        }
                        break;
                    case 4:
                        java.lang.Integer num3 = (java.lang.Integer) hashMap.get("nodeId");
                        if (num3 != null) {
                            io.flutter.embedding.engine.systemchannels.AccessibilityChannel.this.handler.onLongPress(num3.intValue());
                            break;
                        }
                        break;
                }
                reply.reply(null);
            }
        };
        this.parsingMessageHandler = messageHandler;
        io.flutter.plugin.common.BasicMessageChannel<java.lang.Object> basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel<>(dartExecutor, "flutter/accessibility", io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
        this.channel = basicMessageChannel;
        basicMessageChannel.setMessageHandler(messageHandler);
        this.flutterJNI = flutterJNI;
    }

    public void dispatchSemanticsAction(int i17, io.flutter.view.AccessibilityBridge.Action action) {
        this.flutterJNI.dispatchSemanticsAction(i17, action);
    }

    public void onAndroidAccessibilityDisabled() {
        this.flutterJNI.setSemanticsEnabled(false);
    }

    public void onAndroidAccessibilityEnabled() {
        this.flutterJNI.setSemanticsEnabled(true);
    }

    public void setAccessibilityFeatures(int i17) {
        this.flutterJNI.setAccessibilityFeatures(i17);
    }

    public void setAccessibilityMessageHandler(io.flutter.embedding.engine.systemchannels.AccessibilityChannel.AccessibilityMessageHandler accessibilityMessageHandler) {
        this.handler = accessibilityMessageHandler;
        this.flutterJNI.setAccessibilityDelegate(accessibilityMessageHandler);
    }

    public void dispatchSemanticsAction(int i17, io.flutter.view.AccessibilityBridge.Action action, java.lang.Object obj) {
        this.flutterJNI.dispatchSemanticsAction(i17, action, obj);
    }

    public AccessibilityChannel(io.flutter.plugin.common.BasicMessageChannel<java.lang.Object> basicMessageChannel, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this.parsingMessageHandler = new io.flutter.plugin.common.BasicMessageChannel.MessageHandler<java.lang.Object>() { // from class: io.flutter.embedding.engine.systemchannels.AccessibilityChannel.1
            @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
            public void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> reply) {
                if (io.flutter.embedding.engine.systemchannels.AccessibilityChannel.this.handler == null) {
                    reply.reply(null);
                    return;
                }
                java.util.HashMap hashMap = (java.util.HashMap) obj;
                java.lang.String str = (java.lang.String) hashMap.get("type");
                java.util.HashMap hashMap2 = (java.util.HashMap) hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
                io.flutter.Log.v(io.flutter.embedding.engine.systemchannels.AccessibilityChannel.TAG, "Received " + str + " message.");
                str.getClass();
                char c17 = 65535;
                switch (str.hashCode()) {
                    case -1140076541:
                        if (str.equals("tooltip")) {
                            c17 = 0;
                            break;
                        }
                        break;
                    case -649620375:
                        if (str.equals("announce")) {
                            c17 = 1;
                            break;
                        }
                        break;
                    case 114595:
                        if (str.equals("tap")) {
                            c17 = 2;
                            break;
                        }
                        break;
                    case 97604824:
                        if (str.equals("focus")) {
                            c17 = 3;
                            break;
                        }
                        break;
                    case 114203431:
                        if (str.equals("longPress")) {
                            c17 = 4;
                            break;
                        }
                        break;
                }
                switch (c17) {
                    case 0:
                        java.lang.String str2 = (java.lang.String) hashMap2.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
                        if (str2 != null) {
                            io.flutter.embedding.engine.systemchannels.AccessibilityChannel.this.handler.onTooltip(str2);
                            break;
                        }
                        break;
                    case 1:
                        java.lang.String str3 = (java.lang.String) hashMap2.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
                        if (str3 != null) {
                            io.flutter.embedding.engine.systemchannels.AccessibilityChannel.this.handler.announce(str3);
                            break;
                        }
                        break;
                    case 2:
                        java.lang.Integer num = (java.lang.Integer) hashMap.get("nodeId");
                        if (num != null) {
                            io.flutter.embedding.engine.systemchannels.AccessibilityChannel.this.handler.onTap(num.intValue());
                            break;
                        }
                        break;
                    case 3:
                        java.lang.Integer num2 = (java.lang.Integer) hashMap.get("nodeId");
                        if (num2 != null) {
                            io.flutter.embedding.engine.systemchannels.AccessibilityChannel.this.handler.onFocus(num2.intValue());
                            break;
                        }
                        break;
                    case 4:
                        java.lang.Integer num3 = (java.lang.Integer) hashMap.get("nodeId");
                        if (num3 != null) {
                            io.flutter.embedding.engine.systemchannels.AccessibilityChannel.this.handler.onLongPress(num3.intValue());
                            break;
                        }
                        break;
                }
                reply.reply(null);
            }
        };
        this.channel = basicMessageChannel;
        this.flutterJNI = flutterJNI;
    }
}
