package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class f2 extends com.tencent.mm.plugin.sns.ui.improve.component.j implements com.tencent.mm.plugin.sns.ui.x4, com.tencent.mm.plugin.sns.ui.r4, com.tencent.mm.modelbase.u0, androidx.recyclerview.widget.RecyclerView.a {

    /* renamed from: d, reason: collision with root package name */
    public final i64.b1 f168794d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.bs f168795e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.l1 f168796f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f168797g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f168798h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f168799i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f168800m;

    /* renamed from: n, reason: collision with root package name */
    public int f168801n;

    /* renamed from: o, reason: collision with root package name */
    public int f168802o;

    /* renamed from: p, reason: collision with root package name */
    public wu5.c f168803p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.c2 f168804q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f168794d = new i64.b1(activity, 0);
        this.f168797g = new java.util.HashMap();
        this.f168798h = new java.util.HashMap();
        this.f168799i = new java.util.ArrayList();
        this.f168800m = new java.util.HashMap();
        this.f168804q = new com.tencent.mm.plugin.sns.ui.improve.component.c2(this);
    }

    @Override // com.tencent.mm.plugin.sns.ui.r4
    public boolean L5(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.vx vxVar;
        com.tencent.mm.plugin.sns.ui.j jVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.f168796f;
        if (l1Var != null && (jVar = l1Var.f169718s) != null) {
            jVar.f();
        }
        com.tencent.mm.plugin.sns.ui.l1 l1Var2 = this.f168796f;
        if (l1Var2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            com.tencent.mm.plugin.sns.ui.m7 m7Var = l1Var2.f169720u;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            if (m7Var != null) {
                m7Var.c();
            }
        }
        com.tencent.mm.plugin.sns.ui.l1 l1Var3 = this.f168796f;
        boolean a17 = (l1Var3 == null || (vxVar = l1Var3.f169717r) == null) ? false : vxVar.a(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCommentView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return a17;
    }

    /* JADX WARN: Finally extract failed */
    public final void O6() {
        com.tencent.mm.protocal.protobuf.TimeLineObject h17;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseADAbout", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        i64.b1 b1Var = this.f168794d;
        b1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "--clear--");
        java.util.Iterator it = new java.util.HashSet(((java.util.HashMap) b1Var.f289094i).keySet()).iterator();
        while (it.hasNext()) {
            i64.a1 a1Var = (i64.a1) ((java.util.HashMap) b1Var.f289094i).get((java.lang.String) it.next());
            b1Var.o(a1Var.f289068d, a1Var.f289067c, a1Var.f289070f, a1Var.f289071g);
        }
        com.tencent.mm.plugin.sns.model.l4.Uj().post(new i64.v0(b1Var, new java.util.HashMap(b1Var.f289096k)));
        ((java.util.HashMap) b1Var.f289094i).clear();
        ((java.util.HashMap) b1Var.f289096k).clear();
        i64.b1.f289085z.clear();
        l44.q3 q3Var = l44.q3.f316313a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearAllListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
        java.util.Map map = l44.q3.f316314b;
        synchronized (map) {
            try {
                int size = map.size();
                com.tencent.mars.xlog.Log.i("AdRemovedEventHelper", "clearAllListener, size=" + size);
                if (size > 0) {
                    com.tencent.mars.xlog.Log.e("AdRemovedEventHelper", "leak listener, size=" + size);
                }
                ((java.util.LinkedHashMap) map).clear();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearAllListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearAllListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doShareTimelineReportWhenOnDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        java.util.HashMap hashMap = this.f168800m;
        try {
            java.util.Iterator it6 = hashMap.entrySet().iterator();
            while (it6.hasNext()) {
                xc4.p pVar = (xc4.p) ((java.util.Map.Entry) it6.next()).getValue();
                if ((pVar == null || (h17 = pVar.h1()) == null || (a90Var = h17.ContentObj) == null || a90Var.f369837e != 3) ? false : true) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo c17 = pVar.c1();
                    com.tencent.mm.modelstat.k0.k(com.tencent.mm.modelstat.j0.Sns, pVar.h1().statExtStr, c17.getAdRecSrc(), ca4.z0.t0(pVar.y0()), c17);
                }
            }
            hashMap.clear();
        } catch (java.lang.Throwable th7) {
            ca4.q.c("MicroMsg.OldVersionUIC", th7);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doShareTimelineReportWhenOnDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        a44.k.f1285g.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.model.AdModelManager$Companion");
        i64.i.f289183d.g();
        i64.t.f289316d.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        i64.y.f289357d.g();
        i64.u.f289322d.g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.model.AdModelManager$Companion");
        s74.a4 a17 = s74.a4.f404208e.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearPreload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        com.tencent.mars.xlog.Log.i("DynamicView.Preloader", "clearPreload");
        synchronized (a17.f404210a) {
            try {
                kotlinx.coroutines.z0.c(a17.b(), null);
                a17.f404211b = null;
                a17.f404210a.d(-1);
            } catch (java.lang.Throwable th8) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearPreload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
                throw th8;
            }
        }
        a17.f404212c = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearPreload", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseADAbout", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    public final void P6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseBase", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.f168796f;
        if (l1Var != null) {
            l1Var.c();
        }
        this.f168796f = null;
        this.f168797g.clear();
        this.f168798h.clear();
        this.f168799i.clear();
        i64.u1.a(100, this.f168801n);
        i64.u1.a(202, this.f168802o);
        com.tencent.mars.xlog.Log.i("MicroMsg.OldVersionUIC", "maxItemIndex:" + this.f168802o + " current ItemIndex:" + this.f168801n);
        com.tencent.mm.plugin.sns.ui.widget.h3.a();
        com.tencent.mm.plugin.sns.ui.widget.h3 h3Var = com.tencent.mm.plugin.sns.ui.widget.h3.f171151e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        h3Var.f171156d = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        com.tencent.mm.plugin.sns.ui.widget.s2.a();
        com.tencent.mm.plugin.sns.ui.widget.s2 s2Var = com.tencent.mm.plugin.sns.ui.widget.s2.f171265d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        s2Var.f171268c = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        gm0.j1.n().f273288b.q(218, this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseBase", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    public final void Q6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseBaseAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        if (this.f168795e != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closePlayer", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            if (com.tencent.mm.plugin.sns.model.l4.Xj()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsTimeLineBaseAdapter", "is invalid to getSnsInfoStorage");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closePlayer", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            } else {
                com.tencent.mm.plugin.sns.model.l4.hj().getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idleStop", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idleStop", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closePlayer", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            }
        }
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f168795e;
        if (bsVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseClickable", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            com.tencent.mm.plugin.sns.ui.q1 q1Var = bsVar.f168055u;
            if (q1Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseCallBack", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
                q1Var.f170292a = null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseCallBack", "com.tencent.mm.plugin.sns.ui.ClickableCallBack");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseClickable", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        if (this.f168795e != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearDownloadCallBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearDownloadCallBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        com.tencent.mm.plugin.sns.ui.bs bsVar2 = this.f168795e;
        if (bsVar2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeLikedCallback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            bsVar2.f168053s.clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeLikedCallback", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        com.tencent.mm.plugin.sns.ui.bs bsVar3 = this.f168795e;
        if (bsVar3 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clean", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            java.util.LinkedList linkedList = bsVar3.f168037c;
            if (linkedList != null) {
                linkedList.clear();
            }
            java.util.HashMap hashMap = bsVar3.C;
            if (hashMap != null) {
                hashMap.clear();
            }
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Bi();
            mm0.c.f328575b.a();
            if (bsVar3.f168047m.value) {
                ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_like_collapse_enable, 0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clean", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        this.f168795e = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseBaseAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void R3(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChildViewAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChildViewAttachedToWindow", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.x4
    public com.tencent.mm.plugin.sns.ui.ns V1(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("genStruct", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.sns.storage.SnsInfo c17 = ((zc4.b) ((com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.class)).S6().f152065o.get(i17)).n().c1();
        com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(c17);
        kotlin.jvm.internal.o.f(e17, "getMergeSnsObject(...)");
        com.tencent.mm.plugin.sns.ui.ns D0 = ca4.z0.D0(c17, e17, getActivity(), this.f168795e, false, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi(), pc4.d.f353410a.o(), this.f168797g, this.f168798h, this.f168799i);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("genStruct", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return D0;
    }

    @Override // com.tencent.mm.plugin.sns.ui.r4
    public boolean a1() {
        com.tencent.mm.plugin.sns.ui.m7 m7Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.f168796f;
        if ((l1Var != null ? l1Var.f169717r : null) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.l1 l1Var2 = this.f168796f;
        if ((l1Var2 != null ? l1Var2.f169718s : null) != null) {
            kotlin.jvm.internal.o.d(l1Var2);
            l1Var2.f169718s.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeAdUnLikeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeOpenIMUnLikeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.l1 l1Var3 = this.f168796f;
        if (l1Var3 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            m7Var = l1Var3.f169720u;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        } else {
            m7Var = null;
        }
        if (m7Var != null) {
            com.tencent.mm.plugin.sns.ui.l1 l1Var4 = this.f168796f;
            kotlin.jvm.internal.o.d(l1Var4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            com.tencent.mm.plugin.sns.ui.m7 m7Var2 = l1Var4.f169720u;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenIMUnlikeHelper", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            m7Var2.c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeOpenIMUnLikeView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeCommentEmojiView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.l1 l1Var5 = this.f168796f;
        if ((l1Var5 != null ? l1Var5.f169721v : null) != null) {
            kotlin.jvm.internal.o.d(l1Var5);
            l1Var5.f169721v.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeCommentEmojiView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        int i17 = com.tencent.mm.plugin.sns.abtest.a.f162563a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearNotInterestMenu", "com.tencent.mm.plugin.sns.abtest.NotInteresetABTestManager");
        com.tencent.mm.plugin.sns.ui.l1 l1Var6 = this.f168796f;
        kotlin.jvm.internal.o.d(l1Var6);
        boolean d17 = l1Var6.f169717r.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeCommentView", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return d17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.x4
    public com.tencent.mm.vending.base.Vending g2() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVending", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVending", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return null;
    }

    @Override // com.tencent.mm.plugin.sns.ui.x4
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return Integer.MAX_VALUE;
    }

    @Override // com.tencent.mm.plugin.sns.ui.x4
    public com.tencent.mm.plugin.sns.storage.SnsInfo getItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.sns.storage.SnsInfo c17 = ((zc4.b) ((com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC.class)).S6().f152065o.get(i17)).n().c1();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        return c17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.x4
    public void notifyDataSetChanged() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter;
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter2;
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter3;
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter4;
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter5;
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter6;
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter7;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        super.onActivityResult(i17, i18, intent);
        if (i17 == 2333 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                kotlin.jvm.internal.o.d(stringExtra);
                java.lang.String[] strArr = (java.lang.String[]) new r26.t(",").g(stringExtra, 0).toArray(new java.lang.String[0]);
                if (!(strArr.length == 0)) {
                    com.tencent.mm.plugin.sns.ui.l1 l1Var = this.f168796f;
                    if (l1Var != null && (snsCommentFooter7 = l1Var.f169710k) != null) {
                        snsCommentFooter7.P();
                    }
                    tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                    java.lang.String str = strArr[0];
                    ((sg3.a) v0Var).getClass();
                    java.lang.String e17 = c01.a2.e(str);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                        com.tencent.mm.plugin.sns.ui.l1 l1Var2 = this.f168796f;
                        if (l1Var2 != null && (snsCommentFooter6 = l1Var2.f169710k) != null) {
                            snsCommentFooter6.s();
                        }
                        com.tencent.mm.plugin.sns.ui.l1 l1Var3 = this.f168796f;
                        if (l1Var3 != null && (snsCommentFooter5 = l1Var3.f169710k) != null) {
                            snsCommentFooter5.setText("@" + e17 + ' ');
                        }
                        com.tencent.mm.plugin.sns.ui.l1 l1Var4 = this.f168796f;
                        if (l1Var4 != null && (snsCommentFooter4 = l1Var4.f169710k) != null) {
                            snsCommentFooter4.setCommentAtPrefix("@" + e17 + ' ');
                        }
                        com.tencent.mm.plugin.sns.ui.l1 l1Var5 = this.f168796f;
                        if (l1Var5 != null && (snsCommentFooter3 = l1Var5.f169710k) != null) {
                            snsCommentFooter3.setCommentInfo(new r45.e86());
                        }
                        com.tencent.mm.plugin.sns.ui.l1 l1Var6 = this.f168796f;
                        r45.e86 commentInfo = (l1Var6 == null || (snsCommentFooter2 = l1Var6.f169710k) == null) ? null : snsCommentFooter2.getCommentInfo();
                        if (commentInfo != null) {
                            commentInfo.f373126d = strArr[0];
                        }
                        com.tencent.mm.plugin.sns.ui.l1 l1Var7 = this.f168796f;
                        if (l1Var7 != null && (snsCommentFooter = l1Var7.f169710k) != null) {
                            snsCommentFooter.setCommentFlag(8);
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBeforeFinish", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        super.onBeforeFinish(intent);
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.sns.ui.improve.component.d2 d2Var = new com.tencent.mm.plugin.sns.ui.improve.component.d2(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f168803p = t0Var.z(d2Var, 1500L, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBeforeFinish", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mm.plugin.sns.ui.widget.h3.a();
        com.tencent.mm.plugin.sns.ui.widget.h3 h3Var = com.tencent.mm.plugin.sns.ui.widget.h3.f171151e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        h3Var.f171153a = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        com.tencent.mm.plugin.sns.ui.widget.s2.a();
        com.tencent.mm.plugin.sns.ui.widget.s2 s2Var = com.tencent.mm.plugin.sns.ui.widget.s2.f171265d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        s2Var.f171267b = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.j jVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        s74.a4 a17 = s74.a4.f404208e.a();
        android.app.Activity activity = getContext();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mars.xlog.Log.i("DynamicView.Preloader", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        a17.f404212c = activity;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewPreloader");
        com.tencent.mm.plugin.sns.ui.widget.h3.a();
        com.tencent.mm.plugin.sns.ui.widget.h3 h3Var = com.tencent.mm.plugin.sns.ui.widget.h3.f171151e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        h3Var.f171153a = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        com.tencent.mm.plugin.sns.ui.widget.s2.a();
        com.tencent.mm.plugin.sns.ui.widget.s2 s2Var = com.tencent.mm.plugin.sns.ui.widget.s2.f171265d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        s2Var.f171267b = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        com.tencent.mm.plugin.sns.ui.widget.h3.a();
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        h3Var.f171156d = activity2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsPostDescPreloadTextViewConfig");
        com.tencent.mm.plugin.sns.ui.widget.s2.a();
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        s2Var.f171268c = activity3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActivity", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextViewConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleAdExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        getRecycleView().i(this.f168804q);
        getRecycleView().O(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleAdExposeReport", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        android.content.Intent intent = getActivity().getIntent();
        boolean booleanExtra = intent.getBooleanExtra("is_sns_notify_open", true);
        java.lang.String stringExtra = intent.getStringExtra("new_feed_id");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.plugin.sns.ui.l1 l1Var = new com.tencent.mm.plugin.sns.ui.l1(getActivity(), booleanExtra ? 1 : 0, stringExtra, intent.getIntExtra("sns_unread_count", 0), java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
        this.f168796f = l1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        i64.b1 b1Var = this.f168794d;
        l1Var.f169702c = b1Var;
        com.tencent.mm.plugin.sns.ui.listener.i iVar = l1Var.f169722w;
        if (iVar != null) {
            iVar.T(b1Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        com.tencent.mm.plugin.sns.ui.l1 l1Var2 = this.f168796f;
        if (l1Var2 != null) {
            android.view.View decorView = getActivity().getWindow().getDecorView();
            kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
            l1Var2.f169711l = (android.widget.FrameLayout) decorView;
        }
        com.tencent.mm.plugin.sns.ui.l1 l1Var3 = this.f168796f;
        if (l1Var3 != null) {
            l1Var3.f169713n = new com.tencent.mm.plugin.sns.ui.kj(getContext());
        }
        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
        kotlin.jvm.internal.o.e(activity4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity4;
        com.tencent.mm.plugin.sns.ui.l1 l1Var4 = this.f168796f;
        this.f168795e = new com.tencent.mm.plugin.sns.ui.bs(mMActivity, null, l1Var4 != null ? l1Var4.f169722w : null, l1Var4, 10, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.OldVersionUIC", "onCreate");
        com.tencent.mm.plugin.sns.ui.l1 l1Var5 = this.f168796f;
        if (l1Var5 != null) {
            androidx.appcompat.app.AppCompatActivity activity5 = getActivity();
            com.tencent.mm.plugin.sns.ui.bs bsVar = this.f168795e;
            com.tencent.mm.plugin.sns.ui.l1 l1Var6 = this.f168796f;
            l1Var5.f169717r = new com.tencent.mm.plugin.sns.ui.vx(activity5, bsVar, l1Var6 != null ? l1Var6.f169711l : null, null);
        }
        com.tencent.mm.plugin.sns.ui.l1 l1Var7 = this.f168796f;
        if (l1Var7 != null) {
            l1Var7.f169709j = this.f168795e;
        }
        if (l1Var7 != null) {
            l1Var7.f169710k = (com.tencent.mm.plugin.sns.ui.SnsCommentFooter) getActivity().findViewById(com.tencent.mm.R.id.c76);
        }
        com.tencent.mm.plugin.sns.ui.bs bsVar2 = this.f168795e;
        if (bsVar2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentEvent", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            bsVar2.f168059y = this;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentEvent", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        com.tencent.mm.plugin.sns.ui.l1 l1Var8 = this.f168796f;
        if (l1Var8 != null) {
            android.app.Activity context = getContext();
            com.tencent.mm.plugin.sns.ui.bs bsVar3 = this.f168795e;
            com.tencent.mm.plugin.sns.ui.listener.i iVar2 = bsVar3 != null ? bsVar3.f168039e : null;
            com.tencent.mm.plugin.sns.ui.l1 l1Var9 = this.f168796f;
            l1Var8.f169719t = new ra4.b(context, iVar2, l1Var9 != null ? l1Var9.f169711l : null, null);
        }
        com.tencent.mm.plugin.sns.ui.l1 l1Var10 = this.f168796f;
        if (l1Var10 != null) {
            android.app.Activity context2 = getContext();
            com.tencent.mm.plugin.sns.ui.bs bsVar4 = this.f168795e;
            com.tencent.mm.plugin.sns.ui.listener.i iVar3 = bsVar4 != null ? bsVar4.f168039e : null;
            com.tencent.mm.plugin.sns.ui.l1 l1Var11 = this.f168796f;
            l1Var10.f169718s = new com.tencent.mm.plugin.sns.ui.j(context2, iVar3, l1Var11 != null ? l1Var11.f169711l : null, null, l1Var11 != null ? l1Var11.f169719t : null);
        }
        com.tencent.mm.plugin.sns.ui.l1 l1Var12 = this.f168796f;
        if (l1Var12 != null && (jVar = l1Var12.f169718s) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            jVar.f169462d = b1Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
        }
        gm0.j1.n().f273288b.a(218, this);
        android.view.Display defaultDisplay = getActivity().getWindowManager().getDefaultDisplay();
        kotlin.jvm.internal.o.f(defaultDisplay, "getDefaultDisplay(...)");
        int height = defaultDisplay.getHeight();
        androidx.appcompat.app.AppCompatActivity activity6 = getActivity();
        kotlin.jvm.internal.o.e(activity6, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        androidx.appcompat.app.b supportActionBar = ((com.tencent.mm.ui.MMActivity) activity6).getSupportActionBar();
        kotlin.jvm.internal.o.d(supportActionBar);
        android.view.View j17 = supportActionBar.j();
        android.app.Activity context3 = getContext();
        b1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        b1Var.f289097l = height;
        b1Var.f289098m = j17;
        if (context3 != null) {
            b1Var.f289099n = context3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScreen", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView recycleView = getRecycleView();
        n3.m0.a(recycleView, new com.tencent.mm.plugin.sns.ui.improve.component.e2(recycleView, this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.OldVersionUIC", "onDestroy");
        wu5.c cVar = this.f168803p;
        if (cVar != null) {
            cVar.cancel(false);
        }
        Q6();
        P6();
        O6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        super.onPause();
        this.f168794d.p();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.OldVersionUIC", "onResume");
        this.f168794d.r();
        new com.tencent.mm.autogen.events.SnsOldItemContactEvent().e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if ((r6 != null && r6.L() == 4) != false) goto L31;
     */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r3, int r4, java.lang.String r5, com.tencent.mm.modelbase.m1 r6) {
        /*
            r2 = this;
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r3 = 1
            r4 = 0
            if (r6 == 0) goto L16
            int r5 = r6.getType()
            r0 = 218(0xda, float:3.05E-43)
            if (r5 != r0) goto L16
            r5 = r3
            goto L17
        L16:
            r5 = r4
        L17:
            if (r5 == 0) goto La7
            boolean r5 = r6 instanceof com.tencent.mm.plugin.sns.model.q2
            if (r5 == 0) goto L20
            com.tencent.mm.plugin.sns.model.q2 r6 = (com.tencent.mm.plugin.sns.model.q2) r6
            goto L21
        L20:
            r6 = 0
        L21:
            if (r6 == 0) goto L2b
            int r5 = r6.L()
            if (r5 != r3) goto L2b
            r5 = r3
            goto L2c
        L2b:
            r5 = r4
        L2c:
            if (r5 != 0) goto L49
            if (r6 == 0) goto L39
            int r5 = r6.L()
            r0 = 6
            if (r5 != r0) goto L39
            r5 = r3
            goto L3a
        L39:
            r5 = r4
        L3a:
            if (r5 != 0) goto L49
            if (r6 == 0) goto L46
            int r5 = r6.L()
            r0 = 4
            if (r5 != r0) goto L46
            goto L47
        L46:
            r3 = r4
        L47:
            if (r3 == 0) goto La7
        L49:
            com.tencent.mm.plugin.sns.ui.l1 r3 = r2.f168796f
            if (r3 == 0) goto L54
            com.tencent.mm.ui.widget.dialog.u3 r3 = r3.f169723x
            if (r3 == 0) goto L54
            r3.dismiss()
        L54:
            java.lang.Class<zc4.h> r3 = zc4.h.class
            byte[] r4 = jm0.k.f300270i
            monitor-enter(r4)
            gm0.m r5 = gm0.j1.b()     // Catch: java.lang.Throwable -> La4
            r5.c()     // Catch: java.lang.Throwable -> La4
            java.lang.Class<jm0.k> r5 = jm0.k.class
            boolean r5 = r5.isAssignableFrom(r3)     // Catch: java.lang.Throwable -> La4
            if (r5 == 0) goto L9c
            androidx.lifecycle.j1 r5 = new androidx.lifecycle.j1     // Catch: java.lang.Throwable -> La4
            gm0.m r0 = gm0.j1.b()     // Catch: java.lang.Throwable -> La4
            gm0.b r0 = r0.f273245h     // Catch: java.lang.Throwable -> La4
            jm0.h r1 = new jm0.h     // Catch: java.lang.Throwable -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> La4
            r5.<init>(r0, r1)     // Catch: java.lang.Throwable -> La4
            androidx.lifecycle.c1 r3 = r5.a(r3)     // Catch: java.lang.Throwable -> La4
            monitor-exit(r4)
            zc4.h r3 = (zc4.h) r3
            java.lang.Class<zc4.g> r4 = zc4.g.class
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage r3 = r3.P6(r4)
            zc4.g r3 = (zc4.g) r3
            long r4 = r6.M()
            java.lang.String r6 = "postADInfoUpdateEventBySnsID$default"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.improve.repository.SnsImproveStorage"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r0)
            o75.b r1 = o75.b.f343583d
            r3.e7(r4, r1)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r0)
            goto La7
        L9c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> La4
            java.lang.String r5 = "getLiveDB modelClass must extends BaseMvvmDB"
            r3.<init>(r5)     // Catch: java.lang.Throwable -> La4
            throw r3     // Catch: java.lang.Throwable -> La4
        La4:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        La7:
            java.lang.String r3 = "onSceneEnd"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.improve.component.f2.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.improve.component.j
    public void onScrollStateChangedInMain(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.ui.improve.component.x1 struct, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(struct, "struct");
        super.onScrollStateChangedInMain(recyclerView, struct, i17);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((r44.f) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(r44.f.class)).F3();
        java.util.ArrayList<com.tencent.mm.plugin.sns.ui.improve.component.o0> a17 = struct.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyItemScrollStateEvent", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        a17.size();
        if (i17 == 0) {
            for (com.tencent.mm.plugin.sns.ui.improve.component.o0 o0Var : a17) {
                o0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot");
                android.view.KeyEvent.Callback callback = o0Var.f168962c;
                if (callback instanceof com.tencent.mm.plugin.sns.ui.y4) {
                    ((com.tencent.mm.plugin.sns.ui.y4) callback).F3();
                } else if (callback instanceof com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView) {
                    com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView oldVersionItemView = (com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView) callback;
                    oldVersionItemView.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                    android.view.View view = oldVersionItemView.f168651n;
                    java.lang.Object tag = view != null ? view.getTag() : null;
                    com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = tag instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder ? (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) tag : null;
                    java.lang.Object obj = baseViewHolder != null ? baseViewHolder.f169283m0 : null;
                    if (obj instanceof com.tencent.mm.plugin.sns.ui.y4) {
                        ((com.tencent.mm.plugin.sns.ui.y4) obj).F3();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.improve.compatibility.OldVersionItemView");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyItemScrollStateEvent", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChangedInMain", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void p3(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChildViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChildViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }

    @Override // com.tencent.mm.plugin.sns.ui.x4
    public void w3(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
    }
}
