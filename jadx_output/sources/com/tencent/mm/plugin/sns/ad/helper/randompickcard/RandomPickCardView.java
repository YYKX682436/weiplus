package com.tencent.mm.plugin.sns.ad.helper.randompickcard;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u0019\u0005B\u001b\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.B#\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010/\u001a\u00020\u0002¢\u0006\u0004\b-\u00100J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010(\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00061"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView;", "Landroid/widget/LinearLayout;", "", "getUnPickedCardNum", "getTotalCardNum", "Lp44/d0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOnItemClickListener", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "TAG", "e", "I", "getMContainerWidth", "()I", "setMContainerWidth", "(I)V", "mContainerWidth", "", "Lp44/c0;", "f", "Ljava/util/List;", "getMItemViewList", "()Ljava/util/List;", "setMItemViewList", "(Ljava/util/List;)V", "mItemViewList", "Lp44/u;", "g", "Lp44/u;", "getMRandomPickCardInfo", "()Lp44/u;", "setMRandomPickCardInfo", "(Lp44/u;)V", "mRandomPickCardInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class RandomPickCardView extends android.widget.LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f162713p = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public java.lang.String TAG;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int mContainerWidth;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public java.util.List mItemViewList;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public p44.u mRandomPickCardInfo;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162718h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f162719i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f162720m;

    /* renamed from: n, reason: collision with root package name */
    public final p44.f0 f162721n;

    /* renamed from: o, reason: collision with root package name */
    public p44.d0 f162722o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RandomPickCardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a(p44.c0 vh6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelAttachedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        kotlin.jvm.internal.o.g(vh6, "vh");
        android.view.View c17 = vh6.c();
        if (c17 != null) {
            p44.q.f351832a.b(c17);
        }
        android.widget.TextView g17 = vh6.g();
        if (g17 != null) {
            p44.q.f351832a.b(g17);
        }
        android.widget.ImageView d17 = vh6.d();
        if (d17 != null) {
            p44.q.f351832a.b(d17);
        }
        android.widget.ImageView a17 = vh6.a();
        if (a17 != null) {
            p44.q.f351832a.b(a17);
        }
        android.view.View c18 = vh6.c();
        if (c18 != null) {
            p44.q.f351832a.b(c18);
        }
        android.widget.ImageView b17 = vh6.b();
        if (b17 != null) {
            p44.q.f351832a.b(b17);
        }
        android.widget.ImageView e17 = vh6.e();
        if (e17 != null) {
            p44.q.f351832a.b(e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelAttachedAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
    }

    public abstract void b();

    public final void c(p44.c0 c0Var, int i17, p44.s sVar, p44.u uVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commonInitItem", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        c0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPosition", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
        c0Var.f351782h = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPosition", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
        java.lang.String b17 = sVar.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
        c0Var.f351783i = b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardId", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItemData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
        c0Var.f351784j = sVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItemData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
        android.view.View j17 = c0Var.j();
        if (j17 != null) {
            j17.setTag(c0Var);
        }
        sVar.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commonInitItem", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
    }

    public final p44.s d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("findClickItem", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        for (p44.c0 c0Var : this.mItemViewList) {
            if (c0Var.i() == i17) {
                p44.s h17 = c0Var.h();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findClickItem", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
                return h17;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("findClickItem", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        return null;
    }

    public final float e(p44.c0 c0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShadowInitAlpha", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        if (!f()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShadowInitAlpha", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            return 0.0f;
        }
        p44.s h17 = c0Var.h();
        boolean z17 = false;
        if (h17 != null && h17.g()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShadowInitAlpha", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            return 0.0f;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShadowInitAlpha", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        return 1.0f;
    }

    public final boolean f() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasPickedCard", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        java.util.Iterator it = this.mItemViewList.iterator();
        do {
            z17 = false;
            if (!it.hasNext()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasPickedCard", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
                return false;
            }
            p44.s h17 = ((p44.c0) it.next()).h();
            if (h17 != null && h17.g()) {
                z17 = true;
            }
        } while (!z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasPickedCard", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        return true;
    }

    public final void g(java.lang.String str, p44.u uVar, int i17) {
        java.lang.String str2;
        java.util.Iterator it;
        int i18;
        int i19;
        java.lang.String str3 = "initData";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        com.tencent.mars.xlog.Log.i(this.TAG, "initData, pageId=" + str + ", width=" + i17);
        if (uVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            return;
        }
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            return;
        }
        this.f162718h = str;
        this.mRandomPickCardInfo = uVar;
        p44.b0 b0Var = p44.b0.f351771a;
        java.util.List<p44.s> list = uVar.cardItemList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFromPreviewMode", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        java.lang.Boolean bool = (java.lang.Boolean) ((jz5.n) this.f162720m).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFromPreviewMode", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        this.f162719i = b0Var.f(str, list, bool);
        this.mContainerWidth = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initItemViews", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        com.tencent.mars.xlog.Log.i(this.TAG, "initItemViews");
        p44.u uVar2 = this.mRandomPickCardInfo;
        if (uVar2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initItemViews", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            str2 = "initData";
        } else {
            java.util.Iterator it6 = ((java.util.ArrayList) this.f162719i).iterator();
            boolean z17 = false;
            int i27 = 0;
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                p44.s sVar = (p44.s) next;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createCardItemView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
                p44.c0 c0Var = new p44.c0();
                android.widget.RelativeLayout relativeLayout = new android.widget.RelativeLayout(getContext());
                int k17 = k(59);
                if (relativeLayout.getLayoutParams() == null) {
                    c44.a.o();
                    relativeLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(k17, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                    layoutParams.width = k17;
                    relativeLayout.setLayoutParams(layoutParams);
                }
                c44.a.o();
                if (relativeLayout.getLayoutParams() == null) {
                    c44.a.o();
                    relativeLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                    layoutParams2.height = -2;
                    relativeLayout.setLayoutParams(layoutParams2);
                }
                relativeLayout.setClipChildren(z17);
                relativeLayout.setClipToPadding(z17);
                relativeLayout.setOnClickListener(this.f162721n);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRoot", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                c0Var.f351775a = relativeLayout;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRoot", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(relativeLayout.getContext());
                relativeLayout.addView(frameLayout);
                frameLayout.setId(com.tencent.mm.R.id.r0v);
                c44.a.l();
                if (frameLayout.getLayoutParams() == null) {
                    it = it6;
                    c44.a.o();
                    frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                } else {
                    it = it6;
                    android.view.ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                    layoutParams3.width = -1;
                    frameLayout.setLayoutParams(layoutParams3);
                }
                c44.a.o();
                if (frameLayout.getLayoutParams() == null) {
                    c44.a.o();
                    frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams4 = frameLayout.getLayoutParams();
                    layoutParams4.height = -2;
                    frameLayout.setLayoutParams(layoutParams4);
                }
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardBody", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                c0Var.f351776b = frameLayout;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardBody", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                android.widget.ImageView imageView = new android.widget.ImageView(frameLayout.getContext());
                frameLayout.addView(imageView);
                int k18 = k(59);
                if (imageView.getLayoutParams() == null) {
                    i18 = i28;
                    c44.a.o();
                    imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(k18, -2));
                } else {
                    i18 = i28;
                    android.view.ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
                    layoutParams5.width = k18;
                    imageView.setLayoutParams(layoutParams5);
                }
                int k19 = k(75);
                if (imageView.getLayoutParams() == null) {
                    c44.a.o();
                    imageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, k19));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams6 = imageView.getLayoutParams();
                    layoutParams6.height = k19;
                    imageView.setLayoutParams(layoutParams6);
                }
                int d17 = c44.a.d();
                android.view.ViewGroup.LayoutParams layoutParams7 = imageView.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams7 : null;
                if (layoutParams8 != null) {
                    layoutParams8.gravity = d17;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams9 = imageView.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams10 = layoutParams9 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams9 : null;
                    if (layoutParams10 != null) {
                        layoutParams10.gravity = d17;
                    }
                }
                imageView.setBackgroundResource(com.tencent.mm.R.drawable.crb);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackgroundMask", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                c0Var.f351777c = imageView;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackgroundMask", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                android.widget.ImageView imageView2 = new android.widget.ImageView(frameLayout.getContext());
                frameLayout.addView(imageView2);
                int k27 = k(34);
                if (imageView2.getLayoutParams() == null) {
                    c44.a.o();
                    imageView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(k27, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams11 = imageView2.getLayoutParams();
                    layoutParams11.width = k27;
                    imageView2.setLayoutParams(layoutParams11);
                }
                int k28 = k(55);
                if (imageView2.getLayoutParams() == null) {
                    c44.a.o();
                    imageView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, k28));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams12 = imageView2.getLayoutParams();
                    layoutParams12.height = k28;
                    imageView2.setLayoutParams(layoutParams12);
                }
                int d18 = c44.a.d();
                android.view.ViewGroup.LayoutParams layoutParams13 = imageView2.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams14 = layoutParams13 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams13 : null;
                if (layoutParams14 != null) {
                    layoutParams14.gravity = d18;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams15 = imageView2.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams16 = layoutParams15 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams15 : null;
                    if (layoutParams16 != null) {
                        layoutParams16.gravity = d18;
                    }
                }
                imageView2.setBackgroundResource(com.tencent.mm.R.raw.sns_ad_random_pick_card_def_bg);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardBackImage", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                c0Var.f351779e = imageView2;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardBackImage", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                android.widget.ImageView imageView3 = new android.widget.ImageView(frameLayout.getContext());
                frameLayout.addView(imageView3);
                int k29 = k(34);
                if (imageView3.getLayoutParams() == null) {
                    c44.a.o();
                    imageView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(k29, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams17 = imageView3.getLayoutParams();
                    layoutParams17.width = k29;
                    imageView3.setLayoutParams(layoutParams17);
                }
                int k37 = k(55);
                if (imageView3.getLayoutParams() == null) {
                    c44.a.o();
                    imageView3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, k37));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams18 = imageView3.getLayoutParams();
                    layoutParams18.height = k37;
                    imageView3.setLayoutParams(layoutParams18);
                }
                int d19 = c44.a.d();
                android.view.ViewGroup.LayoutParams layoutParams19 = imageView3.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams20 = layoutParams19 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams19 : null;
                if (layoutParams20 != null) {
                    layoutParams20.gravity = d19;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams21 = imageView3.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams22 = layoutParams21 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams21 : null;
                    if (layoutParams22 != null) {
                        layoutParams22.gravity = d19;
                    }
                }
                imageView3.setBackgroundResource(com.tencent.mm.R.raw.sns_ad_random_pick_card_def_fg);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardFrontImage", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                c0Var.f351778d = imageView3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardFrontImage", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                android.widget.TextView textView = new android.widget.TextView(relativeLayout.getContext());
                relativeLayout.addView(textView);
                android.view.ViewGroup.LayoutParams layoutParams23 = textView.getLayoutParams();
                android.widget.RelativeLayout.LayoutParams layoutParams24 = layoutParams23 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams23 : null;
                if (layoutParams24 != null) {
                    layoutParams24.addRule(3, com.tencent.mm.R.id.r0v);
                }
                c44.a.o();
                if (textView.getLayoutParams() == null) {
                    c44.a.o();
                    i19 = -2;
                    textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                } else {
                    i19 = -2;
                    android.view.ViewGroup.LayoutParams layoutParams25 = textView.getLayoutParams();
                    layoutParams25.width = -2;
                    textView.setLayoutParams(layoutParams25);
                }
                c44.a.o();
                if (textView.getLayoutParams() == null) {
                    c44.a.o();
                    textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i19, i19));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams26 = textView.getLayoutParams();
                    layoutParams26.height = i19;
                    textView.setLayoutParams(layoutParams26);
                }
                android.view.ViewGroup.LayoutParams layoutParams27 = textView.getLayoutParams();
                android.widget.RelativeLayout.LayoutParams layoutParams28 = layoutParams27 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams27 : null;
                if (layoutParams28 != null) {
                    layoutParams28.addRule(14, -1);
                }
                int k38 = k(-3);
                android.view.ViewGroup.LayoutParams layoutParams29 = textView.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams29 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams29 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.topMargin = k38;
                }
                java.lang.String str4 = str3;
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), k(1), textView.getPaddingBottom());
                textView.setSingleLine(true);
                textView.setTextSize(0, k(11));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardText", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                c0Var.f351780f = textView;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardText", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                android.widget.ImageView imageView4 = new android.widget.ImageView(relativeLayout.getContext());
                relativeLayout.addView(imageView4);
                android.view.ViewGroup.LayoutParams layoutParams30 = imageView4.getLayoutParams();
                android.widget.RelativeLayout.LayoutParams layoutParams31 = layoutParams30 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams30 : null;
                if (layoutParams31 != null) {
                    layoutParams31.addRule(3, com.tencent.mm.R.id.r0v);
                }
                int k39 = k(35);
                if (imageView4.getLayoutParams() == null) {
                    c44.a.o();
                    imageView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(k39, -2));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams32 = imageView4.getLayoutParams();
                    layoutParams32.width = k39;
                    imageView4.setLayoutParams(layoutParams32);
                }
                int k47 = k(6);
                if (imageView4.getLayoutParams() == null) {
                    c44.a.o();
                    imageView4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, k47));
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams33 = imageView4.getLayoutParams();
                    layoutParams33.height = k47;
                    imageView4.setLayoutParams(layoutParams33);
                }
                int k48 = k(1);
                android.view.ViewGroup.LayoutParams layoutParams34 = imageView4.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams34 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams34 : null;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.topMargin = k48;
                }
                imageView4.setPadding(imageView4.getPaddingLeft(), imageView4.getPaddingTop(), k(6), imageView4.getPaddingBottom());
                android.view.ViewGroup.LayoutParams layoutParams35 = imageView4.getLayoutParams();
                android.widget.RelativeLayout.LayoutParams layoutParams36 = layoutParams35 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams35 : null;
                if (layoutParams36 != null) {
                    layoutParams36.addRule(14, -1);
                }
                imageView4.setAlpha(0.0f);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardBottomShadow", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                c0Var.f351781g = imageView4;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardBottomShadow", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView$CardItemHolder");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createCardItemView", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
                c(c0Var, i27, sVar, uVar2);
                h(c0Var, sVar, uVar2);
                this.mItemViewList.add(c0Var);
                addView(c0Var.j());
                i27 = i18;
                z17 = false;
                it6 = it;
                str3 = str4;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initItemViews", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            str2 = str3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
    }

    public final int getMContainerWidth() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMContainerWidth", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        int i17 = this.mContainerWidth;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMContainerWidth", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        return i17;
    }

    public final java.util.List<p44.c0> getMItemViewList() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMItemViewList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        java.util.List<p44.c0> list = this.mItemViewList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMItemViewList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        return list;
    }

    public final p44.u getMRandomPickCardInfo() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMRandomPickCardInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        p44.u uVar = this.mRandomPickCardInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMRandomPickCardInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        return uVar;
    }

    public final java.lang.String getTAG() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        java.lang.String str = this.TAG;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        return str;
    }

    public final int getTotalCardNum() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalCardNum", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        int size = this.mItemViewList.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalCardNum", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        return size;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r5.g() == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getUnPickedCardNum() {
        /*
            r7 = this;
            java.lang.String r0 = "getUnPickedCardNum"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.util.List r2 = r7.mItemViewList
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        Lf:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L2f
            java.lang.Object r5 = r2.next()
            p44.c0 r5 = (p44.c0) r5
            p44.s r5 = r5.h()
            if (r5 == 0) goto L29
            boolean r5 = r5.g()
            r6 = 1
            if (r5 != r6) goto L29
            goto L2a
        L29:
            r6 = r3
        L2a:
            if (r6 != 0) goto Lf
            int r4 = r4 + 1
            goto Lf
        L2f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView.getUnPickedCardNum():int");
    }

    public abstract void h(p44.c0 c0Var, p44.s sVar, p44.u uVar);

    public final boolean i() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAllPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        java.util.Iterator it = this.mItemViewList.iterator();
        do {
            z17 = true;
            if (!it.hasNext()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAllPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
                return true;
            }
            p44.s h17 = ((p44.c0) it.next()).h();
            if (h17 == null || !h17.g()) {
                z17 = false;
            }
        } while (z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAllPicked", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        return false;
    }

    public final void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        com.tencent.mars.xlog.Log.i(this.TAG, "refresh, pageId=" + this.f162718h);
        java.lang.String str = this.f162718h;
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            return;
        }
        p44.u uVar = this.mRandomPickCardInfo;
        if (uVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            return;
        }
        p44.b0 b0Var = p44.b0.f351771a;
        java.util.List<p44.s> list = uVar.cardItemList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFromPreviewMode", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        java.lang.Boolean bool = (java.lang.Boolean) ((jz5.n) this.f162720m).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFromPreviewMode", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        java.util.List f17 = b0Var.f(str, list, bool);
        this.f162719i = f17;
        if (((java.util.ArrayList) f17).size() != this.mItemViewList.size()) {
            com.tencent.mars.xlog.Log.e(this.TAG, "refresh, size err, uiDataList.size=" + ((java.util.ArrayList) this.f162719i).size() + ", itemView.size=" + this.mItemViewList.size());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f162719i).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            p44.s sVar = (p44.s) next;
            p44.c0 c0Var = (p44.c0) this.mItemViewList.get(i17);
            c(c0Var, i17, sVar, uVar);
            h(c0Var, sVar, uVar);
            i17 = i18;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
    }

    public abstract int k(int i17);

    public void l(p44.c0 vh6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetItemForAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        kotlin.jvm.internal.o.g(vh6, "vh");
        boolean f17 = f();
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        if (f17) {
            android.widget.TextView g17 = vh6.g();
            if (g17 != null) {
                g17.setAlpha(0.0f);
            }
            android.widget.TextView g18 = vh6.g();
            if (g18 != null) {
                g18.setTranslationY(0.0f);
            }
            android.widget.ImageView d17 = vh6.d();
            if (d17 != null) {
                d17.setAlpha(e(vh6));
            }
            android.widget.ImageView a17 = vh6.a();
            if (a17 != null) {
                a17.setAlpha(0.0f);
            }
            android.widget.ImageView e17 = vh6.e();
            if (e17 != null) {
                e17.setAlpha(0.0f);
            }
            android.widget.ImageView b17 = vh6.b();
            if (b17 != null) {
                b17.setAlpha(1.0f);
            }
            android.widget.ImageView e18 = vh6.e();
            if (e18 != null) {
                e18.setRotationY(0.0f);
            }
            android.widget.ImageView b18 = vh6.b();
            if (b18 != null) {
                b18.setRotationY(0.0f);
            }
            android.view.View c17 = vh6.c();
            if (c17 != null) {
                c17.setTranslationY(0.0f);
            }
            android.view.View c18 = vh6.c();
            if (c18 != null) {
                c18.setRotation(11.0f);
            }
            android.view.View c19 = vh6.c();
            if (c19 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(valueOf);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c19, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView", "resetItemForAnim", "(Lcom/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$CardItemHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                c19.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(c19, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView", "resetItemForAnim", "(Lcom/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$CardItemHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        } else {
            android.widget.TextView g19 = vh6.g();
            if (g19 != null) {
                g19.setAlpha(1.0f);
            }
            android.widget.TextView g27 = vh6.g();
            if (g27 != null) {
                g27.setTranslationY(0.0f);
            }
            android.widget.ImageView d18 = vh6.d();
            if (d18 != null) {
                d18.setAlpha(e(vh6));
            }
            android.widget.ImageView a18 = vh6.a();
            if (a18 != null) {
                a18.setAlpha(0.0f);
            }
            android.widget.ImageView e19 = vh6.e();
            if (e19 != null) {
                e19.setAlpha(1.0f);
            }
            android.widget.ImageView b19 = vh6.b();
            if (b19 != null) {
                b19.setAlpha(0.0f);
            }
            android.widget.ImageView e27 = vh6.e();
            if (e27 != null) {
                e27.setRotationY(0.0f);
            }
            android.widget.ImageView b27 = vh6.b();
            if (b27 != null) {
                b27.setRotationY(0.0f);
            }
            android.view.View c27 = vh6.c();
            if (c27 != null) {
                c27.setTranslationY(0.0f);
            }
            android.view.View c28 = vh6.c();
            if (c28 != null) {
                c28.setRotation(0.0f);
            }
            android.view.View c29 = vh6.c();
            if (c29 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(valueOf);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c29, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView", "resetItemForAnim", "(Lcom/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$CardItemHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                c29.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(c29, "com/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView", "resetItemForAnim", "(Lcom/tencent/mm/plugin/sns/ad/helper/randompickcard/RandomPickCardView$CardItemHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetItemForAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
    }

    public final void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUIForAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        com.tencent.mars.xlog.Log.i(this.TAG, "resetUIForAnim");
        b();
        java.util.List list = this.mItemViewList;
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                l((p44.c0) it.next());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUIForAnim", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
    }

    public final void setMContainerWidth(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMContainerWidth", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        this.mContainerWidth = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMContainerWidth", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
    }

    public final void setMItemViewList(java.util.List<p44.c0> list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMItemViewList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        kotlin.jvm.internal.o.g(list, "<set-?>");
        this.mItemViewList = list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMItemViewList", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
    }

    public final void setMRandomPickCardInfo(p44.u uVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMRandomPickCardInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        this.mRandomPickCardInfo = uVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMRandomPickCardInfo", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
    }

    public final void setOnItemClickListener(p44.d0 listener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f162722o = listener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnItemClickListener", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
    }

    public final void setTAG(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTAG", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.TAG = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTAG", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RandomPickCardView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "RandomPickCardView";
        this.mItemViewList = new java.util.ArrayList();
        this.f162719i = new java.util.ArrayList();
        this.f162720m = jz5.h.b(new p44.e0(this));
        this.f162721n = new p44.f0(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
        setOrientation(0);
        setClipToPadding(false);
        setClipChildren(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardView");
    }
}
