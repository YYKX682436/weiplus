package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes13.dex */
public class LocalizationChannel {
    private static final java.lang.String TAG = "LocalizationChannel";
    public final io.flutter.plugin.common.MethodChannel channel;
    public final io.flutter.plugin.common.MethodChannel.MethodCallHandler handler;
    private io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler localizationMessageHandler;

    /* loaded from: classes13.dex */
    public interface LocalizationMessageHandler {
        java.lang.String getStringResource(java.lang.String str, java.lang.String str2);
    }

    public LocalizationChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        io.flutter.plugin.common.MethodChannel.MethodCallHandler methodCallHandler = new io.flutter.plugin.common.MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.LocalizationChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
                if (io.flutter.embedding.engine.systemchannels.LocalizationChannel.this.localizationMessageHandler == null) {
                    return;
                }
                java.lang.String str = methodCall.method;
                str.getClass();
                if (!str.equals("Localization.getStringResource")) {
                    result.notImplemented();
                    return;
                }
                org.json.JSONObject jSONObject = (org.json.JSONObject) methodCall.arguments();
                try {
                    result.success(io.flutter.embedding.engine.systemchannels.LocalizationChannel.this.localizationMessageHandler.getStringResource(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                } catch (org.json.JSONException e17) {
                    result.error("error", e17.getMessage(), null);
                }
            }
        };
        this.handler = methodCallHandler;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(dartExecutor, "flutter/localization", io.flutter.plugin.common.JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void sendLocales(java.util.List<java.util.Locale> list) {
        io.flutter.Log.v(TAG, "Sending Locales to Flutter.");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Locale locale : list) {
            io.flutter.Log.v(TAG, "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.channel.invokeMethod("setLocale", arrayList);
    }

    public void setLocalizationMessageHandler(io.flutter.embedding.engine.systemchannels.LocalizationChannel.LocalizationMessageHandler localizationMessageHandler) {
        this.localizationMessageHandler = localizationMessageHandler;
    }
}
