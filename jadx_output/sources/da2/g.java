package da2;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public r45.hj2 f227749a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f227750b;

    /* renamed from: c, reason: collision with root package name */
    public long f227751c;

    /* renamed from: d, reason: collision with root package name */
    public final kk4.g0 f227752d;

    /* renamed from: e, reason: collision with root package name */
    public final qd2.g f227753e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f227754f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f227755g;

    /* renamed from: h, reason: collision with root package name */
    public kk4.b f227756h;

    /* renamed from: i, reason: collision with root package name */
    public zy2.g5 f227757i;

    public g(r45.hj2 hj2Var, androidx.appcompat.app.AppCompatActivity activity, long j17, kk4.g0 g0Var, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 4) != 0 ? 0L : j17;
        g0Var = (i17 & 8) != 0 ? null : g0Var;
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f227749a = hj2Var;
        this.f227750b = activity;
        this.f227751c = j17;
        this.f227752d = g0Var;
        this.f227754f = "";
        this.f227753e = new qd2.g(activity, c(), new da2.b(this));
    }

    public static boolean l(da2.g gVar, r45.zi2 zi2Var, long j17, java.lang.String str, int i17, long j18, int i18, boolean z17, android.content.Intent intent, int i19, java.lang.Object obj) {
        r45.r23 r23Var;
        android.content.Intent intent2 = (i19 & 128) != 0 ? null : intent;
        gVar.getClass();
        r45.rz6 rz6Var = (zi2Var == null || (r23Var = (r45.r23) zi2Var.getCustom(17)) == null) ? null : (r45.rz6) r23Var.getCustom(1);
        if (rz6Var == null) {
            return false;
        }
        r45.q23 q23Var = new r45.q23();
        q23Var.f383585d = rz6Var.f385320d;
        q23Var.f383586e = rz6Var.f385321e;
        q23Var.f383587f = rz6Var.f385322f;
        q23Var.f383594p = j17;
        q23Var.f383591m = str;
        if (intent2 == null) {
            intent2 = new android.content.Intent();
        }
        android.content.Intent intent3 = intent2;
        if (!(str == null || str.length() == 0)) {
            com.tencent.mars.xlog.Log.i("FinderMusicTopicPostHandler", "handleClickPost: case2 post by feed music id " + str);
            intent3.putExtra("KEY_FINDER_POST_MUSIC_FEEDID", str);
        }
        intent3.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", zi2Var.toByteArray());
        intent3.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", zi2Var.getString(12));
        intent3.putExtra("KEY_ORIGIN_MUSIC_PLAY_DURATION", gVar.e(zi2Var));
        intent3.putExtra("key_ref_feed_id", gVar.f());
        com.tencent.mm.plugin.finder.storage.FinderItem c17 = gVar.c();
        intent3.putExtra("key_ref_feed_dup_flag", c17 != null ? c17.getDupFlag() : null);
        androidx.appcompat.app.AppCompatActivity activity = gVar.f227750b;
        kotlin.jvm.internal.o.g(activity, "activity");
        intent3.putExtra("key_ref_comment_scene", ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
        intent3.putExtra("KEY_FINDER_NEED_POST_TO_COMMENT", true);
        if (!z17) {
            intent3.putExtra("KEY_FINDER_MJ_PUBLISHER_SHOW_MOVIE_COMPOSING_ENTRANCE", true);
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("source_feedid", pm0.v.u(j18 != 0 ? j18 : gVar.f()));
        jSONObject.put("source_songid", zi2Var.getString(12));
        java.lang.String str2 = gVar.f227755g;
        if (str2 != null) {
            jSONObject.put("source_audioid", str2);
        }
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).Di(gVar.f227750b, q23Var, gVar.f(), i17, intent3, jSONObject, i18, false);
        return true;
    }

    public final java.lang.String a(long j17) {
        java.lang.String string;
        if (j17 == 0) {
            com.tencent.mm.plugin.finder.storage.FinderItem c17 = c();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = c17 != null ? cu2.u.f222441a.p(c17) : null;
            j17 = p17 != null ? p17.getItemId() : 0L;
        }
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i("FinderMusicTopicPostHandler", "checkFeedMusicId: id is zero");
            return null;
        }
        r45.hj2 hj2Var = this.f227749a;
        if (hj2Var == null || (string = hj2Var.getString(10)) == null) {
            com.tencent.mars.xlog.Log.e("FinderMusicTopicPostHandler", "checkFeedMusicId: prefix is null");
            return null;
        }
        java.lang.String str = string + ((java.lang.Object) jz5.x.a(j17));
        com.tencent.mars.xlog.Log.i("FinderMusicTopicPostHandler", "checkFeedMusicId: " + str);
        return str;
    }

    public final android.content.Intent b(int i17, r45.zi2 zi2Var, java.lang.String str) {
        java.lang.String str2;
        java.lang.Object m521constructorimpl;
        java.lang.String postId;
        android.content.Intent intent = new android.content.Intent();
        if (i17 == 1001) {
            intent.putExtra("key_finder_post_router", 2);
            intent.putExtra("key_maas_entrance", 7);
        } else {
            intent.putExtra("key_finder_post_router", 3);
        }
        java.lang.String a17 = this.f227753e.a();
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH", a17);
        java.lang.String str3 = "";
        if (zi2Var == null || (str2 = zi2Var.getString(5)) == null) {
            str2 = "";
        }
        intent.putExtra("KEY_FINDER_POST_ORIGIN_BGM_URL", str2);
        r45.hj2 hj2Var = this.f227749a;
        com.tencent.mm.plugin.finder.storage.FinderItem c17 = c();
        androidx.appcompat.app.AppCompatActivity activity = this.f227750b;
        java.lang.String c18 = hc2.m0.c(hj2Var, activity, c17);
        java.lang.String a18 = hc2.m0.a(this.f227749a, activity);
        int e17 = e(zi2Var);
        com.tencent.mm.plugin.finder.storage.FinderItem c19 = c();
        boolean b17 = kotlin.jvm.internal.o.b(c19 != null ? c19.getUserName() : null, xy2.c.e(activity));
        intent.putExtra("key_finder_post_from", 18);
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject != null && (postId = finderFeedReportObject.getPostId()) != null) {
            str3 = postId;
        }
        intent.putExtra("key_finder_post_id", str3);
        if (!(str == null || str.length() == 0)) {
            com.tencent.mars.xlog.Log.i("FinderMusicTopicPostHandler", "innerPost: case3 post by feed music id " + str);
            intent.putExtra("KEY_FINDER_POST_MUSIC_FEEDID", str);
        }
        if (a17.length() > 0) {
            java.lang.String string = zi2Var != null ? zi2Var.getString(5) : null;
            if ((string == null || string.length() == 0) && zi2Var != null) {
                zi2Var.set(5, a17);
            }
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", zi2Var != null ? zi2Var.toByteArray() : null));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        if (((android.content.Intent) m521constructorimpl) == null) {
            com.tencent.mars.xlog.Log.e("FinderMusicTopicPostHandler", "innerPost: to pb error");
        }
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", zi2Var != null ? zi2Var.getString(12) : null);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", c18);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_COVER_URL", a18);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PLAY_DURATION", e17);
        intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_AUTHOR", this.f227754f);
        intent.putExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", b17);
        intent.putExtra("key_maas_entrance", 7);
        intent.putExtra("key_ref_feed_id", f());
        com.tencent.mm.plugin.finder.storage.FinderItem c27 = c();
        intent.putExtra("key_ref_feed_dup_flag", c27 != null ? c27.getDupFlag() : null);
        kotlin.jvm.internal.o.g(activity, "activity");
        intent.putExtra("key_ref_comment_scene", ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
        intent.putExtra("KEY_FINDER_NEED_POST_TO_COMMENT", true);
        return intent;
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem c() {
        return bu2.j.f24534a.h(f());
    }

    public final r45.zi2 d() {
        r45.hj2 hj2Var = this.f227749a;
        r45.zi2 zi2Var = hj2Var != null ? (r45.zi2) hj2Var.getCustom(3) : null;
        java.lang.String string = zi2Var != null ? zi2Var.getString(12) : null;
        if (!(string == null || string.length() == 0) && zi2Var != null) {
            zi2Var.set(0, zi2Var.getString(12));
        }
        return zi2Var;
    }

    public final int e(r45.zi2 zi2Var) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem c17 = c();
        int b17 = (c17 == null || (feedObject = c17.getFeedObject()) == null) ? 0 : (int) bu2.z.b(feedObject);
        if (b17 > 0) {
            return b17;
        }
        if (zi2Var != null) {
            return zi2Var.getInteger(9);
        }
        return 0;
    }

    public final long f() {
        if (this.f227751c == 0) {
            this.f227751c = hc2.m0.b(this.f227750b);
        }
        return this.f227751c;
    }

    public final void g(java.lang.String source, android.content.Context targetContext, int i17, long j17, long j18) {
        int i18;
        int i19;
        java.lang.String str;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        int i27;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        int i28;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String string;
        java.lang.String str4;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(targetContext, "targetContext");
        com.tencent.mars.xlog.Log.i("FinderMusicTopicPostHandler", "handleClickPost: source=" + source + ", enterScene=" + i17 + ", feedId=" + pm0.v.u(f()) + " targetFeedId=" + pm0.v.u(j17) + ", targetContext=" + targetContext);
        r45.zi2 d17 = d();
        java.lang.String a17 = a(j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[handlePost] name:");
        sb6.append(d17 != null ? d17.getString(2) : null);
        sb6.append(" docId:");
        sb6.append(d17 != null ? d17.getString(0) : null);
        sb6.append(" song_id:");
        sb6.append(d17 != null ? d17.getString(12) : null);
        sb6.append(" mediaStreamingUrl:");
        sb6.append(d17 != null ? d17.getString(5) : null);
        com.tencent.mars.xlog.Log.i("FinderMusicTopicPostHandler", sb6.toString());
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        androidx.appcompat.app.AppCompatActivity context = this.f227750b;
        p2Var.W(p2Var.i(context, i17, false));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(gm0.j1.b().j());
        sb7.append('_');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb7.append(java.lang.System.currentTimeMillis());
        java.lang.String sb8 = sb7.toString();
        p2Var.T(sb8, null);
        p2Var.R(sb8);
        int hashCode = source.hashCode();
        if (hashCode == -324092691) {
            if (source.equals("HeaderPost")) {
                i18 = 3401;
                i19 = i18;
            }
            i19 = 0;
        } else if (hashCode != 148559304) {
            if (hashCode == 343709003 && source.equals("EffectTemplate")) {
                i18 = 3403;
                i19 = i18;
            }
            i19 = 0;
        } else {
            if (source.equals("BottomBar")) {
                i18 = 3402;
                i19 = i18;
            }
            i19 = 0;
        }
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject2 != null) {
            finderFeedReportObject2.setChildEnterScene(i19);
        }
        long f17 = f();
        com.tencent.mm.plugin.finder.storage.FinderItem c17 = c();
        if (c17 != null) {
            str = sb8;
            baseFinderFeed = cu2.u.f222441a.p(c17);
        } else {
            str = sb8;
            baseFinderFeed = null;
        }
        java.lang.String w17 = baseFinderFeed != null ? baseFinderFeed.w() : null;
        kotlin.jvm.internal.o.g(context, "context");
        if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            i27 = i19;
            nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        } else {
            i27 = i19;
            nyVar = null;
        }
        p2Var.U(f17, w17, nyVar != null ? nyVar.f135380n : 0);
        java.lang.String string2 = d17 != null ? d17.getString(12) : null;
        if (!(string2 == null || string2.length() == 0) && (finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b) != null) {
            finderFeedReportObject.setSongId(string2);
        }
        android.content.Intent intent = context.getIntent();
        int intExtra = intent != null ? intent.getIntExtra("key_source_postion", 0) : 0;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject3 = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject3 != null) {
            finderFeedReportObject3.setSourcePosition(intExtra);
        }
        boolean b17 = kotlin.jvm.internal.o.b("EffectTemplate", source);
        if (b17) {
            android.content.Intent intent2 = new android.content.Intent();
            java.lang.String str5 = this.f227755g;
            if (str5 == null) {
                r45.hj2 hj2Var = this.f227749a;
                str4 = hj2Var != null ? hj2Var.getString(15) : null;
                if (str4 == null) {
                    str4 = "";
                }
            } else {
                str4 = str5;
            }
            intent2.putExtra("KEY_FINDER_SOURCE_AUDIO_ID", str4);
            l(this, d17, j18, a17, i17, j17, i27, b17, null, 128, null);
            return;
        }
        if (!((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).Vi()) {
            i95.m c18 = i95.n0.c(w40.e.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.ui.widget.dialog.k0 kg6 = w40.e.kg((w40.e) c18, targetContext, null, i17, 2, null);
            kg6.f211872n = da2.d.f227739d;
            kg6.f211881s = new da2.e(this, d17, j18, a17, i17, j17, i27, targetContext);
            kg6.f211854d = da2.f.f227748d;
            kg6.v();
            return;
        }
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        us2.u.n(i17, false);
        if (l(this, d17, j18, a17, i17, j17, i27, b17, null, 128, null) || this.f227753e.e(targetContext)) {
            return;
        }
        ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Vi("FinderMusicAggregationPageFollowShootingButton", i17, 0, str, true, "", (d17 == null || (string = d17.getString(12)) == null) ? "" : string, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("source_feedid", pm0.v.u(j17 != 0 ? j17 : f()));
        jSONObject.put("source_songid", d17 != null ? d17.getString(12) : null);
        java.lang.String str6 = this.f227755g;
        if (str6 == null) {
            r45.hj2 hj2Var2 = this.f227749a;
            if (hj2Var2 != null) {
                i28 = 15;
                str3 = hj2Var2.getString(15);
            } else {
                i28 = 15;
                str3 = null;
            }
            str6 = str3 == null ? "" : str3;
        } else {
            i28 = 15;
        }
        jSONObject.put("source_audioid", str6);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        p2Var.V(r26.i0.t(jSONObject2, ",", ";", false));
        android.content.Intent b18 = b(1001, d17, a17);
        b18.putExtra("KEY_FINDER_MJ_PUBLISHER_SHOW_MOVIE_COMPOSING_ENTRANCE", true);
        java.lang.String str7 = this.f227755g;
        if (str7 == null) {
            r45.hj2 hj2Var3 = this.f227749a;
            str2 = hj2Var3 != null ? hj2Var3.getString(i28) : null;
            if (str2 == null) {
                str2 = "";
            }
        } else {
            str2 = str7;
        }
        b18.putExtra("KEY_FINDER_SOURCE_AUDIO_ID", str2);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(context, b18);
    }

    public final void i(int i17, android.content.Context context, long j17) {
        java.lang.String str;
        long j18 = j17;
        com.tencent.mars.xlog.Log.i("FinderMusicTopicPostHandler", "innerPost " + i17 + " downloadFinish=" + this.f227753e.f361730d);
        r45.zi2 d17 = d();
        java.lang.String a17 = a(j18);
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("source_feedid", pm0.v.u(j18 != 0 ? j18 : f()));
        jSONObject.put("source_songid", d17 != null ? d17.getString(12) : null);
        jSONObject.put("source_audioid", this.f227755g);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        p2Var.V(r26.i0.t(jSONObject2, ",", ";", false));
        if (i17 == 1001) {
            pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
            java.lang.String hj6 = ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).hj();
            if (j18 == 0) {
                j18 = f();
            }
            java.lang.String u17 = pm0.v.u(j18);
            if (d17 == null || (str = d17.getString(12)) == null) {
                str = "";
            }
            ((yy0.m7) l0Var).Vi("FinderMusicAggregationPageFollowShootingButton", 21, 0, hj6, true, u17, str, "");
        } else if (this.f227753e.e(context)) {
            return;
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(context, b(i17, d17, a17));
    }

    public final void j() {
        qd2.g gVar = this.f227753e;
        dn.m mVar = gVar.f361735i;
        if (mVar != null) {
            c50.y0 y0Var = (c50.y0) ((jz5.n) gVar.f361734h).getValue();
            java.lang.String field_mediaId = mVar.field_mediaId;
            kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
            ((mn2.q0) y0Var).c(field_mediaId);
        }
        pm0.v.C(gVar.f361736j);
        kk4.b bVar = this.f227756h;
        if (bVar != null) {
            ((kk4.v) bVar).f308599x = null;
        }
        if (bVar != null) {
            ((kk4.v) bVar).P();
        }
        this.f227756h = null;
        zy2.g5 g5Var = this.f227757i;
        if (g5Var != null) {
            ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) g5Var).d();
        }
        zy2.g5 g5Var2 = this.f227757i;
        if (g5Var2 != null) {
            ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) g5Var2).b();
        }
        this.f227757i = null;
    }

    public final void k() {
        r45.hj2 hj2Var = this.f227749a;
        this.f227753e.d(hj2Var != null ? (r45.zi2) hj2Var.getCustom(3) : null);
    }
}
