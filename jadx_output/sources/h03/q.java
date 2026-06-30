package h03;

/* loaded from: classes2.dex */
public final class q implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.mega_video.MegaVideoFinderApi, io.flutter.plugin.common.PluginRegistry.ActivityResultListener, io.flutter.embedding.engine.plugins.activity.ActivityAware {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f277910d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f277911e;

    /* renamed from: f, reason: collision with root package name */
    public android.app.Activity f277912f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.pigeon.mega_video.MegaVideoFinderCallback f277913g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.flutter.plugin.LVFinderPlugin$contactChangedListener$1 f277914h;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.flutter.plugin.LVFinderPlugin$contactChangedListener$1] */
    public q() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f277914h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedContactChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.flutter.plugin.LVFinderPlugin$contactChangedListener$1
            {
                this.__eventId = 797560056;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedContactChangeEvent feedContactChangeEvent) {
                com.tencent.mm.autogen.events.FeedContactChangeEvent event = feedContactChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new h03.d(h03.q.this, event));
                return false;
            }
        };
    }

    public static final void a(h03.q qVar, so2.u1 u1Var, int i17) {
        fc2.q f76;
        fc2.q f77;
        fc2.q f78;
        android.app.Activity activity = qVar.f277912f;
        if (activity == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LVFinderPlugin", "markReportStart context is null");
            qVar.f277910d = u1Var.getFeedObject().getFeedObject();
            qVar.f277911e = java.lang.Integer.valueOf(i17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LVFinderPlugin", "markReportStart");
        qVar.b(u1Var.getFeedObject(), i17);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(activity);
        if (e17 != null && (f78 = e17.f7()) != null) {
            fc2.s sVar = new fc2.s(2);
            sVar.f260981e = u1Var;
            f78.f260976d = u1Var;
            sVar.f260984h = f78.f260974b;
            sVar.f260982f = u1Var.getItemId();
            sVar.f260983g = u1Var.w();
            f78.f260974b = u1Var.getItemId();
            f78.a(sVar);
        }
        ec2.f fVar = new ec2.f(4);
        fVar.f250965j = u1Var.getItemId();
        fVar.f250966k = u1Var.w();
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(activity);
        if (e18 != null && (f77 = e18.f7()) != null) {
            f77.a(fVar);
        }
        ec2.f fVar2 = new ec2.f(1);
        fVar2.f250965j = u1Var.getItemId();
        fVar2.f250966k = u1Var.w();
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(activity);
        if (e19 == null || (f76 = e19.f7()) == null) {
            return;
        }
        f76.a(fVar2);
    }

    public final void b(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17) {
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        bu2.j.f24534a.n(finderItem, new bu2.h(7017, 0L));
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((com.tencent.mm.plugin.finder.report.o3) c17).rk(finderItem.getFeedObject(), i17, null);
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public long bulletCommentFontSize() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127672e5).getValue()).r()).intValue();
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public long bulletCommentPortraitNumberOfLines() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127691f5).getValue()).r()).intValue();
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public double bulletCommentShowDuration() {
        return 7.5d;
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public double bulletCommentStrokeColorAlpha() {
        int intValue = ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.R().r()).intValue();
        if (intValue == 1) {
            return 0.3d;
        }
        if (intValue != 2) {
            return intValue != 3 ? 0.6d : 0.5d;
        }
        return 0.4d;
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public double bulletCommentStrokeWidth() {
        return 9.0d;
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public boolean enableAirPlayVideo() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.N2).getValue()).r()).intValue() != 0;
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public boolean enableShowBulletComment(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, long j17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = c03.i.a(feed);
        if (a17 != null) {
            return new so2.u1(a17).g2();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.LVFinderPlugin", "enableShowBulletComment finderItem is null");
        return false;
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public boolean feedSetToSNSCoverSwitch() {
        return ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).wi();
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void followFinderAccout(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, boolean z17, long j17) {
        int i17;
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        java.lang.String str;
        java.lang.String str2;
        r45.fl2 fl2Var;
        java.lang.String X6;
        kotlin.jvm.internal.o.g(feed, "feed");
        android.app.Activity activity = this.f277912f;
        if (activity != null) {
            so2.u1 d17 = c03.i.d(feed);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LVFinderPlugin", "shareFeed feed to finderItem is null");
                return;
            }
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            ya2.b2 contact = d17.getContact();
            if (contact != null) {
                java.lang.String D0 = contact.D0();
                if (z17) {
                    java.lang.String mk6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).mk(activity, d17.getItemId(), d17.w());
                    if (mk6 == null || mk6.length() == 0) {
                        jSONObject2 = new org.json.JSONObject();
                    } else {
                        try {
                            jSONObject = new org.json.JSONObject(mk6);
                        } catch (org.json.JSONException unused) {
                            jSONObject = new org.json.JSONObject();
                        }
                        jSONObject2 = jSONObject;
                    }
                    r45.xk bizInfo = d17.getFeedObject().getBizInfo();
                    if (bizInfo == null || (str = bizInfo.getString(0)) == null) {
                        str = "";
                    }
                    jSONObject2.put("biz_username", str);
                    com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                    if (nyVar != null && (X6 = nyVar.X6()) != null) {
                        java.lang.String t17 = r26.i0.t(X6, ";", ",", false);
                        if (t17.length() > 0) {
                            org.json.JSONObject jSONObject3 = new org.json.JSONObject(t17);
                            if (jSONObject3.has("tag_name")) {
                                jSONObject2.put("tag_name", jSONObject3.get("tag_name"));
                            }
                            if (jSONObject3.has("tips_uuid")) {
                                jSONObject2.put("tips_uuid", jSONObject3.get("tips_uuid"));
                            }
                        }
                    }
                    com.tencent.mm.plugin.finder.report.e6 aj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).aj(d17.getItemId(), d17.w(), (int) j17);
                    if (aj6 == null || (fl2Var = aj6.f125012a) == null || (str2 = fl2Var.getString(1)) == null) {
                        str2 = "";
                    }
                    i17 = 0;
                    com.tencent.mm.plugin.finder.report.b6.f124969a.b(V6, "follow", false, d17.getItemId(), jSONObject2, str2);
                } else {
                    i17 = 0;
                }
                nv2.d0 d0Var = nv2.d0.f340470e;
                nv2.d0.f340470e.a(D0, z17 ? 1 : 2, d17.getItemId(), d17.w(), V6, false, (i27 & 64) != 0 ? 0 : 0, (i27 & 128) != 0 ? "" : null, (i27 & 256) != 0 ? null : null, (i27 & 512) != 0 ? 0 : 24, (i27 & 1024) != 0 ? null : null, (i27 & 2048) != 0 ? null : null, (i27 & 4096) != 0 ? 0 : 0, (i27 & 8192) != 0 ? new r45.p31() : null, (i27 & 16384) != 0 ? "" : null, (i27 & 32768) != 0 ? "" : null);
                ya2.g gVar = ya2.h.f460484a;
                l75.e0 e0Var = ya2.b2.O2;
                gVar.i(D0, z17 ? ya2.b2.Q2 : i17);
                com.tencent.pigeon.mega_video.MegaVideoFinderCallback megaVideoFinderCallback = this.f277913g;
                if (megaVideoFinderCallback != null) {
                    megaVideoFinderCallback.onFollowStatusChanged(D0, z17, h03.e.f277877d);
                }
            }
        }
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void getFinderContactInfo(java.lang.String username, yz5.l callback) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.protocal.protobuf.FinderContact Rj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Rj(username);
        if (Rj == null || (str = Rj.getHeadUrl()) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        java.lang.String nickname = Rj != null ? Rj.getNickname() : null;
        boolean z17 = false;
        if (Rj != null) {
            int followFlag = Rj.getFollowFlag();
            l75.e0 e0Var = ya2.b2.O2;
            if (followFlag == ya2.b2.Q2) {
                z17 = true;
            }
        }
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.mega_video.MegaVideoContact(username, str2, nickname, java.lang.Boolean.valueOf(z17), Rj != null ? java.lang.Long.valueOf(Rj.getFollowFlag()) : null))));
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public long getFinderIdentityType() {
        return com.tencent.mm.plugin.finder.storage.t70.f127590a.u2();
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public java.util.List getGlobalPlayProgressesOfTids(java.util.List tids) {
        kotlin.jvm.internal.o.g(tids, "tids");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(tids, 10));
        java.util.Iterator it = tids.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Double.valueOf(cu2.x.f222449a.e("", "", pm0.v.Z((java.lang.String) it.next()))));
        }
        return arrayList;
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void getSelfFinderContact(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        android.content.Context context = this.f277912f;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        java.lang.String e17 = context != null ? xy2.c.e(context) : null;
        ya2.b2 b17 = e17 == null || r26.n0.N(e17) ? null : ya2.h.f460484a.b(e17);
        if (b17 == null) {
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
            return;
        }
        java.lang.String D0 = b17.D0();
        java.lang.String avatarUrl = b17.getAvatarUrl();
        java.lang.String w07 = b17.w0();
        int i17 = b17.field_follow_Flag;
        l75.e0 e0Var = ya2.b2.O2;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.mega_video.MegaVideoContact(D0, avatarUrl, w07, java.lang.Boolean.valueOf(i17 == ya2.b2.Q2), java.lang.Long.valueOf(b17.field_follow_Flag)))));
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void getSelfWeChatContact(yz5.l callback) {
        com.tencent.mm.modelavatar.s0 Ni;
        com.tencent.mm.modelavatar.r0 n07;
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String r17 = c01.z1.r();
        if (r17 == null || r17.length() == 0) {
            return;
        }
        java.lang.String d17 = (((kv.a0) i95.n0.c(kv.a0.class)) == null || (Ni = com.tencent.mm.modelavatar.d1.Ni()) == null || (n07 = Ni.n0(r17)) == null) ? null : n07.d();
        if (d17 == null) {
            d17 = "";
        }
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.mega_video.MegaVideoContact(r17, d17, c01.z1.l(), null, null, 24, null))));
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public java.util.List getSharePanelItemsConfig(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, long j17, java.lang.String options) {
        so2.u1 d17;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(options, "options");
        java.util.List k17 = kz5.c0.k("0", "0");
        android.app.Activity activity = this.f277912f;
        if (activity == null || (d17 = c03.i.d(feed)) == null) {
            return k17;
        }
        int i17 = 0;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) activity, 1, false);
        db5.g4 g4Var = new db5.g4(activity);
        if (com.tencent.mm.ui.bk.y()) {
            if (com.tencent.mm.ui.bk.z(activity.getTaskId())) {
                g4Var.g(117, activity.getString(com.tencent.mm.R.string.b9c), com.tencent.mm.R.raw.icons_outlined_merge);
            } else {
                g4Var.g(117, activity.getString(com.tencent.mm.R.string.jjg), com.tencent.mm.R.raw.icons_outlined_sperated);
            }
        }
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        y4Var.k(activity, g4Var, d17);
        y4Var.s(activity, g4Var, d17);
        if (d17.g2()) {
            if (gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_FINDER_BULLET_SWITCH_BOOLEAN, true)) {
                g4Var.g(301, activity.getString(com.tencent.mm.R.string.gyu), com.tencent.mm.R.raw.bullet_screen_on_regular);
            } else {
                g4Var.g(302, activity.getString(com.tencent.mm.R.string.gyy), com.tencent.mm.R.raw.bullet_screen_off_regular);
            }
        }
        y4Var.y(activity, d17, g4Var, k0Var, 200);
        y4Var.x(activity, d17, g4Var);
        if (!hc2.b0.i(d17)) {
            g4Var.g(99, activity.getString(com.tencent.mm.R.string.gyz), com.tencent.mm.R.raw.finder_feed_dislike_new);
            g4Var.g(101, activity.getString(com.tencent.mm.R.string.gys), com.tencent.mm.R.raw.icons_outlined_report_problem);
        }
        y4Var.q(activity, g4Var, d17);
        y4Var.m(activity, g4Var, d17);
        if (hc2.b0.i(d17)) {
            y4Var.t(activity, g4Var, d17);
            y4Var.g(activity, g4Var, d17);
        }
        y4Var.H(activity, d17, g4Var);
        com.tencent.mm.plugin.finder.report.x3.f125432a.b(g4Var);
        java.util.List list = g4Var.f228344d;
        kotlin.jvm.internal.o.f(list, "getItemList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((android.view.MenuItem) it.next()).getItemId()));
        }
        java.util.Set X0 = kz5.n0.X0(arrayList);
        int i18 = ((h03.b) kz5.n0.i0(h03.b.f277872f)).f277873d + 1;
        char[] cArr = new char[i18];
        java.util.Arrays.fill(cArr, '0');
        if (X0.contains(117)) {
            if (com.tencent.mm.ui.bk.z(activity.getTaskId())) {
                cArr[17] = '1';
            } else {
                cArr[23] = '1';
            }
        }
        if (X0.contains(java.lang.Integer.valueOf(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL))) {
            cArr[43] = '1';
        }
        if (X0.contains(java.lang.Integer.valueOf(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE))) {
            cArr[31] = '1';
        }
        if (X0.contains(java.lang.Integer.valueOf(com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR))) {
            cArr[39] = '1';
        }
        if (X0.contains(301) || X0.contains(301)) {
            cArr[28] = '1';
        }
        if (X0.contains(200)) {
            cArr[20] = '1';
        }
        if (X0.contains(118)) {
            cArr[25] = '1';
        }
        if (X0.contains(99)) {
            cArr[4] = '1';
        }
        if (X0.contains(101)) {
            cArr[5] = '1';
        }
        if (X0.contains(109)) {
            cArr[14] = '1';
        }
        if (X0.contains(119)) {
            cArr[34] = '1';
        }
        if (X0.contains(121)) {
            cArr[40] = '1';
        }
        if (X0.contains(202)) {
            cArr[26] = '1';
        }
        if (!(i18 == 0)) {
            char[] cArr2 = new char[i18];
            int i19 = i18 - 1;
            if (i19 >= 0) {
                while (true) {
                    cArr2[i19 - i17] = cArr[i17];
                    if (i17 == i19) {
                        break;
                    }
                    i17++;
                }
            }
            cArr = cArr2;
        }
        java.lang.String bigInteger = new java.math.BigInteger(new java.lang.String(cArr), 2).toString(10);
        kotlin.jvm.internal.o.f(bigInteger, "toString(...)");
        return kz5.c0.k("0", bigInteger);
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void heartLikeFeed(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, boolean z17, long j17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        android.app.Activity activity = this.f277912f;
        if (activity != null) {
            so2.u1 d17 = c03.i.d(feed);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LVFinderPlugin", "heartLikeFeed toVideoFeed is null");
                return;
            }
            pf5.z zVar = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
            nv2.h1 h1Var = nv2.n1.f340550g;
            boolean booleanValue = ((java.lang.Boolean) nv2.n1.f340551h.k(d17.getFeedObject().getFeedObject()).f302834e).booleanValue();
            if (z17) {
                booleanValue = false;
            }
            so2.e2.f410328a.b(V6, 1, d17.getFeedObject(), z17, false, 2, d17.getShowLikeTips(), booleanValue, hc2.s.f(d17.getContact()), null);
        }
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public boolean isFinderAudioPlaying() {
        return ((wy2.g) ((o40.e) i95.n0.c(o40.e.class))).Ai();
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public boolean isSelfUsername(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        android.content.Context context = this.f277912f;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        return kotlin.jvm.internal.o.b(username, context != null ? xy2.c.e(context) : null);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 2 || intent == null) {
            return true;
        }
        android.content.Context context = this.f277912f;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.plugin.finder.assist.y4.f102714a.Z(intent);
        db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.f490556yf), com.tencent.mm.R.raw.toast_ok);
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.LVFinderPlugin", "onAttachedToActivity");
        this.f277912f = binding.getActivity();
        binding.addActivityResultListener(this);
        ((ku5.t0) ku5.t0.f312615d).b(new h03.p(this), "MicroMsg.LVFinderPlugin");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mega_video.MegaVideoFinderApi.Companion companion = com.tencent.pigeon.mega_video.MegaVideoFinderApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mega_video.MegaVideoFinderApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f277913g = new com.tencent.pigeon.mega_video.MegaVideoFinderCallback(binaryMessenger2, null, 2, null);
        alive();
        com.tencent.mars.xlog.Log.i("MicroMsg.LVFinderPlugin", "InteractionUtil onAttachedToEngine");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LVFinderPlugin", "onDetachedFromActivity");
        this.f277912f = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mega_video.MegaVideoFinderApi.Companion companion = com.tencent.pigeon.mega_video.MegaVideoFinderApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mega_video.MegaVideoFinderApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f277913g = null;
        dead();
        com.tencent.mars.xlog.Log.i("MicroMsg.LVFinderPlugin", "InteractionUtil onDetachedFromEngine");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void onTapMoreButtonInFriendsLikeList(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, long j17) {
        kotlin.jvm.internal.o.g(feed, "feed");
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void openFinderAudioPage(long j17, byte[] listenInfo, double d17, java.lang.String contextId, java.lang.String tabContextId) {
        kotlin.jvm.internal.o.g(listenInfo, "listenInfo");
        kotlin.jvm.internal.o.g(contextId, "contextId");
        kotlin.jvm.internal.o.g(tabContextId, "tabContextId");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new h03.f(this.f277912f, listenInfo, d17, contextId, tabContextId, j17, null), 3, null);
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void openFinderDetail(java.lang.String feedId, long j17) {
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new h03.g(this.f277912f, feedId, null), 3, null);
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void openFinderProfile(java.lang.String username, long j17, boolean z17, com.tencent.pigeon.mega_video.MegaVideoFeedInfo megaVideoFeedInfo) {
        kotlin.jvm.internal.o.g(username, "username");
        pm0.v.X(new h03.h(this, megaVideoFeedInfo, j17, username, z17));
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void openHalfScreenWebPage(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        android.app.Activity activity = this.f277912f;
        if (!(activity instanceof android.content.Context)) {
            activity = null;
        }
        android.app.Activity activity2 = activity;
        if (activity2 == null) {
            return;
        }
        r45.ac4 ac4Var = new r45.ac4();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        finderJumpInfo.setJumpinfo_type(2);
        com.tencent.mm.protocal.protobuf.Html5Info html5Info = new com.tencent.mm.protocal.protobuf.Html5Info();
        html5Info.setUrl("https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/Lfe1Jj8m4vhEGHxK");
        html5Info.setStyle(1);
        finderJumpInfo.setHtml5_info(html5Info);
        ac4Var.set(1, finderJumpInfo);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb.Yi((c61.yb) c17, activity2, ac4Var, null, null, 8, null);
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void openWebPage(java.lang.String url, long j17) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new h03.i(this.f277912f, url, null), 3, null);
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void report18054AvatarClick(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        android.app.Activity activity = this.f277912f;
        if (activity != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            if (V6 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LVFinderPlugin", "reportObj is null");
            } else {
                com.tencent.mm.plugin.finder.report.o0.b(com.tencent.mm.plugin.finder.report.r0.f125279q, V6, pm0.v.Z(feed.getFeedId()), null, 7, "1", 0L, null, new ec2.c((int) j18, false, z17, 0, 0L, 0, 56, null), null, com.tencent.mm.plugin.appbrand.jsapi.nfc.r.CTRL_INDEX, null);
            }
        }
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void reportBulletComment(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, long j17, java.lang.String commentInfoId) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(commentInfoId, "commentInfoId");
        pm0.v.X(new h03.j(feed, commentInfoId, this));
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public long ringToneVideoDurationLimit() {
        return com.tencent.mm.sdk.platformtools.t8.V(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderRingToneVideoDurationLimit"), 300L);
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void savePlayProgress(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, long j17, double d17, double d18, double d19) {
        kotlin.jvm.internal.o.g(feed, "feed");
        java.lang.String feedId = feed.getFeedId();
        if (feedId == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LVFinderPlugin", "FeedId cannot be nil for updating progress");
        } else {
            cu2.x.f222449a.m(feedId, (long) (d17 * 1000), ((java.lang.Number) r5.f(pm0.v.Z(feedId)).f302834e).intValue() * 1000);
        }
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void setFinderIdentity(long j17) {
        pm0.v.X(new h03.k(j17));
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void shareFeed(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, long j17, long j18) {
        kotlin.jvm.internal.o.g(feed, "feed");
        int i17 = (int) j18;
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = c03.i.a(feed);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LVFinderPlugin", "shareFeed feed to finderItem is null");
            return;
        }
        android.app.Activity activity = this.f277912f;
        if (activity == null) {
            return;
        }
        so2.u1 u1Var = new so2.u1(a17);
        int i18 = (int) j17;
        int ordinal = com.tencent.pigeon.mega_video.MegaVideoShareScene.FRIEND.ordinal();
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        if (i18 == ordinal) {
            android.app.Activity activity2 = this.f277912f;
            androidx.appcompat.app.AppCompatActivity appCompatActivity = activity2 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity2 : null;
            if (appCompatActivity != null) {
                com.tencent.mm.plugin.finder.assist.n7.C(n7Var, appCompatActivity, a17, null, 0, null, 28, null);
                return;
            }
            return;
        }
        if (i18 == com.tencent.pigeon.mega_video.MegaVideoShareScene.MOMENT.ordinal()) {
            android.app.Activity activity3 = this.f277912f;
            androidx.appcompat.app.AppCompatActivity appCompatActivity2 = activity3 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity3 : null;
            if (appCompatActivity2 != null) {
                com.tencent.mm.plugin.finder.assist.n7.F(n7Var, appCompatActivity2, u1Var, null, 0, 0, 28, null);
                return;
            }
            return;
        }
        if (i18 == com.tencent.pigeon.mega_video.MegaVideoShareScene.FAV.ordinal()) {
            so2.v0.b(so2.v0.f410644a, u1Var, activity, null, null, 12, null);
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3.Rk((com.tencent.mm.plugin.finder.report.o3) c17, activity, true, u1Var.getItemId(), false, 8, null);
            return;
        }
        int ordinal2 = com.tencent.pigeon.mega_video.MegaVideoShareScene.TEXT_STATE.ordinal();
        com.tencent.mm.plugin.finder.report.x3 x3Var = com.tencent.mm.plugin.finder.report.x3.f125432a;
        if (i18 == ordinal2) {
            android.app.Activity activity4 = this.f277912f;
            androidx.appcompat.app.AppCompatActivity appCompatActivity3 = activity4 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity4 : null;
            if (appCompatActivity3 != null) {
                com.tencent.mm.plugin.finder.assist.n7.H(n7Var, appCompatActivity3, u1Var, null, 0, 12, null);
                x3Var.c(activity, "textstatus_in_menu", u1Var.getItemId(), i17);
                if (u1Var.getFeedObject().isLiveFeed()) {
                    vs5.a aVar = vs5.a.f439924a;
                    r45.nw1 liveInfo = u1Var.getFeedObject().getLiveInfo();
                    aVar.a(java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null), java.lang.String.valueOf(u1Var.getFeedObject().getFeedObject().getId()), u1Var.getFeedObject().getFeedObject().getUsername(), "1", "3", "0", (i17 & 64) != 0 ? null : null, (i17 & 128) != 0 ? "" : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i18 == com.tencent.pigeon.mega_video.MegaVideoShareScene.MOMENT_COVER.ordinal()) {
            android.app.Activity activity5 = this.f277912f;
            com.tencent.mm.ui.MMActivity mMActivity = activity5 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity5 : null;
            if (mMActivity != null) {
                fe0.k4 k4Var = (fe0.k4) i95.n0.c(fe0.k4.class);
                byte[] byteArray = u1Var.getFeedObject().getFeedObject().toByteArray();
                ((ee0.n4) k4Var).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                if (byteArray == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                    return;
                } else {
                    je4.a.f299315a.a(mMActivity, 2, byteArray, 0, 9);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enterSnsCoverFinderPreviewUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                    return;
                }
            }
            return;
        }
        if (i18 == com.tencent.pigeon.mega_video.MegaVideoShareScene.RING.ordinal()) {
            android.app.Activity activity6 = this.f277912f;
            androidx.appcompat.app.AppCompatActivity appCompatActivity4 = activity6 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity6 : null;
            if (appCompatActivity4 != null) {
                com.tencent.mm.plugin.finder.assist.y5.f102716a.d(appCompatActivity4, u1Var, 2L, (r24 & 8) != 0, (r24 & 16) != 0 ? "" : null, (r24 & 32) != 0 ? "" : null, (r24 & 64) != 0 ? 0 : 0, (r24 & 128) != 0 ? null : null, h03.l.f277897d);
                x3Var.c(activity, "button_set_bell", u1Var.getItemId(), i17);
                return;
            }
            return;
        }
        if (i18 == com.tencent.pigeon.mega_video.MegaVideoShareScene.SCREEN_CAST.ordinal()) {
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[5];
            lVarArr[0] = new jz5.l("view_id", "projection");
            pf5.z zVar = pf5.z.f353948a;
            boolean z17 = activity instanceof androidx.appcompat.app.AppCompatActivity;
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.appcompat.app.AppCompatActivity appCompatActivity5 = (androidx.appcompat.app.AppCompatActivity) activity;
            com.tencent.mm.plugin.finder.viewmodel.component.sx sxVar = (com.tencent.mm.plugin.finder.viewmodel.component.sx) zVar.a(appCompatActivity5).a(com.tencent.mm.plugin.finder.viewmodel.component.sx.class);
            long itemId = u1Var.getItemId();
            long j19 = sxVar.f135942x;
            lVarArr[1] = new jz5.l("if_projection", java.lang.Integer.valueOf((j19 == 0 || j19 != itemId) ? 0 : 1));
            lVarArr[2] = new jz5.l("feed_id", pm0.v.u(u1Var.getItemId()));
            lVarArr[3] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.getInteger(5)) : null);
            lVarArr[4] = new jz5.l("projection_front_time", 0L);
            ((cy1.a) rVar).Ej("view_clk", kz5.c1.k(lVarArr), 25496);
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a18 = zVar.a(appCompatActivity5).a(com.tencent.mm.plugin.finder.viewmodel.component.sx.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            ((com.tencent.mm.plugin.finder.viewmodel.component.sx) a18).Z6(u1Var.getItemId(), null);
            return;
        }
        int ordinal3 = com.tencent.pigeon.mega_video.MegaVideoShareScene.LISTEN_LATER.ordinal();
        com.tencent.mm.plugin.finder.assist.y4 y4Var = com.tencent.mm.plugin.finder.assist.y4.f102714a;
        if (i18 == ordinal3) {
            y4Var.I(activity, u1Var);
            return;
        }
        if (i18 != com.tencent.pigeon.mega_video.MegaVideoShareScene.COMPLAINT.ordinal()) {
            if (i18 == com.tencent.pigeon.mega_video.MegaVideoShareScene.BACKGROUND_SOUND.ordinal()) {
                y4Var.S(activity, u1Var, null, i17, 23);
                return;
            } else if (i18 == com.tencent.pigeon.mega_video.MegaVideoShareScene.PROMOTE.ordinal()) {
                xc2.y2.f453343a.V(activity, u1Var, i17, false);
                return;
            } else {
                com.tencent.pigeon.mega_video.MegaVideoShareScene.INTERNAL_FEEDBACK.ordinal();
                return;
            }
        }
        boolean C = zl2.q4.f473933a.C(u1Var);
        bd2.b bVar = bd2.b.f19244a;
        if (!C) {
            bVar.a(activity, a17.field_id, a17.getDupFlag(), (i18 & 8) != 0 ? 0L : 0L, (i18 & 16) != 0 ? 58 : 0);
            return;
        }
        r45.nw1 liveInfo2 = a17.getLiveInfo();
        if (liveInfo2 != null) {
            long j27 = liveInfo2.getLong(0);
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            bVar.j(activity, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), j27, a17.getUserName(), (i18 & 16) != 0 ? null : null, (i18 & 32) != 0 ? 62 : 0, (i18 & 64) != 0 ? null : new so2.h1(a17));
        }
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void shareFeedToUser(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, java.lang.String username, long j17, long j18) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(username, "username");
        pm0.v.X(new h03.m(feed, username, this));
        com.tencent.mars.xlog.Log.i("MicroMsg.LVFinderPlugin", "shareFeedToUser");
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public boolean shouldShowTextState() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.X4).getValue()).r()).intValue() == 1;
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void showFansProfile(java.lang.String username, long j17) {
        kotlin.jvm.internal.o.g(username, "username");
        android.content.Intent intent = new android.content.Intent();
        ya2.b2 b2Var = new ya2.b2();
        b2Var.field_username = username;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        com.tencent.mm.plugin.finder.view.ko koVar = com.tencent.mm.plugin.finder.view.ko.f132520a;
        koVar.b(b2Var, intent);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        java.lang.String c17 = com.tencent.mm.plugin.finder.service.m4.f126148a.c(username, 3);
        intent.putExtra("IsPoster", true);
        intent.putExtra("Action", 1);
        intent.putExtra("hideSendMsg", true);
        android.app.Activity activity = this.f277912f;
        if (activity != null) {
            intent.putExtra("SessionId", c17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            koVar.g(activity, intent, (int) j17);
        }
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public boolean showFavEntryOnActionSheet() {
        return ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.D0().r()).intValue() == 1;
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public boolean showRingToneEntrance() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_finder_ring_tone_entrance_switch, true);
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void statReportExposeEnd(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, long j17, byte[] bArr) {
        kotlin.jvm.internal.o.g(feed, "feed");
        android.app.Activity activity = this.f277912f;
        if (activity == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).a(new h03.n(feed, this, j17, bArr, activity));
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void statReportExposeStart(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, long j17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        ((ku5.t0) ku5.t0.f312615d).b(new h03.o(feed, this, j17), "MicroMsg.LVFinderPlugin");
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void statReportFlush() {
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public void thumbFavFeed(com.tencent.pigeon.mega_video.MegaVideoFeedInfo feed, boolean z17, long j17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        android.app.Activity activity = this.f277912f;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = activity instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = c03.i.a(feed);
            if (a17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LVFinderPlugin", "thumbFavFeed toFinderItem is null");
            } else {
                so2.v0.f410644a.c(appCompatActivity, a17, z17, 2, (r17 & 16) != 0 ? 0 : 0, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null);
            }
        }
    }

    @Override // com.tencent.pigeon.mega_video.MegaVideoFinderApi
    public boolean videoCoverEnabled() {
        return ((ee0.n4) ((fe0.k4) i95.n0.c(fe0.k4.class))).wi();
    }
}
