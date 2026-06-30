package k84;

/* loaded from: classes4.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f305140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f305141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f305142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f305143g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305144h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f305145i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ mb4.p f305146m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(android.content.Context context, int i17, kotlin.jvm.internal.f0 f0Var, k84.q1 q1Var, int i18, mb4.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305141e = context;
        this.f305142f = i17;
        this.f305143g = f0Var;
        this.f305144h = q1Var;
        this.f305145i = i18;
        this.f305146m = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        k84.n1 n1Var = new k84.n1(this.f305141e, this.f305142f, this.f305143g, this.f305144h, this.f305145i, this.f305146m, continuation);
        n1Var.f305140d = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        return n1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        k84.n1 n1Var = (k84.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n1Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f305140d;
        android.widget.ImageView imageView = new android.widget.ImageView(this.f305141e);
        imageView.setPivotX(0.0f);
        imageView.setPivotY(0.0f);
        imageView.setRotation(15.0f);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        int i17 = this.f305142f;
        imageView.setTranslationX((float) (i17 + k84.q1.Y.b()));
        kotlin.jvm.internal.f0 f0Var = this.f305143g;
        imageView.setTranslationY(f0Var.f310116d);
        k84.q1 q1Var = this.f305144h;
        com.tencent.mars.xlog.Log.i(q1Var.j(), "triggerNumAnim add view " + imageView.getTranslationX() + ' ' + imageView.getTranslationY());
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView K = q1Var.K();
        if (K != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBarW", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBarW$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBarW$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            int i18 = k84.q1.Z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBarW", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBarH", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBarH$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBarH$cp", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent");
            int i19 = k84.q1.f305186a0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBarH", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$Companion");
            K.addView(imageView, i18, i19);
        }
        java.util.Map y17 = k84.q1.y(q1Var);
        int i27 = this.f305145i;
        if (((java.util.LinkedHashMap) y17).get(new java.lang.Integer(i27)) != null) {
            imageView.setImageBitmap((android.graphics.Bitmap) ((java.util.LinkedHashMap) k84.q1.y(q1Var)).get(new java.lang.Integer(i27)));
        } else {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(y0Var, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new k84.k1(this.f305146m, this.f305145i, this.f305144h, imageView, null), 2, null);
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(2000L);
        ofFloat.addUpdateListener(new k84.l1(imageView, i17, f0Var));
        ofFloat.addListener(new k84.m1(q1Var, imageView));
        k84.q1.B(q1Var, k84.q1.A(q1Var) + 1);
        ofFloat.start();
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1");
        return f0Var2;
    }
}
