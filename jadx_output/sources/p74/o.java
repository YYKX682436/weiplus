package p74;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f352569a;

    /* renamed from: b, reason: collision with root package name */
    public final p74.d f352570b;

    /* renamed from: c, reason: collision with root package name */
    public int f352571c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f352572d;

    /* renamed from: e, reason: collision with root package name */
    public s34.a1 f352573e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f352574f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f352575g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f352576h;

    /* renamed from: i, reason: collision with root package name */
    public final int f352577i;

    /* renamed from: j, reason: collision with root package name */
    public final android.os.Handler f352578j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f352579k;

    /* renamed from: l, reason: collision with root package name */
    public final z84.j f352580l;

    /* renamed from: m, reason: collision with root package name */
    public final p74.n f352581m;

    public o(android.content.Context context, p74.d mAdContext, int i17) {
        kotlin.jvm.internal.o.g(mAdContext, "mAdContext");
        this.f352569a = context;
        this.f352570b = mAdContext;
        this.f352571c = i17;
        this.f352577i = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
        this.f352578j = new android.os.Handler(android.os.Looper.getMainLooper());
        android.view.View h17 = a84.y0.h(mAdContext.f352527b);
        this.f352574f = h17;
        android.view.ViewGroup.LayoutParams layoutParams = null;
        android.widget.TextView textView = h17 != null ? (android.widget.TextView) h17.findViewById(com.tencent.mm.R.id.qpi) : null;
        this.f352575g = textView;
        android.view.View findViewById = h17 != null ? h17.findViewById(com.tencent.mm.R.id.qph) : null;
        this.f352576h = findViewById;
        float s17 = ca4.m0.s(12);
        if (textView != null) {
            textView.setTextSize(0, s17);
        }
        if (findViewById != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = r7;
                layoutParams2.height = r7;
            } else {
                layoutParams2 = null;
            }
            findViewById.setLayoutParams(layoutParams2);
        }
        if (h17 != null) {
            android.view.ViewGroup.LayoutParams layoutParams3 = h17.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = ca4.m0.s(22);
                layoutParams = layoutParams3;
            }
            h17.setLayoutParams(layoutParams);
        }
        this.f352580l = new p74.l(this);
        this.f352581m = new p74.n(this);
    }

    public static final /* synthetic */ p74.d a(p74.o oVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdContext$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        p74.d dVar = oVar.f352570b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdContext$p", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        return dVar;
    }

    public static final void b(p74.o oVar, boolean z17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        oVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", "updateTipText, isOverSlide=" + z17);
        android.widget.TextView textView = oVar.f352575g;
        if (textView != null) {
            android.content.Context context = oVar.f352569a;
            if (z17) {
                s34.a1 a1Var = oVar.f352573e;
                str = a1Var != null ? a1Var.f402567d : null;
                if (str == null || str.length() == 0) {
                    if (oVar.f352571c == 1) {
                        java.lang.String string = "";
                        str = string;
                    } else {
                        java.lang.String string2 = "";
                        str = string2;
                    }
                }
            } else {
                s34.a1 a1Var2 = oVar.f352573e;
                str = a1Var2 != null ? a1Var2.f402566c : null;
                if (str == null || str.length() == 0) {
                    if (oVar.f352571c == 1) {
                        java.lang.String string22 = "";
                        str = string22;
                    } else {
                        java.lang.String string222 = "";
                        str = string222;
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", "tipStr = " + str);
            textView.setText(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$updateTipText", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
    }

    public final void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, s34.a1 a1Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
        this.f352572d = snsInfo;
        this.f352573e = a1Var;
        this.f352571c = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh, overSlideJumpInfo==null?");
        sb6.append((a1Var != null ? a1Var.overSlideJumpInfo : null) == null);
        com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", sb6.toString());
        if ((a1Var != null ? a1Var.overSlideJumpInfo : null) != null) {
            p74.d dVar = this.f352570b;
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardRecyclerView adSlideCardRecyclerView = dVar.f352526a;
            if (adSlideCardRecyclerView != null) {
                adSlideCardRecyclerView.setTouchActionListener(this.f352581m);
            }
            android.view.View view = this.f352574f;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardOverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardOverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = dVar.f352529d;
                if (cardLayoutManager != null && cardLayoutManager.w()) {
                    com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", "refresh, overSlideTipLayout alpha=1");
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardOverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardOverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                } else {
                    com.tencent.mars.xlog.Log.i("SnsAd.AdSlideCardOverSlideLeftLogic", "refresh, overSlideTipLayout alpha=0");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(java.lang.Float.valueOf(0.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardOverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardOverSlideLeftLogic", "refresh", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;Lcom/tencent/mm/plugin/sns/ad/adxml/AdSliderFullCardInfo;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            android.widget.TextView textView = this.f352575g;
            if (textView != null) {
                java.lang.String str = a1Var.f402566c;
                if (str == null || str.length() == 0) {
                    int i18 = this.f352571c;
                    android.content.Context context = this.f352569a;
                    if (i18 != 1 ? context == null || (str = context.getString(com.tencent.mm.R.string.j7x)) == null : context == null || (str = context.getString(com.tencent.mm.R.string.pi9)) == null) {
                        str = "";
                    }
                }
                textView.setText(str);
            }
            p74.w wVar = dVar.f352528c;
            if (wVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshInteractionMark", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                wVar.f352616j = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshInteractionMark", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            }
            p74.w wVar2 = dVar.f352528c;
            if (wVar2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsAutoLoopNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
                wVar2.f352617k = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsAutoLoopNextItem", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardVideoPlayHelper");
            }
            p74.i iVar = dVar.f352530e;
            if (iVar != null) {
                iVar.j(view);
                iVar.i(this.f352580l);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardOverSlideLeftLogic");
    }
}
