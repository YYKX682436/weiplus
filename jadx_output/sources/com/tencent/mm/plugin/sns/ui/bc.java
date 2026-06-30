package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class bc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f167907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.cc f167908e;

    public bc(com.tencent.mm.plugin.sns.ui.cc ccVar, android.graphics.Bitmap bitmap) {
        this.f167908e = ccVar;
        this.f167907d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        int i17;
        java.lang.String str2;
        androidx.recyclerview.widget.RecyclerView recyclerView;
        int i18;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI;
        java.lang.String str6;
        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI2;
        java.lang.String str7;
        java.lang.String str8;
        boolean z17;
        android.graphics.Bitmap b07;
        java.lang.String str9 = "run";
        java.lang.String str10 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1$1";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1$1");
        android.graphics.Bitmap bitmap = this.f167907d;
        if (bitmap == null) {
            try {
                if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.V6(this.f167908e.f168119f.f169738d)) {
                    b07 = com.tencent.mm.sdk.platformtools.x.b0(this.f167908e.f168118e.getChildAt(0));
                    com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.W6(this.f167908e.f168119f.f169738d).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                } else {
                    b07 = com.tencent.mm.sdk.platformtools.x.b0(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.U6(this.f167908e.f168119f.f169738d));
                    com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.W6(this.f167908e.f168119f.f169738d).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                }
                bitmap = b07;
            } catch (java.lang.Throwable th6) {
                bitmap = null;
                com.tencent.mars.xlog.Log.e(this.f167908e.f168119f.f169738d.f166700d, "getBitmapFromView exp=" + th6.toString());
            }
        }
        if (bitmap != null) {
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(this.f167908e.f168119f.f169738d).setAlpha(1.0f);
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.W6(this.f167908e.f168119f.f169738d).setImageBitmap(bitmap);
            com.tencent.mm.plugin.sns.ui.cc ccVar = this.f167908e;
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI3 = ccVar.f168119f.f169738d;
            androidx.recyclerview.widget.RecyclerView recyclerView2 = ccVar.f168118e;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            snsAdNativeLandingPagesUI3.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (snsAdNativeLandingPagesUI3.W1) {
                com.tencent.mars.xlog.Log.i(snsAdNativeLandingPagesUI3.f166700d, "is playing animation");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryPlayEnterAnimation", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                str = "run";
                str2 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1$1";
                str6 = "access$1500";
                str4 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
            } else {
                snsAdNativeLandingPagesUI3.W1 = true;
                if (snsAdNativeLandingPagesUI3.getF65848t()) {
                    snsAdNativeLandingPagesUI3.getSwipeBackLayout().setEnableGesture(false);
                    snsAdNativeLandingPagesUI3.getSwipeBackLayout().d(true);
                }
                com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i0 i0Var = snsAdNativeLandingPagesUI3.f166746t2;
                str = "run";
                if (i0Var != null) {
                    str2 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1$1";
                    android.widget.FrameLayout frameLayout = snsAdNativeLandingPagesUI3.L1;
                    str3 = "access$1500";
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkStartSimpleTwistAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                    recyclerView = recyclerView2;
                    i17 = height;
                    if (i0Var.f163105e) {
                        int width2 = frameLayout.getWidth();
                        int height2 = frameLayout.getHeight();
                        i18 = width;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSimpleTwistAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        snsAdNativeLandingPagesUI2 = snsAdNativeLandingPagesUI3;
                        android.view.View view = i0Var.f163118r;
                        str8 = "tryPlayEnterAnimation";
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (!i0Var.B) {
                            android.view.View view2 = i0Var.f163119s;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            arrayList2.add(0);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        android.view.View view3 = i0Var.f163118r;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(java.lang.Float.valueOf(0.0f));
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        android.view.View view4 = i0Var.f163117q;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(java.lang.Float.valueOf(0.0f));
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view4.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        android.view.View view5 = i0Var.f163119s;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(java.lang.Float.valueOf(0.0f));
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view5.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI4 = i0Var.f163101a;
                        int intExtra = snsAdNativeLandingPagesUI4.getIntent().getIntExtra("img_gallery_top", 0);
                        if (com.tencent.mm.ui.bk.u(snsAdNativeLandingPagesUI4, false)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCanvasFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            boolean z18 = snsAdNativeLandingPagesUI4.U2;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCanvasFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
                            if (!z18) {
                                int p17 = com.tencent.mm.ui.bk.p(snsAdNativeLandingPagesUI4);
                                intExtra -= p17;
                                str7 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
                                com.tencent.mars.xlog.Log.i("AdLandingPageEggCardHelper", "hasCutOut, h=" + p17 + ", thumbTop=" + intExtra);
                                int intExtra2 = snsAdNativeLandingPagesUI4.getIntent().getIntExtra("img_gallery_left", 0);
                                int intExtra3 = snsAdNativeLandingPagesUI4.getIntent().getIntExtra("img_gallery_width", 0);
                                int intExtra4 = snsAdNativeLandingPagesUI4.getIntent().getIntExtra("img_gallery_height", 0);
                                android.os.Bundle bundle = new android.os.Bundle();
                                bundle.putInt("param_thumb_left", intExtra2);
                                bundle.putInt("param_thumb_top", intExtra);
                                bundle.putInt("param_thumb_width", intExtra3);
                                bundle.putInt("param_thumb_height", intExtra4);
                                bundle.putInt("param_target_width", width2);
                                bundle.putInt("param_target_height", height2);
                                vb4.n nVar = new vb4.n(snsAdNativeLandingPagesUI4, i0Var.f163116p, bundle, i0Var.f163122v.f402823b.f402786a);
                                nVar.c(new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i(i0Var));
                                android.view.View view6 = i0Var.f163116p;
                                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                arrayList6.add(0);
                                java.util.Collections.reverse(arrayList6);
                                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                                yj0.a.f(view6, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                nVar.d(0L);
                                com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().playTimelineClickAnimation(0L);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSimpleTwistAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStartSimpleTwistAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                                z17 = true;
                            }
                        }
                        str7 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
                        int intExtra22 = snsAdNativeLandingPagesUI4.getIntent().getIntExtra("img_gallery_left", 0);
                        int intExtra32 = snsAdNativeLandingPagesUI4.getIntent().getIntExtra("img_gallery_width", 0);
                        int intExtra42 = snsAdNativeLandingPagesUI4.getIntent().getIntExtra("img_gallery_height", 0);
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putInt("param_thumb_left", intExtra22);
                        bundle2.putInt("param_thumb_top", intExtra);
                        bundle2.putInt("param_thumb_width", intExtra32);
                        bundle2.putInt("param_thumb_height", intExtra42);
                        bundle2.putInt("param_target_width", width2);
                        bundle2.putInt("param_target_height", height2);
                        vb4.n nVar2 = new vb4.n(snsAdNativeLandingPagesUI4, i0Var.f163116p, bundle2, i0Var.f163122v.f402823b.f402786a);
                        nVar2.c(new com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.i(i0Var));
                        android.view.View view62 = i0Var.f163116p;
                        java.util.ArrayList arrayList62 = new java.util.ArrayList();
                        arrayList62.add(0);
                        java.util.Collections.reverse(arrayList62);
                        yj0.a.d(view62, arrayList62.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view62.setVisibility(((java.lang.Integer) arrayList62.get(0)).intValue());
                        yj0.a.f(view62, "com/tencent/mm/plugin/sns/ad/landingpage/helper/anim/AdLandingPageEggCardHelper", "doSimpleTwistAnim", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        nVar2.d(0L);
                        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().playTimelineClickAnimation(0L);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSimpleTwistAnim", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStartSimpleTwistAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        z17 = true;
                    } else {
                        snsAdNativeLandingPagesUI2 = snsAdNativeLandingPagesUI3;
                        i18 = width;
                        str7 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
                        str8 = "tryPlayEnterAnimation";
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkStartSimpleTwistAnimation", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.AdLandingPageEggCardHelper");
                        z17 = false;
                    }
                    if (z17) {
                        str4 = str7;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str8, str4);
                        str6 = str3;
                    } else {
                        str4 = str7;
                        str5 = str8;
                        snsAdNativeLandingPagesUI = snsAdNativeLandingPagesUI2;
                    }
                } else {
                    i17 = height;
                    str2 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI$3$1$1";
                    recyclerView = recyclerView2;
                    i18 = width;
                    str3 = "access$1500";
                    str4 = "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI";
                    str5 = "tryPlayEnterAnimation";
                    snsAdNativeLandingPagesUI = snsAdNativeLandingPagesUI3;
                }
                if (snsAdNativeLandingPagesUI.U1 == null) {
                    snsAdNativeLandingPagesUI.U1 = new vb4.f(snsAdNativeLandingPagesUI, snsAdNativeLandingPagesUI.f166728n, snsAdNativeLandingPagesUI.f166751w);
                    com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().playTimelineClickAnimation(0L);
                    android.os.Bundle bundle3 = new android.os.Bundle();
                    bundle3.putInt("param_thumb_left", snsAdNativeLandingPagesUI.f166739q);
                    bundle3.putInt("param_thumb_top", snsAdNativeLandingPagesUI.f166734p);
                    bundle3.putInt("param_thumb_width", snsAdNativeLandingPagesUI.f166741r);
                    bundle3.putInt("param_thumb_height", snsAdNativeLandingPagesUI.f166743s);
                    bundle3.putInt("param_target_width", i18);
                    bundle3.putInt("param_target_height", i17);
                    snsAdNativeLandingPagesUI.U1.a(bundle3);
                    snsAdNativeLandingPagesUI.U1.c(new com.tencent.mm.plugin.sns.ui.sb(snsAdNativeLandingPagesUI, recyclerView));
                    snsAdNativeLandingPagesUI.U1.d(0L);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str5, str4);
                str6 = str3;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str6, str4);
            str9 = str;
            str10 = str2;
        } else {
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.b7(this.f167908e.f168119f.f169738d).setAlpha(1.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str9, str10);
    }
}
