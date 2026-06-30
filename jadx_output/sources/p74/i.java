package p74;

/* loaded from: classes4.dex */
public final class i extends z84.k {
    public static final p74.h D = new p74.h(null);
    public android.view.View A;
    public int B;
    public z84.j C;

    /* renamed from: l, reason: collision with root package name */
    public final float f352549l;

    /* renamed from: m, reason: collision with root package name */
    public final float f352550m;

    /* renamed from: n, reason: collision with root package name */
    public float f352551n;

    /* renamed from: o, reason: collision with root package name */
    public float f352552o;

    /* renamed from: p, reason: collision with root package name */
    public float f352553p;

    /* renamed from: q, reason: collision with root package name */
    public float f352554q;

    /* renamed from: r, reason: collision with root package name */
    public float f352555r;

    /* renamed from: s, reason: collision with root package name */
    public float f352556s;

    /* renamed from: t, reason: collision with root package name */
    public float f352557t;

    /* renamed from: u, reason: collision with root package name */
    public float f352558u;

    /* renamed from: v, reason: collision with root package name */
    public float f352559v;

    /* renamed from: w, reason: collision with root package name */
    public float f352560w;

    /* renamed from: x, reason: collision with root package name */
    public float f352561x;

    /* renamed from: y, reason: collision with root package name */
    public float f352562y;

    /* renamed from: z, reason: collision with root package name */
    public float f352563z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(float f17, float f18, float f19, float f27, int i17, float f28, float f29, int i18, kotlin.jvm.internal.i iVar) {
        super(0, 0);
        f28 = (i18 & 32) != 0 ? 0.4f : f28;
        f29 = (i18 & 64) != 0 ? 0.1f : f29;
        this.f352549l = f28;
        this.f352550m = f29;
        p74.h hVar = D;
        this.f352551n = p74.h.a(hVar, f17);
        this.f352552o = p74.h.a(hVar, f18);
        this.f352553p = p74.h.a(hVar, f19);
        float a17 = p74.h.a(hVar, f27);
        this.f352554q = a17;
        this.f352555r = this.f352551n;
        this.f352556s = this.f352552o;
        this.f352558u = this.f352553p;
        this.f352559v = a17;
        this.f352563z = 1.0f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
        this.f470777h = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInfiniteLoopMode", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
        l();
        k();
    }

    @Override // z84.g, z84.d
    public void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doChildLayoutParam", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChildLayoutParam", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
            return;
        }
        if (e() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChildLayoutParam", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = a06.d.b(this.f352555r);
            layoutParams.height = a06.d.b(this.f352556s);
            view.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChildLayoutParam", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
    }

    @Override // z84.k, z84.g, z84.d
    public void b(int i17, float f17, android.view.View view, int i18, int i19, int i27) {
        int i28;
        java.lang.String str;
        android.widget.FrameLayout frameLayout;
        java.lang.String str2;
        float f18;
        android.widget.FrameLayout frameLayout2;
        float f19;
        android.widget.FrameLayout frameLayout3;
        android.view.View view2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLayoutAndAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutAndAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
            return;
        }
        this.B = i27;
        com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager e17 = e();
        if (e17 == null || this.f352555r <= 0.0f || this.f352556s <= 0.0f) {
            com.tencent.mars.xlog.Log.e("AdSlideCardLayoutHelper", "doLayoutAndAnimation: layoutManager=" + e17 + ", mScaledCardWidthF=" + this.f352555r + ", mScaledCardHeightF=" + this.f352556s);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutAndAnimation", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
            return;
        }
        if (i27 > 2 && (view2 = this.A) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            view2.setTranslationX(0.0f);
        }
        android.view.ViewParent parent = view.getParent();
        androidx.recyclerview.widget.RecyclerView recyclerView = parent instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) parent : null;
        androidx.recyclerview.widget.k3 w07 = recyclerView != null ? recyclerView.w0(view) : null;
        p74.g gVar = w07 instanceof p74.g ? (p74.g) w07 : null;
        if (i18 != 0) {
            float f27 = this.f352549l;
            if (i18 == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutSecondCard", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
                com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager e18 = e();
                if (e18 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutSecondCard", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
                } else {
                    float e19 = e06.p.e(f17, 0.0f, 1.0f);
                    float f28 = (0.14999998f * e19) + 0.85f;
                    float f29 = 1;
                    float f37 = (f29 - e19) * this.f352561x;
                    float f38 = this.f352555r;
                    float f39 = (((f29 - f28) * f38) / 2.0f) + f37;
                    e18.layoutDecorated(view, a06.d.b(f39), 0, a06.d.b(f38 + f39), a06.d.b(this.f352556s) + 0);
                    float f47 = f27 + ((1.0f - f27) * e19);
                    if (this.B == 2) {
                        int m17 = m();
                        android.view.View view3 = this.A;
                        if (view3 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(java.lang.Float.valueOf(e19));
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardLayoutHelper", "layoutSecondCard", "(FLandroid/view/View;Lcom/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardItemViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardLayoutHelper", "layoutSecondCard", "(FLandroid/view/View;Lcom/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardItemViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            f18 = f28;
                            view3.setScaleX(f18);
                            view3.setScaleY(f18);
                            f19 = f37;
                            view3.setTranslationX(f19 - m17);
                        } else {
                            f19 = f37;
                            f18 = f28;
                        }
                        z84.j jVar = this.C;
                        if (jVar != null) {
                            jVar.a(a06.d.b(-f19));
                        }
                    } else {
                        f18 = f28;
                    }
                    view.setScaleX(f18);
                    view.setScaleY(f18);
                    if (gVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardItemViewHolder");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardItemViewHolder");
                        frameLayout2 = gVar.f352545d;
                    } else {
                        frameLayout2 = null;
                    }
                    if (frameLayout2 != null) {
                        frameLayout2.setAlpha(f47);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutSecondCard", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
                }
            } else if (i18 == 2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutThirdCard", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
                com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager e27 = e();
                if (e27 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutThirdCard", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
                } else {
                    float e28 = e06.p.e(f17, 0.0f, 1.0f);
                    float f48 = 0.68f + (0.17000002f * e28);
                    float f49 = this.f352562y;
                    float f57 = f49 + ((this.f352561x - f49) * e28);
                    float f58 = this.f352555r;
                    float f59 = f57 + (((1 - f48) * f58) / 2.0f);
                    e27.layoutDecorated(view, a06.d.b(f59), 0, a06.d.b(f58 + f59), 0 + a06.d.b(this.f352556s));
                    float f66 = this.f352550m;
                    float f67 = f66 + ((f27 - f66) * e28);
                    view.setScaleX(f48);
                    view.setScaleY(f48);
                    if (gVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardItemViewHolder");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardItemViewHolder");
                        frameLayout3 = gVar.f352545d;
                    } else {
                        frameLayout3 = null;
                    }
                    if (frameLayout3 != null) {
                        frameLayout3.setAlpha(f67);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutThirdCard", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
                }
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutFirstCard", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager e29 = e();
            if (e29 != null) {
                int b17 = a06.d.b(this.f352555r);
                int b18 = a06.d.b(this.f352556s);
                if (i17 >= 0) {
                    i28 = -(i17 % b17);
                } else {
                    int i29 = i17 % b17;
                    i28 = i29 == 0 ? 0 : (-i29) - b17;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInLastCardSupportOverSlide", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
                boolean z17 = this.A != null && this.B == 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInLastCardSupportOverSlide", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
                if (z17) {
                    i28 /= 2;
                    int m18 = m();
                    android.view.View view4 = this.A;
                    if (view4 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        str = "doLayoutAndAnimation";
                        arrayList3.add(java.lang.Float.valueOf(1.0f));
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardLayoutHelper", "layoutFirstCard", "(ILandroid/view/View;Lcom/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardItemViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view4.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardLayoutHelper", "layoutFirstCard", "(ILandroid/view/View;Lcom/tencent/mm/plugin/sns/ad/timeline/item/adSlideCard/AdSlideCardItemViewHolder;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view4.setScaleX(1.0f);
                        view4.setScaleY(1.0f);
                        view4.setTranslationX(i28 - m18);
                    } else {
                        str = "doLayoutAndAnimation";
                    }
                    z84.j jVar2 = this.C;
                    if (jVar2 != null) {
                        jVar2.a(-i28);
                    }
                } else {
                    str = "doLayoutAndAnimation";
                }
                int i37 = i28;
                e29.layoutDecorated(view, i37, 0, i37 + b17, b18 + 0);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                if (gVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardItemViewHolder");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardItemViewHolder");
                    frameLayout = gVar.f352545d;
                } else {
                    frameLayout = null;
                }
                if (frameLayout != null) {
                    frameLayout.setAlpha(1.0f);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutFirstCard", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
                str2 = str;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutFirstCard", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
        }
        str2 = "doLayoutAndAnimation";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
    }

    @Override // z84.g, z84.d
    public boolean c(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doMeasure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
        com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager e17 = e();
        if (e17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doMeasure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
            return false;
        }
        int size = android.view.View.MeasureSpec.getSize(i17);
        this.f352563z = 1.0f;
        this.f352555r = this.f352551n;
        this.f352556s = this.f352552o;
        this.f352558u = this.f352553p;
        this.f352559v = this.f352554q;
        l();
        k();
        float f17 = this.f352560w + this.f352557t;
        if (size > 0) {
            float f18 = size;
            if (f17 > f18) {
                float f19 = f18 / f17;
                this.f352563z = f19;
                this.f352555r = this.f352551n * f19;
                this.f352556s = this.f352552o * f19;
                this.f352558u = this.f352553p * f19;
                this.f352559v = this.f352554q * f19;
                l();
                k();
            }
        }
        e17.setMeasuredDimension(a06.d.b(this.f352560w + this.f352557t), a06.d.b(this.f352556s));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doMeasure", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r6.B == 1) goto L8;
     */
    @Override // z84.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g() {
        /*
            r6 = this;
            java.lang.String r0 = "getOverSlideDistance"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "isInLastCardSupportOverSlide"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            android.view.View r3 = r6.A
            r4 = 0
            if (r3 == 0) goto L18
            int r3 = r6.B
            r5 = 1
            if (r3 != r5) goto L18
            goto L19
        L18:
            r5 = r4
        L19:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            if (r5 != 0) goto L22
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        L22:
            android.view.View r2 = r6.A
            if (r2 == 0) goto L2b
            float r2 = r2.getTranslationX()
            goto L2c
        L2b:
            r2 = 0
        L2c:
            float r2 = -r2
            int r2 = a06.d.b(r2)
            int r3 = r6.m()
            int r2 = r2 - r3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p74.i.g():int");
    }

    @Override // z84.k
    public void i(z84.j jVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnSlideDistanceChangeListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
        this.C = jVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnSlideDistanceChangeListener", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
    }

    @Override // z84.k
    public void j(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOverSlideTipLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
        this.A = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOverSlideTipLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
    }

    public final void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateCardPositions", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
        float f17 = this.f352555r;
        float f18 = this.f352558u;
        this.f352561x = f18;
        float f19 = this.f352559v;
        this.f352560w = ((f17 + f18) + f19) - this.f352557t;
        this.f352562y = f18 + f19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateCardPositions", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
    }

    public final void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateCardSizes", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
        this.f352557t = this.f352555r * 0.85f * 0.8f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateCardSizes", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
    }

    public final int m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateOverSlideOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
        int b17 = a06.d.b(((this.f352553p + this.f352554q) * this.f352563z) - p74.h.a(D, 34.0f));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateOverSlideOffset", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideCard.AdSlideCardLayoutHelper");
        return b17;
    }
}
