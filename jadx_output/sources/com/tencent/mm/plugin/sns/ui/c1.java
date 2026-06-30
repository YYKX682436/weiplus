package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class c1 extends com.tencent.mm.plugin.sns.ui.listener.i {
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.l1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.plugin.sns.ui.l1 l1Var, int i17, android.app.Activity activity, com.tencent.mm.plugin.sns.model.k4 k4Var) {
        super(i17, activity, k4Var);
        this.Y = l1Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.i
    public void A(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.Y;
        l1Var.f169709j.p();
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(baseViewHolder.f169268f);
        if (k17 != null && !k17.isInValid()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            boolean z17 = l1Var.f169705f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "onLikeClick snsInfo:%s falg:%d", ca4.z0.t0(k17.field_snsId), java.lang.Integer.valueOf(baseViewHolder.f169270g));
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.sns.ui.a1(this, k17, view, baseViewHolder), 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.i
    public void B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyData", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.Y.f169709j;
        if (bsVar != null) {
            bsVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNotifyChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
            bsVar.f168035a.w3("");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNotifyData", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.i
    public void C(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenIMTagClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.Y;
        l1Var.f169721v.a();
        l1Var.f169717r.d();
        l1Var.f169718s.f();
        com.tencent.mm.plugin.sns.ui.m7 m7Var = l1Var.f169720u;
        m7Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        m7Var.f169896h = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.OpenIMUnlikeHelper");
        if (l1Var.k() == 0) {
            l1Var.f169720u.b(view, false, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenIMTagClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.i
    public void D(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onOpenIMUnlikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        this.Y.f169720u.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onOpenIMUnlikeClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.i
    public void E(java.lang.Object obj) {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        android.view.View view = (android.view.View) obj;
        java.lang.Object tag = view.getTag();
        boolean z17 = tag instanceof com.tencent.mm.plugin.sns.ui.oj;
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.Y;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.oj ojVar = (com.tencent.mm.plugin.sns.ui.oj) tag;
            i64.b1 b1Var = l1Var.f169702c;
            if (b1Var != null) {
                j17 = b1Var.h(ojVar.f170102a, 6);
                com.tencent.mm.plugin.sns.ui.kj kjVar = l1Var.f169713n;
                com.tencent.mm.plugin.sns.model.l7 l7Var = l1Var.f169703d;
                kjVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                kjVar.e(view, 1, 0, l7Var, j17, false, 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            }
        }
        j17 = 0;
        com.tencent.mm.plugin.sns.ui.kj kjVar2 = l1Var.f169713n;
        com.tencent.mm.plugin.sns.model.l7 l7Var2 = l1Var.f169703d;
        kjVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        kjVar2.e(view, 1, 0, l7Var2, j17, false, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImg", "com.tencent.mm.plugin.sns.ui.SnsImageDialogShowerMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.i
    public void F(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUnLickClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        this.Y.f169718s.g();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUnLickClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.i
    public void G(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUnLikeFinish", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.Y;
        l1Var.f169718s.f();
        if (view.getTag() != null) {
            ca4.j jVar = (ca4.j) view.getTag();
            l1Var.f169702c.o(jVar.f39953b, jVar.f39954c, jVar.f39955d, 1);
            try {
                com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(jVar.f39954c);
                if (k17 != null && k17.isAd()) {
                    ca4.c0.b(2, jVar.f39955d, k17.getAdInfo(), k17.getAdXml());
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "reportAdFeedBackDel: info is null or not ad");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUnLikeFinish", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
                return;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "reportAdFeedBackDel: " + th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUnLikeFinish", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.i
    public void H(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUnLikeFinishError", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        this.Y.f169718s.f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUnLikeFinishError", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.i
    public void I(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUnLikeHelperClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.Y;
        com.tencent.mm.plugin.sns.ui.ay ayVar = l1Var.f169721v;
        if (ayVar != null) {
            ayVar.a();
        }
        com.tencent.mm.plugin.sns.ui.vx vxVar = l1Var.f169717r;
        if (vxVar != null) {
            vxVar.d();
        }
        com.tencent.mm.plugin.sns.ui.m7 m7Var = l1Var.f169720u;
        if (m7Var != null) {
            m7Var.c();
        }
        com.tencent.mm.plugin.sns.ui.j jVar = l1Var.f169718s;
        if (jVar != null) {
            jVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            jVar.f169468j = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsFullScreen", "com.tencent.mm.plugin.sns.ui.AdNotLikeHelper");
            l1Var.f169718s.b(view);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUnLikeHelperClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.listener.i
    public void z(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
        com.tencent.mm.plugin.sns.ui.l1 l1Var = this.Y;
        l1Var.f169709j.p();
        try {
            baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimelineClickListener", "In BaseTimeLine, do onCommentClick and exp is " + th6.toString());
        }
        if (l1Var.f169709j.g() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            return;
        }
        l1Var.f169709j.g().a1();
        new com.tencent.mm.plugin.sns.storage.SnsInfo();
        com.tencent.mm.plugin.sns.storage.SnsInfo c17 = l1Var.f169709j.c(baseViewHolder.f169262c);
        if (!c17.isValid()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
            return;
        }
        com.tencent.mm.plugin.sns.model.k7.f164367a.b(c17, 1);
        m21.w.d(741);
        com.tencent.mm.plugin.sns.model.s5.e(c17);
        ca4.z0.T(c17);
        c17.isAd();
        c17.getUxinfo();
        c17.getUserName();
        if (!c17.isAd() || (c17.getTimeLine().ContentObj.f369841i & 8) == 0) {
            l1Var.i(baseViewHolder, c17, new r45.e86());
        } else {
            l1Var.h(baseViewHolder, c17, new r45.e86());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCommentClick", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$1");
    }
}
