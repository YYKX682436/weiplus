package r74;

/* loaded from: classes4.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f393180a;

    /* renamed from: b, reason: collision with root package name */
    public final android.app.Activity f393181b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f393182c;

    /* renamed from: d, reason: collision with root package name */
    public final i64.b1 f393183d;

    /* renamed from: e, reason: collision with root package name */
    public final int f393184e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f393185f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f393186g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.k4 f393187h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f393188i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f393189j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f393190k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f393191l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f393192m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f393193n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f393194o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f393195p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f393196q;

    public a0(android.view.ViewGroup viewGroup, android.app.Activity mActivity, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, i64.b1 b1Var, int i17, yz5.a isForbidShowPlayBtn, yz5.a isPlayingSight, com.tencent.mm.plugin.sns.model.k4 k4Var, boolean z17) {
        kotlin.jvm.internal.o.g(mActivity, "mActivity");
        kotlin.jvm.internal.o.g(isForbidShowPlayBtn, "isForbidShowPlayBtn");
        kotlin.jvm.internal.o.g(isPlayingSight, "isPlayingSight");
        this.f393180a = viewGroup;
        this.f393181b = mActivity;
        this.f393182c = snsInfo;
        this.f393183d = b1Var;
        this.f393184e = i17;
        this.f393185f = isForbidShowPlayBtn;
        this.f393186g = isPlayingSight;
        this.f393187h = k4Var;
        this.f393188i = z17;
        this.f393189j = jz5.h.b(new r74.t(this));
        this.f393190k = jz5.h.b(new r74.m(this));
        this.f393191l = jz5.h.b(new r74.s(this));
        this.f393192m = jz5.h.b(new r74.p(this));
        this.f393193n = jz5.h.b(new r74.q(this));
        this.f393194o = jz5.h.b(new r74.r(this));
        this.f393195p = jz5.h.b(r74.n.f393226d);
        this.f393196q = jz5.h.b(new r74.o(this));
    }

    public static final android.view.ViewGroup a(r74.a0 a0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMMainImageContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        a0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMainImageContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) a0Var.f393193n).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMainImageContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMMainImageContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return viewGroup;
    }

    public final int b(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        int i17 = (timeLineObject == null || (a90Var = timeLineObject.ContentObj) == null) ? 0 : a90Var.f369837e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentStyle", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return i17;
    }

    public final int c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDp", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        int b17 = i65.a.b(this.f393181b, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDp", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return b17;
    }

    public final boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMIsLoadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) this.f393195p).getValue()).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMIsLoadBigImage", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return booleanValue;
    }

    public final java.util.List e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMListOfSubImages", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        java.util.List list = (java.util.List) ((jz5.n) this.f393196q).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMListOfSubImages", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return list;
    }

    public final android.widget.ImageView f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMainImage", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f393192m).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMainImage", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return imageView;
    }

    public final android.widget.ImageView g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMainWeAppIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f393194o).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMainWeAppIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return imageView;
    }

    public final android.view.ViewGroup h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f393191l).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMVideoContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return viewGroup;
    }

    public final android.widget.ImageView i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMVideoStatusIV", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.f393189j).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMVideoStatusIV", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return imageView;
    }

    public final android.view.ViewGroup j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRootContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        return this.f393180a;
    }

    public final void k(com.tencent.mm.plugin.sns.storage.m0 adCombinedGridInfo, yz5.l resetAdDownloadUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUILayout", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        kotlin.jvm.internal.o.g(adCombinedGridInfo, "adCombinedGridInfo");
        kotlin.jvm.internal.o.g(resetAdDownloadUI, "resetAdDownloadUI");
        int c17 = c(75);
        int c18 = c(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR);
        int c19 = c(132);
        boolean z17 = this.f393188i;
        if (z17) {
            c17 = c(130);
            c18 = c(396);
            c19 = c(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT);
        } else if (adCombinedGridInfo.b() == 1) {
            c17 = c(80);
            c18 = c(248);
            c19 = c(140);
        }
        android.view.ViewGroup viewGroup = this.f393180a;
        int width = viewGroup != null ? viewGroup.getWidth() : 0;
        if (width == 0 || width >= c18) {
            resetAdDownloadUI.invoke(java.lang.Integer.valueOf(c18));
            com.tencent.mars.xlog.Log.i("AdCombineGridCardViewLogic", "resetUILayout: imageVideoContainerW = " + c18 + "  imageWH = " + c17);
            android.view.View findViewById = viewGroup != null ? viewGroup.findViewById(com.tencent.mm.R.id.f486995n45) : null;
            android.view.ViewGroup.LayoutParams layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.height = c19;
            }
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById != null ? findViewById.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.width = c18;
            }
            if (findViewById != null) {
                findViewById.requestLayout();
            }
            int c27 = z17 ? c(3) : c(4);
            if (e().size() >= 3) {
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) e().get(0);
                android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
                if (layoutParams3 != null) {
                    layoutParams3.height = c17;
                }
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) e().get(0);
                android.view.ViewGroup.LayoutParams layoutParams4 = viewGroup3 != null ? viewGroup3.getLayoutParams() : null;
                if (layoutParams4 != null) {
                    layoutParams4.width = c17;
                }
                android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) e().get(0);
                android.view.ViewGroup.LayoutParams layoutParams5 = viewGroup4 != null ? viewGroup4.getLayoutParams() : null;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams5 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = c19 + c27;
                }
                android.view.ViewGroup viewGroup5 = (android.view.ViewGroup) e().get(0);
                if (viewGroup5 != null) {
                    viewGroup5.requestLayout();
                }
                android.view.ViewGroup viewGroup6 = (android.view.ViewGroup) e().get(1);
                android.view.ViewGroup.LayoutParams layoutParams6 = viewGroup6 != null ? viewGroup6.getLayoutParams() : null;
                if (layoutParams6 != null) {
                    layoutParams6.height = c17;
                }
                android.view.ViewGroup viewGroup7 = (android.view.ViewGroup) e().get(1);
                android.view.ViewGroup.LayoutParams layoutParams7 = viewGroup7 != null ? viewGroup7.getLayoutParams() : null;
                if (layoutParams7 != null) {
                    layoutParams7.width = c17;
                }
                android.view.ViewGroup viewGroup8 = (android.view.ViewGroup) e().get(1);
                android.view.ViewGroup.LayoutParams layoutParams8 = viewGroup8 != null ? viewGroup8.getLayoutParams() : null;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams8 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams8 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = c19 + c27;
                }
                android.view.ViewGroup viewGroup9 = (android.view.ViewGroup) e().get(1);
                android.view.ViewGroup.LayoutParams layoutParams9 = viewGroup9 != null ? viewGroup9.getLayoutParams() : null;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams9 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams9 : null;
                if (marginLayoutParams3 != null) {
                    marginLayoutParams3.leftMargin = c17 + c27;
                }
                android.view.ViewGroup viewGroup10 = (android.view.ViewGroup) e().get(1);
                if (viewGroup10 != null) {
                    viewGroup10.requestLayout();
                }
                android.view.ViewGroup viewGroup11 = (android.view.ViewGroup) e().get(2);
                android.view.ViewGroup.LayoutParams layoutParams10 = viewGroup11 != null ? viewGroup11.getLayoutParams() : null;
                if (layoutParams10 != null) {
                    layoutParams10.height = c17;
                }
                android.view.ViewGroup viewGroup12 = (android.view.ViewGroup) e().get(2);
                android.view.ViewGroup.LayoutParams layoutParams11 = viewGroup12 != null ? viewGroup12.getLayoutParams() : null;
                if (layoutParams11 != null) {
                    layoutParams11.width = c17;
                }
                android.view.ViewGroup viewGroup13 = (android.view.ViewGroup) e().get(2);
                android.view.ViewGroup.LayoutParams layoutParams12 = viewGroup13 != null ? viewGroup13.getLayoutParams() : null;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams12 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams12 : null;
                if (marginLayoutParams4 != null) {
                    marginLayoutParams4.topMargin = c19 + c27;
                }
                android.view.ViewGroup viewGroup14 = (android.view.ViewGroup) e().get(2);
                java.lang.Object layoutParams13 = viewGroup14 != null ? viewGroup14.getLayoutParams() : null;
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams13 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams13 : null;
                if (marginLayoutParams5 != null) {
                    marginLayoutParams5.leftMargin = (c17 * 2) + (c27 * 2);
                }
                android.view.ViewGroup viewGroup15 = (android.view.ViewGroup) e().get(2);
                if (viewGroup15 != null) {
                    viewGroup15.requestLayout();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUILayout", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUILayoutAutoSize", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        int i17 = (int) ((width * 132.0f) / 233.0f);
        int c28 = (int) ((width - (c(4) * 2)) / 3.0f);
        com.tencent.mars.xlog.Log.i("AdCombineGridCardViewLogic", "resetUILayoutAutoSize: containerWidth = " + width + "  imageWH = " + c28);
        android.view.View findViewById2 = viewGroup != null ? viewGroup.findViewById(com.tencent.mm.R.id.f486995n45) : null;
        android.view.ViewGroup.LayoutParams layoutParams14 = findViewById2 != null ? findViewById2.getLayoutParams() : null;
        if (layoutParams14 != null) {
            layoutParams14.height = i17;
        }
        android.view.ViewGroup.LayoutParams layoutParams15 = findViewById2 != null ? findViewById2.getLayoutParams() : null;
        if (layoutParams15 != null) {
            layoutParams15.width = width;
        }
        if (findViewById2 != null) {
            findViewById2.requestLayout();
        }
        if (e().size() >= 3) {
            android.view.ViewGroup viewGroup16 = (android.view.ViewGroup) e().get(0);
            android.view.ViewGroup.LayoutParams layoutParams16 = viewGroup16 != null ? viewGroup16.getLayoutParams() : null;
            if (layoutParams16 != null) {
                layoutParams16.height = c28;
            }
            android.view.ViewGroup viewGroup17 = (android.view.ViewGroup) e().get(0);
            android.view.ViewGroup.LayoutParams layoutParams17 = viewGroup17 != null ? viewGroup17.getLayoutParams() : null;
            if (layoutParams17 != null) {
                layoutParams17.width = c28;
            }
            android.view.ViewGroup viewGroup18 = (android.view.ViewGroup) e().get(0);
            android.view.ViewGroup.LayoutParams layoutParams18 = viewGroup18 != null ? viewGroup18.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams18 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams18 : null;
            if (marginLayoutParams6 != null) {
                marginLayoutParams6.topMargin = c(4) + i17;
            }
            android.view.ViewGroup viewGroup19 = (android.view.ViewGroup) e().get(0);
            if (viewGroup19 != null) {
                viewGroup19.requestLayout();
            }
            android.view.ViewGroup viewGroup20 = (android.view.ViewGroup) e().get(1);
            android.view.ViewGroup.LayoutParams layoutParams19 = viewGroup20 != null ? viewGroup20.getLayoutParams() : null;
            if (layoutParams19 != null) {
                layoutParams19.height = c28;
            }
            android.view.ViewGroup viewGroup21 = (android.view.ViewGroup) e().get(1);
            android.view.ViewGroup.LayoutParams layoutParams20 = viewGroup21 != null ? viewGroup21.getLayoutParams() : null;
            if (layoutParams20 != null) {
                layoutParams20.width = c28;
            }
            android.view.ViewGroup viewGroup22 = (android.view.ViewGroup) e().get(1);
            android.view.ViewGroup.LayoutParams layoutParams21 = viewGroup22 != null ? viewGroup22.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams21 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams21 : null;
            if (marginLayoutParams7 != null) {
                marginLayoutParams7.topMargin = c(4) + i17;
            }
            android.view.ViewGroup viewGroup23 = (android.view.ViewGroup) e().get(1);
            android.view.ViewGroup.LayoutParams layoutParams22 = viewGroup23 != null ? viewGroup23.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams22 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams22 : null;
            if (marginLayoutParams8 != null) {
                marginLayoutParams8.leftMargin = c(4) + c28;
            }
            android.view.ViewGroup viewGroup24 = (android.view.ViewGroup) e().get(1);
            if (viewGroup24 != null) {
                viewGroup24.requestLayout();
            }
            android.view.ViewGroup viewGroup25 = (android.view.ViewGroup) e().get(2);
            android.view.ViewGroup.LayoutParams layoutParams23 = viewGroup25 != null ? viewGroup25.getLayoutParams() : null;
            if (layoutParams23 != null) {
                layoutParams23.height = c28;
            }
            android.view.ViewGroup viewGroup26 = (android.view.ViewGroup) e().get(2);
            android.view.ViewGroup.LayoutParams layoutParams24 = viewGroup26 != null ? viewGroup26.getLayoutParams() : null;
            if (layoutParams24 != null) {
                layoutParams24.width = c28;
            }
            android.view.ViewGroup viewGroup27 = (android.view.ViewGroup) e().get(2);
            android.view.ViewGroup.LayoutParams layoutParams25 = viewGroup27 != null ? viewGroup27.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams25 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams25 : null;
            if (marginLayoutParams9 != null) {
                marginLayoutParams9.topMargin = i17 + c(4);
            }
            android.view.ViewGroup viewGroup28 = (android.view.ViewGroup) e().get(2);
            java.lang.Object layoutParams26 = viewGroup28 != null ? viewGroup28.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams26 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams26 : null;
            if (marginLayoutParams10 != null) {
                marginLayoutParams10.leftMargin = (c28 * 2) + (c(4) * 2);
            }
            android.view.ViewGroup viewGroup29 = (android.view.ViewGroup) e().get(2);
            if (viewGroup29 != null) {
                viewGroup29.requestLayout();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUILayoutAutoSize", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        resetAdDownloadUI.invoke(java.lang.Integer.valueOf(width));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUILayout", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(com.tencent.mm.plugin.sns.storage.m0 r40, java.lang.Integer r41, com.tencent.mm.plugin.sns.storage.SnsInfo r42, r45.jj4 r43, com.tencent.mm.protocal.protobuf.TimeLineObject r44, java.lang.String r45, com.tencent.mm.plugin.sns.ui.jw r46, n74.j1 r47) {
        /*
            Method dump skipped, instructions count: 1251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r74.a0.l(com.tencent.mm.plugin.sns.storage.m0, java.lang.Integer, com.tencent.mm.plugin.sns.storage.SnsInfo, r45.jj4, com.tencent.mm.protocal.protobuf.TimeLineObject, java.lang.String, com.tencent.mm.plugin.sns.ui.jw, n74.j1):void");
    }

    public final void m(r74.l playModel) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateVideoUIModel", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        kotlin.jvm.internal.o.g(playModel, "playModel");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        jz5.g gVar = this.f393190k;
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.ImageView i17 = i();
        if (i17 != null) {
            i17.setVisibility(8);
        }
        android.widget.ImageView i18 = i();
        android.app.Activity activity = this.f393181b;
        if (i18 != null) {
            i18.setContentDescription(activity.getString(com.tencent.mm.R.string.hjf));
        }
        int ordinal = playModel.ordinal();
        if (ordinal == 2) {
            android.widget.ImageView i19 = i();
            if (i19 != null) {
                i19.setImageResource(com.tencent.mm.R.raw.shortvideo_play_icon_err);
            }
            android.widget.ImageView i27 = i();
            if (i27 != null) {
                i27.setVisibility(0);
            }
        } else if (ordinal == 3) {
            android.widget.ImageView i28 = i();
            if (i28 != null) {
                i28.setImageDrawable(i65.a.i(activity, com.tencent.mm.R.raw.shortvideo_play_btn));
            }
            android.widget.ImageView i29 = i();
            if (i29 != null) {
                i29.setVisibility(0);
            }
        } else if (ordinal == 4) {
            android.widget.ImageView i37 = i();
            if (i37 != null) {
                i37.setImageDrawable(i65.a.i(activity, com.tencent.mm.R.raw.shortvideo_play_btn));
            }
            android.widget.ImageView i38 = i();
            if (i38 != null) {
                i38.setVisibility(0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) gVar).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMErrorTv", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateVideoUIModel", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic");
    }
}
