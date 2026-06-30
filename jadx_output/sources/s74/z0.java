package s74;

/* loaded from: classes4.dex */
public final class z0 extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem implements xd4.d {
    public final z74.c A;
    public final s74.x0 B;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f404617s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f404618t;

    /* renamed from: v, reason: collision with root package name */
    public r45.jj4 f404620v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f404621w;

    /* renamed from: x, reason: collision with root package name */
    public s74.p0 f404622x;

    /* renamed from: y, reason: collision with root package name */
    public s74.o2 f404623y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f404624z;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f404615q = jz5.h.b(new s74.v0(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f404616r = jz5.h.b(new s74.s0(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f404619u = jz5.h.b(new s74.u0(this));

    public z0() {
        jz5.h.b(new s74.t0(this));
        this.f404621w = "";
        this.A = new s74.y0(this);
        this.B = new s74.x0(this);
    }

    public static final /* synthetic */ s74.p0 F(s74.z0 z0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMContentHolder$p", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        s74.p0 p0Var = z0Var.f404622x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMContentHolder$p", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return p0Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public boolean D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldItemRecordAdClickQuality", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldItemRecordAdClickQuality", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return true;
    }

    public final boolean G() {
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ad.widget.living.v R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        if (I() != 5 && I() != 15) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return false;
        }
        if (this.f404623y != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        }
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(this.f404617s)) {
            com.tencent.mars.xlog.Log.i("DynamicView.TimeLineItem", "dynamicAd livingStream doPause, item.hash=" + hashCode());
            s74.o2 o2Var = this.f404623y;
            if (o2Var != null && (R = o2Var.R()) != null) {
                R.g();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return false;
        }
        com.tencent.mars.xlog.Log.i("DynamicView.TimeLineItem", "dynamicAd video doPause, item.hash=" + hashCode());
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f404617s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f169251h;
        if (bsVar != null && (l1Var = bsVar.f168036b) != null && (b1Var = l1Var.f169702c) != null && snsInfo != null) {
            b1Var.q(snsInfo.field_snsId);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        this.f404618t = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return true;
    }

    public final s74.o2 H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAdComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        s74.o2 o2Var = this.f404623y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAdComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return o2Var;
    }

    public final int I() {
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContentStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        s74.p0 p0Var = this.f404622x;
        int i17 = (p0Var == null || (timeLineObject = p0Var.timeLineObject) == null || (a90Var = timeLineObject.ContentObj) == null) ? 0 : a90Var.f369837e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContentStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return i17;
    }

    public final android.view.ViewGroup J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f404619u).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return viewGroup;
    }

    public final android.widget.ImageView K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMVideoStatusIV", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f404615q).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMVideoStatusIV", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return imageView;
    }

    public final void L(s74.q0 playModel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoUIModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        kotlin.jvm.internal.o.g(playModel, "playModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        jz5.g gVar = this.f404616r;
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.ImageView K = K();
        if (K != null) {
            K.setVisibility(8);
        }
        android.widget.ImageView K2 = K();
        if (K2 != null) {
            K2.setContentDescription(this.f169249f.getString(com.tencent.mm.R.string.hjf));
        }
        com.tencent.mars.xlog.Log.i("DynamicView.TimeLineItem", "updateVideoUIModel, playModel = " + playModel);
        int ordinal = playModel.ordinal();
        if (ordinal == 2) {
            android.widget.ImageView K3 = K();
            if (K3 != null) {
                K3.setImageResource(com.tencent.mm.R.raw.shortvideo_play_icon_err);
            }
            android.widget.ImageView K4 = K();
            if (K4 != null) {
                K4.setVisibility(0);
            }
        } else if (ordinal == 3) {
            android.widget.ImageView K5 = K();
            if (K5 != null) {
                K5.setImageDrawable(i65.a.i(this.f169249f, com.tencent.mm.R.raw.shortvideo_play_btn));
            }
            android.widget.ImageView K6 = K();
            if (K6 != null) {
                K6.setVisibility(0);
            }
        } else if (ordinal == 4) {
            android.widget.ImageView K7 = K();
            if (K7 != null) {
                K7.setImageDrawable(i65.a.i(this.f169249f, com.tencent.mm.R.raw.shortvideo_play_btn));
            }
            android.widget.ImageView K8 = K();
            if (K8 != null) {
                K8.setVisibility(0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) gVar).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoUIModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0157  */
    @Override // xd4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r14, int r15) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s74.z0.c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int):void");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.tencent.mars.xlog.Log.i("DynamicView.TimeLineItem", "onUIPause");
        G();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        android.view.ViewGroup J2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        if ((I() != 5 && I() != 15) || (J2 = J()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return null;
        }
        int[] iArr = new int[2];
        J2.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, J2.getMeasuredWidth() + i17, J2.getMeasuredHeight() + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return rect;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.tencent.mars.xlog.Log.i("DynamicView.TimeLineItem", "AdDynamicViewHolder build content is called");
        if (!(baseViewHolder instanceof s74.p0)) {
            com.tencent.mars.xlog.Log.e("DynamicView.TimeLineItem", "buildContent::the holder is not type of AdDynamicViewHolder!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return;
        }
        this.f404622x = (s74.p0) baseViewHolder;
        try {
            if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) != null) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.f489521cu0);
                if (!((s74.p0) baseViewHolder).f169290q) {
                    android.view.View inflate = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                    kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                    ((s74.p0) baseViewHolder).D0 = (android.view.ViewGroup) inflate;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                    if (((s74.p0) baseViewHolder).b() == null) {
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.tencent.mm.ui.id.b(this.f169249f).inflate(com.tencent.mm.R.layout.f489522cu1, (android.view.ViewGroup) null);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                        ((s74.p0) baseViewHolder).E0 = viewGroup;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                    }
                    ((s74.p0) baseViewHolder).f169290q = true;
                }
            } else if (!((s74.p0) baseViewHolder).f169290q) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) ((s74.p0) baseViewHolder).f169272h.findViewById(com.tencent.mm.R.id.n2e);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                ((s74.p0) baseViewHolder).D0 = viewGroup2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                if (((s74.p0) baseViewHolder).b() == null) {
                    android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) com.tencent.mm.ui.id.b(this.f169249f).inflate(com.tencent.mm.R.layout.f489522cu1, (android.view.ViewGroup) null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                    ((s74.p0) baseViewHolder).E0 = viewGroup3;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMainContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                }
                ((s74.p0) baseViewHolder).f169290q = true;
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c("build Content timeline item", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17, com.tencent.mm.plugin.sns.ui.ns nsVar, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i18, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        android.app.Activity activity;
        r45.jj4 jj4Var;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        java.lang.String str;
        java.lang.String str2;
        s74.q0 q0Var;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2;
        boolean z18;
        java.lang.String str3;
        java.lang.String str4;
        s74.p0 p0Var;
        boolean z19;
        com.tencent.mm.plugin.sns.ui.l1 l1Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("beginSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("beginSection", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion");
        if (!(baseViewHolder instanceof s74.p0)) {
            com.tencent.mars.xlog.Log.i("DynamicView.TimeLineItem", "holder is null!");
            ca4.q.c("holder is null", null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return;
        }
        if (nsVar == null || (activity = this.f169249f) == null || !(activity instanceof androidx.lifecycle.y)) {
            com.tencent.mars.xlog.Log.e("DynamicView.TimeLineItem", "fillItem::the struct or mActivity is null!!!");
            ca4.q.c("sth is null", null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = nsVar.f170025a;
        if (snsInfo2 == null) {
            ca4.q.c("mSnsInfo is null", null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return;
        }
        this.f404617s = snsInfo2;
        kotlin.jvm.internal.o.d(timeLineObject);
        r45.a90 a90Var = timeLineObject.ContentObj;
        r45.jj4 jj4Var2 = (a90Var == null || a90Var.f369840h.size() < 1) ? null : (r45.jj4) timeLineObject.ContentObj.f369840h.get(0);
        if (jj4Var2 == null) {
            ca4.q.c("mMedia is null", null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            return;
        }
        this.f404620v = jj4Var2;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2008, 0);
        s74.p0 p0Var2 = (s74.p0) baseViewHolder;
        p0Var2.f169303w0 = true;
        java.lang.String str6 = timeLineObject.Id;
        if (str6 == null) {
            str6 = "";
        }
        this.f404621w = str6;
        com.tencent.mm.plugin.sns.ui.AsyncNormalTextView asyncNormalTextView = p0Var2.f169280l;
        if (asyncNormalTextView != null) {
            asyncNormalTextView.setVisibility(8);
        }
        s74.q0 q0Var2 = s74.q0.f404499d;
        L(q0Var2);
        if ((I() != 5 && I() != 15) || (jj4Var = this.f404620v) == null || (snsInfo = this.f404617s) == null) {
            str = "";
            str2 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion";
        } else {
            i64.b1 b1Var = (bsVar == null || (l1Var = bsVar.f168036b) == null) ? null : l1Var.f169702c;
            l44.c0.b(snsInfo, jj4Var);
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = this.f404617s;
            long j17 = snsInfo3 != null ? snsInfo3.field_snsId : 0L;
            java.lang.String Di = com.tencent.mm.plugin.sns.model.l4.Di();
            r45.jj4 jj4Var3 = this.f404620v;
            kotlin.jvm.internal.o.d(jj4Var3);
            java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(Di, jj4Var3.f377855d);
            kotlin.jvm.internal.o.f(d17, "getMediaFilePath(...)");
            r45.jj4 jj4Var4 = this.f404620v;
            kotlin.jvm.internal.o.d(jj4Var4);
            java.lang.String R = ca4.z0.R(jj4Var4);
            str = "";
            kotlin.jvm.internal.o.f(R, "getSnsSightName(...)");
            java.lang.String concat = d17.concat(R);
            r45.jj4 jj4Var5 = this.f404620v;
            kotlin.jvm.internal.o.d(jj4Var5);
            int i19 = (int) jj4Var5.R;
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            str2 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent$Companion";
            com.tencent.mars.xlog.Log.i("DynamicView.TimeLineItem", "media videoDuration=" + (java.lang.System.nanoTime() - java.lang.System.nanoTime()));
            boolean D = hj6.D(this.f404620v);
            this.f404624z = s74.x2.g() && a84.p.c(this.f404617s);
            if (com.tencent.mm.vfs.w6.j(concat)) {
                if (b1Var != null) {
                    b1Var.z(j17, i19, true);
                }
                l44.c0.e();
            } else if (b1Var != null) {
                b1Var.z(j17, i19, false);
            }
            boolean z27 = com.tencent.mm.plugin.sns.model.l4.hj().v(this.f404617s) == 5;
            if (b1Var != null) {
                b1Var.y(j17, z27, 1);
            }
            r45.jj4 jj4Var6 = this.f404620v;
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo4 = this.f404617s;
            kotlin.jvm.internal.o.d(snsInfo4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            com.tencent.mm.plugin.sns.model.i1 hj7 = com.tencent.mm.plugin.sns.model.l4.hj();
            if (D) {
                if (hj7.E(jj4Var6)) {
                    q0Var = s74.q0.f404502g;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                } else if (hj7.B(jj4Var6)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                    q0Var = q0Var2;
                } else {
                    if (hj7.v(snsInfo4) <= 5) {
                        s74.p0 p0Var3 = this.f404622x;
                        if (p0Var3 != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isForbidShowPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                            boolean z28 = p0Var3.F0;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isForbidShowPlayBtn", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
                            if (z28) {
                                z17 = true;
                                q0Var = (!z17 || this.f404618t) ? q0Var2 : s74.q0.f404502g;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                            }
                        }
                        z17 = false;
                        if (z17) {
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                    } else {
                        hj7.V(jj4Var6);
                        q0Var = s74.q0.f404502g;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                    }
                    L(q0Var);
                }
            } else if (hj7.C(jj4Var6)) {
                q0Var = s74.q0.f404500e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            } else if (hj7.v(snsInfo4) == 5) {
                hj7.U(jj4Var6);
                q0Var = s74.q0.f404500e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            } else if (hj7.z(jj4Var6)) {
                q0Var = s74.q0.f404501f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
            } else {
                hj7.V(jj4Var6);
                if (hj7.v(snsInfo4) == 4) {
                    q0Var = s74.q0.f404503h;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                } else {
                    q0Var = s74.q0.f404502g;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPlayModel", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                }
            }
            L(q0Var);
        }
        p0Var2.f169269f0.f168418h = p0Var2.b();
        p0Var2.f169269f0.f168419i = K();
        com.tencent.mm.plugin.sns.ui.g9 g9Var = p0Var2.f169269f0;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo5 = this.f404617s;
        java.lang.String localid = snsInfo5 != null ? snsInfo5.getLocalid() : null;
        java.lang.String str7 = localid == null ? str : localid;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo6 = this.f404617s;
        if (snsInfo6 != null) {
            z18 = snsInfo6.isAd();
            timeLineObject2 = timeLineObject;
        } else {
            timeLineObject2 = timeLineObject;
            z18 = false;
        }
        g9Var.a(timeLineObject2, 0, str7, z18);
        if (this.f404623y == null) {
            int j18 = s74.q4.f404513a.j(this.f169249f);
            android.content.ComponentCallbacks2 componentCallbacks2 = this.f169249f;
            androidx.lifecycle.y yVar = componentCallbacks2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) componentCallbacks2 : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
            android.view.ViewGroup viewGroup = p0Var2.D0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
            if (viewGroup == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                return;
            }
            i64.b1 b1Var2 = (bsVar == null || (l1Var2 = bsVar.f168036b) == null) ? null : l1Var2.f169702c;
            if (b1Var2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                return;
            }
            s74.r0 r0Var = new s74.r0(bsVar, this);
            com.tencent.mm.plugin.sns.ui.l1 l1Var3 = bsVar.f168036b;
            com.tencent.mm.plugin.sns.model.l7 l7Var = l1Var3 != null ? l1Var3.f169703d : null;
            android.view.ViewGroup rootView = p0Var2.f169305x0;
            kotlin.jvm.internal.o.f(rootView, "rootView");
            android.app.Activity mActivity = this.f169249f;
            kotlin.jvm.internal.o.f(mActivity, "mActivity");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
            android.view.ViewGroup viewGroup2 = p0Var2.D0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem$AdDynamicViewHolder");
            if (viewGroup2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                return;
            }
            android.view.ViewGroup b17 = p0Var2.b();
            if (b17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                return;
            }
            android.view.ViewGroup J2 = J();
            if (J2 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
                return;
            }
            str3 = "fillItem";
            str4 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem";
            z19 = false;
            p0Var = p0Var2;
            this.f404623y = new s74.o2("DynamicViewTimeline", yVar, viewGroup, 0, b1Var2, r0Var, l7Var, new s74.p2(rootView, j18, mActivity, viewGroup2, b17, J2, baseViewHolder, bsVar.f168039e, bsVar.d(), i17));
        } else {
            str3 = "fillItem";
            str4 = "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem";
            p0Var = p0Var2;
            z19 = false;
        }
        s74.o2 o2Var = this.f404623y;
        if (o2Var != null) {
            boolean z29 = this.f169247d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInLargeWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
            o2Var.B = z29;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInLargeWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AbsDynamicComponent");
        }
        s74.o2 o2Var2 = this.f404623y;
        if (o2Var2 != null) {
            o2Var2.f(this.f404617s);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ad fillItem, dynamic card, pos=");
        sb6.append(i17);
        sb6.append(", snsId=");
        sb6.append(this.f404621w);
        sb6.append(", localId=");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo7 = this.f404617s;
        sb6.append(snsInfo7 != null ? snsInfo7.getLocalid() : null);
        sb6.append(", hash=");
        sb6.append(hashCode());
        com.tencent.mars.xlog.Log.i("DynamicView.TimeLineItem", sb6.toString());
        p0Var.f169303w0 = z19;
        if (ca4.m0.X(I())) {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo8 = this.f404617s;
            if ((snsInfo8 == null || !snsInfo8.isAdForbidAutoPlay()) ? z19 : true) {
                L(s74.q0.f404502g);
            }
        }
        java.lang.String str8 = str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("endSection", str8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("endSection", str8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.tencent.mars.xlog.Log.i("DynamicView.TimeLineItem", "pause");
        if (G()) {
            L(s74.q0.f404502g);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
    }

    @Override // xd4.d
    public void stop() {
        s74.o2 o2Var;
        com.tencent.mm.plugin.sns.ad.widget.living.v R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.tencent.mars.xlog.Log.i("DynamicView.TimeLineItem", "stop， hash=" + hashCode());
        this.f404618t = false;
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.f163766e.a(this.f404617s) && (o2Var = this.f404623y) != null && (R = o2Var.R()) != null) {
            R.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.AdDynamicViewTimeLineItem");
        return "AdDynamicView";
    }
}
