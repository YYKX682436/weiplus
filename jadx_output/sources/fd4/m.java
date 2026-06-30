package fd4;

/* loaded from: classes4.dex */
public final class m extends fd4.c {

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.v f261317q;

    @Override // fd4.c, fd4.l
    public void a(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.storage.n nVar, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.a(i17, snsInfo, nVar, layoutParams);
        r45.jj4 jj4Var = null;
        java.lang.Integer valueOf = layoutParams != null ? java.lang.Integer.valueOf(layoutParams.width) : null;
        java.lang.Integer valueOf2 = layoutParams != null ? java.lang.Integer.valueOf(layoutParams.height) : null;
        if (valueOf == null || valueOf2 == null || valueOf.intValue() <= 0 || valueOf2.intValue() <= 0) {
            com.tencent.mars.xlog.Log.e("LiveStreamAdTimelineItem", "width is " + valueOf + ", height is " + valueOf2);
        } else {
            a84.y0.o(this.f261289f.Q, valueOf.intValue(), valueOf2.intValue());
        }
        if (((snsInfo == null || (timeLine = snsInfo.getTimeLine()) == null || (a90Var = timeLine.ContentObj) == null) ? null : a90Var.f369840h) != null) {
            java.util.LinkedList linkedList = snsInfo.getTimeLine().ContentObj.f369840h;
            kotlin.jvm.internal.o.d(linkedList);
            if (linkedList.size() >= 1) {
                java.util.LinkedList linkedList2 = snsInfo.getTimeLine().ContentObj.f369840h;
                kotlin.jvm.internal.o.d(linkedList2);
                jj4Var = (r45.jj4) linkedList2.get(0);
            }
        }
        r45.jj4 jj4Var2 = jj4Var;
        this.f261290g.d(snsInfo);
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar = this.f261317q;
        if (vVar != null) {
            vVar.d(snsInfo, this.f261289f.T.f425131a, jj4Var2, valueOf, valueOf2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.c();
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f261292i;
        if (snsInfo != null && !snsInfo.isAdForbidAutoPlay()) {
            int i17 = this.f261289f.T.f425131a;
            if (i17 == 1 || i17 == 2) {
                l44.b3 b3Var = l44.b3.f316041a;
                b3Var.h(this.f261292i);
                b3Var.i(new l44.d0(this.f261289f.T.f425131a, this.f261292i, true));
            }
            com.tencent.mm.plugin.sns.ad.widget.living.v vVar = this.f261317q;
            if (vVar != null) {
                vVar.i();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoStart", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.d();
        com.tencent.mars.xlog.Log.i("LiveStreamAdTimelineItem", "onUIDestroy: snsId is " + ca4.z0.T(this.f261292i));
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar = this.f261317q;
        if (vVar != null) {
            vVar.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    @Override // fd4.l
    public void g(long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlaying", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void i(android.app.Activity activity, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar, u74.d dVar, u74.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.i(activity, b1Var, iVar, dVar, fVar);
        if (this.f261287d == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
            return;
        }
        if (dVar.Q == null) {
            android.view.View inflate = ((android.view.ViewStub) dVar.f425163x.findViewById(com.tencent.mm.R.id.n4i)).inflate();
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer");
            dVar.Q = (com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer) inflate;
        } else {
            com.tencent.mars.xlog.Log.e("LiveStreamAdTimelineItem", "buildContent many times");
        }
        this.f261317q = new com.tencent.mm.plugin.sns.ad.widget.living.v(this.f261289f.Q);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.j();
        com.tencent.mars.xlog.Log.i("LiveStreamAdTimelineItem", "onAdRemoved: snsId is " + ca4.z0.T(this.f261292i));
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar = this.f261317q;
        if (vVar != null) {
            vVar.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }

    @Override // fd4.c, fd4.l
    public void onVideoPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
        super.onVideoPause();
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar = this.f261317q;
        if (vVar != null) {
            vVar.g();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.LiveStreamAdBusiness");
    }
}
