package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class v extends com.tencent.mm.ui.component.UIComponent implements ed0.r0 {

    /* renamed from: d, reason: collision with root package name */
    public int f158498d;

    /* renamed from: e, reason: collision with root package name */
    public int f158499e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f158500f;

    /* renamed from: g, reason: collision with root package name */
    public final int f158501g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.j0 f158502h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f158503i;

    /* renamed from: m, reason: collision with root package name */
    public long f158504m;

    /* renamed from: n, reason: collision with root package name */
    public int f158505n;

    /* renamed from: o, reason: collision with root package name */
    public ox3.g f158506o;

    /* renamed from: p, reason: collision with root package name */
    public int f158507p;

    /* renamed from: q, reason: collision with root package name */
    public ox3.g f158508q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f158509r;

    /* renamed from: s, reason: collision with root package name */
    public int f158510s;

    /* renamed from: t, reason: collision with root package name */
    public f25.m0 f158511t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f158498d = 1;
        this.f158499e = 1;
        this.f158500f = "";
        this.f158501g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ringtone_video_timeline, 0);
        this.f158502h = new androidx.lifecycle.j0();
        this.f158504m = -1L;
        this.f158505n = -1;
        this.f158507p = -1;
        this.f158510s = -1;
    }

    public final void O6() {
        ox3.f fVar;
        java.util.List data;
        if (this.f158507p >= 0) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f158503i;
            if (wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null) {
                fVar = null;
            } else {
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f158503i;
                fVar = (ox3.f) kz5.n0.a0(data, (wxRecyclerAdapter2 != null ? wxRecyclerAdapter2.a0() : 0) + this.f158507p);
            }
            if (fVar != null) {
                ((ox3.g) fVar).f349750e = false;
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = this.f158503i;
            if (wxRecyclerAdapter3 != null) {
                wxRecyclerAdapter3.notifyItemChanged((wxRecyclerAdapter3 != null ? wxRecyclerAdapter3.a0() : 0) + this.f158507p, java.lang.Boolean.FALSE);
            }
            this.f158509r = true;
            this.f158510s = this.f158507p;
        }
    }

    public final void P6() {
        ox3.f fVar;
        java.util.List data;
        if (Q6() && this.f158509r) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f158503i;
            if (wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null) {
                fVar = null;
            } else {
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f158503i;
                fVar = (ox3.f) kz5.n0.a0(data, (wxRecyclerAdapter2 != null ? wxRecyclerAdapter2.a0() : 0) + this.f158510s);
            }
            if (fVar != null) {
                ((ox3.g) fVar).f349750e = true;
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter3 = this.f158503i;
            if (wxRecyclerAdapter3 != null) {
                wxRecyclerAdapter3.notifyItemChanged((wxRecyclerAdapter3 != null ? wxRecyclerAdapter3.a0() : 0) + this.f158510s, java.lang.Boolean.TRUE);
            }
        }
        this.f158509r = false;
    }

    public final boolean Q6() {
        if (this.f158501g > 1) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            if (((com.tencent.mm.plugin.ringtone.uic.c3) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class)).f158374f != 3) {
                return true;
            }
        }
        return false;
    }

    public final void R6(vx3.i ringtoneInfo, int i17, int i18, long j17, java.lang.String itemContext, int i19) {
        kotlin.jvm.internal.o.g(ringtoneInfo, "ringtoneInfo");
        kotlin.jvm.internal.o.g(itemContext, "itemContext");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        int i27 = ((com.tencent.mm.plugin.ringtone.uic.c3) zVar.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class)).f158374f;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        jSONObject.put("session_id", ((com.tencent.mm.plugin.ringtone.uic.c3) zVar.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.c3.class)).f158373e);
        jSONObject.put("feed_id", ringtoneInfo.d());
        jSONObject.put("position", i19);
        jSONObject.put("entrance", this.f158499e);
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        jSONObject.put("search_request_id", ((com.tencent.mm.plugin.ringtone.uic.d2) zVar.a(activity3).a(com.tencent.mm.plugin.ringtone.uic.d2.class)).R6());
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i27);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_user", c01.z1.r());
        intent.putExtra("feed_object_id", ringtoneInfo.f441298o);
        intent.putExtra("feed_object_nonceId", ringtoneInfo.f441299p);
        intent.putExtra("key_session_id", c01.id.a());
        intent.putExtra("key_feed_report_enter", i17);
        intent.putExtra("key_feed_report_enter_type", i18);
        intent.putExtra("key_reuqest_scene", 28);
        intent.putExtra("key_comment_scene", 25);
        intent.putExtra("KEY_RINGTONE_RECALL_ID", j17);
        intent.putExtra("key_session_id", itemContext);
        intent.putExtra("KEY_RINGTONE_REPORT_JSON", t17);
        int i28 = this.f158499e;
        intent.putExtra("KEY_RINGTONE_TO_USERNAME", (i28 == 6 || i28 == 9 || i28 == 10) ? "" : this.f158500f);
        intent.putExtra("KEY_RINGTONE_CHANNEL", this.f158499e);
        intent.putExtra("KEY_RINGTONE_CHOOSE_SCENE", i27);
        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
        kotlin.jvm.internal.o.g(activity4, "activity");
        intent.putExtra("KEY_RINGTONE_REC_REQUEST_ID", ((com.tencent.mm.plugin.ringtone.uic.g2) zVar.a(activity4).a(com.tencent.mm.plugin.ringtone.uic.g2.class)).Q6());
        intent.putExtra("KEY_IS_VIDEO_STREAM", this.f158501g > 1);
        androidx.appcompat.app.AppCompatActivity activity5 = getActivity();
        kotlin.jvm.internal.o.g(activity5, "activity");
        kk4.v vVar = ((com.tencent.mm.plugin.ringtone.uic.z1) zVar.a(activity5).a(com.tencent.mm.plugin.ringtone.uic.z1.class)).f158560d.f367380m;
        intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", vVar != null ? vVar.o() : 0L);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(i17, i18, 25, intent);
        intent.putExtra("key_extra_info", "");
        intent.putExtra("key_enable_ringtone_bubble", true);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        zy2.ta.b(ya2.e1.f460472a, getContext(), intent, false, 4, null);
    }

    public final void T6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("ringtone_caller", this.f158498d);
        intent.putExtra("ringtone_channel", this.f158499e);
        intent.putExtra("exclusvie_name", this.f158500f);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneSearchUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(5);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/api/FinderRouterApi", "enterFinderRingtoneSearchUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void U6(int i17, ox3.g ringtoneConvertData) {
        t45.f fVar;
        vx3.i a17;
        kotlin.jvm.internal.o.g(ringtoneConvertData, "ringtoneConvertData");
        t45.g gVar = ringtoneConvertData.f349749d.f415617f;
        if (gVar == null || (fVar = gVar.f415560d) == null || (a17 = qx3.d.a(fVar.f415549d)) == null) {
            return;
        }
        t45.h0 h0Var = gVar.f415576w;
        java.lang.String str = a17.f441308y ? h0Var != null ? h0Var.f415586f : null : gVar.f415567n;
        java.lang.String str2 = h0Var != null ? h0Var.f415587g : null;
        if (!(str == null || str.length() == 0)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", str);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.w(getActivity(), intent);
            return;
        }
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RingtoneDataUIC", "singerFinderUsername and singerBaikeUrl is null!");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", str2);
        j45.l.j(getContext(), "webview", ".ui.tools.WebViewUI", intent2, null);
    }

    public final void V6(int i17, boolean z17, ox3.g gVar) {
        W6();
        if (z17) {
            this.f158507p = i17 != -1 ? i17 : this.f158507p;
            if (i17 == -1 || gVar == null) {
                gVar = this.f158508q;
            }
            this.f158508q = gVar;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f158504m = java.lang.System.currentTimeMillis();
            this.f158505n = this.f158507p;
            this.f158506o = this.f158508q;
        } else if (this.f158507p == i17) {
            this.f158507p = -1;
            this.f158508q = null;
            this.f158504m = 0L;
            this.f158505n = -1;
            this.f158506o = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataUIC", "onPlayStateChange, position:" + i17 + ", play:" + z17 + ", curPlayPosition:" + this.f158507p);
    }

    public final void W6() {
        int i17 = this.f158505n;
        ox3.g gVar = this.f158506o;
        long j17 = this.f158504m;
        if (i17 < 0 || gVar == null) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.c3) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class)).O6(2L, i17, gVar, currentTimeMillis);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f158498d = getIntent().getIntExtra("ringtone_caller", 1);
        java.lang.String stringExtra = getIntent().getStringExtra("exclusvie_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f158500f = stringExtra;
        this.f158499e = getIntent().getIntExtra("ringtone_channel", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataUIC", "userName:" + this.f158500f);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((com.tencent.mm.plugin.ringtone.uic.c3) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class)).f158374f != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataUIC", "hookPlayState");
            kotlinx.coroutines.l.d(getMainScope(), null, null, new com.tencent.mm.plugin.ringtone.uic.i(this, null), 3, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (by3.a.f36370b) {
            b21.m.g();
            ((ll3.j1) ((c21.i) i95.n0.c(c21.i.class))).getClass();
            b21.r b17 = b21.m.b();
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicFloatBallService", "resumeMusicFloatBall %s", b17);
            if ((b17 == null || b17.N) ? false : true) {
                b17.N = true;
                b21.m.k(b17);
            }
            ll3.q0.d(b17);
        }
        by3.a.f36370b = false;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ed0.z0.i1((ed0.z0) a17, 10L, this.f158507p, this.f158508q, 0L, 8, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        O6();
        W6();
        this.f158507p = -1;
        this.f158508q = null;
        this.f158505n = -1;
        this.f158506o = null;
        this.f158504m = 0L;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        f25.m0 m0Var = this.f158511t;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f158511t = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.w.f259115c, new com.tencent.mm.plugin.ringtone.uic.u(this));
        P6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        f25.m0 m0Var = this.f158511t;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
    }
}
