package zc;

/* loaded from: classes15.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f471312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zc.b0 f471313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f471314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471315g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471316h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471317i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471318m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471319n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471320o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.report.WxaLiteAppStartReport f471321p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(zc.b0 b0Var, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.liteapp.report.WxaLiteAppStartReport wxaLiteAppStartReport, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f471313e = b0Var;
        this.f471314f = j17;
        this.f471315g = str;
        this.f471316h = str2;
        this.f471317i = str3;
        this.f471318m = str4;
        this.f471319n = str5;
        this.f471320o = str6;
        this.f471321p = wxaLiteAppStartReport;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zc.a0(this.f471313e, this.f471314f, this.f471315g, this.f471316h, this.f471317i, this.f471318m, this.f471319n, this.f471320o, this.f471321p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zc.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f471312d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.z zVar = this.f471313e.f471335n;
            this.f471312d = 1;
            if (((kotlinx.coroutines.a0) zVar).k(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int i18 = (int) this.f471314f;
        java.lang.Long l17 = this.f471313e.f471337p;
        kotlin.jvm.internal.o.d(l17);
        int longValue = (int) l17.longValue();
        int hashCode = this.f471313e.hashCode();
        java.lang.String str = this.f471315g;
        java.lang.String str2 = this.f471316h;
        java.lang.String str3 = this.f471317i;
        java.lang.String str4 = this.f471318m;
        java.lang.String str5 = this.f471319n;
        java.lang.String str6 = this.f471320o;
        com.tencent.pigeon.liteapp.WxaLiteAppWidgetFlutterPluginApi wxaLiteAppWidgetFlutterPluginApi = this.f471313e.f471334m;
        kotlin.jvm.internal.o.d(wxaLiteAppWidgetFlutterPluginApi);
        android.content.Context context = this.f471313e.f471331g;
        kotlin.jvm.internal.o.d(context);
        io.flutter.embedding.engine.FlutterEngine flutterEngine = this.f471313e.f471330f;
        kotlin.jvm.internal.o.d(flutterEngine);
        android.app.Activity activity = this.f471313e.f471328d;
        kotlin.jvm.internal.o.d(activity);
        java.lang.Object obj2 = this.f471313e.f471329e;
        kotlin.jvm.internal.o.d(obj2);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = this.f471313e.f471332h;
        kotlin.jvm.internal.o.d(binaryMessenger);
        com.tencent.liteapp.report.WxaLiteAppStartReport startReport = this.f471321p;
        kotlin.jvm.internal.o.f(startReport, "$startReport");
        io.flutter.embedding.engine.plugins.PluginRegistry pluginRegistry = this.f471313e.f471333i;
        kotlin.jvm.internal.o.d(pluginRegistry);
        com.tencent.liteapp.WxaLiteAppWidgetAdapter wxaLiteAppWidgetAdapter = new com.tencent.liteapp.WxaLiteAppWidgetAdapter(i18, longValue, hashCode, str, str2, str3, str4, str5, str6, wxaLiteAppWidgetFlutterPluginApi, context, flutterEngine, activity, obj2, binaryMessenger, startReport, pluginRegistry);
        wxaLiteAppWidgetAdapter.f45978t.D = java.lang.System.currentTimeMillis();
        if (wxaLiteAppWidgetAdapter.f45978t.I != null) {
            java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
            hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, wxaLiteAppWidgetAdapter.f45969h);
            wxaLiteAppWidgetAdapter.f45978t.I.logStart(com.tencent.liteapp.gen.StartAction.LOAD_HOME_PAGE, hashMap);
        }
        kx5.n h17 = kx5.n.h();
        h17.f313316f.put(wxaLiteAppWidgetAdapter.getFlutterViewId(), wxaLiteAppWidgetAdapter);
        h17.f313315e = wxaLiteAppWidgetAdapter;
        wxaLiteAppWidgetAdapter.f45982x = com.tencent.mm.plugin.lite.LiteAppCenter.readPageConfig(wxaLiteAppWidgetAdapter.f45968g, wxaLiteAppWidgetAdapter.f45972n, wxaLiteAppWidgetAdapter.f45973o, wxaLiteAppWidgetAdapter.f45969h);
        com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback lVUICallback = new com.tencent.mm.plugin.lite.LiteAppCenter.LVUICallback(wxaLiteAppWidgetAdapter.f45968g, wxaLiteAppWidgetAdapter);
        wxaLiteAppWidgetAdapter.f45983y = lVUICallback;
        com.tencent.mm.plugin.lite.LiteAppCenter.OpenExtraData uICallback = com.tencent.mm.plugin.lite.LiteAppCenter.setUICallback(wxaLiteAppWidgetAdapter.f45965d, lVUICallback);
        if ((uICallback != null ? uICallback.query : null) != null) {
            java.lang.String query = uICallback.query;
            kotlin.jvm.internal.o.f(query, "query");
            wxaLiteAppWidgetAdapter.f45970i = query;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.setLocale(java.util.Locale.getDefault().getLanguage(), java.util.Locale.getDefault().getCountry());
        md.n.c(wxaLiteAppWidgetAdapter.f45975q);
        wxaLiteAppWidgetAdapter.f45984z = wxaLiteAppWidgetAdapter.f45975q.getResources().getConfiguration().orientation == 2;
        boolean isCurrentDarkMode = com.tencent.mm.plugin.lite.LiteAppCenter.isCurrentDarkMode();
        wxaLiteAppWidgetAdapter.A = isCurrentDarkMode;
        com.tencent.mm.plugin.lite.LiteAppCenter.updateDarkMode(isCurrentDarkMode);
        float f17 = com.tencent.mm.plugin.lite.LiteAppCenter.fontScaleFollowSystem ? wxaLiteAppWidgetAdapter.f45975q.getResources().getConfiguration().fontScale : com.tencent.mm.plugin.lite.LiteAppCenter.fontScale;
        wxaLiteAppWidgetAdapter.B = f17;
        com.tencent.mm.plugin.lite.LiteAppCenter.updateFontScale(f17);
        com.tencent.mm.plugin.lite.LiteAppCenter.setIsHalfScreen(wxaLiteAppWidgetAdapter.f45965d, false);
        ld.d.f318046b.a().a(new ld.a(wxaLiteAppWidgetAdapter.f45968g));
        com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig pageConfig = wxaLiteAppWidgetAdapter.f45982x;
        wxaLiteAppWidgetAdapter.setPageOrientation(pageConfig != null ? pageConfig.pageOrientation : 0);
        com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig pageConfig2 = wxaLiteAppWidgetAdapter.f45982x;
        kotlin.jvm.internal.o.d(pageConfig2);
        if (pageConfig2.backgroundImage != null && wxaLiteAppWidgetAdapter.P == null) {
            com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig pageConfig3 = wxaLiteAppWidgetAdapter.f45982x;
            kotlin.jvm.internal.o.d(pageConfig3);
            java.lang.String backgroundImagePath = pageConfig3.getBackgroundImagePath(wxaLiteAppWidgetAdapter.A);
            kotlin.jvm.internal.o.f(backgroundImagePath, "getBackgroundImagePath(...)");
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("./");
            kotlin.jvm.internal.o.f(compile, "compile(...)");
            java.lang.String replaceFirst = compile.matcher(backgroundImagePath).replaceFirst("");
            kotlin.jvm.internal.o.f(replaceFirst, "replaceFirst(...)");
            java.lang.String str7 = wxaLiteAppWidgetAdapter.f45972n + "/pkg/" + replaceFirst;
            android.app.Activity activity2 = wxaLiteAppWidgetAdapter.f45975q;
            android.widget.ImageView imageView = new android.widget.ImageView(activity2);
            imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            com.tencent.mm.plugin.lite.LiteAppCenter.PageConfig pageConfig4 = wxaLiteAppWidgetAdapter.f45982x;
            kotlin.jvm.internal.o.d(pageConfig4);
            android.widget.ImageView.ScaleType backgroundImageMode = pageConfig4.getBackgroundImageMode();
            imageView.setScaleType(backgroundImageMode);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(str7);
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj3, arrayList.toArray(), "com/tencent/liteapp/WxaLiteAppWidgetAdapter", "addBackgroundImage", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
            yj0.a.e(obj3, decodeFile, "com/tencent/liteapp/WxaLiteAppWidgetAdapter", "addBackgroundImage", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            if (decodeFile == null) {
                kd.c.b("LiteApp.WxaLiteAppWidgetAdapter", "backgroundImage load fail, path: " + str7, new java.lang.Object[0]);
            }
            imageView.setImageBitmap(decodeFile);
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(activity2);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.addView(imageView);
            activity2.addContentView(frameLayout, layoutParams);
            wxaLiteAppWidgetAdapter.P = imageView;
            kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "add backgroundImage | relativeImagePath: " + replaceFirst + " | absoluteImagePath: " + str7 + " | scaleType: " + backgroundImageMode, new java.lang.Object[0]);
        }
        if (wxaLiteAppWidgetAdapter.f45981w == null) {
            com.tencent.liteapp.ui.i iVar = new com.tencent.liteapp.ui.i(wxaLiteAppWidgetAdapter.f45975q);
            wxaLiteAppWidgetAdapter.f45981w = iVar;
            iVar.f46169b = wxaLiteAppWidgetAdapter;
        }
        if (wxaLiteAppWidgetAdapter.N == null) {
            wxaLiteAppWidgetAdapter.N = new md.j(wxaLiteAppWidgetAdapter.f45975q, 2);
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.registerAudioBroadCaseReceiver(wxaLiteAppWidgetAdapter.f45975q);
        zc.x c17 = wxaLiteAppWidgetAdapter.c();
        if (c17 != null) {
            java.lang.String appId = wxaLiteAppWidgetAdapter.f45968g;
            kotlin.jvm.internal.o.g(appId, "appId");
            ((com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity) c17).f137318s = new f03.a();
        }
        zc.x c18 = wxaLiteAppWidgetAdapter.c();
        if (c18 != null) {
            zc.u uVar = new zc.u(wxaLiteAppWidgetAdapter);
            f03.a aVar2 = ((com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity) c18).f137318s;
            if (aVar2 != null) {
                aVar2.f258416a = uVar;
            }
        }
        java.lang.Object obj4 = wxaLiteAppWidgetAdapter.f45976r;
        if (obj4 instanceof io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference) {
            ((io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference) obj4).getLifecycle().a(wxaLiteAppWidgetAdapter);
        }
        java.lang.String checkGlobalPkg = com.tencent.mm.plugin.lite.LiteAppCenter.checkGlobalPkg(wxaLiteAppWidgetAdapter.f45982x);
        kotlin.jvm.internal.o.f(checkGlobalPkg, "checkGlobalPkg(...)");
        com.tencent.mm.plugin.lite.LiteAppCenter.showView(wxaLiteAppWidgetAdapter.f45968g, wxaLiteAppWidgetAdapter.f45969h, wxaLiteAppWidgetAdapter.f45970i, wxaLiteAppWidgetAdapter.f45971m, "", wxaLiteAppWidgetAdapter.f45972n, wxaLiteAppWidgetAdapter.f45973o, wxaLiteAppWidgetAdapter.f45966e, wxaLiteAppWidgetAdapter.f45965d, false, "", new java.lang.String[0], new java.lang.String[0], null, 0, checkGlobalPkg, "");
        this.f471313e.f471336o.put(new java.lang.Integer((int) this.f471314f), wxaLiteAppWidgetAdapter);
        return jz5.f0.f302826a;
    }
}
