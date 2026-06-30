package tc4;

/* loaded from: classes4.dex */
public final class k extends in5.v {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f417387a = new android.graphics.Rect();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f417388b = new android.graphics.Rect();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tc4.a0 f417389c;

    public k(tc4.a0 a0Var) {
        this.f417389c = a0Var;
    }

    @Override // in5.v
    public boolean a(android.view.View target) {
        android.view.View findViewById;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdditionalCondition", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2");
        kotlin.jvm.internal.o.g(target, "target");
        android.content.Context context = this.f417389c.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && (findViewById = activity.findViewById(com.tencent.mm.R.id.f482523gp)) != null) {
            android.graphics.Rect rect = this.f417387a;
            boolean globalVisibleRect = findViewById.getGlobalVisibleRect(rect);
            android.graphics.Rect rect2 = this.f417388b;
            boolean globalVisibleRect2 = target.getGlobalVisibleRect(rect2);
            if (globalVisibleRect && globalVisibleRect2 && rect.bottom > rect2.top) {
                float width = (target.getMeasuredWidth() <= 0 || target.getMeasuredHeight() <= 0) ? 0.0f : (rect2.width() * (rect2.height() - (rect.bottom - rect2.top))) / (target.getMeasuredWidth() * target.getMeasuredHeight());
                b(target);
                boolean z17 = 0.5f <= width;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdditionalCondition", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2");
                return z17;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdditionalCondition", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2");
        return true;
    }

    @Override // in5.v
    public float b(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposePercent", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2");
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposePercent", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2");
        return 0.5f;
    }

    @Override // in5.v
    public void d(android.view.View view, long j17, long j18, boolean z17, long j19) {
        java.lang.String str;
        java.lang.String str2;
        xc4.p n17;
        com.tencent.mm.protocal.protobuf.TimeLineObject h17;
        r45.a90 a90Var;
        r45.g92 g92Var;
        java.lang.String str3;
        xc4.p n18;
        com.tencent.mm.protocal.protobuf.TimeLineObject h18;
        r45.a90 a90Var2;
        r45.g92 g92Var2;
        long j27;
        xc4.p n19;
        com.tencent.mm.protocal.protobuf.TimeLineObject h19;
        java.lang.String jSONObject;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2");
        kotlin.jvm.internal.o.g(view, "view");
        tc4.a0 a0Var = this.f417389c;
        zc4.b data = a0Var.getData();
        if (data == null || (n17 = data.n()) == null || (h17 = n17.h1()) == null || (a90Var = h17.ContentObj) == null || (g92Var = a90Var.f369848s) == null) {
            str = "onViewExposed";
            str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2";
        } else {
            if (z17) {
                long c17 = c01.id.c();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setStartExposeTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                a0Var.I1 = c17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setStartExposeTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                str = "onViewExposed";
                str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2";
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getStartExposeTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                long j28 = a0Var.I1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getStartExposeTimestamp$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$reportExtReport", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportExtReport", "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem");
                zc4.b data2 = a0Var.getData();
                if (data2 == null || (n18 = data2.n()) == null || (h18 = n18.h1()) == null || (a90Var2 = h18.ContentObj) == null || (g92Var2 = a90Var2.f369848s) == null) {
                    str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2";
                    str3 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem";
                    str = "onViewExposed";
                } else {
                    str3 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem";
                    r45.l71 Hj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Hj(pm0.v.Z(g92Var2.getString(0)));
                    if (Hj != null && Hj.getBoolean(26)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.FinderLiveTimelineItem", "reportExtReport: server close expose ext report, feedId=" + g92Var2.getString(2) + ", liveId=" + g92Var2.getString(0));
                        str = "onViewExposed";
                        str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2";
                    } else {
                        if (a0Var.J1 > 0) {
                            str = "onViewExposed";
                            str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2";
                            j27 = (a0Var.K1 + android.os.SystemClock.elapsedRealtime()) - a0Var.J1;
                        } else {
                            str = "onViewExposed";
                            str2 = "com.tencent.mm.plugin.sns.ui.improve.item.FinderLiveImproveTimelineItem$doSthSetting$1$1$2";
                            j27 = a0Var.K1;
                        }
                        r45.jn0 jn0Var = new r45.jn0();
                        jn0Var.set(0, java.lang.Long.valueOf(pm0.v.Z(g92Var2.getString(2))));
                        jn0Var.set(1, g92Var2.getString(1));
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        jSONObject2.put("feedActionType", 117);
                        jSONObject2.put("value", j28);
                        jSONObject2.put("duration", j19);
                        jSONObject2.put("AutoPlayDuration", j27);
                        jSONObject2.put("EntranceScene", 4);
                        zc4.b data3 = a0Var.getData();
                        java.lang.String str4 = (data3 == null || (n19 = data3.n()) == null || (h19 = n19.h1()) == null) ? null : h19.UserName;
                        if (str4 == null) {
                            str4 = "";
                        }
                        jSONObject2.put("share_username", str4);
                        jn0Var.set(3, jSONObject2.toString());
                        ((j40.m) ((m40.h0) i95.n0.c(m40.h0.class))).wi(null, 18054, jn0Var);
                    }
                }
                a0Var.K1 = 0L;
                a0Var.J1 = 0L;
                java.lang.String str5 = str3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportExtReport", str5);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$reportExtReport", str5);
            }
            i95.m c18 = i95.n0.c(zy2.pa.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.pa paVar = (zy2.pa) c18;
            long Z = pm0.v.Z(g92Var.getString(2));
            long Z2 = pm0.v.Z(g92Var.getString(0));
            java.lang.String string = g92Var.getString(1);
            java.lang.String string2 = g92Var.getString(3);
            java.lang.String str6 = string2 == null ? "" : string2;
            long j29 = z17 ? 16L : 17L;
            p52.e[] eVarArr = p52.e.f352008d;
            if (z17) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("share_scene", g92Var.getInteger(44));
                jSONObject = jSONObject3.toString();
            } else {
                org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                jSONObject4.put("exp_time", (int) j19);
                jSONObject4.put("share_scene", g92Var.getInteger(44));
                jSONObject = jSONObject4.toString();
            }
            java.lang.String str7 = jSONObject;
            kotlin.jvm.internal.o.d(str7);
            zy2.pa.Gc(paVar, Z, Z2, string, str6, j29, "temp_6", 3, str7, null, 256, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
