package yc4;

/* loaded from: classes4.dex */
public final class u extends yc4.f implements com.tencent.mm.modelbase.u0 {

    /* renamed from: m, reason: collision with root package name */
    public static int f460869m = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f460870f;

    /* renamed from: g, reason: collision with root package name */
    public int f460871g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460872h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460873i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.sns.ui.improve.component.w1 uic) {
        super(uic);
        kotlin.jvm.internal.o.g(uic, "uic");
        this.f460872h = "";
        this.f460873i = "";
    }

    @Override // yc4.f
    public void b(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        yc4.t tVar = new yc4.t(this, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launch$default", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        oz5.m mVar = oz5.m.f350329d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        kotlinx.coroutines.y0 y0Var = id4.a.f290927a;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, mVar, null, tVar, 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launch$default", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        gm0.j1.n().f273288b.a(211, this);
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).getClass();
        jx3.a a17 = zy1.e.f477325a.a(12076, true);
        if (a17 != null) {
            a17.j("BrowseTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ri(12076, "StartBrowseTime", java.lang.Long.valueOf(currentTimeMillis));
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ri(12076, "EnterObjectId", java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
    }

    @Override // yc4.f
    public void c() {
        long longValue;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        super.c();
        zy1.f fVar = (zy1.f) ((dy1.s) i95.n0.c(dy1.s.class));
        fVar.getClass();
        zy1.e eVar = zy1.e.f477325a;
        jx3.a a17 = eVar.a(12076, true);
        if (a17 != null) {
            java.lang.Object f17 = a17.f("BrowseTime");
            if (f17 instanceof java.lang.Integer) {
                longValue = ((java.lang.Number) f17).intValue();
            } else {
                kotlin.jvm.internal.o.e(f17, "null cannot be cast to non-null type kotlin.Long");
                longValue = ((java.lang.Long) f17).longValue();
            }
            a17.j("BrowseTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - longValue));
        }
        fVar.Ri(12076, "BrowseNewFeedCount", java.lang.Integer.valueOf(this.f460871g));
        fVar.Ri(12076, "StartBrowseSnsObjectId", this.f460873i);
        fVar.Ri(12076, "EndBrowseSnsObjectId", this.f460872h);
        fVar.Ui(12076, "ClickFeedIdList", "ClickFeedId");
        fVar.Ui(12076, "ExposeFeedIdList", "ExposeFeedCount");
        fVar.Ui(12076, "FavFeedIdList", "FavFeedCount");
        fVar.Ui(12076, "ClickAlbumUserList", "ClickAlbumCount");
        fVar.Ui(12076, "ForwardFeedIdList", "ForwardFeedIdCount");
        fVar.Ui(12076, "ClickAvatarFeedIdList", "ClickAvatarFeedIdCount");
        fVar.Ui(12076, "ClickNickNameFeedIdList", "NickNameFeedIdCount");
        fVar.Ui(12076, "ForwardToSingleChatFeedIdList", "ForwardToSingleChatFeedIdCount");
        fVar.Ui(12076, "ForwardToChatRoomFeedIdList", "ForwardToChatRoomFeedIdCount");
        fVar.Ri(12076, "contactCount", java.lang.Integer.valueOf(f460869m));
        int longValue2 = (int) ((java.lang.Number) fVar.wi(12076, "BrowseTime", 0L)).longValue();
        int longValue3 = (int) ((java.lang.Number) fVar.wi(12076, "BackGroundTime", 0L)).longValue();
        i64.u1.a(2000, longValue2);
        i64.u1.a(2001, longValue3);
        i64.u1.a(2002, longValue2 - longValue3);
        jx3.a a18 = eVar.a(12076, false);
        if (a18 == null) {
            zy1.e.f477328d.remove(12076);
            zy1.e.f477326b.remove(12076);
        } else {
            java.util.HashSet<zy1.h> hashSet = (java.util.HashSet) zy1.e.f477328d.get(12076);
            if (hashSet != null) {
                for (zy1.h hVar : hashSet) {
                    java.lang.String str = hVar.f477332a;
                    java.util.HashSet hashSet2 = hVar.f477333b;
                    a18.j(str, java.lang.Integer.valueOf(hashSet2.size()));
                    hashSet2.size();
                }
            }
            java.util.Iterator it = zy1.e.f477327c.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                java.lang.Object key = ((java.util.Map.Entry) next).getKey();
                kotlin.jvm.internal.o.f(key, "<get-key>(...)");
                if (r26.n0.B((java.lang.CharSequence) key, java.lang.String.valueOf(12076), false)) {
                    it.remove();
                }
            }
            a18.m();
            a18.k();
            zy1.e.f477328d.remove(12076);
            zy1.e.f477326b.remove(12076);
        }
        gm0.j1.n().f273288b.q(211, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
    }

    @Override // yc4.f
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        zy1.e.f477325a.c(12076, "BrowseTimeLineTime");
    }

    @Override // yc4.f
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseMyAlbumTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseOtherAlbumTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseMessageListTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "ClickNewPostTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseFullScreenImageTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseFullScreenSightTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseMPArticleTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseExternalArticleTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseAdFullScreenTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseAdCanvasPageTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseAdShortVideoTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseAdLongVideoTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "BrowseForwardAdLongVideoTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "FinderFeedTime");
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Ai(12076, "MusicPlayerFeedTime");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        zy1.e.f477325a.d(12076, "BrowseTimeLineTime");
    }

    @Override // yc4.f
    public void f(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1 struct, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(struct, "struct");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.BaseReport");
        java.util.Iterator it = struct.a().iterator();
        while (it.hasNext()) {
            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "BrowseFeedCount", ((com.tencent.mm.plugin.sns.ui.improve.component.o0) it.next()).a().n().a1());
        }
        if (struct.a().isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
            return;
        }
        java.lang.String a17 = ((com.tencent.mm.plugin.sns.ui.improve.component.o0) kz5.n0.i0(struct.a())).a().n().a1();
        java.lang.String a18 = ((com.tencent.mm.plugin.sns.ui.improve.component.o0) kz5.n0.X(struct.a())).a().n().a1();
        if ((this.f460872h.length() == 0) || a17.compareTo(this.f460872h) < 0) {
            this.f460872h = a17;
        }
        if ((this.f460873i.length() == 0) || a18.compareTo(this.f460873i) > 0) {
            this.f460873i = a18;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        boolean z17 = false;
        if (m1Var != null && m1Var.getType() == 211) {
            z17 = true;
        }
        if (z17) {
            kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            com.tencent.mm.plugin.sns.model.h3 h3Var = (com.tencent.mm.plugin.sns.model.h3) m1Var;
            if (h3Var.C()) {
                java.util.LinkedList linkedList = h3Var.I().f387170f;
                if (linkedList.isEmpty()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
                    return;
                }
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (((com.tencent.mm.protocal.protobuf.SnsObject) it.next()).Id > this.f460870f) {
                        this.f460871g++;
                    }
                }
                this.f460870f = ((com.tencent.mm.protocal.protobuf.SnsObject) linkedList.getFirst()).Id;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
    }
}
