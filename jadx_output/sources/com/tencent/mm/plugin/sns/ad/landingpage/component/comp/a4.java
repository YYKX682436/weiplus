package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f162752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b4 f162753e;

    public a4(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b4 b4Var, java.util.ArrayList arrayList) {
        this.f162753e = b4Var;
        this.f162752d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        java.lang.String str4;
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.widget.FrameLayout.LayoutParams layoutParams2;
        java.lang.String str5 = "run";
        java.lang.String str6 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$1$1";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$1$1");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.b4 b4Var = this.f162753e;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4 g4Var = b4Var.f162766e;
        int i18 = g4Var.D;
        f54.g0 g0Var = b4Var.f162765d;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4 g4Var2 = b4Var.f162766e;
        int i19 = 1;
        if (i18 == 1) {
            g4Var.C.setText(g0Var.N);
            a84.z.h(g0Var.backgroundImgCommon, g4Var2.f162834w);
            java.lang.String str7 = g0Var.adAvatarImg;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            g4Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addStrangerAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            g4Var2.A.removeAllViews();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (!android.text.TextUtils.isEmpty(str7)) {
                arrayList.add(str7);
            }
            java.util.ArrayList arrayList2 = g0Var.L;
            if (arrayList2 != null && arrayList2.size() > 0) {
                arrayList.addAll(g0Var.L);
            }
            com.tencent.mars.xlog.Log.i("AdLandingSocialCardComponent", "addStrangerAvatar, count=" + arrayList.size());
            int i27 = 0;
            int i28 = 0;
            while (true) {
                if (i27 >= arrayList.size()) {
                    str = str5;
                    break;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStrangerAvatarLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                android.content.Context context = g4Var2.f165049d;
                if (i27 == 0) {
                    str = str5;
                    int b17 = i65.a.b(context, 36);
                    layoutParams = new android.widget.FrameLayout.LayoutParams(b17, b17);
                    layoutParams.gravity = 83;
                    layoutParams.leftMargin = i65.a.b(context, 56);
                    layoutParams.bottomMargin = i65.a.b(context, 9);
                } else if (i27 != i19) {
                    if (i27 == 2) {
                        str = str5;
                        int b18 = i65.a.b(context, 32);
                        layoutParams2 = new android.widget.FrameLayout.LayoutParams(b18, b18);
                        layoutParams2.gravity = 51;
                        layoutParams2.leftMargin = i65.a.b(context, 42);
                        layoutParams2.topMargin = i65.a.b(context, 20);
                    } else if (i27 == 3) {
                        str = str5;
                        int b19 = i65.a.b(context, 20);
                        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(b19, b19);
                        layoutParams3.gravity = 53;
                        layoutParams3.rightMargin = i65.a.b(context, 77);
                        layoutParams3.topMargin = i65.a.b(context, 17);
                        layoutParams = layoutParams3;
                    } else if (i27 != 4) {
                        if (i27 != 5) {
                            layoutParams = null;
                        } else {
                            int b27 = i65.a.b(context, 32);
                            layoutParams = new android.widget.FrameLayout.LayoutParams(b27, b27);
                            layoutParams.gravity = 85;
                            layoutParams.rightMargin = i65.a.b(context, 33);
                            layoutParams.bottomMargin = i65.a.b(context, 14);
                        }
                        str = str5;
                    } else {
                        int b28 = i65.a.b(context, 34);
                        str = str5;
                        layoutParams2 = new android.widget.FrameLayout.LayoutParams(b28, b28);
                        layoutParams2.gravity = 53;
                        layoutParams2.rightMargin = i65.a.b(context, 4);
                        layoutParams2.topMargin = i65.a.b(context, 28);
                    }
                    layoutParams = layoutParams2;
                } else {
                    str = str5;
                    int b29 = i65.a.b(context, 20);
                    layoutParams = new android.widget.FrameLayout.LayoutParams(b29, b29);
                    layoutParams.gravity = 83;
                    layoutParams.leftMargin = i65.a.b(context, 22);
                    layoutParams.bottomMargin = i65.a.b(context, 67);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStrangerAvatarLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
                if (layoutParams != null) {
                    android.widget.ImageView imageView = new android.widget.ImageView(context);
                    imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                    imageView.setImageBitmap(g4Var2.E);
                    imageView.setOutlineProvider(g4Var2.F);
                    imageView.setClipToOutline(true);
                    g4Var2.A.addView(imageView, layoutParams);
                    java.lang.String str8 = (java.lang.String) arrayList.get(i27);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCicleImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    a84.z.i(str8, imageView, 1.0f, false);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCicleImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                    i28++;
                    if (i28 >= 6) {
                        break;
                    }
                }
                i27++;
                str5 = str;
                i19 = 1;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addStrangerAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            g4Var2.A.setVisibility(0);
            g4Var2.B.setVisibility(8);
            str4 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$1$1";
        } else {
            str = "run";
            java.lang.String str9 = g0Var.M;
            com.tencent.mars.xlog.Log.i("AdLandingSocialCardComponent", "desc raw=" + str9);
            java.util.ArrayList arrayList3 = this.f162752d;
            if (str9 != null && str9.contains("_FRIENDS_COUNT_")) {
                str9 = str9.replace("_FRIENDS_COUNT_", java.lang.String.valueOf(arrayList3.size()));
            }
            com.tencent.mars.xlog.Log.i("AdLandingSocialCardComponent", "desc after=" + str9);
            g4Var2.C.setText(str9);
            a84.z.h(g0Var.backgroundImgWithFriends, g4Var2.f162834w);
            java.lang.String str10 = g0Var.adAvatarImg;
            java.lang.String str11 = "access$200";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            g4Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addFriendAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            g4Var2.B.removeAllViews();
            android.content.Context context2 = g4Var2.f165049d;
            int b37 = i65.a.b(context2, 32);
            int b38 = i65.a.b(context2, 8);
            android.view.ViewOutlineProvider viewOutlineProvider = g4Var2.F;
            if (arrayList3 != null && arrayList3.size() > 0) {
                java.util.Iterator it = arrayList3.iterator();
                int i29 = 0;
                while (it.hasNext()) {
                    java.lang.String str12 = (java.lang.String) it.next();
                    java.util.Iterator it6 = it;
                    android.widget.ImageView imageView2 = new android.widget.ImageView(context2);
                    str2 = str6;
                    imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                    imageView2.setOutlineProvider(viewOutlineProvider);
                    imageView2.setClipToOutline(true);
                    android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(b37, b37);
                    if (i29 != 0) {
                        layoutParams4.leftMargin = b38;
                    }
                    str3 = str11;
                    g4Var2.B.addView(imageView2, layoutParams4);
                    g4Var2.P(str12, imageView2);
                    int i37 = i29 + 1;
                    if (i37 >= 4) {
                        com.tencent.mars.xlog.Log.i("AdLandingSocialCardComponent", "break, total=" + arrayList3.size());
                        break;
                    } else {
                        i29 = i37;
                        it = it6;
                        str6 = str2;
                        str11 = str3;
                    }
                }
            }
            str2 = str6;
            str3 = str11;
            if (android.text.TextUtils.isEmpty(str10)) {
                i17 = 0;
            } else {
                android.widget.ImageView imageView3 = new android.widget.ImageView(context2);
                imageView3.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                imageView3.setImageBitmap(g4Var2.E);
                imageView3.setOutlineProvider(viewOutlineProvider);
                imageView3.setClipToOutline(true);
                android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(b37, b37);
                layoutParams5.leftMargin = b38;
                g4Var2.B.addView(imageView3, layoutParams5);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCicleImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
                i17 = 0;
                a84.z.i(str10, imageView3, 1.0f, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCicleImageByCdn", "com.tencent.mm.plugin.sns.ad.utils.AdImageLoader");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addFriendAvatar", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            g4Var2.A.setVisibility(8);
            g4Var2.B.setVisibility(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            android.os.Handler handler = g4Var2.I;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
            handler.sendEmptyMessageDelayed(1, 2500L);
            str4 = str2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str4);
    }
}
