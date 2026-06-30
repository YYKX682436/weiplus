package z84;

/* loaded from: classes4.dex */
public class k extends z84.g {

    /* renamed from: h, reason: collision with root package name */
    public boolean f470777h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f470778i;

    /* renamed from: j, reason: collision with root package name */
    public int f470779j;

    /* renamed from: k, reason: collision with root package name */
    public z84.j f470780k;

    public k(int i17, int i18) {
        super(i17, i18);
        this.f470777h = true;
        this.f470779j = 0;
        i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
    }

    @Override // z84.g, z84.d
    public void b(int i17, float f17, android.view.View view, int i18, int i19, int i27) {
        java.lang.String str;
        java.lang.String str2;
        float f18;
        float f19;
        android.view.View view2;
        android.view.View view3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doLayoutAndAnimation", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
        this.f470779j = i27;
        com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager e17 = e();
        boolean z17 = this.f470777h;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        java.lang.Float valueOf2 = java.lang.Float.valueOf(1.0f);
        if (!z17 && (view3 = this.f470778i) != null && i27 >= this.f470768d) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(valueOf);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f470778i.setScaleX(1.0f);
            this.f470778i.setScaleY(1.0f);
            this.f470778i.setTranslationX(0.0f);
        }
        if (e17 == null || this.f470766b <= 0 || this.f470765a <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doLayoutAndAnimation", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
            return;
        }
        if (i18 != 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canRelayoutNotFirstView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
            if (i19 != 0) {
                d();
                if (f17 < 0.5f) {
                    r2 = false;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canRelayoutNotFirstView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
            if (r2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAfterVisibleViewTopOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
                float f27 = this.f470775f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeOffsetFactor", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
                if (i19 == 0) {
                    f18 = i18 - f17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeOffsetFactor", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
                } else {
                    f18 = (i18 - (f17 * 2.0f)) + 1.0f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeOffsetFactor", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
                }
                int round = java.lang.Math.round(f27 * f18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAfterVisibleViewTopOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
                float f28 = (r2 - (round * 2)) / this.f470766b;
                view.setScaleX(f28);
                view.setScaleY(f28);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAfterVisibleViewStartOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
                float f29 = this.f470774e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("computeOffsetFactor", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
                if (i19 == 0) {
                    f19 = i18 - f17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeOffsetFactor", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
                } else {
                    f19 = (i18 - (f17 * 2.0f)) + 1.0f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("computeOffsetFactor", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
                }
                int round2 = java.lang.Math.round(f29 * f19);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAfterVisibleViewStartOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
                int i28 = this.f470765a;
                int i29 = ((int) ((i28 * (1.0f - f28)) / 2.0f)) + round2;
                e17.layoutDecorated(view, i29, 0, i29 + i28, this.f470766b + 0);
                if (h(i18)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentAlpha", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
                    d();
                    float f37 = (f17 - 0.5f) / 0.5f;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentAlpha", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
                    if (this.f470777h) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList2.add(java.lang.Float.valueOf(f37));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    } else {
                        if (i27 > this.f470768d) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                            arrayList3.add(java.lang.Float.valueOf(f37));
                            java.util.Collections.reverse(arrayList3);
                            str = "doLayoutAndAnimation";
                            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        } else {
                            str = "doLayoutAndAnimation";
                        }
                        if (i27 == 2 && (view2 = this.f470778i) != null) {
                            java.util.ArrayList arrayList4 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                            arrayList4.add(java.lang.Float.valueOf(f37));
                            java.util.Collections.reverse(arrayList4);
                            yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            view2.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                            this.f470778i.setScaleX(f28);
                            this.f470778i.setScaleY(f28);
                            this.f470778i.setTranslationX(round2);
                        }
                    }
                } else {
                    str = "doLayoutAndAnimation";
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(valueOf2);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            } else {
                str = "doLayoutAndAnimation";
                if (h(i18)) {
                    if (this.f470777h) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                        arrayList6.add(valueOf);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(view, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    } else if (i27 > this.f470768d) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                        arrayList7.add(valueOf);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(view, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view.setAlpha(((java.lang.Float) arrayList7.get(0)).floatValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                }
            }
            str2 = str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
        }
        int f38 = f(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isInLastCardSupportOverSlide", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
        r2 = (this.f470777h || this.f470778i == null || this.f470779j != 1) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isInLastCardSupportOverSlide", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
        if (r2) {
            f38 /= 2;
            android.view.View view4 = this.f470778i;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
            arrayList8.add(valueOf2);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view4, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList8.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f470778i.setScaleX(1.0f);
            this.f470778i.setScaleY(1.0f);
            this.f470778i.setTranslationX(f38);
            z84.j jVar = this.f470780k;
            if (jVar != null) {
                jVar.a(-f38);
            }
        }
        e17.layoutDecorated(view, f38, 0, f38 + this.f470765a, this.f470766b + 0);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
        arrayList9.add(valueOf2);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(view, arrayList9.toArray(), "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList9.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper", "doLayoutAndAnimation", "(IFLandroid/view/View;III)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        str2 = "doLayoutAndAnimation";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r6.f470779j == 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g() {
        /*
            r6 = this;
            java.lang.String r0 = "getOverSlideDistance"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "isInLastCardSupportOverSlide"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            boolean r3 = r6.f470777h
            r4 = 0
            if (r3 != 0) goto L1c
            android.view.View r3 = r6.f470778i
            if (r3 == 0) goto L1c
            int r3 = r6.f470779j
            r5 = 1
            if (r3 != r5) goto L1c
            goto L1d
        L1c:
            r5 = r4
        L1d:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            if (r5 == 0) goto L2e
            android.view.View r2 = r6.f470778i
            float r2 = r2.getTranslationX()
            int r2 = (int) r2
            int r2 = -r2
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L2e:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: z84.k.g():int");
    }

    public final boolean h(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLastVisibleView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
        com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager e17 = e();
        if (e17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLastVisibleView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
            return false;
        }
        boolean z17 = e17.r() + i17 == e17.s();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLastVisibleView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
        return z17;
    }

    public void i(z84.j jVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnSlideDistanceChangeListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
        this.f470780k = jVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnSlideDistanceChangeListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
    }

    public void j(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOverSlideTipLayout", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
        this.f470778i = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOverSlideTipLayout", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
    }
}
