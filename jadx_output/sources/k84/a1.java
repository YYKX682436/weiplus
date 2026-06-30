package k84;

/* loaded from: classes4.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f304929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304930e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f304931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f304932g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304933h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304934i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f304935m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304936n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304937o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.List f304938p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ mb4.p f304939q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(java.util.List list, android.content.Context context, int i17, java.util.List list2, java.util.List list3, k84.q1 q1Var, java.util.List list4, java.util.List list5, java.util.List list6, mb4.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f304930e = list;
        this.f304931f = context;
        this.f304932g = i17;
        this.f304933h = list2;
        this.f304934i = list3;
        this.f304935m = q1Var;
        this.f304936n = list4;
        this.f304937o = list5;
        this.f304938p = list6;
        this.f304939q = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startFirstLikeBannerAnim$1");
        k84.a1 a1Var = new k84.a1(this.f304930e, this.f304931f, this.f304932g, this.f304933h, this.f304934i, this.f304935m, this.f304936n, this.f304937o, this.f304938p, this.f304939q, continuation);
        a1Var.f304929d = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startFirstLikeBannerAnim$1");
        return a1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startFirstLikeBannerAnim$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startFirstLikeBannerAnim$1");
        k84.a1 a1Var = (k84.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a1Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startFirstLikeBannerAnim$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startFirstLikeBannerAnim$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.Iterator it;
        java.lang.String str;
        k84.q1 q1Var;
        k84.a1 a1Var = this;
        java.lang.String str2 = "invokeSuspend";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startFirstLikeBannerAnim$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) a1Var.f304929d;
        java.util.Iterator it6 = a1Var.f304930e.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            android.widget.ImageView imageView = new android.widget.ImageView(a1Var.f304931f);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setRotation(15.0f);
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            double d17 = a1Var.f304932g;
            k84.l lVar = k84.q1.Y;
            float b17 = (float) (d17 + lVar.b() + ((java.lang.Number) a1Var.f304933h.get(intValue)).doubleValue());
            imageView.setTranslationX(b17);
            double doubleValue = ((java.lang.Number) a1Var.f304934i.get(intValue)).doubleValue() + (b17 * lVar.c());
            imageView.setTranslationY((float) doubleValue);
            k84.q1 q1Var2 = a1Var.f304935m;
            com.tencent.mars.xlog.Log.i(q1Var2.j(), "triggerNumAnim add view " + imageView.getTranslationX() + ' ' + imageView.getTranslationY());
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView K = q1Var2.K();
            if (K != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBarW", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBarW$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBarW$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
                int i17 = k84.q1.Z;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBarW", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBarH", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
                it = it6;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBarH$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBarH$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
                int i18 = k84.q1.f305186a0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBarH", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
                K.addView(imageView, i17, i18);
            } else {
                it = it6;
            }
            int intValue2 = ((java.lang.Number) a1Var.f304936n.get(intValue)).intValue();
            if (((java.util.LinkedHashMap) k84.q1.y(q1Var2)).get(new java.lang.Integer(intValue2)) != null) {
                imageView.setImageBitmap((android.graphics.Bitmap) ((java.util.LinkedHashMap) k84.q1.y(q1Var2)).get(new java.lang.Integer(intValue2)));
                str = str2;
                q1Var = q1Var2;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getExceptionHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
                kotlinx.coroutines.r0 r0Var = q1Var2.f305199t;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getExceptionHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                str = str2;
                q1Var = q1Var2;
                kotlinx.coroutines.l.d(y0Var, r0Var.plus(((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h), null, new k84.x0(a1Var.f304939q, intValue2, a1Var.f304935m, imageView, null), 2, null);
            }
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setStartDelay(((java.lang.Number) a1Var.f304937o.get(intValue)).longValue());
            ofFloat.setDuration(((java.lang.Number) a1Var.f304938p.get(intValue)).longValue());
            ofFloat.addUpdateListener(new k84.y0(a1Var.f304938p, intValue, imageView, a1Var.f304932g, a1Var.f304933h, b17, doubleValue));
            ofFloat.addListener(new k84.z0(q1Var, imageView));
            k84.q1.B(q1Var, k84.q1.A(q1Var) + 1);
            ofFloat.start();
            a1Var = this;
            it6 = it;
            str2 = str;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$startFirstLikeBannerAnim$1");
        return f0Var;
    }
}
