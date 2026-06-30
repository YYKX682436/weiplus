package si0;

/* loaded from: classes11.dex */
public final class p1 implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.sns.PlatformTextProcessingApi, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f408149d;

    @Override // com.tencent.pigeon.sns.PlatformTextProcessingApi
    public void addTextToFavourite(java.lang.String text, yz5.l callback) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            je4.e.f299318a.b(this.f408149d, text);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(0L)));
        } catch (java.lang.Exception e17) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
        }
    }

    @Override // com.tencent.pigeon.sns.PlatformTextProcessingApi
    public void getWordSegment(java.lang.String text, yz5.l callback) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            java.util.List a17 = kl5.b.a(text);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i17 = 0;
            for (java.lang.Object obj : a17) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str = (java.lang.String) obj;
                kotlin.jvm.internal.o.d(str);
                arrayList.add(new com.tencent.pigeon.sns.SnsWordSegment(str, ""));
                i17 = i18;
            }
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(arrayList)));
        } catch (java.lang.Exception e17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f408149d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformTextProcessingApi.Companion companion = com.tencent.pigeon.sns.PlatformTextProcessingApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformTextProcessingApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f408149d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f408149d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformTextProcessingApi.Companion companion = com.tencent.pigeon.sns.PlatformTextProcessingApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformTextProcessingApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f408149d = binding.getActivity();
    }

    @Override // com.tencent.pigeon.sns.PlatformTextProcessingApi
    public void openWebLink(java.lang.String url, yz5.l callback) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            je4.e.f299318a.a(this.f408149d, url);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
        } catch (java.lang.Exception e17) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
        }
    }

    @Override // com.tencent.pigeon.sns.PlatformTextProcessingApi
    public void searchWeb(java.lang.String text, yz5.l callback) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            je4.e.f299318a.c(this.f408149d, text);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
        } catch (java.lang.Exception e17) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
        }
    }

    @Override // com.tencent.pigeon.sns.PlatformTextProcessingApi
    public void showEmailMenu(java.lang.String email, yz5.l callback) {
        kotlin.jvm.internal.o.g(email, "email");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            android.app.Activity activity = this.f408149d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showEmailMenu", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
            if (activity == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showEmailMenu", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
            } else {
                new android.os.Bundle();
                com.tencent.mm.autogen.events.ShowEmailMenuEvent showEmailMenuEvent = new com.tencent.mm.autogen.events.ShowEmailMenuEvent();
                am.qu quVar = showEmailMenuEvent.f54782g;
                quVar.f7744a = activity;
                quVar.f7745b = email;
                showEmailMenuEvent.e();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showEmailMenu", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
        } catch (java.lang.Exception e17) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
        }
    }

    @Override // com.tencent.pigeon.sns.PlatformTextProcessingApi
    public void showPhoneNumberMenu(java.lang.String phone, yz5.l callback) {
        kotlin.jvm.internal.o.g(phone, "phone");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            android.app.Activity activity = this.f408149d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPhoneMenu", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
            if (activity == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPhoneMenu", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                com.tencent.mm.autogen.events.ShowPhoneMenuEvent showPhoneMenuEvent = new com.tencent.mm.autogen.events.ShowPhoneMenuEvent();
                am.ru ruVar = showPhoneMenuEvent.f54783g;
                ruVar.f7843a = activity;
                ruVar.f7844b = phone;
                ruVar.f7846d = bundle;
                showPhoneMenuEvent.e();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPhoneMenu", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
        } catch (java.lang.Exception e17) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(e17))));
        }
    }
}
