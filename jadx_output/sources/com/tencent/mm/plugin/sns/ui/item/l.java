package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class l extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem implements xd4.d, i64.k0, com.tencent.mm.plugin.sns.ui.y4 {
    public com.tencent.mm.plugin.sns.ui.widget.l A;
    public j84.i0 B;
    public int C;
    public com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic F;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.item.k f169370q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.pa f169371r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.ra f169372s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.j0 f169373t;

    /* renamed from: u, reason: collision with root package name */
    public n74.n1 f169374u;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f169376w;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.v f169378y;

    /* renamed from: z, reason: collision with root package name */
    public a44.k f169379z;

    /* renamed from: v, reason: collision with root package name */
    public boolean f169375v = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f169377x = "";
    public final boolean D = l44.a0.a();
    public final w64.l E = new com.tencent.mm.plugin.sns.ui.item.i(this);
    public final boolean G = com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.e();

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.item.k F(com.tencent.mm.plugin.sns.ui.item.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.item.k kVar = lVar.f169370q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        return kVar;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public boolean D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldItemRecordAdClickQuality", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldItemRecordAdClickQuality", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        return true;
    }

    @Override // com.tencent.mm.plugin.sns.ui.y4
    public void F3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = this.F;
        if (commonShakeLogic != null) {
            commonShakeLogic.F3();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    public final void G(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        if (bsVar == null || (l1Var = bsVar.f168036b) == null || (b1Var = l1Var.f169702c) == null) {
            b1Var = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        if (b1Var != null) {
            java.lang.String T = ca4.z0.T(snsInfo);
            if (!android.text.TextUtils.isEmpty(T) && !"0".equals(T)) {
                b1Var.a(T, this);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    public final void H(s34.r0 r0Var, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        if (com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper.e(r0Var, z17)) {
            com.tencent.mm.plugin.sns.ui.item.k kVar = this.f169370q;
            if (kVar.f169363e1 == null) {
                kVar.f169363e1 = (com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper) kVar.f169362d1.inflate();
            }
            if (this.f169370q.f169363e1 != null) {
                int b17 = i65.a.b(this.f169249f, 60);
                android.view.ViewGroup viewGroup = this.f169370q.E0;
                viewGroup.getViewTreeObserver().addOnPreDrawListener(new ed4.f(this, viewGroup, r0Var, str, b17));
            }
        } else {
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper = this.f169370q.f169363e1;
            if (finderLivingAnimWrapper != null) {
                finderLivingAnimWrapper.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    public boolean I() {
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        int i17 = this.f169370q.timeLineObject.ContentObj.f369837e;
        if (i17 != 5 && i17 != 15) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            return false;
        }
        boolean a17 = com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f169376w);
        com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "%s cardAd doPause", this);
        if (a17) {
            com.tencent.mm.plugin.sns.ad.widget.living.v vVar = this.f169378y;
            if (vVar != null) {
                vVar.g();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f169376w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f169251h;
        if (bsVar != null && (l1Var = bsVar.f168036b) != null && (b1Var = l1Var.f169702c) != null && snsInfo != null) {
            b1Var.q(snsInfo.field_snsId);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseStaticVideoPlay", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        this.f169375v = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        return true;
    }

    public final void J(com.tencent.mm.plugin.sns.ui.item.k kVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 jj4Var, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        if (kVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            return;
        }
        android.view.ViewStub viewStub = kVar.f169364f1;
        if (viewStub != null && kVar.f169365g1 == null) {
            kVar.f169365g1 = (com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer) a84.y0.h(viewStub);
        }
        if (kVar.f169365g1 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            return;
        }
        kVar.I0.setTag(kVar);
        kVar.J0.setTag(kVar);
        kVar.f169269f0.f168418h.setTag(kVar);
        android.view.View view = kVar.f169269f0.f168414d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillAdLivingStreamViewInfo", "(Lcom/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$CardAdViewHolder;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/MediaObj;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem", "fillAdLivingStreamViewInfo", "(Lcom/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$CardAdViewHolder;Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/protocal/protobuf/MediaObj;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kVar.f169269f0.f168419i.setVisibility(8);
        kVar.f169269f0.f168420j.setVisibility(8);
        kVar.X0.setVisibility(8);
        kVar.G0.setVisibility(8);
        a84.y0.o(kVar.f169269f0.f168414d, i17, i18);
        a84.y0.o(kVar.f169365g1, i17, i18);
        if (this.f169378y == null) {
            this.f169378y = new com.tencent.mm.plugin.sns.ad.widget.living.v(kVar.f169365g1);
        }
        this.f169378y.d(snsInfo, 0, jj4Var, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdLivingStreamViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    public final void K(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout;
        android.view.ViewStub viewStub;
        android.view.ViewStub viewStub2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        try {
            if (P(snsInfo)) {
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
                com.tencent.mm.plugin.sns.ui.item.k kVar = this.f169370q;
                if (kVar.f169360b1 == null && (viewStub2 = (android.view.ViewStub) kVar.D0.findViewById(com.tencent.mm.R.id.f482656ke)) != null) {
                    this.f169370q.f169360b1 = (android.view.ViewGroup) a84.y0.h(viewStub2);
                    com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "inflate the living status");
                }
                com.tencent.mm.plugin.sns.ui.item.k kVar2 = this.f169370q;
                if (kVar2.f169359a1 == null && (viewStub = (android.view.ViewStub) kVar2.D0.findViewById(com.tencent.mm.R.id.f482653kb)) != null) {
                    this.f169370q.f169359a1 = (com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout) a84.y0.h(viewStub);
                    com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "inflate the living des bar");
                }
                com.tencent.mm.plugin.sns.ui.item.k kVar3 = this.f169370q;
                android.view.ViewGroup viewGroup = kVar3.f169360b1;
                if (viewGroup != null && (livingDescBarLayout = kVar3.f169359a1) != null) {
                    if (this.f169373t == null) {
                        this.f169373t = new com.tencent.mm.plugin.sns.ad.widget.living.j0(viewGroup, livingDescBarLayout, this.f169371r);
                    }
                    if (timeLine != null && this.f169373t != null) {
                        s34.r0 r0Var = snsInfo.getAdXml().adLiveInfo;
                        int c17 = com.tencent.mm.plugin.sns.ad.widget.living.i0.c(timeLine.Id, r0Var.f402745a);
                        this.f169373t.g(timeLine.Id, r0Var);
                        this.f169373t.h(c17);
                        com.tencent.mm.plugin.sns.ad.widget.living.i0.a(timeLine.Id, this.f169373t);
                        if (!com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f169376w)) {
                            e74.i.f().d(0, snsInfo);
                        }
                        H(r0Var, timeLine.Id, com.tencent.mm.plugin.sns.ad.widget.living.j0.f(c17));
                    }
                    if (ca4.m0.Z(this.f169249f)) {
                        this.f169370q.f169359a1.setVisibility(8);
                    }
                }
                com.tencent.mars.xlog.Log.e("MiroMsg.CardAdTimeLineItem", "the livingStatusLayout or livingDescBar is null!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                return;
            }
            android.view.ViewGroup viewGroup2 = this.f169370q.f169360b1;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout2 = this.f169370q.f169359a1;
            if (livingDescBarLayout2 != null) {
                livingDescBarLayout2.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper = this.f169370q.f169363e1;
            if (finderLivingAnimWrapper != null) {
                finderLivingAnimWrapper.setVisibility(8);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MiroMsg.CardAdTimeLineItem", "fillLivingViewInfo, exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:3:0x0007, B:5:0x0010, B:8:0x0017, B:10:0x001f, B:12:0x0029, B:15:0x0034, B:17:0x003e, B:19:0x004a, B:21:0x0057, B:22:0x0069, B:24:0x006f, B:28:0x00a4, B:30:0x00aa, B:32:0x0038), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[Catch: all -> 0x00af, TryCatch #0 {all -> 0x00af, blocks: (B:3:0x0007, B:5:0x0010, B:8:0x0017, B:10:0x001f, B:12:0x0029, B:15:0x0034, B:17:0x003e, B:19:0x004a, B:21:0x0057, B:22:0x0069, B:24:0x006f, B:28:0x00a4, B:30:0x00aa, B:32:0x0038), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(com.tencent.mm.plugin.sns.storage.SnsInfo r10) {
        /*
            r9 = this;
            java.lang.String r0 = "fillPromotionalBar"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "shouldShowPromotionalBar"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)     // Catch: java.lang.Throwable -> Laf
            r3 = 0
            if (r10 == 0) goto L38
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r10.getAdXml()     // Catch: java.lang.Throwable -> Laf
            if (r4 != 0) goto L17
            goto L38
        L17:
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r10.getAdXml()     // Catch: java.lang.Throwable -> Laf
            s34.t0 r4 = r4.adPromotionInfo     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto L33
            long r5 = r4.f402766a     // Catch: java.lang.Throwable -> Laf
            long r7 = r4.f402767b     // Catch: java.lang.Throwable -> Laf
            boolean r4 = a84.f0.c(r5, r7)     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto L33
            android.app.Activity r4 = r9.f169249f     // Catch: java.lang.Throwable -> Laf
            boolean r4 = ca4.m0.Z(r4)     // Catch: java.lang.Throwable -> Laf
            if (r4 != 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = r3
        L34:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch: java.lang.Throwable -> Laf
            goto L3c
        L38:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch: java.lang.Throwable -> Laf
            r4 = r3
        L3c:
            if (r4 == 0) goto La4
            com.tencent.mm.plugin.sns.storage.ADXml r10 = r10.getAdXml()     // Catch: java.lang.Throwable -> Laf
            s34.t0 r10 = r10.adPromotionInfo     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ui.item.k r2 = r9.f169370q     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r4 = r2.Z0     // Catch: java.lang.Throwable -> Laf
            if (r4 != 0) goto L69
            android.view.ViewGroup r2 = r2.D0     // Catch: java.lang.Throwable -> Laf
            r4 = 2131296746(0x7f0901ea, float:1.8211417E38)
            android.view.View r2 = r2.findViewById(r4)     // Catch: java.lang.Throwable -> Laf
            android.view.ViewStub r2 = (android.view.ViewStub) r2     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto L69
            com.tencent.mm.plugin.sns.ui.item.k r4 = r9.f169370q     // Catch: java.lang.Throwable -> Laf
            android.view.View r2 = a84.y0.h(r2)     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r2 = (com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout) r2     // Catch: java.lang.Throwable -> Laf
            r4.Z0 = r2     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "MiroMsg.CardAdTimeLineItem"
            java.lang.String r4 = "inflate the promotionBar"
            com.tencent.mars.xlog.Log.i(r2, r4)     // Catch: java.lang.Throwable -> Laf
        L69:
            com.tencent.mm.plugin.sns.ui.item.k r2 = r9.f169370q     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r2 = r2.Z0     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto Laf
            r2.setVisibility(r3)     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ui.item.k r2 = r9.f169370q     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r2 = r2.Z0     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = r10.f402770e     // Catch: java.lang.Throwable -> Laf
            r2.setPromotionalPrice(r3)     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ui.item.k r2 = r9.f169370q     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r2 = r2.Z0     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = r10.f402771f     // Catch: java.lang.Throwable -> Laf
            r2.setRightTitle(r3)     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ui.item.k r2 = r9.f169370q     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r2 = r2.Z0     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = r10.f402769d     // Catch: java.lang.Throwable -> Laf
            java.lang.String r4 = r10.f402768c     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = a84.c0.c(r3, r4)     // Catch: java.lang.Throwable -> Laf
            a84.y0.j(r2, r3)     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ui.item.k r2 = r9.f169370q     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r2 = r2.Z0     // Catch: java.lang.Throwable -> Laf
            q84.c r3 = new q84.c     // Catch: java.lang.Throwable -> Laf
            long r4 = r10.f402766a     // Catch: java.lang.Throwable -> Laf
            long r6 = r10.f402767b     // Catch: java.lang.Throwable -> Laf
            r3.<init>(r4, r6)     // Catch: java.lang.Throwable -> Laf
            r2.b(r3)     // Catch: java.lang.Throwable -> Laf
            goto Laf
        La4:
            com.tencent.mm.plugin.sns.ui.item.k r10 = r9.f169370q     // Catch: java.lang.Throwable -> Laf
            com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout r10 = r10.Z0     // Catch: java.lang.Throwable -> Laf
            if (r10 == 0) goto Laf
            r2 = 8
            r10.setVisibility(r2)     // Catch: java.lang.Throwable -> Laf
        Laf:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.l.L(com.tencent.mm.plugin.sns.storage.SnsInfo):void");
    }

    public final void M(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        android.view.ViewStub viewStub;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillRollViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldShowRollView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            boolean z17 = (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adRollInfo == null) ? false : true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowRollView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            if (z17) {
                s34.u0 u0Var = snsInfo.getAdXml().adRollInfo;
                com.tencent.mm.plugin.sns.ui.item.k kVar = this.f169370q;
                if (kVar.f169361c1 == null && (viewStub = (android.view.ViewStub) kVar.D0.findViewById(com.tencent.mm.R.id.f482666ko)) != null) {
                    this.f169370q.f169361c1 = (com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout) a84.y0.h(viewStub);
                    com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "inflate the rollTextBar");
                }
                com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout = this.f169370q.f169361c1;
                if (livingDescBarLayout != null && u0Var != null) {
                    if (this.f169374u == null) {
                        this.f169374u = new n74.n1(livingDescBarLayout);
                    }
                    n74.n1 n1Var = this.f169374u;
                    n1Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdRollInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
                    n1Var.f335401b = u0Var;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdRollInfo", "com.tencent.mm.plugin.sns.ad.timeline.helper.SnsAdRollHelper");
                    this.f169374u.a();
                    this.f169374u.d();
                    this.f169374u.e();
                    if (ca4.m0.Z(this.f169249f)) {
                        this.f169370q.f169361c1.setVisibility(8);
                    }
                }
                com.tencent.mars.xlog.Log.e("MiroMsg.CardAdTimeLineItem", "the rollingBar or adRollInfo is null!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillRollViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                return;
            }
            com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout2 = this.f169370q.f169361c1;
            if (livingDescBarLayout2 != null) {
                livingDescBarLayout2.setVisibility(8);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MiroMsg.CardAdTimeLineItem", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillRollViewInfo", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    public final void N() {
        android.widget.FrameLayout frameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.item.k kVar = this.f169370q;
        if (kVar == null) {
            com.tencent.mars.xlog.Log.e("MiroMsg.CardAdTimeLineItem", "initCommonShakeLogic, cardHolder==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            return;
        }
        android.view.ViewGroup viewGroup = kVar.E0;
        if (viewGroup instanceof android.widget.FrameLayout) {
            frameLayout = (android.widget.FrameLayout) viewGroup;
        } else {
            com.tencent.mars.xlog.Log.e("MiroMsg.CardAdTimeLineItem", "initCommonShakeLogic, shakeViewContainer err");
            frameLayout = null;
        }
        android.widget.FrameLayout frameLayout2 = frameLayout;
        android.view.View view = this.f169370q.f169301v0;
        android.app.Activity activity = this.f169249f;
        if (activity == null || frameLayout2 == null || view == null) {
            com.tencent.mars.xlog.Log.e("MiroMsg.CardAdTimeLineItem", "initCommonShakeLogic, params err");
        } else {
            this.F = new com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic(activity, frameLayout2, view, 0, new ed4.g(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    public final void O(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshCommonShakeView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        try {
            if (this.G && com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.d(snsInfo)) {
                if (this.F == null) {
                    N();
                }
                com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = this.F;
                if (commonShakeLogic != null) {
                    commonShakeLogic.j(snsInfo, snsInfo.getAdInfo().commonShakeInfo, i18, i17);
                }
            } else {
                com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic2 = this.F;
                if (commonShakeLogic2 != null) {
                    commonShakeLogic2.j(snsInfo, null, i18, i17);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MiroMsg.CardAdTimeLineItem", "refreshCommonShakeView, exp=" + e17);
            ca4.q.c("refreshCommonShakeView, cardAd", e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshCommonShakeView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    public final boolean P(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        if (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adLiveInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        return true;
    }

    public final void R() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "try show play btn");
        com.tencent.mm.plugin.sns.ui.item.k kVar = this.f169370q;
        if (kVar != null && kVar.f169269f0 != null && !this.f169375v) {
            com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "show play btn");
            this.f169370q.f169269f0.f168419i.setVisibility(0);
            this.f169370q.f169269f0.f168420j.setVisibility(8);
            this.f169370q.f169269f0.f168419i.setImageDrawable(i65.a.i(this.f169249f, com.tencent.mm.R.raw.shortvideo_play_btn));
            this.f169370q.f169269f0.f168419i.setContentDescription(this.f169249f.getString(com.tencent.mm.R.string.hjf));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        int i18 = baseViewHolder.timeLineObject.ContentObj.f369837e;
        if (i18 == 5 || i18 == 15) {
            boolean a17 = com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f169376w);
            com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "%s cardAd autoPlay pos %d", this, java.lang.Integer.valueOf(i17));
            if (a17) {
                xd4.o0.d().j();
                xd4.g.a().d(this);
                com.tencent.mm.plugin.sns.ad.widget.living.v vVar = this.f169378y;
                if (vVar != null) {
                    vVar.i();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
                return;
            }
            xd4.g.a().c();
            com.tencent.mars.xlog.Log.w("MiroMsg.CardAdTimeLineItem", "%s cardAd autoPlay pos %d", this, java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f169376w;
            r45.jj4 a18 = n74.x1.a(baseViewHolder);
            java.lang.String c17 = n74.x1.c(baseViewHolder);
            i64.b1 b17 = n74.x1.b(this.f169251h);
            com.tencent.mm.plugin.sns.ui.item.k kVar = (com.tencent.mm.plugin.sns.ui.item.k) baseViewHolder;
            android.view.ViewGroup viewGroup = kVar.X0;
            java.lang.String str = baseViewHolder.f169268f;
            if (snsInfo != null && a18 != null && viewGroup != null) {
                com.tencent.mars.xlog.Log.w("MiroMsg.CardAdTimeLineItem", "the sns info is " + snsInfo + " the media is " + a18);
                z74.h hVar = new z74.h("MiroMsg.CardAdTimeLineItem");
                hVar.a(viewGroup);
                hVar.b(a18);
                hVar.c(snsInfo);
                hVar.d(str);
                hVar.g(c17);
                hVar.f(b17);
                hVar.e(3, new com.tencent.mm.plugin.sns.ui.item.j(this));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "try hide play btn");
            com.tencent.mm.plugin.sns.ui.item.k kVar2 = this.f169370q;
            if (kVar2 != null && kVar2.f169269f0 != null) {
                com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "hide play btn");
                this.f169370q.f169269f0.f168419i.setVisibility(8);
                this.f169370q.f169269f0.f168420j.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hidePlayBtn", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            this.f169375v = true;
            if (baseViewHolder instanceof com.tencent.mm.plugin.sns.ui.item.k) {
                kVar.W0 = false;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f169376w) && (vVar = this.f169378y) != null) {
            vVar.b();
        }
        java.lang.String T = ca4.z0.T(this.f169376w);
        if (T == null || T.equals(str)) {
            com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "onAdRemoved:" + str);
        } else {
            com.tencent.mars.xlog.Log.e("MiroMsg.CardAdTimeLineItem", "onAdRemoved, curSnsId=" + T + ", snsId=" + str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1612, 123);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "onUIPause");
        I();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.item.k kVar = this.f169370q;
        if (kVar == null || (viewGroup = kVar.E0) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
            return null;
        }
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, this.f169370q.E0.getMeasuredWidth() + i17, this.f169370q.E0.getMeasuredHeight() + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        return rect;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        this.f169370q = (com.tencent.mm.plugin.sns.ui.item.k) baseViewHolder;
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) != null) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.cok);
            if (!baseViewHolder.f169290q) {
                this.f169370q.D0 = (android.view.ViewGroup) com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                baseViewHolder.f169290q = true;
            }
        } else if (!baseViewHolder.f169290q) {
            this.f169370q.D0 = (android.view.ViewGroup) baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.f482625jn);
            baseViewHolder.f169290q = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initActionButtonComponent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f169249f;
        this.A = new ed4.e(this, "actionButtonLayoutRoot", componentCallbacks2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) componentCallbacks2 : null, this.f169370q.D0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initActionButtonComponent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.item.k kVar = this.f169370q;
        kVar.E0 = (android.view.ViewGroup) kVar.D0.findViewById(com.tencent.mm.R.id.jdk);
        android.view.ViewGroup viewGroup = this.f169370q.E0;
        if (viewGroup instanceof com.tencent.mm.ui.widget.RoundedCornerFrameLayout) {
            ((com.tencent.mm.ui.widget.RoundedCornerFrameLayout) viewGroup).setRadius(i65.a.b(this.f169249f, 4));
        }
        com.tencent.mm.plugin.sns.ui.item.k kVar2 = this.f169370q;
        kVar2.F0 = (android.view.ViewGroup) kVar2.D0.findViewById(com.tencent.mm.R.id.kmv);
        com.tencent.mm.plugin.sns.ui.item.k kVar3 = this.f169370q;
        kVar3.G0 = (com.tencent.mm.plugin.sns.ui.MaskImageView) kVar3.D0.findViewById(com.tencent.mm.R.id.n6s);
        this.f169370q.G0.setOnClickListener(this.f169251h.f168039e.f169813p);
        com.tencent.mm.plugin.sns.ui.item.k kVar4 = this.f169370q;
        kVar4.U0 = (android.widget.TextView) kVar4.D0.findViewById(com.tencent.mm.R.id.cue);
        this.f169370q.U0.setClickable(false);
        this.f169370q.U0.setLongClickable(false);
        com.tencent.mm.plugin.sns.ui.item.k kVar5 = this.f169370q;
        kVar5.T0 = (android.widget.TextView) kVar5.D0.findViewById(com.tencent.mm.R.id.cud);
        this.f169370q.T0.setClickable(false);
        this.f169370q.T0.setLongClickable(false);
        com.tencent.mm.plugin.sns.ui.item.k kVar6 = this.f169370q;
        com.tencent.mm.plugin.sns.ui.g9 g9Var = new com.tencent.mm.plugin.sns.ui.g9();
        kVar6.f169269f0 = g9Var;
        g9Var.f168418h = kVar6.D0.findViewById(com.tencent.mm.R.id.n6u);
        com.tencent.mm.plugin.sns.ui.g9 g9Var2 = this.f169370q.f169269f0;
        android.view.View view = g9Var2.f168418h;
        g9Var2.f168414d = view;
        view.setOnClickListener(this.f169251h.f168039e.f169797J);
        com.tencent.mm.plugin.sns.ui.g9 g9Var3 = this.f169370q.f169269f0;
        g9Var3.f168416f = (android.widget.ImageView) g9Var3.f168418h.findViewById(com.tencent.mm.R.id.f487295o70);
        com.tencent.mm.plugin.sns.ui.g9 g9Var4 = this.f169370q.f169269f0;
        g9Var4.f168419i = (android.widget.ImageView) g9Var4.f168418h.findViewById(com.tencent.mm.R.id.nhn);
        com.tencent.mm.plugin.sns.ui.g9 g9Var5 = this.f169370q.f169269f0;
        g9Var5.f168420j = (com.tencent.mm.ui.widget.MMPinProgressBtn) g9Var5.f168418h.findViewById(com.tencent.mm.R.id.lbi);
        com.tencent.mm.plugin.sns.ui.g9 g9Var6 = this.f169370q.f169269f0;
        g9Var6.f168422l = (android.widget.TextView) g9Var6.f168418h.findViewById(com.tencent.mm.R.id.dgp);
        com.tencent.mm.plugin.sns.ui.g9 g9Var7 = this.f169370q.f169269f0;
        g9Var7.f168421k = (android.widget.TextView) g9Var7.f168418h.findViewById(com.tencent.mm.R.id.dhd);
        com.tencent.mm.plugin.sns.ui.item.k kVar7 = this.f169370q;
        kVar7.K0 = kVar7.D0.findViewById(com.tencent.mm.R.id.n1x);
        com.tencent.mm.plugin.sns.ui.item.k kVar8 = this.f169370q;
        kVar8.L0 = (android.widget.ImageView) kVar8.D0.findViewById(com.tencent.mm.R.id.n1w);
        com.tencent.mm.plugin.sns.ui.item.k kVar9 = this.f169370q;
        kVar9.M0 = (android.widget.TextView) kVar9.D0.findViewById(com.tencent.mm.R.id.n1y);
        com.tencent.mm.plugin.sns.ui.item.k kVar10 = this.f169370q;
        kVar10.O0 = kVar10.D0.findViewById(com.tencent.mm.R.id.bcp);
        com.tencent.mm.plugin.sns.ui.item.k kVar11 = this.f169370q;
        kVar11.P0 = kVar11.D0.findViewById(com.tencent.mm.R.id.bcq);
        com.tencent.mm.plugin.sns.ui.item.k kVar12 = this.f169370q;
        kVar12.Q0 = (android.widget.ImageView) kVar12.D0.findViewById(com.tencent.mm.R.id.phc);
        com.tencent.mm.plugin.sns.ui.item.k kVar13 = this.f169370q;
        kVar13.S0 = (android.widget.ImageView) kVar13.D0.findViewById(com.tencent.mm.R.id.phe);
        com.tencent.mm.plugin.sns.ui.item.k kVar14 = this.f169370q;
        kVar14.R0 = (android.widget.TextView) kVar14.D0.findViewById(com.tencent.mm.R.id.phf);
        this.f169370q.R0.setTextSize(0, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.akg));
        com.tencent.mm.plugin.sns.ui.item.k kVar15 = this.f169370q;
        kVar15.H0 = kVar15.D0.findViewById(com.tencent.mm.R.id.b8d);
        com.tencent.mm.plugin.sns.ui.item.k kVar16 = this.f169370q;
        kVar16.I0 = (android.widget.Button) kVar16.D0.findViewById(com.tencent.mm.R.id.b8e);
        com.tencent.mm.plugin.sns.ui.item.k kVar17 = this.f169370q;
        kVar17.J0 = (android.widget.Button) kVar17.D0.findViewById(com.tencent.mm.R.id.b8f);
        this.f169370q.I0.setOnClickListener(this.f169251h.f168039e.R);
        this.f169370q.J0.setOnClickListener(this.f169251h.f168039e.S);
        com.tencent.mm.plugin.sns.ui.item.k kVar18 = this.f169370q;
        kVar18.N0 = (com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView) kVar18.D0.findViewById(com.tencent.mm.R.id.b7k);
        this.f169370q.N0.setActivityContext(this.f169249f);
        com.tencent.mm.plugin.sns.ui.item.k kVar19 = this.f169370q;
        kVar19.X0 = (android.view.ViewGroup) kVar19.D0.findViewById(com.tencent.mm.R.id.n6t);
        com.tencent.mm.plugin.sns.ui.item.k kVar20 = this.f169370q;
        kVar20.V0 = kVar20.D0.findViewById(com.tencent.mm.R.id.f482447eu);
        com.tencent.mm.plugin.sns.ui.item.k kVar21 = this.f169370q;
        kVar21.f169362d1 = (android.view.ViewStub) kVar21.D0.findViewById(com.tencent.mm.R.id.f482648k6);
        com.tencent.mm.plugin.sns.ui.item.k kVar22 = this.f169370q;
        kVar22.f169364f1 = (android.view.ViewStub) kVar22.D0.findViewById(com.tencent.mm.R.id.n4i);
        com.tencent.mm.plugin.sns.ui.item.k kVar23 = this.f169370q;
        kVar23.f169366h1 = (android.view.ViewStub) kVar23.D0.findViewById(com.tencent.mm.R.id.b9y);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(71:6|(1:8)|9|(1:15)|16|(2:311|(2:313|(1:318)(1:317))(1:319))(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(1:31)(1:310)|32|(1:309)(1:36)|37|(1:39)|40|(2:42|(1:44)(1:45))|46|(1:48)|49|(2:294|(1:296)(45:297|(1:299)(2:300|(3:302|(1:304)|305)(2:306|(1:308)))|57|(1:59)|60|(1:64)|65|(1:67)(1:293)|68|(1:70)(1:292)|71|(1:73)(1:291)|74|75|(3:77|(1:79)|80)(2:286|(1:288))|81|(1:83)(1:285)|84|(1:90)|91|(1:93)(1:284)|94|(3:96|(1:98)|99)(2:278|(3:280|(1:282)|283))|100|(1:102)(1:277)|103|(2:240|(8:242|(2:246|(1:248))|249|(1:251)|252|(1:254)|255|(1:257))(5:258|(1:260)|261|(1:276)(3:267|(1:269)(2:273|(1:275))|270)|(1:272)))|107|(1:239)(1:111)|112|(8:114|(7:116|(1:118)(1:173)|119|(1:121)|122|(1:124)|125)(2:174|(7:184|(1:186)(14:187|(1:189)|190|(1:192)|193|(1:195)|196|(2:198|(1:200)(2:217|(1:219)(2:220|(1:222)(2:223|(1:225)))))(2:226|(1:228)(2:229|(1:231)(2:232|(2:234|(1:236))(1:237))))|201|(1:203)(1:216)|204|(1:206)(1:215)|207|(4:209|210|211|212))|127|(1:129)|130|(1:132)|133)(4:178|(1:180)|181|(1:183)))|126|127|(0)|130|(0)|133)(1:238)|134|(1:136)|137|(1:139)|140|(1:144)|145|(4:147|(1:171)|151|(1:153))(1:172)|154|(1:156)(2:164|(1:170))|157|(1:161)|162|163))(1:55)|56|57|(0)|60|(2:62|64)|65|(0)(0)|68|(0)(0)|71|(0)(0)|74|75|(0)(0)|81|(0)(0)|84|(3:86|88|90)|91|(0)(0)|94|(0)(0)|100|(0)(0)|103|(1:105)|240|(0)(0)|107|(1:109)|239|112|(0)(0)|134|(0)|137|(0)|140|(2:142|144)|145|(0)(0)|154|(0)(0)|157|(2:159|161)|162|163) */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x06ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x06ad, code lost:
    
        com.tencent.mars.xlog.Log.e("MiroMsg.CardAdTimeLineItem", r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0a76  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0eb1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0edb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0eee  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0f10  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0f6d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0fa1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0fa5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0f96  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0edf  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0695 A[Catch: Exception -> 0x06ac, TryCatch #1 {Exception -> 0x06ac, blocks: (B:75:0x063c, B:77:0x0652, B:79:0x0667, B:80:0x0687, B:286:0x0695, B:288:0x06a5), top: B:74:0x063c }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0652 A[Catch: Exception -> 0x06ac, TryCatch #1 {Exception -> 0x06ac, blocks: (B:75:0x063c, B:77:0x0652, B:79:0x0667, B:80:0x0687, B:286:0x0695, B:288:0x06a5), top: B:74:0x063c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x074f  */
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r46, int r47, com.tencent.mm.plugin.sns.ui.ns r48, com.tencent.mm.protocal.protobuf.TimeLineObject r49, int r50, com.tencent.mm.plugin.sns.ui.bs r51) {
        /*
            Method dump skipped, instructions count: 4096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.item.l.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "pause");
        if (I()) {
            R();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "%s cardAd stop", this);
        this.f169375v = false;
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f169376w) && (vVar = this.f169378y) != null) {
            vVar.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem");
        return "CardAdTimeLineItem";
    }
}
