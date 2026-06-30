package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class z0 extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem implements xd4.d {

    /* renamed from: q, reason: collision with root package name */
    public boolean f169432q;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f169434s;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder f169436u;

    /* renamed from: r, reason: collision with root package name */
    public boolean f169433r = false;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f169435t = new android.view.View.OnClickListener() { // from class: ed4.y$$a
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            com.tencent.mm.plugin.sns.ui.item.z0 z0Var = com.tencent.mm.plugin.sns.ui.item.z0.this;
            z0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$new$0", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(view);
            java.lang.Object[] array = arrayList.toArray();
            arrayList.clear();
            yj0.a.b("com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", z0Var, array);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTimeLineItem", "VideoTimeLineItem click to post finder");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = z0Var.f169434s;
            if (snsInfo == null) {
                yj0.a.h(z0Var, "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$new$0", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
                return;
            }
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
            java.lang.String str = timeLine.ContentDesc;
            java.lang.String j17 = com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", z0Var.f169434s.localid);
            if (n34.h3.f334610d.i(z0Var.f169251h.f168042h, j17, str, z0Var.f169434s.field_snsId, r7.localid, timeLine.videoTemplate, false, false)) {
                view.post(new ed4.z(z0Var, view));
            }
            yj0.a.h(z0Var, "com/tencent/mm/plugin/sns/ui/item/VideoTimeLineItem", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$new$0", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        }
    };

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f169437v = null;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f169438w = "";

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f169439x = null;

    /* renamed from: y, reason: collision with root package name */
    public boolean f169440y = false;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View.OnClickListener f169441z = new ed4.a0(this);

    public void F() {
        com.tencent.mm.plugin.sns.ui.g9 g9Var;
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTimeLineItem", "%s Ad Video doPause", this);
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f169436u;
        if (baseViewHolder != null && (g9Var = baseViewHolder.f169269f0) != null) {
            g9Var.f168415e.pause();
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f169434s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            com.tencent.mm.plugin.sns.ui.bs bsVar = this.f169251h;
            if (bsVar != null && (l1Var = bsVar.f168036b) != null && (b1Var = l1Var.f169702c) != null && snsInfo != null) {
                b1Var.q(snsInfo.field_snsId);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        }
        this.f169432q = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    public final void G(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTimeLineItem", "lxl setVideoStatusIvVisibility %s, but isPlaying", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        } else {
            baseViewHolder.f169269f0.f168419i.setVisibility(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoStatusIvVisibility", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        }
    }

    public void H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTimeLineItem", "try show play btn");
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f169436u;
        if (baseViewHolder != null && baseViewHolder.f169269f0 != null && !this.f169432q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoTimeLineItem", "show play btn");
            this.f169436u.f169269f0.f168419i.setVisibility(0);
            this.f169436u.f169269f0.f168420j.setVisibility(8);
            this.f169436u.f169269f0.f168419i.setImageDrawable(i65.a.i(this.f169249f, com.tencent.mm.R.raw.shortvideo_play_btn));
            this.f169436u.f169269f0.f168419i.setContentDescription(this.f169249f.getString(com.tencent.mm.R.string.hjf));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x021e  */
    @Override // xd4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r25, int r26) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.z0.c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int):void");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTimeLineItem", "onUIPause");
        F();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        android.view.View view = this.f169437v;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, this.f169437v.getMeasuredWidth() + i17, this.f169437v.getMeasuredHeight() + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        return rect;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        this.f169249f.getWindowManager().getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
        this.f169436u = baseViewHolder;
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) != null) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.csn);
            android.view.ViewStub viewStub2 = (android.view.ViewStub) baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.f485318ha2);
            if (!baseViewHolder.f169267e0) {
                baseViewHolder.f169269f0.f168414d = viewStub2.inflate();
                baseViewHolder.f169267e0 = true;
            }
        } else {
            baseViewHolder.f169269f0.f168414d = baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.n_5);
            baseViewHolder.f169267e0 = true;
        }
        com.tencent.mm.plugin.sns.ui.g9 g9Var = baseViewHolder.f169269f0;
        g9Var.f168418h = g9Var.f168414d.findViewById(com.tencent.mm.R.id.bkg);
        com.tencent.mm.plugin.sns.ui.g9 g9Var2 = baseViewHolder.f169269f0;
        g9Var2.f168415e = (com.tencent.mm.pluginsdk.ui.tools.VideoSightView) g9Var2.f168414d.findViewById(com.tencent.mm.R.id.h88);
        baseViewHolder.f169269f0.f168415e.setMute(true);
        baseViewHolder.f169269f0.f168418h.setOnClickListener(this.f169441z);
        com.tencent.mm.plugin.sns.ui.g9 g9Var3 = baseViewHolder.f169269f0;
        g9Var3.f168419i = (android.widget.ImageView) g9Var3.f168414d.findViewById(com.tencent.mm.R.id.nhn);
        com.tencent.mm.plugin.sns.ui.g9 g9Var4 = baseViewHolder.f169269f0;
        g9Var4.f168420j = (com.tencent.mm.ui.widget.MMPinProgressBtn) g9Var4.f168414d.findViewById(com.tencent.mm.R.id.lbi);
        com.tencent.mm.plugin.sns.ui.g9 g9Var5 = baseViewHolder.f169269f0;
        g9Var5.f168422l = (android.widget.TextView) g9Var5.f168414d.findViewById(com.tencent.mm.R.id.dgp);
        com.tencent.mm.plugin.sns.ui.g9 g9Var6 = baseViewHolder.f169269f0;
        g9Var6.f168421k = (android.widget.TextView) g9Var6.f168414d.findViewById(com.tencent.mm.R.id.dhd);
        com.tencent.mm.plugin.sns.ui.g9 g9Var7 = baseViewHolder.f169269f0;
        g9Var7.f168423m = (android.widget.ImageView) g9Var7.f168414d.findViewById(com.tencent.mm.R.id.nar);
        gm0.j1.i();
        if (((java.lang.Boolean) gm0.j1.u().c().l(344065, java.lang.Boolean.FALSE)).booleanValue()) {
            baseViewHolder.f169269f0.f168415e.setSightInfoView((android.widget.TextView) ((android.view.ViewStub) baseViewHolder.f169269f0.f168414d.findViewById(com.tencent.mm.R.id.mwl)).inflate());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x073e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0759  */
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r35, int r36, com.tencent.mm.plugin.sns.ui.ns r37, com.tencent.mm.protocal.protobuf.TimeLineObject r38, int r39, com.tencent.mm.plugin.sns.ui.bs r40) {
        /*
            Method dump skipped, instructions count: 2142
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.z0.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTimeLineItem", "pause");
        F();
        H();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ui.g9 g9Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoTimeLineItem", "%s Ad Video stop", this);
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f169436u;
        if (baseViewHolder != null && (g9Var = baseViewHolder.f169269f0) != null) {
            g9Var.f168415e.p();
        }
        this.f169432q = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        return "VideoTimeLineItem";
    }
}
