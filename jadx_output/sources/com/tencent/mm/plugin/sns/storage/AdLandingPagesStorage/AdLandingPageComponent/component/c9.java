package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class c9 implements android.text.Html.ImageGetter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e9 f165124a;

    public c9(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e9 e9Var) {
        this.f165124a = e9Var;
    }

    @Override // android.text.Html.ImageGetter
    public android.graphics.drawable.Drawable getDrawable(java.lang.String str) {
        android.graphics.drawable.Drawable drawable;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1$1$1");
        java.lang.String l17 = za4.t0.l("adId", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(l17) || !com.tencent.mm.vfs.w6.j(l17)) {
            drawable = null;
        } else {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.e9 e9Var = this.f165124a;
            drawable = a84.z.g(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i9.O(e9Var.f165175a.f165189a.f165241f).getResources(), l17);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicHeight() != 0 ? (drawable.getIntrinsicWidth() * ((int) com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i9.P(e9Var.f165175a.f165189a.f165241f).G)) / drawable.getIntrinsicHeight() : drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() != 0 ? (int) com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i9.P(e9Var.f165175a.f165189a.f165241f).G : drawable.getIntrinsicHeight());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDrawable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageTextComponent$1$1$1$1");
        return drawable;
    }
}
