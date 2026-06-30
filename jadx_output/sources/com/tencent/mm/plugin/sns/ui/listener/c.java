package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class c implements db5.t4, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f169753d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f169754e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f169755f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.TimeLineObject f169756g;

    /* renamed from: h, reason: collision with root package name */
    public final android.app.Activity f169757h;

    /* renamed from: i, reason: collision with root package name */
    public final int f169758i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.k4 f169759m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f169760n;

    /* renamed from: o, reason: collision with root package name */
    public i64.b1 f169761o;

    public c(android.app.Activity activity, int i17, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        java.lang.String str = "MicroMsg.TimeLineMMMenuItemSelectedListener-" + hashCode();
        this.f169753d = str;
        this.f169757h = activity;
        this.f169758i = i17;
        this.f169759m = k4Var;
        com.tencent.mars.xlog.Log.i(str, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    public static /* synthetic */ android.app.Activity a(com.tencent.mm.plugin.sns.ui.listener.c cVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        android.app.Activity activity = cVar.f169757h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        return activity;
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mars.xlog.Log.i(this.f169753d, "addListener");
        gm0.j1.i();
        gm0.j1.n().f273288b.a(218, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addListener", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addToLaterListen", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.protocal.protobuf.TimeLineObject tlObj = this.f169756g;
        android.view.View view = this.f169754e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addLaterListen", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        kotlin.jvm.internal.o.g(tlObj, "tlObj");
        com.tencent.mars.xlog.Log.i("MicroMsg.TingSnsUtils", "addToLaterListen");
        android.app.Activity activity = this.f169757h;
        if (activity == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addLaterListen", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        } else {
            bw5.lp0 d17 = com.tencent.mm.plugin.sns.ui.wm.d(tlObj);
            i95.m c17 = i95.n0.c(qk.a8.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            bw5.ar0 ar0Var = bw5.ar0.TingScene_Moment;
            bw5.v70 d18 = d17.d();
            kotlin.jvm.internal.o.f(d18, "getListenItem(...)");
            qk.a8.E8((qk.a8) c17, activity, ar0Var, d18, null, 0, 0, view, null, null, com.tencent.wxmm.v2helper.EMethodSetSendToNetworkOn, null);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, je4.g.a(d17.d()), 5, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addLaterListen", "com.tencent.mm.plugin.sns.util.TingSnsUtils");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addToLaterListen", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addToPlayList", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        bw5.lp0 d17 = com.tencent.mm.plugin.sns.ui.wm.d(this.f169756g);
        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).k(d17, bw5.ar0.TingScene_UnDefined);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addToPlayList", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void e(android.view.View view, java.lang.String str, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        this.f169754e = view;
        this.f169755f = str;
        this.f169756g = timeLineObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void f() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favoriteAppBrand", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f169756g;
        r45.y87 y87Var = timeLineObject.weappInfo;
        if (timeLineObject == null || y87Var == null) {
            com.tencent.mars.xlog.Log.e(this.f169753d, "favoriteAppBrand weappInfo null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteAppBrand", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(y87Var.f390864d);
        r45.dp0 dp0Var = new r45.dp0();
        dp0Var.f372634d = y87Var.f390864d;
        if (Bi != null) {
            dp0Var.f372635e = Bi.field_appId;
        }
        dp0Var.f372639i = y87Var.f390865e;
        dp0Var.f372636f = y87Var.f390867g;
        dp0Var.f372641n = y87Var.f390866f;
        dp0Var.f372644q = y87Var.f390870m;
        dp0Var.f372645r = y87Var.f390871n;
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.h0(19);
        r45.a90 a90Var = this.f169756g.ContentObj;
        if (a90Var != null) {
            str = a90Var.f369838f;
            java.util.LinkedList linkedList = a90Var.f369840h;
            if (linkedList == null || linkedList.isEmpty()) {
                gp0Var.z0(true);
            } else {
                r45.jj4 jj4Var = (r45.jj4) this.f169756g.ContentObj.f369840h.get(0);
                java.lang.String str2 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.U(jj4Var);
                gp0Var.A0(str2);
                gp0Var.B0(str2);
            }
        } else {
            gp0Var.z0(true);
            str = null;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.app.Activity activity = this.f169757h;
        if (K0) {
            str = (Bi == null || com.tencent.mm.sdk.platformtools.t8.K0(Bi.field_nickname)) ? activity.getString(com.tencent.mm.R.string.f490614a00) : Bi.field_nickname;
        }
        gp0Var.O0(str);
        gp0Var.m0(str);
        gp0Var.e0(o72.d2.d(gp0Var.toString(), 19));
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.g(2);
        r45.bq0 bq0Var = new r45.bq0();
        bq0Var.f370964f.add(gp0Var);
        bq0Var.b(dp0Var);
        bq0Var.o(jq0Var);
        bq0Var.p(str);
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6323i = activity;
        c4Var.f6318d = str;
        c4Var.f6319e = str;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 19;
        doFavoriteEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteAppBrand", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            Method dump skipped, instructions count: 807
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.listener.c.g():void");
    }

    public void h() {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        r45.a90 a90Var;
        r45.xs4 xs4Var;
        r45.y8 y8Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favoriteMusic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f169755f);
        if (this.f169756g.ContentObj.f369840h.size() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteMusic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        r45.jj4 jj4Var = (r45.jj4) this.f169756g.ContentObj.f369840h.get(0);
        if (k17 == null || jj4Var == null) {
            com.tencent.mars.xlog.Log.w(this.f169753d, "favorite music fail, snsinfo or mediaobj is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteMusic", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f169756g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (jj4Var == null || k17 == null || k17.localid == 0) {
            str = "favoriteMusic";
            str2 = "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener";
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or media is null");
            c4Var.f6326l = com.tencent.mm.R.string.cac;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            c4Var.f6326l = com.tencent.mm.R.string.cau;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
            str = "favoriteMusic";
            str2 = "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener";
        } else {
            java.lang.String format = java.lang.String.format("%s#%s", ca4.z0.t0(k17.field_snsId), jj4Var.f377855d);
            r45.bq0 bq0Var = new r45.bq0();
            r45.jq0 jq0Var = new r45.jq0();
            com.tencent.mars.xlog.Log.i("MicroMsg.Sns.GetFavDataSource", "fav sns music, from %s", k17.getUserName());
            jq0Var.e(k17.getUserName());
            jq0Var.j(c01.z1.r());
            jq0Var.g(2);
            str = "favoriteMusic";
            str2 = "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener";
            jq0Var.c(k17.getCreateTime() * 1000);
            jq0Var.d(k17.getSnsId() + "");
            jq0Var.i(format);
            if (timeLineObject != null && (y8Var = timeLineObject.AppInfo) != null) {
                jq0Var.b(y8Var.f390846d);
            }
            r45.gp0 gp0Var = new r45.gp0();
            gp0Var.g0(format);
            gp0Var.I0(jj4Var.f377858g);
            gp0Var.J0(jj4Var.f377868q);
            gp0Var.K0(k17.getTimeLine().ContentObj.f369839g);
            if (timeLineObject == null || (xs4Var = timeLineObject.ContentObj.f369852w) == null || !com.tencent.mm.vfs.w6.j(xs4Var.getString(13))) {
                z17 = false;
            } else {
                gp0Var.B0(timeLineObject.ContentObj.f369852w.getString(13));
                z17 = true;
            }
            java.lang.String str3 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.U(jj4Var);
            if (com.tencent.mm.vfs.w6.j(str3)) {
                gp0Var.B0(str3);
                z17 = true;
            }
            if (!z17) {
                gp0Var.z0(true);
                gp0Var.o0(jj4Var.f377860i);
                r45.tq0 tq0Var = new r45.tq0();
                tq0Var.o(jj4Var.f377860i);
                bq0Var.r(tq0Var);
            }
            gp0Var.D0(jj4Var.P);
            gp0Var.E0(jj4Var.Q);
            gp0Var.h0(7);
            gp0Var.O0(jj4Var.f377864o);
            gp0Var.m0(jj4Var.f377857f);
            gp0Var.x0(true);
            if (timeLineObject != null && (a90Var = timeLineObject.ContentObj) != null && a90Var.f369852w != null) {
                r45.hp0 hp0Var = new r45.hp0();
                hp0Var.C = timeLineObject.ContentObj.f369852w;
                gp0Var.J1 = hp0Var;
            }
            bq0Var.f370964f.add(gp0Var);
            bq0Var.o(jq0Var);
            c4Var.f6315a = bq0Var;
            c4Var.f6317c = 7;
            qb4.a.h(gp0Var, k17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        }
        c4Var.f6323i = this.f169757h;
        c4Var.f6327m = 25;
        doFavoriteEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favoriteMusicAlbum", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        r45.km6 km6Var = this.f169756g.ContentObj.A;
        java.lang.String str = this.f169753d;
        if (km6Var == null) {
            com.tencent.mars.xlog.Log.w(str, "favorite music fail, tingAlbumShareObject is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteMusicAlbum", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        bw5.o50 v17 = il4.d.v(km6Var.f378839e);
        if (v17 != null) {
            ((ef0.l4) ((qk.i9) i95.n0.c(qk.i9.class))).getClass();
            android.app.Activity activity = this.f169757h;
            kotlin.jvm.internal.o.g(activity, "activity");
            new cl4.v().b(activity, v17, 25);
        } else {
            com.tencent.mars.xlog.Log.e(str, "favoriteMusicAlbum categoryItem null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteMusicAlbum", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favoriteMusicMv", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f169755f);
        if (this.f169756g.ContentObj.f369840h.size() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteMusicMv", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        r45.jj4 jj4Var = (r45.jj4) this.f169756g.ContentObj.f369840h.get(0);
        if (k17 == null || jj4Var == null) {
            com.tencent.mars.xlog.Log.w(this.f169753d, "favorite music fail, snsinfo or mediaobj is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteMusicMv", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f169756g;
        r45.a90 a90Var = timeLineObject.ContentObj;
        if (a90Var.f369837e == 47) {
            ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
            java.lang.String str = jj4Var.P;
            if (str == null) {
                str = "";
            }
            ((dl4.m0) tVar).Bi(str, new com.tencent.mm.plugin.sns.ui.listener.h(this, doFavoriteEvent, k17, jj4Var));
        } else {
            qb4.a.j(doFavoriteEvent, k17, jj4Var, timeLineObject, a90Var.f369852w, null);
            android.app.Activity activity = this.f169757h;
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6323i = activity;
            c4Var.f6327m = 25;
            doFavoriteEvent.e();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteMusicMv", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favoriteProduct", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        if (this.f169756g == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteProduct", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f169756g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (timeLineObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
            c4Var.f6326l = com.tencent.mm.R.string.cac;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else {
            r45.bq0 bq0Var = new r45.bq0();
            r45.jq0 jq0Var = new r45.jq0();
            r45.aq0 aq0Var = new r45.aq0();
            jq0Var.e(timeLineObject.UserName);
            jq0Var.j(c01.z1.r());
            jq0Var.g(2);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            jq0Var.c(java.lang.System.currentTimeMillis());
            r45.y8 y8Var = timeLineObject.AppInfo;
            if (y8Var != null) {
                jq0Var.b(y8Var.f390846d);
            }
            r45.a90 a90Var = timeLineObject.ContentObj;
            if (a90Var != null) {
                aq0Var.g(a90Var.f369838f);
                aq0Var.d(timeLineObject.ContentObj.f369836d);
                java.util.LinkedList linkedList = timeLineObject.ContentObj.f369840h;
                if (linkedList != null && !linkedList.isEmpty()) {
                    r45.jj4 jj4Var = (r45.jj4) timeLineObject.ContentObj.f369840h.get(0);
                    aq0Var.i(jj4Var.f377873v);
                    aq0Var.e(jj4Var.f377872u);
                    aq0Var.f(jj4Var.f377860i);
                }
            }
            c4Var.f6318d = aq0Var.f370188d;
            c4Var.f6319e = aq0Var.f370190f;
            c4Var.f6315a = bq0Var;
            c4Var.f6317c = 10;
            bq0Var.o(jq0Var);
            bq0Var.n(aq0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        }
        c4Var.f6323i = this.f169757h;
        c4Var.f6327m = 26;
        doFavoriteEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteProduct", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favoriteTV", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        if (this.f169756g == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteTV", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f169756g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEventInfoTV", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (timeLineObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or tlObj is null");
            c4Var.f6326l = com.tencent.mm.R.string.cac;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfoTV", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        } else {
            r45.bq0 bq0Var = new r45.bq0();
            r45.jq0 jq0Var = new r45.jq0();
            r45.mq0 mq0Var = new r45.mq0();
            jq0Var.e(timeLineObject.UserName);
            jq0Var.j(c01.z1.r());
            jq0Var.g(8);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            jq0Var.c(java.lang.System.currentTimeMillis());
            r45.y8 y8Var = timeLineObject.AppInfo;
            if (y8Var != null) {
                jq0Var.b(y8Var.f390846d);
            }
            r45.a90 a90Var = timeLineObject.ContentObj;
            if (a90Var != null) {
                mq0Var.g(a90Var.f369838f);
                mq0Var.d(timeLineObject.ContentObj.f369836d);
                java.util.LinkedList linkedList = timeLineObject.ContentObj.f369840h;
                if (linkedList != null && !linkedList.isEmpty()) {
                    r45.jj4 jj4Var = (r45.jj4) timeLineObject.ContentObj.f369840h.get(0);
                    mq0Var.e(jj4Var.f377872u);
                    mq0Var.f(jj4Var.f377860i);
                }
            }
            c4Var.f6318d = mq0Var.f380735d;
            c4Var.f6319e = mq0Var.f380737f;
            c4Var.f6315a = bq0Var;
            c4Var.f6317c = 15;
            bq0Var.o(jq0Var);
            bq0Var.q(mq0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfoTV", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
        }
        c4Var.f6323i = this.f169757h;
        c4Var.f6327m = 27;
        doFavoriteEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteTV", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favoriteUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f169756g;
        java.lang.String str = timeLineObject.ContentObj.f369839g;
        java.lang.String str2 = timeLineObject.AppInfo.f390846d;
        android.app.Activity activity = this.f169757h;
        java.lang.String e17 = com.tencent.mm.plugin.sns.ui.bs.e(activity, str, str2);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(e17);
        java.lang.String str3 = this.f169753d;
        if (K0) {
            com.tencent.mars.xlog.Log.w(str3, "favorite url fail, url is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.storage.l1.b(this.f169755f);
        java.lang.String str4 = "";
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (b17 != null) {
            java.lang.String a17 = c01.n2.a("" + b17.field_snsId);
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("prePublishId", "sns_" + ca4.z0.t0(b17.field_snsId));
            c17.i("preUsername", b17.field_userName);
            c17.i("preChatName", "");
            c17.i("url", e17);
            c17.i("preMsgIndex", 0);
            c17.i("sendAppMsgScene", 1);
            c17.i("adExtStr", b17.getTimeLine().statExtStr);
            c4Var.f6322h = a17;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f169755f);
        if (k17 != null && this.f169756g.ContentObj.f369837e == 18) {
            i64.s1.d(i64.q1.AdUrl, i64.p1.Fav, i64.r1.Samll, 0, k17, this.f169758i);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f169756g.canvasInfo)) {
            n(activity, k17.getLocalid());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        if (k17.isAd()) {
            int i17 = this.f169758i;
            com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i17, i17 == 0 ? 1 : 2, b17.field_snsId, 11, 0);
            ca4.m0.f(snsAdClick, this.f169761o, k17, 11);
            ca4.z0.x0(snsAdClick);
        }
        qb4.a.c(doFavoriteEvent, e17, this.f169755f);
        c4Var.f6323i = activity;
        c4Var.f6327m = 28;
        doFavoriteEvent.e();
        if (doFavoriteEvent.f54091h.f6433a == 0) {
            long i18 = com.tencent.mm.sdk.platformtools.t8.i1();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                try {
                    str4 = java.net.URLEncoder.encode(e17, com.tencent.mapsdk.internal.rv.f51270c);
                } catch (java.io.UnsupportedEncodingException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str3, e18, "", new java.lang.Object[0]);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13378, str4, java.lang.Long.valueOf(i18), 3, 2, 1);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void n(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        if (k17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = k17.getTimeLine();
        if (k17.isAd()) {
            com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = k17.getAdSnsInfo();
            java.lang.String a17 = za4.z0.a(k17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                adSnsInfo.field_adxml = a17;
            }
            str2 = adSnsInfo.field_adxml;
        } else {
            str2 = timeLine.canvasInfo;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, dm.n.COL_ADXML, null);
        if (d17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        boolean containsKey = d17.containsKey(".adxml.adCanvasInfo");
        android.app.Activity activity = this.f169757h;
        if (!containsKey) {
            db5.e1.i(activity, com.tencent.mm.R.string.cam, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        java.lang.String a18 = c01.n2.a("" + k17.field_snsId);
        java.lang.String str3 = (java.lang.String) d17.get(".adxml.adCanvasInfo.shareTitle");
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = (java.lang.String) d17.get(".adxml.adCanvasInfo.shareWebUrl");
        if (str4 == null) {
            str4 = "";
        }
        java.lang.String str5 = (java.lang.String) d17.get(".adxml.adCanvasInfo.shareDesc");
        java.lang.String str6 = str5 != null ? str5 : "";
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.autogen.events.SnsfillEventInfoEvent snsfillEventInfoEvent = new com.tencent.mm.autogen.events.SnsfillEventInfoEvent();
        am.kx kxVar = snsfillEventInfoEvent.f54854g;
        kxVar.f7188b = str;
        kxVar.f7189c = doFavoriteEvent;
        kxVar.f7187a = str4;
        snsfillEventInfoEvent.e();
        boolean z17 = snsfillEventInfoEvent.f54855h.f7277a;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (!z17) {
            if (c4Var.f6326l == 0) {
                c4Var.f6326l = com.tencent.mm.R.string.cak;
            }
            db5.e1.i(activity, c4Var.f6326l, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        c4Var.f6322h = a18;
        c4Var.f6318d = str3;
        c4Var.f6319e = str6;
        r45.bq0 bq0Var = c4Var.f6315a;
        if (bq0Var != null && (linkedList = bq0Var.f370964f) != null && linkedList.size() > 0 && bq0Var.f370964f.get(0) != null) {
            ((r45.gp0) bq0Var.f370964f.get(0)).Z(str2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(((r45.gp0) bq0Var.f370964f.get(0)).f375404d)) {
                ((r45.gp0) bq0Var.f370964f.get(0)).O0(c4Var.f6318d);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(((r45.gp0) bq0Var.f370964f.get(0)).f375408f)) {
                ((r45.gp0) bq0Var.f370964f.get(0)).m0(c4Var.f6319e);
            }
            r45.jq0 jq0Var = new r45.jq0();
            jq0Var.e(timeLine.UserName);
            jq0Var.j(c01.z1.r());
            jq0Var.g(2);
            jq0Var.c(java.lang.System.currentTimeMillis());
            bq0Var.o(jq0Var);
        }
        c4Var.f6323i = activity;
        c4Var.f6327m = 28;
        doFavoriteEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favouriteAdNativeLandingPages", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void o(android.content.Context context, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent;
        am.c4 c4Var;
        java.lang.String str4;
        int i17;
        java.lang.String str5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favouriteCardUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        if (k17 == null || !k17.isAd()) {
            str2 = null;
        } else {
            str2 = k17.getAdInfoLink();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str2 = k17.getAdLink();
            }
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
        android.app.Activity activity = this.f169757h;
        if (K0) {
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f169756g;
            str2 = com.tencent.mm.plugin.sns.ui.bs.e(activity, timeLineObject.ContentObj.f369839g, timeLineObject.AppInfo.f390846d);
        }
        java.lang.String str6 = str2;
        boolean K02 = com.tencent.mm.sdk.platformtools.t8.K0(str6);
        java.lang.String str7 = this.f169753d;
        if (K02) {
            com.tencent.mars.xlog.Log.w(str7, "favorite url fail, url is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favouriteCardUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent2 = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.storage.l1.b(this.f169755f);
        int i18 = 1;
        am.c4 c4Var2 = doFavoriteEvent2.f54090g;
        if (b17 != null) {
            java.lang.String a17 = c01.n2.a("" + b17.field_snsId);
            c01.l2 c17 = c01.n2.d().c(a17, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sns_");
            str3 = str7;
            doFavoriteEvent = doFavoriteEvent2;
            sb6.append(ca4.z0.t0(b17.field_snsId));
            c17.i("prePublishId", sb6.toString());
            c17.i("preUsername", b17.field_userName);
            c17.i("preChatName", "");
            c17.i("url", str6);
            c17.i("preMsgIndex", 0);
            i18 = 1;
            c17.i("sendAppMsgScene", 1);
            c17.i("adExtStr", b17.getTimeLine().statExtStr);
            c4Var2.f6322h = a17;
        } else {
            str3 = str7;
            doFavoriteEvent = doFavoriteEvent2;
        }
        if (k17 == null || !(this.f169756g.ContentObj.f369837e == 18 || k17.isAd())) {
            c4Var = c4Var2;
            str4 = "";
            i17 = i18;
        } else {
            c4Var = c4Var2;
            str4 = "";
            i17 = 1;
            i64.s1.d(i64.q1.AdUrl, i64.p1.Fav, i64.r1.Samll, 0, k17, this.f169758i);
            if (this.f169756g != null) {
                int i19 = this.f169758i;
                com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i19, i19 == 0 ? 1 : 2, b17.field_snsId, 11, 0);
                ca4.m0.f(snsAdClick, this.f169761o, k17, 11);
                ca4.z0.x0(snsAdClick);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f169756g.canvasInfo)) {
            n(activity, k17.getLocalid());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favouriteCardUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent3 = doFavoriteEvent;
        qb4.a.c(doFavoriteEvent3, str6, this.f169755f);
        c4Var.f6323i = activity;
        c4Var.f6327m = 28;
        doFavoriteEvent3.e();
        if (doFavoriteEvent3.f54091h.f6433a == 0) {
            long i110 = com.tencent.mm.sdk.platformtools.t8.i1();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
                try {
                    str5 = java.net.URLEncoder.encode(str6, com.tencent.mapsdk.internal.rv.f51270c);
                } catch (java.io.UnsupportedEncodingException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str3, e17, str4, new java.lang.Object[0]);
                    str5 = str4;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13378, str5, java.lang.Long.valueOf(i110), 3, 2, java.lang.Integer.valueOf(i17));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favouriteCardUrl", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002c. Please report as an issue. */
    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int i18;
        int i19;
        java.lang.String str;
        r45.a90 a90Var;
        int i27;
        java.lang.String t17;
        int i28;
        java.lang.String str2 = "onMMMenuItemSelected";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        if (this.f169754e == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        int itemId = menuItem.getItemId();
        com.tencent.mm.sdk.platformtools.f9 f9Var = com.tencent.mm.sdk.platformtools.f9.ContextTranslate;
        ta4.y0 y0Var = ta4.y0.f416863a;
        int i29 = this.f169758i;
        w04.a aVar = w04.a.INSTANCE;
        int i37 = 5;
        java.lang.String str3 = this.f169753d;
        com.tencent.mm.plugin.sns.model.k4 k4Var = this.f169759m;
        android.app.Activity activity = this.f169757h;
        switch (itemId) {
            case 0:
                java.lang.String t18 = t();
                if (com.tencent.mm.sdk.platformtools.t8.K0(t18)) {
                    t18 = this.f169756g.ContentDesc;
                }
                java.lang.String s17 = s(t18);
                if (com.tencent.mm.sdk.platformtools.b0.f(s17)) {
                    db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.f490361st));
                    i18 = 2;
                    aVar.A9(2, this.f169756g.Id, com.tencent.mm.sdk.platformtools.t8.o0(s17));
                } else {
                    i18 = 2;
                    db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.f490360ss));
                }
                y0Var.d(i18, this.f169755f, 1, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 1:
                java.lang.String t19 = t();
                if (com.tencent.mm.sdk.platformtools.t8.K0(t19)) {
                    t19 = this.f169756g.ContentDesc;
                }
                if (com.tencent.mm.plugin.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f169755f, this.f169756g.Id);
                }
                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                java.lang.String str4 = this.f169755f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                qb4.a.f(doFavoriteEvent, str4, t19, 0, 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                am.c4 c4Var = doFavoriteEvent.f54090g;
                c4Var.f6323i = activity;
                c4Var.f6327m = 30;
                doFavoriteEvent.e();
                y0Var.d(4, this.f169755f, 1, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 2:
                if (com.tencent.mm.plugin.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f169755f, this.f169756g.Id);
                }
                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent2 = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.storage.l1.b(this.f169755f);
                if (b17.isAd() && b17.getAdXml().isLandingPagesAd()) {
                    n(activity, this.f169755f);
                } else if (this.f169756g.showFlag == 1) {
                    qb4.a.b(doFavoriteEvent2, this.f169755f, 0);
                    am.c4 c4Var2 = doFavoriteEvent2.f54090g;
                    c4Var2.f6323i = activity;
                    c4Var2.f6327m = 31;
                    doFavoriteEvent2.e();
                } else if (this.f169754e.getTag() instanceof com.tencent.mm.plugin.sns.ui.oj) {
                    qb4.a.b(doFavoriteEvent2, this.f169755f, ((com.tencent.mm.plugin.sns.ui.oj) this.f169754e.getTag()).f170103b);
                    am.c4 c4Var3 = doFavoriteEvent2.f54090g;
                    c4Var3.f6323i = activity;
                    c4Var3.f6327m = 31;
                    doFavoriteEvent2.e();
                }
                if (b17.isAd()) {
                    int i38 = this.f169758i;
                    com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i38, i38 == 0 ? 1 : 2, b17.field_snsId, 11, 0);
                    ca4.m0.f(snsAdClick, this.f169761o, b17, 11);
                    ca4.z0.x0(snsAdClick);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1929, 8);
                }
                y0Var.d(4, this.f169755f, 3, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 3:
                if (com.tencent.mm.plugin.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f169755f, this.f169756g.Id);
                }
                y0Var.d(4, this.f169755f, 3, "");
                m();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 4:
                if (com.tencent.mm.plugin.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f169755f, this.f169756g.Id);
                }
                h();
                y0Var.d(4, this.f169755f, 3, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 5:
                if (com.tencent.mm.plugin.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f169755f, this.f169756g.Id);
                }
                k();
                y0Var.d(4, this.f169755f, 3, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 6:
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 7:
                com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f169755f);
                if (k17 == null) {
                    com.tencent.mars.xlog.Log.w(str3, "delete comment fail!!! snsInfo is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    return;
                }
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
                u1Var.g(activity.getResources().getString(com.tencent.mm.R.string.j9o));
                u1Var.n(activity.getResources().getString(com.tencent.mm.R.string.f490367t0));
                u1Var.k(activity.getResources().getColor(com.tencent.mm.R.color.f479482a31));
                u1Var.l(new com.tencent.mm.plugin.sns.ui.listener.f(this, k17));
                u1Var.j(activity.getResources().getString(com.tencent.mm.R.string.f490347sg));
                u1Var.i(new com.tencent.mm.plugin.sns.ui.listener.d(this, k17));
                u1Var.q(false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 8:
                com.tencent.mm.plugin.sns.storage.SnsInfo k18 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f169755f);
                if (k18 != null) {
                    com.tencent.mm.plugin.sns.abtest.a.c(k18);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("sns_permission_snsinfo_svr_id", k18.field_snsId);
                    intent.putExtra("sns_permission_userName", k18.getUserName());
                    intent.putExtra("sns_permission_anim", true);
                    intent.setClass(activity, com.tencent.mm.plugin.sns.ui.SnsPermissionUI.class);
                    android.app.Activity activity2 = this.f169757h;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(11);
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.k(activity2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 9:
                if (com.tencent.mm.plugin.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f169755f, this.f169756g.Id);
                }
                l();
                y0Var.d(4, this.f169755f, 3, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 10:
                if (com.tencent.mm.plugin.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f169755f, this.f169756g.Id);
                }
                com.tencent.mm.plugin.sns.storage.SnsInfo b18 = com.tencent.mm.plugin.sns.storage.l1.b(this.f169755f);
                if (b18 != null && b18.isAd() && b18.getAdXml().isLandingPagesAd()) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo k19 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f169755f);
                    if (k19 != null && k19.isAd()) {
                        int i39 = this.f169758i;
                        com.tencent.mm.modelsns.SnsAdClick snsAdClick2 = new com.tencent.mm.modelsns.SnsAdClick(i39, i39 == 0 ? 1 : 2, b18.field_snsId, 11, 0);
                        ca4.m0.f(snsAdClick2, this.f169761o, b18, 11);
                        ca4.z0.x0(snsAdClick2);
                    }
                    n(activity, this.f169755f);
                } else {
                    p(activity, this.f169755f);
                }
                if (b18 != null && b18.isAd()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1929, 8);
                }
                y0Var.d(4, this.f169755f, 3, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 11:
                if (this.f169754e.getTag() instanceof com.tencent.mm.plugin.sns.ui.u1) {
                    com.tencent.mm.plugin.sns.ui.u1 u1Var2 = (com.tencent.mm.plugin.sns.ui.u1) this.f169754e.getTag();
                    if (com.tencent.mm.sdk.platformtools.b0.f(u1Var2.f170555c)) {
                        db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.f490361st));
                        r45.e86 e86Var = u1Var2.f170557e;
                        if (e86Var != null) {
                            aVar.A9(4, this.f169756g.Id + ":" + e86Var.f373132m, com.tencent.mm.sdk.platformtools.t8.o0(u1Var2.f170555c));
                        }
                    } else {
                        db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.f490360ss));
                    }
                    y0Var.d(2, this.f169755f, 2, u1Var2.f170556d);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 12:
                r45.jj4 jj4Var = (r45.jj4) this.f169756g.ContentObj.f369840h.get(0);
                java.lang.String str5 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.U(jj4Var);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("Select_Conv_Type", 3);
                intent2.putExtra("select_is_ret", true);
                intent2.putExtra("mutil_select_is_ret", true);
                intent2.putExtra("image_path", str5);
                intent2.putExtra("Retr_Msg_Type", 11);
                j45.l.v(activity, ".ui.transmit.SelectConversationUI", intent2, 15);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 13:
                com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f169755f);
                int i47 = com.tencent.mm.plugin.sns.abtest.a.f162563a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealNotInterest", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealNotInterest", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 14:
                if (f9Var.k(this.f169754e.getContext(), null)) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo k110 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f169755f);
                    if (k110 != null) {
                        if (i29 == 0) {
                            m21.w.d(com.tencent.mm.plugin.appbrand.jsapi.pay.b1.CTRL_INDEX);
                        } else {
                            m21.w.c(com.tencent.mm.plugin.appbrand.jsapi.pay.b1.CTRL_INDEX);
                        }
                        ca4.z0.T(k110);
                        k110.isAd();
                        k110.getUxinfo();
                    }
                    com.tencent.mm.plugin.sns.model.s6.m(k110);
                    y0Var.d(5, this.f169755f, 1, "");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 15:
                if ((this.f169754e.getTag() instanceof com.tencent.mm.plugin.sns.ui.u1) && f9Var.k(this.f169754e.getContext(), null)) {
                    com.tencent.mm.plugin.sns.ui.u1 u1Var3 = (com.tencent.mm.plugin.sns.ui.u1) this.f169754e.getTag();
                    com.tencent.mm.plugin.sns.storage.SnsInfo b19 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(u1Var3.f170554b);
                    if (b19 != null) {
                        if (i29 == 0) {
                            m21.w.d(715);
                        } else {
                            m21.w.c(715);
                        }
                        ca4.z0.T(b19);
                        b19.isAd();
                        b19.getUxinfo();
                        r45.e86 e86Var2 = u1Var3.f170557e;
                    }
                    com.tencent.mm.plugin.sns.model.s6.l((com.tencent.mm.plugin.sns.ui.u1) this.f169754e.getTag());
                    y0Var.d(5, this.f169755f, 2, u1Var3.f170556d);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 16:
                com.tencent.mm.plugin.sns.model.s6.n(com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f169755f));
                y0Var.d(10, this.f169755f, 1, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 17:
                if (this.f169754e.getTag() instanceof com.tencent.mm.plugin.sns.ui.u1) {
                    com.tencent.mm.plugin.sns.ui.u1 u1Var4 = (com.tencent.mm.plugin.sns.ui.u1) this.f169754e.getTag();
                    java.util.HashMap hashMap = com.tencent.mm.plugin.sns.model.s6.f164679a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    if (u1Var4 != null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        r45.e86 e86Var3 = u1Var4.f170557e;
                        int i48 = e86Var3.f373132m;
                        sb6.append(i48 != 0 ? i48 : e86Var3.f373137r);
                        sb6.append("");
                        java.lang.String e17 = com.tencent.mm.plugin.sns.model.s6.e(u1Var4.f170554b, sb6.toString());
                        com.tencent.mm.plugin.sns.model.s6.p(com.tencent.mm.plugin.sns.model.s6.f(e17));
                        com.tencent.mm.autogen.events.SnsUnTranslateEvent snsUnTranslateEvent = new com.tencent.mm.autogen.events.SnsUnTranslateEvent();
                        am.gx gxVar = snsUnTranslateEvent.f54850g;
                        i19 = 2;
                        gxVar.f6796a = 2;
                        gxVar.f6797b = e17;
                        snsUnTranslateEvent.e();
                    } else {
                        i19 = 2;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    y0Var.d(10, this.f169755f, i19, u1Var4.f170556d);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 18:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendData", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                com.tencent.mm.plugin.sns.storage.SnsInfo k111 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f169755f);
                if (k111 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendData", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                } else {
                    android.content.Intent intent3 = new android.content.Intent();
                    if (k111.isPhoto()) {
                        r45.jj4 c17 = com.tencent.mm.plugin.sns.model.s5.c(k111, this.f169754e.getTag() instanceof com.tencent.mm.plugin.sns.ui.oj ? ((com.tencent.mm.plugin.sns.ui.oj) this.f169754e.getTag()).f170103b : 0);
                        if (c17 == null) {
                            com.tencent.mars.xlog.Log.w(str3, "send photo fail, mediaObj is null");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendData", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                        } else {
                            java.lang.String str6 = c17.f377855d;
                            intent3.putExtra("sns_send_data_ui_image_path", com.tencent.mm.plugin.sns.ui.FlipView.m(com.tencent.mm.plugin.sns.model.i1.l(c17), activity));
                            intent3.putExtra("sns_send_data_ui_image_media_id", str6);
                            intent3.putExtra("exdevice_open_scene_type", 1);
                            intent3.putExtra("sns_local_id", this.f169755f);
                            intent3.putExtra("sns_send_data_ui_activity", true);
                            j45.l.u(activity, ".ui.chatting.ChattingSendDataToDeviceUI", intent3, null);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendData", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                        }
                    } else {
                        if ((k111.getTimeLine().ContentObj.f369837e == 4 || k111.getTimeLine().ContentObj.f369837e == 42 || k111.getTimeLine().ContentObj.f369837e == 47 || k111.getTimeLine().ContentObj.f369837e == 48 || k111.getTimeLine().ContentObj.f369837e == 15 || k111.getTimeLine().ContentObj.f369837e == 3) && (k111.getTimeLine().ContentObj.f369840h.isEmpty() || k111.getTimeLine().ContentObj.f369840h.get(0) == null)) {
                            com.tencent.mars.xlog.Log.w(str3, "mediaObj is null, send failed!");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendData", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                        }
                        intent3.putExtra("exdevice_open_scene_type", 1);
                        intent3.putExtra("sns_local_id", this.f169755f);
                        intent3.putExtra("sns_send_data_ui_activity", true);
                        j45.l.u(activity, ".ui.chatting.ChattingSendDataToDeviceUI", intent3, null);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendData", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 19:
                q(activity);
                y0Var.d(8, this.f169755f, 3, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 20:
                if (com.tencent.mm.plugin.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f169755f, this.f169756g.Id);
                }
                com.tencent.mm.plugin.sns.storage.SnsInfo b27 = com.tencent.mm.plugin.sns.storage.l1.b(this.f169755f);
                if (b27 != null && b27.isAd() && b27.getAdXml().isLandingPagesAd()) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo k112 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f169755f);
                    if (k112 != null && k112.isAd() && this.f169756g != null) {
                        int i49 = this.f169758i;
                        com.tencent.mm.modelsns.SnsAdClick snsAdClick3 = new com.tencent.mm.modelsns.SnsAdClick(i49, i49 == 0 ? 1 : 2, b27.field_snsId, 11, 0);
                        ca4.m0.f(snsAdClick3, this.f169761o, b27, 11);
                        ca4.z0.x0(snsAdClick3);
                    }
                    n(activity, this.f169755f);
                } else {
                    o(activity, this.f169755f);
                }
                if (b27 != null && b27.isAd()) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1929, 7);
                }
                y0Var.d(4, this.f169755f, 3, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 21:
                com.tencent.mm.plugin.sns.storage.SnsInfo b28 = com.tencent.mm.plugin.sns.storage.l1.b(this.f169755f);
                if (b28 == null) {
                    com.tencent.mars.xlog.Log.w(str3, "edit photo fail, info is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    return;
                }
                str2 = "onMMMenuItemSelected";
                if (this.f169754e.getTag() == null || !(this.f169754e.getTag() instanceof com.tencent.mm.plugin.sns.ui.oj)) {
                    com.tencent.mars.xlog.Log.w(str3, "edit photo fail, tag is null or tag is not SnsImageViewTag");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    return;
                }
                com.tencent.mm.plugin.sns.ui.oj ojVar = (com.tencent.mm.plugin.sns.ui.oj) this.f169754e.getTag();
                android.app.Activity activity3 = this.f169757h;
                android.content.Intent intent4 = menuItem.getIntent();
                int i57 = this.f169758i;
                com.tencent.mm.plugin.sns.ui.kj.c(activity3, intent4, b28, ojVar, i57 == 0 ? 1 : 2, i57, this.f169759m);
                y0Var.d(6, this.f169755f, 3, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 22:
                str = "onMMMenuItemSelected";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favoriteNoteLink", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                if (this.f169756g == null) {
                    com.tencent.mars.xlog.Log.e(str3, "favNotelink,tlobj is null, return");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteNoteLink", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                } else {
                    com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent3 = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                    qb4.a.g(doFavoriteEvent3, this.f169755f);
                    am.c4 c4Var4 = doFavoriteEvent3.f54090g;
                    c4Var4.f6323i = activity;
                    c4Var4.f6327m = 28;
                    doFavoriteEvent3.e();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteNoteLink", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                }
                y0Var.d(4, this.f169755f, 3, "");
                str2 = str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 23:
                str = "onMMMenuItemSelected";
                f();
                y0Var.d(4, this.f169755f, 3, "");
                str2 = str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 24:
                str = "onMMMenuItemSelected";
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = this.f169756g;
                if (timeLineObject != null && timeLineObject.ContentObj != null) {
                    ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).f(this.f169756g.ContentObj.f369846q);
                    db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.cbq));
                    y0Var.d(4, this.f169755f, 3, "");
                }
                str2 = str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 25:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favoriteVideoCard", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = this.f169756g;
                if (timeLineObject2 == null || (a90Var = timeLineObject2.ContentObj) == null || !((i27 = a90Var.f369837e) == 28 || i27 == 59 || i27 == 50)) {
                    str = "onMMMenuItemSelected";
                } else {
                    com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent4 = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject3 = this.f169756g;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEventFinderFeedInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                    am.c4 c4Var5 = doFavoriteEvent4.f54090g;
                    if (timeLineObject3 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, tlObj is null");
                        c4Var5.f6326l = com.tencent.mm.R.string.cad;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventFinderFeedInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                        str = "onMMMenuItemSelected";
                    } else {
                        java.lang.String format = java.lang.String.format("%s", timeLineObject3.Id);
                        r45.bq0 bq0Var = new r45.bq0();
                        r45.jq0 jq0Var = new r45.jq0();
                        r45.gp0 gp0Var = new r45.gp0();
                        str = "onMMMenuItemSelected";
                        jq0Var.e(timeLineObject3.UserName);
                        jq0Var.j(c01.z1.r());
                        jq0Var.g(2);
                        jq0Var.c(timeLineObject3.CreateTime * 1000);
                        jq0Var.d(timeLineObject3.Id + "");
                        jq0Var.i(format);
                        gp0Var.g0(format);
                        qb4.a.i(gp0Var, timeLineObject3);
                        gp0Var.h0(20);
                        if (timeLineObject3.ContentObj.f369852w != null) {
                            r45.hp0 hp0Var = new r45.hp0();
                            hp0Var.C = timeLineObject3.ContentObj.f369852w;
                            gp0Var.J1 = hp0Var;
                        }
                        gp0Var.z0(true);
                        gp0Var.x0(true);
                        bq0Var.f370964f.add(gp0Var);
                        bq0Var.o(jq0Var);
                        bq0Var.i(timeLineObject3.ContentObj.f369844o);
                        c4Var5.f6315a = bq0Var;
                        c4Var5.f6317c = 20;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventFinderFeedInfo", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                    }
                    c4Var5.f6323i = activity;
                    doFavoriteEvent4.e();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favoriteVideoCard", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                y0Var.d(4, this.f169755f, 3, "");
                str2 = str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 26:
                com.tencent.mm.plugin.sns.storage.SnsInfo b29 = com.tencent.mm.plugin.sns.storage.l1.b(this.f169755f);
                com.tencent.mm.plugin.sns.ui.oj ojVar2 = (com.tencent.mm.plugin.sns.ui.oj) this.f169754e.getTag();
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = b29.getTimeLine();
                r45.jj4 jj4Var2 = ojVar2.f170103b < timeLine.ContentObj.f369840h.size() ? (r45.jj4) timeLine.ContentObj.f369840h.get(ojVar2.f170103b) : new r45.jj4();
                su4.i1 i1Var = new su4.i1();
                i1Var.f412923b = activity;
                i1Var.f412928g = com.tencent.mm.plugin.sns.model.i1.l(jj4Var2);
                i1Var.f412927f = b29.field_userName;
                if ((activity instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) || (activity instanceof com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3)) {
                    i1Var.f412925d = 10;
                } else if (activity instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) {
                    i1Var.f412925d = 7;
                }
                i1Var.f412929h = jj4Var2;
                i1Var.f412926e = ca4.z0.t0(b29.field_snsId);
                ((com.tencent.mm.plugin.websearch.w1) ((su4.x0) i95.n0.c(su4.x0.class))).fj(i1Var);
                y0Var.d(7, this.f169755f, 3, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 27:
            case 29:
                if (29 == menuItem.getItemId()) {
                    com.tencent.mm.plugin.sns.ui.u1 u1Var5 = (com.tencent.mm.plugin.sns.ui.u1) this.f169754e.getTag();
                    if (u1Var5 != null) {
                        y0Var.d(7, this.f169755f, 2, u1Var5.f170556d);
                        t17 = u1Var5.f170555c;
                    } else {
                        t17 = null;
                    }
                } else {
                    t17 = t();
                    y0Var.d(7, this.f169755f, 1, "");
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(t17)) {
                    t17 = this.f169756g.ContentDesc;
                }
                java.lang.String s18 = s(t17);
                ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                java.lang.String l17 = o13.n.l(77);
                su4.j2 j2Var = new su4.j2();
                j2Var.f412942e = l17;
                j2Var.f412938a = activity;
                j2Var.f412941d = s18;
                j2Var.f412939b = 77;
                j2Var.f412943f = true;
                j2Var.f412945h = true;
                j2Var.f412946i = false;
                j2Var.f412958u = true;
                j2Var.f412952o = i65.a.d(activity, com.tencent.mm.R.color.aaw);
                j2Var.f412953p = false;
                ((java.util.HashMap) j2Var.f412944g).put("chatSearch", "1");
                ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
                if (activity instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) {
                    if (menuItem.getItemId() == 29) {
                        i28 = 7;
                        com.tencent.mm.plugin.sns.storage.SnsInfo b37 = com.tencent.mm.plugin.sns.storage.l1.b(this.f169755f);
                        tg0.v1 v1Var = (tg0.v1) i95.n0.c(tg0.v1.class);
                        java.lang.String t07 = ca4.z0.t0(b37.field_snsId);
                        long length = s18.length();
                        ((sg0.q3) v1Var).getClass();
                        su4.k3.d(2, l17, 77, 0, "", "", t07, "", 3, "", 0L, length, i28, "", "", -1, 0);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                        return;
                    }
                    i28 = i37;
                    com.tencent.mm.plugin.sns.storage.SnsInfo b372 = com.tencent.mm.plugin.sns.storage.l1.b(this.f169755f);
                    tg0.v1 v1Var2 = (tg0.v1) i95.n0.c(tg0.v1.class);
                    java.lang.String t072 = ca4.z0.t0(b372.field_snsId);
                    long length2 = s18.length();
                    ((sg0.q3) v1Var2).getClass();
                    su4.k3.d(2, l17, 77, 0, "", "", t072, "", 3, "", 0L, length2, i28, "", "", -1, 0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    return;
                }
                if (!(activity instanceof com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI)) {
                    i28 = 0;
                    com.tencent.mm.plugin.sns.storage.SnsInfo b3722 = com.tencent.mm.plugin.sns.storage.l1.b(this.f169755f);
                    tg0.v1 v1Var22 = (tg0.v1) i95.n0.c(tg0.v1.class);
                    java.lang.String t0722 = ca4.z0.t0(b3722.field_snsId);
                    long length22 = s18.length();
                    ((sg0.q3) v1Var22).getClass();
                    su4.k3.d(2, l17, 77, 0, "", "", t0722, "", 3, "", 0L, length22, i28, "", "", -1, 0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    return;
                }
                i37 = 6;
                i28 = i37;
                com.tencent.mm.plugin.sns.storage.SnsInfo b37222 = com.tencent.mm.plugin.sns.storage.l1.b(this.f169755f);
                tg0.v1 v1Var222 = (tg0.v1) i95.n0.c(tg0.v1.class);
                java.lang.String t07222 = ca4.z0.t0(b37222.field_snsId);
                long length222 = s18.length();
                ((sg0.q3) v1Var222).getClass();
                su4.k3.d(2, l17, 77, 0, "", "", t07222, "", 3, "", 0L, length222, i28, "", "", -1, 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 28:
                if (com.tencent.mm.plugin.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f169755f, this.f169756g.Id);
                }
                j();
                y0Var.d(4, this.f169755f, 3, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 30:
                if (com.tencent.mm.plugin.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f169755f, this.f169756g.Id);
                }
                i();
                y0Var.d(4, this.f169755f, 3, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 31:
                d();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 32:
                if (com.tencent.mm.plugin.sns.ui.kw.K(k4Var)) {
                    k4Var.a().g(this.f169755f, this.f169756g.Id);
                }
                g();
                y0Var.d(4, this.f169755f, 3, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 33:
                c();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 34:
                com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = new com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest();
                com.tencent.mm.plugin.sns.storage.SnsInfo b38 = com.tencent.mm.plugin.sns.storage.l1.b(this.f169755f);
                if (b38 != null) {
                    settingsTranslateLanguageRequest.f67822e = "sns_content_" + b38.getSnsId();
                    ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(activity, settingsTranslateLanguageRequest);
                    y0Var.d(12, this.f169755f, 1, "");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 35:
                com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest2 = new com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest();
                if (this.f169754e.getTag() instanceof com.tencent.mm.plugin.sns.ui.u1) {
                    com.tencent.mm.plugin.sns.ui.u1 u1Var6 = (com.tencent.mm.plugin.sns.ui.u1) this.f169754e.getTag();
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    r45.e86 e86Var4 = u1Var6.f170557e;
                    int i58 = e86Var4.f373132m;
                    sb7.append(i58 != 0 ? i58 : e86Var4.f373137r);
                    sb7.append("");
                    settingsTranslateLanguageRequest2.f67822e = "sns_comment_" + com.tencent.mm.plugin.sns.model.s6.e(u1Var6.f170554b, sb7.toString());
                    ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(activity, settingsTranslateLanguageRequest2);
                    y0Var.d(12, this.f169755f, 2, u1Var6.f170556d);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 36:
                com.tencent.mm.plugin.sns.storage.SnsInfo b39 = com.tencent.mm.plugin.sns.storage.l1.b(this.f169755f);
                com.tencent.mm.plugin.sns.ui.oj ojVar3 = (com.tencent.mm.plugin.sns.ui.oj) this.f169754e.getTag();
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine2 = b39.getTimeLine();
                r45.jj4 jj4Var3 = ojVar3.f170103b < timeLine2.ContentObj.f369840h.size() ? (r45.jj4) timeLine2.ContentObj.f369840h.get(ojVar3.f170103b) : new r45.jj4();
                java.lang.String l18 = com.tencent.mm.plugin.sns.model.i1.l(jj4Var3);
                if (!com.tencent.mm.vfs.w6.j(l18)) {
                    l18 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var3.f377855d) + ca4.z0.U(jj4Var3);
                }
                if (!com.tencent.mm.vfs.w6.j(l18)) {
                    com.tencent.mars.xlog.Log.e(str3, "image search path not ready");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                    return;
                }
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("imgPath", l18);
                hashMap2.put("snsMediaMid", jj4Var3.f377855d);
                hashMap2.put("snsMediaTid", ca4.z0.t0(b39.field_snsId));
                hashMap2.put("reuseImageInfo", new tg0.a(jj4Var3.G, jj4Var3.I, jj4Var3.H, jj4Var3.f377859h, jj4Var3.f377858g).a());
                ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ai(activity, 2, 5, hashMap2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
            case 37:
                if (this.f169754e.getTag() instanceof com.tencent.mm.plugin.sns.ui.u1) {
                    com.tencent.mm.plugin.sns.ui.u1 u1Var7 = (com.tencent.mm.plugin.sns.ui.u1) this.f169754e.getTag();
                    java.util.LinkedList linkedList = u1Var7.f170557e.f373140u;
                    if (linkedList != null && !linkedList.isEmpty()) {
                        r45.l86 f17 = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.f(com.tencent.mm.plugin.sns.storage.w2.n(u1Var7.f170554b), u1Var7.f170557e);
                        if (f17 == null || f17.f379230d == null || f17.f379231e == null) {
                            com.tencent.mars.xlog.Log.e(str3, "add emoticon info is null");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                            return;
                        }
                        final com.tencent.mm.api.IEmojiInfo wi6 = ((com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class))).wi(((com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class))).Bi(f17.f379230d, f17.f379231e.f371841f));
                        com.tencent.mm.plugin.sns.ui.widget.r2 r2Var = com.tencent.mm.plugin.sns.ui.widget.r2.f171259a;
                        int i59 = u1Var7.f170561i == 0 ? 1 : 3;
                        r2Var.h(wi6, i59, ca4.z0.t0(com.tencent.mm.plugin.sns.storage.w2.n(u1Var7.f170554b)), u1Var7.f170557e.f373132m + "");
                        final int i66 = 1000078;
                        ((com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class))).Ni(wi6, new yz5.l(wi6, i66) { // from class: com.tencent.mm.plugin.sns.ui.listener.c$$a

                            /* renamed from: e, reason: collision with root package name */
                            public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f169763e;

                            @Override // yz5.l
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                com.tencent.mm.plugin.sns.ui.listener.c cVar = com.tencent.mm.plugin.sns.ui.listener.c.this;
                                cVar.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onMMMenuItemSelected$0", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                                com.tencent.mars.xlog.Log.i(cVar.f169753d, "CONTEXT_MENU_ID_COPY_COMMENT >> loadEmoticonFileFromIEmojiInfo: %b", (java.lang.Boolean) obj);
                                ((com.tencent.mm.feature.emoji.s0) ((com.tencent.mm.feature.emoji.api.y5) i95.n0.c(com.tencent.mm.feature.emoji.api.y5.class))).wi(cVar.f169754e.getContext(), this.f169763e, 1000078, null);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onMMMenuItemSelected$0", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                                return null;
                            }
                        });
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return;
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = false;
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        objArr[2] = java.lang.Integer.valueOf(m1Var != null ? m1Var.getType() : -1);
        java.lang.String str3 = this.f169753d;
        com.tencent.mars.xlog.Log.i(str3, "onSceneEnd errType=%d, errCode=%d, sceneType=%d", objArr);
        if (m1Var instanceof com.tencent.mm.plugin.sns.model.q2) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f169760n;
            if (u3Var == null) {
                com.tencent.mars.xlog.Log.i(str3, "onSceneEnd: delProgressDialog null");
            } else if (u3Var.isShowing()) {
                z17 = true;
            } else {
                com.tencent.mars.xlog.Log.i(str3, "onSceneEnd: delProgressDialog not showing");
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i(str3, "delProgressDialog dismiss");
                this.f169760n.dismiss();
                com.tencent.mm.plugin.sns.model.q2 q2Var = (com.tencent.mm.plugin.sns.model.q2) m1Var;
                int L = q2Var.L();
                if (L == 4 || L == 6) {
                    android.app.Activity activity = this.f169757h;
                    if (i17 == 0 && i18 == 0) {
                        db5.t7.i(activity, activity.getResources().getString(com.tencent.mm.R.string.md7), com.tencent.mm.R.raw.icons_filled_done);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentUsername", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                        r45.e86 e86Var = q2Var.f164592i;
                        if (e86Var == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentUsername", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            str2 = "";
                        } else {
                            java.lang.String str4 = e86Var.f373126d;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentUsername", "com.tencent.mm.plugin.sns.model.NetSceneSnsObjectOp");
                            str2 = str4;
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.D0(str2, c01.z1.r())) {
                            com.tencent.mm.plugin.sns.storage.v1 D0 = com.tencent.mm.plugin.sns.model.l4.Aj().D0(q2Var.M(), q2Var.J(), q2Var.L() == 6 ? 10 : 9);
                            if (D0 != null) {
                                D0.u0();
                                com.tencent.mm.plugin.sns.model.l4.Aj().update(D0.systemRowid, D0);
                            }
                        }
                    } else {
                        db5.t7.i(activity, activity.getResources().getString(com.tencent.mm.R.string.md6), com.tencent.mm.R.raw.icons_outlined_error);
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void p(android.content.Context context, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favouriteSight", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        if (k17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favouriteSight", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        if (k17.isAd()) {
            i64.s1.d(i64.q1.Sight, i64.p1.Fav, i64.r1.Samll, 0, k17, this.f169758i);
            int i17 = this.f169758i;
            com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(i17, i17 == 0 ? 1 : 2, k17.field_snsId, 11, 0);
            ca4.m0.f(snsAdClick, this.f169761o, k17, 11);
            ca4.z0.x0(snsAdClick);
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        qb4.a.e(doFavoriteEvent, k17);
        android.app.Activity activity = this.f169757h;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6323i = activity;
        c4Var.f6327m = 29;
        doFavoriteEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favouriteSight", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void q(android.content.Context context) {
        java.lang.String str;
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f169755f);
        java.lang.String str2 = this.f169753d;
        if (k17 == null) {
            com.tencent.mars.xlog.Log.w(str2, "mute play video but sns info is null.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        if (k17.isAd()) {
            com.tencent.mars.xlog.Log.w(str2, "mute play video but it is ad");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        if (k17.getTimeLine() == null || k17.getTimeLine().ContentObj == null || com.tencent.mm.sdk.platformtools.t8.L0(k17.getTimeLine().ContentObj.f369840h)) {
            com.tencent.mars.xlog.Log.w(str2, "mute play video but media is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        r45.jj4 jj4Var = (r45.jj4) k17.getTimeLine().ContentObj.f369840h.get(0);
        if (jj4Var == null) {
            com.tencent.mars.xlog.Log.w(str2, "mute paly video but media is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
        if (com.tencent.mm.vfs.w6.j(d17 + ca4.z0.R(jj4Var))) {
            str = d17 + ca4.z0.U(jj4Var);
        } else {
            str = "";
        }
        if (com.tencent.mm.vfs.w6.j(d17 + ca4.z0.Y(jj4Var))) {
            str = d17 + ca4.z0.a0(jj4Var);
        }
        int[] iArr = new int[2];
        android.view.View view = this.f169754e;
        if (view != null) {
            view.getLocationInWindow(iArr);
            i17 = this.f169754e.getWidth();
            i18 = this.f169754e.getHeight();
        } else {
            i17 = 0;
            i18 = 0;
        }
        if (jj4Var.f377856e == 8) {
            com.tencent.mars.xlog.Log.i(str2, "click to play fake sns video");
            android.content.Intent intent = new android.content.Intent();
            if (k17.getTimeLine().videoTemplate == null) {
                intent.setClassName(context, "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
            } else {
                intent.setClassName(context, "com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoActivity");
            }
            intent.putExtra("intent_video_is_preview", false);
            intent.putExtra("intent_video_is_mute_play", true);
            intent.putExtra("intent_video_sns_local_id", com.tencent.mm.plugin.sns.storage.w2.m(this.f169755f));
            intent.putExtra("intent_video_sns_create_time", k17.getCreateTime());
            if (this.f169754e != null) {
                intent.putExtra("intent_left", iArr[0]);
                intent.putExtra("intent_top", iArr[1]);
                intent.putExtra("intent_width", i17);
                intent.putExtra("intent_height", i18);
            }
            intent.putExtra("intent_video_thumb_path", str);
            android.app.Activity activity = this.f169757h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener", "mutePlayVideo", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener", "mutePlayVideo", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("intent_thumbpath", str);
        intent2.putExtra("intent_localid", this.f169755f);
        intent2.putExtra("intent_from_scene", this.f169758i);
        intent2.putExtra("intent_ismute", true);
        gc4.n nVar = gc4.n.f270465a;
        r45.m1 m1Var = this.f169756g.actionInfo.f383556m;
        intent2.putExtra("intent_third_sdk_msg", nVar.b(m1Var.f380054d, m1Var.f380056f));
        intent2.putExtra("intent_publish_id", ca4.z0.s0(k17.field_snsId));
        android.app.Activity activity2 = this.f169757h;
        intent2.putExtra("intent_bottom_height", com.tencent.mm.ui.bl.c(activity2));
        if (context instanceof com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI) {
            intent2.putExtra("sns_video_scene", 5);
        } else if (context instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI) {
            intent2.putExtra("sns_video_scene", 6);
        }
        if (this.f169754e != null) {
            intent2.putExtra("img_gallery_left", iArr[0]);
            intent2.putExtra("img_gallery_top", iArr[1]);
            intent2.putExtra("img_gallery_width", i17);
            intent2.putExtra("img_gallery_height", i18);
        }
        if (!pc4.d.f353410a.d(k17.getTimeLine()) || k17.isAd()) {
            intent2.setClass(activity2, com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.class);
            android.app.Activity activity3 = this.f169757h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activity3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener", "mutePlayVideo", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity3.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activity3, "com/tencent/mm/plugin/sns/ui/listener/TimeLineMMMenuItemSelectedListener", "mutePlayVideo", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity2.overridePendingTransition(0, 0);
        } else {
            ik4.l lVar = ik4.l.f291941a;
            java.lang.String str3 = jj4Var.f377855d;
            intent2.putExtra("intent_fromplayingvideo", str3 != null ? ik4.l.f291944d.containsKey(str3) : false);
            com.tencent.mm.plugin.sns.ui.flexible.SnsFlexibleVideoActivity.f168350d.a(activity2, intent2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("mutePlayVideo", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public void r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mars.xlog.Log.i(this.f169753d, "removeListener");
        gm0.j1.i();
        gm0.j1.n().f273288b.q(218, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeListener", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
    }

    public final java.lang.String s(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryGetAdText", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        android.view.View view = this.f169754e;
        if (view != null && (view.getTag(com.tencent.mm.R.id.r0u) instanceof com.tencent.mm.plugin.sns.ui.go)) {
            com.tencent.mm.plugin.sns.ui.go goVar = (com.tencent.mm.plugin.sns.ui.go) this.f169754e.getTag(com.tencent.mm.R.id.r0u);
            if (goVar.f168451g && !com.tencent.mm.sdk.platformtools.t8.K0(goVar.f168452h)) {
                java.lang.String str2 = goVar.f168452h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetAdText", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
                return str2;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetAdText", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        return str;
    }

    public final java.lang.String t() {
        com.tencent.mm.plugin.sns.model.r6 f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryGetTranslatedContent", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        android.view.View view = this.f169754e;
        if (view != null && (view instanceof com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextView)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetTranslatedContent", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return null;
        }
        if (view == null || !(view.getTag() instanceof com.tencent.mm.plugin.sns.ui.go) || !((com.tencent.mm.plugin.sns.ui.go) this.f169754e.getTag()).c() || (f17 = com.tencent.mm.plugin.sns.model.s6.f(com.tencent.mm.plugin.sns.model.l4.Fj().k1(this.f169755f).getSnsId())) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetTranslatedContent", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            return null;
        }
        java.lang.String str = f17.f164645b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetTranslatedContent", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        return str;
    }
}
