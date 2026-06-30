package ik0;

/* loaded from: classes5.dex */
public final class a implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.basic_function.InputBarApi {
    @Override // com.tencent.pigeon.basic_function.InputBarApi
    public void getAutoFillContent(com.tencent.pigeon.basic_function.AutoFillType type, yz5.l callback) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.InputBarPlugin", "getAutoFillContent type: " + type + ", not supported on Android");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.UnsupportedOperationException("AutoFill type " + type + " not supported on Android")))));
    }

    @Override // com.tencent.pigeon.basic_function.InputBarApi
    public java.util.List loadShortbarEmojis(java.lang.String configName) {
        kotlin.jvm.internal.o.g(configName, "configName");
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("IMEmoji");
        if (d17 == null) {
            d17 = "";
        }
        if (d17.length() == 0) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            org.json.JSONArray jSONArray = new org.json.JSONObject(d17).getJSONArray(configName);
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                arrayList.add(jSONArray.get(i17).toString());
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.InputBarPlugin", "loadShortbarEmojis failed to parse json from string: ".concat(d17));
            arrayList.clear();
        }
        return arrayList;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.InputBarPlugin", "on attached to engine");
        com.tencent.pigeon.basic_function.InputBarApi.Companion companion = com.tencent.pigeon.basic_function.InputBarApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.basic_function.InputBarApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.InputBarPlugin", "on detached from engine");
    }
}
