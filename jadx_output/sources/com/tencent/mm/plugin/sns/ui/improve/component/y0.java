package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class y0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f169058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f169059f;

    public y0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC, int i17) {
        this.f169058e = improveMainUIC;
        this.f169059f = i17;
    }

    @Override // in5.r
    public android.view.View c(androidx.recyclerview.widget.RecyclerView recyclerView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        android.view.View a17 = com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.f168694t.a(this.f169058e.getContext(), this.f169059f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        return a17;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        zc4.b item = (zc4.b) cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (holder.itemView instanceof tc4.s0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC = this.f169058e;
            boolean b76 = improveMainUIC.b7();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$pageInvalid", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            if (!b76) {
                android.view.View itemView = holder.itemView;
                kotlin.jvm.internal.o.f(itemView, "itemView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindViewParams", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                xc4.p n17 = item.n();
                try {
                    dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
                    jz5.l[] lVarArr = new jz5.l[20];
                    lVarArr[0] = new jz5.l("sns_feed_id", n17.a1());
                    java.lang.String userName = n17.getUserName();
                    if (userName == null) {
                        userName = "";
                    }
                    lVarArr[1] = new jz5.l("sns_feed_username", userName);
                    com.tencent.mm.protocal.protobuf.TimeLineObject h17 = n17.h1();
                    java.lang.String str = h17 != null ? h17.UserName : null;
                    if (str == null) {
                        str = "";
                    }
                    lVarArr[2] = new jz5.l("sns_feed_share_name", str);
                    java.lang.String Q0 = n17.Q0();
                    if (Q0 == null) {
                        Q0 = "";
                    }
                    lVarArr[3] = new jz5.l("sns_nick_name", Q0);
                    lVarArr[4] = new jz5.l("sns_feed_is_ad", java.lang.Integer.valueOf(n17.isAd() ? 1 : 0));
                    lVarArr[5] = new jz5.l("sns_feed_screen_height", java.lang.Integer.valueOf(improveMainUIC.getScreenHeight()));
                    lVarArr[6] = new jz5.l("sns_feed_virtual_key_height", java.lang.Integer.valueOf(improveMainUIC.getNavigationBarHeight()));
                    lVarArr[7] = new jz5.l("sns_feed_status_bar_height", java.lang.Integer.valueOf(improveMainUIC.getStatusBarHeight()));
                    lVarArr[8] = new jz5.l("sns_feed_action_bar_height", java.lang.Integer.valueOf(improveMainUIC.getActionBarHeight()));
                    lVarArr[9] = new jz5.l("sns_feed_position", java.lang.Integer.valueOf(i17));
                    lVarArr[10] = new jz5.l("sns_feed_like_count", java.lang.Integer.valueOf(n17.T0().b()));
                    lVarArr[11] = new jz5.l("sns_feed_comment_count", java.lang.Integer.valueOf(n17.getCommentList().size()));
                    lVarArr[12] = new jz5.l("sns_feed_type", java.lang.Integer.valueOf(item.n().c1().field_type));
                    lVarArr[13] = new jz5.l("sns_is_live", java.lang.Integer.valueOf((item.n().c1().field_type == 54 && pc4.e.f353426a.a()) ? 1 : 0));
                    lVarArr[14] = new jz5.l("sns_is_ws", java.lang.Integer.valueOf(n17.isWsFold() ? 1 : 0));
                    lVarArr[15] = new jz5.l("sns_is_ws_block", java.lang.Integer.valueOf(n17.isWsFold() ? 1 : 0));
                    if (item.n().h1().ContentObj.F != null) {
                        i19 = 4;
                    } else {
                        if (item.h() != 6 && item.h() != 5) {
                            i19 = 0;
                        }
                        i19 = 1;
                    }
                    lVarArr[16] = new jz5.l("sns_feed_tail_type", java.lang.Integer.valueOf(i19));
                    lVarArr[17] = new jz5.l("sns_emo_cmt_cnt", java.lang.Integer.valueOf(n17.G0()));
                    lVarArr[18] = new jz5.l("sns_img_cmt_cnt", java.lang.Integer.valueOf(n17.k1()));
                    lVarArr[19] = new jz5.l("sns_yb_retouch", com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.f168694t.b(item));
                    ((cy1.a) rVar).gk(itemView, kz5.c1.k(lVarArr));
                } catch (java.lang.Exception unused) {
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindViewParams", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
                android.view.KeyEvent.Callback callback = holder.itemView;
                kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.item.IImproveItemInterface");
                tc4.s0 s0Var = (tc4.s0) callback;
                int i27 = i17 + 1;
                boolean f17 = s0Var.f(holder, item, i27);
                com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.O6(improveMainUIC).P6(s0Var);
                kotlinx.coroutines.l.d(improveMainUIC.getMainScope(), null, null, new com.tencent.mm.plugin.sns.ui.improve.component.w0(this.f169058e, s0Var, holder, item, i27, f17, null), 3, null);
                sb4.z.c(item.n().c1());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Improve.MainUIC", "invalid onBindViewHolder " + holder.itemView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.KeyEvent.Callback callback = holder.itemView;
        kotlin.jvm.internal.o.e(callback, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.improve.item.IImproveItemInterface");
        tc4.s0 s0Var = (tc4.s0) callback;
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC = this.f169058e;
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC.O6(improveMainUIC).Q6(s0Var);
        s0Var.d();
        kotlinx.coroutines.l.d(improveMainUIC.getMainScope(), null, null, new com.tencent.mm.plugin.sns.ui.improve.component.x0(s0Var, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$buildItemConvertFactory$1$getItemConvert$1");
    }
}
