package j94;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final j94.b f298544a = new j94.b();

    public static final void a(android.widget.ImageView imageView, r45.d43 foldSnsInfo) {
        java.lang.String str;
        j94.a b17;
        r45.bo boVar;
        r45.bo boVar2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindBrandIconView", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        kotlin.jvm.internal.o.g(imageView, "imageView");
        kotlin.jvm.internal.o.g(foldSnsInfo, "foldSnsInfo");
        r45.x30 x30Var = foldSnsInfo.f372080p;
        if (x30Var == null) {
            java.util.LinkedList linkedList = foldSnsInfo.f372072e;
            x30Var = linkedList != null ? (r45.x30) kz5.n0.Z(linkedList) : null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resolveBrandIconRenderInfo", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        boolean C = com.tencent.mm.ui.bk.C();
        boolean z17 = true;
        boolean z18 = x30Var != null && x30Var.f389728d == 26;
        j94.b bVar = f298544a;
        if (z18) {
            r45.wm4 wm4Var = foldSnsInfo.f372084t;
            java.lang.String str2 = wm4Var != null ? wm4Var.f389284n : null;
            str = wm4Var != null ? wm4Var.f389289s : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pickIconUrl", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            if (C) {
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    str2 = str;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pickIconUrl", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            b17 = bVar.b("minishop_data.brand_icon", str2, (wm4Var == null || (boVar2 = wm4Var.f389288r) == null) ? 0 : boVar2.f370903d, (wm4Var == null || (boVar = wm4Var.f389288r) == null) ? 0 : boVar.f370904e);
        } else {
            r45.zn znVar = foldSnsInfo.B;
            java.lang.String str3 = znVar != null ? znVar.f392215d : null;
            str = znVar != null ? znVar.f392216e : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pickIconUrl", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            if (C) {
                if (str != null && str.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    str3 = str;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pickIconUrl", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            b17 = bVar.b("brand_badge_info", str3, znVar != null ? znVar.f392217f : 0, znVar != null ? znVar.f392218g : 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resolveBrandIconRenderInfo", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        if (b17 == null) {
            imageView.setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindBrandIconView", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            return;
        }
        float q17 = i65.a.q(imageView.getContext());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWidthDp", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWidthDp", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        int a17 = (int) (c44.b.a(b17.f298542b) * q17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeightDp", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeightDp", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        int a18 = (int) (c44.b.a(b17.f298543c) * q17);
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null && (layoutParams.width != a17 || layoutParams.height != a18)) {
            layoutParams.width = a17;
            layoutParams.height = a18;
            imageView.setLayoutParams(layoutParams);
        }
        imageView.setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIconUrl", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIconUrl", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper$BrandIconRenderInfo");
        a84.m.a(b17.f298541a, imageView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindBrandIconView", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
    }

    public static jz5.l c(android.content.Context context, int i17, int i18, int i19, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdMaterialAreaSize$default", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        if ((i19 & 2) != 0) {
            i17 = 8;
        }
        if ((i19 & 4) != 0) {
            i18 = 20;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdMaterialAreaSize", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        kotlin.jvm.internal.o.g(context, "context");
        int b17 = context.getResources().getDisplayMetrics().widthPixels - i65.a.b(context, (i18 * 2) + (i17 * 2));
        jz5.l lVar = new jz5.l(java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf((int) ((b17 * 9.0f) / 16.0f)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdMaterialAreaSize", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdMaterialAreaSize$default", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        return lVar;
    }

    public static final boolean d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableWsFoldAd", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ws_fold_disable_ad, 0) == 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableWsFoldAd", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            return z17;
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            java.lang.Object m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                ca4.q.c("WsFoldAdHelper", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
            }
            kotlin.Result.m527isFailureimpl(m521constructorimpl);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableWsFoldAd", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            return true;
        }
    }

    public final j94.a b(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildRenderInfo", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        if (!(str2 == null || str2.length() == 0) && i17 > 0 && i18 > 0) {
            j94.a aVar = new j94.a(str2, i17, i18);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildRenderInfo", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
            return aVar;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(str2 == null || str2.length() == 0);
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = java.lang.Integer.valueOf(i18);
        com.tencent.mars.xlog.Log.w("WsFoldAdHelper", "resolveBrandIconRenderInfo, %s missing fields, iconUrlEmpty=%b, widthDp=%d, heightDp=%d", objArr);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildRenderInfo", "com.tencent.mm.plugin.sns.ad.wsfold.helper.WsFoldAdHelper");
        return null;
    }
}
