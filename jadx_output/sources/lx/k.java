package lx;

/* loaded from: classes10.dex */
public final class k implements com.tencent.pigeon.biz.BizFinderPublishApi, com.tencent.pigeon.biz.BizFinderProfileApi, com.tencent.pigeon.biz.BizFinderVideoDetailApi, com.tencent.pigeon.biz.BizFinderRedDotNativeApi, com.tencent.pigeon.biz.BizFinderDataFetchApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f321822d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.biz.BizFinderFlutterApi f321823e;

    /* renamed from: f, reason: collision with root package name */
    public r45.lk2 f321824f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.feature.brandservice.flutter.model.FinderBizMeTabPlugin$feedDeleteListener$1 f321825g;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.feature.brandservice.flutter.model.FinderBizMeTabPlugin$feedDeleteListener$1] */
    public k() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f321825g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedDeleteEvent>(a0Var) { // from class: com.tencent.mm.feature.brandservice.flutter.model.FinderBizMeTabPlugin$feedDeleteListener$1
            {
                this.__eventId = -108499199;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent) {
                com.tencent.mm.autogen.events.FeedDeleteEvent event = feedDeleteEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new lx.e(event, lx.k.this));
                return false;
            }
        };
    }

    @Override // com.tencent.pigeon.biz.BizFinderDataFetchApi
    public void fetchFinderPersonalCenterData(java.lang.String username, yz5.l callback) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMeTabPlugin", "fetchFinderPersonalCenterData:".concat(username));
        if (username.length() == 0) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new bw5.bu().toByteArray())));
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        kotlinx.coroutines.l.d(((c61.l7) i95.n0.c(c61.l7.class)).U, null, null, new ya2.l1(new lx.f(this), null), 3, null);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.app.Activity activity = this.f321822d;
        lx.g gVar = new lx.g(callback);
        lx.h hVar = new lx.h(callback);
        com.tencent.mm.plugin.finder.assist.k8 k8Var = com.tencent.mm.plugin.finder.assist.k8.f102328a;
        java.lang.String selfUsername = g92.b.f269769e.U();
        ya2.k1 k1Var = new ya2.k1(gVar);
        kotlin.jvm.internal.o.g(selfUsername, "selfUsername");
        java.lang.String concat = "23-".concat(selfUsername);
        pq5.g l17 = new db2.a4(selfUsername, 23).l();
        if (activity != null) {
            l17.f((com.tencent.mm.ui.MMActivity) activity);
        }
        k8Var.a(l17, concat, k1Var, hVar);
        k8Var.b(concat);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321822d = binding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizFinderPublishApi.Companion companion = com.tencent.pigeon.biz.BizFinderPublishApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizFinderPublishApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        com.tencent.pigeon.biz.BizFinderProfileApi.Companion companion2 = com.tencent.pigeon.biz.BizFinderProfileApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizFinderProfileApi.Companion.setUp$default(companion2, binaryMessenger2, this, null, 4, null);
        com.tencent.pigeon.biz.BizFinderVideoDetailApi.Companion companion3 = com.tencent.pigeon.biz.BizFinderVideoDetailApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger3 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger3, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizFinderVideoDetailApi.Companion.setUp$default(companion3, binaryMessenger3, this, null, 4, null);
        com.tencent.pigeon.biz.BizFinderDataFetchApi.Companion companion4 = com.tencent.pigeon.biz.BizFinderDataFetchApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger4 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger4, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizFinderDataFetchApi.Companion.setUp$default(companion4, binaryMessenger4, this, null, 4, null);
        com.tencent.pigeon.biz.BizFinderRedDotNativeApi.Companion companion5 = com.tencent.pigeon.biz.BizFinderRedDotNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger5 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger5, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizFinderRedDotNativeApi.Companion.setUp$default(companion5, binaryMessenger5, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger6 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger6, "getBinaryMessenger(...)");
        this.f321823e = new com.tencent.pigeon.biz.BizFinderFlutterApi(binaryMessenger6, null, 2, null);
        alive();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.f321822d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f321822d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz.BizFinderPublishApi.Companion companion = com.tencent.pigeon.biz.BizFinderPublishApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizFinderPublishApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        com.tencent.pigeon.biz.BizFinderProfileApi.Companion companion2 = com.tencent.pigeon.biz.BizFinderProfileApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizFinderProfileApi.Companion.setUp$default(companion2, binaryMessenger2, null, null, 4, null);
        com.tencent.pigeon.biz.BizFinderVideoDetailApi.Companion companion3 = com.tencent.pigeon.biz.BizFinderVideoDetailApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger3 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger3, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizFinderVideoDetailApi.Companion.setUp$default(companion3, binaryMessenger3, null, null, 4, null);
        com.tencent.pigeon.biz.BizFinderDataFetchApi.Companion companion4 = com.tencent.pigeon.biz.BizFinderDataFetchApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger4 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger4, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizFinderDataFetchApi.Companion.setUp$default(companion4, binaryMessenger4, null, null, 4, null);
        com.tencent.pigeon.biz.BizFinderRedDotNativeApi.Companion companion5 = com.tencent.pigeon.biz.BizFinderRedDotNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger5 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger5, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizFinderRedDotNativeApi.Companion.setUp$default(companion5, binaryMessenger5, null, null, 4, null);
        this.f321823e = null;
        dead();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f321822d = binding.getActivity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0138, code lost:
    
        if (r11 != null) goto L56;
     */
    @Override // com.tencent.pigeon.biz.BizFinderProfileApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void openFinderProfileDetail(java.lang.String r25, yz5.l r26) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.k.openFinderProfileDetail(java.lang.String, yz5.l):void");
    }

    @Override // com.tencent.pigeon.biz.BizFinderRedDotNativeApi
    public void openFinderRedDot(java.lang.String tipsUuid) {
        r45.xs2 xs2Var;
        kotlin.jvm.internal.o.g(tipsUuid, "tipsUuid");
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.extension.reddot.jb B0 = zy2.fa.B0(((c61.l7) ((zy2.b6) c17)).nk(), "FinderPhotoCardEntry", tipsUuid, false, false, 12, null);
        com.tencent.mm.protobuf.g byteString = (B0 == null || (xs2Var = B0.N) == null) ? null : xs2Var.getByteString(11);
        i95.m c18 = i95.n0.c(zy2.ca.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.ca caVar = (zy2.ca) c18;
        lx.i iVar = lx.i.f321791d;
        if (byteString == null) {
            com.tencent.pigeon.biz.BizFinderFlutterApi bizFinderFlutterApi = this.f321823e;
            if (bizFinderFlutterApi != null) {
                bizFinderFlutterApi.clearFinderRedDot(iVar);
            }
            ((c61.t8) caVar).Ai(null, "FinderPhotoCardEntry");
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((c61.t8) caVar).Bi(context, byteString, "FinderPhotoCardEntry", null);
        com.tencent.pigeon.biz.BizFinderFlutterApi bizFinderFlutterApi2 = this.f321823e;
        if (bizFinderFlutterApi2 != null) {
            bizFinderFlutterApi2.clearFinderRedDot(iVar);
        }
    }

    @Override // com.tencent.pigeon.biz.BizFinderVideoDetailApi
    public void openVideoDetail(java.lang.String feedId, yz5.l callback) {
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMeTabPlugin", "openFinderProfileDetail:".concat(feedId));
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        android.content.Context context = this.f321822d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        long Z = pm0.v.Z(feedId);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
        intent.putExtra("feed_encrypted_object_id", Z);
        intent.putExtra("finder_username", g92.b.f269769e.U());
        intent.putExtra("KEY_FINDER_SELF_FLAG", true);
        intent.putExtra("key_from_biz_photo", true);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(13, 55, 8), intent);
        com.tencent.mars.xlog.Log.i("FinderRouterApi", "enterProfileTimelineFromBizPhoto ".concat(pm0.v.u(Z)));
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).lk(context, intent);
    }

    @Override // com.tencent.pigeon.biz.BizFinderPublishApi
    public void publishFinderLive(java.lang.String username) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMeTabPlugin", "publishFinderLive");
        android.app.Activity activity = this.f321822d;
        if (activity != null) {
            i95.m c17 = i95.n0.c(s40.w0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) c17)).dk(activity, new lx.j(this), false);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizMeTabPlugin", "activity null");
        }
    }

    @Override // com.tencent.pigeon.biz.BizFinderPublishApi
    public void publishFinderVideo(java.lang.String username, yz5.l callback) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMeTabPlugin", "publishFinderVideo ".concat(username));
        android.app.Activity activity = this.f321822d;
        r45.lk2 lk2Var = this.f321824f;
        if (activity == null || lk2Var == null) {
            return;
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1.f460472a.H(activity, username, lk2Var);
    }
}
