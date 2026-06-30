package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public abstract class ee extends com.tencent.mm.plugin.finder.viewmodel.component.mb0 {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f134265m;

    /* renamed from: f, reason: collision with root package name */
    public boolean f134266f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f134267g;

    /* renamed from: h, reason: collision with root package name */
    public int f134268h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f134269i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f134267g = "";
        this.f134269i = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.de.f134139d);
    }

    public static final boolean f7() {
        com.tencent.mm.plugin.finder.assist.y5 y5Var = com.tencent.mm.plugin.finder.assist.y5.f102716a;
        g92.b bVar = g92.b.f269769e;
        r45.yt2 yt2Var = (r45.yt2) bVar.k2().d().getCustom(18);
        int integer = yt2Var != null ? yt2Var.getInteger(4) : 3;
        r45.yt2 yt2Var2 = (r45.yt2) bVar.k2().d().getCustom(18);
        int integer2 = yt2Var2 != null ? yt2Var2.getInteger(5) : 1;
        boolean z17 = !y5Var.c() ? y5Var.a() >= integer2 : y5Var.a() >= integer;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isCanFreqCtrl limit:");
        sb6.append(integer);
        sb6.append(" isSetIn90:");
        sb6.append(y5Var.c());
        sb6.append(" limit90:");
        sb6.append(integer2);
        sb6.append(" today:");
        sb6.append(y5Var.a());
        sb6.append(" ctrl:");
        sb6.append(z17);
        sb6.append(" RING_TONE_LIMIT:");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.E9;
        sb6.append(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue());
        com.tencent.mars.xlog.Log.i("Finder.FinderRingToneManager", sb6.toString());
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == 1) {
            return true;
        }
        return z17;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void P6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        U6(holder);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void Q6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedRingtoneUIC", "showRingtoneInfo");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LAST_REMIND_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        int a17 = com.tencent.mm.plugin.finder.assist.y5.f102716a.a() + 1;
        java.lang.String format = new java.text.SimpleDateFormat("yyyyMMdd").format((java.lang.Object) new java.util.Date());
        kotlin.jvm.internal.o.d(format);
        long parseLong = (java.lang.Long.parseLong(format) * 1000) + a17;
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedRingtoneUIC", "increaseTodayRemindCount todayCount:" + a17 + " formatCount:" + parseLong);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TODAY_REMIND_COUNT_LONG_SYNC, java.lang.Long.valueOf(parseLong));
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public boolean X6(in5.s0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return d7(holder, z17) && R6(holder) != null;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void c7(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        super.c7(holder);
        U6(holder);
    }

    public final boolean d7(in5.s0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E9).getValue()).r()).intValue() == 1) {
            return true;
        }
        java.lang.Object obj = holder.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed != null) {
            int l17 = nv2.n1.f340551h.l(baseFinderFeed.getFeedObject().getFeedObject());
            int ringtone_count = baseFinderFeed.getFeedObject().field_finderObject.getRingtone_count();
            com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = baseFinderFeed.getFeedObject().getFeedObject().getObjectDesc();
            r45.u25 originalsound_info = objectDesc != null ? objectDesc.getOriginalsound_info() : null;
            g92.b bVar = g92.b.f269769e;
            r45.yt2 yt2Var = (r45.yt2) bVar.k2().d().getCustom(18);
            boolean z18 = yt2Var != null ? yt2Var.getBoolean(6) : false;
            if (z17 && z18 && ringtone_count > 0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderFeedRingtoneUIC", "isShowRingtoneInfo self show ringtoneCount:" + ringtone_count + '.');
                return true;
            }
            r45.yt2 yt2Var2 = (r45.yt2) bVar.k2().d().getCustom(18);
            int integer = yt2Var2 != null ? yt2Var2.getInteger(0) : 30;
            r45.yt2 yt2Var3 = (r45.yt2) bVar.k2().d().getCustom(18);
            int integer2 = yt2Var3 != null ? yt2Var3.getInteger(1) : 10;
            if (!android.text.TextUtils.isEmpty(originalsound_info != null ? originalsound_info.getString(1) : null)) {
                integer = integer2;
            }
            boolean z19 = l17 >= 10000 ? ((float) ringtone_count) > ((((float) l17) * 1.0f) / ((float) 10000)) * ((float) integer) : ringtone_count > integer;
            if (!hc2.b0.a(baseFinderFeed)) {
                com.tencent.mars.xlog.Log.i("Finder.FinderFeedRingtoneUIC", "isShowRingtoneInfo return for canShareRingTone");
            } else if (baseFinderFeed.getFeedObject().isDisableShowSetRingtoneBtn()) {
                com.tencent.mars.xlog.Log.i("Finder.FinderFeedRingtoneUIC", "isShowRingtoneInfo return for isDisableShowSetRingtoneBtn");
            } else {
                if (baseFinderFeed.getFeedObject().isShowSetRingtoneBtn()) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderFeedRingtoneUIC", "isShowRingtoneInfo return for isShowSetRingtoneBtn");
                    return true;
                }
                if (baseFinderFeed.getFeedObject().isEnableShowSetRingtoneBtn()) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderFeedRingtoneUIC", "isShowRingtoneInfo return for isEnableShowSetRingtoneBtn");
                    return f7();
                }
                if (f7() && z19) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int e7(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        int width = view.getWidth();
        java.lang.Object parent = view.getParent();
        android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (width > 0 || view2 == null) {
            return width;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 0), android.view.View.MeasureSpec.makeMeasureSpec(view2.getHeight(), 0));
        return new android.graphics.Point(view.getMeasuredWidth(), view.getMeasuredHeight()).x;
    }

    public void g7(in5.s0 holder) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        boolean z17 = false;
        if (activity != null && (intent = activity.getIntent()) != null) {
            z17 = intent.getBooleanExtra("key_enable_ringtone_bubble", false);
        }
        f134265m = z17;
    }

    public final void h7(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, java.lang.String str) {
        kotlin.jvm.internal.o.g(feed, "feed");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("feedid", pm0.v.u(feed.getItemId()));
            boolean z17 = true;
            if (f134265m) {
                jSONObject.put("feed_source", 1);
            } else {
                jSONObject.put("feed_source", 0);
            }
            if (str == null) {
                str = "";
            }
            jSONObject.put("songid", str);
            if (this.f134267g.length() <= 0) {
                z17 = false;
            }
            if (z17) {
                jSONObject.put("bell_info", this.f134267g);
            }
            if (f134265m) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("intab", this.f134268h);
                jSONObject.put("video_pos_info", jSONObject2.toString());
            }
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "set_song_tips", 1, jSONObject, false, null, 48, null);
    }

    public final void i7(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, java.lang.String str) {
        kotlin.jvm.internal.o.g(feed, "feed");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("feedid", pm0.v.u(feed.getItemId()));
            boolean z17 = true;
            if (f134265m) {
                jSONObject.put("feed_source", 1);
            } else {
                jSONObject.put("feed_source", 0);
            }
            if (str == null) {
                str = "";
            }
            jSONObject.put("songid", str);
            if (this.f134267g.length() <= 0) {
                z17 = false;
            }
            if (z17) {
                jSONObject.put("bell_info", this.f134267g);
            }
            if (f134265m) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("intab", this.f134268h);
                jSONObject.put("video_pos_info", jSONObject2.toString());
            }
        } catch (org.json.JSONException unused) {
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, V6, "set_song_tips", 0, jSONObject, false, null, 48, null);
        if (V6 != null) {
            com.tencent.mm.plugin.finder.report.l0.f125109a.b(V6, feed, 43);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        r45.yt2 yt2Var = (r45.yt2) g92.b.f269769e.k2().d().getCustom(18);
        int integer = yt2Var != null ? yt2Var.getInteger(2) : 14;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((dd0.q0) ((ed0.w0) i95.n0.c(ed0.w0.class))).getClass();
        vx3.i i17 = mx3.i0.i("");
        long j17 = i17 != null ? i17.f441302s : 0L;
        if (j17 == 0) {
            this.f134266f = true;
            return;
        }
        long j18 = currentTimeMillis - j17;
        if (integer == 0 || j18 >= integer * 86400000) {
            this.f134266f = true;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderFeedRingtoneUIC", "setRingtoneFrequencyLimit = " + integer + " diffMs = " + j18 + " isSetRingtoneMeetCondition = " + this.f134266f);
    }
}
