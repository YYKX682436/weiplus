package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class jc extends com.tencent.mm.plugin.finder.live.widget.n8 {

    /* renamed from: p, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.cc f118746p = new com.tencent.mm.plugin.finder.live.widget.cc(null);

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f118747h;

    /* renamed from: i, reason: collision with root package name */
    public final gk2.e f118748i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f118749m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f118750n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.jk f118751o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jc(android.view.ViewGroup r3, gk2.e r4) {
        /*
            r2 = this;
            java.lang.String r0 = "container"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = "buContext"
            kotlin.jvm.internal.o.g(r4, r0)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            r2.<init>(r0)
            r2.f118747h = r3
            r2.f118748i = r4
            java.lang.String r3 = "FinderLiveCommentDanmakuSettingWidget"
            r2.f118749m = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.jc.<init>(android.view.ViewGroup, gk2.e):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.tencent.mm.plugin.finder.live.widget.jc r5, boolean r6, boolean r7, int r8, java.lang.Object r9) {
        /*
            r9 = r8 & 1
            r0 = 0
            if (r9 == 0) goto L6
            r6 = r0
        L6:
            r9 = 2
            r8 = r8 & r9
            r1 = 1
            if (r8 == 0) goto Lc
            r7 = r1
        Lc:
            android.view.View r8 = r5.f118750n
            if (r8 == 0) goto Lbb
            if (r6 == 0) goto L8f
            com.tencent.mm.plugin.finder.view.jk r6 = r5.f118751o
            if (r6 == 0) goto L94
            com.tencent.mm.plugin.finder.live.widget.dc r2 = new com.tencent.mm.plugin.finder.live.widget.dc
            r2.<init>(r8)
            android.animation.ObjectAnimator r3 = r6.f132448c
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r3.getTarget()
            boolean r4 = r3 instanceof android.view.View
            if (r4 == 0) goto L2a
            android.view.View r3 = (android.view.View) r3
            goto L2b
        L2a:
            r3 = 0
        L2b:
            boolean r3 = kotlin.jvm.internal.o.b(r3, r8)
            if (r3 == 0) goto L4e
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "slideToRightAnim view:"
            r9.<init>(r1)
            int r1 = r8.hashCode()
            r9.append(r1)
            java.lang.String r1 = " reuseAnim"
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.String r1 = "FinderLiveSlideAnimHelper"
            r6.a(r1, r9)
            goto L7f
        L4e:
            android.content.Context r3 = com.tencent.mm.sdk.platformtools.x2.f193071a
            android.graphics.Point r3 = com.tencent.mm.ui.bl.b(r3)
            int r3 = r3.x
            float r3 = (float) r3
            float[] r9 = new float[r9]
            r4 = 0
            r9[r0] = r4
            r9[r1] = r3
            java.lang.String r1 = "translationX"
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r8, r1, r9)
            r6.f132448c = r9
            com.tencent.mm.plugin.finder.view.ik r1 = r6.f132449d
            if (r1 != 0) goto L70
            com.tencent.mm.plugin.finder.view.ik r1 = new com.tencent.mm.plugin.finder.view.ik
            r1.<init>()
        L70:
            r6.f132449d = r1
            if (r9 == 0) goto L77
            r9.addListener(r1)
        L77:
            android.animation.ObjectAnimator r9 = r6.f132448c
            if (r9 != 0) goto L7c
            goto L7f
        L7c:
            r9.setTarget(r8)
        L7f:
            com.tencent.mm.plugin.finder.view.ik r9 = r6.f132449d
            if (r9 == 0) goto L87
            r9.f132311d = r8
            r9.f132312e = r2
        L87:
            android.animation.ObjectAnimator r6 = r6.f132448c
            if (r6 == 0) goto L94
            r6.start()
            goto L94
        L8f:
            zl2.r4 r6 = zl2.r4.f473950a
            r6.Q2(r8)
        L94:
            if (r7 == 0) goto Lbb
            gk2.e r6 = r5.f118748i
            java.lang.Class<mm2.c1> r7 = mm2.c1.class
            androidx.lifecycle.c1 r6 = r6.a(r7)
            mm2.c1 r6 = (mm2.c1) r6
            r6.N1 = r0
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "PARAM_FINDER_LIVE_SCREEN_CLEAR"
            r6.putBoolean(r7, r0)
            com.tencent.mm.plugin.finder.live.plugin.l r5 = r5.getBasePlugin()
            if (r5 == 0) goto Lbb
            com.tencent.mm.plugin.finder.live.view.k0 r5 = r5.R0()
            qo0.b r7 = qo0.b.Z2
            r5.statusChange(r7, r6)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.jc.b(com.tencent.mm.plugin.finder.live.widget.jc, boolean, boolean, int, java.lang.Object):void");
    }

    public static final void c(com.tencent.mm.plugin.finder.live.widget.jc jcVar, int i17, mm2.b2 b2Var, int i18) {
        android.widget.TextView textView;
        android.view.View view = jcVar.f118750n;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(i17)) == null) {
            return;
        }
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.hc(jcVar, b2Var, i18));
    }

    public static final void d(com.tencent.mm.plugin.finder.live.widget.jc jcVar, int i17, mm2.d2 d2Var, int i18) {
        android.widget.TextView textView;
        android.view.View view = jcVar.f118750n;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(i17)) == null) {
            return;
        }
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ic(jcVar, d2Var, i18));
    }

    public final void e(mm2.b2 b2Var) {
        if (mm2.j2.F.c()) {
            android.view.View view = this.f118750n;
            android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.li8) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view2 = this.f118750n;
            android.view.View findViewById2 = view2 != null ? view2.findViewById(com.tencent.mm.R.id.li7) : null;
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f118750n;
        android.view.View findViewById3 = view3 != null ? view3.findViewById(com.tencent.mm.R.id.li8) : null;
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view4 = this.f118750n;
        android.view.View findViewById4 = view4 != null ? view4.findViewById(com.tencent.mm.R.id.li7) : null;
        if (findViewById4 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuRange", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuRange;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        jz5.l[] lVarArr = new jz5.l[3];
        mm2.b2 b2Var2 = mm2.b2.f328759d;
        android.view.View view5 = this.f118750n;
        lVarArr[0] = new jz5.l(b2Var2, view5 != null ? (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.li9) : null);
        mm2.b2 b2Var3 = mm2.b2.f328760e;
        android.view.View view6 = this.f118750n;
        lVarArr[1] = new jz5.l(b2Var3, view6 != null ? (android.widget.TextView) view6.findViewById(com.tencent.mm.R.id.li6) : null);
        mm2.b2 b2Var4 = mm2.b2.f328761f;
        android.view.View view7 = this.f118750n;
        lVarArr[2] = new jz5.l(b2Var4, view7 != null ? (android.widget.TextView) view7.findViewById(com.tencent.mm.R.id.f486519li4) : null);
        for (java.util.Map.Entry entry : kz5.c1.k(lVarArr).entrySet()) {
            mm2.b2 b2Var5 = (mm2.b2) entry.getKey();
            android.widget.TextView textView = (android.widget.TextView) entry.getValue();
            if (textView != null) {
                g(textView, b2Var5 == b2Var);
            }
        }
    }

    public final void f(mm2.d2 d2Var) {
        android.view.View view = this.f118750n;
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.oiq) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuTrans", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuTrans;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuTrans", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuTrans;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f118750n;
        android.view.View findViewById2 = view2 != null ? view2.findViewById(com.tencent.mm.R.id.oix) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuTrans", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuTrans;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommentDanmakuSettingWidget", "updateDanmakuTrans", "(Lcom/tencent/mm/plugin/finder/live/viewmodel/data/business/LiveDanmakuSlice$DanmakuTrans;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        jz5.l[] lVarArr = new jz5.l[3];
        mm2.d2 d2Var2 = mm2.d2.f328955f;
        android.view.View view3 = this.f118750n;
        lVarArr[0] = new jz5.l(d2Var2, view3 != null ? (android.widget.TextView) view3.findViewById(com.tencent.mm.R.id.oiy) : null);
        mm2.d2 d2Var3 = mm2.d2.f328954e;
        android.view.View view4 = this.f118750n;
        lVarArr[1] = new jz5.l(d2Var3, view4 != null ? (android.widget.TextView) view4.findViewById(com.tencent.mm.R.id.oit) : null);
        mm2.d2 d2Var4 = mm2.d2.f328953d;
        android.view.View view5 = this.f118750n;
        lVarArr[2] = new jz5.l(d2Var4, view5 != null ? (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.ois) : null);
        for (java.util.Map.Entry entry : kz5.c1.k(lVarArr).entrySet()) {
            mm2.d2 d2Var5 = (mm2.d2) entry.getKey();
            android.widget.TextView textView = (android.widget.TextView) entry.getValue();
            if (textView != null) {
                g(textView, d2Var5 == d2Var);
            }
        }
    }

    public final void g(android.widget.TextView textView, boolean z17) {
        if (z17) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
            textView.setBackgroundResource(com.tencent.mm.R.drawable.a0z);
        } else {
            textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
            textView.setBackgroundResource(com.tencent.mm.R.drawable.a7s);
        }
    }

    public final gk2.e getBuContext() {
        return this.f118748i;
    }

    public final android.view.ViewGroup getContainer() {
        return this.f118747h;
    }

    public final java.lang.String getTAG() {
        return this.f118749m;
    }
}
