package yg0;

@j95.b
/* loaded from: classes8.dex */
public final class o3 extends i95.w implements tg0.l1 {

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f462234h;

    /* renamed from: i, reason: collision with root package name */
    public int f462235i;

    /* renamed from: d, reason: collision with root package name */
    public final ch0.b0 f462230d = new ch0.b0();

    /* renamed from: e, reason: collision with root package name */
    public final ch0.a0 f462231e = new ch0.a0();

    /* renamed from: f, reason: collision with root package name */
    public final ch0.e0 f462232f = new ch0.e0();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f462233g = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final android.os.MessageQueue.IdleHandler f462236m = yg0.m3.f462218d;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f462237n = new yg0.i3(this);

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f462238o = new yg0.j3(this);

    /* renamed from: p, reason: collision with root package name */
    public final ch0.n0 f462239p = new ch0.n0();

    public void Ai(java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        java.lang.String str = (java.lang.String) params.get("boxId");
        if (str == null) {
            str = "";
        }
        ch0.k c17 = ch0.d0.f41199a.c(-1, this.f462234h, params);
        ch0.b0 b0Var = this.f462230d;
        b0Var.getClass();
        b0Var.f41195b.f41235a.put(str, c17);
        yg0.h3 h3Var = new yg0.h3(this, c17);
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            h3Var.run();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).D(new tg0.e2(h3Var));
    }

    public void Bi(int i17, boolean z17) {
        java.lang.ref.WeakReference weakReference;
        com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI;
        com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI2;
        ch0.z b17 = this.f462231e.b();
        if ((b17 != null ? b17.f41273m : null) != null) {
            ch0.h hVar = b17.f41273m;
            if (hVar != null) {
                hVar.e(i17);
                return;
            }
            return;
        }
        if (b17 != null) {
            b17.f41268h = true;
        }
        ch0.k kVar = this.f462230d.f41194a.f41240b;
        tg0.c1 c1Var = kVar != null ? kVar.f41233c : null;
        if (c1Var != null) {
            c1Var.f419029a = (z17 || this.f462234h) ? 1 : 0;
        }
        if (kVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "createViewFromNative, createData is null");
        }
        if (kVar == null) {
            kVar = ch0.d0.f41199a.c(-1, z17 || this.f462234h, null);
        }
        ch0.k kVar2 = kVar;
        int i18 = kVar2.f41232b;
        tg0.f2 f2Var = tg0.g2.f419073e;
        if (i18 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "createViewFromNative, mode is not H5_PAGE, just quit");
            return;
        }
        if (b17 == null || (weakReference = b17.f41266f) == null || (preLoadWebViewUI = (com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI) weakReference.get()) == null) {
            return;
        }
        java.lang.ref.WeakReference weakReference2 = b17.f41266f;
        this.f462235i = (weakReference2 == null || (preLoadWebViewUI2 = (com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI) weakReference2.get()) == null) ? 0 : preLoadWebViewUI2.getIntent().getIntExtra("ftspreloadScene", 0);
        if (preLoadWebViewUI.E3.f367396e && !this.f462230d.e(kVar2.f41233c.f419036h)) {
            fj(kVar2);
        }
        b17.f41273m = new ch0.h();
        android.view.View r96 = preLoadWebViewUI.r9();
        android.widget.FrameLayout frameLayout = r96 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) r96 : null;
        ch0.a c17 = b17.c();
        ch0.h hVar2 = b17.f41273m;
        kotlin.jvm.internal.o.d(hVar2);
        tg0.c2 Ni = Ni(c17, preLoadWebViewUI, kVar2, hVar2.f41223j, frameLayout);
        tg0.d1 d1Var = Ni.f419050e;
        b17.f41271k = d1Var instanceof ch0.a ? (ch0.a) d1Var : null;
        ch0.h hVar3 = b17.f41273m;
        if (hVar3 != null) {
            hVar3.f41214a = Ni;
            hVar3.f41216c = frameLayout;
            tg0.s2 s2Var = Ni.f419051f;
            android.view.View view = s2Var != null ? ((ch0.p0) s2Var).f41251a : null;
            android.app.Activity containerActivity = preLoadWebViewUI.getContainerActivity();
            if (view == null) {
                view = new android.view.View(containerActivity);
            }
            hVar3.f41215b = view;
            tg0.c2 c2Var = hVar3.f41214a;
            if (c2Var != null && c2Var.f419046a) {
                hVar3.f();
            }
        }
        ch0.h hVar4 = b17.f41273m;
        if (hVar4 != null) {
            hVar4.e(i17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tg0.c2 Di(android.content.Context r25, int r26, java.util.Map r27, tg0.b2 r28) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yg0.o3.Di(android.content.Context, int, java.util.Map, tg0.b2):tg0.c2");
    }

    public final tg0.c2 Ni(ch0.a aVar, com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI, ch0.k kVar, tg0.b2 b2Var, android.widget.FrameLayout frameLayout) {
        ch0.a a17;
        ch0.c0 c0Var = ch0.d0.f41199a;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "create, no cache");
            if (preLoadWebViewUI.L3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "create, no cache, create from new instance");
                a17 = ch0.r.f41252a.a(kVar, preLoadWebViewUI, b2Var, this.f462232f, frameLayout);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "create, no cache, create from preload webview");
                a17 = ch0.s.f41253a.a(kVar, preLoadWebViewUI, b2Var, this.f462232f, frameLayout);
            }
            ch0.a aVar2 = a17;
            return Vi(aVar2, kVar, b2Var, c0Var.b(preLoadWebViewUI, kVar), aVar2.f41187c.f367396e, true);
        }
        aVar.f41187c.f367401j = new ch0.i0(b2Var);
        if (aVar.f41190f == ch0.o0.f41246d) {
            qx4.d0 d0Var = aVar.f41187c;
            d0Var.f367403l = null;
            if (!d0Var.f367396e) {
                aVar.f41187c.p(new ch0.o(b2Var));
                java.lang.String stringExtra = preLoadWebViewUI.getIntent().getStringExtra("ftsrealurl");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                int i17 = kVar.f41233c.f419041m;
                int i18 = su4.k2.f412978a;
                jx3.f.INSTANCE.d(27700, 10, stringExtra, java.lang.Integer.valueOf(i17));
            }
            this.f462232f.a(kVar.f41232b, aVar.f41186b, frameLayout);
        }
        int i19 = aVar.f41185a;
        tg0.f2 f2Var = tg0.g2.f419073e;
        if (i19 == 1) {
            android.view.ViewParent parent = aVar.f41186b.getParent();
            android.widget.FrameLayout frameLayout2 = parent instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent : null;
            if (frameLayout2 != null && !kotlin.jvm.internal.o.b(frameLayout2, frameLayout)) {
                java.lang.String content = "configCachedBean, webView parent changed, new parent: " + frameLayout;
                kotlin.jvm.internal.o.g(content, "content");
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content);
                frameLayout2.removeView(aVar.f41186b);
                if (frameLayout != null) {
                    frameLayout.addView(aVar.f41186b, 0);
                }
            }
        }
        if (aVar.f41189e == ch0.f0.f41204e) {
            preLoadWebViewUI.J3 = new ch0.j(b2Var);
        }
        java.lang.String b17 = c0Var.b(preLoadWebViewUI, kVar);
        boolean z17 = aVar.f41190f != ch0.o0.f41248f;
        java.lang.String content2 = "create, use cache, needNotifyH5Result: " + z17;
        kotlin.jvm.internal.o.g(content2, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content2);
        return Vi(aVar, kVar, b2Var, b17, aVar.f41187c.f367396e, z17);
    }

    public tg0.k1 Ri() {
        return this.f462231e.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.tencent.mm.feature.webview.platformwebsearch.PlatformWSFScene$bindActivity$observer$1, androidx.lifecycle.x] */
    public void Ui(androidx.appcompat.app.AppCompatActivity activity) {
        java.lang.Object m521constructorimpl;
        java.lang.Object m521constructorimpl2;
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!(activity instanceof com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "intoActivity, activity is not correct");
            return;
        }
        int hashCode = activity.hashCode();
        java.lang.String content = "intoActivity, hashCode: " + hashCode;
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        ch0.a0 a0Var = this.f462231e;
        if (hashCode == a0Var.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "intoActivity, has called, just quit");
            return;
        }
        a0Var.f41192b.addLast(java.lang.Integer.valueOf(hashCode));
        final com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI = (com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI) activity;
        java.lang.String stringExtra = preLoadWebViewUI.getIntent().getStringExtra("ftsrealurl");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        final ch0.z zVar = new ch0.z(a0Var);
        zVar.f41265e = preLoadWebViewUI.hashCode();
        zVar.f41266f = new java.lang.ref.WeakReference(preLoadWebViewUI);
        ?? r86 = new androidx.lifecycle.f() { // from class: com.tencent.mm.feature.webview.platformwebsearch.PlatformWSFScene$bindActivity$observer$1
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("activity destroy, clearing service cache for: ");
                ch0.z zVar2 = ch0.z.this;
                sb6.append(zVar2.f41265e);
                java.lang.String content2 = sb6.toString();
                kotlin.jvm.internal.o.g(content2, "content");
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content2);
                tg0.z1 z1Var = zVar2.f41270j;
                if (z1Var != null) {
                    ((ch0.y) z1Var).a();
                }
                ch0.h hVar = zVar2.f41273m;
                if (hVar != null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.FTSPlatformWebView", "dummy platform WebView, activity destroy");
                    hVar.f41221h = true;
                    tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
                    if (l1Var != null) {
                        tg0.c2 c2Var = hVar.f41214a;
                        ((yg0.o3) l1Var).hj(c2Var != null ? c2Var.f419056k : 0, true, c2Var != null ? c2Var.f419050e : null, c2Var != null ? c2Var.f419054i : null);
                    }
                    hVar.f41214a = null;
                    hVar.f41215b = null;
                    hVar.f41217d = null;
                }
                zVar2.f41273m = null;
                int i17 = zVar2.f41265e;
                ch0.a0 a0Var2 = zVar2.f41261a;
                a0Var2.f41191a.remove(java.lang.Integer.valueOf(i17));
                a0Var2.f41192b.remove(java.lang.Integer.valueOf(i17));
                java.lang.ref.WeakReference weakReference = zVar2.f41266f;
                if (weakReference != null) {
                    weakReference.clear();
                }
                zVar2.f41266f = null;
                tg0.l1 l1Var2 = (tg0.l1) i95.n0.c(tg0.l1.class);
                if (l1Var2 != null) {
                    ((yg0.o3) l1Var2).hj(zVar2.f41265e, true, null, null);
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("activity destroy, unuse pool size: ");
                java.util.LinkedList linkedList = zVar2.f41272l;
                sb7.append(linkedList.size());
                java.lang.String content3 = sb7.toString();
                kotlin.jvm.internal.o.g(content3, "content");
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content3);
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    zVar2.a((ch0.a) it.next());
                }
                linkedList.clear();
                ((java.util.LinkedHashMap) zVar2.f41274n).clear();
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onResume(androidx.lifecycle.y owner) {
                tg0.l1 l1Var;
                kotlin.jvm.internal.o.g(owner, "owner");
                if (preLoadWebViewUI.K3) {
                    ch0.z zVar2 = ch0.z.this;
                    if (!zVar2.f41275o && (l1Var = (tg0.l1) i95.n0.c(tg0.l1.class)) != null) {
                        ((yg0.o3) l1Var).ij();
                    }
                    zVar2.f41275o = false;
                }
            }
        };
        preLoadWebViewUI.mo133getLifecycle().a(r86);
        zVar.f41270j = new ch0.y(zVar, preLoadWebViewUI, r86);
        zVar.f41267g = preLoadWebViewUI.getIntent().getBooleanExtra("KHalfScreenSearchUseFlutter", false);
        java.util.Map map = zVar.f41274n;
        ((java.util.LinkedHashMap) map).clear();
        if (r26.n0.N(stringExtra) ^ true) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                android.net.Uri parse = android.net.Uri.parse(stringExtra);
                for (java.lang.String str2 : parse.getQueryParameterNames()) {
                    java.lang.String queryParameter = parse.getQueryParameter(str2);
                    if (queryParameter != null) {
                        kotlin.jvm.internal.o.d(str2);
                    }
                }
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "parseRawUrlParams exception: " + m524exceptionOrNullimpl);
            }
        }
        java.util.Map unmodifiableMap = java.util.Collections.unmodifiableMap(map);
        kotlin.jvm.internal.o.f(unmodifiableMap, "unmodifiableMap(...)");
        try {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            java.lang.String str3 = (java.lang.String) unmodifiableMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            java.lang.String str4 = "0";
            if (str3 == null) {
                str3 = "0";
            }
            zVar.f41262b = java.lang.Integer.parseInt(str3);
            java.lang.String str5 = (java.lang.String) unmodifiableMap.get("type");
            if (str5 != null) {
                str4 = str5;
            }
            zVar.f41263c = java.lang.Integer.parseInt(str4);
            java.lang.String str6 = (java.lang.String) unmodifiableMap.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
            if (str6 != null) {
                str = str6;
            }
            zVar.f41264d = str;
            java.lang.String content2 = "intoActivity, scene:" + zVar.f41262b + ", type:" + zVar.f41263c + ", sessionId:" + zVar.f41264d;
            kotlin.jvm.internal.o.g(content2, "content");
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content2);
            tg0.f2 f2Var = tg0.g2.f419073e;
            m521constructorimpl2 = kotlin.Result.m521constructorimpl(tg0.m1.b(zVar.b(1, new tg0.c1(0, 0, null, null, null, 0, 0, null, null, null, 0, null, 0, 0, 0, 0.0d, 0L, 131071, null))));
        } catch (java.lang.Throwable th7) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
        }
        java.lang.Throwable m524exceptionOrNullimpl2 = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl2);
        if (m524exceptionOrNullimpl2 != null) {
            java.lang.String content3 = "intoActivity, exception e:" + m524exceptionOrNullimpl2;
            kotlin.jvm.internal.o.g(content3, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content3);
        }
        a0Var.getClass();
        a0Var.f41191a.put(java.lang.Integer.valueOf(a0Var.a()), zVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0039, code lost:
    
        if (r5.f367397f != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final tg0.c2 Vi(ch0.a r26, ch0.k r27, tg0.b2 r28, java.lang.String r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yg0.o3.Vi(ch0.a, ch0.k, tg0.b2, java.lang.String, boolean, boolean):tg0.c2");
    }

    public void Zi(java.lang.String event, java.lang.String params) {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(params, "params");
        ch0.n0 n0Var = this.f462239p;
        n0Var.getClass();
        java.lang.String content = "notify flutter event: ".concat(event);
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.wechat.aff.websearch.WebSearchPlatformManagerBase.Callback callback = n0Var.f41244a;
            if (callback != null) {
                callback.onNativeEventsEvent(event, params);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            java.lang.String content2 = "notify flutter event exception: " + m524exceptionOrNullimpl;
            kotlin.jvm.internal.o.g(content2, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content2);
        }
    }

    public void aj(int i17) {
        boolean z17 = i17 == 8;
        java.lang.String content = "flutter container visible changed, visible: " + i17 + ", set focus: " + z17;
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        bj(z17);
    }

    public void bj(boolean z17) {
        java.lang.String content = "focus changed, hasFocus: " + z17;
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        this.f462234h = z17;
        java.util.Iterator it = this.f462233g.iterator();
        while (it.hasNext()) {
            ((ch0.i) ((tg0.b) it.next())).f41226a.d(z17);
        }
    }

    public void cj(java.util.Map createParams) {
        kotlin.jvm.internal.o.g(createParams, "createParams");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "into preCreateView");
        ch0.k c17 = ch0.d0.f41199a.c(-1, this.f462234h, createParams);
        int i17 = c17.f41232b;
        tg0.f2 f2Var = tg0.g2.f419073e;
        if (i17 != 1) {
            Ai(createParams);
            return;
        }
        ch0.b0 b0Var = this.f462230d;
        b0Var.getClass();
        synchronized (b0Var.f41194a) {
            b0Var.f41194a.f41240b = c17;
        }
        java.lang.Runnable runnable = this.f462238o;
        kotlin.jvm.internal.o.g(runnable, "runnable");
        if (kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            ((yg0.j3) runnable).run();
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).D(new tg0.e2(runnable));
    }

    public final void fj(ch0.k kVar) {
        ch0.a c17;
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView;
        ch0.z b17 = this.f462231e.b();
        ch0.a aVar = null;
        if ((b17 != null ? b17.f41266f : null) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "preCreateViewInner, activity is null, just quit");
            return;
        }
        java.lang.ref.WeakReference weakReference = b17.f41266f;
        com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI preLoadWebViewUI = weakReference != null ? (com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI) weakReference.get() : null;
        if (preLoadWebViewUI == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "preCreateViewInner, activity is null, just quit");
            return;
        }
        int i17 = b17.f41262b;
        tg0.c1 c1Var = kVar.f41233c;
        if (i17 != c1Var.f419041m) {
            java.lang.String content = "preCreateViewInner, scene not match, our scene: " + b17.f41262b + ", param scene: " + kVar.f41233c.f419041m;
            kotlin.jvm.internal.o.g(content, "content");
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
            return;
        }
        if (!b17.f41268h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "preCreateViewInner, current scene not ready, just quit");
            return;
        }
        int i18 = kVar.f41232b;
        tg0.f2 f2Var = tg0.g2.f419073e;
        if (i18 == 1) {
            if (this.f462230d.e(c1Var.f419036h)) {
                return;
            }
            if (b17.f41271k != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "preCreateViewInner, mode is H5_PAGE, has add in Layout, just notify result");
                tg0.a2 a2Var = b17.f41269i;
                if (a2Var != null) {
                    tg0.c1 result = kVar.f41233c;
                    kotlin.jvm.internal.o.g(result, "result");
                    ((ch0.p) a2Var).f41250a.c(result);
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "preCreateViewInner, will preCreate cache bean");
        android.view.View r96 = preLoadWebViewUI.r9();
        android.widget.FrameLayout frameLayout = r96 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) r96 : null;
        ch0.z b18 = this.f462231e.b();
        if (!(b18 != null && b18.f41272l.isEmpty())) {
            ch0.z b19 = this.f462231e.b();
            if (b19 != null && (c17 = b19.c()) != null) {
                qx4.d0 d0Var = c17.f41187c;
                if (d0Var.f367396e) {
                    java.lang.String content2 = "preCreate by cache, current result not notify to H5, hasCalledOnUiInit: " + d0Var.f367397f + ", data mode: " + kVar.f41232b + ", cache mode: " + c17.f41185a;
                    kotlin.jvm.internal.o.g(content2, "content");
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content2);
                    if (kVar.f41232b != 1) {
                        this.f462230d.b(kVar.f41233c, d0Var);
                    } else if (d0Var.f367397f && kVar.f41232b == c17.f41185a) {
                        this.f462230d.a(kVar.f41233c, d0Var);
                    } else {
                        this.f462230d.c(kVar.f41233c, d0Var);
                    }
                    d0Var.f367403l = null;
                    d0Var.f367401j = null;
                    aVar = wi(kVar.f41232b, c17.f41186b, d0Var, c17.f41188d, c17.f41189e);
                } else {
                    if (kVar.f41232b == 1) {
                        d0Var.p(new yg0.l3(this));
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "preCreate by cache, js no ready, just quit");
                }
            }
        } else if (preLoadWebViewUI.L3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "preCreate by preload, activity preload webview has used, just quit");
        } else {
            qx4.d0 d0Var2 = preLoadWebViewUI.E3;
            if (d0Var2.f367396e) {
                if (preLoadWebViewUI.L3) {
                    baseWebSearchWebView = null;
                } else {
                    preLoadWebViewUI.L3 = true;
                    baseWebSearchWebView = (com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView) preLoadWebViewUI.f183815f;
                }
                if (baseWebSearchWebView == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "preCreate by preload, WebView is null");
                } else {
                    java.lang.String content3 = "preCreate by preload, current result not notify to H5, hasCalledOnUiInit: " + d0Var2.f367397f;
                    kotlin.jvm.internal.o.g(content3, "content");
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content3);
                    if (kVar.f41232b != 1) {
                        this.f462230d.b(kVar.f41233c, d0Var2);
                    } else if (d0Var2.f367397f) {
                        this.f462230d.a(kVar.f41233c, d0Var2);
                    } else {
                        this.f462230d.c(kVar.f41233c, d0Var2);
                    }
                    d0Var2.f367403l = null;
                    int i19 = kVar.f41232b;
                    com.tencent.mm.plugin.webview.core.e3 controller = preLoadWebViewUI.L1;
                    kotlin.jvm.internal.o.f(controller, "controller");
                    aVar = wi(i19, baseWebSearchWebView, d0Var2, controller, ch0.f0.f41203d);
                }
            } else {
                if (kVar.f41232b == 1) {
                    d0Var2.p(new yg0.l3(this));
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "preCreate by preload, js no ready, just quit");
            }
        }
        if (aVar != null) {
            this.f462232f.a(kVar.f41232b, aVar.f41186b, frameLayout);
        }
    }

    public void hj(int i17, boolean z17, tg0.d1 d1Var, tg0.b bVar) {
        java.lang.String content = "releaseView, will destroy hashcode: " + i17;
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        if (bVar != null) {
            this.f462233g.remove(bVar);
        }
        ch0.a0 a0Var = this.f462231e;
        ch0.z zVar = (ch0.z) ((java.util.LinkedHashMap) a0Var.f41191a).get(java.lang.Integer.valueOf(i17));
        if (zVar != null) {
            zVar.f41269i = null;
        }
        if (zVar != null) {
            zVar.f41271k = null;
        }
        int a17 = a0Var.a();
        if (a17 <= 0 || a17 == i17) {
            this.f462230d.d();
        } else {
            java.lang.String content2 = "releaseView, hashcode not match, current hashcode: " + a17 + ", old hashcode: " + i17;
            kotlin.jvm.internal.o.g(content2, "content");
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", content2);
        }
        if (z17) {
            a0Var.f41191a.remove(java.lang.Integer.valueOf(i17));
            a0Var.f41192b.remove(java.lang.Integer.valueOf(i17));
        }
        ch0.a aVar = d1Var instanceof ch0.a ? (ch0.a) d1Var : null;
        if (aVar != null) {
            ch0.c0 c0Var = ch0.d0.f41199a;
            com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView = aVar.f41186b;
            android.content.Context context = baseWebSearchWebView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.app.Activity a18 = c0Var.a(context);
            if (a18 instanceof com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI) {
                ((com.tencent.mm.plugin.webview.ui.tools.fts.PreLoadWebViewUI) a18).J3 = null;
            }
            baseWebSearchWebView.setOnTouchUp(null);
            qx4.d0 d0Var = aVar.f41187c;
            d0Var.f367401j = null;
            d0Var.p(null);
            if (z17) {
                if (baseWebSearchWebView.f211376y) {
                    return;
                }
                baseWebSearchWebView.removeJavascriptInterface("webSearchJSApi");
                nw4.n nVar = d0Var.f367394c;
                if (nVar != null) {
                    nVar.f340889c = null;
                }
                d0Var.f367401j = null;
                d0Var.f367402k = null;
                d0Var.f14326a = null;
                java.lang.Object webViewClient = baseWebSearchWebView.getWebViewClient();
                if (webViewClient instanceof zg0.q2) {
                    ((com.tencent.mm.plugin.webview.core.e3) ((zg0.q2) webViewClient)).D0();
                }
                baseWebSearchWebView.destroy();
                return;
            }
            if (zVar != null) {
                java.util.LinkedList linkedList = zVar.f41272l;
                if (linkedList.size() >= 2) {
                    zVar.a(aVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "destroy webview bean due to cache pool full");
                    return;
                }
                linkedList.addLast(aVar);
                java.lang.String content3 = "cache webview for activity: " + zVar.f41265e + ", pool size: " + linkedList.size();
                kotlin.jvm.internal.o.g(content3, "content");
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content3);
            }
        }
    }

    public void ij() {
        java.lang.String content = "startIdlePreload, lastPreloadScene: " + this.f462235i;
        kotlin.jvm.internal.o.g(content, "content");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
        if (qx4.l0.f367422a.b(this.f462235i) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "startIdlePreload, can preCreate WebView");
            ((ku5.t0) ku5.t0.f312615d).D(this.f462237n);
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.wechat.aff.websearch.WebsearchPlatformManagerOnLoader.getInstance().registerWebSearchPlatformManager(new yg0.k3(this));
    }

    public final ch0.a wi(int i17, com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView, qx4.d0 d0Var, com.tencent.mm.plugin.webview.core.e3 e3Var, ch0.f0 f0Var) {
        ch0.a aVar = new ch0.a(i17, baseWebSearchWebView, d0Var, e3Var, f0Var, ch0.o0.f41248f, null, 64, null);
        ch0.z b17 = this.f462231e.b();
        if (b17 != null) {
            java.util.LinkedList linkedList = b17.f41272l;
            if (linkedList.size() >= 2) {
                b17.a(aVar);
            } else {
                linkedList.addFirst(aVar);
                java.lang.String content = "cache webview for activity: " + b17.f41265e + ", pool size: " + linkedList.size();
                kotlin.jvm.internal.o.g(content, "content");
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", content);
            }
        }
        return aVar;
    }
}
