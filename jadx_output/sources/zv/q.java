package zv;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final zv.q f476079a = new zv.q();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f476080b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f476081c;

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f476082d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.Boolean f476083e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f476084f;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.Integer f476085g;

    static {
        jz5.g b17 = jz5.h.b(zv.o.f476063d);
        f476080b = b17;
        f476082d = jz5.h.b(zv.p.f476069d);
        f476084f = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) b17).getValue()).h("BizTimeLineShowRedPacketCover");
    }

    public final void a() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!com.tencent.mm.plugin.websearch.l2.h(0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandEcsFlutterHelper", "fts h5 template not avail");
            return;
        }
        boolean wi6 = ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).wi(179, 0);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, context.getString(com.tencent.mm.R.string.f492174fh4));
        a17.putExtra("searchbar_tips", context.getString(com.tencent.mm.R.string.f492174fh4));
        a17.putExtra("KRightBtn", true);
        a17.putExtra("ftsneedkeyboard", !wi6);
        a17.putExtra("publishIdPrefix", "bs");
        a17.putExtra("ftsbizscene", 179);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(179, true, 0);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0);
        ((sg0.y3) o1Var).getClass();
        java.lang.String f17 = su4.r2.f(D1);
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        a17.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        sb6.append(su4.r2.e(b17, 0));
        sb6.append("&openArticleScene=290");
        a17.putExtra("rawUrl", sb6.toString());
        a17.putExtra("ftsInitToSearch", true);
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("key_preload_biz", 4);
        a17.addFlags(67108864);
        a17.putExtra("KOpenArticleSceneFromScene", 90);
        j45.l.y(context, a17);
        su4.k2.a(179, f17, f17, true, "", 0, "", false, "");
    }

    public final boolean b() {
        y02.v0 a17;
        if (f476083e == null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f476080b).getValue()).i(zv.m.f476028a, false));
            f476083e = valueOf;
            if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE) && (a17 = y02.x0.f458634d.a()) != null) {
                a17.G(bw5.d5.EcsBrandEntryStatusCheck, 5);
            }
        }
        java.lang.Boolean bool = f476083e;
        kotlin.jvm.internal.o.d(bool);
        return bool.booleanValue();
    }

    public final com.tencent.pigeon.biz_base.BizNotifyTipsInfo c() {
        com.tencent.mm.storage.f9 c17;
        java.lang.String str;
        java.lang.String str2;
        ow.n nVar = ow.n.f349259a;
        com.tencent.wechat.mm.brand_service.g0 c18 = yw.a3.f466266a.c();
        long e17 = c18 != null ? c18.e() : 0L;
        com.tencent.pigeon.biz_base.BizNotifyTipsInfo bizNotifyTipsInfo = new com.tencent.pigeon.biz_base.BizNotifyTipsInfo(null, null, null, null, null, null, null, 127, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterHelper", "getBrsNotifyTipsInfo newMsgCount:" + e17);
        if (e17 > 0 && (c17 = nVar.c()) != null) {
            com.tencent.pigeon.biz_base.BizNotifyTipsInfo copy$default = com.tencent.pigeon.biz_base.BizNotifyTipsInfo.copy$default(bizNotifyTipsInfo, null, java.lang.Long.valueOf(c17.getMsgId()), null, null, null, null, null, 125, null);
            boolean z17 = true;
            if (c17.getType() == 318767153) {
                uw.f fVar = uw.f.f431490a;
                java.util.Map a17 = fVar.a(uw.e.f431486d, c17);
                if (a17 == null || (str = (java.lang.String) a17.get(".msg.fromusername")) == null) {
                    str = "";
                }
                java.util.Map a18 = fVar.a(uw.e.f431488f, c17);
                if (a18 != null) {
                    str2 = (java.lang.String) a18.get(".avatar_url");
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (str2 == null) {
                        str2 = "";
                    }
                } else {
                    str2 = null;
                }
                java.lang.String str3 = str2 == null ? "" : str2;
                if (!r26.n0.N(str3)) {
                    bizNotifyTipsInfo = com.tencent.pigeon.biz_base.BizNotifyTipsInfo.copy$default(copy$default, java.lang.Long.valueOf(e17), null, null, null, java.lang.Boolean.FALSE, str3, null, 78, null);
                } else {
                    if (!r26.n0.N(str)) {
                        bizNotifyTipsInfo = com.tencent.pigeon.biz_base.BizNotifyTipsInfo.copy$default(copy$default, java.lang.Long.valueOf(e17), null, str, dw.f.f244070a.b(str, c17), java.lang.Boolean.valueOf(c01.e2.G(str)), null, null, 98, null);
                    }
                    bizNotifyTipsInfo = copy$default;
                }
                com.tencent.mm.sdk.platformtools.x2.d().edit().putLong("brand_service_time_line_last_notify_msg_id", c17.getMsgId()).apply();
            } else {
                java.lang.String Q0 = c17.Q0();
                boolean G = c01.e2.G(c17.Q0());
                if (Q0 != null && !r26.n0.N(Q0)) {
                    z17 = false;
                }
                if (!z17) {
                    dw.f fVar2 = dw.f.f244070a;
                    kotlin.jvm.internal.o.d(Q0);
                    bizNotifyTipsInfo = com.tencent.pigeon.biz_base.BizNotifyTipsInfo.copy$default(copy$default, java.lang.Long.valueOf(e17), null, Q0, fVar2.b(Q0, c17), java.lang.Boolean.valueOf(G), null, null, 98, null);
                    com.tencent.mm.sdk.platformtools.x2.d().edit().putLong("brand_service_time_line_last_notify_msg_id", c17.getMsgId()).apply();
                }
                bizNotifyTipsInfo = copy$default;
                com.tencent.mm.sdk.platformtools.x2.d().edit().putLong("brand_service_time_line_last_notify_msg_id", c17.getMsgId()).apply();
            }
        }
        com.tencent.pigeon.biz_base.BizNotifyTipsInfo bizNotifyTipsInfo2 = bizNotifyTipsInfo;
        java.lang.String userName = bizNotifyTipsInfo2.getUserName();
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return com.tencent.pigeon.biz_base.BizNotifyTipsInfo.copy$default(bizNotifyTipsInfo2, null, null, userName == null ? "" : userName, null, null, null, null, 123, null);
    }

    public final com.tencent.pigeon.biz_base.ContactInfo d(java.lang.String userName) {
        com.tencent.pigeon.biz_base.ContactInfo contactInfo;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        if (n17 != null) {
            boolean r27 = n17.r2();
            boolean w27 = n17.w2();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            contactInfo = new com.tencent.pigeon.biz_base.ContactInfo(userName, c01.a2.e(userName), java.lang.Boolean.valueOf(r27), java.lang.Boolean.valueOf(w27), java.lang.Boolean.valueOf(c01.e2.P(n17)));
        } else {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            contactInfo = new com.tencent.pigeon.biz_base.ContactInfo(userName, null, bool, bool, java.lang.Boolean.TRUE, 2, null);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterHelper", "[BRS] getContactInfo, userName -> " + userName + ", nickName -> " + contactInfo.getNickName());
        return contactInfo;
    }

    public final boolean e() {
        boolean z17 = f476081c;
        if (z17) {
            return z17;
        }
        boolean i17 = uw.k.f431495a.a().i("BrandServiceRecommendFeedsSvrOpen", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceRecFeedsDataUtil", "BrandServiceRecommendFeedsSvrOpen = " + i17);
        f476081c = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterHelper", "isBrandServiceRecFeedsOpen svrOpen " + i17);
        return f476081c;
    }

    public final boolean f() {
        if (!b()) {
            return true;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isEnableBrandServiceTimeline] brandServiceDataMigrateCrash:");
        sb6.append(b());
        sb6.append(" key:");
        java.lang.String str = zv.m.f476028a;
        sb6.append(zv.m.f476028a);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterHelper", sb6.toString());
        return false;
    }

    public final boolean g() {
        return ((zv.e2) ((bw.k) i95.n0.c(bw.k.class))).Ui();
    }
}
