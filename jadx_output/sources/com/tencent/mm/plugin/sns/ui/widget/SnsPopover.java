package com.tencent.mm.plugin.sns.ui.widget;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0004¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/widget/SnsPopover;", "Landroid/widget/LinearLayout;", "", "color", "Ljz5/f0;", "setTextColor", "", "size", "setTextSize", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "setText", "textResId", "relativeX", "setTriangleCenterToRelativeX", "x", "setTriangleCenterToX", "Landroid/view/View;", "targetView", "setTriangleCenterToView", "visibility", "setVisibility", "getLayoutResource", "com/tencent/mm/plugin/sns/ui/widget/d3", "com/tencent/mm/plugin/sns/ui/widget/e3", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SnsPopover extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f170887d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f170888e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.widget.d3 f170889f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f170890g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f170891h;

    /* renamed from: i, reason: collision with root package name */
    public float f170892i;

    /* renamed from: m, reason: collision with root package name */
    public int f170893m;

    /* renamed from: n, reason: collision with root package name */
    public int f170894n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SnsPopover(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final int getLayoutResource() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
        return com.tencent.mm.R.layout.epb;
    }

    public final void setText(java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
        this.f170888e.setText(charSequence);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
    }

    public final void setTextColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
        this.f170888e.setTextColor(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextColor", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
    }

    public final void setTextSize(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
        this.f170888e.setTextSize(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTextSize", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
    }

    public final void setTriangleCenterToRelativeX(int i17) {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTriangleCenterToRelativeX", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAndGetTriangle", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
        int ordinal = this.f170889f.ordinal();
        if (ordinal == 0) {
            android.view.View view2 = this.f170891h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsPopover", "setAndGetTriangle", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/widget/SnsPopover", "setAndGetTriangle", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f170890g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsPopover", "setAndGetTriangle", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/widget/SnsPopover", "setAndGetTriangle", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view = this.f170890g;
        } else {
            if (ordinal != 1) {
                jz5.j jVar = new jz5.j();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAndGetTriangle", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
                throw jVar;
            }
            android.view.View view4 = this.f170891h;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsPopover", "setAndGetTriangle", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/widget/SnsPopover", "setAndGetTriangle", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f170890g;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/widget/SnsPopover", "setAndGetTriangle", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/widget/SnsPopover", "setAndGetTriangle", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view = this.f170891h;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAndGetTriangle", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
        view.measure(0, 0);
        int measuredWidth = view.getMeasuredWidth();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams2.gravity = 8388611;
        layoutParams2.leftMargin = i17 - (measuredWidth / 2);
        view.setLayoutParams(layoutParams2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTriangleCenterToRelativeX", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
    }

    public final void setTriangleCenterToView(android.view.View targetView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTriangleCenterToView", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
        kotlin.jvm.internal.o.g(targetView, "targetView");
        int[] iArr = new int[2];
        targetView.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        setTriangleCenterToRelativeX((iArr[0] + (targetView.getWidth() / 2)) - iArr2[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTriangleCenterToView", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
    }

    public final void setTriangleCenterToX(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTriangleCenterToX", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        setTriangleCenterToRelativeX(i17 - iArr[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTriangleCenterToX", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
        int visibility = getVisibility();
        if (i17 == 0) {
            if (visibility != 0) {
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300L);
                startAnimation(alphaAnimation);
            }
            super.setVisibility(i17);
        } else if (i17 == 4) {
            super.setVisibility(i17);
        } else if (i17 == 8) {
            if (visibility == 0) {
                android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(300L);
                startAnimation(alphaAnimation2);
            }
            super.setVisibility(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SnsPopover(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, null, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SnsPopover(android.content.Context r5, android.util.AttributeSet r6, int r7, com.tencent.mm.plugin.sns.ui.widget.e3 r8, int r9, kotlin.jvm.internal.i r10) {
        /*
            r4 = this;
            r10 = r9 & 2
            if (r10 == 0) goto L5
            r6 = 0
        L5:
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto Lb
            r7 = r0
        Lb:
            r10 = 8
            r9 = r9 & r10
            if (r9 == 0) goto L12
            com.tencent.mm.plugin.sns.ui.widget.e3 r8 = com.tencent.mm.plugin.sns.ui.widget.e3.f171123d
        L12:
            java.lang.String r9 = "context"
            kotlin.jvm.internal.o.g(r5, r9)
            java.lang.String r9 = "size"
            kotlin.jvm.internal.o.g(r8, r9)
            r4.<init>(r5, r6, r7)
            com.tencent.mm.plugin.sns.ui.widget.d3 r7 = com.tencent.mm.plugin.sns.ui.widget.d3.f171114d
            r4.f170889f = r7
            r7 = 1094713344(0x41400000, float:12.0)
            r4.f170892i = r7
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r5)
            int r9 = r4.getLayoutResource()
            r1 = 1
            android.view.View r7 = r7.inflate(r9, r4, r1)
            java.lang.String r9 = "inflate(...)"
            kotlin.jvm.internal.o.f(r7, r9)
            r4.f170887d = r7
            r9 = 2131316925(0x7f0950bd, float:1.8252345E38)
            android.view.View r9 = r7.findViewById(r9)
            java.lang.String r2 = "findViewById(...)"
            kotlin.jvm.internal.o.f(r9, r2)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r4.f170888e = r9
            r3 = 2131316927(0x7f0950bf, float:1.825235E38)
            android.view.View r3 = r7.findViewById(r3)
            kotlin.jvm.internal.o.f(r3, r2)
            r4.f170890g = r3
            r3 = 2131316926(0x7f0950be, float:1.8252347E38)
            android.view.View r7 = r7.findViewById(r3)
            kotlin.jvm.internal.o.f(r7, r2)
            r4.f170891h = r7
            r4.setBackgroundColor(r0)
            if (r6 == 0) goto L87
            r7 = 16843087(0x101014f, float:2.3694497E-38)
            int[] r7 = new int[]{r7}
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7)
            java.lang.String r6 = "obtainStyledAttributes(...)"
            kotlin.jvm.internal.o.f(r5, r6)
            java.lang.String r6 = r5.getString(r0)
            if (r6 == 0) goto L84
            r9.setText(r6)
        L84:
            r5.recycle()
        L87:
            java.lang.String r5 = "initPopover"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.widget.SnsPopover"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
            int r7 = r8.ordinal()
            if (r7 == 0) goto Lc2
            if (r7 == r1) goto L98
            goto Le9
        L98:
            android.content.Context r7 = r4.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131165831(0x7f070287, float:1.794589E38)
            float r7 = r7.getDimension(r8)
            r4.f170892i = r7
            android.content.Context r7 = r4.getContext()
            r8 = 16
            int r7 = i65.a.b(r7, r8)
            r4.f170893m = r7
            android.content.Context r7 = r4.getContext()
            r8 = 10
            int r7 = i65.a.b(r7, r8)
            r4.f170894n = r7
            goto Le9
        Lc2:
            android.content.Context r7 = r4.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131165832(0x7f070288, float:1.7945892E38)
            float r7 = r7.getDimension(r8)
            r4.f170892i = r7
            android.content.Context r7 = r4.getContext()
            r8 = 12
            int r7 = i65.a.b(r7, r8)
            r4.f170893m = r7
            android.content.Context r7 = r4.getContext()
            int r7 = i65.a.b(r7, r10)
            r4.f170894n = r7
        Le9:
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            float r8 = r4.f170892i
            r7.setCornerRadius(r8)
            android.content.Context r8 = r4.getContext()
            r10 = 2131100015(0x7f06016f, float:1.78124E38)
            int r8 = r8.getColor(r10)
            r7.setColor(r8)
            r9.setBackground(r7)
            int r7 = r4.f170893m
            int r8 = r4.f170894n
            r9.setPadding(r7, r8, r7, r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.widget.SnsPopover.<init>(android.content.Context, android.util.AttributeSet, int, com.tencent.mm.plugin.sns.ui.widget.e3, int, kotlin.jvm.internal.i):void");
    }

    public final void setText(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setText", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
        this.f170888e.setText(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setText", "com.tencent.mm.plugin.sns.ui.widget.SnsPopover");
    }
}
