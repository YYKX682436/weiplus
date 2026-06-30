package vm1;

/* loaded from: classes11.dex */
public final class x0 implements com.tencent.pigeon.ting.TingNativeController, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.plugin.common.PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f438068d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f438069e;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel.EventSink f438071g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.OrientationEventListener f438072h;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f438074m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f438075n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f438076o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f438077p;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f438070f = jz5.h.b(vm1.m0.f438030d);

    /* renamed from: i, reason: collision with root package name */
    public final int f438073i = 3004;

    public final android.content.Context a() {
        android.app.Activity activity = this.f438069e;
        if (activity != null) {
            return activity;
        }
        android.content.Context context = this.f438068d;
        if (context != null) {
            return context;
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        return context2;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void addOrRevertBlackList(byte[] tingBypassBuffer, boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(tingBypassBuffer, "tingBypassBuffer");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.protobuf.g h17 = pm0.b0.h(tingBypassBuffer);
        if (h17 != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.y.f280114e.s(h17, z17, new vm1.q(callback));
        }
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void addToStar(byte[] listenItemData, long j17, boolean z17, boolean z18, com.tencent.pigeon.ting.TingStarSnapInfo tingStarSnapInfo, boolean z19) {
        kotlin.jvm.internal.o.g(listenItemData, "listenItemData");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void allowRotate(boolean z17) {
        com.tencent.mm.plugin.audio.BizAudioFlutterActivity bizAudioFlutterActivity;
        if (z17) {
            com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "allow rotate");
            android.app.Activity activity = this.f438069e;
            bizAudioFlutterActivity = activity instanceof com.tencent.mm.plugin.audio.BizAudioFlutterActivity ? (com.tencent.mm.plugin.audio.BizAudioFlutterActivity) activity : null;
            if (bizAudioFlutterActivity != null) {
                bizAudioFlutterActivity.setRequestedOrientation(4);
            }
            int i17 = com.tencent.mm.plugin.audio.BizAudioFlutterActivity.f92465x;
            com.tencent.mm.plugin.audio.BizAudioFlutterActivity.f92465x = 4;
            this.f438077p = true;
            return;
        }
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "disallow rotate");
        android.app.Activity activity2 = this.f438069e;
        bizAudioFlutterActivity = activity2 instanceof com.tencent.mm.plugin.audio.BizAudioFlutterActivity ? (com.tencent.mm.plugin.audio.BizAudioFlutterActivity) activity2 : null;
        if (bizAudioFlutterActivity != null) {
            bizAudioFlutterActivity.setRequestedOrientation(1);
        }
        int i18 = com.tencent.mm.plugin.audio.BizAudioFlutterActivity.f92465x;
        com.tencent.mm.plugin.audio.BizAudioFlutterActivity.f92465x = 1;
        this.f438077p = false;
    }

    public final wm1.h b() {
        return (wm1.h) ((jz5.n) this.f438070f).getValue();
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void buyWCCoin(byte[] param, yz5.l callback) {
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(callback, "callback");
        bw5.bp0 parseFrom = new bw5.bp0().parseFrom(param);
        js4.n nVar = new js4.n();
        nVar.f301544b = parseFrom.f25782d;
        nVar.f301543a = parseFrom.f25783e;
        nVar.f301549g = js4.m.COMMON_CHARGE;
        nVar.f301555m = true;
        nVar.f301546d = new vm1.r(callback);
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d((androidx.fragment.app.FragmentActivity) a(), nVar);
    }

    public final void c(java.lang.String str, java.lang.String str2, android.content.Intent intent) {
        android.content.Context context = this.f438069e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vm1.w0(context, str, str2, intent, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public boolean canShowHandOffOpenCommandItem(byte[] tingItemData) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        bw5.v70 d17 = new bw5.lp0().parseFrom(tingItemData).d();
        if (!il4.l.i(d17 != null ? d17.f34189e : 0)) {
            com.tencent.mars.xlog.Log.e("FlutterBizAudioInteractPlugin", "canShowHandOffOpenCommandItem not file type");
        }
        return false;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void consumeWCCoin(byte[] param, yz5.l callback) {
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(callback, "callback");
        bw5.ep0 parseFrom = new bw5.ep0().parseFrom(param);
        pr4.l lVar = new pr4.l(parseFrom.f26985d, (androidx.fragment.app.FragmentActivity) a(), new vm1.s(callback), new vm1.t(callback), new vm1.u(callback));
        lVar.f358026g = (parseFrom.f26993o[2] ? parseFrom.f26986e : com.tencent.mm.protobuf.g.f192155b).g();
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
        new ls4.u(lVar).f();
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void containsInStar(java.util.List listenId, boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(listenId, "listenId");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public boolean deleteFavBySourceId(java.lang.String sourceId) {
        kotlin.jvm.internal.o.g(sourceId, "sourceId");
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        ((a82.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).mj()).T6(sourceId, "", null);
        return true;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void destroyAndReopenTingMiniProgram(long j17) {
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "destroyAndReopenTingMiniProgram scene: " + j17);
        com.tencent.mm.plugin.audio.BizAudioFlutterActivity bizAudioFlutterActivity = ((bv.f) ((rv.i2) i95.n0.c(rv.i2.class))).f24645d;
        java.lang.Boolean valueOf = bizAudioFlutterActivity != null ? java.lang.Boolean.valueOf(bizAudioFlutterActivity.isPaused()) : null;
        bv.f fVar = (bv.f) ((rv.i2) i95.n0.c(rv.i2.class));
        com.tencent.mm.plugin.audio.BizAudioFlutterActivity bizAudioFlutterActivity2 = fVar.f24645d;
        if (bizAudioFlutterActivity2 != null) {
            bizAudioFlutterActivity2.finish();
        }
        fVar.wi(null);
        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).u(new vm1.w(valueOf, j17));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void followBrandAccount(java.lang.String username, boolean z17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, yz5.l callback) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "followBrandAccount, username:" + username + "， scene:" + j17 + ", sceneNote:" + str2 + ", isCancel:" + z17);
        if (z17) {
            ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).getClass();
            ((qv.e) ((rv.m2) i95.n0.c(rv.m2.class))).wi(r01.z.b(username), this.f438069e, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true), false);
            return;
        }
        o25.a aVar = new o25.a();
        aVar.f342463a = str;
        aVar.f342465c = str2;
        aVar.f342466d = str3;
        aVar.f342469g = false;
        com.tencent.mm.sdk.platformtools.u3.h(new vm1.x(((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).wi(a(), username, (int) j17, new vm1.y(callback), aVar)));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void followFinderAccount(java.lang.String username, boolean z17, byte[] bArr, long j17, java.lang.String str, yz5.l callback) {
        int i17;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (bArr != null) {
            try {
                new bw5.lp0().parseFrom(bArr);
                i17 = 15;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("FlutterBizAudioInteractPlugin", "doFollowFinder exp=" + e17);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
                return;
            }
        } else {
            i17 = 0;
        }
        int i18 = i17;
        zy2.e6 e6Var = (zy2.e6) i95.n0.c(zy2.e6.class);
        int i19 = z17 ? 2 : 1;
        java.lang.Long l17 = 0L;
        int i27 = (int) j17;
        com.tencent.mm.plugin.finder.service.s1 s1Var = (com.tencent.mm.plugin.finder.service.s1) e6Var;
        s1Var.getClass();
        s1Var.Di(username, i19, l17.longValue(), false, i27, i18, i27, str);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public com.tencent.pigeon.ting.ThirdAppInfo get3rdAppInfo(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        if (appId.length() == 0) {
            return null;
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(appId);
        if (h17 == null) {
            return null;
        }
        java.lang.String str = h17.field_appName;
        com.tencent.pigeon.ting.ThirdAppInfo thirdAppInfo = new com.tencent.pigeon.ting.ThirdAppInfo(appId, str == null ? "" : str, null, null, null, 28, null);
        android.graphics.Bitmap Di = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Di(appId, 1, i65.a.g(a()));
        if (Di == null) {
            java.lang.String str2 = h17.field_appIconUrl;
            return com.tencent.pigeon.ting.ThirdAppInfo.copy$default(thirdAppInfo, null, null, str2 == null ? "" : str2, null, null, 27, null);
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        Di.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "recycle bitmap:%s", Di);
        Di.recycle();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        try {
            byteArrayOutputStream.close();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FlutterBizAudioInteractPlugin", e17, "", new java.lang.Object[0]);
        }
        return com.tencent.pigeon.ting.ThirdAppInfo.copy$default(thirdAppInfo, null, null, null, byteArray, byteArray, 7, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void get3rdAppInfoAsync(java.lang.String appId, yz5.l callback) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public com.tencent.pigeon.ting.TingBrandContactInfo getBrandContactInfo(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
        return new com.tencent.pigeon.ting.TingBrandContactInfo(username, java.lang.Boolean.valueOf(n17 != null && n17.r2()));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public com.tencent.pigeon.ting.TingUserContactInfo getContactInfo(java.lang.String username) {
        com.tencent.mm.modelavatar.s0 Ni;
        com.tencent.mm.modelavatar.r0 n07;
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String str = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(username)) {
            return null;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(username);
        if (((kv.a0) i95.n0.c(kv.a0.class)) != null && (Ni = com.tencent.mm.modelavatar.d1.Ni()) != null && (n07 = Ni.n0(username)) != null) {
            str = n07.d();
        }
        return new com.tencent.pigeon.ting.TingUserContactInfo(username, e17, str, null, 8, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public java.util.List getContactInfoFromHash(java.util.List hashusernames) {
        kotlin.jvm.internal.o.g(hashusernames, "hashusernames");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = hashusernames.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            n73.e eVar = (n73.e) i95.n0.c(n73.e.class);
            com.tencent.mm.storage.z3 wi6 = eVar != null ? ((m73.q) eVar).wi(str, 2) : null;
            if (wi6 != null) {
                arrayList.add(new com.tencent.pigeon.ting.TingUserContactInfo(wi6.d1(), wi6.P0(), null, str, 4, null));
            }
        }
        return arrayList;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void getContactInfoFromHashAsync(java.util.List hashUsernames, yz5.l callback) {
        kotlin.jvm.internal.o.g(hashUsernames, "hashUsernames");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public com.tencent.pigeon.ting.TingFinderContactInfo getFinderAccountInfo() {
        java.lang.String Ui = ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(a());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.b2 b17 = ya2.h.f460484a.b(Ui);
        java.lang.String w07 = b17 != null ? b17.w0() : null;
        java.lang.String str = w07 == null ? "" : w07;
        java.lang.String avatarUrl = b17 != null ? b17.getAvatarUrl() : null;
        if (avatarUrl == null) {
            avatarUrl = "";
        }
        com.tencent.pigeon.ting.TingFinderContactInfo tingFinderContactInfo = new com.tencent.pigeon.ting.TingFinderContactInfo(Ui, str, avatarUrl, null, 8, null);
        java.lang.String username = tingFinderContactInfo.getUsername();
        if (username == null || r26.n0.N(username)) {
            return null;
        }
        return tingFinderContactInfo;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void getFinderContactInfo(java.lang.String userName, yz5.l callback) {
        java.lang.String str;
        java.lang.String headUrl;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.protocal.protobuf.FinderContact Rj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Rj(userName);
        boolean z17 = false;
        if (Rj != null) {
            int followFlag = Rj.getFollowFlag();
            l75.e0 e0Var = ya2.b2.O2;
            if (followFlag == ya2.b2.Q2) {
                z17 = true;
            }
        }
        java.lang.String str2 = "";
        if (Rj == null || (str = Rj.getNickname()) == null) {
            str = "";
        }
        if (Rj != null && (headUrl = Rj.getHeadUrl()) != null) {
            str2 = headUrl;
        }
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.TingFinderContactInfo(userName, str, str2, java.lang.Boolean.valueOf(z17)))));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public long getIdentityType() {
        return 2L;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public com.tencent.pigeon.ting.TingPoiInfo getPoiInfo() {
        return new com.tencent.pigeon.ting.TingPoiInfo(null, null, null, null, 15, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void getWCCoinBalance(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).b(new vm1.z(callback));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public java.lang.String getWxUsername() {
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        return r17;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void goToCreateFinderAccount(java.lang.String str, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f438074m = callback;
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        android.content.Context a17 = a();
        if (str == null) {
            str = "";
        }
        ((c61.l7) b6Var).Zi(a17, str, this.f438073i);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void goToLiteApp(java.lang.String appId, java.lang.String path, java.lang.String query) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(query, "query");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void goToMusicChatroom(java.lang.String categoryId) {
        kotlin.jvm.internal.o.g(categoryId, "categoryId");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void goToProfile(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        android.content.Context context = this.f438069e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vm1.a0(userName, context, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void goToQQMusicPayment(java.lang.String appId, java.lang.String mid) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(mid, "mid");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void goToShakeViewController() {
        ((c34.b0) ((yd0.j) i95.n0.c(yd0.j.class))).wi(a(), new android.content.Intent(), true);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void goToWebPage(java.lang.String url, long j17) {
        kotlin.jvm.internal.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("convertActivityFromTranslucent", true);
        c("webview", ".ui.tools.WebViewUI", intent);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoAppInstallPage(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoBusinessAccountProfile(java.lang.String userName, long j17, java.lang.String str) {
        kotlin.jvm.internal.o.g(userName, "userName");
        if (userName.length() == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "gotoBusinessAccountProfile, userName:" + userName + ", scene:" + j17 + ", sceneNote:" + str);
        android.content.Context context = this.f438069e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vm1.b0(userName, j17, str, context, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoBusinessArticle(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("forceHideShare", true);
        android.content.Intent putExtra = intent.putExtra("convertActivityFromTranslucent", true);
        kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
        c("webview", ".ui.tools.WebViewUI", putExtra);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoFinderAccountProfile(java.lang.String userName, long j17, long j18, java.lang.String str, long j19) {
        kotlin.jvm.internal.o.g(userName, "userName");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoFinderAccountProfileHalfPage(java.lang.String username, long j17, long j18, java.lang.String str, long j19) {
        kotlin.jvm.internal.o.g(username, "username");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoFinderDetail(java.lang.String tid, java.lang.String nonceId, boolean z17, java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(tid, "tid");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        gotoFinderDetailWithStartTime(tid, nonceId, z17, sessionId, 0L);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoFinderDetailWithStartTime(java.lang.String tid, java.lang.String nonceId, boolean z17, java.lang.String sessionId, long j17) {
        kotlin.jvm.internal.o.g(tid, "tid");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        android.content.Context context = this.f438069e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vm1.c0(context, tid, nonceId, z17, sessionId, j17, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoFinderFeed(java.lang.String tid, java.lang.String nonceId, java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(tid, "tid");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "gotoFinderFeed tid: " + tid + ", nonceId: " + nonceId + ", sessionId: " + sessionId);
        android.content.Context context = this.f438069e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vm1.d0(tid, nonceId, context, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoFinderLive(java.lang.String tid, java.lang.String nonceId) {
        kotlin.jvm.internal.o.g(tid, "tid");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        android.content.Context context = this.f438069e;
        if (context == null) {
            context = a();
        }
        android.content.Context context2 = context;
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        r45.m84 m84Var = new r45.m84();
        m84Var.set(0, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.q0(tid, 0L)));
        m84Var.set(2, nonceId);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        ((vd2.f1) e0Var).Ri(context2, null, m84Var, true, wk0Var, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoFinderMyProfileAudioTab(com.tencent.pigeon.ting.TingFinderContactInfo tingFinderContactInfo) {
        if (tingFinderContactInfo == null) {
            com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "gotoFinderMyProfileAudioTab contactInfo is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "gotoFinderMyProfileAudioTab userName:" + tingFinderContactInfo.getUsername());
        android.content.Context context = this.f438069e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vm1.e0(context, tingFinderContactInfo, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoTingSettingPage() {
        c("setting", ".ui.setting.SettingsMusicUI", new android.content.Intent());
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public boolean hasAddedInFavDB(java.lang.String sourceId) {
        kotlin.jvm.internal.o.g(sourceId, "sourceId");
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        return ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().rc(sourceId) != null;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void hybridOpenAudioMine() {
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void inPlayer(boolean z17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0071 A[RETURN] */
    @Override // com.tencent.pigeon.ting.TingNativeController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isAppInstalled(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "appId"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "scheme"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isAppInstalled appId: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = ", scheme: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FlutterBizAudioInteractPlugin"
            com.tencent.mars.xlog.Log.i(r1, r0)
            int r0 = r7.length()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L2f
            r0 = r2
            goto L30
        L2f:
            r0 = r3
        L30:
            if (r0 == 0) goto L34
        L32:
            r7 = r3
            goto L5e
        L34:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L55
            java.lang.String r4 = "android.intent.action.VIEW"
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L55
            r0.<init>(r4, r7)     // Catch: java.lang.Throwable -> L55
            android.content.Context r7 = r5.a()     // Catch: java.lang.Throwable -> L55
            java.util.List r7 = com.tencent.mm.sdk.platformtools.t8.w1(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L52
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L55
            if (r7 == 0) goto L50
            goto L52
        L50:
            r7 = r3
            goto L53
        L52:
            r7 = r2
        L53:
            r7 = r7 ^ r2
            goto L5e
        L55:
            r7 = move-exception
            java.lang.String r0 = "isAppInstalled exception"
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r7, r0, r4)
            goto L32
        L5e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "isAppInstalled ret: "
            r0.<init>(r4)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r1, r0)
            if (r7 == 0) goto L72
            return r7
        L72:
            java.lang.Class<lt.i0> r7 = lt.i0.class
            i95.m r7 = i95.n0.c(r7)
            lt.i0 r7 = (lt.i0) r7
            kt.c r7 = (kt.c) r7
            r7.getClass()
            com.tencent.mm.pluginsdk.model.app.m r7 = com.tencent.mm.pluginsdk.model.app.w.h(r6)
            if (r7 == 0) goto L88
            java.lang.String r7 = r7.field_packageName
            goto L89
        L88:
            r7 = 0
        L89:
            if (r7 != 0) goto L8d
            java.lang.String r7 = ""
        L8d:
            java.lang.String r0 = "isAppInstalled packageName: "
            java.lang.String r0 = r0.concat(r7)
            com.tencent.mars.xlog.Log.i(r1, r0)
            int r0 = r7.length()
            if (r0 <= 0) goto L9e
            r0 = r2
            goto L9f
        L9e:
            r0 = r3
        L9f:
            if (r0 == 0) goto Lac
            android.content.Context r0 = r5.a()
            boolean r7 = com.tencent.mm.pluginsdk.model.app.j1.f(r0, r7)
            if (r7 == 0) goto Lac
            return r2
        Lac:
            java.lang.String r7 = "isAppInstalled not install, appId: "
            java.lang.String r6 = r7.concat(r6)
            com.tencent.mars.xlog.Log.w(r1, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vm1.x0.isAppInstalled(java.lang.String, java.lang.String):boolean");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void launchApplication(java.lang.String appId, java.lang.String scheme) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(scheme, "scheme");
        try {
            com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "launchApplication appId: " + appId + ", scheme: " + scheme);
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(a(), new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(scheme)), ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(a(), appId), 2, new vm1.f0(), null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FlutterBizAudioInteractPlugin", th6, "launchApplication exception", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void launchApplicationWithUrl(java.lang.String appId, java.lang.String scheme, java.lang.String url, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(scheme, "scheme");
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "launchApplicationWithUrl appId: " + appId + ", scheme: " + scheme);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(a(), new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(scheme)), ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(a(), appId), 2, new vm1.g0(z17, this, appId, url), null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void markPlayTaskInFullScreenPlayerMode() {
        rk4.k8 k8Var = (rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        k8Var.N(true);
        k8Var.L(true);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19 = this.f438073i;
        if (i17 == i19) {
            com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "onActivityResult createFinderRequestCode req is " + i19 + " result is " + i18, "FlutterTingInteractPlugin onActivityResult");
            if (i18 == 1) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult createFinderRequestCode ");
                sb6.append(intent != null ? intent.getStringExtra("KEY_FINDER_USERNAME_SELF") : null);
                com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", sb6.toString(), "FlutterTingInteractPlugin onActivityResult");
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("KEY_FINDER_USERNAME_SELF") : null;
                yz5.l lVar = this.f438074m;
                if (lVar != null) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.TingFinderContactInfo(stringExtra, null, null, null, 14, null))));
                }
            } else {
                yz5.l lVar2 = this.f438074m;
                if (lVar2 != null) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    lVar2.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("createOver")))));
                }
            }
        }
        if (!(this.f438069e instanceof com.tencent.mm.plugin.audio.BizAudioFlutterActivity)) {
            return false;
        }
        if (i17 == 1001) {
            if (i18 == -1) {
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
                if (!(stringArrayListExtra == null || stringArrayListExtra.isEmpty())) {
                    com.tencent.mm.sdk.platformtools.t8.c1(stringArrayListExtra, ";");
                }
            }
            return true;
        }
        if (i17 == 1004 || i17 == 1006 || i17 == 1007) {
            return true;
        }
        if (i17 == 1002) {
            if (i18 == -1) {
                dp.a.makeText(a(), a().getResources().getString(com.tencent.mm.R.string.j3v), 0).show();
            }
            return true;
        }
        if (i17 == 1005) {
            if (i18 == -1) {
                dp.a.makeText(a(), a().getResources().getString(com.tencent.mm.R.string.j3v), 0).show();
            }
            return true;
        }
        if (i17 == 1003) {
            return true;
        }
        if (i17 == 2) {
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            android.app.Activity activity = this.f438069e;
            ((ht.a) vVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.f.f(activity, i17, i18, intent, true, com.tencent.mm.R.string.brq, com.tencent.mm.R.string.brr, 15);
        }
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "onAttachedToActivity");
        this.f438069e = binding.getActivity();
        binding.addActivityResultListener(this);
        if (this.f438069e instanceof com.tencent.mm.plugin.audio.BizAudioFlutterActivity) {
            allowRotate(this.f438077p);
        }
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347326w);
        vm1.h0 h0Var = new vm1.h0(this, a());
        this.f438072h = h0Var;
        h0Var.enable();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f438068d = p07.getApplicationContext();
        com.tencent.pigeon.ting.TingNativeController.Companion companion = com.tencent.pigeon.ting.TingNativeController.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingNativeController.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        new com.tencent.pigeon.ting.TingMusicBottomSheetUtils(binaryMessenger2, null, 2, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger3 = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger3, "getBinaryMessenger(...)");
        new com.tencent.pigeon.ting.TingLaterListenChannel(binaryMessenger3, null, 2, null);
        new io.flutter.plugin.common.EventChannel(p07.getBinaryMessenger(), "ting_ugc_voice_input/event").setStreamHandler(new vm1.i0(this));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void onCommonHalfScreenGoDetailClick(java.lang.String identifier) {
        kotlin.jvm.internal.o.g(identifier, "identifier");
        if (kotlin.jvm.internal.o.b(identifier, "thumb_like_education")) {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.content.Context context = this.f438069e;
            if (context == null) {
                context = a();
            }
            qk.f9.e(aj6, context, bw5.ar0.TingScene_FinderDetailPage, null, 0, null, null, 52, null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "onDetachedFromActivity");
        this.f438069e = null;
        android.view.OrientationEventListener orientationEventListener = this.f438072h;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f438072h = null;
        zg0.c3 c3Var = (zg0.c3) i95.n0.c(zg0.c3.class);
        if (c3Var != null) {
            ((yg0.u3) c3Var).wi();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f438069e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.TingNativeController.Companion companion = com.tencent.pigeon.ting.TingNativeController.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingNativeController.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void onPlayerAction(byte[] itemData, long j17) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
        new bw5.lp0().parseFrom(itemData);
        if (j17 != com.tencent.pigeon.ting.PlayerAction.PRE.ordinal()) {
            com.tencent.pigeon.ting.PlayerAction.NEXT.ordinal();
        }
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void onPlayerLike(byte[] itemData, boolean z17) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f438069e = binding.getActivity();
        binding.addActivityResultListener(this);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void onTingCommonEvent(long j17, java.util.Map map) {
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void open3rdAppWithTingItem(java.lang.String appId, byte[] itemData, long j17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(itemData, "itemData");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void openAD(byte[] adSchemeInfo, long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(adSchemeInfo, "adSchemeInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void openByOtherApp(byte[] tingItemData) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void openFinderAudioMinePage() {
        ((wy2.g) ((o40.e) i95.n0.c(o40.e.class))).Ni(a());
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void openLiteApp(long j17, java.lang.String appId, java.lang.String path, java.lang.String query, java.lang.String str, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(query, "query");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", appId);
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, path);
        bundle.putString("query", query);
        bundle.putBoolean("isHalfScreen", j17 == 2);
        bundle.putString("minVersion", str);
        if (z17) {
            bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, z17);
            bundle.putBoolean("forbidRightGesture", true);
            bundle.putInt("nextAnimIn", com.tencent.mm.R.anim.f477879e3);
            bundle.putInt("currentAnimOut", com.tencent.mm.R.anim.f477877e1);
        }
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "gotoLiteApp appId: " + appId + ", liteAppType:" + j17 + ", path: " + path + " query: " + query);
        ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).aj(appId);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(a(), bundle, true, false, new vm1.j0(this));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void openWeApp(java.lang.String appId, java.lang.String path, long j17, java.lang.String sceneNote, boolean z17, long j18) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(sceneNote, "sceneNote");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new vm1.k0(appId, path, j17, sceneNote, z17, j18, this, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void openWebPage(java.lang.String url, com.tencent.pigeon.ting.OpenWebPageInfo openInfo) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(openInfo, "openInfo");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("convertActivityFromTranslucent", true);
        intent.putExtra("hide_option_menu", openInfo.getHideOptionMenu());
        c("webview", ".ui.tools.WebViewUI", intent);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void preloadMiniProgram(long j17, long j18) {
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void prepareLiteApp(long j17, java.lang.String appId, java.lang.String page, java.lang.String query) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(query, "query");
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).sj(7, null);
        if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Bj(appId) == null) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).cj(appId, null);
        }
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void quickShareCategoryItem(byte[] itemData, java.lang.String userName) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
        kotlin.jvm.internal.o.g(userName, "userName");
        if (this.f438069e == null) {
            return;
        }
        bw5.o50 parseFrom = new bw5.o50().parseFrom(itemData);
        wm1.h b17 = b();
        kotlin.jvm.internal.o.d(parseFrom);
        android.app.Activity activity = this.f438069e;
        kotlin.jvm.internal.o.d(activity);
        b17.getClass();
        java.lang.String b18 = b17.b(parseFrom);
        if (b18 == null) {
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        oe5.b bVar = new oe5.b();
        l15.c cVar = new l15.c();
        cVar.fromXml(b18);
        bVar.l(cVar);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        wm1.a aVar = new wm1.a(userName, parseFrom, b18, activity);
        n13.t tVar = new n13.t();
        tVar.f334133a = aVar;
        ((dk5.y) a0Var).wi(activity, bVar, userName, tVar);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void quickShareTingItem(byte[] tingItemData, java.lang.String userName) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        kotlin.jvm.internal.o.g(userName, "userName");
        if (this.f438069e == null) {
            return;
        }
        bw5.lp0 parseFrom = new bw5.lp0().parseFrom(tingItemData);
        wm1.h b17 = b();
        kotlin.jvm.internal.o.d(parseFrom);
        android.app.Activity activity = this.f438069e;
        kotlin.jvm.internal.o.d(activity);
        b17.getClass();
        java.lang.String d17 = b17.d(parseFrom);
        if (d17 == null) {
            return;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        oe5.c cVar = new oe5.c();
        l15.c cVar2 = new l15.c();
        cVar2.fromXml(d17);
        cVar.l(cVar2);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        wm1.g gVar = new wm1.g(userName, parseFrom, d17, activity);
        n13.t tVar = new n13.t();
        tVar.f334133a = gVar;
        ((dk5.y) a0Var).wi(activity, cVar, userName, tVar);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void saveLocalFile(byte[] tingItemData) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        bw5.lp0 parseFrom = new bw5.lp0().parseFrom(tingItemData);
        bw5.v70 d17 = parseFrom.d();
        if (!il4.l.i(d17 != null ? d17.f34189e : 0)) {
            com.tencent.mars.xlog.Log.e("FlutterBizAudioInteractPlugin", "saveLocalFile not file type and ignore");
            return;
        }
        java.lang.String filePath = parseFrom.d().i().getFilePath();
        if (filePath == null) {
            filePath = "";
        }
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "saveLocalFile filePath: " + filePath + ", title: " + rk4.j5.j(parseFrom));
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context a17 = a();
        bw5.l80 i17 = parseFrom.d().i();
        java.lang.String b17 = i17 != null ? i17.b() : null;
        java.lang.String str = b17 != null ? b17 : "";
        vm1.l0 l0Var = new vm1.l0(this);
        ((yb0.g) b0Var).getClass();
        com.tencent.mm.platformtools.ExportFileUtil.e(a17, filePath, str, l0Var);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void scan(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void selectLocalImage(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void selectLocalPhoto(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void sendHandOffOpenCommand(byte[] tingItemData) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        bw5.v70 d17 = new bw5.lp0().parseFrom(tingItemData).d();
        if (il4.l.i(d17 != null ? d17.f34189e : 0)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("FlutterBizAudioInteractPlugin", "sendHandOffOpenCommand not file type");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void setNavigationBarColor(long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void setOnceOrientation(long j17) {
        com.tencent.mm.plugin.audio.BizAudioFlutterActivity bizAudioFlutterActivity;
        int i17 = (int) j17;
        if (java.lang.Integer.valueOf(i17).equals(0)) {
            com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "setOnceOrientation 0");
            android.app.Activity activity = this.f438069e;
            bizAudioFlutterActivity = activity instanceof com.tencent.mm.plugin.audio.BizAudioFlutterActivity ? (com.tencent.mm.plugin.audio.BizAudioFlutterActivity) activity : null;
            if (bizAudioFlutterActivity != null) {
                bizAudioFlutterActivity.setRequestedOrientation(1);
            }
            int i18 = com.tencent.mm.plugin.audio.BizAudioFlutterActivity.f92465x;
            com.tencent.mm.plugin.audio.BizAudioFlutterActivity.f92465x = 1;
            this.f438076o = true;
            this.f438075n = false;
            return;
        }
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.e("FlutterBizAudioInteractPlugin", "setOnceOrientation value error");
            return;
        }
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "setOnceOrientation 0");
        android.app.Activity activity2 = this.f438069e;
        bizAudioFlutterActivity = activity2 instanceof com.tencent.mm.plugin.audio.BizAudioFlutterActivity ? (com.tencent.mm.plugin.audio.BizAudioFlutterActivity) activity2 : null;
        if (bizAudioFlutterActivity != null) {
            bizAudioFlutterActivity.setRequestedOrientation(0);
        }
        int i19 = com.tencent.mm.plugin.audio.BizAudioFlutterActivity.f92465x;
        com.tencent.mm.plugin.audio.BizAudioFlutterActivity.f92465x = 0;
        this.f438075n = true;
        this.f438076o = false;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void setShowAudioRedDot(boolean z17) {
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).Ri(z17);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void setWindowKeepScreenOn(boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void shareCategoryItem(byte[] itemData, long j17) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(itemData, "itemData");
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "shareCategoryItem shareScene: " + j17);
        android.app.Activity activity = this.f438069e;
        if (activity == null) {
            return;
        }
        bw5.o50 parseFrom = new bw5.o50().parseFrom(itemData);
        str = "";
        if (j17 == 1) {
            wm1.h b17 = b();
            kotlin.jvm.internal.o.d(parseFrom);
            b17.getClass();
            java.lang.String k17 = il4.d.k(parseFrom);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioShareHelper", "shareAlbumToChat categoryId: " + parseFrom.c() + ", categoryType: " + parseFrom.f30964n + ", coverUrl: %s", k17);
            java.lang.String b18 = b17.b(parseFrom);
            if (b18 == null) {
                return;
            }
            java.lang.String Ri = ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ri(k17 != null ? k17 : "");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Msg_content", b18);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("Retr_Msg_thumb_path", Ri);
            intent.putExtra("Retr_Msg_thumb_url", k17);
            j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, 1004);
            return;
        }
        if (j17 != 2) {
            if (j17 == 3) {
                wm1.h b19 = b();
                kotlin.jvm.internal.o.d(parseFrom);
                b19.getClass();
                ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
                java.lang.String k18 = il4.d.k(parseFrom);
                ((dl4.m0) tVar).Bi(k18 != null ? k18 : "", new wm1.b(parseFrom, activity, 3, b19));
                return;
            }
            return;
        }
        wm1.h b27 = b();
        kotlin.jvm.internal.o.d(parseFrom);
        b27.getClass();
        android.content.Intent intent2 = new android.content.Intent();
        r45.km6 km6Var = new r45.km6();
        km6Var.f378838d = parseFrom.f30964n;
        km6Var.f378839e = il4.d.e(parseFrom);
        java.lang.String c17 = parseFrom.c();
        if (c17 == null) {
            c17 = "";
        }
        km6Var.f378840f = c17;
        java.lang.String url = parseFrom.getUrl();
        java.lang.String url2 = !(url == null || url.length() == 0) ? parseFrom.getUrl() : rk4.m.f396835b;
        java.lang.String k19 = il4.d.k(parseFrom);
        if (k19 == null) {
            k19 = "";
        }
        if (!(k19.length() == 0)) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).Ni(k19);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        try {
            if (km6Var.f378838d > 0) {
                sb6.append("<tingCategoryItem>");
                sb6.append("<type>");
                sb6.append(km6Var.f378838d);
                sb6.append("</type>");
                sb6.append("<categoryItem>");
                java.lang.String str2 = km6Var.f378839e;
                if (str2 == null) {
                    str2 = "";
                }
                sb6.append(str2);
                sb6.append("</categoryItem>");
                sb6.append("<categoryId>");
                java.lang.String str3 = km6Var.f378840f;
                if (str3 != null) {
                    str = str3;
                }
                sb6.append(str);
                sb6.append("</categoryId>");
                sb6.append("</tingCategoryItem>");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizAudioAlbumShareParser", "make content error! %s", e17.getMessage());
        }
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        intent2.putExtra("Ksnsupload_ting_album_share_object_xml", sb7);
        intent2.putExtra("Ksnsupload_link", url2);
        intent2.putExtra("Ksnsupload_title", parseFrom.getName());
        intent2.putExtra("Ksnsupload_type", 35);
        intent2.putExtra("need_result", true);
        intent2.putExtra("Ksnsupload_source", 1);
        j45.l.v(activity, ".plugin.sns.ui.SnsUploadUI", intent2, 1005);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void shareContent(com.tencent.pigeon.ting.TingShareDataWrap shareData, com.tencent.pigeon.ting.TingShareConfig config) {
        kotlin.jvm.internal.o.g(shareData, "shareData");
        kotlin.jvm.internal.o.g(config, "config");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void shareLyric(byte[] tingItemData, java.util.List lyricItems, double d17, double d18, long j17) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        kotlin.jvm.internal.o.g(lyricItems, "lyricItems");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void shareTingChatRoom(byte[] categoryItemData, byte[] bArr, long j17, long j18) {
        kotlin.jvm.internal.o.g(categoryItemData, "categoryItemData");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void shareTingChatRoomForward(byte[] categoryItemData, byte[] bArr, long j17, java.lang.String str, long j18) {
        kotlin.jvm.internal.o.g(categoryItemData, "categoryItemData");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void shareTingItem(byte[] tingItemData, byte[] bArr, byte[] bArr2, long j17) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "shareTingItem shareScene: " + j17);
        bw5.lp0 parseFrom = new bw5.lp0().parseFrom(tingItemData);
        android.app.Activity activity = this.f438069e;
        if (activity == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).k(new vm1.n0(j17, this, activity, parseFrom, bArr), 200L);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public boolean showAudioRedDot() {
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).getClass();
        return em4.b.f255212a;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void showFansHalfProfile(java.lang.String username, java.lang.String nickname, java.lang.String headImgUrl, byte[] listenBypassBuffer) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(nickname, "nickname");
        kotlin.jvm.internal.o.g(headImgUrl, "headImgUrl");
        kotlin.jvm.internal.o.g(listenBypassBuffer, "listenBypassBuffer");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String e17 = xy2.c.e(a());
        intent.putExtra("IsPoster", true);
        intent.putExtra("feedUser", e17);
        intent.putExtra("Avatar", headImgUrl);
        intent.putExtra("Nickname", nickname);
        intent.putExtra("Username", username);
        intent.putExtra("V5UserName", username);
        intent.putExtra("Action", 1);
        intent.putExtra("listenBypassBuffer", listenBypassBuffer);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.plugin.finder.view.ko.f132520a.g(a(), intent, 21);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void showHalfScreenWebView(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        android.app.Activity activity = this.f438069e;
        if (activity == null) {
            return;
        }
        i95.m c17 = i95.n0.c(zg0.u2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) zg0.u2.K2((zg0.u2) c17, activity, url, null, new com.tencent.mm.plugin.webview.ui.tools.widget.n1(0.6f, 0.0f, null, false, false, 0, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 0, false, false, false, 8388590, null), 4, null)).show();
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void showMultiSelectContactViewAndGetInfo(com.tencent.pigeon.ting.TingSelectContactsConfig config, yz5.l callback) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void showSessionSelectViewAndGetInfo(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void showSharePreConfirmView(com.tencent.pigeon.ting.ContactInfoWrap contactInfo, byte[] categoryItemData, byte[] listenItemData, yz5.l callback) {
        kotlin.jvm.internal.o.g(contactInfo, "contactInfo");
        kotlin.jvm.internal.o.g(categoryItemData, "categoryItemData");
        kotlin.jvm.internal.o.g(listenItemData, "listenItemData");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void startRecognizeSong(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void startRecord(long j17, long j18, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        d75.b.g(new vm1.q0(j17, j18, this, callback));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void startRecordWithConfiguration(com.tencent.pigeon.ting.TingAudioRecordConfiguration configuration, yz5.l callback) {
        kotlin.jvm.internal.o.g(configuration, "configuration");
        kotlin.jvm.internal.o.g(callback, "callback");
        d75.b.g(new vm1.t0(configuration, this, callback));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void startVoiceInput(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void stopRecognizeSong() {
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void stopRecord(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        d75.b.g(new vm1.v0(callback));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void stopVoiceInput() {
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void updateCurrentMultiTaskId(java.lang.String str, boolean z17) {
        ia0.n nVar = (ia0.n) i95.n0.c(ia0.n.class);
        android.content.Context context = this.f438069e;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        ((ia0.o) nVar).Ai(context);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void updatePersonalizedRecommend(boolean z17) {
        ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).cj(java.lang.Boolean.valueOf(z17), true);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void uploadLocalPhoto(com.tencent.pigeon.ting.SelectLocalPhotoResult localPhotoResult, yz5.l callback) {
        kotlin.jvm.internal.o.g(localPhotoResult, "localPhotoResult");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void uploadRecordFileToCdn(java.lang.String localFilePath, yz5.l callback) {
        kotlin.jvm.internal.o.g(localFilePath, "localFilePath");
        kotlin.jvm.internal.o.g(callback, "callback");
    }
}
