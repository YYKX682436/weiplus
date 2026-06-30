package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class f9 implements android.text.Html.ImageGetter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h9 f165189a;

    public f9(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h9 h9Var) {
        this.f165189a = h9Var;
    }

    @Override // android.text.Html.ImageGetter
    public android.graphics.drawable.Drawable getDrawable(java.lang.String str) {
        android.graphics.drawable.Drawable drawable;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1");
        java.lang.String l17 = za4.t0.l("adId", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(l17) || !com.tencent.mm.vfs.w6.j(l17)) {
            za4.t0.b("adId", str, false, 0, 0, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e9(this));
            drawable = null;
        } else {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h9 h9Var = this.f165189a;
            drawable = a84.z.g(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i9.O(h9Var.f165241f).getResources(), l17);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicHeight() != 0 ? (drawable.getIntrinsicWidth() * ((int) com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i9.P(h9Var.f165241f).G)) / drawable.getIntrinsicHeight() : drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() != 0 ? (int) com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i9.P(h9Var.f165241f).G : drawable.getIntrinsicHeight());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1");
        return drawable;
    }
}
