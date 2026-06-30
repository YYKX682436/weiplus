package p74;

/* loaded from: classes4.dex */
public final class t extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem implements xd4.d, z84.i, i64.k0 {
    public w64.n A;
    public p74.o B;
    public w64.n C;
    public a44.k E;

    /* renamed from: q, reason: collision with root package name */
    public p74.q f352586q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f352587r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f352588s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager f352589t;

    /* renamed from: v, reason: collision with root package name */
    public p74.w f352591v;

    /* renamed from: w, reason: collision with root package name */
    public q74.b0 f352592w;

    /* renamed from: x, reason: collision with root package name */
    public p74.i f352593x;

    /* renamed from: y, reason: collision with root package name */
    public int f352594y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.ViewGroup f352595z;

    /* renamed from: u, reason: collision with root package name */
    public final z74.i f352590u = new z74.i();
    public int D = 1;

    public final void F(p74.q qVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s34.a1 a1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillSlideCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        p74.w wVar = this.f352591v;
        if (wVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            wVar.f352614h = snsInfo;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        }
        com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView b17 = qVar.b();
        if (b17 != null) {
            androidx.recyclerview.widget.f2 adapter = b17.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            if (!this.f352588s) {
                p74.j c17 = p74.k.c(this.D);
                p74.i iVar = this.f352593x;
                if (iVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWidthDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWidthDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeightDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeightDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposeDistance2Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposeDistance2Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposeDistance3Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposeDistance3Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCardSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
                    p74.h hVar = p74.i.D;
                    iVar.f352551n = p74.h.a(hVar, c17.f352564a);
                    iVar.f352552o = p74.h.a(hVar, c17.f352565b);
                    iVar.f352553p = p74.h.a(hVar, 28.0f);
                    float a17 = p74.h.a(hVar, 24.0f);
                    iVar.f352554q = a17;
                    iVar.f352563z = 1.0f;
                    iVar.f352555r = iVar.f352551n;
                    iVar.f352556s = iVar.f352552o;
                    iVar.f352558u = iVar.f352553p;
                    iVar.f352559v = a17;
                    iVar.l();
                    iVar.k();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCardSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
                }
                com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager adSlideCardLayoutManager = this.f352589t;
                if (adSlideCardLayoutManager != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetScrollOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
                    int i17 = 0;
                    adSlideCardLayoutManager.f163780d = 0;
                    adSlideCardLayoutManager.requestLayout();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetScrollOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager");
                    p74.i iVar2 = this.f352593x;
                    if (iVar2 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMScaledCardWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
                        i17 = a06.d.b(iVar2.f352555r);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMScaledCardWidth", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setViewItemWidth", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                    adSlideCardLayoutManager.f163781e = i17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewItemWidth", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
                }
                p74.c cVar = new p74.c(b17, snsInfo);
                java.util.List<s34.x0> list = a1Var != null ? a1Var.resInfoList : null;
                if (list == null) {
                    list = kz5.p0.f313996d;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardList", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
                if (a84.b0.b(list)) {
                    com.tencent.mars.xlog.Log.w("SnsAd.AdSlideCardAdapter", "setCardList: cardList is null or empty!");
                } else {
                    cVar.f352523g = kz5.n0.V0(list);
                    com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardAdapter", "setCardList: update card list, count = " + ((java.util.ArrayList) cVar.f352523g).size());
                    cVar.notifyDataSetChanged();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardList", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
                cVar.setHasStableIds(true);
                p74.r rVar = new p74.r(this);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
                cVar.f352524h = rVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardAdapter");
                b17.setAdapter(cVar);
                java.util.Objects.toString(b17.getAdapter());
            }
        } else {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardTimelineItem", "fillSlideCardContent: recyclerView is null!!!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillSlideCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
    }

    public final void G(p74.q qVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        qVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
        android.view.ViewGroup viewGroup = qVar.D0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardTimelineItem", "fillViewHolder::the root null, is it right????");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
            return;
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.v7u);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRecyclerViewLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
        qVar.E0 = frameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRecyclerViewLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
        com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView adSlideCardRecyclerView = (com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView) viewGroup.findViewById(com.tencent.mm.R.id.v7t);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentRecyclerView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
        qVar.F0 = adSlideCardRecyclerView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentRecyclerView", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
        android.view.ViewStub viewStub = (android.view.ViewStub) viewGroup.findViewById(com.tencent.mm.R.id.v7f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOverSlideTipLayoutStub", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
        qVar.G0 = viewStub;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOverSlideTipLayoutStub", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
        android.view.ViewStub viewStub2 = (android.view.ViewStub) viewGroup.findViewById(com.tencent.mm.R.id.g6y);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComplianceManagementViewStub", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
        qVar.H0 = viewStub2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComplianceManagementViewStub", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
        android.view.View view = qVar.f169277j0;
        if (view instanceof android.view.ViewGroup) {
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f352595z = (android.view.ViewGroup) view;
        }
        com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView b17 = qVar.b();
        if (b17 != null) {
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView b18 = qVar.b();
            if (b18 != null) {
                b18.setOverScrollMode(2);
            }
            this.f352594y = p74.k.b(this.f169249f, 0, this.f169247d);
            b17.setHasFixedSize(true);
            this.f352589t = new com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager(b17);
            this.f352591v = new p74.w(this.f352590u, this.f352592w, 0);
            p74.j c17 = p74.k.c(1);
            if (this.f352593x == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWidthDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWidthDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                float f17 = c17.f352564a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeightDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeightDp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                float f18 = c17.f352565b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposeDistance2Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposeDistance2Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposeDistance3Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposeDistance3Dp", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLogicHelper$CardSizeInfo");
                this.f352593x = new p74.i(f17, f18, 28.0f, 24.0f, this.D, 0.0f, 0.0f, 96, null);
            }
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager adSlideCardLayoutManager = this.f352589t;
            if (adSlideCardLayoutManager != null) {
                adSlideCardLayoutManager.D(this.f352593x);
            }
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager adSlideCardLayoutManager2 = this.f352589t;
            if (adSlideCardLayoutManager2 != null) {
                adSlideCardLayoutManager2.E(this.f352591v);
            }
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager adSlideCardLayoutManager3 = this.f352589t;
            if (adSlideCardLayoutManager3 != null) {
                adSlideCardLayoutManager3.C(false);
            }
            b17.setLayoutManager(this.f352589t);
            com.tencent.mm.plugin.sns.ui.bs bsVar = this.f169251h;
            this.A = new w64.n(this.f169249f, 0, H(bsVar), null, new p74.s(bsVar, qVar, b17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
    }

    public final i64.b1 H(com.tencent.mm.plugin.sns.ui.bs bsVar) {
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        i64.b1 b1Var = (bsVar == null || (l1Var = bsVar.f168036b) == null) ? null : l1Var.f169702c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        return b1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0046 A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x0008, B:5:0x000c, B:8:0x0016, B:10:0x001a, B:11:0x001d, B:14:0x0021, B:16:0x0026, B:18:0x002c, B:20:0x0032, B:22:0x0036, B:24:0x003a, B:29:0x0046, B:31:0x004a, B:33:0x0054, B:35:0x0058, B:37:0x005c, B:39:0x0060, B:41:0x0067, B:42:0x006c, B:44:0x0070, B:46:0x0074, B:47:0x0081, B:48:0x0084, B:50:0x0088), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004a A[Catch: all -> 0x008c, TryCatch #0 {all -> 0x008c, blocks: (B:3:0x0008, B:5:0x000c, B:8:0x0016, B:10:0x001a, B:11:0x001d, B:14:0x0021, B:16:0x0026, B:18:0x002c, B:20:0x0032, B:22:0x0036, B:24:0x003a, B:29:0x0046, B:31:0x004a, B:33:0x0054, B:35:0x0058, B:37:0x005c, B:39:0x0060, B:41:0x0067, B:42:0x006c, B:44:0x0070, B:46:0x0074, B:47:0x0081, B:48:0x0084, B:50:0x0088), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(int r7) {
        /*
            r6 = this;
            java.lang.String r0 = "onItemClick"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager r2 = r6.f352589t     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L11
            int r2 = r2.p()     // Catch: java.lang.Throwable -> L8c
            goto L12
        L11:
            r2 = -1
        L12:
            if (r7 <= r2) goto L21
            if (r2 < 0) goto L21
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutManager r7 = r6.f352589t     // Catch: java.lang.Throwable -> L8c
            if (r7 == 0) goto L1d
            r7.F()     // Catch: java.lang.Throwable -> L8c
        L1d:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> L8c
            return
        L21:
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r6.f352587r     // Catch: java.lang.Throwable -> L8c
            r3 = 0
            if (r2 == 0) goto L2f
            com.tencent.mm.plugin.sns.storage.ADXml r2 = r2.getAdXml()     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L2f
            s34.a1 r2 = r2.adSliderFullCardInfo     // Catch: java.lang.Throwable -> L8c
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 != 0) goto L36
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> L8c
            return
        L36:
            java.util.List<s34.x0> r4 = r2.resInfoList     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L43
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L41
            goto L43
        L41:
            r4 = 0
            goto L44
        L43:
            r4 = 1
        L44:
            if (r4 == 0) goto L4a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> L8c
            return
        L4a:
            java.util.List<s34.x0> r2 = r2.resInfoList     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L8c
            s34.x0 r2 = (s34.x0) r2     // Catch: java.lang.Throwable -> L8c
            if (r2 != 0) goto L58
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> L8c
            return
        L58:
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo r2 = r2.clickActionInfo     // Catch: java.lang.Throwable -> L8c
            if (r2 != 0) goto L60
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch: java.lang.Throwable -> L8c
            return
        L60:
            r4 = 3
            r2.f162569a = r4     // Catch: java.lang.Throwable -> L8c
            w64.n r4 = r6.A     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L6c
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r6.f352587r     // Catch: java.lang.Throwable -> L8c
            r4.o(r2, r5, r7)     // Catch: java.lang.Throwable -> L8c
        L6c:
            w64.n r2 = r6.A     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L84
            p74.q r4 = r6.f352586q     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L81
            java.lang.String r3 = "getRecyclerViewLayout"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)     // Catch: java.lang.Throwable -> L8c
            android.widget.FrameLayout r4 = r4.E0     // Catch: java.lang.Throwable -> L8c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)     // Catch: java.lang.Throwable -> L8c
            r3 = r4
        L81:
            r2.k(r3)     // Catch: java.lang.Throwable -> L8c
        L84:
            q74.b0 r2 = r6.f352592w     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto La5
            r2.g(r7)     // Catch: java.lang.Throwable -> L8c
            goto La5
        L8c:
            r7 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onItemClick error: "
            r2.<init>(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            java.lang.String r2 = "SnsAd.AdSlideCardTimelineItem"
            com.tencent.mars.xlog.Log.e(r2, r7)
        La5:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p74.t.I(int):void");
    }

    public final void J(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        p74.w wVar = this.f352591v;
        if (wVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            wVar.f352611e = false;
            z74.i iVar = wVar.f352607a;
            if (iVar != null) {
                iVar.d();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
        }
        if (cardLayoutManager != null) {
            cardLayoutManager.o();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
    }

    @Override // z84.i
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        I(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
    }

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        try {
            xd4.o0.d().j();
            xd4.g.a().d(this);
            p74.w wVar = this.f352591v;
            if (wVar != null) {
                wVar.l(this.f352589t);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardTimelineItem", "play error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        java.lang.String uxinfo;
        java.lang.Integer num;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        try {
            q74.b0 b0Var = this.f352592w;
            if (b0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCurrentIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                b0Var.f360417j = -1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCurrentIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
            J(this.f352589t);
            java.lang.String T = ca4.z0.T(this.f352587r);
            if (!android.text.TextUtils.isEmpty(T) && kotlin.jvm.internal.o.b(T, str)) {
                a84.t0.a(this.f352592w);
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f352587r;
            if (snsInfo != null && (uxinfo = snsInfo.getUxinfo()) != null) {
                q74.b0 b0Var2 = this.f352592w;
                if (b0Var2 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getManualSlideCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                    int i17 = b0Var2.f360416i;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getManualSlideCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                    num = java.lang.Integer.valueOf(i17);
                } else {
                    num = null;
                }
                a84.t0.a(new ca4.a(uxinfo, 1, 1569, null, num, 8, null));
            }
            z74.i iVar = this.f352590u;
            if (iVar != null) {
                iVar.j();
            }
            p74.q qVar = this.f352586q;
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView b17 = qVar != null ? qVar.b() : null;
            int totalTouchDuration = b17 != null ? (int) b17.getTotalTouchDuration() : 0;
            int totalTouchCount = b17 != null ? b17.getTotalTouchCount() : 0;
            if (b17 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
                com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardRecyclerView", "reset");
                b17.f163206b2 = 0L;
                b17.f163208d2 = 0L;
                b17.f163207c2 = 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView");
            }
            a84.t0.a(new q74.v(this.f352587r, 1, totalTouchDuration, totalTouchCount, false));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardTimelineItem", "onAdRemoved error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        try {
            J(this.f352589t);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardTimelineItem", "onUIPause error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        try {
            p74.q qVar = this.f352586q;
            if (qVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecyclerViewLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
                android.widget.FrameLayout frameLayout = qVar.E0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecyclerViewLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
                if (frameLayout != null) {
                    int[] iArr = new int[2];
                    frameLayout.getLocationOnScreen(iArr);
                    int i17 = iArr[0];
                    android.graphics.Rect rect = new android.graphics.Rect(i17, iArr[1], frameLayout.getWidth() + i17, iArr[1] + frameLayout.getHeight());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
                    return rect;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardTimelineItem", "getDisplayRect error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        return null;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        if (!(baseViewHolder instanceof p74.q)) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardTimelineItem", "buildContent::the holder is not type of AdSlideCardItemViewHolder!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
            return;
        }
        this.f352586q = (p74.q) baseViewHolder;
        try {
            android.view.ViewStub r17 = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder);
            if (r17 != null) {
                r17.setLayoutResource(com.tencent.mm.R.layout.eon);
                if (!((p74.q) baseViewHolder).f169290q) {
                    android.view.View inflate = r17.inflate();
                    kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
                    ((p74.q) baseViewHolder).D0 = (android.view.ViewGroup) inflate;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
                    ((p74.q) baseViewHolder).f169290q = true;
                }
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null && !((p74.q) baseViewHolder).f169290q) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((p74.q) baseViewHolder).f169272h.findViewById(com.tencent.mm.R.id.v7p);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
                ((p74.q) baseViewHolder).D0 = viewGroup;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem$AdSlideCardItemViewHolder");
                ((p74.q) baseViewHolder).f169290q = true;
            }
            this.f352592w = new q74.b0(1);
            G((p74.q) baseViewHolder);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardTimelineItem", "buildContent error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (kotlin.jvm.internal.o.b(r11 != null ? r11.getSnsId() : null, r2.getSnsId()) != false) goto L30;
     */
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r22, int r23, com.tencent.mm.plugin.sns.ui.ns r24, com.tencent.mm.protocal.protobuf.TimeLineObject r25, int r26, com.tencent.mm.plugin.sns.ui.bs r27) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p74.t.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        try {
            J(this.f352589t);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardTimelineItem", "pause error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        try {
            z74.i iVar = this.f352590u;
            if (iVar != null) {
                iVar.j();
            }
            p74.w wVar = this.f352591v;
            if (wVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                wVar.f352615i.removeCallbacksAndMessages(null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideCardTimelineItem", "stop error: " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardTimelineItem");
        return "AdSlideCardTimelineItem";
    }
}
