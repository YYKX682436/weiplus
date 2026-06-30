package si0;

/* loaded from: classes4.dex */
public final class y0 implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.sns.PlatformLanguageApi, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f408210d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f408211e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f408212f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f408213g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.flutter.plugin.SnsLanguageFlutterPlugin$translateResultListener$1 f408214h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f408215i;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.flutter.plugin.SnsLanguageFlutterPlugin$translateResultListener$1] */
    public y0() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f408214h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TranslateMessageResultEvent>(a0Var) { // from class: com.tencent.mm.flutter.plugin.SnsLanguageFlutterPlugin$translateResultListener$1
            {
                this.__eventId = -1739498572;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TranslateMessageResultEvent translateMessageResultEvent) {
                com.tencent.mm.autogen.events.TranslateMessageResultEvent event = translateMessageResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                si0.y0 y0Var = si0.y0.this;
                java.lang.String str = y0Var.f408213g;
                if (str == null) {
                    return false;
                }
                am.kz kzVar = event.f54905g;
                if (!kotlin.jvm.internal.o.b(str, kzVar.f7196d)) {
                    return false;
                }
                if (kzVar.f7193a == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(kzVar.f7195c)) {
                    yz5.l lVar = y0Var.f408211e;
                    if (lVar != null) {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kzVar.f7195c)));
                    }
                    y0Var.a();
                    return false;
                }
                yz5.l lVar2 = y0Var.f408211e;
                if (lVar2 != null) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    android.app.Activity activity = y0Var.f408210d;
                    lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(activity != null ? activity.getString(com.tencent.mm.R.string.b6c) : null)))));
                }
                y0Var.a();
                return false;
            }
        };
        this.f408215i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent>(a0Var) { // from class: com.tencent.mm.flutter.plugin.SnsLanguageFlutterPlugin$languageChangeListener$1
            {
                this.__eventId = -348375692;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent) {
                com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent event = changeTranslateLanguageEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String newLanguageCode = event.f54035g.f8503b;
                kotlin.jvm.internal.o.f(newLanguageCode, "newLanguageCode");
                boolean z17 = newLanguageCode.length() > 0;
                si0.y0 y0Var = si0.y0.this;
                if (z17) {
                    java.lang.String str = y0Var.f408212f;
                    if (str != null && y0Var.f408211e != null) {
                        y0Var.f408213g = "sns_partial_translate_" + java.lang.System.currentTimeMillis();
                        com.tencent.mm.autogen.events.TranslateMessageEvent translateMessageEvent = new com.tencent.mm.autogen.events.TranslateMessageEvent();
                        java.lang.String str2 = y0Var.f408213g;
                        am.hz hzVar = translateMessageEvent.f54902g;
                        hzVar.f6880c = str2;
                        hzVar.f6878a = str;
                        hzVar.f6879b = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        hzVar.f6881d = 0;
                        hzVar.f6882e = 0;
                        hzVar.f6883f = "sns_flutter";
                        translateMessageEvent.e();
                    }
                } else {
                    y0Var.a();
                }
                return false;
            }
        };
    }

    public final void a() {
        this.f408212f = null;
        this.f408211e = null;
        this.f408215i.dead();
        dead();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f408210d = binding.getActivity();
        alive();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformLanguageApi.Companion companion = com.tencent.pigeon.sns.PlatformLanguageApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformLanguageApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f408210d = null;
        a();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f408210d = null;
        a();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformLanguageApi.Companion companion = com.tencent.pigeon.sns.PlatformLanguageApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformLanguageApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        a();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f408210d = binding.getActivity();
        alive();
    }

    @Override // com.tencent.pigeon.sns.PlatformLanguageApi
    public void partialTranslate(java.lang.String sourceText, final yz5.l callback) {
        kotlin.jvm.internal.o.g(sourceText, "sourceText");
        kotlin.jvm.internal.o.g(callback, "callback");
        final com.tencent.mm.autogen.events.TranslateMessageEvent translateMessageEvent = new com.tencent.mm.autogen.events.TranslateMessageEvent();
        java.lang.String str = "sns_direct_translate_" + java.lang.System.currentTimeMillis();
        am.hz hzVar = translateMessageEvent.f54902g;
        hzVar.f6880c = str;
        hzVar.f6878a = sourceText;
        hzVar.f6879b = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        hzVar.f6881d = 0;
        hzVar.f6882e = 0;
        hzVar.f6883f = "sns_flutter";
        translateMessageEvent.e();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.TranslateMessageResultEvent>(a0Var) { // from class: com.tencent.mm.flutter.plugin.SnsLanguageFlutterPlugin$triggerDirectTranslation$tempListener$1
            {
                this.__eventId = -1739498572;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.TranslateMessageResultEvent translateMessageResultEvent) {
                java.lang.String str2;
                com.tencent.mm.autogen.events.TranslateMessageResultEvent event = translateMessageResultEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.kz kzVar = event.f54905g;
                if (!kotlin.jvm.internal.o.b(kzVar.f7196d, com.tencent.mm.autogen.events.TranslateMessageEvent.this.f54902g.f6880c)) {
                    return true;
                }
                int i17 = kzVar.f7193a;
                yz5.l lVar = callback;
                if (i17 != 0 || com.tencent.mm.sdk.platformtools.t8.K0(kzVar.f7195c)) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    android.app.Activity activity = this.f408210d;
                    if (activity == null || (str2 = activity.getString(com.tencent.mm.R.string.b6c)) == null) {
                        str2 = "error";
                    }
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception(str2)))));
                } else {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kzVar.f7195c)));
                }
                dead();
                return true;
            }
        }.alive();
    }

    @Override // com.tencent.pigeon.sns.PlatformLanguageApi
    public void selectLanguage(java.lang.String sourceText, yz5.l callback) {
        kotlin.jvm.internal.o.g(sourceText, "sourceText");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f408210d;
        if (activity == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception()))));
            return;
        }
        com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = new com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest();
        settingsTranslateLanguageRequest.f67821d = wd0.k2.MOMENTS_TIMELINE;
        settingsTranslateLanguageRequest.f67822e = "sns_content_" + sourceText.hashCode();
        ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(activity, settingsTranslateLanguageRequest);
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("")));
    }

    @Override // com.tencent.pigeon.sns.PlatformLanguageApi
    public void selectPartialTranslateLanguage(java.lang.String sourceText, yz5.l callback) {
        kotlin.jvm.internal.o.g(sourceText, "sourceText");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f408210d;
        if (activity == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("Activity unAvailable")))));
            return;
        }
        this.f408212f = sourceText;
        this.f408211e = callback;
        this.f408215i.alive();
        com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = new com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest();
        settingsTranslateLanguageRequest.f67821d = wd0.k2.MOMENTS_TIMELINE;
        settingsTranslateLanguageRequest.f67822e = "sns_content_" + sourceText.hashCode();
        ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(activity, settingsTranslateLanguageRequest);
    }
}
