package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes13.dex */
public class SpellCheckChannel {
    private static final java.lang.String TAG = "SpellCheckChannel";
    public final io.flutter.plugin.common.MethodChannel channel;
    public final io.flutter.plugin.common.MethodChannel.MethodCallHandler parsingMethodHandler;
    private io.flutter.embedding.engine.systemchannels.SpellCheckChannel.SpellCheckMethodHandler spellCheckMethodHandler;

    /* loaded from: classes13.dex */
    public interface SpellCheckMethodHandler {
        void initiateSpellCheck(java.lang.String str, java.lang.String str2, io.flutter.plugin.common.MethodChannel.Result result);
    }

    public SpellCheckChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.SpellCheckChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                if (io.flutter.embedding.engine.systemchannels.SpellCheckChannel.this.spellCheckMethodHandler == null) {
                    io.flutter.Log.v(io.flutter.embedding.engine.systemchannels.SpellCheckChannel.TAG, "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                    return;
                }
                java.lang.String str = methodCall.method;
                java.lang.Object obj = methodCall.arguments;
                io.flutter.Log.v(io.flutter.embedding.engine.systemchannels.SpellCheckChannel.TAG, "Received '" + str + "' message.");
                str.getClass();
                if (!str.equals("SpellCheck.initiateSpellCheck")) {
                    result.notImplemented();
                    return;
                }
                try {
                    java.util.ArrayList arrayList = (java.util.ArrayList) obj;
                    io.flutter.embedding.engine.systemchannels.SpellCheckChannel.this.spellCheckMethodHandler.initiateSpellCheck((java.lang.String) arrayList.get(0), (java.lang.String) arrayList.get(1), result);
                } catch (java.lang.IllegalStateException e17) {
                    result.error("error", e17.getMessage(), null);
                }
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/spellcheck", io.flutter.plugin.common.StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void setSpellCheckMethodHandler(io.flutter.embedding.engine.systemchannels.SpellCheckChannel.SpellCheckMethodHandler spellCheckMethodHandler) {
        this.spellCheckMethodHandler = spellCheckMethodHandler;
    }
}
