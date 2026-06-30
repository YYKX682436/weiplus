package k84;

/* loaded from: classes4.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f305158g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(java.lang.String str, k84.q1 q1Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305156e = str;
        this.f305157f = q1Var;
        this.f305158g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerDownloadBitmap$1$1");
        k84.o1 o1Var = new k84.o1(this.f305156e, this.f305157f, this.f305158g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerDownloadBitmap$1$1");
        return o1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerDownloadBitmap$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerDownloadBitmap$1$1");
        java.lang.Object invokeSuspend = ((k84.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerDownloadBitmap$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerDownloadBitmap$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerDownloadBitmap$1$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f305155d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            n74.r rVar = n74.r.f335421a;
            this.f305155d = 1;
            obj = rVar.a(this.f305156e, 20000L, this);
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerDownloadBitmap$1$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerDownloadBitmap$1$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        k84.q1 q1Var = this.f305157f;
        java.util.Map y17 = k84.q1.y(q1Var);
        int i18 = this.f305158g;
        y17.put(new java.lang.Integer(i18), bitmap);
        com.tencent.mars.xlog.Log.i(q1Var.j(), "banner bitmap " + i18 + " downloaded! " + bitmap);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerDownloadBitmap$1$1");
        return f0Var;
    }
}
