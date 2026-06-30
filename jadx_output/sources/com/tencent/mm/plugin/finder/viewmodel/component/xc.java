package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class xc extends com.tencent.mm.plugin.finder.viewmodel.component.mb0 implements zy2.b7 {

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f136437t = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final so2.c f136438f;

    /* renamed from: g, reason: collision with root package name */
    public long f136439g;

    /* renamed from: h, reason: collision with root package name */
    public long f136440h;

    /* renamed from: i, reason: collision with root package name */
    public long f136441i;

    /* renamed from: m, reason: collision with root package name */
    public long f136442m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f136443n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f136444o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderCommentInfo f136445p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.l0 f136446q;

    /* renamed from: r, reason: collision with root package name */
    public int f136447r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f136448s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136438f = so2.c.f410279f;
        this.f136444o = new java.util.LinkedHashMap();
        this.f136448s = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue();
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void Q6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        g7(holder);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public android.view.View R6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!this.f136448s) {
            return holder.p(com.tencent.mm.R.id.ehc);
        }
        bw2.o oVar = bw2.o.f24869a;
        return ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24874f).getValue()).invoke(holder)).a();
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public so2.c S6() {
        return this.f136438f;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void W6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!this.f136448s) {
            super.W6(holder);
            return;
        }
        bw2.o oVar = bw2.o.f24869a;
        android.view.View b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24874f).getValue()).invoke(holder)).b();
        if (b17 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedHotCommentUIC", "hideWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedHotCommentUIC", "hideWithoutAnimate", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public boolean X6(in5.s0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        return this.f136448s ? d7(holder) : d7(holder) && R6(holder) != null;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void Z6(in5.s0 holder, boolean z17, long j17, long j18) {
        android.view.View b17;
        kotlin.jvm.internal.o.g(holder, "holder");
        if (z17) {
            if (this.f136440h == j17) {
                i7(j17, 1);
            }
            boolean booleanValue = ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.L0().r()).booleanValue();
            this.f136448s = booleanValue;
            if (booleanValue) {
                bw2.o oVar = bw2.o.f24869a;
                b17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f24874f).getValue()).invoke(holder)).b();
            } else {
                b17 = R6(holder);
            }
            if (b17 != null && b17.getVisibility() == 0) {
                g7(holder);
                return;
            }
            this.f136440h = 0L;
            this.f136441i = 0L;
            this.f136442m = 0L;
            this.f136439g = 0L;
            this.f136443n = false;
            this.f136447r = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0131, code lost:
    
        if (((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).sj(r6.getUsername()) != false) goto L49;
     */
    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c7(in5.s0 r18) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.xc.c7(in5.s0):void");
    }

    public final boolean d7(in5.s0 s0Var) {
        java.lang.Object obj = s0Var.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            return false;
        }
        return !com.tencent.mm.sdk.platformtools.t8.L0(((jz5.l) f7(baseFinderFeed.getItemId()).getValue()) != null ? (java.util.LinkedList) r5.f302833d : null);
    }

    public final void e7(long j17) {
        f136437t.remove(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.finder.feed.model.l0 l0Var = this.f136446q;
        if (l0Var != null) {
            com.tencent.mars.xlog.Log.i(l0Var.f108126h, "removeCache feedId=" + j17);
            l0Var.f108134s.remove(java.lang.Long.valueOf(j17));
            bu2.n.f24550a.d(j17);
        }
    }

    public final androidx.lifecycle.j0 f7(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f136437t;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new androidx.lifecycle.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (androidx.lifecycle.j0) obj;
    }

    public final void g7(in5.s0 s0Var) {
        java.util.LinkedList linkedList;
        java.lang.Object obj = s0Var.f293125i;
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            return;
        }
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(baseFinderFeed.getFeedObject().getMediaList());
        long j17 = (mb4Var != null ? mb4Var.getLong(24) : 0L) / 1000;
        this.f136440h = baseFinderFeed.getItemId();
        jz5.l lVar = (jz5.l) f7(baseFinderFeed.getItemId()).getValue();
        if (lVar != null && (linkedList = (java.util.LinkedList) lVar.f302833d) != null) {
            finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) kz5.n0.Z(linkedList);
        }
        this.f136445p = finderCommentInfo;
        this.f136441i = finderCommentInfo != null ? finderCommentInfo.getCommentId() : 0L;
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo2 = this.f136445p;
        this.f136447r = finderCommentInfo2 != null ? finderCommentInfo2.getContent_type() : 0;
        this.f136442m = j17;
        this.f136439g = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("Finder.FeedHotCommentUIC", "hotcomment is expose, showingFeedId = " + this.f136440h + " startExposeTime = " + this.f136439g + " showingCommentId = " + this.f136441i + " showingDuration = " + this.f136442m);
    }

    public final void h7() {
        this.f136439g = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("Finder.FeedHotCommentUIC", "hotcomment is expose, showingFeedId = " + this.f136440h + " startExposeTime = " + this.f136439g + " showingCommentId = " + this.f136441i + " showingDuration = " + this.f136442m);
    }

    public final void i7(long j17, int i17) {
        if (j17 == 0) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.Object obj = ((java.util.LinkedHashMap) this.f136444o).get(java.lang.Long.valueOf(j17));
        if (obj == null) {
            obj = 0L;
        }
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        long j18 = this.f136441i;
        ((m30.m) rVar).getClass();
        jSONObject2.put("cid", b52.b.q(j18));
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        jSONObject2.put("feedid", b52.b.q(j17));
        jSONObject2.put("current_play_sec", obj);
        jSONObject2.put("video_duration", this.f136442m);
        jSONObject2.put("expose_start_time", this.f136439g);
        jSONObject2.put("expose_end_time", java.lang.System.currentTimeMillis());
        jSONObject2.put("expose_end_type", i17);
        jSONObject2.put(ya.b.CONTENT_TYPE, this.f136447r);
        jSONObject.put("hot_comment", jSONObject2);
        k7(jSONObject2);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, nyVar != null ? nyVar.V6() : null, "hot_comment", 0, jSONObject, false, null, 48, null);
    }

    public final void k7(org.json.JSONObject jSONObject) {
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = this.f136445p;
        int expandCommentCount = finderCommentInfo != null ? finderCommentInfo.getExpandCommentCount() : 0;
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo2 = this.f136445p;
        int displayFlag = finderCommentInfo2 != null ? finderCommentInfo2.getDisplayFlag() : 0;
        int i17 = (displayFlag & 512) != 0 ? 1 : 0;
        jSONObject.put("if_finder_reply", i17);
        jSONObject.put("reply_cnt", expandCommentCount);
        com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo3 = this.f136445p;
        jSONObject.put("like_cnt", finderCommentInfo3 != null ? finderCommentInfo3.getLikeCount() : 0);
        if (i17 != 0) {
            jSONObject.put("overt_type", 1);
        } else if (expandCommentCount > 0) {
            jSONObject.put("overt_type", 2);
        } else {
            jSONObject.put("overt_type", 3);
        }
        if (hc2.c0.c(displayFlag)) {
            jSONObject.put("comment_prefix", 3);
            return;
        }
        if ((displayFlag & 1024) != 0) {
            jSONObject.put("comment_prefix", 1);
        } else {
            jSONObject.put("comment_prefix", 2);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        long j17 = this.f136440h;
        if (j17 != 0) {
            e7(j17);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        long j17 = this.f136440h;
        if (j17 != 0) {
            i7(j17, 1);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f136440h != 0) {
            h7();
        }
    }
}
