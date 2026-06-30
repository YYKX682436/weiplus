package com.tencent.mm.plugin.websearch.ui;

@db5.a(me1.i.CTRL_INDEX)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/websearch/ui/MMFTSImageRecognitionUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "vv4/a", "vv4/b", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes11.dex */
public final class MMFTSImageRecognitionUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int B = 0;
    public boolean A;

    /* renamed from: d, reason: collision with root package name */
    public int f181632d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f181633e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f181634f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f181635g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f181636h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f181637i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f181638m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f181639n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f181640o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f181641p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f181642q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f181643r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f181644s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f181645t;

    /* renamed from: u, reason: collision with root package name */
    public final int f181646u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f181647v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f181648w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f181649x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f181650y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f181651z;

    public MMFTSImageRecognitionUI() {
        dv4.m mVar = dv4.n.f244017e;
        this.f181634f = jz5.h.b(vv4.b0.f440450d);
        this.f181635g = jz5.h.b(new vv4.z(this));
        this.f181636h = jz5.h.b(vv4.a0.f440443d);
        this.f181637i = jz5.h.b(new vv4.e(this));
        this.f181639n = jz5.h.b(new vv4.d(this));
        this.f181640o = jz5.h.b(new vv4.c(this));
        this.f181641p = jz5.h.b(new vv4.y(this));
        this.f181642q = jz5.h.b(new vv4.h(this));
        this.f181643r = jz5.h.b(new vv4.e0(this));
        this.f181644s = jz5.h.b(new vv4.h0(this));
        this.f181645t = jz5.h.b(new vv4.c0(this));
        this.f181646u = 41;
        this.f181647v = jz5.h.b(new vv4.w(this));
        this.f181648w = jz5.h.b(new vv4.d0(this));
        this.f181649x = jz5.h.b(new vv4.i0(this));
        this.f181650y = jz5.h.b(new vv4.j0(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if ((r5.length() > 0) == true) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T6(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI r4, java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof vv4.f
            if (r0 == 0) goto L16
            r0 = r6
            vv4.f r0 = (vv4.f) r0
            int r1 = r0.f440463f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f440463f = r1
            goto L1b
        L16:
            vv4.f r0 = new vv4.f
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r4 = r0.f440461d
            pz5.a r6 = pz5.a.f359186d
            int r1 = r0.f440463f
            java.lang.String r2 = "MicroMsg.MMFTSImageRecognitionUI"
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            kotlin.ResultKt.throwOnFailure(r4)
            goto Ld8
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.String r4 = "yptest upload start %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            com.tencent.mars.xlog.Log.i(r2, r4, r1)
            r0.f440463f = r3
            kotlinx.coroutines.r r4 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r4.<init>(r0, r3)
            r4.k()
            r0 = 0
            if (r5 == 0) goto L5f
            int r1 = r5.length()
            if (r1 <= 0) goto L5b
            r1 = r3
            goto L5c
        L5b:
            r1 = r0
        L5c:
            if (r1 != r3) goto L5f
            goto L60
        L5f:
            r3 = r0
        L60:
            if (r3 == 0) goto Lb1
            boolean r0 = com.tencent.mm.vfs.w6.j(r5)
            if (r0 == 0) goto Lb1
            boolean r0 = com.tencent.mm.sdk.platformtools.y1.f(r5)
            if (r0 == 0) goto L89
            boolean r0 = com.tencent.mm.sdk.platformtools.y1.g(r5)
            if (r0 == 0) goto L89
            java.lang.Class<k70.y> r0 = k70.y.class
            i95.m r0 = i95.n0.c(r0)
            k70.y r0 = (k70.y) r0
            j70.e r0 = (j70.e) r0
            r0.getClass()
            m11.l0 r0 = m11.b1.Di()
            java.lang.String r5 = r0.P0(r5)
        L89:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "upload_"
            r0.<init>(r1)
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.w2.a(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.cdn.CdnManager$C2CUploadRequest r5 = com.tencent.mars.cdn.CdnManager.createCircleSearchUpload(r0, r5)
            java.lang.Class<com.tencent.mars.cdn.CdnManager> r0 = com.tencent.mars.cdn.CdnManager.class
            com.tencent.mars.app.BaseManager r0 = com.tencent.mars.MarsContext.getManager(r0)
            com.tencent.mars.cdn.CdnManager r0 = (com.tencent.mars.cdn.CdnManager) r0
            zv4.e r1 = new zv4.e
            r1.<init>(r4)
            r0.startC2CUpload(r5, r1)
            goto Ld1
        Lb1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[uploadImage] upload "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " end"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "MicroMsg.FTSImageRecognizeUploader"
            com.tencent.mars.xlog.Log.i(r0, r5)
            r5 = 0
            java.lang.Object r5 = kotlin.Result.m521constructorimpl(r5)
            r4.resumeWith(r5)
        Ld1:
            java.lang.Object r4 = r4.j()
            if (r4 != r6) goto Ld8
            goto Le6
        Ld8:
            r5 = r4
            java.util.Map r5 = (java.util.Map) r5
            java.lang.String r6 = "yptest upload done %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.tencent.mars.xlog.Log.i(r2, r6, r5)
            r6 = r4
        Le6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI.T6(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void V6(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI, java.lang.String str) {
        mMFTSImageRecognitionUI.getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("webview_bg_color_rsID", android.R.color.transparent);
        a17.putExtra("key_back_and_clear_query", true);
        java.util.Map k17 = kz5.c1.k(new jz5.l("parentSearchID", (java.lang.String) ((jz5.n) mMFTSImageRecognitionUI.f181647v).getValue()), new jz5.l("circleToSearch", "1"), new jz5.l("circleToSearchScene", java.lang.String.valueOf(mMFTSImageRecognitionUI.Y6())), new jz5.l("circleToSearchEntrance", java.lang.String.valueOf(mMFTSImageRecognitionUI.X6())));
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        int d76 = mMFTSImageRecognitionUI.d7();
        boolean a18 = tg0.r2.a(mMFTSImageRecognitionUI.d7());
        java.lang.String valueOf = java.lang.String.valueOf(ri.l0.a(k17));
        if (!a18) {
            valueOf = fp.s0.b(valueOf, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        }
        ((sg0.y3) o1Var).getClass();
        int i17 = mMFTSImageRecognitionUI.f181646u;
        java.util.Map c17 = su4.r2.c(d76, false, i17, valueOf);
        java.util.HashMap hashMap = (java.util.HashMap) c17;
        hashMap.put("query", "");
        jz5.g gVar = mMFTSImageRecognitionUI.f181648w;
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, (java.lang.String) ((jz5.n) gVar).getValue());
        hashMap.put("subSessionId", (java.lang.String) ((jz5.n) gVar).getValue());
        boolean a19 = tg0.r2.a(mMFTSImageRecognitionUI.d7());
        jz5.g gVar2 = mMFTSImageRecognitionUI.f181644s;
        hashMap.put("thirdExtParam", a19 ? ((org.json.JSONObject) ((jz5.n) gVar2).getValue()).toString() : fp.s0.b(((org.json.JSONObject) ((jz5.n) gVar2).getValue()).toString(), com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        java.lang.String e17 = su4.r2.e(c17, 0);
        su4.z0 z0Var = (su4.z0) i95.n0.c(su4.z0.class);
        int d77 = mMFTSImageRecognitionUI.d7();
        org.json.JSONObject a27 = ri.l0.a(kz5.c1.k(new jz5.l("url", e17), new jz5.l("initData", str)));
        kotlin.jvm.internal.o.d(a27);
        ((sg0.a2) z0Var).bj(d77, i17, a27);
        a17.putExtra("ftsQuery", "");
        a17.putExtra("hideSearchCancel", true);
        a17.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, (java.lang.String) ((jz5.n) gVar).getValue());
        a17.putExtra("subSessionId", (java.lang.String) ((jz5.n) gVar).getValue());
        a17.putExtra("rawUrl", e17);
        a17.putExtra("ftsbizscene", mMFTSImageRecognitionUI.d7());
        a17.putExtra("ftsType", i17);
        a17.putExtra("key_search_icon_and_hint_fix_default", true);
        a17.putExtra("key_back_btn_type", 2);
        a17.putExtra("ftsInitToSearch", true);
        a17.putExtra("hideSearchInput", true);
        a17.putExtra("hideSearchTitle", true);
        a17.putExtra("key_circle_search_data", str);
        a17.putExtra("webview_bg_color_rsID", 0);
        vv4.n nVar = new vv4.n();
        vv4.m mVar = new vv4.m(mMFTSImageRecognitionUI);
        vv4.o oVar = new vv4.o(mMFTSImageRecognitionUI);
        zg0.f3 f3Var = (zg0.f3) i95.n0.c(zg0.f3.class);
        int Y6 = mMFTSImageRecognitionUI.Y6();
        ((yg0.c4) f3Var).getClass();
        int hashCode = a17.hashCode();
        a17.putExtra("key_halfscreen_id", hashCode);
        a17.putExtra("INTENT_KEY_HALFSCREEN_ENABLE_DRAG", true);
        a17.putExtra("INTENT_KEY_HALFSCREEN_BUNDLE", true);
        ok5.d.b(a17, "INTENT_KEY_HALFSCREEN_STATUS_LISTENER", new yg0.b4(oVar, hashCode), new ok5.h());
        ok5.d.b(a17, "INTENT_KEY_HALFSCREEN_DRAWER_LISTENER", mVar, new ok5.h());
        boolean z17 = Y6 == 12 || Y6 == 13;
        bh5.c cVar = new bh5.c();
        cVar.d(a17);
        bh5.d dVar = cVar.f20922a;
        dVar.f20924a = mMFTSImageRecognitionUI;
        cVar.c(false);
        cVar.e(!z17);
        dVar.f20925b = nVar;
        cVar.f(false);
        dVar.f20927d.x(com.tencent.mm.ui.b4.a(mMFTSImageRecognitionUI));
        if (com.tencent.mm.pluginsdk.model.g4.b()) {
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.CircleToSearchWebViewUI");
        } else {
            dVar.getClass();
            dVar.f20926c = "tools";
            cVar.a("com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI");
        }
        cVar.b(com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen.class);
        cVar.g();
        mMFTSImageRecognitionUI.f181632d = hashCode;
    }

    public final void W6() {
        if (!this.f181633e) {
            ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ui(Y6(), X6(), tg0.e1.f419064g, a7());
        }
        com.tencent.mm.autogen.events.SetMPHalfScreenHeightEvent setMPHalfScreenHeightEvent = new com.tencent.mm.autogen.events.SetMPHalfScreenHeightEvent();
        int i17 = this.f181632d;
        am.bu buVar = setMPHalfScreenHeightEvent.f54767g;
        buVar.f6285a = i17;
        buVar.f6286b = 0.0f;
        buVar.f6287c = 0.2f;
        setMPHalfScreenHeightEvent.e();
        if (setMPHalfScreenHeightEvent.f54768h.f6404a) {
            return;
        }
        finish();
    }

    public final int X6() {
        return ((java.lang.Number) ((jz5.n) this.f181640o).getValue()).intValue();
    }

    public final int Y6() {
        return ((java.lang.Number) ((jz5.n) this.f181639n).getValue()).intValue();
    }

    public final java.lang.String Z6(java.lang.String oriImgPath, dv4.o slice) {
        android.graphics.Bitmap c17;
        kotlin.jvm.internal.o.g(oriImgPath, "oriImgPath");
        kotlin.jvm.internal.o.g(slice, "slice");
        float f17 = slice.f244024a;
        boolean z17 = false;
        boolean z18 = f17 == 0.0f;
        float f18 = slice.f244027d;
        float f19 = slice.f244026c;
        float f27 = slice.f244025b;
        if (z18) {
            if (f27 == 0.0f) {
                if (f19 == 1.0f) {
                    if (f18 == 1.0f) {
                        z17 = true;
                    }
                }
            }
        }
        if (z17 || (c17 = com.tencent.mm.graphics.e.c(oriImgPath)) == null) {
            return oriImgPath;
        }
        int width = c17.getWidth();
        int height = c17.getHeight();
        float f28 = width;
        int b17 = a06.d.b(f17 * f28);
        float f29 = height;
        int b18 = a06.d.b(f27 * f29);
        int b19 = a06.d.b((f19 - f17) * f28);
        int b27 = a06.d.b((f18 - f27) * f29);
        zv4.f fVar = zv4.f.f476460a;
        android.graphics.Bitmap E = com.tencent.mm.sdk.platformtools.x.E(c17, b17, b18, b19, b27, true);
        kotlin.jvm.internal.o.d(E);
        return fVar.b(E, 100, true);
    }

    public final java.util.Map a7() {
        return (java.util.Map) ((jz5.n) this.f181642q).getValue();
    }

    public final yv4.k b7() {
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(yv4.k.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (yv4.k) a17;
    }

    public final android.animation.ValueAnimator c7() {
        return (android.animation.ValueAnimator) ((jz5.n) this.f181636h).getValue();
    }

    public final int d7() {
        return ((java.lang.Number) ((jz5.n) this.f181645t).getValue()).intValue();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        if (this.f181651z) {
            return;
        }
        this.f181651z = true;
        getContentView().post(new vv4.j(this));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eff;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.ui.v9.d(this);
        getWindow().addFlags(134218752);
        getWindow().setNavigationBarColor(-16777216);
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f181635g).getValue();
        android.animation.ValueAnimator c76 = c7();
        if (imageView != null && c76 != null) {
            c76.addListener(new vv4.k(imageView));
            c76.addUpdateListener(new vv4.l(imageView, this));
        }
        if (!c7().isStarted() && !c7().isRunning()) {
            pm0.v.X(new vv4.f0(this));
        }
        java.lang.String stringExtra = getIntent().getStringExtra("image_url");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f181638m = stringExtra;
        android.graphics.RectF rectF = (android.graphics.RectF) getIntent().getParcelableExtra("image_rect");
        java.lang.String stringExtra2 = getIntent().getStringExtra("ext_info");
        java.lang.String str2 = stringExtra2 == null ? "" : stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("pre_request_key");
        java.lang.String str3 = stringExtra3 == null ? "" : stringExtra3;
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.String stringExtra4 = getIntent().getStringExtra("scan_query");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        h0Var.f310123d = stringExtra4;
        java.lang.String str4 = this.f181638m;
        if (str4 == null) {
            kotlin.jvm.internal.o.o("imgPath");
            throw null;
        }
        boolean z17 = str4.length() == 0;
        zv4.f fVar = zv4.f.f476460a;
        if (z17) {
            java.lang.Object obj = a7().get("base64ImageData");
            java.lang.String str5 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str5 == null) {
                str5 = "";
            }
            if (str5.length() > 0) {
                if (r26.n0.L(str5, ";base64,", 0, false, 6, null) >= 0) {
                    str5 = str5.substring(r26.n0.L(str5, ";base64,", 0, false, 6, null) + 8);
                    kotlin.jvm.internal.o.f(str5, "substring(...)");
                }
                byte[] decode = android.util.Base64.decode(str5, 0);
                android.graphics.Bitmap a17 = com.tencent.mm.graphics.e.a(decode, 0, decode.length);
                java.lang.String d17 = a17 != null ? fVar.d(a17, true) : null;
                if (d17 == null) {
                    d17 = "";
                }
                this.f181638m = d17;
            }
        }
        java.lang.String str6 = this.f181638m;
        if (str6 == null) {
            kotlin.jvm.internal.o.o("imgPath");
            throw null;
        }
        if (com.tencent.mm.sdk.platformtools.y1.c(str6)) {
            android.graphics.Bitmap c17 = com.tencent.mm.graphics.e.c(str6);
            if (c17 != null) {
                str = fVar.d(c17, true);
            }
        } else {
            str = str6;
        }
        this.f181638m = str;
        yv4.k b76 = b7();
        java.lang.String str7 = this.f181638m;
        if (str7 == null) {
            kotlin.jvm.internal.o.o("imgPath");
            throw null;
        }
        pm0.v.X(new yv4.g(str7, b76));
        if (kz5.c0.i(0, 6, 7).contains(java.lang.Integer.valueOf(X6()))) {
            pm0.v.X(new yv4.h(true, b7()));
        }
        kotlinx.coroutines.y0 b17 = v65.m.b(this);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(b17, kotlinx.coroutines.internal.b0.f310484a, null, new vv4.v(this, str3, rectF, str2, h0Var, null), 2, null);
        ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ui(Y6(), X6(), tg0.e1.f419063f, a7());
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        su4.r2.o();
        ((com.tencent.mm.sdk.event.IListener) ((jz5.n) this.f181650y).getValue()).alive();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f181633e = true;
        if (!this.A) {
            this.A = true;
            yz5.p pVar = (yz5.p) ((jz5.n) this.f181649x).getValue();
            if (pVar != null) {
                pVar.invoke("enter", null);
            }
        }
        pm0.v.X(new vv4.g0(this));
        ((com.tencent.mm.sdk.event.IListener) ((jz5.n) this.f181650y).getValue()).dead();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(yv4.k.class);
    }
}
