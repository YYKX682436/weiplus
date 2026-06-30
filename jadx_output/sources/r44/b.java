package r44;

/* loaded from: classes4.dex */
public final class b implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r44.f f369551d;

    public b(r44.f fVar) {
        this.f369551d = fVar;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        long j17;
        int i17;
        java.util.LinkedList linkedList;
        int i18;
        int i19;
        int i27;
        java.lang.String str5 = "queueIdle";
        java.lang.String str6 = "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$doPreloadWhenIdle$1";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("queueIdle", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$doPreloadWhenIdle$1");
        r44.f fVar = this.f369551d;
        java.lang.String P6 = r44.f.P6(fVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPreloadWhenIdle, isDestroyed=");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsDestroyed$p", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        boolean z17 = fVar.f369563e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsDestroyed$p", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(P6, sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsDestroyed$p", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        boolean z18 = fVar.f369563e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsDestroyed$p", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
        if (!z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCachePool$p", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCachePool$p", "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC");
            t44.o oVar = fVar.f369565g;
            oVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadOne", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdLayoutCachePool");
            java.util.LinkedList linkedList2 = (java.util.LinkedList) oVar.f415521b;
            if (linkedList2.size() != 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadOne", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdLayoutCachePool");
                str = "queueIdle";
                str2 = "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$doPreloadWhenIdle$1";
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                v44.a aVar = oVar.f415522c;
                if (aVar != null) {
                    s44.d dVar = (s44.d) aVar;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildLayout", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
                    android.content.Context context = oVar.f415520a;
                    kotlin.jvm.internal.o.g(context, "context");
                    s44.c cVar = new s44.c();
                    android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
                    c44.a.m();
                    linearLayout.setOrientation(1);
                    c44.a.l();
                    if (linearLayout.getLayoutParams() == null) {
                        c44.a.o();
                        linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
                        layoutParams.width = -1;
                        linearLayout.setLayoutParams(layoutParams);
                    }
                    c44.a.o();
                    if (linearLayout.getLayoutParams() == null) {
                        c44.a.o();
                        linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
                        layoutParams2.height = -2;
                        linearLayout.setLayoutParams(layoutParams2);
                    }
                    linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.bfj);
                    str = "queueIdle";
                    linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), dVar.b());
                    android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(linearLayout.getContext());
                    linearLayout.addView(frameLayout);
                    c44.a.l();
                    if (frameLayout.getLayoutParams() == null) {
                        c44.a.o();
                        frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                    } else {
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
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBreakFrameContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBreakFrameContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(frameLayout.getContext());
                    frameLayout.addView(linearLayout2);
                    c44.a.j();
                    linearLayout2.setOrientation(0);
                    c44.a.l();
                    if (linearLayout2.getLayoutParams() == null) {
                        c44.a.o();
                        str2 = "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$doPreloadWhenIdle$1";
                        linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                    } else {
                        str2 = "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$doPreloadWhenIdle$1";
                        android.view.ViewGroup.LayoutParams layoutParams5 = linearLayout2.getLayoutParams();
                        layoutParams5.width = -1;
                        linearLayout2.setLayoutParams(layoutParams5);
                    }
                    c44.a.o();
                    if (linearLayout2.getLayoutParams() == null) {
                        c44.a.o();
                        linearLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams6 = linearLayout2.getLayoutParams();
                        layoutParams6.height = -2;
                        linearLayout2.setLayoutParams(layoutParams6);
                    }
                    str3 = "preloadOne";
                    linearLayout2.setPadding(dVar.f402962l, linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
                    linearLayout2.setPadding(linearLayout2.getPaddingLeft(), dVar.a(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentLinearLayout", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider$TimelineAdItemViewHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentLinearLayout", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider$TimelineAdItemViewHolder");
                    com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView snsAvatarImageView = new com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView(linearLayout2.getContext());
                    linearLayout2.addView(snsAvatarImageView);
                    snsAvatarImageView.setId(com.tencent.mm.R.id.f482806od);
                    int d17 = dVar.d();
                    if (snsAvatarImageView.getLayoutParams() == null) {
                        c44.a.o();
                        str4 = "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdLayoutCachePool";
                        snsAvatarImageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(d17, -2));
                    } else {
                        str4 = "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdLayoutCachePool";
                        android.view.ViewGroup.LayoutParams layoutParams7 = snsAvatarImageView.getLayoutParams();
                        layoutParams7.width = d17;
                        snsAvatarImageView.setLayoutParams(layoutParams7);
                    }
                    int d18 = dVar.d();
                    if (snsAvatarImageView.getLayoutParams() == null) {
                        c44.a.o();
                        snsAvatarImageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, d18));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams8 = snsAvatarImageView.getLayoutParams();
                        layoutParams8.height = d18;
                        snsAvatarImageView.setLayoutParams(layoutParams8);
                    }
                    int a17 = dVar.a();
                    snsAvatarImageView.setPadding(a17, a17, a17, a17);
                    java.lang.String string = snsAvatarImageView.getContext().getString(com.tencent.mm.R.string.a6x);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    snsAvatarImageView.setContentDescription(string);
                    snsAvatarImageView.setFocusable(false);
                    snsAvatarImageView.setImageResource(com.tencent.mm.R.drawable.bhm);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAvatarImage", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAvatarImage", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    android.widget.LinearLayout linearLayout3 = new android.widget.LinearLayout(linearLayout2.getContext());
                    linearLayout2.addView(linearLayout3);
                    linearLayout3.setPadding(linearLayout3.getPaddingLeft(), dVar.a(), linearLayout3.getPaddingRight(), linearLayout3.getPaddingBottom());
                    c44.a.l();
                    if (linearLayout3.getLayoutParams() == null) {
                        c44.a.o();
                        linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams9 = linearLayout3.getLayoutParams();
                        layoutParams9.width = -1;
                        linearLayout3.setLayoutParams(layoutParams9);
                    }
                    c44.a.o();
                    if (linearLayout3.getLayoutParams() == null) {
                        c44.a.o();
                        linearLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams10 = linearLayout3.getLayoutParams();
                        layoutParams10.height = -2;
                        linearLayout3.setLayoutParams(layoutParams10);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatarRightMargin", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
                    int intValue = ((java.lang.Number) ((jz5.n) dVar.f402961k).getValue()).intValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarRightMargin", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
                    android.view.ViewGroup.LayoutParams layoutParams11 = linearLayout3.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams11 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams11 : null;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.leftMargin = intValue;
                    }
                    c44.a.m();
                    linearLayout3.setOrientation(1);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRightContentContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRightContentContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    android.widget.LinearLayout linearLayout4 = new android.widget.LinearLayout(linearLayout3.getContext());
                    linearLayout3.addView(linearLayout4);
                    linearLayout4.setId(com.tencent.mm.R.id.kbe);
                    c44.a.l();
                    if (linearLayout4.getLayoutParams() == null) {
                        c44.a.o();
                        linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams12 = linearLayout4.getLayoutParams();
                        layoutParams12.width = -1;
                        linearLayout4.setLayoutParams(layoutParams12);
                    }
                    c44.a.o();
                    if (linearLayout4.getLayoutParams() == null) {
                        c44.a.o();
                        linearLayout4.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams13 = linearLayout4.getLayoutParams();
                        layoutParams13.height = -2;
                        linearLayout4.setLayoutParams(layoutParams13);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams14 = linearLayout4.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams14 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams14 : null;
                    int i28 = dVar.f402963m;
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.rightMargin = i28;
                    }
                    c44.a.j();
                    linearLayout4.setOrientation(0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNickLayout", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider$TimelineAdItemViewHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNickLayout", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider$TimelineAdItemViewHolder");
                    com.tencent.mm.plugin.sns.ui.AsyncTextView asyncTextView = new com.tencent.mm.plugin.sns.ui.AsyncTextView(linearLayout4.getContext());
                    linearLayout4.addView(asyncTextView);
                    asyncTextView.setId(com.tencent.mm.R.id.kbq);
                    if (asyncTextView.getLayoutParams() == null) {
                        c44.a.o();
                        j17 = currentTimeMillis;
                        asyncTextView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(0, -2));
                    } else {
                        j17 = currentTimeMillis;
                        android.view.ViewGroup.LayoutParams layoutParams15 = asyncTextView.getLayoutParams();
                        layoutParams15.width = 0;
                        asyncTextView.setLayoutParams(layoutParams15);
                    }
                    c44.a.o();
                    if (asyncTextView.getLayoutParams() == null) {
                        c44.a.o();
                        asyncTextView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams16 = asyncTextView.getLayoutParams();
                        layoutParams16.height = -2;
                        asyncTextView.setLayoutParams(layoutParams16);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams17 = asyncTextView.getLayoutParams();
                    android.widget.LinearLayout.LayoutParams layoutParams18 = layoutParams17 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams17 : null;
                    if (layoutParams18 != null) {
                        layoutParams18.weight = 1;
                    }
                    asyncTextView.setEllipsize(c44.a.a());
                    asyncTextView.setSingleLine(true);
                    asyncTextView.setTextColor(i65.a.d(asyncTextView.getContext(), com.tencent.mm.R.color.f478734fp));
                    asyncTextView.setTextSize(0, i65.a.p(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479897ia));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setNickNameText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setNickNameText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildAdTagView", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
                    android.widget.LinearLayout linearLayout5 = new android.widget.LinearLayout(context);
                    linearLayout5.setId(com.tencent.mm.R.id.f482638jw);
                    c44.a.o();
                    if (linearLayout5.getLayoutParams() == null) {
                        c44.a.o();
                        i17 = -2;
                        linearLayout5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                    } else {
                        i17 = -2;
                        android.view.ViewGroup.LayoutParams layoutParams19 = linearLayout5.getLayoutParams();
                        layoutParams19.width = -2;
                        linearLayout5.setLayoutParams(layoutParams19);
                    }
                    int a18 = c44.b.a(24);
                    if (linearLayout5.getLayoutParams() == null) {
                        c44.a.o();
                        linearLayout5.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i17, a18));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams20 = linearLayout5.getLayoutParams();
                        layoutParams20.height = a18;
                        linearLayout5.setLayoutParams(layoutParams20);
                    }
                    linearLayout5.setBackgroundResource(com.tencent.mm.R.drawable.b0r);
                    c44.a.j();
                    linearLayout5.setOrientation(0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdTagLayout", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdTagLayout", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(linearLayout5.getContext());
                    linearLayout5.addView(weImageView);
                    weImageView.setId(com.tencent.mm.R.id.f482642k0);
                    int a19 = c44.b.a(9);
                    if (weImageView.getLayoutParams() == null) {
                        c44.a.o();
                        linkedList = linkedList2;
                        weImageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a19, -2));
                    } else {
                        linkedList = linkedList2;
                        android.view.ViewGroup.LayoutParams layoutParams21 = weImageView.getLayoutParams();
                        layoutParams21.width = a19;
                        weImageView.setLayoutParams(layoutParams21);
                    }
                    int a27 = c44.b.a(12);
                    if (weImageView.getLayoutParams() == null) {
                        c44.a.o();
                        weImageView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a27));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams22 = weImageView.getLayoutParams();
                        layoutParams22.height = a27;
                        weImageView.setLayoutParams(layoutParams22);
                    }
                    weImageView.setImageResource(com.tencent.mm.R.raw.album_advertise_lbs_info_icon);
                    int d19 = c44.a.d();
                    android.view.ViewGroup.LayoutParams layoutParams23 = weImageView.getLayoutParams();
                    android.widget.LinearLayout.LayoutParams layoutParams24 = layoutParams23 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams23 : null;
                    if (layoutParams24 != null) {
                        layoutParams24.gravity = d19;
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams25 = weImageView.getLayoutParams();
                        android.widget.FrameLayout.LayoutParams layoutParams26 = layoutParams25 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams25 : null;
                        if (layoutParams26 != null) {
                            layoutParams26.gravity = d19;
                        }
                    }
                    int a28 = c44.b.a(3);
                    android.view.ViewGroup.LayoutParams layoutParams27 = weImageView.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams27 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams27 : null;
                    if (marginLayoutParams3 != null) {
                        marginLayoutParams3.rightMargin = a28;
                    }
                    int a29 = c44.b.a(5);
                    android.view.ViewGroup.LayoutParams layoutParams28 = weImageView.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams28 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams28 : null;
                    if (marginLayoutParams4 != null) {
                        marginLayoutParams4.leftMargin = a29;
                    }
                    c44.a.c();
                    weImageView.setVisibility(8);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdTagLbsIcon", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdTagLbsIcon", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    android.widget.TextView textView = new android.widget.TextView(linearLayout5.getContext());
                    linearLayout5.addView(textView);
                    textView.setId(com.tencent.mm.R.id.f482639jx);
                    c44.a.o();
                    if (textView.getLayoutParams() == null) {
                        c44.a.o();
                        i18 = -2;
                        textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                    } else {
                        i18 = -2;
                        android.view.ViewGroup.LayoutParams layoutParams29 = textView.getLayoutParams();
                        layoutParams29.width = -2;
                        textView.setLayoutParams(layoutParams29);
                    }
                    c44.a.o();
                    if (textView.getLayoutParams() == null) {
                        c44.a.o();
                        textView.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i18, i18));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams30 = textView.getLayoutParams();
                        layoutParams30.height = i18;
                        textView.setLayoutParams(layoutParams30);
                    }
                    textView.setMaxWidth(i65.a.f(textView.getContext(), com.tencent.mm.R.dimen.f479786f7));
                    int d27 = c44.a.d();
                    android.view.ViewGroup.LayoutParams layoutParams31 = textView.getLayoutParams();
                    android.widget.LinearLayout.LayoutParams layoutParams32 = layoutParams31 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams31 : null;
                    if (layoutParams32 != null) {
                        layoutParams32.gravity = d27;
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams33 = textView.getLayoutParams();
                        android.widget.FrameLayout.LayoutParams layoutParams34 = layoutParams33 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams33 : null;
                        if (layoutParams34 != null) {
                            layoutParams34.gravity = d27;
                        }
                    }
                    int a37 = c44.b.a(7);
                    android.view.ViewGroup.LayoutParams layoutParams35 = textView.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams35 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams35 : null;
                    if (marginLayoutParams5 != null) {
                        marginLayoutParams5.leftMargin = a37;
                    }
                    textView.setSingleLine(true);
                    textView.setEllipsize(c44.a.a());
                    textView.setTextColor(i65.a.d(textView.getContext(), com.tencent.mm.R.color.a5z));
                    textView.setTextSize(0, dVar.e(com.tencent.mm.R.dimen.f479929j9));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdTagText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdTagText", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = new com.tencent.mm.ui.widget.imageview.WeImageView(linearLayout5.getContext());
                    linearLayout5.addView(weImageView2);
                    weImageView2.setId(com.tencent.mm.R.id.f482640jy);
                    int a38 = c44.b.a(9);
                    if (weImageView2.getLayoutParams() == null) {
                        c44.a.o();
                        weImageView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(a38, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams36 = weImageView2.getLayoutParams();
                        layoutParams36.width = a38;
                        weImageView2.setLayoutParams(layoutParams36);
                    }
                    int a39 = c44.b.a(5);
                    if (weImageView2.getLayoutParams() == null) {
                        c44.a.o();
                        weImageView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a39));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams37 = weImageView2.getLayoutParams();
                        layoutParams37.height = a39;
                        weImageView2.setLayoutParams(layoutParams37);
                    }
                    int a47 = c44.b.a(4);
                    android.view.ViewGroup.LayoutParams layoutParams38 = weImageView2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams6 = layoutParams38 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams38 : null;
                    if (marginLayoutParams6 != null) {
                        marginLayoutParams6.leftMargin = a47;
                    }
                    int a48 = c44.b.a(5);
                    android.view.ViewGroup.LayoutParams layoutParams39 = weImageView2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams7 = layoutParams39 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams39 : null;
                    if (marginLayoutParams7 != null) {
                        marginLayoutParams7.rightMargin = a48;
                    }
                    int d28 = c44.a.d();
                    android.view.ViewGroup.LayoutParams layoutParams40 = weImageView2.getLayoutParams();
                    android.widget.LinearLayout.LayoutParams layoutParams41 = layoutParams40 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams40 : null;
                    if (layoutParams41 != null) {
                        layoutParams41.gravity = d28;
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams42 = weImageView2.getLayoutParams();
                        android.widget.FrameLayout.LayoutParams layoutParams43 = layoutParams42 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams42 : null;
                        if (layoutParams43 != null) {
                            layoutParams43.gravity = d28;
                        }
                    }
                    weImageView2.setImageResource(com.tencent.mm.R.raw.icon_arrow_light);
                    weImageView2.setIconColor(i65.a.d(weImageView2.getContext(), com.tencent.mm.R.color.a4p));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdTagArrowIcon", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdTagArrowIcon", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildAdTagView", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
                    linearLayout4.addView(linearLayout5);
                    android.view.View viewStub = new android.view.ViewStub(linearLayout3.getContext());
                    linearLayout3.addView(viewStub);
                    c44.a.l();
                    if (viewStub.getLayoutParams() == null) {
                        c44.a.o();
                        viewStub.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams44 = viewStub.getLayoutParams();
                        layoutParams44.width = -1;
                        viewStub.setLayoutParams(layoutParams44);
                    }
                    c44.a.o();
                    if (viewStub.getLayoutParams() == null) {
                        c44.a.o();
                        viewStub.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams45 = viewStub.getLayoutParams();
                        layoutParams45.height = -2;
                        viewStub.setLayoutParams(layoutParams45);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSmallerPadding", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
                    int intValue2 = ((java.lang.Number) ((jz5.n) dVar.f415514d).getValue()).intValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSmallerPadding", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
                    android.view.ViewGroup.LayoutParams layoutParams46 = viewStub.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams8 = layoutParams46 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams46 : null;
                    if (marginLayoutParams8 != null) {
                        marginLayoutParams8.topMargin = intValue2;
                    }
                    android.view.ViewGroup.LayoutParams layoutParams47 = viewStub.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams9 = layoutParams47 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams47 : null;
                    if (marginLayoutParams9 != null) {
                        marginLayoutParams9.rightMargin = i28;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentTextStub", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentTextStub", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    android.view.View frameLayout2 = new android.widget.FrameLayout(linearLayout3.getContext());
                    linearLayout3.addView(frameLayout2);
                    c44.a.l();
                    if (frameLayout2.getLayoutParams() == null) {
                        c44.a.o();
                        frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams48 = frameLayout2.getLayoutParams();
                        layoutParams48.width = -1;
                        frameLayout2.setLayoutParams(layoutParams48);
                    }
                    c44.a.o();
                    if (frameLayout2.getLayoutParams() == null) {
                        c44.a.o();
                        frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams49 = frameLayout2.getLayoutParams();
                        layoutParams49.height = -2;
                        frameLayout2.setLayoutParams(layoutParams49);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSmallestPadding", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
                    int intValue3 = ((java.lang.Number) ((jz5.n) dVar.f415515e).getValue()).intValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSmallestPadding", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
                    android.view.ViewGroup.LayoutParams layoutParams50 = frameLayout2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams10 = layoutParams50 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams50 : null;
                    if (marginLayoutParams10 != null) {
                        marginLayoutParams10.bottomMargin = intValue3;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMiddlePadding", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
                    int intValue4 = ((java.lang.Number) ((jz5.n) dVar.f415516f).getValue()).intValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMiddlePadding", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
                    android.view.ViewGroup.LayoutParams layoutParams51 = frameLayout2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams11 = layoutParams51 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams51 : null;
                    if (marginLayoutParams11 != null) {
                        marginLayoutParams11.topMargin = intValue4;
                    }
                    android.view.ViewGroup.LayoutParams layoutParams52 = frameLayout2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams12 = layoutParams52 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams52 : null;
                    if (marginLayoutParams12 != null) {
                        marginLayoutParams12.rightMargin = i28;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMediaContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMediaContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    android.view.View linearLayout6 = new android.widget.LinearLayout(linearLayout3.getContext());
                    linearLayout3.addView(linearLayout6);
                    c44.a.l();
                    if (linearLayout6.getLayoutParams() == null) {
                        c44.a.o();
                        linearLayout6.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams53 = linearLayout6.getLayoutParams();
                        layoutParams53.width = -1;
                        linearLayout6.setLayoutParams(layoutParams53);
                    }
                    c44.a.o();
                    if (linearLayout6.getLayoutParams() == null) {
                        c44.a.o();
                        linearLayout6.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams54 = linearLayout6.getLayoutParams();
                        layoutParams54.height = -2;
                        linearLayout6.setLayoutParams(layoutParams54);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams55 = linearLayout6.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams13 = layoutParams55 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams55 : null;
                    if (marginLayoutParams13 != null) {
                        marginLayoutParams13.rightMargin = i28;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSubContentContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSubContentContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    c44.a.c();
                    linearLayout6.setVisibility(8);
                    android.view.View viewStub2 = new android.view.ViewStub(linearLayout3.getContext());
                    linearLayout3.addView(viewStub2);
                    c44.a.o();
                    if (viewStub2.getLayoutParams() == null) {
                        c44.a.o();
                        i19 = -2;
                        viewStub2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                    } else {
                        i19 = -2;
                        android.view.ViewGroup.LayoutParams layoutParams56 = viewStub2.getLayoutParams();
                        layoutParams56.width = -2;
                        viewStub2.setLayoutParams(layoutParams56);
                    }
                    c44.a.o();
                    if (viewStub2.getLayoutParams() == null) {
                        c44.a.o();
                        viewStub2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i19, i19));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams57 = viewStub2.getLayoutParams();
                        layoutParams57.height = i19;
                        viewStub2.setLayoutParams(layoutParams57);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNormalPadding", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
                    int intValue5 = ((java.lang.Number) ((jz5.n) dVar.f415512b).getValue()).intValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNormalPadding", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
                    android.view.ViewGroup.LayoutParams layoutParams58 = viewStub2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams14 = layoutParams58 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams58 : null;
                    if (marginLayoutParams14 != null) {
                        marginLayoutParams14.topMargin = intValue5;
                    }
                    int b17 = dVar.b();
                    android.view.ViewGroup.LayoutParams layoutParams59 = viewStub2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams15 = layoutParams59 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams59 : null;
                    if (marginLayoutParams15 != null) {
                        marginLayoutParams15.bottomMargin = b17;
                    }
                    android.view.ViewGroup.LayoutParams layoutParams60 = viewStub2.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams16 = layoutParams60 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams60 : null;
                    if (marginLayoutParams16 != null) {
                        marginLayoutParams16.rightMargin = i28;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLinkViewLayoutStub", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLinkViewLayoutStub", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    android.view.View viewStub3 = new android.view.ViewStub(linearLayout3.getContext());
                    linearLayout3.addView(viewStub3);
                    c44.a.o();
                    if (viewStub3.getLayoutParams() == null) {
                        c44.a.o();
                        i27 = -2;
                        viewStub3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                    } else {
                        i27 = -2;
                        android.view.ViewGroup.LayoutParams layoutParams61 = viewStub3.getLayoutParams();
                        layoutParams61.width = -2;
                        viewStub3.setLayoutParams(layoutParams61);
                    }
                    c44.a.o();
                    if (viewStub3.getLayoutParams() == null) {
                        c44.a.o();
                        viewStub3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(i27, i27));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams62 = viewStub3.getLayoutParams();
                        layoutParams62.height = i27;
                        viewStub3.setLayoutParams(layoutParams62);
                    }
                    int b18 = dVar.b();
                    android.view.ViewGroup.LayoutParams layoutParams63 = viewStub3.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams17 = layoutParams63 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams63 : null;
                    if (marginLayoutParams17 != null) {
                        marginLayoutParams17.topMargin = b18;
                    }
                    android.view.ViewGroup.LayoutParams layoutParams64 = viewStub3.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams18 = layoutParams64 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams64 : null;
                    if (marginLayoutParams18 != null) {
                        marginLayoutParams18.rightMargin = i28;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAddressViewStub", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAddressViewStub", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    linearLayout3.addView(dVar.c(context, cVar));
                    android.view.View linearLayout7 = new android.widget.LinearLayout(linearLayout.getContext());
                    linearLayout.addView(linearLayout7);
                    linearLayout7.setId(com.tencent.mm.R.id.f482875qh);
                    c44.a.l();
                    if (linearLayout7.getLayoutParams() == null) {
                        c44.a.o();
                        linearLayout7.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams65 = linearLayout7.getLayoutParams();
                        layoutParams65.width = -1;
                        linearLayout7.setLayoutParams(layoutParams65);
                    }
                    c44.a.o();
                    if (linearLayout7.getLayoutParams() == null) {
                        c44.a.o();
                        linearLayout7.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                    } else {
                        android.view.ViewGroup.LayoutParams layoutParams66 = linearLayout7.getLayoutParams();
                        layoutParams66.height = -2;
                        linearLayout7.setLayoutParams(layoutParams66);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams67 = linearLayout7.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams19 = layoutParams67 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams67 : null;
                    if (marginLayoutParams19 != null) {
                        marginLayoutParams19.leftMargin = dVar.f402964n;
                    }
                    int f17 = i65.a.f(linearLayout7.getContext(), com.tencent.mm.R.dimen.f479738dv);
                    android.view.ViewGroup.LayoutParams layoutParams68 = linearLayout7.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams20 = layoutParams68 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams68 : null;
                    if (marginLayoutParams20 != null) {
                        marginLayoutParams20.topMargin = f17;
                    }
                    android.view.ViewGroup.LayoutParams layoutParams69 = linearLayout7.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams21 = layoutParams69 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams69 : null;
                    if (marginLayoutParams21 != null) {
                        marginLayoutParams21.rightMargin = i28;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBasicPaddingSize", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
                    int intValue6 = ((java.lang.Number) ((jz5.n) dVar.f415517g).getValue()).intValue();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBasicPaddingSize", "com.tencent.mm.plugin.sns.ad.improve.base.AdItemLayoutAttribute");
                    android.view.ViewGroup.LayoutParams layoutParams70 = linearLayout7.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams22 = layoutParams70 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams70 : null;
                    if (marginLayoutParams22 != null) {
                        marginLayoutParams22.bottomMargin = intValue6;
                    }
                    c44.a.c();
                    linearLayout7.setVisibility(8);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentContainer", "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdItemHolder");
                    linearLayout.setTag(com.tencent.mm.R.id.qae, cVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildLayout", "com.tencent.mm.plugin.sns.ad.improve.adapter.list.SnsAdBaseLayoutProvider");
                    linkedList.offer(linearLayout);
                } else {
                    str = "queueIdle";
                    str2 = "com.tencent.mm.plugin.sns.ad.improve.SnsAdBizUIC$doPreloadWhenIdle$1";
                    str3 = "preloadOne";
                    str4 = "com.tencent.mm.plugin.sns.ad.improve.base.BaseAdLayoutCachePool";
                    j17 = currentTimeMillis;
                }
                com.tencent.mars.xlog.Log.i("BaseAdLayoutCachePool", "preload, cost=" + (java.lang.System.currentTimeMillis() - j17));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_GET_METADATA, 5);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str4);
            }
            str5 = str;
            str6 = str2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str6);
        return false;
    }
}
