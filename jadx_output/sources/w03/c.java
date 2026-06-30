package w03;

/* loaded from: classes14.dex */
public final class c extends io.flutter.embedding.android.PatchedFlutterActivityController {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f441875f = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f441876d;

    /* renamed from: e, reason: collision with root package name */
    public w03.a f441877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.voip.ui.VideoActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean attachToEngineAutomatically() {
        return true;
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host, io.flutter.embedding.android.FlutterEngineConfigurator
    public void configureFlutterEngine(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        kotlin.jvm.internal.o.g(flutterEngine, "flutterEngine");
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, hq4.a
    public void dealContentView(android.view.View view) {
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, hq4.a
    public void finish() {
        this.vActivity.U6();
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean getBackCallbackState() {
        return false;
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public java.lang.String getCachedEngineId() {
        java.lang.String cachedEngineId = super.getCachedEngineId();
        if (cachedEngineId == null || io.flutter.embedding.engine.FlutterEngineCache.getInstance().get(cachedEngineId) == null) {
            this.f441876d = false;
            return null;
        }
        this.f441876d = true;
        return cachedEngineId;
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, hq4.a
    public int getForceOrientation() {
        return 1;
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, hq4.a
    public int getLayoutId() {
        return -1;
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, hq4.a
    public void importUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, hq4.a
    public boolean onBackPressed() {
        com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
        if (Bi == null || Bi.f176559b == null) {
            return true;
        }
        c13.b0 b0Var = c13.b0.f37860d;
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = c13.b0.f37861e;
        if (voIPFlutterApi == null) {
            return true;
        }
        voIPFlutterApi.onMinimized(c13.l.f37887d);
        return true;
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, hq4.a
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        setupConfiguration(newConfig);
        com.tencent.mars.xlog.Log.i("MicroMsg.CachedFlutterActivity", "onConfigurationChanged: " + newConfig);
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, hq4.a
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String cachedEngineId = super.getCachedEngineId();
        com.tencent.mars.xlog.Log.i("MicroMsg.CachedFlutterActivity", "onCreate: cachedEngineId=" + cachedEngineId);
        if (cachedEngineId == null) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_flutter_voip_finish_if_invalid_intent, true)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.CachedFlutterActivity", "finish activity because null cachedEngineId");
                this.vActivity.U6();
                return;
            }
        }
        if (cachedEngineId != null && io.flutter.embedding.engine.FlutterEngineCache.getInstance().get(cachedEngineId) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CachedFlutterActivity", "launch with cached engine id " + cachedEngineId + ", but it has been destroyed");
            this.vActivity.U6();
            return;
        }
        com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
        if (Bi != null) {
            jq4.c1 c1Var = Bi.f176581x;
            c1Var.getClass();
            jq4.z0.c(c1Var, false, false, false, 7, null);
        }
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, hq4.a
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        b13.m mVar;
        kotlin.jvm.internal.o.g(event, "event");
        w03.a aVar = this.f441877e;
        if (aVar == null || (mVar = ((a13.k) aVar).f555a.f577m) == null) {
            return false;
        }
        if (i17 != 25) {
            if (i17 == 24 && mVar.f176387r && !gq4.v.Bi().x()) {
                ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).tj();
            }
            return wo.v1.f447822b.f447661f != 1 ? false : false;
        }
        if (!gq4.v.Bi().x() && mVar.f176387r) {
            ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).sj();
        }
        if (wo.v1.f447822b.f447661f != 1 && i17 == 700) {
            mVar.I0();
        }
        return true;
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, hq4.a
    public void onResume() {
        super.onResume();
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, hq4.a
    public void onSwipeBackFinish() {
        gq4.a aVar;
        com.tencent.mm.plugin.voip.model.h2 Bi = gq4.v.Bi();
        if (Bi == null || (aVar = Bi.f176559b) == null) {
            return;
        }
        b13.m mVar = (b13.m) aVar;
        c13.b0 b0Var = c13.b0.f37860d;
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = c13.b0.f37861e;
        if (voIPFlutterApi != null) {
            voIPFlutterApi.onMinimized(c13.l.f37887d);
        }
        mVar.o0(17);
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, hq4.a
    public android.view.View provideCustomActivityContentView() {
        return null;
    }

    @Override // io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public io.flutter.plugin.view.SensitiveContentPlugin provideSensitiveContentPlugin(android.app.Activity activity, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        kotlin.jvm.internal.o.g(flutterEngine, "flutterEngine");
        if (activity != null) {
            return new io.flutter.plugin.view.SensitiveContentPlugin(io.flutter.embedding.android.PatchedFlutterActivityController.FLUTTER_VIEW_ID, activity, flutterEngine.getSensitiveContentChannel());
        }
        return null;
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController
    public void setupConfiguration(android.content.res.Configuration configuration) {
        kotlin.jvm.internal.o.g(configuration, "configuration");
        configuration.uiMode = com.tencent.mm.ui.bk.C() ? 32 : 16;
        configuration.fontScale = i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        if (!(d17 == null || d17.length() == 0)) {
            kotlin.jvm.internal.o.d(d17);
            java.util.List e07 = r26.n0.e0(d17, new char[]{'_'}, false, 0, 6, null);
            java.util.Locale locale = new java.util.Locale((java.lang.String) e07.get(0), e07.size() > 1 ? (java.lang.String) e07.get(1) : "", "");
            android.os.LocaleList locales = configuration.getLocales();
            kotlin.jvm.internal.o.f(locales, "getLocales(...)");
            e06.k m17 = e06.p.m(0, locales.size());
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
            java.util.Iterator it = m17.iterator();
            while (((e06.j) it).hasNext()) {
                arrayList.add(locales.get(((kz5.x0) it).b()));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                java.util.Locale locale2 = (java.util.Locale) next;
                if ((kotlin.jvm.internal.o.b(locale2.getLanguage(), locale.getLanguage()) || kotlin.jvm.internal.o.b(locale2.getCountry(), locale.getCountry())) ? false : true) {
                    arrayList2.add(next);
                }
            }
            java.util.Locale[] localeArr = (java.util.Locale[]) arrayList2.toArray(new java.util.Locale[0]);
            kotlin.jvm.internal.l0 l0Var = new kotlin.jvm.internal.l0(2);
            l0Var.a(locale);
            l0Var.b(localeArr);
            configuration.setLocales(new android.os.LocaleList((java.util.Locale[]) l0Var.d(new java.util.Locale[l0Var.c()])));
        }
        this.vActivity.getResources().getDisplayMetrics().setTo(com.tencent.mm.sdk.platformtools.x2.f193075e.getDisplayMetrics());
    }

    @Override // io.flutter.embedding.android.PatchedFlutterActivityController, io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.Host
    public boolean shouldDestroyEngineWithHost() {
        java.lang.String cachedEngineId = super.getCachedEngineId();
        if (!this.f441876d) {
            return true;
        }
        if (cachedEngineId == null || io.flutter.embedding.engine.FlutterEngineCache.getInstance().get(cachedEngineId) != null) {
            return super.shouldDestroyEngineWithHost();
        }
        return false;
    }
}
