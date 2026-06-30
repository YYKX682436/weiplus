package q74;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f360585a;

    /* renamed from: b, reason: collision with root package name */
    public final q74.c0 f360586b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f360587c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f360588d;

    /* renamed from: e, reason: collision with root package name */
    public s34.a1 f360589e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f360590f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f360591g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f360592h;

    /* renamed from: i, reason: collision with root package name */
    public final int f360593i;

    /* renamed from: j, reason: collision with root package name */
    public final android.os.Handler f360594j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f360595k;

    /* renamed from: l, reason: collision with root package name */
    public final q74.w f360596l;

    /* renamed from: m, reason: collision with root package name */
    public final q74.y f360597m;

    public z(android.content.Context context, q74.c0 mAdContext) {
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(mAdContext, "mAdContext");
        this.f360585a = context;
        this.f360586b = mAdContext;
        this.f360587c = "OverSlideLeftLogic";
        this.f360593i = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
        this.f360594j = new android.os.Handler(android.os.Looper.getMainLooper());
        android.view.View h17 = a84.y0.h(mAdContext.f360432b);
        this.f360590f = h17;
        android.widget.TextView textView = h17 != null ? (android.widget.TextView) h17.findViewById(com.tencent.mm.R.id.qpi) : null;
        this.f360591g = textView;
        android.view.View findViewById = h17 != null ? h17.findViewById(com.tencent.mm.R.id.qph) : null;
        this.f360592h = findViewById;
        float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        if (textView != null) {
            textView.setTextSize(0, b17);
        }
        android.graphics.Point point = mAdContext.f360438h;
        int i17 = point != null ? point.y : 0;
        int i18 = point != null ? point.x : 0;
        if (i17 > 0 && i18 > 0) {
            java.lang.Object layoutParams2 = h17 != null ? h17.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = i17;
                int a17 = (((mAdContext.f360439i - i18) - ((findViewById == null || (layoutParams = findViewById.getLayoutParams()) == null) ? c44.b.a(12) : layoutParams.width)) - c44.b.a(10)) - c44.b.a(10);
                marginLayoutParams.rightMargin = a17 >= 0 ? a17 : 0;
                if (h17 != null) {
                    h17.setLayoutParams(marginLayoutParams);
                }
            }
        }
        this.f360596l = new q74.w(this);
        this.f360597m = new q74.y(this);
    }

    public static final /* synthetic */ java.lang.String a(q74.z zVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        java.lang.String str = zVar.f360587c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        return str;
    }

    public static final void b(q74.z zVar, boolean z17) {
        java.lang.String str;
        java.lang.String string;
        java.lang.String string2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        zVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        com.tencent.mars.xlog.Log.i(zVar.f360587c, "updateTipText, isOverSlide=" + z17);
        android.widget.TextView textView = zVar.f360591g;
        if (textView != null) {
            java.lang.String str2 = "";
            android.content.Context context = zVar.f360585a;
            if (z17) {
                s34.a1 a1Var = zVar.f360589e;
                str = a1Var != null ? a1Var.f402567d : null;
                if (str == null || str.length() == 0) {
                    if (context != null && (string2 = context.getString(com.tencent.mm.R.string.ly7)) != null) {
                        str2 = string2;
                    }
                    str = str2;
                }
                textView.setText(str);
            } else {
                s34.a1 a1Var2 = zVar.f360589e;
                str = a1Var2 != null ? a1Var2.f402566c : null;
                if (str == null || str.length() == 0) {
                    if (context != null && (string = context.getString(com.tencent.mm.R.string.ly6)) != null) {
                        str2 = string;
                    }
                    str = str2;
                }
                textView.setText(str);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
    }

    public final q74.c0 c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAdContext", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAdContext", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        return this.f360586b;
    }

    public final void d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s34.a1 a1Var) {
        boolean z17;
        q74.c0 c0Var;
        android.view.View view;
        android.content.Context context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
        this.f360588d = snsInfo;
        this.f360589e = a1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh, overSlideJumpInfo==null?");
        sb6.append((a1Var != null ? a1Var.overSlideJumpInfo : null) == null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f360587c;
        com.tencent.mars.xlog.Log.i(str, sb7);
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = a1Var != null ? a1Var.overSlideJumpInfo : null;
        android.view.View view2 = this.f360590f;
        q74.c0 c0Var2 = this.f360586b;
        if (adClickActionInfo != null) {
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView adSlideRecyclerView = c0Var2.f360431a;
            if (adSlideRecyclerView != null) {
                adSlideRecyclerView.setTouchActionListener(this.f360597m);
            }
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                c0Var = c0Var2;
                view = view2;
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = c0Var.f360434d;
                if (cardLayoutManager != null && cardLayoutManager.w()) {
                    com.tencent.mars.xlog.Log.i(str, "refresh, overSlideTipLayout alpha=1");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    com.tencent.mars.xlog.Log.i(str, "refresh, overSlideTipLayout alpha=0");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            } else {
                c0Var = c0Var2;
                view = view2;
            }
            android.widget.TextView textView = this.f360591g;
            if (textView != null) {
                java.lang.String str2 = a1Var != null ? a1Var.f402566c : null;
                if ((str2 == null || str2.length() == 0) && ((context = this.f360585a) == null || (str2 = context.getString(com.tencent.mm.R.string.ly6)) == null)) {
                    str2 = "";
                }
                textView.setText(str2);
            }
            q74.b1 b1Var = c0Var.f360433c;
            if (b1Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsAutoLoopNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                b1Var.f360423f = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsAutoLoopNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            }
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager2 = c0Var.f360434d;
            if (cardLayoutManager2 != null) {
                cardLayoutManager2.C(false);
            }
            z84.k kVar = c0Var.f360435e;
            if (kVar != null) {
                kVar.j(view);
                kVar.i(this.f360596l);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
                kVar.f470777h = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
            }
        } else {
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView adSlideRecyclerView2 = c0Var2.f360431a;
            if (adSlideRecyclerView2 != null) {
                adSlideRecyclerView2.setTouchActionListener(null);
            }
            if (view2 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideFullCard/OverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            q74.b1 b1Var2 = c0Var2.f360433c;
            if (b1Var2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsAutoLoopNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
                z17 = true;
                b1Var2.f360423f = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsAutoLoopNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            } else {
                z17 = true;
            }
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager3 = c0Var2.f360434d;
            if (cardLayoutManager3 != null) {
                cardLayoutManager3.C(z17);
            }
            z84.k kVar2 = c0Var2.f360435e;
            if (kVar2 != null) {
                kVar2.j(null);
                kVar2.i(null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
                kVar2.f470777h = z17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.OverSlideLeftLogic");
    }
}
