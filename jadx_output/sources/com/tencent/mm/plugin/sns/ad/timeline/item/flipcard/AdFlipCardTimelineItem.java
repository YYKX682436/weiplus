package com.tencent.mm.plugin.sns.ad.timeline.item.flipcard;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardTimelineItem;", "Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem;", "Lxd4/d;", "Li64/k0;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "onUIDestroy", "<init>", "()V", "t74/e2", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class AdFlipCardTimelineItem extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem implements xd4.d, i64.k0, androidx.lifecycle.x {

    /* renamed from: q, reason: collision with root package name */
    public t74.e2 f163216q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f163217r;

    /* renamed from: s, reason: collision with root package name */
    public final t74.d2 f163218s = new t74.d2();

    /* renamed from: t, reason: collision with root package name */
    public w64.n f163219t;

    /* renamed from: u, reason: collision with root package name */
    public int f163220u;

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        com.tencent.mars.xlog.Log.i("AdFlipCardTimelineItem", "play, pos is " + i17 + ", hashCode is " + hashCode());
        xd4.o0.d().j();
        xd4.g.a().d(this);
        this.f163218s.f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        java.lang.String T = ca4.z0.T(this.f163217r);
        com.tencent.mars.xlog.Log.i("AdFlipCardTimelineItem", "onAdRemoved, curSnsId is " + T + ", paramSnsId is " + str);
        if ((T == null || T.length() == 0) || !T.equals(str)) {
            ca4.q.c("flipCardAd onAdRemoved adChanged", new java.lang.RuntimeException("adChanged"));
            com.tencent.mars.xlog.Log.e("AdFlipCardTimelineItem", "onAdRemoved, ad changed with no remove");
        } else {
            this.f163218s.c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        com.tencent.mars.xlog.Log.i("AdFlipCardTimelineItem", "onUIPause, hash is " + hashCode());
        this.f163218s.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        android.view.ViewGroup b17;
        android.view.ViewGroup b18;
        android.view.ViewGroup b19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        int[] iArr = new int[2];
        t74.e2 e2Var = this.f163216q;
        if (e2Var != null && (b19 = e2Var.b()) != null) {
            b19.getLocationOnScreen(iArr);
        }
        int i17 = 0;
        int i18 = iArr[0];
        int i19 = iArr[1];
        t74.e2 e2Var2 = this.f163216q;
        int width = (e2Var2 == null || (b18 = e2Var2.b()) == null) ? 0 : b18.getWidth();
        t74.e2 e2Var3 = this.f163216q;
        if (e2Var3 != null && (b17 = e2Var3.b()) != null) {
            i17 = b17.getHeight();
        }
        android.graphics.Rect rect = new android.graphics.Rect(i18, i19, width + i18, i17 + i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        return rect;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        com.tencent.mm.plugin.sns.ui.l1 l1Var2;
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        if (!(baseViewHolder instanceof t74.e2)) {
            com.tencent.mars.xlog.Log.e("AdFlipCardTimelineItem", "buildContent, holder error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
            return;
        }
        if (this.f169249f == null) {
            com.tencent.mars.xlog.Log.e("AdFlipCardTimelineItem", "mActivity is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
            return;
        }
        this.f163216q = (t74.e2) baseViewHolder;
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) != null) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.epf);
            t74.e2 e2Var = (t74.e2) baseViewHolder;
            if (!e2Var.f169290q) {
                android.view.View inflate = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFlipCardContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
                e2Var.D0 = (android.view.ViewGroup) inflate;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFlipCardContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
                e2Var.f169290q = true;
            }
        } else {
            t74.e2 e2Var2 = (t74.e2) baseViewHolder;
            if (!e2Var2.f169290q) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) e2Var2.f169272h.findViewById(com.tencent.mm.R.id.f485014tx1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFlipCardContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
                e2Var2.D0 = viewGroup2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFlipCardContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
                e2Var2.f169290q = true;
            }
        }
        t74.e2 e2Var3 = (t74.e2) baseViewHolder;
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) e2Var3.f169272h.findViewById(com.tencent.mm.R.id.f485015tx2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFlipCardTouchContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
        e2Var3.E0 = viewGroup3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFlipCardTouchContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f169249f;
        androidx.lifecycle.y yVar = componentCallbacks2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) componentCallbacks2 : null;
        if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
            mo133getLifecycle.a(this);
        }
        this.f163220u = ca4.m0.y("AdFlipCardTimelineItem", this.f169249f, 0, this.f169247d);
        com.tencent.mars.xlog.Log.i("AdFlipCardTimelineItem", "buildContent, inLargeWindow is " + this.f169247d + ", width is " + this.f163220u + ", hash is " + hashCode());
        android.app.Activity activity = this.f169249f;
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f169251h;
        this.f163219t = new w64.n(activity, 0, (bsVar == null || (l1Var2 = bsVar.f168036b) == null) ? null : l1Var2.f169702c, null, null);
        t74.e2 e2Var4 = this.f163216q;
        android.view.ViewGroup b17 = e2Var4 != null ? e2Var4.b() : null;
        t74.e2 e2Var5 = this.f163216q;
        if (e2Var5 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFlipCardTouchContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
            android.view.ViewGroup viewGroup4 = e2Var5.E0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFlipCardTouchContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem$AdFlipCardViewHolder");
            viewGroup = viewGroup4;
        } else {
            viewGroup = null;
        }
        t74.e2 e2Var6 = this.f163216q;
        android.view.View view = e2Var6 != null ? e2Var6.f169301v0 : null;
        int i17 = this.f163220u;
        boolean z17 = this.f169247d;
        com.tencent.mm.plugin.sns.ui.bs bsVar2 = this.f169251h;
        t74.b2 b2Var = new t74.b2(b17, viewGroup, view, i17, z17, (bsVar2 == null || (l1Var = bsVar2.f168036b) == null) ? null : l1Var.f169702c, this.f163219t, bsVar2 != null ? bsVar2.f168039e : null, this.f169249f, 0);
        t74.d2 d2Var = this.f163218s;
        d2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        d2Var.f416124a = b2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        d2Var.b(this.f163220u);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void onUIDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        com.tencent.mars.xlog.Log.i("AdFlipCardTimelineItem", "onUIDestroy, hash is " + hashCode());
        this.f163218s.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17, com.tencent.mm.plugin.sns.ui.ns nsVar, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i18, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        android.app.Activity activity;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        if (!(baseViewHolder instanceof t74.e2)) {
            com.tencent.mars.xlog.Log.e("AdFlipCardTimelineItem", "fillItem, holder error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
            return;
        }
        if (nsVar == null || (activity = this.f169249f) == null || !(activity instanceof androidx.lifecycle.y) || bsVar == null) {
            com.tencent.mars.xlog.Log.e("AdFlipCardTimelineItem", "fillItem params error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = nsVar.f170025a;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
            return;
        }
        this.f163217r = snsInfo;
        com.tencent.mars.xlog.Log.i("AdFlipCardTimelineItem", "ad fillItem, flipcardAd, pos is " + i17 + ", snsId is " + ca4.z0.y0(this.f163217r) + ", hash is " + hashCode());
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f163217r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        i64.b1 b1Var = null;
        com.tencent.mm.plugin.sns.ui.l1 l1Var = bsVar.f168036b;
        if ((l1Var != null ? l1Var.f169702c : null) == null) {
            com.tencent.mars.xlog.Log.w("AdFlipCardTimelineItem", "addOnRemovedListener, adapter SnsAdStatistic null");
        } else if (l1Var != null) {
            b1Var = l1Var.f169702c;
        }
        if (b1Var == null) {
            com.tencent.mars.xlog.Log.w("AdFlipCardTimelineItem", "addOnRemovedListener failed, snsId=" + ca4.z0.y0(this.f163217r));
            ca4.q.c("flipCardAd snsAdStatistic==null", new java.lang.RuntimeException("snsAdStatistic==null"));
        }
        java.lang.String T = ca4.z0.T(snsInfo2);
        if (!android.text.TextUtils.isEmpty(T) && !kotlin.jvm.internal.o.b("0", T) && b1Var != null) {
            b1Var.a(T, this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        this.f163218s.a(this.f169249f, this.f163217r);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        com.tencent.mars.xlog.Log.i("AdFlipCardTimelineItem", "pause, hash is " + hashCode());
        t74.d2 d2Var = this.f163218s;
        d2Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        t74.w1 w1Var = d2Var.f416125b;
        if (w1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
            java.lang.String j17 = w1Var.j();
            try {
                com.tencent.mars.xlog.Log.i(w1Var.j(), "pausePlayByTimeline");
                w1Var.f416297z0 = false;
                w1Var.K0();
            } catch (java.lang.Throwable th6) {
                ca4.q.c(j17, th6);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        com.tencent.mars.xlog.Log.i("AdFlipCardTimelineItem", "stop, hash is " + hashCode());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardTimelineItem");
        return "AdFlipCardTimelineItem";
    }
}
