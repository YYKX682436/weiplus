package rk4;

/* loaded from: classes11.dex */
public final class l3 implements com.tencent.pigeon.ting.TingNativeController, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.plugin.common.PluginRegistry.ActivityResultListener {

    /* renamed from: t, reason: collision with root package name */
    public static com.tencent.pigeon.ting.TingLaterListenChannel f396814t;

    /* renamed from: u, reason: collision with root package name */
    public static com.tencent.pigeon.ting.TingStarItemChangeChannel f396815u;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f396816d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f396817e;

    /* renamed from: g, reason: collision with root package name */
    public dl4.f f396819g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel.EventSink f396820h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.pigeon.ting.TingAudioRecordCallback f396821i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.OrientationEventListener f396822m;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f396824o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f396825p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f396826q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f396827r;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f396818f = jz5.h.b(rk4.n2.f396856d);

    /* renamed from: n, reason: collision with root package name */
    public final int f396823n = 3004;

    /* renamed from: s, reason: collision with root package name */
    public final int f396828s = com.tencent.liteav.TXLiteAVCode.WARNING_AUDIO_RECORDING_WRITE_FAIL;

    public final android.content.Context a() {
        android.app.Activity activity = this.f396817e;
        if (activity != null) {
            return activity;
        }
        android.content.Context context = this.f396816d;
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
        jm4.h5.a(tingBypassBuffer, z17, new rk4.b1(callback));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void addToStar(byte[] listenItemData, long j17, boolean z17, boolean z18, com.tencent.pigeon.ting.TingStarSnapInfo tingStarSnapInfo, boolean z19) {
        android.graphics.Rect rect;
        android.graphics.Bitmap bitmap;
        android.app.Activity activity;
        kotlin.jvm.internal.o.g(listenItemData, "listenItemData");
        try {
            bw5.v70 parseFrom = new bw5.v70().parseFrom(listenItemData);
            byte[] buffer = tingStarSnapInfo != null ? tingStarSnapInfo.getBuffer() : null;
            if (tingStarSnapInfo == null || buffer == null) {
                rect = null;
                bitmap = null;
            } else {
                int length = buffer.length;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(length));
                arrayList.add(0);
                arrayList.add(buffer);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/ting/FlutterTingInteractPlugin", "addToStar", "([BJZZLcom/tencent/pigeon/ting/TingStarSnapInfo;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/ting/FlutterTingInteractPlugin", "addToStar", "([BJZZLcom/tencent/pigeon/ting/TingStarSnapInfo;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                android.graphics.Rect rect2 = new android.graphics.Rect();
                java.lang.Double left = tingStarSnapInfo.getLeft();
                int doubleValue = left != null ? (int) left.doubleValue() : 0;
                rect2.left = doubleValue;
                java.lang.Double width = tingStarSnapInfo.getWidth();
                rect2.right = doubleValue + (width != null ? (int) width.doubleValue() : 0);
                java.lang.Double top = tingStarSnapInfo.getTop();
                int doubleValue2 = top != null ? (int) top.doubleValue() : 0;
                rect2.top = doubleValue2;
                java.lang.Double height = tingStarSnapInfo.getHeight();
                rect2.bottom = doubleValue2 + (height != null ? (int) height.doubleValue() : 0);
                rect = rect2;
                bitmap = decodeByteArray;
            }
            cl4.l lVar = new cl4.l(new cl4.m(this.f396817e));
            kotlin.jvm.internal.o.d(parseFrom);
            cl4.l.c0(lVar, parseFrom, z18, z17, rect, bitmap, false, 32, null);
            if (!z19 || (activity = this.f396817e) == null) {
                return;
            }
            activity.finish();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FlutterTingInteractPlugin", "addToStar Exception=" + e17);
        }
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void allowRotate(boolean z17) {
        com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity;
        if (z17) {
            rk4.k5.e("allow rotate", "FlutterTingInteractPlugin");
            android.app.Activity activity = this.f396817e;
            tingFlutterActivity = activity instanceof com.tencent.mm.plugin.ting.TingFlutterActivity ? (com.tencent.mm.plugin.ting.TingFlutterActivity) activity : null;
            if (tingFlutterActivity != null) {
                tingFlutterActivity.setRequestedOrientation(4);
            }
            int i17 = com.tencent.mm.plugin.ting.TingFlutterActivity.f174619z;
            com.tencent.mm.plugin.ting.TingFlutterActivity.f174619z = 4;
            this.f396827r = true;
            return;
        }
        rk4.k5.e("disallow rotate", "FlutterTingInteractPlugin");
        android.app.Activity activity2 = this.f396817e;
        tingFlutterActivity = activity2 instanceof com.tencent.mm.plugin.ting.TingFlutterActivity ? (com.tencent.mm.plugin.ting.TingFlutterActivity) activity2 : null;
        if (tingFlutterActivity != null) {
            tingFlutterActivity.setRequestedOrientation(1);
        }
        int i18 = com.tencent.mm.plugin.ting.TingFlutterActivity.f174619z;
        com.tencent.mm.plugin.ting.TingFlutterActivity.f174619z = 1;
        this.f396827r = false;
    }

    public final cl4.v b() {
        return (cl4.v) ((jz5.n) this.f396818f).getValue();
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
        nVar.f301546d = new rk4.c1(callback);
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d((androidx.fragment.app.FragmentActivity) a(), nVar);
    }

    public final void c(java.lang.String userName, long j17, long j18, java.lang.String str, long j19, boolean z17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        rk4.k5.e("gotoFinderAccountProfile userName:" + userName + " tabType=" + j17, "FlutterTingInteractPlugin");
        android.content.Context context = this.f396817e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.z1(context, j17, j18, userName, str, z17, j19, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public boolean canShowHandOffOpenCommandItem(byte[] tingItemData) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        bw5.v70 d17 = new bw5.lp0().parseFrom(tingItemData).d();
        if (il4.l.i(d17 != null ? d17.f34189e : 0)) {
            return ((d73.i) i95.n0.c(d73.i.class)).Qg() && ((d73.i) i95.n0.c(d73.i.class)).t1() != null;
        }
        com.tencent.mars.xlog.Log.e("FlutterTingInteractPlugin", "canShowHandOffOpenCommandItem not file type");
        return false;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void consumeWCCoin(byte[] param, yz5.l callback) {
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(callback, "callback");
        bw5.ep0 parseFrom = new bw5.ep0().parseFrom(param);
        pr4.l lVar = new pr4.l(parseFrom.f26985d, (androidx.fragment.app.FragmentActivity) a(), new rk4.d1(callback), new rk4.e1(callback), new rk4.f1(callback));
        lVar.f358026g = (parseFrom.f26993o[2] ? parseFrom.f26986e : com.tencent.mm.protobuf.g.f192155b).g();
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
        new ls4.u(lVar).f();
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void containsInStar(java.util.List listenId, boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(listenId, "listenId");
        kotlin.jvm.internal.o.g(callback, "callback");
        jm4.h5.b((java.lang.String[]) listenId.toArray(new java.lang.String[0]), z17, new rk4.g1(callback));
    }

    public final void d(java.lang.String str, java.lang.String str2, android.content.Intent intent) {
        android.content.Context context = this.f396817e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.i3(context, str, str2, intent, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public boolean deleteFavBySourceId(java.lang.String sourceId) {
        kotlin.jvm.internal.o.g(sourceId, "sourceId");
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        rk4.h1 h1Var = new rk4.h1(c0Var);
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        ((a82.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).mj()).T6(sourceId, "", null);
        h1Var.invoke(java.lang.Boolean.TRUE);
        return c0Var.f310112d;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void destroyAndReopenTingMiniProgram(long j17) {
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "destroyAndReopenTingMiniProgram scene: " + j17);
        com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity = ((ef0.h3) ((qk.t8) i95.n0.c(qk.t8.class))).f252225e;
        java.lang.Boolean valueOf = tingFlutterActivity != null ? java.lang.Boolean.valueOf(tingFlutterActivity.isPaused()) : null;
        ef0.h3 h3Var = (ef0.h3) ((qk.t8) i95.n0.c(qk.t8.class));
        com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity2 = h3Var.f252225e;
        if (tingFlutterActivity2 != null) {
            tingFlutterActivity2.finish();
        }
        h3Var.Bi(null);
        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).u(new rk4.j1(valueOf, j17));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void followBrandAccount(java.lang.String username, boolean z17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, yz5.l callback) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        rk4.k5.e("followBrandAccount, username:" + username + "， scene:" + j17 + ", sceneNote:" + str2 + ", isCancel:" + z17, "FlutterTingInteractPlugin");
        if (z17) {
            ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).getClass();
            ((qv.e) ((rv.m2) i95.n0.c(rv.m2.class))).wi(r01.z.b(username), this.f396817e, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true), false);
            return;
        }
        o25.a aVar = new o25.a();
        aVar.f342463a = str;
        aVar.f342465c = str2;
        aVar.f342466d = str3;
        aVar.f342469g = false;
        com.tencent.mm.sdk.platformtools.u3.h(new rk4.k1(((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).wi(a(), username, (int) j17, new rk4.l1(callback), aVar)));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void followFinderAccount(java.lang.String username, boolean z17, byte[] bArr, long j17, java.lang.String str, yz5.l callback) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        if (bArr == null) {
            bArr = new byte[0];
        }
        byte[] bArr2 = bArr;
        if (str == null) {
            str = "";
        }
        rk4.m1 m1Var = new rk4.m1(callback);
        ((u71.i) rVar).getClass();
        w71.e.a(username, z17, bArr2, j17, str, m1Var);
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
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "recycle bitmap:%s", Di);
        Di.recycle();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        try {
            byteArrayOutputStream.close();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FlutterTingInteractPlugin", e17, "", new java.lang.Object[0]);
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
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        rk4.n1 n1Var = new rk4.n1(h0Var);
        ((u71.i) rVar).getClass();
        w71.e.b(username, n1Var);
        return (com.tencent.pigeon.ting.TingBrandContactInfo) h0Var.f310123d;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public com.tencent.pigeon.ting.TingUserContactInfo getContactInfo(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        rk4.o1 o1Var = new rk4.o1(h0Var);
        ((u71.i) rVar).getClass();
        w71.e.c(username, o1Var);
        return (com.tencent.pigeon.ting.TingUserContactInfo) h0Var.f310123d;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public java.util.List getContactInfoFromHash(java.util.List hashusernames) {
        kotlin.jvm.internal.o.g(hashusernames, "hashusernames");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        java.lang.String[] hashUsernames = (java.lang.String[]) hashusernames.toArray(new java.lang.String[0]);
        rk4.p1 p1Var = new rk4.p1(h0Var);
        ((u71.i) rVar).getClass();
        kotlin.jvm.internal.o.g(hashUsernames, "hashUsernames");
        w71.e.d(hashUsernames, p1Var);
        return (java.util.List) h0Var.f310123d;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void getContactInfoFromHashAsync(java.util.List hashUsernames, yz5.l callback) {
        kotlin.jvm.internal.o.g(hashUsernames, "hashUsernames");
        kotlin.jvm.internal.o.g(callback, "callback");
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        java.lang.String[] hashUsernames2 = (java.lang.String[]) hashUsernames.toArray(new java.lang.String[0]);
        rk4.r1 r1Var = new rk4.r1(callback);
        ((u71.i) rVar).getClass();
        kotlin.jvm.internal.o.g(hashUsernames2, "hashUsernames");
        w71.e.d(hashUsernames2, r1Var);
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
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(callback, "callback");
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        rk4.s1 s1Var = new rk4.s1(callback);
        ((u71.i) rVar).getClass();
        w71.e.e(userName, s1Var);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public long getIdentityType() {
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        jm4.h5.c(new rk4.t1(g0Var));
        return g0Var.f310121d;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public com.tencent.pigeon.ting.TingPoiInfo getPoiInfo() {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = new com.tencent.pigeon.ting.TingPoiInfo(null, null, null, null, 15, null);
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        rk4.u1 u1Var = new rk4.u1(h0Var);
        ((u71.i) rVar).getClass();
        w71.e.f(u1Var);
        return (com.tencent.pigeon.ting.TingPoiInfo) h0Var.f310123d;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void getWCCoinBalance(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).b(new rk4.v1(callback));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public java.lang.String getWxUsername() {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        e70.r rVar = (e70.r) i95.n0.c(e70.r.class);
        rk4.w1 w1Var = new rk4.w1(h0Var);
        ((u71.i) rVar).getClass();
        java.lang.String r17 = c01.z1.r();
        w1Var.invoke(r17 != null ? r17 : "");
        return (java.lang.String) h0Var.f310123d;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void goToCreateFinderAccount(java.lang.String str, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f396824o = callback;
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        android.content.Context a17 = a();
        if (str == null) {
            str = "";
        }
        ((c61.l7) b6Var).Zi(a17, str, this.f396823n);
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
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "goToMusicChatroom");
        bw5.o50 o50Var = new bw5.o50();
        o50Var.i(categoryId);
        android.app.Activity activity = this.f396817e;
        if (activity != null) {
            qk.f9.a(((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj(), activity, o50Var, null, false, null, 28, null);
        }
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void goToProfile(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        android.content.Context context = this.f396817e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.x1(userName, context, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void goToQQMusicPayment(java.lang.String appId, java.lang.String mid) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(mid, "mid");
        android.content.Context a17 = a();
        b21.r rVar = new b21.r();
        rVar.f17358t = appId;
        new vk4.a(appId, mid).l().q(new rk4.c6(a17, rVar));
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
        d("webview", ".ui.tools.WebViewUI", intent);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoAppInstallPage(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        java.lang.String str = kotlin.jvm.internal.o.b("wx5aa333606550dfd5", appId) ? "https://y.qq.com/m/download/index.html?channelId=2005000732" : kotlin.jvm.internal.o.b("wx8dd6ecd81906fd84", appId) ? "https://a.app.qq.com/o/simple.jsp?pkgname=com.netease.cloudmusic" : kotlin.jvm.internal.o.b("wx79f2c4418704b4f8", appId) ? "https://a.app.qq.com/o/simple.jsp?pkgname=com.kugou.android" : kotlin.jvm.internal.o.b("wxc305711a2a7ad71c", appId) ? "https://a.app.qq.com/o/simple.jsp?pkgname=cn.kuwo.player" : kotlin.jvm.internal.o.b("wxf7cc00aea2bdc884", appId) ? "https://a.app.qq.com/o/simple.jsp?pkgname=com.tencentmusic.venus" : "";
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "gotoAppInstallPage appId: " + appId + ", url: %s", str);
        goToWebPage(str, -1L);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoBusinessAccountProfile(java.lang.String userName, long j17, java.lang.String str) {
        kotlin.jvm.internal.o.g(userName, "userName");
        if (userName.length() == 0) {
            return;
        }
        rk4.k5.e("gotoBusinessAccountProfile, userName:" + userName + ", scene:" + j17 + ", sceneNote:" + str, "FlutterTingInteractPlugin");
        android.content.Context context = this.f396817e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.y1(userName, j17, str, context, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoBusinessArticle(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("forceHideShare", true);
        android.content.Intent putExtra = intent.putExtra("convertActivityFromTranslucent", true);
        kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
        d("webview", ".ui.tools.WebViewUI", putExtra);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoFinderAccountProfile(java.lang.String userName, long j17, long j18, java.lang.String str, long j19) {
        kotlin.jvm.internal.o.g(userName, "userName");
        c(userName, j17, j18, str, j19, false);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoFinderAccountProfileHalfPage(java.lang.String username, long j17, long j18, java.lang.String str, long j19) {
        kotlin.jvm.internal.o.g(username, "username");
        c(username, j17, j18, str, j19, true);
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
        rk4.k5.c("gotoFinderDetail tid:" + tid + ", nonceId:" + nonceId + ", needGetRelatedList: " + z17 + ", sessionId: " + sessionId + ", startTime:" + j17, "FlutterTingInteractPlugin");
        android.content.Context context = this.f396817e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.a2(context, tid, nonceId, z17, sessionId, j17, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoFinderFeed(java.lang.String tid, java.lang.String nonceId, java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(tid, "tid");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "gotoFinderFeed tid: " + tid + ", nonceId: " + nonceId + ", sessionId: " + sessionId);
        android.content.Context context = this.f396817e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.b2(tid, nonceId, context, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoFinderLive(java.lang.String tid, java.lang.String nonceId) {
        kotlin.jvm.internal.o.g(tid, "tid");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        android.content.Context context = this.f396817e;
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
            rk4.k5.e("gotoFinderMyProfileAudioTab contactInfo is null", "FlutterTingInteractPlugin");
            return;
        }
        rk4.k5.e("gotoFinderMyProfileAudioTab userName:" + tingFinderContactInfo.getUsername(), "FlutterTingInteractPlugin");
        android.content.Context context = this.f396817e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.c2(context, tingFinderContactInfo, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void gotoTingSettingPage() {
        d("setting", ".ui.setting.SettingsMusicUI", new android.content.Intent());
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public boolean hasAddedInFavDB(java.lang.String sourceId) {
        kotlin.jvm.internal.o.g(sourceId, "sourceId");
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        jm4.h5.d(sourceId, new rk4.d2(c0Var));
        return c0Var.f310112d;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void hybridOpenAudioMine() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void inPlayer(boolean z17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0075 A[RETURN] */
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
            java.lang.String r1 = "FlutterTingInteractPlugin"
            com.tencent.mars.xlog.Log.i(r1, r0)
            int r0 = r7.length()
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L31
            r0 = r2
            goto L32
        L31:
            r0 = r3
        L32:
            if (r0 == 0) goto L36
        L34:
            r7 = r3
            goto L61
        L36:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "android.intent.action.VIEW"
            android.net.Uri r7 = android.net.Uri.parse(r7)     // Catch: java.lang.Throwable -> L57
            r0.<init>(r4, r7)     // Catch: java.lang.Throwable -> L57
            android.content.Context r7 = r5.a()     // Catch: java.lang.Throwable -> L57
            java.util.List r7 = com.tencent.mm.sdk.platformtools.t8.w1(r7, r0)     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L54
            boolean r7 = r7.isEmpty()     // Catch: java.lang.Throwable -> L57
            if (r7 == 0) goto L52
            goto L54
        L52:
            r7 = r3
            goto L55
        L54:
            r7 = r2
        L55:
            r7 = r7 ^ r2
            goto L61
        L57:
            r7 = move-exception
            java.lang.String r0 = "isAppInstalled exception"
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r7, r0, r4)
            goto L34
        L61:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "isAppInstalled ret: "
            r0.<init>(r4)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r1, r0)
            if (r7 == 0) goto L76
            return r7
        L76:
            java.lang.Class<lt.i0> r7 = lt.i0.class
            i95.m r7 = i95.n0.c(r7)
            lt.i0 r7 = (lt.i0) r7
            kt.c r7 = (kt.c) r7
            r7.getClass()
            com.tencent.mm.pluginsdk.model.app.m r7 = com.tencent.mm.pluginsdk.model.app.w.h(r6)
            if (r7 == 0) goto L8c
            java.lang.String r7 = r7.field_packageName
            goto L8d
        L8c:
            r7 = 0
        L8d:
            if (r7 != 0) goto L91
            java.lang.String r7 = ""
        L91:
            java.lang.String r0 = "isAppInstalled packageName: "
            java.lang.String r0 = r0.concat(r7)
            com.tencent.mars.xlog.Log.i(r1, r0)
            int r0 = r7.length()
            if (r0 <= 0) goto La3
            r0 = r2
            goto La4
        La3:
            r0 = r3
        La4:
            if (r0 == 0) goto Lb1
            android.content.Context r0 = r5.a()
            boolean r7 = com.tencent.mm.pluginsdk.model.app.j1.f(r0, r7)
            if (r7 == 0) goto Lb1
            return r2
        Lb1:
            java.lang.String r7 = "isAppInstalled not install, appId: "
            java.lang.String r6 = r7.concat(r6)
            com.tencent.mars.xlog.Log.w(r1, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.l3.isAppInstalled(java.lang.String, java.lang.String):boolean");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void launchApplication(java.lang.String appId, java.lang.String scheme) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(scheme, "scheme");
        try {
            com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "launchApplication appId: " + appId + ", scheme: " + scheme);
            ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(a(), new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(scheme)), ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(a(), appId), 2, new rk4.e2(), null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FlutterTingInteractPlugin", th6, "launchApplication exception", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void launchApplicationWithUrl(java.lang.String appId, java.lang.String scheme, java.lang.String url, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(scheme, "scheme");
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "launchApplicationWithUrl appId: " + appId + ", scheme: " + scheme);
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).cj(a(), new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(scheme)), ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(a(), appId), 2, new rk4.f2(z17, this, appId, url), null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void markPlayTaskInFullScreenPlayerMode() {
        rk4.k8 k8Var = (rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        k8Var.N(true);
        k8Var.L(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02a1 A[RETURN] */
    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onActivityResult(int r24, int r25, android.content.Intent r26) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.l3.onActivityResult(int, int, android.content.Intent):boolean");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "onAttachedToActivity");
        this.f396817e = binding.getActivity();
        binding.addActivityResultListener(this);
        if (this.f396817e instanceof com.tencent.mm.plugin.ting.TingFlutterActivity) {
            allowRotate(this.f396827r);
        }
        ((nq1.d) ((oq1.l) i95.n0.c(oq1.l.class))).Bi(oq1.b.f347318o);
        rk4.g2 g2Var = new rk4.g2(this, a());
        this.f396822m = g2Var;
        g2Var.enable();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        this.f396816d = p07.getApplicationContext();
        com.tencent.pigeon.ting.TingNativeController.Companion companion = com.tencent.pigeon.ting.TingNativeController.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingNativeController.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        new com.tencent.pigeon.ting.TingMusicBottomSheetUtils(binaryMessenger2, null, 2, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger3 = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger3, "getBinaryMessenger(...)");
        f396814t = new com.tencent.pigeon.ting.TingLaterListenChannel(binaryMessenger3, null, 2, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger4 = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger4, "getBinaryMessenger(...)");
        f396815u = new com.tencent.pigeon.ting.TingStarItemChangeChannel(binaryMessenger4, null, 2, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger5 = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger5, "getBinaryMessenger(...)");
        this.f396821i = new com.tencent.pigeon.ting.TingAudioRecordCallback(binaryMessenger5, null, 2, null);
        ef0.q1 q1Var = (ef0.q1) ((qk.a8) i95.n0.c(qk.a8.class));
        q1Var.getClass();
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        jk3.d dVar = q1Var.f252303d;
        ((com.tencent.mm.plugin.multitask.p1) l0Var).getClass();
        ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).getClass();
        if (dVar != null) {
            com.tencent.mm.plugin.multitask.i1.f150444x.add(dVar);
        }
        new io.flutter.plugin.common.EventChannel(p07.getBinaryMessenger(), "ting_ugc_voice_input/event").setStreamHandler(new rk4.h2(this));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void onCommonHalfScreenGoDetailClick(java.lang.String identifier) {
        kotlin.jvm.internal.o.g(identifier, "identifier");
        if (kotlin.jvm.internal.o.b(identifier, "thumb_like_education")) {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.content.Context context = this.f396817e;
            if (context == null) {
                context = a();
            }
            qk.f9.e(aj6, context, bw5.ar0.TingScene_FinderDetailPage, null, 0, null, null, 52, null);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "onDetachedFromActivity");
        this.f396817e = null;
        android.view.OrientationEventListener orientationEventListener = this.f396822m;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f396822m = null;
        zg0.c3 c3Var = (zg0.c3) i95.n0.c(zg0.c3.class);
        if (c3Var != null) {
            ((yg0.u3) c3Var).wi();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f396817e = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.TingNativeController.Companion companion = com.tencent.pigeon.ting.TingNativeController.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingNativeController.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        ef0.q1 q1Var = (ef0.q1) ((qk.a8) i95.n0.c(qk.a8.class));
        q1Var.getClass();
        com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
        jk3.d dVar = q1Var.f252303d;
        ((com.tencent.mm.plugin.multitask.p1) l0Var).getClass();
        ((com.tencent.mm.plugin.multitask.i1) ((com.tencent.mm.plugin.multitask.j0) i95.n0.c(com.tencent.mm.plugin.multitask.j0.class))).getClass();
        if (dVar != null) {
            com.tencent.mm.plugin.multitask.i1.f150444x.remove(dVar);
        }
        f396814t = null;
        f396815u = null;
        this.f396821i = null;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void onPlayerAction(byte[] itemData, long j17) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
        jm4.h5.e(itemData, j17, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void onPlayerLike(byte[] itemData, boolean z17) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f396817e = binding.getActivity();
        binding.addActivityResultListener(this);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void onTingCommonEvent(long j17, java.util.Map map) {
        java.lang.String jSONObject = map != null ? new org.json.JSONObject(map).toString() : "";
        kotlin.jvm.internal.o.d(jSONObject);
        jm4.h5.f(j17, jSONObject, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    @Override // com.tencent.pigeon.ting.TingNativeController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void open3rdAppWithTingItem(java.lang.String r19, byte[] r20, long r21) {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.l3.open3rdAppWithTingItem(java.lang.String, byte[], long):void");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void openAD(byte[] adSchemeInfo, long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(adSchemeInfo, "adSchemeInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            bw5.q80 parseFrom = new bw5.q80().parseFrom(adSchemeInfo);
            km4.l lVar = km4.l.f309296a;
            kotlin.jvm.internal.o.d(parseFrom);
            lVar.b(parseFrom, j17, callback, a());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FlutterTingInteractPlugin", "openAD exp=" + e17);
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.TingADResult(java.lang.Long.valueOf((long) com.tencent.pigeon.ting.TingADErrorCode.OPEN_FAIL.ordinal())))));
        }
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void openByOtherApp(byte[] tingItemData) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        bw5.lp0 parseFrom = new bw5.lp0().parseFrom(tingItemData);
        bw5.v70 d17 = parseFrom.d();
        if (!il4.l.i(d17 != null ? d17.f34189e : 0)) {
            com.tencent.mars.xlog.Log.e("FlutterTingInteractPlugin", "openByOtherApp not file type and ignore");
            return;
        }
        java.lang.String filePath = parseFrom.d().i().getFilePath();
        java.lang.String str = filePath == null ? "" : filePath;
        bw5.l80 i17 = parseFrom.d().i();
        java.lang.String str2 = i17.hasFieldNumber(3) ? i17.f29685f : "";
        java.lang.String str3 = str2 == null ? "" : str2;
        java.lang.String b17 = parseFrom.d().i().b();
        java.lang.String str4 = b17 == null ? "" : b17;
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "openByOtherApp filePath: " + str + ", fileExt: " + str3 + ", title: " + rk4.j5.j(parseFrom));
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        android.app.Activity activity = this.f396817e;
        ((ht.a) vVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.f.l(activity, str, str4, str3, 8, 2);
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
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "gotoLiteApp appId: " + appId + ", liteAppType:" + j17 + ", path: " + path + " query: " + query);
        ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).aj(appId);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(a(), bundle, true, false, new rk4.i2(this));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void openWeApp(java.lang.String appId, java.lang.String path, long j17, java.lang.String sceneNote, boolean z17, long j18) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(sceneNote, "sceneNote");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.j2(appId, path, j17, sceneNote, z17, j18, this, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void openWebPage(java.lang.String url, com.tencent.pigeon.ting.OpenWebPageInfo openInfo) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(openInfo, "openInfo");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("convertActivityFromTranslucent", true);
        intent.putExtra("hide_option_menu", openInfo.getHideOptionMenu());
        d("webview", ".ui.tools.WebViewUI", intent);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void preloadMiniProgram(long j17, long j18) {
        jm4.h5.g(j17, j18, null);
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
        if (this.f396817e == null) {
            return;
        }
        bw5.o50 parseFrom = new bw5.o50().parseFrom(itemData);
        cl4.v b17 = b();
        kotlin.jvm.internal.o.d(parseFrom);
        android.app.Activity activity = this.f396817e;
        kotlin.jvm.internal.o.d(activity);
        b17.getClass();
        if (parseFrom.f30964n == 42) {
            java.lang.String k17 = gm0.j1.b().k();
            com.tencent.mm.storage.z3 q17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(k17);
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(k17);
            java.lang.String c17 = n07 != null ? n07.c() : null;
            bw5.mc0 mc0Var = new bw5.mc0();
            mc0Var.f30166e = q17.d1();
            boolean[] zArr = mc0Var.f30179u;
            zArr[2] = true;
            mc0Var.f30167f = q17.P0();
            zArr[3] = true;
            mc0Var.f30168g = c17;
            zArr[4] = true;
            parseFrom.f30982z = mc0Var;
            parseFrom.L1[20] = true;
        }
        java.lang.String d17 = b17.d(parseFrom);
        if (d17 == null) {
            return;
        }
        oe5.b bVar = new oe5.b();
        l15.c cVar = new l15.c();
        cVar.fromXml(d17);
        bVar.l(cVar);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        cl4.n nVar = new cl4.n(userName, parseFrom, d17, activity);
        n13.t tVar = new n13.t();
        tVar.f334133a = nVar;
        n13.a0.V0.getClass();
        tVar.f334135c = n13.y.f334141a;
        ((dk5.y) a0Var).wi(activity, bVar, userName, tVar);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void quickShareTingItem(byte[] tingItemData, java.lang.String userName) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        kotlin.jvm.internal.o.g(userName, "userName");
        if (this.f396817e == null) {
            return;
        }
        bw5.lp0 parseFrom = new bw5.lp0().parseFrom(tingItemData);
        cl4.v b17 = b();
        kotlin.jvm.internal.o.d(parseFrom);
        android.app.Activity activity = this.f396817e;
        kotlin.jvm.internal.o.d(activity);
        b17.getClass();
        java.lang.String g17 = b17.g(parseFrom);
        if (g17 == null) {
            return;
        }
        oe5.c cVar = new oe5.c();
        l15.c cVar2 = new l15.c();
        cVar2.fromXml(g17);
        cVar.l(cVar2);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        cl4.u uVar = new cl4.u(userName, parseFrom, g17, activity);
        n13.t tVar = new n13.t();
        tVar.f334133a = uVar;
        n13.a0.V0.getClass();
        tVar.f334135c = n13.y.f334141a;
        ((dk5.y) a0Var).wi(activity, cVar, userName, tVar);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void saveLocalFile(byte[] tingItemData) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        bw5.lp0 parseFrom = new bw5.lp0().parseFrom(tingItemData);
        bw5.v70 d17 = parseFrom.d();
        if (!il4.l.i(d17 != null ? d17.f34189e : 0)) {
            com.tencent.mars.xlog.Log.e("FlutterTingInteractPlugin", "saveLocalFile not file type and ignore");
            return;
        }
        java.lang.String filePath = parseFrom.d().i().getFilePath();
        if (filePath == null) {
            filePath = "";
        }
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "saveLocalFile filePath: " + filePath + ", title: " + rk4.j5.j(parseFrom));
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context a17 = a();
        bw5.l80 i17 = parseFrom.d().i();
        java.lang.String b17 = i17 != null ? i17.b() : null;
        java.lang.String str = b17 != null ? b17 : "";
        rk4.k2 k2Var = new rk4.k2(this);
        ((yb0.g) b0Var).getClass();
        com.tencent.mm.platformtools.ExportFileUtil.e(a17, filePath, str, k2Var);
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
        dl4.f fVar = new dl4.f(new rk4.l2(callback), new java.lang.ref.WeakReference(this.f396817e));
        rk4.k5.c("selectPhoto", fVar.f235393c);
        android.app.Activity activity = (android.app.Activity) fVar.f235392b.get();
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent();
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.h(activity, 10, intent);
        }
        this.f396819g = fVar;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void sendHandOffOpenCommand(byte[] tingItemData) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        bw5.v70 d17 = new bw5.lp0().parseFrom(tingItemData).d();
        if (!il4.l.i(d17 != null ? d17.f34189e : 0)) {
            com.tencent.mars.xlog.Log.e("FlutterTingInteractPlugin", "sendHandOffOpenCommand not file type");
            return;
        }
        com.tencent.mm.plugin.handoff.model.HandOff t17 = ((d73.i) i95.n0.c(d73.i.class)).t1();
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "sendHandOffOpenCommand handOffFile: " + t17);
        if (t17 != null) {
            ((d73.i) i95.n0.c(d73.i.class)).f6(t17);
        } else {
            com.tencent.mars.xlog.Log.e("FlutterTingInteractPlugin", "sendHandOffOpenCommand handOffFile null");
        }
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void setNavigationBarColor(long j17, yz5.l callback) {
        android.view.Window window;
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f396817e;
        boolean z17 = activity instanceof com.tencent.mm.ui.MMActivity;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            if (!com.tencent.mm.ui.b4.c(activity)) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(f0Var)));
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 29 && (window = ((com.tencent.mm.ui.MMActivity) activity).getWindow()) != null) {
                window.setNavigationBarContrastEnforced(false);
                new n3.m3(window, window.getDecorView()).b(!com.tencent.mm.ui.uk.g((int) j17));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setNavigationBarColor color=");
            sb6.append(j17);
            sb6.append(", colorHexString=");
            int i17 = (int) j17;
            sb6.append(java.lang.Integer.toHexString(i17));
            com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", sb6.toString());
            ((com.tencent.mm.ui.MMActivity) activity).setNavigationbarColor(i17);
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(f0Var)));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void setOnceOrientation(long j17) {
        com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity;
        int i17 = (int) j17;
        if (java.lang.Integer.valueOf(i17).equals(0)) {
            rk4.k5.e("setOnceOrientation 0", "FlutterTingInteractPlugin");
            android.app.Activity activity = this.f396817e;
            tingFlutterActivity = activity instanceof com.tencent.mm.plugin.ting.TingFlutterActivity ? (com.tencent.mm.plugin.ting.TingFlutterActivity) activity : null;
            if (tingFlutterActivity != null) {
                tingFlutterActivity.setRequestedOrientation(1);
            }
            int i18 = com.tencent.mm.plugin.ting.TingFlutterActivity.f174619z;
            com.tencent.mm.plugin.ting.TingFlutterActivity.f174619z = 1;
            this.f396826q = true;
            this.f396825p = false;
            return;
        }
        if (i17 != 1) {
            rk4.k5.d("setOnceOrientation value error", "FlutterTingInteractPlugin");
            return;
        }
        rk4.k5.e("setOnceOrientation 0", "FlutterTingInteractPlugin");
        android.app.Activity activity2 = this.f396817e;
        tingFlutterActivity = activity2 instanceof com.tencent.mm.plugin.ting.TingFlutterActivity ? (com.tencent.mm.plugin.ting.TingFlutterActivity) activity2 : null;
        if (tingFlutterActivity != null) {
            tingFlutterActivity.setRequestedOrientation(0);
        }
        int i19 = com.tencent.mm.plugin.ting.TingFlutterActivity.f174619z;
        com.tencent.mm.plugin.ting.TingFlutterActivity.f174619z = 0;
        this.f396825p = true;
        this.f396826q = false;
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void setShowAudioRedDot(boolean z17) {
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).Ri(z17);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void setWindowKeepScreenOn(boolean z17, yz5.l callback) {
        android.app.Activity activity;
        android.view.Window window;
        android.view.Window window2;
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            if (z17) {
                android.content.Context a17 = a();
                activity = a17 instanceof android.app.Activity ? (android.app.Activity) a17 : null;
                if (activity != null && (window2 = activity.getWindow()) != null) {
                    window2.addFlags(128);
                }
            } else {
                android.content.Context a18 = a();
                activity = a18 instanceof android.app.Activity ? (android.app.Activity) a18 : null;
                if (activity != null && (window = activity.getWindow()) != null) {
                    window.clearFlags(128);
                }
            }
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FlutterTingInteractPlugin", e17, "keepScreenOn", new java.lang.Object[0]);
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
        }
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void shareCategoryItem(byte[] itemData, long j17) {
        kotlin.jvm.internal.o.g(itemData, "itemData");
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "shareCategoryItem shareScene: " + j17);
        android.app.Activity activity = this.f396817e;
        if (activity == null) {
            return;
        }
        bw5.o50 parseFrom = new bw5.o50().parseFrom(itemData);
        if (j17 == 1) {
            cl4.v b17 = b();
            kotlin.jvm.internal.o.d(parseFrom);
            b17.i(activity, parseFrom, null);
        } else if (j17 == 2) {
            cl4.v b18 = b();
            kotlin.jvm.internal.o.d(parseFrom);
            b18.j(activity, parseFrom);
        } else if (j17 == 3) {
            cl4.v b19 = b();
            kotlin.jvm.internal.o.d(parseFrom);
            b19.b(activity, parseFrom, 3);
        }
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void shareContent(com.tencent.pigeon.ting.TingShareDataWrap shareData, com.tencent.pigeon.ting.TingShareConfig config) {
        kotlin.jvm.internal.o.g(shareData, "shareData");
        kotlin.jvm.internal.o.g(config, "config");
        android.app.Activity activity = this.f396817e;
        if (activity == null) {
            return;
        }
        if (config.getShareType() == com.tencent.pigeon.ting.TingShareType.TING_ITEM.getRaw()) {
            if (shareData.getTingItemData() != null) {
                byte[] tingItemData = shareData.getTingItemData();
                kotlin.jvm.internal.o.d(tingItemData);
                if (tingItemData.length == 0) {
                    return;
                }
                ((ku5.t0) ku5.t0.f312615d).k(new rk4.m2(config, this, activity, new bw5.lp0().parseFrom(shareData.getTingItemData()), shareData), 200L);
                return;
            }
            return;
        }
        if (config.getShareType() != com.tencent.pigeon.ting.TingShareType.CATEGORY_ITEM.getRaw() || shareData.getCategoryItemData() == null) {
            return;
        }
        byte[] categoryItemData = shareData.getCategoryItemData();
        kotlin.jvm.internal.o.d(categoryItemData);
        if (categoryItemData.length == 0) {
            return;
        }
        bw5.o50 parseFrom = new bw5.o50().parseFrom(shareData.getCategoryItemData());
        long shareScene = config.getShareScene();
        if (shareScene == 1) {
            cl4.v b17 = b();
            kotlin.jvm.internal.o.d(parseFrom);
            b17.i(activity, parseFrom, config);
        } else if (shareScene == 2) {
            cl4.v b18 = b();
            kotlin.jvm.internal.o.d(parseFrom);
            b18.j(activity, parseFrom);
        } else if (shareScene == 3) {
            cl4.v b19 = b();
            kotlin.jvm.internal.o.d(parseFrom);
            b19.b(activity, parseFrom, 3);
        }
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void shareLyric(byte[] tingItemData, java.util.List lyricItems, double d17, double d18, long j17) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        kotlin.jvm.internal.o.g(lyricItems, "lyricItems");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void shareTingChatRoom(byte[] categoryItemData, byte[] bArr, long j17, long j18) {
        kotlin.jvm.internal.o.g(categoryItemData, "categoryItemData");
        android.app.Activity activity = this.f396817e;
        if (activity == null) {
            return;
        }
        bw5.o50 parseFrom = new bw5.o50().parseFrom(categoryItemData);
        cl4.v b17 = b();
        kotlin.jvm.internal.o.d(parseFrom);
        b17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TingShareHelper", "shareChatRoomToChat categoryId: " + parseFrom.c() + ", categoryType: " + parseFrom.f30964n);
        java.lang.String e17 = b17.e(activity, parseFrom, null);
        if (e17 == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_content", e17);
        intent.putExtra("Multi_Retr", true);
        intent.putExtra("Retr_go_to_chattingUI", false);
        intent.putExtra("Retr_show_success_tips", true);
        j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, 1006);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void shareTingChatRoomForward(byte[] categoryItemData, byte[] bArr, long j17, java.lang.String str, long j18) {
        kotlin.jvm.internal.o.g(categoryItemData, "categoryItemData");
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "shareTingChatRoomForward " + str);
        android.app.Activity activity = this.f396817e;
        if (activity == null) {
            return;
        }
        bw5.o50 parseFrom = new bw5.o50().parseFrom(categoryItemData);
        bw5.v70 parseFrom2 = new bw5.v70().parseFrom(bArr);
        cl4.v b17 = b();
        kotlin.jvm.internal.o.d(parseFrom);
        b17.getClass();
        if (str == null) {
            return;
        }
        android.content.Context baseContext = activity.getBaseContext();
        kotlin.jvm.internal.o.f(baseContext, "getBaseContext(...)");
        java.lang.String e17 = b17.e(baseContext, parseFrom, parseFrom2);
        if (e17 == null) {
            return;
        }
        o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
        cl4.t tVar = new cl4.t(str, e17, activity);
        ((r35.k1) q1Var).getClass();
        r35.i1 i1Var = new r35.i1(activity);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ot0.q v17 = ot0.q.v(e17);
        il4.b bVar = (il4.b) v17.y(il4.b.class);
        if (bVar != null) {
            android.view.View inflate = android.view.View.inflate(activity, com.tencent.mm.R.layout.enx, null);
            com.tencent.mm.plugin.ting.widget.TingChatRoomView tingChatRoomView = (com.tencent.mm.plugin.ting.widget.TingChatRoomView) inflate.findViewById(com.tencent.mm.R.id.vfa);
            tingChatRoomView.setContainerBackgroundColor(activity.getResources().getColor(com.tencent.mm.R.color.f478492d));
            java.lang.String title = v17.f348654f;
            kotlin.jvm.internal.o.f(title, "title");
            tingChatRoomView.c(il4.d.d(activity, title, bVar.f292100f, bVar.f292101g));
            i1Var.c(inflate);
            i1Var.h(false);
        }
        i1Var.l(str);
        i1Var.g(java.lang.Boolean.TRUE);
        i1Var.h(false);
        i1Var.j(com.tencent.mm.R.string.f490551ya);
        i1Var.a(tVar);
        i1Var.f369136c.show();
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void shareTingItem(byte[] tingItemData, byte[] bArr, byte[] bArr2, long j17) {
        kotlin.jvm.internal.o.g(tingItemData, "tingItemData");
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "shareTingItem shareScene: " + j17);
        bw5.lp0 parseFrom = new bw5.lp0().parseFrom(tingItemData);
        android.app.Activity activity = this.f396817e;
        if (activity == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).k(new rk4.o2(j17, this, activity, parseFrom, bArr), 200L);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public boolean showAudioRedDot() {
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        rk4.p2 p2Var = new rk4.p2(c0Var);
        ((ef0.z3) ((qk.d9) i95.n0.c(qk.d9.class))).getClass();
        p2Var.invoke(java.lang.Boolean.valueOf(em4.b.f255212a));
        return c0Var.f310112d;
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
        android.app.Activity activity = this.f396817e;
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
        android.content.Context context = this.f396817e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.r2(config, this, context, callback, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void showSessionSelectViewAndGetInfo(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        android.content.Context context = this.f396817e;
        if (context == null) {
            context = a();
        }
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.t2(this, context, callback, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void showSharePreConfirmView(com.tencent.pigeon.ting.ContactInfoWrap contactInfo, byte[] categoryItemData, byte[] listenItemData, yz5.l callback) {
        kotlin.jvm.internal.o.g(contactInfo, "contactInfo");
        kotlin.jvm.internal.o.g(categoryItemData, "categoryItemData");
        kotlin.jvm.internal.o.g(listenItemData, "listenItemData");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f396817e;
        if (activity == null) {
            return;
        }
        bw5.o50 parseFrom = new bw5.o50().parseFrom(categoryItemData);
        bw5.v70 parseFrom2 = new bw5.v70().parseFrom(listenItemData);
        cl4.v b17 = b();
        kotlin.jvm.internal.o.d(parseFrom);
        java.lang.String e17 = b17.e(activity, parseFrom, parseFrom2);
        if (e17 == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
            return;
        }
        oe5.a aVar = new oe5.a();
        e15.k kVar = new e15.k();
        kVar.fromXml(e17);
        aVar.k(kVar);
        n13.t tVar = new n13.t();
        tVar.f334134b = new rk4.v2(e17, contactInfo, this, callback);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new rk4.u2(activity, aVar, contactInfo, tVar, null), 3, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void startRecognizeSong(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void startRecord(long j17, long j18, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        d75.b.g(new rk4.a3(j17, j18, this, callback, this.f396821i));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void startRecordWithConfiguration(com.tencent.pigeon.ting.TingAudioRecordConfiguration configuration, yz5.l callback) {
        kotlin.jvm.internal.o.g(configuration, "configuration");
        kotlin.jvm.internal.o.g(callback, "callback");
        d75.b.g(new rk4.f3(configuration, this, callback, this.f396821i));
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
        d75.b.g(new rk4.h3(callback));
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void stopVoiceInput() {
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void updateCurrentMultiTaskId(java.lang.String str, boolean z17) {
        ia0.n nVar = (ia0.n) i95.n0.c(ia0.n.class);
        android.content.Context context = this.f396817e;
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
        java.lang.String path = localPhotoResult.getPath();
        if (path == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.ting.UploadLocalPhotoResult(-1L, "empty image path", null, 4, null))));
            return;
        }
        dl4.j jVar = new dl4.j(new rk4.j3(callback));
        rk4.k5.e("uploadImage path:".concat(path), jVar.f235419b);
        dn.m mVar = new dn.m();
        mVar.field_fileType = 20303;
        mVar.field_appType = com.tencent.mars.cdn.CdnManager.kAppTypeTingImage;
        mVar.f241789h = 3;
        mVar.field_mediaId = path;
        mVar.field_fullpath = com.tencent.mm.vfs.w6.i(path, false);
        ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).getClass();
        com.tencent.mm.modelcdntran.z aj6 = com.tencent.mm.modelcdntran.s1.aj();
        v65.i.c(new com.tencent.mm.sdk.coroutines.LifecycleScope("ImageUploadTask", null, 0, 6, null), null, new dl4.i(aj6 != null ? aj6.e7(mVar) : null, jVar, null), 1, null);
    }

    @Override // com.tencent.pigeon.ting.TingNativeController
    public void uploadRecordFileToCdn(java.lang.String localFilePath, yz5.l callback) {
        kotlin.jvm.internal.o.g(localFilePath, "localFilePath");
        kotlin.jvm.internal.o.g(callback, "callback");
        jm4.h5.h(localFilePath, new rk4.k3(callback));
    }
}
