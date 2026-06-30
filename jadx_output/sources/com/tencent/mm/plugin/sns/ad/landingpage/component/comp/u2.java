package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f162954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f54.b0 f162955e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 f162956f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(f54.b0 b0Var, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f162955e = b0Var;
        this.f162956f = j3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u2 u2Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u2(this.f162955e, this.f162956f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        return u2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ad.landingpage.component.comp.u2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object j17;
        java.lang.Object g17;
        android.graphics.Bitmap bitmap;
        com.tencent.mm.ui.widget.RoundCornerRelativeLayout X;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f162954d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3 j3Var = this.f162956f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String coverUrl = this.f162955e.coverUrl;
            kotlin.jvm.internal.o.f(coverUrl, "coverUrl");
            this.f162954d = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            za4.q0 q0Var = new za4.q0(rVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            za4.t0.b("adId", coverUrl, false, 0, 0, q0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImgForAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            j17 = rVar.j();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadImg", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesDownloadResourceHelper2");
            if (j17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
                    throw illegalStateException;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                g17 = obj;
                bitmap = (android.graphics.Bitmap) g17;
                if (bitmap != null && (X = j3Var.X()) != null) {
                    X.setBackground(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.P(j3Var).getResources(), bitmap));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
        }
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) j17;
        if (bitmap2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
            return f0Var;
        }
        if (bitmap2.getHeight() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
            return f0Var;
        }
        j3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        j3Var.f162867w.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoverImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoverImageView", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent");
        j3Var.f162867w.setImageDrawable(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.P(j3Var).getResources(), bitmap2));
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t2 t2Var = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.t2(j3Var, bitmap2, null);
        this.f162954d = 2;
        g17 = kotlinx.coroutines.l.g(p0Var, t2Var, this);
        if (g17 == aVar) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
            return aVar;
        }
        bitmap = (android.graphics.Bitmap) g17;
        if (bitmap != null) {
            X.setBackground(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.j3.P(j3Var).getResources(), bitmap));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$initBlurBG$1");
        return f0Var;
    }
}
