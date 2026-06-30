package dc4;

/* loaded from: classes4.dex */
public class d0 extends dc4.v implements i64.k0 {
    public android.view.View A;
    public android.view.View B;
    public android.view.View C;
    public android.view.View D;
    public com.tencent.mm.plugin.sns.ad.widget.countdown.PromotionBarLayout E;
    public final i64.b1 F;
    public int G;
    public com.tencent.mm.plugin.sns.ui.pa H;
    public com.tencent.mm.plugin.sns.ui.ra I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout f228724J;
    public android.view.ViewGroup K;
    public com.tencent.mm.plugin.sns.ad.widget.living.j0 L;
    public com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout M;
    public n74.n1 N;
    public android.view.ViewStub P;
    public com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper Q;
    public android.view.ViewStub R;
    public com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer S;
    public com.tencent.mm.plugin.sns.ad.widget.living.v T;
    public android.view.ViewStub U;
    public a44.k V;
    public android.view.ViewGroup W;
    public com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView X;
    public boolean Y;
    public final java.lang.String Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.View f228725l1;

    /* renamed from: p, reason: collision with root package name */
    public android.content.Context f228726p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f228729q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f228730r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f228731s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.Button f228732t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.Button f228733u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f228734v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f228735w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.ImageView f228736x;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.l f228737x0;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.MaskImageView f228739y;

    /* renamed from: y0, reason: collision with root package name */
    public j84.i0 f228740y0;

    /* renamed from: y1, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic f228741y1;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView f228742z;

    /* renamed from: p0, reason: collision with root package name */
    public final android.os.Handler f228727p0 = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: p1, reason: collision with root package name */
    public final w64.l f228728p1 = new dc4.z(this);

    /* renamed from: x1, reason: collision with root package name */
    public boolean f228738x1 = false;

    /* renamed from: z1, reason: collision with root package name */
    public final boolean f228743z1 = com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic.e();

    public d0(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.listener.i iVar, i64.b1 b1Var) {
        this.f228831d = timeLineObject;
        this.f228832e = snsInfo;
        this.f228838n = iVar;
        this.F = b1Var;
        this.Z = snsInfo.getLocalid();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x09eb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07fc A[Catch: Exception -> 0x0814, TryCatch #0 {Exception -> 0x0814, blocks: (B:70:0x0792, B:72:0x07ac, B:75:0x07b3, B:77:0x07be, B:79:0x07d5, B:80:0x07f6, B:118:0x07fc, B:120:0x080e, B:121:0x07b8), top: B:69:0x0792 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x07be A[Catch: Exception -> 0x0814, TryCatch #0 {Exception -> 0x0814, blocks: (B:70:0x0792, B:72:0x07ac, B:75:0x07b3, B:77:0x07be, B:79:0x07d5, B:80:0x07f6, B:118:0x07fc, B:120:0x080e, B:121:0x07b8), top: B:69:0x0792 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0986  */
    @Override // dc4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.view.View r33, android.view.View r34) {
        /*
            Method dump skipped, instructions count: 2598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc4.d0.c(android.view.View, android.view.View):void");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f228832e) && (vVar = this.T) != null) {
            vVar.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    @Override // dc4.v
    public void g() {
        boolean a17;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        try {
            a17 = com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f228832e);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardAdDetailItemView", "onPause, hasPlayedVideo=" + this.f228738x1 + ", useOnlineVideo=" + this.Y + ", isAdLivingStream=" + a17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardAdDetailItemView", "onPause, exp=" + th6.toString());
        }
        if (a17) {
            this.T.g();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            return;
        }
        if (this.f228738x1 && this.f228835h != null) {
            if (this.Y && (snsTimelineVideoView = this.X) != null) {
                snsTimelineVideoView.F();
            }
            i64.b1 b1Var = this.F;
            if (b1Var != null && (snsInfo = this.f228832e) != null) {
                b1Var.q(snsInfo.field_snsId);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    @Override // dc4.v
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = this.f228741y1;
        if (commonShakeLogic != null) {
            commonShakeLogic.F3();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:18|(3:20|(1:22)(1:132)|23)(2:133|(31:138|(7:140|(1:144)|145|(1:147)(3:155|(1:157)|158)|148|(1:152)|153)(8:159|(1:161)|162|(2:164|(1:166)(2:189|(1:191)(2:192|(1:194)(2:195|(1:197)))))(2:198|(1:200)(2:201|(1:203)(2:204|(1:206)(1:207))))|167|(5:169|(1:171)(1:177)|172|(1:174)(1:176)|175)|178|(5:180|(1:182)(1:187)|183|(1:185)|186)(1:188))|154|25|(1:29)|30|(1:32)(2:125|(1:131))|33|34|35|(21:40|(1:122)(1:46)|47|(4:49|(1:53)|54|(1:56))(2:119|(1:121))|57|58|59|(1:116)(1:65)|66|(14:68|(1:72)|73|(4:77|(1:79)|80|(1:82))|111|112|84|(1:86)|87|88|89|(2:106|(1:108))(4:93|(1:95)|96|(1:98))|99|(1:105))(2:113|(1:115))|83|84|(0)|87|88|89|(1:91)|106|(0)|99|(3:101|103|105))|123|(0)(0)|57|58|59|(1:61)|116|66|(0)(0)|83|84|(0)|87|88|89|(0)|106|(0)|99|(0))(1:137))|24|25|(2:27|29)|30|(0)(0)|33|34|35|(24:37|40|(1:42)|122|47|(0)(0)|57|58|59|(0)|116|66|(0)(0)|83|84|(0)|87|88|89|(0)|106|(0)|99|(0))|123|(0)(0)|57|58|59|(0)|116|66|(0)(0)|83|84|(0)|87|88|89|(0)|106|(0)|99|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0812, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0813, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.CardAdDetailItemView", "refreshCommonShakeView, exp=" + r0);
        ca4.q.c("refreshCommonShakeView, cardAdDetail", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x07a9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x07aa, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.CardAdDetailItemView", r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x080b A[Catch: Exception -> 0x0812, TRY_LEAVE, TryCatch #3 {Exception -> 0x0812, blocks: (B:89:0x07e4, B:91:0x07e8, B:93:0x07f0, B:95:0x07f4, B:96:0x07f7, B:98:0x07fb, B:106:0x0807, B:108:0x080b), top: B:88:0x07e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x079f A[Catch: all -> 0x07a9, TRY_ENTER, TryCatch #2 {all -> 0x07a9, blocks: (B:59:0x070d, B:61:0x0715, B:63:0x071b, B:66:0x0728, B:68:0x072d, B:70:0x0737, B:72:0x0744, B:73:0x0752, B:77:0x0759, B:79:0x075d, B:80:0x0764, B:82:0x078d, B:111:0x0795, B:113:0x079f, B:115:0x07a3), top: B:58:0x070d }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x06fa A[Catch: all -> 0x0703, TryCatch #0 {all -> 0x0703, blocks: (B:35:0x0674, B:37:0x067c, B:40:0x0683, B:42:0x068b, B:44:0x0695, B:47:0x06a0, B:49:0x06aa, B:51:0x06b4, B:53:0x06c1, B:54:0x06c9, B:56:0x06cd, B:119:0x06fa, B:121:0x06fe, B:123:0x06a4), top: B:34:0x0674 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x06aa A[Catch: all -> 0x0703, TryCatch #0 {all -> 0x0703, blocks: (B:35:0x0674, B:37:0x067c, B:40:0x0683, B:42:0x068b, B:44:0x0695, B:47:0x06a0, B:49:0x06aa, B:51:0x06b4, B:53:0x06c1, B:54:0x06c9, B:56:0x06cd, B:119:0x06fa, B:121:0x06fe, B:123:0x06a4), top: B:34:0x0674 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0715 A[Catch: all -> 0x07a9, TryCatch #2 {all -> 0x07a9, blocks: (B:59:0x070d, B:61:0x0715, B:63:0x071b, B:66:0x0728, B:68:0x072d, B:70:0x0737, B:72:0x0744, B:73:0x0752, B:77:0x0759, B:79:0x075d, B:80:0x0764, B:82:0x078d, B:111:0x0795, B:113:0x079f, B:115:0x07a3), top: B:58:0x070d }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x072d A[Catch: all -> 0x07a9, TryCatch #2 {all -> 0x07a9, blocks: (B:59:0x070d, B:61:0x0715, B:63:0x071b, B:66:0x0728, B:68:0x072d, B:70:0x0737, B:72:0x0744, B:73:0x0752, B:77:0x0759, B:79:0x075d, B:80:0x0764, B:82:0x078d, B:111:0x0795, B:113:0x079f, B:115:0x07a3), top: B:58:0x070d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07e8 A[Catch: Exception -> 0x0812, TryCatch #3 {Exception -> 0x0812, blocks: (B:89:0x07e4, B:91:0x07e8, B:93:0x07f0, B:95:0x07f4, B:96:0x07f7, B:98:0x07fb, B:106:0x0807, B:108:0x080b), top: B:88:0x07e4 }] */
    @Override // dc4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 2113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dc4.d0.j():void");
    }

    public final void l(s34.r0 r0Var, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        if (com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper.e(r0Var, z17)) {
            if (this.Q == null) {
                this.Q = (com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper) this.P.inflate();
            }
            if (this.Q != null) {
                com.tencent.mm.sdk.platformtools.u3.i(new dc4.b0(this, r0Var, str), 150L);
            }
        } else {
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper = this.Q;
            if (finderLivingAnimWrapper != null) {
                finderLivingAnimWrapper.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    public final void m(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout;
        android.view.ViewStub viewStub;
        android.view.ViewStub viewStub2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillLivingStatus", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        try {
            if (o(snsInfo)) {
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
                if (this.K == null && (viewStub2 = (android.view.ViewStub) this.f228833f.findViewById(com.tencent.mm.R.id.f482656ke)) != null) {
                    this.K = (android.view.ViewGroup) a84.y0.h(viewStub2);
                }
                if (this.f228724J == null && (viewStub = (android.view.ViewStub) this.f228833f.findViewById(com.tencent.mm.R.id.f482653kb)) != null) {
                    this.f228724J = (com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout) a84.y0.h(viewStub);
                }
                android.view.ViewGroup viewGroup = this.K;
                if (viewGroup != null && (livingDescBarLayout = this.f228724J) != null) {
                    if (this.L == null) {
                        this.L = new com.tencent.mm.plugin.sns.ad.widget.living.j0(viewGroup, livingDescBarLayout, this.H);
                    }
                    if (timeLine != null && this.L != null) {
                        s34.r0 r0Var = snsInfo.getAdXml().adLiveInfo;
                        int c17 = com.tencent.mm.plugin.sns.ad.widget.living.i0.c(timeLine.Id, r0Var.f402745a);
                        this.L.g(timeLine.Id, r0Var);
                        this.L.h(c17);
                        com.tencent.mm.plugin.sns.ad.widget.living.i0.a(timeLine.Id, this.L);
                        if (!com.tencent.mm.plugin.sns.ad.widget.living.v.a(snsInfo)) {
                            e74.i.f().d(1, snsInfo);
                        }
                        l(r0Var, timeLine.Id, com.tencent.mm.plugin.sns.ad.widget.living.j0.f(c17));
                    }
                    if (ca4.m0.Z(this.f228726p)) {
                        this.f228724J.setVisibility(8);
                    }
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.CardAdDetailItemView", "the livingStatusLayout or livingDescBar is null!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingStatus", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
                return;
            }
            android.view.ViewGroup viewGroup2 = this.K;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ad.widget.living.LivingDescBarLayout livingDescBarLayout2 = this.f228724J;
            if (livingDescBarLayout2 != null) {
                livingDescBarLayout2.setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper = this.Q;
            if (finderLivingAnimWrapper != null) {
                finderLivingAnimWrapper.setVisibility(8);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardAdDetailItemView", "fillLivingViewInfo, exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillLivingStatus", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    public final void n() {
        android.widget.FrameLayout frameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        android.view.View view = this.B;
        if (view instanceof android.widget.FrameLayout) {
            frameLayout = (android.widget.FrameLayout) view;
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardAdDetailItemView", "initCommonShakeLogic, mediaContainer err");
            frameLayout = null;
        }
        android.widget.FrameLayout frameLayout2 = frameLayout;
        android.view.View findViewById = this.f228833f.findViewById(com.tencent.mm.R.id.f482625jn);
        android.content.Context context = this.f228726p;
        if (context == null || frameLayout2 == null || findViewById == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardAdDetailItemView", "initCommonShakeLogic, params err");
        } else {
            this.f228741y1 = new com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic(context, frameLayout2, findViewById, 1, new dc4.c0(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCommonShakeLogic", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    public final boolean o(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        if (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adLiveInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldShowLivingView", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        return true;
    }

    public final void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardAdDetailItemView", "showPlayBtn");
        android.view.View view = this.f228725l1;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem", "showPlayBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/detail/item/CardAdDetailItem", "showPlayBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPlayBtn", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }

    public final void q(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        int b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateHeaderCardBtnState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
        if (snsInfo == null || !snsInfo.isCardAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateHeaderCardBtnState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            return;
        }
        int color = this.f228726p.getResources().getColor(com.tencent.mm.R.color.f478724ff);
        int color2 = this.f228726p.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2);
        android.widget.Button button = this.f228732t;
        if (button == null || this.f228733u == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateHeaderCardBtnState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
            return;
        }
        button.setOnClickListener(this.f228838n.R);
        this.f228733u.setOnClickListener(this.f228838n.S);
        boolean z17 = true;
        if (snsInfo.getAdXml().hasVoteInfo() && (b17 = com.tencent.mm.plugin.sns.storage.w2.b(snsInfo.getAdXml().adVoteInfo.f166123a, snsInfo.getUxinfo())) > 0 && b17 <= 2) {
            if (b17 == 1) {
                this.f228733u.setTextColor(color2);
                this.f228733u.setText(snsInfo.getAdXml().adVoteInfo.a(1));
                this.f228732t.setTextColor(color);
                this.f228732t.setText(snsInfo.getAdXml().adVoteInfo.b(0));
            } else if (b17 == 2) {
                this.f228732t.setTextColor(color2);
                this.f228732t.setText(snsInfo.getAdXml().adVoteInfo.a(0));
                this.f228733u.setTextColor(color);
                this.f228733u.setText(snsInfo.getAdXml().adVoteInfo.b(1));
            }
            z17 = false;
        }
        if (z17) {
            this.f228732t.setTextColor(color);
            this.f228733u.setTextColor(color);
            this.f228732t.setText(snsInfo.getAdXml().getCardSelectLeftTitle());
            this.f228733u.setText(snsInfo.getAdXml().getCardSelectRightTitle());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateHeaderCardBtnState", "com.tencent.mm.plugin.sns.ui.detail.item.CardAdDetailItem");
    }
}
