package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes3.dex */
public final class t2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 f162948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f162949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var, android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f162948d = j3Var;
        this.f162949e = bitmap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t2 t2Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t2(this.f162948d, this.f162949e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
        return t2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap createBitmap;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var = this.f162948d;
        j3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayType", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayType", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        double d17 = j3Var.f162865u == 0 ? 2.725d : 0.7348314606741573d;
        android.graphics.Bitmap bitmap = this.f162949e;
        if ((bitmap.getWidth() + 0.0d) / bitmap.getHeight() > d17) {
            int width = (int) ((bitmap.getWidth() - (bitmap.getHeight() * d17)) / 2);
            int height = bitmap.getHeight();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf((int) (bitmap.getHeight() * d17)));
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(width));
            arrayList.add(bitmap);
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingMusicComponent$initBlurBG$1$blurBitmap$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingMusicComponent$initBlurBG$1$blurBitmap$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        } else {
            int height2 = (int) ((bitmap.getHeight() - (bitmap.getWidth() / d17)) / 2);
            int width2 = bitmap.getWidth();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf((int) (bitmap.getWidth() / d17)));
            arrayList2.add(java.lang.Integer.valueOf(width2));
            arrayList2.add(java.lang.Integer.valueOf(height2));
            arrayList2.add(0);
            arrayList2.add(bitmap);
            java.lang.Object obj3 = new java.lang.Object();
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(obj3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingMusicComponent$initBlurBG$1$blurBitmap$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), ((java.lang.Integer) arrayList2.get(3)).intValue(), ((java.lang.Integer) arrayList2.get(4)).intValue());
            yj0.a.e(obj3, createBitmap, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingMusicComponent$initBlurBG$1$blurBitmap$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
        }
        kotlin.jvm.internal.o.d(createBitmap);
        try {
            android.graphics.Bitmap X = com.tencent.mm.sdk.platformtools.x.X(createBitmap, 50);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
            return X;
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1$blurBitmap$1");
            return null;
        }
    }
}
