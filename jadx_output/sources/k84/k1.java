package k84;

/* loaded from: classes4.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f305090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mb4.p f305091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f305092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f305093g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f305094h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(mb4.p pVar, int i17, k84.q1 q1Var, android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f305091e = pVar;
        this.f305092f = i17;
        this.f305093g = q1Var;
        this.f305094h = imageView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$1");
        k84.k1 k1Var = new k84.k1(this.f305091e, this.f305092f, this.f305093g, this.f305094h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$1");
        return k1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$1");
        java.lang.Object invokeSuspend = ((k84.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.util.List a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f305090d;
        int i18 = this.f305092f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mb4.i a18 = this.f305091e.a();
            if (a18 == null || (a17 = a18.a()) == null || (str = (java.lang.String) a17.get(i18)) == null) {
                str = "";
            }
            n74.r rVar = n74.r.f335421a;
            this.f305090d = 1;
            obj = rVar.a(str, 20000L, this);
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        k84.q1.y(this.f305093g).put(new java.lang.Integer(i18), bitmap);
        if (bitmap != null) {
            this.f305094h.setImageBitmap(bitmap);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$triggerBarAnim$1$1");
        return f0Var;
    }
}
