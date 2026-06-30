package com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardTimelineItem;", "Lcom/tencent/mm/plugin/sns/ui/item/BaseTimeLineItem;", "Lxd4/d;", "Li64/k0;", "Landroidx/lifecycle/x;", "Lcom/tencent/mm/plugin/sns/ui/y4;", "Ljz5/f0;", "onUIDestroy", "<init>", "()V", "v74/n", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class AdLookbookCardTimelineItem extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem implements xd4.d, i64.k0, androidx.lifecycle.x, com.tencent.mm.plugin.sns.ui.y4 {

    /* renamed from: q, reason: collision with root package name */
    public v74.n f163236q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f163237r;

    /* renamed from: t, reason: collision with root package name */
    public k84.e6 f163239t;

    /* renamed from: u, reason: collision with root package name */
    public w64.n f163240u;

    /* renamed from: v, reason: collision with root package name */
    public int f163241v;

    /* renamed from: s, reason: collision with root package name */
    public final v74.k0 f163238s = new v74.k0(0);

    /* renamed from: w, reason: collision with root package name */
    public final v74.o f163242w = new v74.o(this);

    public final void F(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        com.tencent.mars.xlog.Log.i("AdLookbookCardTimelineItem", "adjustContentContainerLayout, w=" + i17);
        v74.r rVar = v74.k0.E;
        v74.n nVar = this.f163236q;
        android.view.ViewGroup c17 = nVar != null ? nVar.c() : null;
        v74.n nVar2 = this.f163236q;
        android.view.ViewGroup viewGroup = nVar2 != null ? nVar2.f169279k0 : null;
        android.view.ViewGroup viewGroup2 = nVar2 != null ? nVar2.f169281l0 : null;
        android.view.View view = nVar2 != null ? nVar2.f169277j0 : null;
        rVar.a(c17, viewGroup, viewGroup2, view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null, i17, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.y4
    public void F3() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        this.f163238s.j();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollIdle", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    public final void G(boolean z17) {
        android.view.View b17;
        int parseColor;
        int parseColor2;
        android.view.View b18;
        android.view.View b19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEdgeMaskViewVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        com.tencent.mars.xlog.Log.i("AdLookbookCardTimelineItem", "setEdgeMaskViewVisibility, visible=" + z17);
        v74.n nVar = this.f163236q;
        java.lang.Integer valueOf = (nVar == null || (b19 = nVar.b()) == null) ? null : java.lang.Integer.valueOf(b19.getVisibility());
        if (z17) {
            if (valueOf == null || valueOf.intValue() != 0) {
                v74.n nVar2 = this.f163236q;
                android.view.View b27 = nVar2 != null ? nVar2.b() : null;
                if (b27 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(b27, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardTimelineItem", "setEdgeMaskViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    b27.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(b27, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardTimelineItem", "setEdgeMaskViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                v74.n nVar3 = this.f163236q;
                if (((nVar3 == null || (b18 = nVar3.b()) == null) ? null : b18.getBackground()) == null) {
                    v74.n nVar4 = this.f163236q;
                    b17 = nVar4 != null ? nVar4.b() : null;
                    if (b17 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaskBackground", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
                        if (com.tencent.mm.ui.bk.C()) {
                            parseColor = android.graphics.Color.parseColor("#00191919");
                            parseColor2 = android.graphics.Color.parseColor("#FF191919");
                        } else {
                            parseColor = android.graphics.Color.parseColor("#00FFFFFF");
                            parseColor2 = android.graphics.Color.parseColor("#FFFFFFFF");
                        }
                        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[]{parseColor, parseColor2});
                        gradientDrawable.setGradientType(0);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaskBackground", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
                        b17.setBackground(gradientDrawable);
                    }
                }
            }
        } else if (valueOf == null || valueOf.intValue() != 8) {
            v74.n nVar5 = this.f163236q;
            b17 = nVar5 != null ? nVar5.b() : null;
            if (b17 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardTimelineItem", "setEdgeMaskViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(b17, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardTimelineItem", "setEdgeMaskViewVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEdgeMaskViewVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        hashCode();
        xd4.o0.d().j();
        xd4.g.a().d(this);
        this.f163238s.o();
        k84.e6 e6Var = this.f163239t;
        if (e6Var != null) {
            e6Var.c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        java.lang.String T = ca4.z0.T(this.f163237r);
        com.tencent.mars.xlog.Log.i("AdLookbookCardTimelineItem", "onAdRemoved, curSnsId=" + T + ", paramSnsId=" + str);
        if ((T == null || T.length() == 0) || !T.equals(str)) {
            ca4.q.c("lookbookAd onAdRemoved adChanged", new java.lang.RuntimeException("adChanged"));
            com.tencent.mars.xlog.Log.e("AdLookbookCardTimelineItem", "onAdRemoved, ad changed with no remove");
        } else {
            this.f163238s.f();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        hashCode();
        v74.k0 k0Var = this.f163238s;
        k0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k0Var.l(false);
        v74.s0 s0Var = k0Var.f433849o;
        if (s0Var != null) {
            s0Var.d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k84.e6 e6Var = this.f163239t;
        if (e6Var != null) {
            e6Var.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        android.view.ViewGroup c17;
        android.view.ViewGroup c18;
        android.view.ViewGroup c19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        int[] iArr = new int[2];
        v74.n nVar = this.f163236q;
        if (nVar != null && (c19 = nVar.c()) != null) {
            c19.getLocationOnScreen(iArr);
        }
        int i17 = 0;
        int i18 = iArr[0];
        int i19 = iArr[1];
        v74.n nVar2 = this.f163236q;
        int width = (nVar2 == null || (c18 = nVar2.c()) == null) ? 0 : c18.getWidth();
        v74.n nVar3 = this.f163236q;
        if (nVar3 != null && (c17 = nVar3.c()) != null) {
            i17 = c17.getHeight();
        }
        android.graphics.Rect rect = new android.graphics.Rect(i18, i19, width + i18, i17 + i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        return rect;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        com.tencent.mm.plugin.sns.ui.l1 l1Var2;
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        if (!(baseViewHolder instanceof v74.n)) {
            com.tencent.mars.xlog.Log.e("AdLookbookCardTimelineItem", "buildContent, holder err");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
            return;
        }
        if (this.f169249f == null) {
            com.tencent.mars.xlog.Log.e("AdLookbookCardTimelineItem", "mActivity==null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
            return;
        }
        this.f163236q = (v74.n) baseViewHolder;
        if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) != null) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.f489525cu4);
            v74.n nVar = (v74.n) baseViewHolder;
            if (!nVar.f169290q) {
                android.view.View inflate = com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRecyclerViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
                nVar.D0 = (android.view.ViewGroup) inflate;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRecyclerViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
                nVar.f169290q = true;
            }
        } else {
            v74.n nVar2 = (v74.n) baseViewHolder;
            if (!nVar2.f169290q) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) nVar2.f169272h.findViewById(com.tencent.mm.R.id.iqu);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRecyclerViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
                nVar2.D0 = viewGroup;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRecyclerViewContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
                nVar2.f169290q = true;
            }
        }
        v74.n nVar3 = (v74.n) baseViewHolder;
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView = (com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView) nVar3.f169272h.findViewById(com.tencent.mm.R.id.iqv);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRecycleview", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        nVar3.E0 = overScrollRecyclerView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRecycleview", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.view.View findViewById = nVar3.f169272h.findViewById(com.tencent.mm.R.id.iqw);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEdgeMaskView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        nVar3.F0 = findViewById;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEdgeMaskView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.view.ViewStub viewStub2 = (android.view.ViewStub) nVar3.f169272h.findViewById(com.tencent.mm.R.id.qlu);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPagAnimContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        nVar3.G0 = viewStub2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPagAnimContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.view.ViewStub viewStub3 = (android.view.ViewStub) nVar3.f169272h.findViewById(com.tencent.mm.R.id.v_f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        nVar3.H0 = viewStub3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.widget.ImageView imageView = (android.widget.ImageView) nVar3.f169272h.findViewById(com.tencent.mm.R.id.f485714rw0);
        android.content.ComponentCallbacks2 componentCallbacks2 = this.f169249f;
        androidx.lifecycle.y yVar = componentCallbacks2 instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) componentCallbacks2 : null;
        if (yVar != null && (mo133getLifecycle = yVar.mo133getLifecycle()) != null) {
            mo133getLifecycle.a(this);
        }
        v74.r rVar = v74.k0.E;
        android.app.Activity mActivity = this.f169249f;
        kotlin.jvm.internal.o.f(mActivity, "mActivity");
        v74.s b17 = rVar.b(mActivity, this.f169247d, 0);
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        boolean e17 = rVar.e(this.f169249f);
        int d17 = rVar.d(this.f169249f, this.f169247d, 0, b17, pBool);
        this.f163241v = d17;
        F(d17);
        if (pBool.value || e17) {
            G(true);
        } else {
            G(false);
        }
        com.tencent.mars.xlog.Log.i("AdLookbookCardTimelineItem", "buildContent, inLargeWindow=" + this.f169247d + ", width=" + this.f163241v + ", hash=" + hashCode());
        android.app.Activity activity = this.f169249f;
        com.tencent.mm.plugin.sns.ui.bs bsVar = this.f169251h;
        this.f163240u = new w64.n(activity, 0, (bsVar == null || (l1Var2 = bsVar.f168036b) == null) ? null : l1Var2.f169702c, null, null);
        android.app.Activity activity2 = this.f169249f;
        com.tencent.mm.plugin.sns.ui.bs bsVar2 = this.f169251h;
        i64.b1 b1Var = (bsVar2 == null || (l1Var = bsVar2.f168036b) == null) ? null : l1Var.f169702c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecycleview", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView2 = nVar3.E0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecycleview", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.view.ViewGroup c17 = nVar3.c();
        android.widget.LinearLayout linearLayout = nVar3.f169286o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPagAnimContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.view.ViewStub viewStub4 = nVar3.G0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPagAnimContainerStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        android.view.ViewStub viewStub5 = nVar3.H0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem$AdLookbookCardHolder");
        this.f163238s.g(new v74.t(activity2, b1Var, overScrollRecyclerView2, c17, linearLayout, viewStub4, imageView, viewStub5), this.f163240u, this.f163242w);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void onUIDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        hashCode();
        this.f163238s.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c  */
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r18, int r19, com.tencent.mm.plugin.sns.ui.ns r20, com.tencent.mm.protocal.protobuf.TimeLineObject r21, int r22, com.tencent.mm.plugin.sns.ui.bs r23) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        hashCode();
        v74.k0 k0Var = this.f163238s;
        k0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k0Var.f433843i = true;
        k0Var.l(true);
        v74.s0 s0Var = k0Var.f433849o;
        if (s0Var != null) {
            s0Var.d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k84.e6 e6Var = this.f163239t;
        if (e6Var != null) {
            e6Var.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        hashCode();
        v74.k0 k0Var = this.f163238s;
        k0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStopPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mars.xlog.Log.i("AdLookbookLogic", "onStopPlay");
        k0Var.f433844j.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStopPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardTimelineItem");
        return "AdLookbookCardTimelineItem";
    }
}
