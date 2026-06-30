package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.ref.WeakReference f164830k = new java.lang.ref.WeakReference(null);

    /* renamed from: a, reason: collision with root package name */
    public int f164831a;

    /* renamed from: c, reason: collision with root package name */
    public int f164833c;

    /* renamed from: d, reason: collision with root package name */
    public int f164834d;

    /* renamed from: e, reason: collision with root package name */
    public long f164835e;

    /* renamed from: f, reason: collision with root package name */
    public long f164836f;

    /* renamed from: h, reason: collision with root package name */
    public int f164838h;

    /* renamed from: i, reason: collision with root package name */
    public int f164839i;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f164832b = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f164837g = "";

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashSet f164840j = new java.util.HashSet();

    public final void a(java.lang.String userName) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initWithUserName", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f164837g = userName;
        if (kotlin.jvm.internal.o.b(userName, c01.z1.r())) {
            this.f164839i = 1;
        } else {
            this.f164839i = 2;
        }
        this.f164835e = java.lang.System.currentTimeMillis();
        r45.cb6 b17 = p94.w0.c() != null ? ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(userName) : null;
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("SnSProfileReporter", "userinfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWithUserName", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            return;
        }
        boolean z17 = (b17.f371431g & 4096) > 0;
        int i17 = b17.f371432h;
        if (i17 == 4320 && z17) {
            this.f164838h = 1;
        } else if (i17 == 72 && z17) {
            this.f164838h = 3;
        } else if (i17 == 720 && z17) {
            this.f164838h = 2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initWithUserName", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
    }

    public final void b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFeedClick", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFeedClick", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            return;
        }
        try {
            java.lang.String s07 = ca4.z0.s0(snsInfo.field_snsId);
            int i17 = snsInfo.field_type;
            cl0.g gVar = new cl0.g();
            gVar.h("feedid", s07);
            gVar.o("sendtype", i17);
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            java.util.HashSet hashSet = this.f164840j;
            hashSet.add(gVar2);
            if (this.f164834d != hashSet.size()) {
                this.f164834d = hashSet.size();
            }
            com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(snsInfo.field_attrBuf);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
            java.util.HashMap i18 = kz5.c1.i(new jz5.l("sns_channel", java.lang.Integer.valueOf(this.f164831a)), new jz5.l("sns_visual_angle", java.lang.Integer.valueOf(this.f164839i)), new jz5.l("associate_username", this.f164837g), new jz5.l("snsalbumsid", this.f164832b), new jz5.l("send_type_sns", java.lang.Integer.valueOf(i17)), new jz5.l("sns_feed_id", s07), new jz5.l("curr_time_range", java.lang.Integer.valueOf(this.f164838h)), new jz5.l("sns_page_scene", java.lang.Integer.valueOf(this.f164833c)), new jz5.l("is_pin_feed", java.lang.Integer.valueOf(((com.tencent.mm.protocal.protobuf.SnsObject) parseFrom).InTopList)));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
            com.tencent.mm.plugin.sns.statistics.w wVar = new com.tencent.mm.plugin.sns.statistics.w("SnSProfileReporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
            wVar.a("view_clk", "sns_feed", i18);
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("SnSProfileReporter", e17, "onFeedClick error: " + snsInfo.field_snsId, new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFeedClick", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
    }

    public final void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        java.lang.String s07;
        int i17;
        java.lang.String gVar;
        java.util.HashSet hashSet;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFeedExposure", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFeedExposure", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            return;
        }
        try {
            s07 = ca4.z0.s0(snsInfo.field_snsId);
            i17 = snsInfo.field_type;
            cl0.g gVar2 = new cl0.g();
            gVar2.h("feedid", s07);
            gVar2.o("sendtype", i17);
            gVar = gVar2.toString();
            kotlin.jvm.internal.o.f(gVar, "toString(...)");
            hashSet = this.f164840j;
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("SnSProfileReporter", e17, "onFeedExposure error: " + snsInfo.field_snsId, new java.lang.Object[0]);
        }
        if (hashSet.contains(gVar)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFeedExposure", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
            return;
        }
        hashSet.add(gVar);
        if (this.f164834d != hashSet.size()) {
            this.f164834d = hashSet.size();
        }
        com.tencent.mm.protobuf.f parseFrom = new com.tencent.mm.protocal.protobuf.SnsObject().parseFrom(snsInfo.field_attrBuf);
        kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsObject");
        java.util.HashMap i18 = kz5.c1.i(new jz5.l("sns_channel", java.lang.Integer.valueOf(this.f164831a)), new jz5.l("sns_visual_angle", java.lang.Integer.valueOf(this.f164839i)), new jz5.l("associate_username", this.f164837g), new jz5.l("snsalbumsid", this.f164832b), new jz5.l("send_type_sns", java.lang.Integer.valueOf(i17)), new jz5.l("sns_feed_id", s07), new jz5.l("curr_time_range", java.lang.Integer.valueOf(this.f164838h)), new jz5.l("sns_page_scene", java.lang.Integer.valueOf(this.f164833c)), new jz5.l("is_pin_feed", java.lang.Integer.valueOf(((com.tencent.mm.protocal.protobuf.SnsObject) parseFrom).InTopList)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.statistics.w wVar = new com.tencent.mm.plugin.sns.statistics.w("SnSProfileReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        wVar.a("view_exp", "sns_feed", i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFeedExposure", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pageIn", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        f164830k = new java.lang.ref.WeakReference(this);
        this.f164836f = java.lang.System.currentTimeMillis();
        f("page_in", kz5.c1.i(new jz5.l("sns_channel", java.lang.Integer.valueOf(this.f164831a)), new jz5.l("sns_visual_angle", java.lang.Integer.valueOf(this.f164839i)), new jz5.l("associate_username", this.f164837g), new jz5.l("snsalbumsid", this.f164832b), new jz5.l("curr_time_range", java.lang.Integer.valueOf(this.f164838h)), new jz5.l("sns_page_scene", java.lang.Integer.valueOf(this.f164833c))));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageIn", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pageOut", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f164836f;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - this.f164835e;
        jz5.l lVar = new jz5.l("sns_channel", java.lang.Integer.valueOf(this.f164831a));
        jz5.l lVar2 = new jz5.l("sns_visual_angle", java.lang.Integer.valueOf(this.f164839i));
        jz5.l lVar3 = new jz5.l("associate_username", this.f164837g);
        jz5.l lVar4 = new jz5.l("feeddepth", java.lang.Integer.valueOf(this.f164834d));
        jz5.l lVar5 = new jz5.l("snsalbumsid", this.f164832b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildSnsFeedList", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{");
        java.util.HashSet hashSet = this.f164840j;
        sb6.append(kz5.n0.g0(hashSet, "#", null, null, 0, null, null, 62, null));
        sb6.append('}');
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildSnsFeedList", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        f("page_out", kz5.c1.i(lVar, lVar2, lVar3, lVar4, lVar5, new jz5.l("sns_feed_list", sb7), new jz5.l("stay_time", java.lang.Long.valueOf(currentTimeMillis)), new jz5.l("snsalbum_ms", java.lang.Long.valueOf(currentTimeMillis2)), new jz5.l("curr_time_range", java.lang.Integer.valueOf(this.f164838h)), new jz5.l("sns_page_scene", java.lang.Integer.valueOf(this.f164833c))));
        hashSet.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pageOut", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
    }

    public final void f(java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportPageEvent", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewReporter", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$Companion");
        int i17 = this.f164833c;
        int i18 = i17 != 2 ? i17 != 9 ? 0 : 50331 : 50330;
        java.util.Objects.toString(ri.l0.a(map));
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.statistics.a0(i18, str, map));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportPageEvent", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
    }
}
