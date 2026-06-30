package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class AsyncNormalTextView extends com.tencent.mm.plugin.sns.ui.CollapsibleTextView {
    public java.lang.String A;
    public com.tencent.mm.plugin.sns.ui.bs B;
    public com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder C;
    public int D;

    /* renamed from: z, reason: collision with root package name */
    public final android.content.Context f166218z;

    public AsyncNormalTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.D = 0;
        this.f166218z = context;
    }

    public void e() {
        java.lang.CharSequence charSequence;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AsyncNormalTextView", "buildContent: show , textType:%d", java.lang.Integer.valueOf(this.D));
            java.lang.System.currentTimeMillis();
            setVisibility(0);
            int i17 = this.D;
            android.content.Context context = this.f166218z;
            if (i17 == 1) {
                if (this.A.length() > 100) {
                    str = this.A.substring(0, 100) + "...";
                } else {
                    str = this.A;
                }
                this.A = str;
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str2 = this.A;
                float textSize = this.f166256f.getTextSize();
                ((ke0.e) xVar).getClass();
                java.lang.CharSequence f17 = ga4.m.f(this.f166267t.f170025a.field_snsId, new android.text.SpannableStringBuilder(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize)), 0, 2);
                int i18 = this.D;
                android.widget.TextView.BufferType bufferType = android.widget.TextView.BufferType.NORMAL;
                com.tencent.mm.plugin.sns.ui.bs bsVar = this.B;
                java.util.HashMap hashMap = bsVar.f168051q;
                com.tencent.mm.plugin.sns.ui.ns nsVar = this.f166267t;
                c(i18, f17, bufferType, hashMap, nsVar.f170036h, nsVar.f170037i, bsVar, this.A, nsVar.f170044p);
            } else {
                com.tencent.mm.plugin.sns.ui.ns nsVar2 = this.f166267t;
                java.lang.CharSequence charSequence2 = nsVar2 != null ? nsVar2.f170033e : null;
                if (charSequence2 == null) {
                    le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String str3 = this.A;
                    float textSize2 = this.f166256f.getTextSize();
                    ((ke0.e) xVar2).getClass();
                    charSequence = ga4.m.f(this.f166267t.f170025a.field_snsId, new android.text.SpannableStringBuilder(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str3, textSize2)), 0, 2);
                } else {
                    charSequence = charSequence2;
                }
                com.tencent.mm.plugin.sns.ui.ns nsVar3 = this.f166267t;
                if (nsVar3 != null) {
                    int i19 = this.D;
                    android.widget.TextView.BufferType bufferType2 = android.widget.TextView.BufferType.SPANNABLE;
                    com.tencent.mm.plugin.sns.ui.bs bsVar2 = this.B;
                    c(i19, charSequence, bufferType2, bsVar2.f168051q, nsVar3.f170036h, nsVar3.f170037i, bsVar2, this.A, nsVar3.f170044p);
                }
            }
            com.tencent.mm.plugin.sns.ui.ns nsVar4 = this.f166267t;
            com.tencent.mm.plugin.sns.ui.go goVar = new com.tencent.mm.plugin.sns.ui.go(nsVar4.f170037i, nsVar4.f170036h, false, false, 1);
            goVar.f168450f = nsVar4.f170051w;
            this.f166256f.setTag(goVar);
            com.tencent.mm.plugin.sns.ui.SnsTextView snsTextView = this.f166257g;
            if (snsTextView != null) {
                snsTextView.setTag(goVar);
            }
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = this.C;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindOpTvCollapseHolder", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
            this.f166258h.setTag(baseViewHolder);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindOpTvCollapseHolder", "com.tencent.mm.plugin.sns.ui.CollapsibleTextView");
            setTag(this.C);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    public java.lang.String getContent() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        java.lang.String str = this.A;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        return str;
    }

    public void i(java.lang.String str, com.tencent.mm.plugin.sns.ui.bs bsVar, int i17, com.tencent.mm.plugin.sns.ui.ns nsVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        this.D = i17;
        this.A = str;
        this.B = bsVar;
        this.f166267t = nsVar;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.A);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInitializeAccessibilityNodeInfo", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    @Override // com.tencent.mm.plugin.sns.ui.CollapsibleTextView, android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        super.onMeasure(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().add(this.A);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPopulateAccessibilityEvent", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    public void setContentWidth(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentWidth", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        if (this.f166257g != null) {
            this.f166256f.setSpecialWidth(i17);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i17, -2);
            this.f166257g.setLayoutParams(layoutParams);
            this.f166256f.setLayoutParams(layoutParams);
            this.f166258h.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentWidth", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }

    public void setShow(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShow", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
        this.C = baseViewHolder;
        e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShow", "com.tencent.mm.plugin.sns.ui.AsyncNormalTextView");
    }
}
