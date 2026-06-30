package ll3;

/* loaded from: classes11.dex */
public abstract class j2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f319185a = 0;

    static {
        new java.util.HashMap();
        new java.util.HashMap();
    }

    public static void a(b21.r rVar, android.app.Activity activity) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10910, "3");
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.gp0 gp0Var = new r45.gp0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(5);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).bj(d(rVar))) {
            jq0Var.b(d(rVar));
        }
        gp0Var.I0(rVar.f17352n);
        gp0Var.J0(rVar.f17353o);
        gp0Var.K0(rVar.f17354p);
        ql3.a y07 = ll3.o2.Ai().y0(xl3.c.a(rVar));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(y07.field_songHAlbumUrl)) {
            gp0Var.o0(y07.field_songHAlbumUrl);
        } else {
            gp0Var.o0(y07.field_songAlbumUrl);
        }
        gp0Var.x0(true);
        java.lang.String f17 = f(rVar);
        if (com.tencent.mm.vfs.w6.j(f17)) {
            gp0Var.B0(f17);
        } else {
            gp0Var.z0(true);
        }
        gp0Var.O0(rVar.f17348g);
        gp0Var.m0(rVar.f17349h);
        gp0Var.h0(7);
        gp0Var.D0(rVar.f17362x);
        gp0Var.E0(rVar.f17355q);
        java.lang.String str = rVar.f17348g;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6318d = str;
        c4Var.f6319e = rVar.f17349h;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 7;
        bq0Var.o(jq0Var);
        bq0Var.f370964f.add(gp0Var);
        c4Var.f6323i = activity;
        c4Var.f6327m = 3;
        doFavoriteEvent.e();
    }

    public static boolean b(b21.r rVar, android.app.Activity activity) {
        java.lang.String str;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10910, "4");
        if (rVar == null) {
            return false;
        }
        java.lang.String str2 = rVar.f17354p;
        java.lang.String f17 = xl3.f.f(str2);
        java.lang.String g17 = xl3.f.g(str2);
        if (android.text.TextUtils.isEmpty(g17) && android.text.TextUtils.isEmpty(f17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicUtil", "get qq music data fail, url %s", str2);
            str = "qqmusic://qq.com/ui/pageVisibility";
        } else if (!android.text.TextUtils.isEmpty(g17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicUtil", "get qq music songmid %s", g17);
            str = "qqmusic://qq.com/media/playSonglist?p=%7B%22song%22%3A%5B%7B%22songmid%22%3A%22" + g17 + "%22%7D%5D%7D";
        } else if (android.text.TextUtils.isEmpty(f17)) {
            str = "qqmusic://qq.com/media/playSonglist?p=%7B%22song%22%3A%5B%7B%22songid%22%3A%22" + f17 + "%22%7D%5D%7D";
        } else {
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicUtil", "qqMusicActionUrl:%s", str);
        android.net.Uri parse = android.net.Uri.parse(str);
        if (parse == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Music.MusicUtil", "parse qq music action url fail, url %s", str);
            return false;
        }
        b21.m.j();
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", parse);
        intent.addFlags(268435456);
        if (!com.tencent.mm.sdk.platformtools.t8.I0(activity, intent, false, false)) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("rawUrl", str2);
            j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent2, null);
            return false;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/music/model/MusicUtil", "doOpenInQQMusic", "(Lcom/tencent/mm/modelmusic/MusicWrapper;Landroid/app/Activity;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/music/model/MusicUtil", "doOpenInQQMusic", "(Lcom/tencent/mm/modelmusic/MusicWrapper;Landroid/app/Activity;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (java.lang.Exception unused) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("rawUrl", str2);
            j45.l.j(activity, "webview", ".ui.tools.WebViewUI", intent3, null);
            return false;
        }
    }

    public static void c(b21.r rVar, android.app.Activity activity) {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.opensdk.modelmsg.WXMusicObject wXMusicObject = new com.tencent.mm.opensdk.modelmsg.WXMusicObject();
        wXMusicObject.musicUrl = rVar.f17354p;
        wXMusicObject.musicDataUrl = rVar.f17352n;
        java.lang.String str = rVar.f17353o;
        wXMusicObject.musicLowBandUrl = str;
        wXMusicObject.musicLowBandDataUrl = str;
        wXMusicObject.songAlbumUrl = rVar.f17362x;
        wXMusicObject.songLyric = rVar.f17355q;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        wXMediaMessage.mediaObject = wXMusicObject;
        wXMediaMessage.title = rVar.f17348g;
        wXMediaMessage.description = rVar.f17349h;
        java.lang.String f17 = f(rVar);
        if (f17 == null || !com.tencent.mm.vfs.w6.j(f17)) {
            bitmap = null;
        } else {
            int dimension = (int) activity.getResources().getDimension(com.tencent.mm.R.dimen.f479890i3);
            bitmap = com.tencent.mm.sdk.platformtools.x.j0(f17, dimension, dimension, 0.0f);
        }
        if (bitmap != null) {
            wXMediaMessage.thumbData = com.tencent.mm.sdk.platformtools.t8.a(bitmap, true);
        } else {
            wXMediaMessage.thumbData = com.tencent.mm.sdk.platformtools.t8.a(com.tencent.mm.sdk.platformtools.x.c0(com.tencent.mm.R.drawable.f481343c15), true);
        }
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
        req.message = wXMediaMessage;
        req.toBundle(bundle);
        intent.putExtra("Ksnsupload_timeline", bundle);
        intent.putExtra("Ksnsupload_musicid", rVar.f17346e);
        java.lang.String d17 = d(rVar);
        if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).bj(d17)) {
            intent.putExtra("Ksnsupload_appid", d17);
        }
        intent.putExtra("Ksnsupload_appname", e(rVar));
        java.lang.String a17 = c01.n2.a("music_player");
        c01.n2.d().c(a17, true).i("prePublishId", "music_player");
        intent.putExtra("reportSessionId", a17);
        intent.putExtra("ksnsis_music", true);
        if (i(d17)) {
            intent.putExtra("Ksnsupload_type", 25);
        } else {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_new_music_type_flag, bm5.h0.RepairerConfig_Mv_CardDownLevel_Int, 0) == 1) {
                intent.putExtra("Ksnsupload_type", 26);
            } else {
                intent.putExtra("Ksnsupload_type", 2);
            }
        }
        j45.l.w((com.tencent.mm.ui.MMActivity) activity, ".plugin.sns.ui.SnsUploadUI", intent, 1001, new ll3.i2());
    }

    public static java.lang.String d(b21.r rVar) {
        java.lang.String str = rVar.f17358t;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        int i17 = rVar.f17345d;
        return i17 != 4 ? i17 != 5 ? str : "wx482a4001c37e2b74" : "wx485a97c844086dc9";
    }

    public static java.lang.String e(b21.r rVar) {
        int i17 = rVar.f17345d;
        if (i17 != 0 && i17 != 1) {
            if (i17 == 4) {
                return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.j2z);
            }
            if (i17 == 5) {
                return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.i_j);
            }
            if (i17 != 8) {
                return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.bnx);
            }
        }
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jcz);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        if (r5 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r5 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
    
        if (r5 == null) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String f(b21.r r5) {
        /*
            java.lang.String r0 = r5.f17356r
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.f192989a
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            r0 = r1
        L9:
            ql3.b r2 = ll3.o2.Ai()
            java.lang.String r3 = xl3.c.a(r5)
            ql3.a r2 = r2.y0(r3)
            if (r2 != 0) goto L1e
            boolean r2 = com.tencent.mm.vfs.w6.j(r0)
            if (r2 == 0) goto L1e
            return r0
        L1e:
            java.lang.String r0 = r5.f17346e
            r2 = 1
            java.lang.String r0 = xl3.c.e(r0, r2)
            boolean r3 = com.tencent.mm.vfs.w6.j(r0)
            if (r3 != 0) goto Lcb
            int r3 = r5.f17345d
            r4 = 0
            if (r3 == 0) goto Lb6
            r2 = 4
            if (r3 == r2) goto L8b
            r2 = 5
            if (r3 == r2) goto L83
            r2 = 6
            if (r3 == r2) goto L7e
            r2 = 7
            if (r3 == r2) goto L79
            r2 = 10
            if (r3 == r2) goto L79
            r2 = 11
            if (r3 == r2) goto L79
            p94.j0 r1 = p94.w0.c()
            if (r1 == 0) goto Lcb
            r45.jj4 r0 = new r45.jj4
            r0.<init>()
            java.lang.String r1 = r5.f17361w
            r0.f377855d = r1
            java.lang.String r1 = r5.f17351m
            r0.f377860i = r1
            int r5 = r5.f17359u
            r0.f377862m = r5
            r0.f377858g = r1
            java.lang.Class<fe0.o4> r5 = fe0.o4.class
            i95.m r5 = i95.n0.c(r5)
            fe0.o4 r5 = (fe0.o4) r5
            ee0.v4 r5 = (ee0.v4) r5
            r5.getClass()
            java.lang.String r5 = "getSnsDirectThumbPath"
            java.lang.String r1 = "com.tencent.mm.feature.sns.SnsUtilService"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            java.lang.String r0 = com.tencent.mm.plugin.sns.model.i1.t(r0)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            goto Lcb
        L79:
            java.lang.String r5 = r5.f17356r
            if (r5 != 0) goto L88
            goto L89
        L7e:
            java.lang.String r5 = r5.f17356r
            if (r5 != 0) goto L88
            goto L89
        L83:
            java.lang.String r5 = r5.f17356r
            if (r5 != 0) goto L88
            goto L89
        L88:
            r1 = r5
        L89:
            r0 = r1
            goto Lcb
        L8b:
            com.tencent.mm.autogen.events.MusicActionEvent r0 = new com.tencent.mm.autogen.events.MusicActionEvent
            r0.<init>()
            r1 = 12
            am.gk r2 = r0.f54509g
            r2.f6770a = r1
            java.lang.String r1 = r5.f17351m
            r2.f6776g = r1
            r0.e()
            am.hk r0 = r0.f54510h
            java.lang.String r0 = r0.f6841e
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r1 == 0) goto La9
            java.lang.String r0 = r5.f17356r
        La9:
            boolean r1 = com.tencent.mm.vfs.w6.j(r0)
            if (r1 != 0) goto Lcb
            java.lang.String r5 = r5.f17346e
            java.lang.String r0 = xl3.c.e(r5, r4)
            goto Lcb
        Lb6:
            java.lang.Class<tg3.u0> r0 = tg3.u0.class
            i95.m r0 = i95.n0.c(r0)
            tg3.u0 r0 = (tg3.u0) r0
            oi3.g r1 = new oi3.g
            r1.<init>()
            java.lang.String r5 = r5.f17356r
            k90.b r0 = (k90.b) r0
            java.lang.String r0 = r0.oj(r1, r5, r2, r4)
        Lcb:
            java.lang.String r5 = "real album path = %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r2 = "MicroMsg.Music.MusicUtil"
            com.tencent.mars.xlog.Log.i(r2, r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ll3.j2.f(b21.r):java.lang.String");
    }

    public static void g(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicUtil", "gotoAppbrand(), appId:%s, appUserName:%s, pkgType:%d", str, str2, java.lang.Integer.valueOf(i17));
        com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
        am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
        nxVar.f7473h = str;
        nxVar.f7474i = -1;
        nxVar.f7468c = i17;
        nxVar.f7466a = str2;
        nxVar.f7469d = yc1.s.CTRL_INDEX;
        if (i17 == 1) {
            nxVar.f7478m = true;
        }
        startAppBrandUIFromOuterEvent.e();
    }

    public static boolean h(dm.i8 i8Var) {
        return (com.tencent.mm.sdk.platformtools.t8.K0(i8Var.field_songWapLinkUrl) && com.tencent.mm.sdk.platformtools.t8.K0(i8Var.field_songWebUrl) && com.tencent.mm.sdk.platformtools.t8.K0(i8Var.field_songWifiUrl)) ? false : true;
    }

    public static final boolean i(java.lang.String str) {
        return kotlin.jvm.internal.o.b("wx5aa333606550dfd5", str);
    }

    public static com.tencent.mm.ui.widget.dialog.j0 j(android.content.Context context, int i17) {
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(context);
        i0Var.g(com.tencent.mm.R.string.f490573yv);
        i0Var.d(i17);
        i0Var.f(com.tencent.mm.R.string.l_e);
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.E = null;
        aVar.A = true;
        com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
        a17.show();
        return a17;
    }
}
