package g03;

/* loaded from: classes11.dex */
public class a implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f267441d;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Flutter.FlutterCrashReportPlugin", "onAttachedToEngine FlutterCrashReportPlugin CHANNEL%s", "com.tencent.mm.flutter.crashreport");
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.tencent.mm.flutter.crashreport");
        this.f267441d = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f267441d.setMethodCallHandler(null);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        java.lang.Object obj;
        com.tencent.mm.sdk.platformtools.o4 L;
        java.lang.String string;
        java.lang.Object obj2;
        java.lang.String str = methodCall.method;
        str.getClass();
        if (str.equals("crash_report")) {
            java.util.Map map = (java.util.Map) methodCall.argument("crashInfo");
            java.lang.String str2 = (java.lang.String) methodCall.argument(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            boolean booleanValue = ((java.lang.Boolean) methodCall.argument("killSelf")).booleanValue();
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("\n#deviceParameters=" + map.get("deviceParameters"));
            stringBuffer.append("\n#customParameters=" + map.get("customParameters"));
            stringBuffer.append("\n#applicationParameters=" + map.get("applicationParameters"));
            stringBuffer.append("\n#dateTime=" + map.get("dateTime"));
            stringBuffer.append("\n#context=" + map.get("context"));
            stringBuffer.append("\n#library=" + map.get("library"));
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            stringBuffer.append("\n".concat(ld.d.f318046b.a().b()));
            stringBuffer.append("\n" + a03.h.a());
            java.util.Map map2 = (java.util.Map) map.get("customParameters");
            kotlin.jvm.internal.o.d(map2);
            if (!map2.containsKey("WxaLiteApp") || (string = (L = com.tencent.mm.sdk.platformtools.o4.L()).getString("wxa_lite_app_game_center_version", "")) == null) {
                obj = "error";
            } else {
                if (booleanValue) {
                    int i17 = L.getInt("count_".concat(string), 0);
                    obj2 = "error";
                    long j17 = L.getLong("time_".concat(string), 0L);
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    if (currentTimeMillis - j17 > 3600000) {
                        L.putInt("count_".concat(string), 1);
                    } else {
                        L.putInt("count_".concat(string), i17 + 1);
                    }
                    L.putLong("time_".concat(string), currentTimeMillis);
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppCrashReportHandler", "WxaLiteApp handle crash. version:%s count%d time:%s now:%s", string, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis));
                } else {
                    obj2 = "error";
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaLiteAppCrashReportHandler", "WxaLiteApp handle state error . version:%s", string);
                }
                obj = obj2;
                java.lang.Object obj3 = map.get(obj);
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str3 = (java.lang.String) obj3;
                if (str3.length() >= 10) {
                    str3 = str3.substring(0, 10);
                    kotlin.jvm.internal.o.f(str3, "substring(...)");
                }
                if (booleanValue) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1293L, 103L, 1L);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1293L, 104L, 1L);
                }
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = string;
                objArr[1] = booleanValue ? com.google.android.gms.measurement.AppMeasurement.CRASH_ORIGIN : "bad state only";
                objArr[2] = str3;
                g0Var.d(20315, objArr);
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.Flutter.FlutterReportLogic", "reportFlutterActionAction %s %s", "FlutterCrash", str2);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.d(17326, java.lang.Long.valueOf(currentTimeMillis2), "FlutterCrash", str2);
            fVar.idkeyStat(1053L, 2, 1L, false);
            java.lang.String stringBuffer2 = stringBuffer.toString();
            java.lang.String str4 = (java.lang.String) map.get(obj);
            java.lang.String str5 = (java.lang.String) map.get("stackTrace");
            z65.d dVar = z65.c.f470457c;
            if (dVar != null) {
                dVar.a(stringBuffer2, "", booleanValue, str4, str5);
            }
            com.tencent.mars.xlog.Log.appenderFlushSync();
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (booleanValue) {
                com.tencent.mars.xlog.Log.appenderClose();
                int myPid = android.os.Process.myPid();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(myPid));
                java.lang.Object obj4 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj4, arrayList.toArray(), "com/tencent/mm/plugin/flutter/model/FlutterCrashReportPlugin", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(obj4, "com/tencent/mm/plugin/flutter/model/FlutterCrashReportPlugin", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "android/os/Process_EXEC_", "killProcess", "(I)V");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.lang.Object obj5 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj5, arrayList2.toArray(), "com/tencent/mm/plugin/flutter/model/FlutterCrashReportPlugin", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "java/lang/System_EXEC_", "exit", "(I)V");
                java.lang.System.exit(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(obj5, "com/tencent/mm/plugin/flutter/model/FlutterCrashReportPlugin", "onMethodCall", "(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", "java/lang/System_EXEC_", "exit", "(I)V");
            }
        }
    }
}
