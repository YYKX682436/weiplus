package q74;

/* loaded from: classes4.dex */
public class x0 extends androidx.recyclerview.widget.f2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f360559d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f360560e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f360561f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f360562g;

    /* renamed from: h, reason: collision with root package name */
    public z84.i f360563h;

    /* renamed from: i, reason: collision with root package name */
    public z84.h f360564i;

    /* renamed from: m, reason: collision with root package name */
    public final w64.n f360565m;

    /* renamed from: n, reason: collision with root package name */
    public int f360566n;

    /* renamed from: o, reason: collision with root package name */
    public int f360567o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f360568p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f360569q = false;

    public x0(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, w64.n nVar) {
        this.f360568p = false;
        if (recyclerView != null) {
            this.f360559d = recyclerView;
            this.f360561f = recyclerView.getContext();
        } else {
            this.f360561f = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        this.f360565m = nVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        if (snsInfo != null) {
            if (snsInfo.getAdXml() != null) {
                com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
                s34.a1 a1Var = adXml.adSliderFullCardInfo;
                if (a1Var != null && !a84.b0.b(a1Var.resInfoList)) {
                    this.f360560e = snsInfo;
                    this.f360562g = adXml.adSliderFullCardInfo.resInfoList;
                    if (s34.z0.d(snsInfo)) {
                        this.f360568p = this.f360560e.getAdXml().adSliderFullCardInfo.f402569f.a();
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                    return;
                }
                com.tencent.mars.xlog.Log.w("SnsAd.SlideFullCardRecyclerViewAdapter", "the adSliderFullCardInfo or resource info list is null, initialize adapter failed!!!");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("SnsAd.SlideFullCardRecyclerViewAdapter", "the sns info is null, initialize adapter failed!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initializeAdapterData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    public static void x(q74.x0 x0Var, java.util.ArrayList arrayList, float f17) {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        x0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardBottomBarLayoutAlpha", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        if (a84.b0.b(arrayList)) {
            com.tencent.mars.xlog.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "setCardBottomBarLayoutAlpha, viewHolders is null or empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardBottomBarLayoutAlpha", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        } else {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
                if ((k3Var instanceof q74.y0) && (viewGroup = ((q74.y0) k3Var).f360576i) != null) {
                    viewGroup.setAlpha(f17);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardBottomBarLayoutAlpha", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    public s34.x0 B(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        try {
            java.util.List list = this.f360562g;
            if (list != null && i17 >= 0 && i17 < list.size()) {
                s34.x0 x0Var = (s34.x0) this.f360562g.get(i17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                return x0Var;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("SnsAd.SlideFullCardRecyclerViewAdapter", "the getResInfo has something wrong " + th6.getMessage());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getResInfo", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(q74.y0 r21, s34.x0 r22) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q74.x0.E(q74.y0, s34.x0):void");
    }

    public void I(q74.y0 y0Var, s34.x0 x0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        q74.t0.g(y0Var.f360571d, x0Var.backBorderImage);
        q74.t0.g(y0Var.f360573f, x0Var.frontBorderImage);
        if (x0Var.a()) {
            com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardRecyclerViewAdapter", "the resInfo is sight");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            r45.jj4 jj4Var = x0Var.f402828e;
            if (jj4Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            } else {
                m44.a.g(jj4Var);
                l44.c0.b(this.f360560e, x0Var.f402828e);
                com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
                r45.jj4 jj4Var2 = x0Var.f402828e;
                android.widget.ImageView imageView = y0Var.f360574g;
                int hashCode = this.f360561f.hashCode();
                com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195308l;
                s7Var.f195313b = this.f360560e.getTimeLine().CreateTime;
                hj6.l0(jj4Var2, imageView, -1, hashCode, s7Var);
                a84.y0.p(y0Var.f360575h, true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processSight", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            }
        } else {
            java.lang.String str = x0Var.f402828e.f377860i;
            com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardRecyclerViewAdapter", "processCardContent, the resInfo is img, thumbUrl is " + str);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                java.lang.String l17 = za4.t0.l("adId", str);
                m44.a.d(str);
                android.widget.ImageView imageView2 = y0Var.f360574g;
                imageView2.setTag(com.tencent.mm.R.id.nae, str);
                if (com.tencent.mm.vfs.w6.j(l17)) {
                    n74.a2.c(imageView2, l17, 0);
                } else {
                    n74.a2.a(imageView2, str, 0);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processCardContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    public final void J(android.widget.ImageView imageView, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(str, null);
        if (J2 == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "onDownloaded, bitmap == null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(J2);
        f3.b.g(bitmapDrawable, this.f360561f.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_9));
        imageView.setImageDrawable(bitmapDrawable);
        a84.y0.p(imageView, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        java.util.List list = this.f360562g;
        if (list == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return 0;
        }
        int size = list.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        long j17 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        return j17;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        s34.x0 B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        q74.y0 y0Var = (q74.y0) k3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        try {
            B = B(i17);
        } catch (java.lang.Throwable unused) {
        }
        if (B != null && y0Var != null) {
            y0Var.i(i17);
            q74.t0.b(y0Var, this.f360566n, this.f360567o);
            E(y0Var, B);
            I(y0Var, B);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        }
        com.tencent.mars.xlog.Log.w("SnsAd.SlideFullCardRecyclerViewAdapter", "the res info or recyclerView is null!!!!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        z84.i iVar;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            iVar = this.f360563h;
            recyclerView = this.f360559d;
        } catch (java.lang.Throwable unused) {
        }
        if (view == null || recyclerView == null || iVar == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.SlideFullCardRecyclerViewAdapter", "the recycler view or click listener is null!!!");
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        } else {
            if (view.getParent() != recyclerView) {
                com.tencent.mars.xlog.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "are you cray?!! the parent of the clicked view is not same as the input recycler view!!");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                return;
            }
            androidx.recyclerview.widget.k3 w07 = recyclerView.w0(view);
            if (w07 == null) {
                com.tencent.mars.xlog.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "I think the statement can't be reached, why?");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            } else {
                iVar.b(recyclerView, view, w07.getAdapterPosition());
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/SlideFullCardRecyclerViewAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            }
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        q74.y0 y0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        try {
            viewGroup.getWidth();
            android.view.View g17 = a84.y0.g(this.f360561f, com.tencent.mm.R.layout.cqb, viewGroup, false);
            if (g17 != null) {
                g17.setOnClickListener(this);
                y0Var = new q74.y0(g17, new q74.w0(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            } else {
                com.tencent.mars.xlog.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "the inflated view is null????");
                q74.y0 y0Var2 = new q74.y0(new android.view.View(viewGroup.getContext()), new q74.w0(this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
                y0Var = y0Var2;
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "onCreateViewHolder failed????");
            y0Var = new q74.y0(new android.view.View(com.tencent.mm.sdk.platformtools.x2.f193071a), new q74.w0(this));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        return y0Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        q74.y0 y0Var = (q74.y0) k3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        super.onViewDetachedFromWindow(y0Var);
        try {
            y0Var.getAdapterPosition();
            a84.y0.c(y0Var.f360575h);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    public void y(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcItemMaterialSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.e("SnsAd.SlideFullCardRecyclerViewAdapter", "calcItemMaterialSize, adDisplayWidth <= 0");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcItemMaterialSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        int b17 = i17 - i65.a.b(this.f360561f, 40);
        this.f360566n = b17;
        double d17 = (b17 * 3.0d) / 4.0d;
        this.f360567o = (int) java.lang.Math.ceil(d17);
        com.tencent.mars.xlog.Log.i("SnsAd.SlideFullCardRecyclerViewAdapter", "calcItemMaterialSize, mItemMaterialWidth is " + this.f360566n + ", realInnerItemHeight is " + d17 + ", mItemMaterialHeight is " + this.f360567o);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcItemMaterialSize", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }

    public void z(android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        s34.d1 d1Var;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
        if (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adSliderFullCardInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        s34.a1 a1Var = snsInfo.getAdXml().adSliderFullCardInfo;
        java.util.List<s34.x0> list = a1Var.resInfoList;
        if (list == null || list.size() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        s34.x0 x0Var = a1Var.resInfoList.get(i17);
        if (x0Var == null || (d1Var = x0Var.buttonInfo) == null || (adClickActionInfo = d1Var.btnClickActionInfo) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
            return;
        }
        z84.h hVar = this.f360564i;
        if (hVar != null) {
            hVar.a(view, i17);
        }
        int a17 = a1Var.a(i17);
        w64.n nVar = this.f360565m;
        nVar.o(adClickActionInfo, snsInfo, a17);
        nVar.k(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter");
    }
}
