package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class KeyEventChannel {
    private static final java.lang.String TAG = "KeyEventChannel";
    public final io.flutter.plugin.common.BasicMessageChannel<java.lang.Object> channel;

    /* loaded from: classes15.dex */
    public interface EventResponseHandler {
        void onFrameworkResponse(boolean z17);
    }

    /* loaded from: classes15.dex */
    public static class FlutterKeyEvent {
        public final java.lang.Character complexCharacter;
        public final android.view.KeyEvent event;

        public FlutterKeyEvent(android.view.KeyEvent keyEvent) {
            this(keyEvent, null);
        }

        public FlutterKeyEvent(android.view.KeyEvent keyEvent, java.lang.Character ch6) {
            this.event = keyEvent;
            this.complexCharacter = ch6;
        }
    }

    public KeyEventChannel(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
        this.channel = new io.flutter.plugin.common.BasicMessageChannel<>(binaryMessenger, "flutter/keyevent", io.flutter.plugin.common.JSONMessageCodec.INSTANCE);
    }

    private static io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> createReplyHandler(final io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler eventResponseHandler) {
        return new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.embedding.engine.systemchannels.KeyEventChannel$$a
            @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
            public final void reply(java.lang.Object obj) {
                io.flutter.embedding.engine.systemchannels.KeyEventChannel.lambda$createReplyHandler$0(io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler.this, obj);
            }
        };
    }

    private java.util.Map<java.lang.String, java.lang.Object> encodeKeyEvent(io.flutter.embedding.engine.systemchannels.KeyEventChannel.FlutterKeyEvent flutterKeyEvent, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", z17 ? "keyup" : "keydown");
        hashMap.put("keymap", com.eclipsesource.mmv8.Platform.ANDROID);
        hashMap.put("flags", java.lang.Integer.valueOf(flutterKeyEvent.event.getFlags()));
        hashMap.put("plainCodePoint", java.lang.Integer.valueOf(flutterKeyEvent.event.getUnicodeChar(0)));
        hashMap.put("codePoint", java.lang.Integer.valueOf(flutterKeyEvent.event.getUnicodeChar()));
        hashMap.put("keyCode", java.lang.Integer.valueOf(flutterKeyEvent.event.getKeyCode()));
        hashMap.put(com.tencent.mm.plugin.appbrand.jsapi.scanner.p.NAME, java.lang.Integer.valueOf(flutterKeyEvent.event.getScanCode()));
        hashMap.put("metaState", java.lang.Integer.valueOf(flutterKeyEvent.event.getMetaState()));
        java.lang.Character ch6 = flutterKeyEvent.complexCharacter;
        if (ch6 != null) {
            hashMap.put(ya.b.CHARACTER, ch6.toString());
        }
        hashMap.put(ya.b.SOURCE, java.lang.Integer.valueOf(flutterKeyEvent.event.getSource()));
        hashMap.put("deviceId", java.lang.Integer.valueOf(flutterKeyEvent.event.getDeviceId()));
        hashMap.put("repeatCount", java.lang.Integer.valueOf(flutterKeyEvent.event.getRepeatCount()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createReplyHandler$0(io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler eventResponseHandler, java.lang.Object obj) {
        boolean z17 = false;
        if (obj != null) {
            try {
                z17 = ((org.json.JSONObject) obj).getBoolean("handled");
            } catch (org.json.JSONException e17) {
                io.flutter.Log.e(TAG, "Unable to unpack JSON message: " + e17);
            }
        }
        eventResponseHandler.onFrameworkResponse(z17);
    }

    public void sendFlutterKeyEvent(io.flutter.embedding.engine.systemchannels.KeyEventChannel.FlutterKeyEvent flutterKeyEvent, boolean z17, io.flutter.embedding.engine.systemchannels.KeyEventChannel.EventResponseHandler eventResponseHandler) {
        this.channel.send(encodeKeyEvent(flutterKeyEvent, z17), createReplyHandler(eventResponseHandler));
    }
}
