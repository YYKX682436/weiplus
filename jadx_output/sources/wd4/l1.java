package wd4;

/* loaded from: classes12.dex */
public final class l1 {

    /* renamed from: g, reason: collision with root package name */
    public static final wd4.z0 f444950g = new wd4.z0(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f444951h;

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f444952a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f444953b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f444954c;

    /* renamed from: d, reason: collision with root package name */
    public long f444955d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f444956e;

    /* renamed from: f, reason: collision with root package name */
    public kd0.p2 f444957f;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f444951h = hashMap;
        hashMap.put(-1, new wd4.y0(com.tencent.mm.R.string.j9y, com.tencent.mm.R.raw.icons_outlined_delete, 0, null, 12, null));
        hashMap.put(1000, new wd4.y0(com.tencent.mm.R.string.jeg, com.tencent.mm.R.raw.icons_outlined_lock, 0, null, 12, null));
        hashMap.put(1002, new wd4.y0(com.tencent.mm.R.string.i89, com.tencent.mm.R.raw.icons_outlined_download, 0, null, 12, null));
        hashMap.put(1003, new wd4.y0(com.tencent.mm.R.string.jdx, com.tencent.mm.R.raw.icons_filled_share, com.tencent.mm.R.color.f478502m, null, 8, null));
        hashMap.put(1004, new wd4.y0(com.tencent.mm.R.string.j_w, 0, 0, null, 14, null));
        hashMap.put(1005, new wd4.y0(com.tencent.mm.R.string.jef, com.tencent.mm.R.raw.icons_outlined_lock_on, 0, null, 12, null));
        hashMap.put(1015, new wd4.y0(com.tencent.mm.R.string.j_c, com.tencent.mm.R.raw.icons_outlined_group_detail, 0, null, 12, null));
        hashMap.put(1017, new wd4.y0(com.tencent.mm.R.string.jf9, com.tencent.mm.R.raw.sns_icons_outlined_top, 0, null, 12, null));
        hashMap.put(1018, new wd4.y0(com.tencent.mm.R.string.jez, com.tencent.mm.R.raw.sns_icons_outlined_top_off, 0, null, 12, null));
        hashMap.put(java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_OUT), new wd4.y0(com.tencent.mm.R.string.jdv, -1, 0, null, 12, null));
        hashMap.put(1006, new wd4.y0(com.tencent.mm.R.string.hjg, com.tencent.mm.R.raw.bottomsheet_icon_fav, com.tencent.mm.R.color.a9e, null, 8, null));
        hashMap.put(1008, new wd4.y0(com.tencent.mm.R.string.f490508x2, com.tencent.mm.R.raw.icons_outlined_open, 0, null, 12, null));
        hashMap.put(1009, new wd4.y0(com.tencent.mm.R.string.b2f, com.tencent.mm.R.raw.icons_outlined_translate, 0, null, 12, null));
        hashMap.put(1010, new wd4.y0(com.tencent.mm.R.string.f491241cg4, com.tencent.mm.R.raw.icons_filled_search_logo, com.tencent.mm.R.color.f478532ac, null, 8, null));
        java.lang.String Di = ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Di(2, 2);
        int Bi = ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Bi(2, 2);
        int Bi2 = ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Bi(2, 2);
        hashMap.put(java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST), new wd4.y0(-1, Bi, Bi2 == com.tencent.mm.R.raw.icons_filled_image_recognize_logo ? com.tencent.mm.R.color.f478502m : Bi2 == com.tencent.mm.R.raw.icons_filled_search_logo ? com.tencent.mm.R.color.f478532ac : com.tencent.mm.R.color.f478553an, Di));
        hashMap.put(1011, new wd4.y0(com.tencent.mm.R.string.b2c, com.tencent.mm.R.raw.icons_outlined_ocr, 0, null, 12, null));
        hashMap.put(1012, new wd4.y0(com.tencent.mm.R.string.b2d, com.tencent.mm.R.raw.icons_outlined_pencil, 0, null, 12, null));
        hashMap.put(1013, new wd4.y0(com.tencent.mm.R.string.i8d, com.tencent.mm.R.raw.icons_outlined_download, 0, null, 12, null));
        hashMap.put(1014, new wd4.y0(com.tencent.mm.R.string.f493237je4, com.tencent.mm.R.raw.icons_outlined_download, 0, null, 12, null));
    }

    public l1(android.app.Activity activity, int i17, boolean z17, int i18) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f444952a = activity;
        this.f444953b = z17;
        this.f444954c = jz5.h.b(new wd4.d1(this));
        r45.pk5 f17 = f();
        if (f17 == null) {
            return;
        }
        f17.f383137i = i17;
    }

    public static final void a(wd4.l1 l1Var, android.content.Context context, int[] iArr, db5.g4 g4Var) {
        java.lang.String string;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$addMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        l1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        g4Var.clear();
        for (int i17 : iArr) {
            wd4.y0 y0Var = (wd4.y0) f444951h.get(java.lang.Integer.valueOf(i17));
            if (y0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNameResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNameResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                int i18 = y0Var.f445062a;
                if (i18 == -1) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRawName", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRawName", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                    string = y0Var.f445065d;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNameResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNameResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                    string = context.getString(i18);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRawResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRawResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                int i19 = y0Var.f445063b;
                if (i19 == -1) {
                    g4Var.f(i17, string);
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getColorResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getColorResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                    int i27 = y0Var.f445064c;
                    if (i27 == -1) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRawResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRawResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        g4Var.g(i17, string, i19);
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRawResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRawResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        android.content.res.Resources resources = context.getResources();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getColorResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getColorResId", "com.tencent.mm.plugin.sns.ui.sheet.MenuItem");
                        g4Var.h(i17, string, i19, resources.getColor(i27));
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$addMenu", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    public final void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 media) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addQuickShare", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlin.jvm.internal.o.g(media, "media");
        boolean isPhoto = snsInfo.isPhoto();
        r45.pk5 f17 = f();
        if (f17 != null) {
            f17.f383138m = isPhoto ? "3" : "43";
        }
        r45.pk5 f18 = f();
        if (f18 != null) {
            f18.f383139n = "0";
        }
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        new com.tencent.mm.pluginsdk.forward.m().Di(this.f444952a, d(), 4, null, new wd4.c1(this, isPhoto, media, snsInfo));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addQuickShare", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    public final android.app.Activity c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActivity", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActivity", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        return this.f444952a;
    }

    public final com.tencent.mm.ui.widget.dialog.k0 d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = (com.tencent.mm.ui.widget.dialog.k0) ((jz5.n) this.f444954c).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        return k0Var;
    }

    public final kd0.p2 e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImgScanCodeLogic", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        if (this.f444957f == null) {
            ((jd0.q2) ((kd0.x2) i95.n0.c(kd0.x2.class))).getClass();
            this.f444957f = new com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic(this.f444952a);
        }
        kd0.p2 p2Var = this.f444957f;
        kotlin.jvm.internal.o.d(p2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImgScanCodeLogic", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        return p2Var;
    }

    public final r45.pk5 f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecentReportInfo", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        r45.pk5 pk5Var = (r45.pk5) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(this.f444952a, 14, r45.pk5.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecentReportInfo", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        return pk5Var;
    }

    public final boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowing", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        boolean i17 = d().i();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowing", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        return i17;
    }

    public final void h(boolean z17, java.lang.String str, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, java.lang.String str2, boolean z18, r45.jj4 media) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("quickShareInternal", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        kotlin.jvm.internal.o.g(media, "media");
        boolean z19 = snsInfo.getTimeLine().isExcerpt && !com.tencent.mm.sdk.platformtools.t8.K0(snsInfo.getTimeLine().snsExcerptUrl);
        r45.pk5 f17 = f();
        if (f17 != null) {
            f17.f383132d = 3;
            if (z17) {
                f17.f383142q = str2;
            }
            f17.f383140o = (int) (android.os.SystemClock.elapsedRealtime() - f17.f383143r);
        }
        l35.a aVar = l35.a.f315443a;
        android.app.Activity activity = this.f444952a;
        aVar.a(activity);
        if (!z17 || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("quickShareInternal", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            return;
        }
        g45.a aVar2 = g45.b.f268846a;
        if (z19) {
            android.app.Activity activity2 = this.f444952a;
            kotlin.jvm.internal.o.d(str2);
            java.lang.String snsExcerptUrl = snsInfo.getTimeLine().snsExcerptUrl;
            kotlin.jvm.internal.o.f(snsExcerptUrl, "snsExcerptUrl");
            java.lang.String localid = snsInfo.getLocalid();
            kotlin.jvm.internal.o.f(localid, "getLocalid(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shareExceprt", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            aVar2.a(str2, str, 0);
            java.lang.String l17 = com.tencent.mm.plugin.sns.model.i1.l(media);
            tg3.a1 a17 = tg3.t1.a();
            c01.h7 h7Var = new c01.h7();
            h7Var.f37230e = localid;
            ((dk5.s5) a17).bj(activity2, str2, l17, 1, snsExcerptUrl, "", "", h7Var);
            com.tencent.mm.ui.widget.snackbar.j.c(activity2.getString(com.tencent.mm.R.string.fw6), null, activity2, null, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareExceprt", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        } else if (z18) {
            kotlin.jvm.internal.o.d(str2);
            java.lang.String localid2 = snsInfo.getLocalid();
            kotlin.jvm.internal.o.f(localid2, "getLocalid(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shareSendImg", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
            kotlin.jvm.internal.o.g(activity, "activity");
            aVar2.a(str2, str, 0);
            java.lang.String l18 = com.tencent.mm.plugin.sns.model.i1.l(media);
            tg3.a1 a18 = tg3.t1.a();
            c01.h7 h7Var2 = new c01.h7();
            h7Var2.f37230e = localid2;
            ((dk5.s5) a18).Vi(activity, str2, l18, 0, "", "", h7Var2);
            if (!com.tencent.mm.repairer.config.forward.RepairerConfigForwardSnackBarJumpChatting.f192214a.a()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareSheet", "EnterChattingAfterTrans done config disabled");
                com.tencent.mm.ui.widget.snackbar.j.c(activity.getString(com.tencent.mm.R.string.fw6), null, activity, null, null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareSendImg", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        } else {
            wd4.z0 z0Var = f444950g;
            android.app.Activity activity3 = this.f444952a;
            kotlin.jvm.internal.o.d(str2);
            java.lang.String localid3 = snsInfo.getLocalid();
            kotlin.jvm.internal.o.f(localid3, "getLocalid(...)");
            z0Var.c(activity3, str2, str, media, localid3);
        }
        ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().g(str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("quickShareInternal", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    public final void i(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportMenuType", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        if (i17 == 1003) {
            r45.pk5 f17 = f();
            if (f17 != null) {
                f17.f383132d = 2;
            }
        } else {
            r45.pk5 f18 = f();
            if (f18 != null) {
                f18.f383132d = 4;
            }
        }
        r45.pk5 f19 = f();
        if (f19 != null) {
            f19.f383140o = (int) (android.os.SystemClock.elapsedRealtime() - this.f444955d);
        }
        l35.a.f315443a.a(this.f444952a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportMenuType", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    public final void j(db5.t4 listener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnFooterMenuSelectedListener", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        kotlin.jvm.internal.o.g(listener, "listener");
        d().f211889y = new wd4.e1(listener);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnFooterMenuSelectedListener", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    public final void k(yz5.a dismissCb) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnSheetDismissListener", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        kotlin.jvm.internal.o.g(dismissCb, "dismissCb");
        d().p(new wd4.f1(dismissCb, this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnSheetDismissListener", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    public final void l(db5.t4 menuItemSelectedListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSheetSelectedListener", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        kotlin.jvm.internal.o.g(menuItemSelectedListener, "menuItemSelectedListener");
        d().f211881s = new wd4.g1(menuItemSelectedListener, this);
        d().f211884v = new wd4.h1(menuItemSelectedListener, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSheetSelectedListener", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    public final void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryShow", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        d().v();
        this.f444955d = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryShow", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    public final void n(java.util.List firstMenuItems, java.util.List sencondItems, yz5.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSheetMenus", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        kotlin.jvm.internal.o.g(firstMenuItems, "firstMenuItems");
        kotlin.jvm.internal.o.g(sencondItems, "sencondItems");
        wd4.z0 z0Var = f444950g;
        o(z0Var.a(firstMenuItems), z0Var.a(sencondItems), aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSheetMenus", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    public final void o(int[] iArr, int[] sencondItems, yz5.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSheetMenus", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
        kotlin.jvm.internal.o.g(sencondItems, "sencondItems");
        if (iArr != null) {
            d().f211872n = new wd4.i1(this, iArr);
        }
        d().f211874o = new wd4.j1(this, sencondItems);
        d().f211889y = new wd4.k1(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSheetMenus", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l1(android.app.Activity context, int i17) {
        this(context, i17, false, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
