package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class zd {
    public zd(kotlin.jvm.internal.i iVar) {
    }

    public final void a(r45.wv3 wv3Var, android.view.View view, com.tencent.mm.view.MMPAGView mMPAGView, android.view.View view2, com.tencent.mm.view.MMPAGView mMPAGView2, ym5.w1 w1Var, kotlinx.coroutines.y0 y0Var) {
        int i17;
        int i18;
        android.view.View view3;
        kotlinx.coroutines.y0 y0Var2;
        boolean z17;
        int i19;
        kotlinx.coroutines.y0 y0Var3;
        r45.xv3 xv3Var;
        if ((wv3Var != null ? wv3Var.f389501g : null) != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0((wv3Var == null || (xv3Var = wv3Var.f389501g) == null) ? null : xv3Var.f390494x)) {
                r45.xv3 xv3Var2 = wv3Var.f389501g;
                java.lang.Integer valueOf = xv3Var2 != null ? java.lang.Integer.valueOf(xv3Var2.D) : null;
                if (mMPAGView != null) {
                    mMPAGView.a(w1Var);
                }
                if (mMPAGView != null) {
                    mMPAGView.setRepeatCount(0);
                }
                if (mMPAGView != null) {
                    mMPAGView.setScaleMode(3);
                }
                if (mMPAGView2 != null) {
                    mMPAGView2.a(w1Var);
                }
                if (mMPAGView2 != null) {
                    mMPAGView2.setRepeatCount(0);
                }
                if (mMPAGView2 != null) {
                    mMPAGView2.setScaleMode(3);
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                if (valueOf != null && valueOf.intValue() == 2) {
                    if (view == null) {
                        i19 = 1;
                        y0Var3 = y0Var;
                    } else {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion", "renderEnvelopeDynamicStatic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        i19 = 1;
                        y0Var3 = y0Var;
                        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion", "renderEnvelopeDynamicStatic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    com.tencent.mm.plugin.luckymoney.model.n3.f145460a.b(wv3Var, i19, y0Var3, new com.tencent.mm.plugin.luckymoney.ui.wd(currentTimeMillis, view2, wv3Var, mMPAGView2));
                    return;
                }
                if (view2 == null) {
                    view3 = view2;
                    y0Var2 = y0Var;
                    z17 = true;
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    view3 = view2;
                    y0Var2 = y0Var;
                    z17 = true;
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion", "renderEnvelopeDynamicStatic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion", "renderEnvelopeDynamicStatic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
                if (view != null) {
                    view.setOutlineProvider(new zl5.a(z17, z17, b17));
                }
                if (view != null) {
                    view.setClipToOutline(z17);
                }
                com.tencent.mm.plugin.luckymoney.model.n3.f145460a.b(wv3Var, z17 ? 1 : 0, y0Var2, new com.tencent.mm.plugin.luckymoney.ui.yd(currentTimeMillis, view2, view, wv3Var, mMPAGView));
                return;
            }
        }
        if (view == null) {
            i18 = 0;
            i17 = 8;
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            i17 = 8;
            i18 = 0;
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion", "renderEnvelopeDynamicStatic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion", "renderEnvelopeDynamicStatic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion", "renderEnvelopeDynamicStatic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList4.get(i18)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyNewReceiveUI$Companion", "renderEnvelopeDynamicStatic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;Lcom/tencent/mm/view/MMPAGView;Lcom/tencent/mm/view/MMPAGView$MMPAGViewListener;Lkotlinx/coroutines/CoroutineScope;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
