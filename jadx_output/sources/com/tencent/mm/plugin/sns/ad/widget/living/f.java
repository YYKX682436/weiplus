package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f163705d;

    /* renamed from: e, reason: collision with root package name */
    public int f163706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f163707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f163708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f163709h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r45.jj4 jj4Var, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f163707f = jj4Var;
        this.f163708g = i17;
        this.f163709h = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        com.tencent.mm.plugin.sns.ad.widget.living.f fVar = new com.tencent.mm.plugin.sns.ad.widget.living.f(this.f163707f, this.f163708g, this.f163709h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ad.widget.living.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object j17;
        com.tencent.mm.graphics.MMBitmapFactory$Options mMBitmapFactory$Options;
        int i17;
        int i18;
        android.graphics.Bitmap createBitmap;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        pz5.a aVar = pz5.a.f359186d;
        int i19 = this.f163706e;
        if (i19 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.graphics.MMBitmapFactory$Options mMBitmapFactory$Options2 = new com.tencent.mm.graphics.MMBitmapFactory$Options();
            ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options2).inJustDecodeBounds = false;
            ((android.graphics.BitmapFactory.Options) mMBitmapFactory$Options2).inSampleSize = 2;
            java.lang.String Thumb = this.f163707f.f377860i;
            kotlin.jvm.internal.o.f(Thumb, "Thumb");
            this.f163705d = mMBitmapFactory$Options2;
            this.f163706e = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImgWithPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            za4.s0.f471189a.a(Thumb, new za4.r0(rVar));
            j17 = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImgWithPath", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            if (j17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
                return aVar;
            }
            mMBitmapFactory$Options = mMBitmapFactory$Options2;
        } else {
            if (i19 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
                throw illegalStateException;
            }
            mMBitmapFactory$Options = (com.tencent.mm.graphics.MMBitmapFactory$Options) this.f163705d;
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
        }
        android.graphics.Bitmap d17 = com.tencent.mm.graphics.e.d((java.lang.String) j17, mMBitmapFactory$Options);
        android.graphics.Bitmap bitmap = null;
        if (d17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
            return null;
        }
        if (d17.getHeight() <= 0 || (i17 = this.f163708g) <= 0 || (i18 = this.f163709h) <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AdLivingStreamContainer", "download error or height is <= 0, return null");
        } else {
            float f17 = i17 / i18;
            if (((float) ((d17.getWidth() + 0.0d) / d17.getHeight())) > f17) {
                int width = (int) ((d17.getWidth() - (d17.getHeight() * f17)) / 2);
                int height = d17.getHeight();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf((int) (d17.getHeight() * f17)));
                arrayList.add(0);
                arrayList.add(java.lang.Integer.valueOf(width));
                arrayList.add(d17);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/living/AdLivingStreamContainer$createBlurBitmap$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/sns/ad/widget/living/AdLivingStreamContainer$createBlurBitmap$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            } else {
                int height2 = (int) ((d17.getHeight() - (d17.getWidth() / f17)) / 2);
                int width2 = d17.getWidth();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf((int) (d17.getWidth() / f17)));
                arrayList2.add(java.lang.Integer.valueOf(width2));
                arrayList2.add(java.lang.Integer.valueOf(height2));
                arrayList2.add(0);
                arrayList2.add(d17);
                java.lang.Object obj3 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/living/AdLivingStreamContainer$createBlurBitmap$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList2.get(0), ((java.lang.Integer) arrayList2.get(1)).intValue(), ((java.lang.Integer) arrayList2.get(2)).intValue(), ((java.lang.Integer) arrayList2.get(3)).intValue(), ((java.lang.Integer) arrayList2.get(4)).intValue());
                yj0.a.e(obj3, createBitmap, "com/tencent/mm/plugin/sns/ad/widget/living/AdLivingStreamContainer$createBlurBitmap$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            }
            kotlin.jvm.internal.o.d(createBitmap);
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamContainer", "return fastblur bitmap");
            bitmap = com.tencent.mm.sdk.platformtools.x.X(createBitmap, 54);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$createBlurBitmap$2");
        return bitmap;
    }
}
