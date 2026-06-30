package com.tencent.mm.plugin.flash.action;

/* loaded from: classes14.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f137168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f137169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flash.action.s f137170f;

    public p(com.tencent.mm.plugin.flash.action.s sVar, int i17, int i18) {
        this.f137170f = sVar;
        this.f137168d = i17;
        this.f137169e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.flash.action.s sVar = this.f137170f;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) sVar.f137179b.f137070i.getLayoutParams();
        int i17 = this.f137168d;
        layoutParams.width = i17;
        int i18 = this.f137169e;
        layoutParams.height = i18;
        int i19 = (i18 - i17) / 2;
        if (sVar.f137179b.f137067f.getVisibility() == 0) {
            layoutParams.topMargin = ((int) sVar.f137179b.f137066e.getCircleMarginY()) - i19;
        } else {
            layoutParams.topMargin = i65.a.h(sVar.f137179b.getContext(), com.tencent.mm.R.dimen.f480396wr) - i19;
        }
        sVar.f137179b.f137070i.setLayoutParams(layoutParams);
        sVar.f137179b.f137071m.setVisibility(8);
    }
}
