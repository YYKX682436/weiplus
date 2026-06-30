package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class u3 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2 {

    /* renamed from: w, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r3 f162957w = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.r3(null);

    /* renamed from: s, reason: collision with root package name */
    public final ab4.h0 f162958s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f162959t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f162960u;

    /* renamed from: v, reason: collision with root package name */
    public int f162961v;

    public u3(android.content.Context context, ab4.h0 h0Var, android.view.ViewGroup viewGroup) {
        super(context, h0Var, viewGroup);
        this.f162958s = h0Var;
        this.f162959t = jz5.h.b(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.s3(this));
        this.f162960u = jz5.h.b(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t3(this));
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        android.view.View view = this.f165056n;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            ab4.h0 h0Var = this.f162958s;
            marginLayoutParams.leftMargin = h0Var != null ? (int) h0Var.f2821h : 0;
            marginLayoutParams.topMargin = h0Var != null ? (int) h0Var.f2819f : 0;
            marginLayoutParams.rightMargin = h0Var != null ? (int) h0Var.f2822i : 0;
            marginLayoutParams.bottomMargin = h0Var != null ? (int) h0Var.f2820g : 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPadding", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
    }

    public final android.widget.TextView O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTextView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f162960u).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTextView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        return textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ef, code lost:
    
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFontColorSpecial", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
        r15 = r8.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFontColorSpecial", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
        r14 = java.lang.Integer.valueOf(r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0096 A[Catch: all -> 0x018f, TryCatch #0 {all -> 0x018f, blocks: (B:3:0x0008, B:6:0x0019, B:9:0x0022, B:10:0x002c, B:12:0x0033, B:13:0x0039, B:14:0x0145, B:16:0x014b, B:19:0x0152, B:23:0x0164, B:39:0x0179, B:29:0x017f, B:34:0x0182, B:55:0x007f, B:57:0x0083, B:58:0x008f, B:59:0x0092, B:61:0x0096, B:62:0x009c, B:64:0x00af, B:65:0x00bb, B:67:0x00c3, B:68:0x00cf, B:72:0x00ef, B:73:0x00ff, B:75:0x0103, B:76:0x0109, B:78:0x0117, B:79:0x0121, B:81:0x0128, B:82:0x012e, B:86:0x00dc, B:89:0x00e4, B:94:0x0065, B:96:0x006b, B:98:0x006f, B:99:0x007b, B:101:0x0048, B:103:0x004e, B:105:0x0052, B:106:0x005e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af A[Catch: all -> 0x018f, TryCatch #0 {all -> 0x018f, blocks: (B:3:0x0008, B:6:0x0019, B:9:0x0022, B:10:0x002c, B:12:0x0033, B:13:0x0039, B:14:0x0145, B:16:0x014b, B:19:0x0152, B:23:0x0164, B:39:0x0179, B:29:0x017f, B:34:0x0182, B:55:0x007f, B:57:0x0083, B:58:0x008f, B:59:0x0092, B:61:0x0096, B:62:0x009c, B:64:0x00af, B:65:0x00bb, B:67:0x00c3, B:68:0x00cf, B:72:0x00ef, B:73:0x00ff, B:75:0x0103, B:76:0x0109, B:78:0x0117, B:79:0x0121, B:81:0x0128, B:82:0x012e, B:86:0x00dc, B:89:0x00e4, B:94:0x0065, B:96:0x006b, B:98:0x006f, B:99:0x007b, B:101:0x0048, B:103:0x004e, B:105:0x0052, B:106:0x005e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3 A[Catch: all -> 0x018f, TryCatch #0 {all -> 0x018f, blocks: (B:3:0x0008, B:6:0x0019, B:9:0x0022, B:10:0x002c, B:12:0x0033, B:13:0x0039, B:14:0x0145, B:16:0x014b, B:19:0x0152, B:23:0x0164, B:39:0x0179, B:29:0x017f, B:34:0x0182, B:55:0x007f, B:57:0x0083, B:58:0x008f, B:59:0x0092, B:61:0x0096, B:62:0x009c, B:64:0x00af, B:65:0x00bb, B:67:0x00c3, B:68:0x00cf, B:72:0x00ef, B:73:0x00ff, B:75:0x0103, B:76:0x0109, B:78:0x0117, B:79:0x0121, B:81:0x0128, B:82:0x012e, B:86:0x00dc, B:89:0x00e4, B:94:0x0065, B:96:0x006b, B:98:0x006f, B:99:0x007b, B:101:0x0048, B:103:0x004e, B:105:0x0052, B:106:0x005e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0103 A[Catch: all -> 0x018f, TryCatch #0 {all -> 0x018f, blocks: (B:3:0x0008, B:6:0x0019, B:9:0x0022, B:10:0x002c, B:12:0x0033, B:13:0x0039, B:14:0x0145, B:16:0x014b, B:19:0x0152, B:23:0x0164, B:39:0x0179, B:29:0x017f, B:34:0x0182, B:55:0x007f, B:57:0x0083, B:58:0x008f, B:59:0x0092, B:61:0x0096, B:62:0x009c, B:64:0x00af, B:65:0x00bb, B:67:0x00c3, B:68:0x00cf, B:72:0x00ef, B:73:0x00ff, B:75:0x0103, B:76:0x0109, B:78:0x0117, B:79:0x0121, B:81:0x0128, B:82:0x012e, B:86:0x00dc, B:89:0x00e4, B:94:0x0065, B:96:0x006b, B:98:0x006f, B:99:0x007b, B:101:0x0048, B:103:0x004e, B:105:0x0052, B:106:0x005e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0117 A[Catch: all -> 0x018f, TryCatch #0 {all -> 0x018f, blocks: (B:3:0x0008, B:6:0x0019, B:9:0x0022, B:10:0x002c, B:12:0x0033, B:13:0x0039, B:14:0x0145, B:16:0x014b, B:19:0x0152, B:23:0x0164, B:39:0x0179, B:29:0x017f, B:34:0x0182, B:55:0x007f, B:57:0x0083, B:58:0x008f, B:59:0x0092, B:61:0x0096, B:62:0x009c, B:64:0x00af, B:65:0x00bb, B:67:0x00c3, B:68:0x00cf, B:72:0x00ef, B:73:0x00ff, B:75:0x0103, B:76:0x0109, B:78:0x0117, B:79:0x0121, B:81:0x0128, B:82:0x012e, B:86:0x00dc, B:89:0x00e4, B:94:0x0065, B:96:0x006b, B:98:0x006f, B:99:0x007b, B:101:0x0048, B:103:0x004e, B:105:0x0052, B:106:0x005e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0128 A[Catch: all -> 0x018f, TryCatch #0 {all -> 0x018f, blocks: (B:3:0x0008, B:6:0x0019, B:9:0x0022, B:10:0x002c, B:12:0x0033, B:13:0x0039, B:14:0x0145, B:16:0x014b, B:19:0x0152, B:23:0x0164, B:39:0x0179, B:29:0x017f, B:34:0x0182, B:55:0x007f, B:57:0x0083, B:58:0x008f, B:59:0x0092, B:61:0x0096, B:62:0x009c, B:64:0x00af, B:65:0x00bb, B:67:0x00c3, B:68:0x00cf, B:72:0x00ef, B:73:0x00ff, B:75:0x0103, B:76:0x0109, B:78:0x0117, B:79:0x0121, B:81:0x0128, B:82:0x012e, B:86:0x00dc, B:89:0x00e4, B:94:0x0065, B:96:0x006b, B:98:0x006f, B:99:0x007b, B:101:0x0048, B:103:0x004e, B:105:0x0052, B:106:0x005e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00dc A[Catch: all -> 0x018f, TryCatch #0 {all -> 0x018f, blocks: (B:3:0x0008, B:6:0x0019, B:9:0x0022, B:10:0x002c, B:12:0x0033, B:13:0x0039, B:14:0x0145, B:16:0x014b, B:19:0x0152, B:23:0x0164, B:39:0x0179, B:29:0x017f, B:34:0x0182, B:55:0x007f, B:57:0x0083, B:58:0x008f, B:59:0x0092, B:61:0x0096, B:62:0x009c, B:64:0x00af, B:65:0x00bb, B:67:0x00c3, B:68:0x00cf, B:72:0x00ef, B:73:0x00ff, B:75:0x0103, B:76:0x0109, B:78:0x0117, B:79:0x0121, B:81:0x0128, B:82:0x012e, B:86:0x00dc, B:89:0x00e4, B:94:0x0065, B:96:0x006b, B:98:0x006f, B:99:0x007b, B:101:0x0048, B:103:0x004e, B:105:0x0052, B:106:0x005e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e4 A[Catch: all -> 0x018f, TryCatch #0 {all -> 0x018f, blocks: (B:3:0x0008, B:6:0x0019, B:9:0x0022, B:10:0x002c, B:12:0x0033, B:13:0x0039, B:14:0x0145, B:16:0x014b, B:19:0x0152, B:23:0x0164, B:39:0x0179, B:29:0x017f, B:34:0x0182, B:55:0x007f, B:57:0x0083, B:58:0x008f, B:59:0x0092, B:61:0x0096, B:62:0x009c, B:64:0x00af, B:65:0x00bb, B:67:0x00c3, B:68:0x00cf, B:72:0x00ef, B:73:0x00ff, B:75:0x0103, B:76:0x0109, B:78:0x0117, B:79:0x0121, B:81:0x0128, B:82:0x012e, B:86:0x00dc, B:89:0x00e4, B:94:0x0065, B:96:0x006b, B:98:0x006f, B:99:0x007b, B:101:0x0048, B:103:0x004e, B:105:0x0052, B:106:0x005e), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void P(java.lang.Integer r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u3.P(java.lang.Integer, java.lang.String):void");
    }

    public final void R(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setClickSource", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        this.f162961v = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setClickSource", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
    }

    public final void S(boolean z17, boolean z18) {
        android.animation.ObjectAnimator ofFloat;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        android.view.View view = this.f165056n;
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
            return;
        }
        com.tencent.mars.xlog.Log.i("AdLandingRandomPickCardTitleComp", "setVisibility, visible is " + z17 + ", withAnim is " + z18);
        if (z18) {
            if (z17) {
                ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 1.0f);
                ofFloat.setDuration(150L);
            } else {
                ofFloat = android.animation.ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 0.0f);
                ofFloat.setDuration(200L);
            }
            ofFloat.start();
        } else {
            float f17 = z17 ? 1.0f : 0.0f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingRandomPickCardTitleComp", "setVisibility", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingRandomPickCardTitleComp", "setVisibility", "(ZZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        float f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        super.k();
        android.widget.TextView O = O();
        if (O != null) {
            O.setGravity(17);
        }
        android.widget.TextView O2 = O();
        if (O2 != null) {
            O2.setIncludeFontPadding(false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMTextLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f162959t).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMTextLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup != null ? viewGroup.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.addRule(12, -1);
        }
        android.widget.TextView O3 = O();
        com.tencent.mm.ui.bk.r0(O3 != null ? O3.getPaint() : null, 0.8f);
        android.widget.TextView O4 = O();
        if (O4 != null) {
            ab4.h0 h0Var = this.f162958s;
            if (h0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTextSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
                f17 = h0Var.P;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTextSize", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageComponentRandomPickCardTitleInfo");
            } else {
                f17 = 0.0f;
            }
            O4.setTextSize(0, f17);
        }
        android.widget.TextView O5 = O();
        if (O5 != null) {
            O5.setShadowLayer(5.0f, 0.0f, 5.0f, android.graphics.Color.parseColor("#4D000000"));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public int v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayout", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingRandomPickCardTitleComp");
        return com.tencent.mm.R.layout.f489490cq0;
    }
}
