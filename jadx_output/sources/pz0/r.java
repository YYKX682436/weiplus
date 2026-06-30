package pz0;

/* loaded from: classes10.dex */
public final class r implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.mj_template.HostPageLaunch, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public final uy0.f f359160d;

    /* renamed from: e, reason: collision with root package name */
    public final ez0.i f359161e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f359162f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.plugin.common.PluginRegistry.ActivityResultListener f359163g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.mj_template.report.MaasPageFinderReporter f359164h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f359165i;

    public r(uy0.f finderApi, ez0.i plugin) {
        kotlin.jvm.internal.o.g(finderApi, "finderApi");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f359160d = finderApi;
        this.f359161e = plugin;
        this.f359165i = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    @Override // com.tencent.pigeon.mj_template.HostPageLaunch
    public long getMaasVersion() {
        return 2008004L;
    }

    @Override // com.tencent.pigeon.mj_template.HostPageLaunch
    public void getResourceList(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "getResourceList");
        kotlinx.coroutines.l.d(this.f359165i, null, null, new pz0.n(callback, null), 3, null);
    }

    @Override // com.tencent.pigeon.mj_template.HostPageLaunch
    public long getWeVisionVersion() {
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        return tq5.i.f421269a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    @Override // com.tencent.pigeon.mj_template.HostPageLaunch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void launchAlbum(com.tencent.pigeon.mj_template.AlbumRequest r12, yz5.l r13) {
        /*
            r11 = this;
            java.lang.String r0 = "request"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.o.g(r13, r0)
            android.app.Activity r0 = r11.f359162f
            java.lang.String r1 = "MicroMsg.MJTemplateApiFlutterPlugin"
            if (r0 != 0) goto L2e
            java.lang.String r12 = "activity is null"
            com.tencent.mars.xlog.Log.e(r1, r12)
            kotlin.Result$Companion r12 = kotlin.Result.INSTANCE
            java.lang.Throwable r12 = new java.lang.Throwable
            java.lang.String r0 = "activity not attached"
            r12.<init>(r0)
            java.lang.Object r12 = kotlin.ResultKt.createFailure(r12)
            java.lang.Object r12 = kotlin.Result.m521constructorimpl(r12)
            kotlin.Result r12 = kotlin.Result.m520boximpl(r12)
            r13.invoke(r12)
            return
        L2e:
            r45.rz6 r2 = new r45.rz6
            r2.<init>()
            byte[] r3 = r12.getBuffer()     // Catch: java.lang.Exception -> L3b
            r2.parseFrom(r3)     // Catch: java.lang.Exception -> L3b
            goto L45
        L3b:
            r3 = move-exception
            java.lang.String r4 = "parse template info error"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.tencent.mars.xlog.Log.e(r1, r4, r3)
        L45:
            az0.i5 r5 = az0.i5.f15557a
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 7
            r10 = 0
            az0.i5.s(r5, r6, r7, r8, r9, r10)
            nz0.o r1 = nz0.o.f341530a
            java.lang.String r3 = r2.f385320d
            java.lang.String r4 = ""
            if (r3 != 0) goto L58
            r3 = r4
        L58:
            r5 = 2
            r1.e(r3, r5)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            com.tencent.mm.mj_template.api.MJTemplateSession r3 = new com.tencent.mm.mj_template.api.MJTemplateSession
            byte[] r12 = r12.getBuffer()
            r3.<init>(r12, r4)
            java.lang.String r12 = "mj_template_session"
            r1.putExtra(r12, r3)
            r45.b70 r12 = r2.f385323g
            r3 = 0
            if (r12 == 0) goto L77
            java.lang.String r12 = r12.f370584f
            goto L78
        L77:
            r12 = r3
        L78:
            java.lang.String r4 = "album_footer_info_str"
            r1.putExtra(r4, r12)
            r45.e7 r12 = r2.f385325i
            r4 = 0
            r5 = 1
            if (r12 == 0) goto L9c
            int r12 = r12.f373061e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            int r6 = r12.intValue()
            if (r6 <= 0) goto L91
            r6 = r5
            goto L92
        L91:
            r6 = r4
        L92:
            if (r6 == 0) goto L95
            r3 = r12
        L95:
            if (r3 == 0) goto L9c
            int r12 = r3.intValue()
            goto L9e
        L9c:
            r12 = 20
        L9e:
            java.lang.String r3 = "max_select_count"
            r1.putExtra(r3, r12)
            r45.e7 r12 = r2.f385325i
            if (r12 == 0) goto La9
            int r4 = r12.f373060d
        La9:
            java.lang.String r12 = "min_select_count"
            r1.putExtra(r12, r4)
            uy0.f r12 = r11.f359160d
            r12.a(r0, r5, r1)
            pz0.o r12 = new pz0.o
            r12.<init>(r13, r11)
            r11.f359163g = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pz0.r.launchAlbum(com.tencent.pigeon.mj_template.AlbumRequest, yz5.l):void");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding p07) {
        androidx.lifecycle.o mo133getLifecycle;
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "onAttachedToActivity");
        this.f359162f = p07.getActivity();
        p07.addActivityResultListener(new pz0.p(this));
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        android.app.Activity activity = this.f359162f;
        android.content.Intent intent2 = activity != null ? activity.getIntent() : null;
        if (intent2 == null) {
            intent2 = new android.content.Intent();
        }
        com.tencent.mm.mj_template.report.MaasPageFinderReporter maasPageFinderReporter = new com.tencent.mm.mj_template.report.MaasPageFinderReporter(Ri, 134, "square_feed_template", intent2);
        android.app.Activity activity2 = this.f359162f;
        long j17 = 0;
        if (activity2 != null && (intent = activity2.getIntent()) != null) {
            j17 = intent.getLongExtra("key_topic_id", 0L);
        }
        maasPageFinderReporter.a("activityid", j17);
        this.f359164h = maasPageFinderReporter;
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f359162f;
        androidx.lifecycle.y yVar = componentCallbacks2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) componentCallbacks2 : null;
        if (yVar == null || (mo133getLifecycle = yVar.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(maasPageFinderReporter);
        mo133getLifecycle.a(new androidx.lifecycle.x() { // from class: com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin$onAttachedToActivity$2$1
            @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
            public final void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                az0.i5.x(az0.i5.f15557a, false, false, 3, null);
            }
        });
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "onAttachedToEngine");
        com.tencent.pigeon.mj_template.HostPageLaunch.Companion companion = com.tencent.pigeon.mj_template.HostPageLaunch.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mj_template.HostPageLaunch.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "onDetachedFromActivity");
        this.f359162f = null;
        this.f359164h = null;
        ez0.i iVar = this.f359161e;
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginMJTemplate", "enter destroyEngine");
        iVar.f257806d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mars.xlog.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "onDetachedFromEngine");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // com.tencent.pigeon.mj_template.HostPageLaunch
    public void reportTemplateListItemClicked(java.lang.String templateId) {
        kotlin.jvm.internal.o.g(templateId, "templateId");
        if (kotlin.jvm.internal.o.b(templateId, "empty_id")) {
            com.tencent.mm.mj_template.report.MaasPageFinderReporter maasPageFinderReporter = this.f359164h;
            if (maasPageFinderReporter != null) {
                maasPageFinderReporter.d(templateId, "no_template1");
                return;
            }
            return;
        }
        com.tencent.mm.mj_template.report.MaasPageFinderReporter maasPageFinderReporter2 = this.f359164h;
        if (maasPageFinderReporter2 != null) {
            maasPageFinderReporter2.d(templateId, maasPageFinderReporter2.f69807f);
        }
    }

    @Override // com.tencent.pigeon.mj_template.HostPageLaunch
    public void reportTemplateListItemExposed(java.lang.String templateId) {
        com.tencent.mm.mj_template.report.MaasPageFinderReporter maasPageFinderReporter;
        kotlin.jvm.internal.o.g(templateId, "templateId");
        if (kotlin.jvm.internal.o.b(templateId, "empty_id") || (maasPageFinderReporter = this.f359164h) == null) {
            return;
        }
        maasPageFinderReporter.c(templateId, false, maasPageFinderReporter.f69807f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    @Override // com.tencent.pigeon.mj_template.HostPageLaunch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void requestMusicPost(com.tencent.pigeon.mj_template.MusicPostRequest r10, yz5.l r11) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pz0.r.requestMusicPost(com.tencent.pigeon.mj_template.MusicPostRequest, yz5.l):void");
    }
}
